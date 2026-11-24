// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class m7c implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s7c b;

    public /* synthetic */ m7c(s7c s7cVar, byte b) {
        this.a = b;
        this.b = s7cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        s7c s7cVar = this.b;
        switch (b) {
            case 0:
                s7cVar.c1(true);
                break;
            case 1:
                s7cVar.Y1.setVisibility(8);
                break;
            case 2:
                s7cVar.Y0();
                s7cVar.g1(true, false);
                break;
            case 3:
                dg7 dg7Var = s7cVar.U1;
                dg7Var.b.r(k96.M0(2131745644, null), true);
                break;
            case 4:
                dg7 dg7Var2 = s7cVar.U1;
                dg7Var2.b.r(k96.M0(2131749478, null), true);
                break;
            case 5:
                s7cVar.Y0();
                s7cVar.g1(true, false);
                break;
            case 6:
                ArrayList arrayList = s7cVar.d2;
                if (arrayList.isEmpty()) {
                    arrayList.addAll(hq6.d0(s7cVar.a).j1);
                    s7cVar.f1(true, true);
                    break;
                }
                break;
            case 7:
                s7cVar.Y1.setVisibility(8);
                break;
            case 8:
                s7cVar.Y0();
                s7cVar.g1(true, false);
                break;
            case 9:
                s7cVar.f1(true, true);
                break;
            case 10:
                s7cVar.dismiss();
                break;
            default:
                s7cVar.Y0();
                s7cVar.g1(true, false);
                break;
        }
    }
}
