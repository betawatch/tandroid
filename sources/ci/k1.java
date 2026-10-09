package ci;

import android.view.ViewGroup;
import org.telegram.ui.k71;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class k1 extends w7.y5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ k1(ViewGroup viewGroup, int i10) {
        this.a = i10;
        this.b = viewGroup;
    }

    @Override // w7.y5
    public final void a() {
        switch (this.a) {
            case 0:
                ((o1) this.b).Z2 = false;
                break;
            default:
                ((k71) this.b).w1 = false;
                break;
        }
    }

    @Override // w7.y5
    public final void b() {
        switch (this.a) {
            case 0:
                ((o1) this.b).Z2 = true;
                break;
            default:
                ((k71) this.b).w1 = true;
                break;
        }
    }
}
