package di;

import android.app.Activity;
import android.app.Dialog;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class ob extends org.telegram.ui.ActionBar.m2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob(kc kcVar, int i10) {
        super(null);
        this.a = i10;
        switch (i10) {
            case 1:
                this.b = kcVar;
                super(null);
                this.currentAccount = kcVar.c;
                break;
            default:
                this.b = kcVar;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final Activity getParentActivity() {
        switch (this.a) {
        }
        return this.b.b;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final org.telegram.ui.ActionBar.c6 getResourceProvider() {
        switch (this.a) {
            case 0:
                return new bi.n3(7, this.b.a);
            default:
                return new bi.n3(8, this.b.a);
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean isLightStatusBar() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public boolean presentFragment(org.telegram.ui.ActionBar.m2 m2Var) {
        switch (this.a) {
            case 0:
                this.b.S();
                return false;
            default:
                return super.presentFragment(m2Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
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
