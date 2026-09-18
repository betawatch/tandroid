package ci;

import android.content.DialogInterface;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class za implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ oc b;

    public /* synthetic */ za(oc ocVar, int i10) {
        this.a = i10;
        this.b = ocVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                oc ocVar = this.b;
                ocVar.X0.x(3, false);
                ocVar.q0 = null;
                break;
            default:
                cc ccVar = this.b.X0;
                if (ccVar != null) {
                    ccVar.x(4, false);
                    break;
                }
                break;
        }
    }
}
