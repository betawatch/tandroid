package ii;

import org.telegram.ui.Components.hc;
import org.telegram.ui.an;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
