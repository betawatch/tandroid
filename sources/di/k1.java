package di;

import android.view.ViewGroup;
import org.telegram.ui.r71;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                ((o1) this.b).Z2 = false;
                break;
            default:
                ((r71) this.b).w1 = false;
                break;
        }
    }

    @Override // w7.a6
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
