// default package

import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class lw7 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vx7 b;

    public /* synthetic */ lw7(vx7 vx7Var, byte b) {
        this.a = b;
        this.b = vx7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        vx7 vx7Var = this.b;
        switch (b) {
            case 0:
                vx7Var.T0 = (byte) 2;
                vx7Var.F1();
                break;
            case 1:
                vx7Var.V0();
                break;
            case 2:
                vx7Var.T0 = (byte) 3;
                vx7Var.F1();
                break;
            case 3:
                vx7Var.T0 = (byte) 1;
                vx7Var.F1();
                break;
            case 4:
                vx7Var.T0 = (byte) 4;
                vx7Var.F1();
                break;
            case 5:
                if (vx7Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                    da1 da1Var = new da1(0);
                    da1Var.N = new pj4(vx7Var, (byte) 21);
                    vx7Var.presentFragment(da1Var);
                    break;
                } else {
                    vx7Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 22);
                    break;
                }
            case 6:
                vx7Var.f = true;
                vx7Var.M.callOnClick();
                vx7Var.f = false;
                break;
            case 7:
                vx7Var.T0 = (byte) 0;
                vx7Var.F1();
                break;
            case 8:
                vx7Var.T0 = (byte) 4;
                vx7Var.F1();
                break;
            case 9:
                vx7Var.V0();
                break;
            case 10:
                vx7Var.s1();
                break;
            case 11:
                vx7Var.r1();
                break;
            case 12:
                vx7Var.E1();
                break;
            case 13:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vx7Var.getParentActivity());
                String M0 = k96.M0(2131743991, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M0;
                hdVar.U = k96.M0(2131743992, null);
                alertDialog$Builder.j(k96.M0(2131751586, null), new nw7(vx7Var, (byte) 5));
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                vx7Var.showDialog(hdVar);
                TextView textView = (TextView) hdVar.c(-1);
                if (textView != null) {
                    zkb.X(textView, bkb.p7, null);
                    break;
                }
                break;
            case 14:
                vx7Var.E1();
                break;
            case 15:
                vx7Var.u1();
                break;
            default:
                vx7Var.f = true;
                vx7Var.M.callOnClick();
                vx7Var.f = false;
                break;
        }
    }
}
