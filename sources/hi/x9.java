package hi;

import android.app.Activity;
import android.app.Dialog;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class x9 extends org.telegram.ui.ActionBar.h2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ta b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9(ta taVar, int i7) {
        super(null);
        this.a = i7;
        switch (i7) {
            case 1:
                this.b = taVar;
                super(null);
                this.currentAccount = taVar.c;
                break;
            default:
                this.b = taVar;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final Activity getParentActivity() {
        switch (this.a) {
        }
        return this.b.b;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final org.telegram.ui.ActionBar.i6 getResourceProvider() {
        switch (this.a) {
            case 0:
                return new fi.g2(7, this.b.a);
            default:
                return new fi.g2(8, this.b.a);
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean isLightStatusBar() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public boolean presentFragment(org.telegram.ui.ActionBar.h2 h2Var) {
        switch (this.a) {
            case 0:
                this.b.S();
                return false;
            default:
                return super.presentFragment(h2Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
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
