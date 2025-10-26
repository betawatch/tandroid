package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class SavedStateViewModelFactory extends ViewModelProvider.OnRequeryFactory implements ViewModelProvider.Factory {
    private Application application;
    private Bundle defaultArgs;
    private final ViewModelProvider.Factory factory;
    private Lifecycle lifecycle;
    private SavedStateRegistry savedStateRegistry;

    public SavedStateViewModelFactory(Application application, SavedStateRegistryOwner owner, Bundle bundle) {
        ViewModelProvider.AndroidViewModelFactory androidViewModelFactory;
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.savedStateRegistry = owner.getSavedStateRegistry();
        this.lifecycle = owner.getLifecycle();
        this.defaultArgs = bundle;
        this.application = application;
        if (application != null) {
            androidViewModelFactory = ViewModelProvider.AndroidViewModelFactory.Companion.getInstance(application);
        } else {
            androidViewModelFactory = new ViewModelProvider.AndroidViewModelFactory();
        }
        this.factory = androidViewModelFactory;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public ViewModel create(Class modelClass, CreationExtras extras) {
        List list;
        Constructor findMatchingConstructor;
        List list2;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String str = (String) extras.get(ViewModelProvider.NewInstanceFactory.VIEW_MODEL_KEY);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.get(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY) != null && extras.get(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY) != null) {
            Application application = (Application) extras.get(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY);
            boolean isAssignableFrom = AndroidViewModel.class.isAssignableFrom(modelClass);
            if (!isAssignableFrom || application == null) {
                list = SavedStateViewModelFactoryKt.VIEWMODEL_SIGNATURE;
                findMatchingConstructor = SavedStateViewModelFactoryKt.findMatchingConstructor(modelClass, list);
            } else {
                list2 = SavedStateViewModelFactoryKt.ANDROID_VIEWMODEL_SIGNATURE;
                findMatchingConstructor = SavedStateViewModelFactoryKt.findMatchingConstructor(modelClass, list2);
            }
            if (findMatchingConstructor == null) {
                return this.factory.create(modelClass, extras);
            }
            return (!isAssignableFrom || application == null) ? SavedStateViewModelFactoryKt.newInstance(modelClass, findMatchingConstructor, SavedStateHandleSupport.createSavedStateHandle(extras)) : SavedStateViewModelFactoryKt.newInstance(modelClass, findMatchingConstructor, application, SavedStateHandleSupport.createSavedStateHandle(extras));
        }
        if (this.lifecycle != null) {
            return create(str, modelClass);
        }
        throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
    }

    public final ViewModel create(String key, Class modelClass) {
        List list;
        Constructor findMatchingConstructor;
        ViewModel newInstance;
        Application application;
        List list2;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Lifecycle lifecycle = this.lifecycle;
        if (lifecycle == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = AndroidViewModel.class.isAssignableFrom(modelClass);
        if (!isAssignableFrom || this.application == null) {
            list = SavedStateViewModelFactoryKt.VIEWMODEL_SIGNATURE;
            findMatchingConstructor = SavedStateViewModelFactoryKt.findMatchingConstructor(modelClass, list);
        } else {
            list2 = SavedStateViewModelFactoryKt.ANDROID_VIEWMODEL_SIGNATURE;
            findMatchingConstructor = SavedStateViewModelFactoryKt.findMatchingConstructor(modelClass, list2);
        }
        if (findMatchingConstructor == null) {
            return this.application != null ? this.factory.create(modelClass) : ViewModelProvider.NewInstanceFactory.Companion.getInstance().create(modelClass);
        }
        SavedStateRegistry savedStateRegistry = this.savedStateRegistry;
        Intrinsics.checkNotNull(savedStateRegistry);
        SavedStateHandleController create = LegacySavedStateHandleController.create(savedStateRegistry, lifecycle, key, this.defaultArgs);
        if (!isAssignableFrom || (application = this.application) == null) {
            newInstance = SavedStateViewModelFactoryKt.newInstance(modelClass, findMatchingConstructor, create.getHandle());
        } else {
            Intrinsics.checkNotNull(application);
            newInstance = SavedStateViewModelFactoryKt.newInstance(modelClass, findMatchingConstructor, application, create.getHandle());
        }
        newInstance.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", create);
        return newInstance;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public ViewModel create(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return create(canonicalName, modelClass);
    }

    @Override // androidx.lifecycle.ViewModelProvider.OnRequeryFactory
    public void onRequery(ViewModel viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        if (this.lifecycle != null) {
            SavedStateRegistry savedStateRegistry = this.savedStateRegistry;
            Intrinsics.checkNotNull(savedStateRegistry);
            Lifecycle lifecycle = this.lifecycle;
            Intrinsics.checkNotNull(lifecycle);
            LegacySavedStateHandleController.attachHandleIfNeeded(viewModel, savedStateRegistry, lifecycle);
        }
    }
}
