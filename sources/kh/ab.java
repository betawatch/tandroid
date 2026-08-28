package kh;

import android.app.Activity;
import android.app.Dialog;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class ab extends org.telegram.ui.ActionBar.o2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(wb wbVar, int i9) {
        super(null);
        this.a = i9;
        switch (i9) {
            case 1:
                this.b = wbVar;
                super(null);
                this.currentAccount = wbVar.c;
                break;
            default:
                this.b = wbVar;
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
    public final org.telegram.ui.ActionBar.b6 getResourceProvider() {
        switch (this.a) {
            case 0:
                return new ih.n2(7, this.b.a);
            default:
                return new ih.n2(8, this.b.a);
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
                this.b.T();
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
