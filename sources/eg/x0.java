package eg;

import android.content.DialogInterface;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x0 implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;

    public /* synthetic */ x0(c1 c1Var, int i10) {
        this.a = i10;
        this.b = c1Var;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                gg.s sVar = this.b.c0.r;
                if (sVar != null) {
                    sVar.setPaused(true);
                    break;
                }
                break;
            default:
                gg.s sVar2 = this.b.c0.r;
                if (sVar2 != null) {
                    sVar2.setPaused(true);
                    break;
                }
                break;
        }
    }
}
