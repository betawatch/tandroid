package ii;

import org.telegram.ui.Components.hc;
import org.telegram.ui.an;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ an b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;

    public /* synthetic */ h0(int i7, an anVar, boolean z9) {
        this.d = i7;
        this.b = anVar;
        this.c = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i7 = this.d;
                an anVar = this.b;
                if (i7 != 2) {
                    anVar.ua();
                    anVar.Bc();
                }
                m0.f(hc.a0(anVar), i7, this.c);
                break;
            default:
                boolean z9 = this.c;
                this.b.cd(this.d, z9);
                break;
        }
    }

    public /* synthetic */ h0(an anVar, boolean z9, int i7) {
        this.b = anVar;
        this.c = z9;
        this.d = i7;
    }
}
