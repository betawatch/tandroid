package nh;

import android.app.Activity;
import android.app.Dialog;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class la extends org.telegram.ui.ActionBar.o2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la(gb gbVar, int i10) {
        super(null);
        this.a = i10;
        switch (i10) {
            case 1:
                this.b = gbVar;
                super(null);
                this.currentAccount = gbVar.c;
                break;
            default:
                this.b = gbVar;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.o2, org.telegram.ui.Components.l50
    public final Activity getParentActivity() {
        switch (this.a) {
        }
        return this.b.b;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final org.telegram.ui.ActionBar.c6 getResourceProvider() {
        switch (this.a) {
            case 0:
                return new lh.l2(7, this.b.a);
            default:
                return new lh.l2(8, this.b.a);
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
