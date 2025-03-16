package androidx.datastore.core.handlers;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.CorruptionHandler;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class NoOpCorruptionHandler implements CorruptionHandler {
    @Override // androidx.datastore.core.CorruptionHandler
    public Object handleCorruption(CorruptionException corruptionException, Continuation continuation) {
        throw corruptionException;
    }
}
