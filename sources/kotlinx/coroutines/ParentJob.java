package kotlinx.coroutines;

import java.util.concurrent.CancellationException;

/* loaded from: classes3.dex */
public interface ParentJob extends Job {
    CancellationException getChildJobCancellationCause();
}
