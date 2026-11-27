// default package

import android.view.KeyEvent;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class jw7 implements l8, lcc {
    public final /* synthetic */ dx7 a;

    public /* synthetic */ jw7(dx7 dx7Var) {
        this.a = dx7Var;
    }

    @Override // lcc
    public final void h(Object obj, TLRPC.Document document, Boolean bool) {
        dx7 dx7Var = this.a;
        dx7Var.Z1 = true;
        ww7 k0 = dx7Var.k0(obj, document);
        if (bool.booleanValue()) {
            k0.setScale(1.5f);
        }
        dx7Var.a0(k0);
    }

    @Override // l8
    public final void o(KeyEvent keyEvent) {
        dx7 dx7Var;
        n8 n8Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n8Var = (dx7Var = this.a).r1) != null && n8Var.isShowing()) {
            dx7Var.r1.d(true);
        }
    }
}
