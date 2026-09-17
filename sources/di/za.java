package di;

import android.content.DialogInterface;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes4.dex */
public final /* synthetic */ class za implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ pc b;

    public /* synthetic */ za(pc pcVar, int i10) {
        this.a = i10;
        this.b = pcVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                pc pcVar = this.b;
                pcVar.X0.x(3, false);
                pcVar.q0 = null;
                break;
            default:
                dc dcVar = this.b.X0;
                if (dcVar != null) {
                    dcVar.x(4, false);
                    break;
                }
                break;
        }
    }
}
