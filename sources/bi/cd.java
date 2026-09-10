package bi;

import android.app.Activity;
import android.app.Dialog;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class cd extends org.telegram.ui.ActionBar.p2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ce b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd(ce ceVar, int i10) {
        super(null);
        this.a = i10;
        switch (i10) {
            case 1:
                this.b = ceVar;
                super(null);
                this.currentAccount = ceVar.c;
                break;
            default:
                this.b = ceVar;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final Activity getParentActivity() {
        switch (this.a) {
        }
        return this.b.b;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        switch (this.a) {
            case 0:
                return new n1(2, this.b.a);
            default:
                return new n1(3, this.b.a);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isLightStatusBar() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public boolean presentFragment(org.telegram.ui.ActionBar.p2 p2Var) {
        switch (this.a) {
            case 0:
                this.b.T();
                return false;
            default:
                return super.presentFragment(p2Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
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
