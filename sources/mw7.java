// default package

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class mw7 implements View.OnTouchListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vx7 b;

    public /* synthetic */ mw7(vx7 vx7Var, byte b) {
        this.a = b;
        this.b = vx7Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        byte b = this.a;
        byte b2 = 2;
        byte b3 = 3;
        vx7 vx7Var = this.b;
        switch (b) {
            case 0:
                if (vx7Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        qx2 qx2Var = new qx2(null, false);
                        qx2Var.r = new dx6((Object) vx7Var, (Object) view, (byte) 9);
                        vx7Var.presentFragment(qx2Var);
                    }
                    break;
                }
                break;
            case 1:
                if (vx7Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vx7Var.getParentActivity());
                        String M0 = k96.M0(2131747273, null);
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.S = M0;
                        alertDialog$Builder.e(new CharSequence[]{k96.M0(2131747315, null), k96.M0(2131747376, null)}, new r20(vx7Var, b3));
                        alertDialog$Builder.j(k96.M0(2131752577, null), null);
                        vx7Var.showDialog(hdVar);
                    }
                    break;
                }
                break;
            case 2:
                if (vx7Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        qx2 qx2Var2 = new qx2(null, false);
                        qx2Var2.r = new nw7(vx7Var, b2);
                        vx7Var.presentFragment(qx2Var2);
                    }
                    break;
                }
                break;
            default:
                if (vx7Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        qx2 qx2Var3 = new qx2(null, false);
                        qx2Var3.r = new nw7(vx7Var, b3);
                        vx7Var.presentFragment(qx2Var3);
                    }
                    break;
                }
                break;
        }
        return true;
    }
}
