package i7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.i5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a extends com.google.android.gms.common.api.internal.i {
    public final /* synthetic */ TaskCompletionSource b;

    public a(TaskCompletionSource taskCompletionSource) {
        this.b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.j
    public final void I(Status status) {
        i5.a(status, null, this.b);
    }
}
