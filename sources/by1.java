// default package

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class by1 implements View.OnKeyListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zv4 b;

    public /* synthetic */ by1(zv4 zv4Var, byte b) {
        this.a = b;
        this.b = zv4Var;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        byte b = this.a;
        zv4 zv4Var = this.b;
        switch (b) {
            case 0:
                if (i == 4) {
                    if (keyEvent.getAction() == 1 && !zv4Var.d()) {
                        zv4Var.c(null);
                    }
                    break;
                }
                break;
            case 1:
                if (i == 4) {
                    if (keyEvent.getAction() == 1 && !zv4Var.d()) {
                        zv4Var.c(null);
                    }
                    break;
                }
                break;
            case 2:
                if (i == 4) {
                    if (keyEvent.getAction() == 1 && !zv4Var.d()) {
                        zv4Var.c(null);
                    }
                    break;
                }
                break;
            case 3:
                if (i == 4) {
                    if (keyEvent.getAction() == 1) {
                        zv4Var.c(null);
                    }
                    break;
                }
                break;
            default:
                if (i == 4) {
                    if (keyEvent.getAction() == 1) {
                        zv4Var.c(null);
                    }
                    break;
                }
                break;
        }
        return true;
    }
}
