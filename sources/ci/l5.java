package ci;

import android.content.DialogInterface;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l5 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q6 b;

    public /* synthetic */ l5(q6 q6Var, int i10) {
        this.a = i10;
        this.b = q6Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                this.b.z0(false);
                break;
            default:
                this.b.z0(false);
                break;
        }
    }
}
