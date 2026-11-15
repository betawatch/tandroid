package hi;

import android.content.DialogInterface;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
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
