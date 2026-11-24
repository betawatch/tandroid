// default package

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class i82 implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i82(Object obj, byte b) {
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
                ((p82) obj).e0();
                break;
            case 1:
                j67 j67Var = (j67) obj;
                if (!j67Var.t0 && (view2 instanceof EditText)) {
                    gm.t1(j67Var.S);
                    gm.d3(new v57(j67Var, (EditText) view2, z ? (byte) 1 : (byte) 0), 200L);
                    break;
                }
                break;
            case 2:
                ((jf9) obj).B0();
                break;
            case 3:
                ch9 ch9Var = (ch9) obj;
                if (view2 != null && ch9Var.F(view2) != null) {
                    z = true;
                }
                ch9Var.i3 = z;
                if (view2 instanceof ne9) {
                    ch9Var.T3 = (ne9) view2;
                    break;
                }
                break;
            default:
                kk9 kk9Var = (kk9) obj;
                kk9Var.z();
                mk9 mk9Var = kk9Var.w;
                if (mk9Var != null) {
                    mk9Var.invalidate();
                    break;
                }
                break;
        }
    }
}
