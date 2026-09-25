package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ai0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vi0 b;

    public /* synthetic */ ai0(vi0 vi0Var, int i10) {
        this.a = i10;
        this.b = vi0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                break;
            case 1:
                vi0 vi0Var = this.b;
                vi0Var.getClass();
                vh.f.f(false);
                vh.f fVar = vi0Var.i0;
                if (fVar != null) {
                    fVar.b(vi0Var.F);
                }
                AndroidUtilities.runOnUIThread(new ai0(vi0Var, 0));
                break;
            case 2:
                vh.f.f(false);
                vi0 vi0Var2 = this.b;
                vh.f fVar2 = vi0Var2.i0;
                if (fVar2 != null) {
                    fVar2.b(vi0Var2.F);
                }
                AndroidUtilities.runOnUIThread(new ai0(vi0Var2, 3));
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
