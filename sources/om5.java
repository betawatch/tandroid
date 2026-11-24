// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class om5 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ om5(int i, String str, boolean z) {
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
                nm7.f(i).k(nm7.V1, str, Boolean.valueOf(z));
                break;
            default:
                txc txcVar = (txc) wxc.a.get(str);
                if (txcVar != null && txcVar.v != null) {
                    if (!wxc.g.contains(txcVar)) {
                        txcVar.M = i;
                        txcVar.N = z;
                        ArrayList arrayList = wxc.f;
                        arrayList.remove(txcVar);
                        arrayList.add(txcVar);
                        wxc.o();
                        break;
                    } else {
                        txcVar.M = i;
                        txcVar.v.m(i);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ om5(String str, int i, boolean z) {
        this.b = str;
        this.c = i;
        this.d = z;
    }
}
