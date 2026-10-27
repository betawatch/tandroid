package fi;

import android.app.Activity;
import android.app.Dialog;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class wa extends org.telegram.ui.ActionBar.r2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa(sb sbVar, int i10) {
        super(null);
        this.a = i10;
        switch (i10) {
            case 1:
                this.b = sbVar;
                super(null);
                this.currentAccount = sbVar.c;
                break;
            default:
                this.b = sbVar;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final Activity getParentActivity() {
        switch (this.a) {
        }
        return this.b.b;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.ActionBar.u6 getResourceProvider() {
        switch (this.a) {
            case 0:
                return new di.s2(7, this.b.a);
            default:
                return new di.s2(8, this.b.a);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isLightStatusBar() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public boolean presentFragment(org.telegram.ui.ActionBar.r2 r2Var) {
        switch (this.a) {
            case 0:
                this.b.S();
                return false;
            default:
                return super.presentFragment(r2Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
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
