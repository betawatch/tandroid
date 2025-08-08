package androidx.datastore.preferences.core;

import androidx.datastore.core.DataStore;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public final class PreferenceDataStore implements DataStore {
    private final DataStore delegate;

    @Override // androidx.datastore.core.DataStore
    public Flow getData() {
        return this.delegate.getData();
    }

    public PreferenceDataStore(DataStore delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // androidx.datastore.core.DataStore
    public Object updateData(Function2 function2, Continuation continuation) {
        return this.delegate.updateData(new PreferenceDataStore$updateData$2(function2, null), continuation);
    }
}
