package bi;

import org.telegram.messenger.ij;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class aa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ca b;

    public /* synthetic */ aa(ca caVar, int i7) {
        this.a = i7;
        this.b = caVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        ca caVar = this.b;
        switch (i7) {
            case 0:
                caVar.b();
                break;
            case 1:
                caVar.a();
                break;
            default:
                org.telegram.ui.Components.bc bcVar = caVar.d;
                ea eaVar = caVar.q;
                aa aaVar = caVar.p;
                ij ijVar = caVar.b;
                if (!caVar.l) {
                    caVar.l = true;
                    ijVar.f((int) caVar.k, caVar.c(), true);
                    long j3 = eaVar.g;
                    int i10 = eaVar.a;
                    eaVar.g = j3 + caVar.k;
                    qs.f(i10).k(qs.y3, new Object[0]);
                    caVar.k = 0L;
                    qs.f(i10).k(qs.o1, Long.valueOf(ij.B0(ijVar.k)), Integer.valueOf(ijVar.e1()), ijVar.k.reactions);
                }
                if (!caVar.m) {
                    caVar.m = true;
                    caVar.f.b = 5000L;
                    org.telegram.messenger.g0.r(aaVar);
                    org.telegram.messenger.g0.i3(aaVar, 5000L);
                    bcVar.k(true);
                    bcVar.v = aaVar;
                }
                caVar.e.b.setText(caVar.d());
                break;
        }
    }
}
