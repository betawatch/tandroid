// default package

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class jre extends u3d {
    public final /* synthetic */ byte b;
    public final /* synthetic */ TaskCompletionSource c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jre(TaskCompletionSource taskCompletionSource, byte b) {
        super((byte) 13);
        this.b = b;
        this.c = taskCompletionSource;
    }

    @Override // u3d
    public final void P(Status status, qp5 qp5Var) {
        switch (this.b) {
            case 0:
                break;
            default:
                status.getClass();
                vze.a(status, qp5Var, this.c);
                break;
        }
    }

    @Override // u3d
    public final void f(Status status, n54 n54Var) {
        switch (this.b) {
            case 0:
                status.getClass();
                vze.a(status, n54Var, this.c);
                break;
        }
    }

    private final void T(Status status, n54 n54Var) {
    }

    private final void U(Status status, qp5 qp5Var) {
    }
}
