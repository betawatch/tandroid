package hi;

import android.content.DialogInterface;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g9 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sa b;

    public /* synthetic */ g9(sa saVar, int i7) {
        this.a = i7;
        this.b = saVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                sa saVar = this.b;
                saVar.Y0.x(3, false);
                saVar.r0 = null;
                break;
            default:
                ga gaVar = this.b.Y0;
                if (gaVar != null) {
                    gaVar.x(4, false);
                    break;
                }
                break;
        }
    }
}
