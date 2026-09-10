package bi;

import android.content.DialogInterface;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class ic implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ce b;

    public /* synthetic */ ic(ce ceVar, int i10) {
        this.a = i10;
        this.b = ceVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ce ceVar = this.b;
                ceVar.X0.x(3, false);
                ceVar.q0 = null;
                break;
            default:
                nd ndVar = this.b.X0;
                if (ndVar != null) {
                    ndVar.x(4, false);
                    break;
                }
                break;
        }
    }
}
