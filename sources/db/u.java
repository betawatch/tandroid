package db;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
