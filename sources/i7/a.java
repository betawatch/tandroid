package i7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.g5;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
