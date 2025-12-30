package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.selects.SelectClause1;

/* loaded from: classes3.dex */
public interface Deferred extends Job {
    Object await(Continuation continuation);

    Object getCompleted();

    Throwable getCompletionExceptionOrNull();

    SelectClause1 getOnAwait();
}
