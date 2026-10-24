package ei;

import android.view.ViewGroup;
import org.telegram.ui.b61;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class k1 extends w7.a6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ k1(ViewGroup viewGroup, int i10) {
        this.a = i10;
        this.b = viewGroup;
    }

    @Override // w7.a6
    public final void a() {
        switch (this.a) {
            case 0:
                ((o1) this.b).c3 = false;
                break;
            case 1:
                ((b61) this.b).x1 = false;
                break;
            default:
                ((zh.k0) this.b).v = false;
                break;
        }
    }

    @Override // w7.a6
    public void b() {
        switch (this.a) {
            case 0:
                ((o1) this.b).c3 = true;
                break;
            case 1:
                ((b61) this.b).x1 = true;
                break;
        }
    }
}
