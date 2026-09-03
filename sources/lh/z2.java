package lh;

import android.content.DialogInterface;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z2 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g5 b;

    public /* synthetic */ z2(g5 g5Var, int i10) {
        this.a = i10;
        this.b = g5Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                this.b.g0.setLoading(false);
                break;
            default:
                this.b.g0.setLoading(false);
                break;
        }
    }
}
