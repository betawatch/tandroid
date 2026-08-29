package jh;

import android.content.DialogInterface;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z2 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ h5 b;

    public /* synthetic */ z2(h5 h5Var, int i10) {
        this.a = i10;
        this.b = h5Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                this.b.f0.setLoading(false);
                break;
            default:
                this.b.f0.setLoading(false);
                break;
        }
    }
}
