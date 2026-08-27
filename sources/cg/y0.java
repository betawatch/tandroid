package cg;

import android.content.DialogInterface;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d1 b;

    public /* synthetic */ y0(d1 d1Var, int i10) {
        this.a = i10;
        this.b = d1Var;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                eg.t tVar = this.b.c0.r;
                if (tVar != null) {
                    tVar.setPaused(true);
                    break;
                }
                break;
            default:
                eg.t tVar2 = this.b.c0.r;
                if (tVar2 != null) {
                    tVar2.setPaused(true);
                    break;
                }
                break;
        }
    }
}
