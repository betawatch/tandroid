package di;

import android.view.ViewGroup;
import org.telegram.ui.r71;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class k1 extends w7.b6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ k1(ViewGroup viewGroup, int i10) {
        this.a = i10;
        this.b = viewGroup;
    }

    @Override // w7.b6
    public final void a() {
        switch (this.a) {
            case 0:
                ((o1) this.b).Z2 = false;
                break;
            default:
                ((r71) this.b).w1 = false;
                break;
        }
    }

    @Override // w7.b6
    public final void b() {
        switch (this.a) {
            case 0:
                ((o1) this.b).Z2 = true;
                break;
            default:
                ((r71) this.b).w1 = true;
                break;
        }
    }
}
