package hi;

import android.app.Activity;
import android.app.Dialog;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class ra extends org.telegram.ui.ActionBar.g2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ra(nb nbVar, int i7) {
        super(null);
        this.a = i7;
        switch (i7) {
            case 1:
                this.b = nbVar;
                super(null);
                this.currentAccount = nbVar.c;
                break;
            default:
                this.b = nbVar;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final Activity getParentActivity() {
        switch (this.a) {
        }
        return this.b.b;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final org.telegram.ui.ActionBar.i6 getResourceProvider() {
        switch (this.a) {
            case 0:
                return new fi.g2(7, this.b.a);
            default:
                return new fi.g2(8, this.b.a);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isLightStatusBar() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public boolean presentFragment(org.telegram.ui.ActionBar.g2 g2Var) {
        switch (this.a) {
            case 0:
                this.b.S();
                return false;
            default:
                return super.presentFragment(g2Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
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
