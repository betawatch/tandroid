package di;

import android.content.DialogInterface;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
