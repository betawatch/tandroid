package ci;

import android.content.DialogInterface;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final /* synthetic */ class va implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ kc b;

    public /* synthetic */ va(kc kcVar, int i10) {
        this.a = i10;
        this.b = kcVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                kc kcVar = this.b;
                kcVar.X0.x(3, false);
                kcVar.q0 = null;
                break;
            default:
                yb ybVar = this.b.X0;
                if (ybVar != null) {
                    ybVar.x(4, false);
                    break;
                }
                break;
        }
    }
}
