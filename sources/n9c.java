// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class n9c implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t9c b;

    public /* synthetic */ n9c(t9c t9cVar, byte b) {
        this.a = b;
        this.b = t9cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        t9c t9cVar = this.b;
        switch (b) {
            case 0:
                t9cVar.c1(true);
                break;
            case 1:
                t9cVar.Y1.setVisibility(8);
                break;
            case 2:
                t9cVar.Y0();
                t9cVar.g1(true, false);
                break;
            case 3:
                gi7 gi7Var = t9cVar.U1;
                gi7Var.b.r(jb6.M0(2131745570, null), true);
                break;
            case 4:
                gi7 gi7Var2 = t9cVar.U1;
                gi7Var2.b.r(jb6.M0(2131749427, null), true);
                break;
            case 5:
                t9cVar.Y0();
                t9cVar.g1(true, false);
                break;
            case 6:
                ArrayList arrayList = t9cVar.d2;
                if (arrayList.isEmpty()) {
                    arrayList.addAll(hs6.d0(t9cVar.a).j1);
                    t9cVar.f1(true, true);
                    break;
                }
                break;
            case 7:
                t9cVar.Y1.setVisibility(8);
                break;
            case 8:
                t9cVar.Y0();
                t9cVar.g1(true, false);
                break;
            case 9:
                t9cVar.f1(true, true);
                break;
            case 10:
                t9cVar.dismiss();
                break;
            default:
                t9cVar.Y0();
                t9cVar.g1(true, false);
                break;
        }
    }
}
