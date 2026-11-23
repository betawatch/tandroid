package hi;

import android.content.DialogInterface;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class ba implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ nb b;

    public /* synthetic */ ba(nb nbVar, int i7) {
        this.a = i7;
        this.b = nbVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                nb nbVar = this.b;
                nbVar.Y0.x(3, false);
                nbVar.r0 = null;
                break;
            default:
                bb bbVar = this.b.Y0;
                if (bbVar != null) {
                    bbVar.x(4, false);
                    break;
                }
                break;
        }
    }
}
