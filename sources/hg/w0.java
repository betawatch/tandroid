package hg;

import android.content.DialogInterface;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                jg.s sVar = this.b.d0.r;
                if (sVar != null) {
                    sVar.setPaused(true);
                    break;
                }
                break;
            default:
                jg.s sVar2 = this.b.d0.r;
                if (sVar2 != null) {
                    sVar2.setPaused(true);
                    break;
                }
                break;
        }
    }
}
