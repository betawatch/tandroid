// default package

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class eg6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fg6 b;

    public /* synthetic */ eg6(fg6 fg6Var, byte b) {
        this.a = b;
        this.b = fg6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        fg6 fg6Var = this.b;
        switch (b) {
            case 0:
                e29 e29Var = fg6Var.h;
                e29Var.getAnimatedDrawable().I(0, false, false);
                e29Var.d();
                EditTextBoldCursor editTextBoldCursor = fg6Var.b;
                editTextBoldCursor.requestFocus();
                hl.E3(editTextBoldCursor);
                break;
            default:
                fg6Var.b.requestFocus();
                break;
        }
    }
}
