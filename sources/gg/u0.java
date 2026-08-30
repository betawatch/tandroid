package gg;

import android.content.DialogInterface;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b1 b;

    public /* synthetic */ u0(b1 b1Var, int i10) {
        this.a = i10;
        this.b = b1Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ig.s sVar = this.b.d0.r;
                if (sVar != null) {
                    sVar.setPaused(false);
                    break;
                }
                break;
            default:
                ig.s sVar2 = this.b.d0.r;
                if (sVar2 != null) {
                    sVar2.setPaused(false);
                    break;
                }
                break;
        }
    }
}
