package db;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class u extends a8.q {
    public final /* synthetic */ TaskCompletionSource b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(TaskCompletionSource taskCompletionSource) {
        super(4);
        this.b = taskCompletionSource;
        attachInterface(this, "com.google.firebase.pnv.internal.IFpnvCallbacks");
    }
}
