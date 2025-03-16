package androidx.datastore.core;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public interface CorruptionHandler {
    Object handleCorruption(CorruptionException corruptionException, Continuation continuation);
}
