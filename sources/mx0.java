// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class mx0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ p8c b;
    public final /* synthetic */ boolean[] c;

    public /* synthetic */ mx0(p8c p8cVar, boolean[] zArr) {
        this.b = p8cVar;
        this.c = zArr;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        boolean[] zArr = this.c;
        p8c p8cVar = this.b;
        switch (b) {
            case 0:
                if (!zArr[0]) {
                    p8cVar.a(Boolean.FALSE);
                    zArr[0] = true;
                    break;
                }
                break;
            default:
                if (!zArr[0]) {
                    p8cVar.a(Boolean.FALSE);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ mx0(boolean[] zArr, p8c p8cVar) {
        this.c = zArr;
        this.b = p8cVar;
    }
}
