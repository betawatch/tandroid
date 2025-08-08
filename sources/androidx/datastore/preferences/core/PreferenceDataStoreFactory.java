package androidx.datastore.preferences.core;

import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import java.io.File;
import java.util.List;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class PreferenceDataStoreFactory {
    public static final PreferenceDataStoreFactory INSTANCE = new PreferenceDataStoreFactory();

    private PreferenceDataStoreFactory() {
    }

    public final DataStore create(ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List migrations, CoroutineScope scope, final Function0 produceFile) {
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return new PreferenceDataStore(DataStoreFactory.INSTANCE.create(PreferencesSerializer.INSTANCE, replaceFileCorruptionHandler, migrations, scope, new Function0() { // from class: androidx.datastore.preferences.core.PreferenceDataStoreFactory$create$delegate$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final File invoke() {
                File file = (File) Function0.this.invoke();
                String extension = FilesKt.getExtension(file);
                PreferencesSerializer preferencesSerializer = PreferencesSerializer.INSTANCE;
                if (Intrinsics.areEqual(extension, preferencesSerializer.getFileExtension())) {
                    return file;
                }
                throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: " + preferencesSerializer.getFileExtension()).toString());
            }
        }));
    }
}
