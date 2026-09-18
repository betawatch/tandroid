package ci;

import android.app.Activity;
import android.app.Dialog;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class sb extends org.telegram.ui.ActionBar.o2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb(oc ocVar, int i10) {
        super(null);
        this.a = i10;
        switch (i10) {
            case 1:
                this.b = ocVar;
                super(null);
                this.currentAccount = ocVar.c;
                break;
            default:
                this.b = ocVar;
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
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        switch (this.a) {
            case 0:
                return new ai.x3(7, this.b.a);
            default:
                return new ai.x3(8, this.b.a);
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
