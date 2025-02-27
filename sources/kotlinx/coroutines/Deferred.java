package kotlinx.coroutines;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public interface Deferred extends Job {
    Object await(Continuation continuation);

    Object getCompleted();

    Throwable getCompletionExceptionOrNull();
}
