package hi;

import android.app.Activity;
import android.app.Dialog;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class w9 extends org.telegram.ui.ActionBar.e2 {
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

    @Override // org.telegram.ui.ActionBar.e2
    public final Activity getParentActivity() {
        switch (this.a) {
        }
        return this.b.b;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final org.telegram.ui.ActionBar.e6 getResourceProvider() {
        switch (this.a) {
            case 0:
                return new fi.i2(7, this.b.a);
            default:
                return new fi.i2(8, this.b.a);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isLightStatusBar() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public boolean presentFragment(org.telegram.ui.ActionBar.e2 e2Var) {
        switch (this.a) {
            case 0:
                this.b.S();
                return false;
            default:
                return super.presentFragment(e2Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
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
