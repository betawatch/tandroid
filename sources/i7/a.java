package i7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.h5;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class a extends com.google.android.gms.common.api.internal.i {
    public final /* synthetic */ TaskCompletionSource b;

    public a(TaskCompletionSource taskCompletionSource) {
        this.b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.j
    public final void H(Status status) {
        h5.a(status, null, this.b);
    }
}
