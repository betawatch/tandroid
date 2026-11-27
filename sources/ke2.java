// default package

import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ke2 implements ResultCallback {
    public final /* synthetic */ af2 a;
    public final /* synthetic */ oe2 b;

    public ke2(oe2 oe2Var, af2 af2Var) {
        this.b = oe2Var;
        this.a = af2Var;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onComplete(Object obj) {
        ArrayList d = this.a.d(7);
        oe2 oe2Var = this.b;
        jn7.f(oe2Var.a).d(new ea2(this, d, (byte) 9));
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
