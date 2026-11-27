// default package

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class o72 implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o72(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        byte b = this.a;
        boolean z = false;
        z = false;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((v72) obj).d0();
                break;
            case 1:
                q67 q67Var = (q67) obj;
                if (!q67Var.t0 && (view2 instanceof EditText)) {
                    hl.t1(q67Var.S);
                    hl.d3(new c67(q67Var, (EditText) view2, z ? (byte) 1 : (byte) 0), 200L);
                    break;
                }
                break;
            case 2:
                ((yg9) obj).B0();
                break;
            case 3:
                pi9 pi9Var = (pi9) obj;
                if (view2 != null && pi9Var.G(view2) != null) {
                    z = true;
                }
                pi9Var.i3 = z;
                if (view2 instanceof dg9) {
                    pi9Var.T3 = (dg9) view2;
                    break;
                }
                break;
            default:
                xl9 xl9Var = (xl9) obj;
                xl9Var.z();
                zl9 zl9Var = xl9Var.w;
                if (zl9Var != null) {
                    zl9Var.invalidate();
                    break;
                }
                break;
        }
    }
}
