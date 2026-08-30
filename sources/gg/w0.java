package gg;

import android.content.DialogInterface;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w0 implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b1 b;

    public /* synthetic */ w0(b1 b1Var, int i10) {
        this.a = i10;
        this.b = b1Var;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ig.s sVar = this.b.d0.r;
                if (sVar != null) {
                    sVar.setPaused(true);
                    break;
                }
                break;
            default:
                ig.s sVar2 = this.b.d0.r;
                if (sVar2 != null) {
                    sVar2.setPaused(true);
                    break;
                }
                break;
        }
    }
}
