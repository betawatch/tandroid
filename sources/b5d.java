// default package

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class b5d extends b3d {
    public final /* synthetic */ byte c;
    public final /* synthetic */ TaskCompletionSource d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b5d(ua4 ua4Var, TaskCompletionSource taskCompletionSource, byte b) {
        super((byte) 0);
        this.c = b;
        this.d = taskCompletionSource;
    }

    @Override // b3d
    public final void T(Status status, og7 og7Var) {
        switch (this.c) {
            case 0:
                fxe.b(status, og7Var, this.d);
                break;
            default:
                super.T(status, og7Var);
                break;
        }
    }

    @Override // b3d
    public final void V(Status status, qg7 qg7Var) {
        switch (this.c) {
            case 1:
                fxe.b(status, qg7Var, this.d);
                break;
            default:
                super.V(status, qg7Var);
                break;
        }
    }
}
