package i7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.g5;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class a extends com.google.android.gms.common.api.internal.i {
    public final /* synthetic */ TaskCompletionSource b;

    public a(TaskCompletionSource taskCompletionSource) {
        this.b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.j
    public final void H(Status status) {
        g5.a(status, null, this.b);
    }
}
