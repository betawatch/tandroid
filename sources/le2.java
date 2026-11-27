// default package

import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class le2 implements ResultCallback {
    public final /* synthetic */ af2 a;
    public final /* synthetic */ oe2 b;

    public le2(oe2 oe2Var, af2 af2Var) {
        this.b = oe2Var;
        this.a = af2Var;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onComplete(Object obj) {
        af2 af2Var = this.a;
        ArrayList d = af2Var.d((af2Var.f.c ? 2 : 0) | 5);
        oe2 oe2Var = this.b;
        jn7.f(oe2Var.a).d(new ea2(this, d, (byte) 10));
        oe2Var.U1 = false;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.b.getContext(), tL_error.text, 0).show();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onError(Throwable th) {
    }
}
