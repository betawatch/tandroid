package hi;

import android.app.Activity;
import android.app.Dialog;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class w9 extends org.telegram.ui.ActionBar.g2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w9(sa saVar, int i7) {
        super(null);
        this.a = i7;
        switch (i7) {
            case 1:
                this.b = saVar;
                super(null);
                this.currentAccount = saVar.c;
                break;
            default:
                this.b = saVar;
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
    public final org.telegram.ui.ActionBar.h6 getResourceProvider() {
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
