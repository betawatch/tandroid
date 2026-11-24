// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ok5 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ ok5(int i, String str, boolean z) {
        this.c = i;
        this.b = str;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.d;
        int i = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                kk7.f(i).k(kk7.U1, str, Boolean.valueOf(z));
                break;
            default:
                svc svcVar = (svc) vvc.a.get(str);
                if (svcVar != null && svcVar.t != null) {
                    if (!vvc.g.contains(svcVar)) {
                        svcVar.K = i;
                        svcVar.L = z;
                        ArrayList arrayList = vvc.f;
                        arrayList.remove(svcVar);
                        arrayList.add(svcVar);
                        vvc.o();
                        break;
                    } else {
                        svcVar.K = i;
                        svcVar.t.l(i);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ ok5(String str, int i, boolean z) {
        this.b = str;
        this.c = i;
        this.d = z;
    }
}
