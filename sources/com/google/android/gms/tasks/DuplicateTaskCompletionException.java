package com.google.android.gms.tasks;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class DuplicateTaskCompletionException extends IllegalStateException {
    private DuplicateTaskCompletionException(String str, Throwable th2) {
        super(str, th2);
    }

    public static IllegalStateException of(Task<?> task) {
        if (!task.isComplete()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception exception = task.getException();
        return new DuplicateTaskCompletionException("Complete with: ".concat(exception != null ? "failure" : task.isSuccessful() ? "result ".concat(String.valueOf(task.getResult())) : task.isCanceled() ? "cancellation" : "unknown issue"), exception);
    }
}
