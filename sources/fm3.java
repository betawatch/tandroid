// default package

import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class fm3 implements View.OnKeyListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vt4 b;

    public /* synthetic */ fm3(vt4 vt4Var, byte b) {
        this.a = b;
        this.b = vt4Var;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        byte b = this.a;
        vt4 vt4Var = this.b;
        switch (b) {
            case 0:
                if (i == 4) {
                    if (keyEvent.getAction() == 1) {
                        LinearLayout linearLayout = vt4Var.e;
                        if (linearLayout == null || vt4Var.O) {
                            vt4Var.c(null);
                        } else {
                            vt4Var.e = null;
                            vt4Var.h(linearLayout, false);
                        }
                    }
                    break;
                }
                break;
            case 1:
                if (i == 4) {
                    if (keyEvent.getAction() == 1) {
                        vt4Var.c(null);
                    }
                    break;
                }
                break;
            case 2:
                if (i == 4) {
                    if (keyEvent.getAction() == 1) {
                        vt4Var.c(null);
                    }
                    break;
                }
                break;
            default:
                if (i == 4) {
                    if (keyEvent.getAction() == 1) {
                        vt4Var.c(null);
                    }
                    break;
                }
                break;
        }
        return true;
    }
}
