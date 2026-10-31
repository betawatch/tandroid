package com.google.android.gms.tasks;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class NativeOnCompleteListener implements OnCompleteListener<Object> {
    private final long zza;

    public NativeOnCompleteListener(long j10) {
        this.zza = j10;
    }

    public static void createAndAddCallback(Task<Object> task, long j10) {
        task.addOnCompleteListener(new NativeOnCompleteListener(j10));
    }

    public native void nativeOnComplete(long j10, Object obj, boolean z10, boolean z11, String str);

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task<Object> task) {
        Object obj;
        String str;
        Exception exception;
        if (task.isSuccessful()) {
            obj = task.getResult();
            str = null;
        } else if (task.isCanceled() || (exception = task.getException()) == null) {
            obj = null;
            str = null;
        } else {
            str = exception.getMessage();
            obj = null;
        }
        nativeOnComplete(this.zza, obj, task.isSuccessful(), task.isCanceled(), str);
    }
}
