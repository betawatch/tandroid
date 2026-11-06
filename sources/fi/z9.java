package fi;

import android.app.Activity;
import android.app.Dialog;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class z9 extends org.telegram.ui.ActionBar.f2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ va b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9(va vaVar, int i7) {
        super(null);
        this.a = i7;
        switch (i7) {
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

    @Override // org.telegram.ui.ActionBar.f2
    public final Activity getParentActivity() {
        switch (this.a) {
        }
        return this.b.b;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        switch (this.a) {
            case 0:
                return new di.m2(7, this.b.a);
            default:
                return new di.m2(8, this.b.a);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isLightStatusBar() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public boolean presentFragment(org.telegram.ui.ActionBar.f2 f2Var) {
        switch (this.a) {
            case 0:
                this.b.S();
                return false;
            default:
                return super.presentFragment(f2Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
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
