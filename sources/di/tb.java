package di;

import android.app.Activity;
import android.app.Dialog;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class tb extends org.telegram.ui.ActionBar.n2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb(pc pcVar, int i10) {
        super(null);
        this.a = i10;
        switch (i10) {
            case 1:
                this.b = pcVar;
                super(null);
                this.currentAccount = pcVar.c;
                break;
            default:
                this.b = pcVar;
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
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        switch (this.a) {
            case 0:
                return new bi.k3(7, this.b.a);
            default:
                return new bi.k3(8, this.b.a);
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
