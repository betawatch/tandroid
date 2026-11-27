// default package

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
