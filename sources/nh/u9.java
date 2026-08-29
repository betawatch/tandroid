package nh;

import android.content.DialogInterface;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u9 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ gb b;

    public /* synthetic */ u9(gb gbVar, int i10) {
        this.a = i10;
        this.b = gbVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                gb gbVar = this.b;
                gbVar.T0.x(3, false);
                gbVar.m0 = null;
                break;
            default:
                va vaVar = this.b.T0;
                if (vaVar != null) {
                    vaVar.x(4, false);
                    break;
                }
                break;
        }
    }
}
