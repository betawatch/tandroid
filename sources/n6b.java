// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class n6b implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t7b b;

    public /* synthetic */ n6b(t7b t7bVar, byte b) {
        this.a = b;
        this.b = t7bVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        t7b t7bVar = this.b;
        switch (b) {
            case 0:
                t7bVar.Y0.x(3, false);
                t7bVar.r0 = null;
                break;
            default:
                i7b i7bVar = t7bVar.Y0;
                if (i7bVar != null) {
                    i7bVar.x(4, false);
                    break;
                }
                break;
        }
    }
}
