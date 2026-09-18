package ci;

import android.content.DialogInterface;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m5 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r6 b;

    public /* synthetic */ m5(r6 r6Var, int i10) {
        this.a = i10;
        this.b = r6Var;
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
