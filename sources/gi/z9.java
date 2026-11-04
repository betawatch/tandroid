package gi;

import android.app.Activity;
import android.app.Dialog;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class z9 extends org.telegram.ui.ActionBar.d2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ va b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9(va vaVar, int i3) {
        super(null);
        this.a = i3;
        switch (i3) {
            case 1:
                this.b = vaVar;
                super(null);
                this.currentAccount = vaVar.c;
                break;
            default:
                this.b = vaVar;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final Activity getParentActivity() {
        switch (this.a) {
        }
        return this.b.b;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.ActionBar.e6 getResourceProvider() {
        switch (this.a) {
            case 0:
                return new ei.q2(7, this.b.a);
            default:
                return new ei.q2(8, this.b.a);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isLightStatusBar() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public boolean presentFragment(org.telegram.ui.ActionBar.d2 d2Var) {
        switch (this.a) {
            case 0:
                this.b.S();
                return false;
            default:
                return super.presentFragment(d2Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
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
