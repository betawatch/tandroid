// default package

import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ff2 implements ResultCallback {
    public final /* synthetic */ uf2 a;
    public final /* synthetic */ if2 b;

    public ff2(if2 if2Var, uf2 uf2Var) {
        this.b = if2Var;
        this.a = uf2Var;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onComplete(Object obj) {
        uf2 uf2Var = this.a;
        ArrayList d = uf2Var.d((uf2Var.f.c ? 2 : 0) | 5);
        if2 if2Var = this.b;
        nm7.f(if2Var.a).d(new ra2(this, d, (byte) 12));
        if2Var.U1 = false;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.b.getContext(), tL_error.text, 0).show();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onError(Throwable th) {
    }
}
