// default package

import android.view.KeyEvent;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class b56 implements fd, l8 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i56 b;

    public /* synthetic */ b56(i56 i56Var, byte b) {
        this.a = b;
        this.b = i56Var;
    }

    @Override // l8
    public final void o(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
            i56 i56Var = this.b;
            if (i56Var.s.isShowing()) {
                i56Var.s.d(true);
            }
        }
    }

    @Override // fd
    public final void w(id idVar, int i) {
        byte b = this.a;
        i56 i56Var = this.b;
        switch (b) {
            case 0:
                h56 h56Var = i56Var.r;
                if (h56Var != null) {
                    h56Var.h();
                    break;
                }
                break;
            default:
                h56 h56Var2 = i56Var.r;
                if (h56Var2 != null) {
                    h56Var2.d();
                    break;
                }
                break;
        }
    }
}
