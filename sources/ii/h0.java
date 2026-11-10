package ii;

import org.telegram.ui.Components.gc;
import org.telegram.ui.cn;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ cn b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;

    public /* synthetic */ h0(int i7, cn cnVar, boolean z9) {
        this.d = i7;
        this.b = cnVar;
        this.c = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i7 = this.d;
                cn cnVar = this.b;
                if (i7 != 2) {
                    cnVar.wa();
                    cnVar.Ec();
                }
                m0.f(gc.a0(cnVar), i7, this.c);
                break;
            default:
                boolean z9 = this.c;
                this.b.fd(this.d, z9);
                break;
        }
    }

    public /* synthetic */ h0(cn cnVar, boolean z9, int i7) {
        this.b = cnVar;
        this.c = z9;
        this.d = i7;
    }
}
