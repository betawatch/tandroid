// default package

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class a42 extends sa6 {
    public final /* synthetic */ byte E = 0;
    public final /* synthetic */ gk7 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a42(qa6 qa6Var, Context context, wjb wjbVar, boolean z) {
        super(wjbVar, context, false, z);
        this.F = qa6Var;
    }

    @Override // w39
    public final void f() {
        byte b = this.E;
        gk7 gk7Var = this.F;
        switch (b) {
            case 0:
                c42 c42Var = (c42) gk7Var;
                a42 a42Var = c42Var.O;
                r7 r7Var = c42Var.x;
                if (r7Var != null) {
                    r7Var.setShowSearchProgress(a42Var.w);
                }
                TextView textView = c42Var.w;
                if (textView != null) {
                    textView.setText(k96.a0(null, null, 2131747973, a42Var.h));
                }
                super.f();
                break;
            default:
                qa6 qa6Var = (qa6) gk7Var;
                xha xhaVar = qa6Var.r;
                if (xhaVar != null) {
                    xhaVar.setShowSearchProgress(qa6Var.T.w);
                }
                TextView textView2 = qa6Var.n;
                if (textView2 != null) {
                    textView2.setText(k96.a0(null, null, 2131747973, qa6Var.T.h));
                }
                super.f();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a42(c42 c42Var, Context context, wjb wjbVar, boolean z) {
        super(wjbVar, context, z, false);
        this.F = c42Var;
    }
}
