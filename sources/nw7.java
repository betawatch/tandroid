// default package

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.a;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class nw7 implements ed, px2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vx7 b;

    public /* synthetic */ nw7(vx7 vx7Var, byte b) {
        this.a = b;
        this.b = vx7Var;
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        vx7 vx7Var = this.b;
        switch (b) {
            case 0:
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + a.b.getPackageName()));
                    vx7Var.getParentActivity().startActivity(intent);
                    break;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            case 1:
                vx7Var.finishFragment();
                break;
            case 2:
            case 3:
            default:
                vx7Var.p1();
                break;
            case 4:
                vx7Var.q1();
                break;
        }
    }

    @Override // px2
    public final void y(mx2 mx2Var) {
        byte b = this.a;
        vx7 vx7Var = this.b;
        switch (b) {
            case 2:
                vx7Var.Z[5].setText(mx2Var.a);
                vx7Var.s = mx2Var.d;
                break;
            default:
                vx7Var.Z[0].setText(mx2Var.a);
                if (vx7Var.V0.indexOf(mx2Var.a) != -1) {
                    vx7Var.a1 = true;
                    String str = (String) vx7Var.W0.get(mx2Var.a);
                    vx7Var.Z[1].setText(str);
                    String str2 = (String) vx7Var.Y0.get(str);
                    vx7Var.Z[2].setHintText(str2 != null ? str2.replace('X', (char) 8211) : null);
                    vx7Var.a1 = false;
                }
                gl.e3(new kw7(vx7Var, (byte) 3), 300L);
                vx7Var.Z[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor = vx7Var.Z[2];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
        }
    }
}
