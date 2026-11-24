// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class csa implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i8c b;
    public final /* synthetic */ boolean[] c;

    public /* synthetic */ csa(byte b, i8c i8cVar, boolean[] zArr) {
        this.a = b;
        this.b = i8cVar;
        this.c = zArr;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        boolean[] zArr = this.c;
        i8c i8cVar = this.b;
        switch (b) {
            case 0:
                if (!zArr[0]) {
                    i8cVar.a(0L, Boolean.FALSE);
                    break;
                }
                break;
            case 1:
                if (!zArr[0]) {
                    i8cVar.a(Boolean.FALSE, null);
                    break;
                }
                break;
            default:
                if (!zArr[0]) {
                    i8cVar.a(Boolean.FALSE, null);
                    break;
                }
                break;
        }
    }
}
