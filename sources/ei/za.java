package ei;

import android.app.Activity;
import android.app.Dialog;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class za extends org.telegram.ui.ActionBar.o2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za(vb vbVar, int i10) {
        super(null);
        this.a = i10;
        switch (i10) {
            case 1:
                this.b = vbVar;
                super(null);
                this.currentAccount = vbVar.c;
                break;
            default:
                this.b = vbVar;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final Activity getParentActivity() {
        switch (this.a) {
        }
        return this.b.b;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final org.telegram.ui.ActionBar.g6 getResourceProvider() {
        switch (this.a) {
            case 0:
                return new ci.s2(7, this.b.a);
            default:
                return new ci.s2(8, this.b.a);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isLightStatusBar() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public boolean presentFragment(org.telegram.ui.ActionBar.o2 o2Var) {
        switch (this.a) {
            case 0:
                this.b.S();
                return false;
            default:
                return super.presentFragment(o2Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public Dialog showDialog(Dialog dialog) {
        switch (this.a) {
            case 1:
                dialog.show();
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }
}
