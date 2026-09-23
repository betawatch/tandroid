package ci;

import android.app.Activity;
import android.app.Dialog;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class pb extends org.telegram.ui.ActionBar.n2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb(lc lcVar, int i10) {
        super(null);
        this.a = i10;
        switch (i10) {
            case 1:
                this.b = lcVar;
                super(null);
                this.currentAccount = lcVar.c;
                break;
            default:
                this.b = lcVar;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final Activity getParentActivity() {
        switch (this.a) {
        }
        return this.b.b;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final org.telegram.ui.ActionBar.d6 getResourceProvider() {
        switch (this.a) {
            case 0:
                return new ai.x3(7, this.b.a);
            default:
                return new ai.x3(8, this.b.a);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public boolean presentFragment(org.telegram.ui.ActionBar.n2 n2Var) {
        switch (this.a) {
            case 0:
                this.b.T();
                return false;
            default:
                return super.presentFragment(n2Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
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
