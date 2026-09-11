package di;

import android.content.DialogInterface;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
