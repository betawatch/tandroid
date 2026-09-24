package ci;

import android.view.ViewGroup;
import org.telegram.ui.a71;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class l1 extends w7.z5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ l1(ViewGroup viewGroup, int i10) {
        this.a = i10;
        this.b = viewGroup;
    }

    @Override // w7.z5
    public final void a() {
        switch (this.a) {
            case 0:
                ((p1) this.b).b3 = false;
                break;
            default:
                ((a71) this.b).w1 = false;
                break;
        }
    }

    @Override // w7.z5
    public final void b() {
        switch (this.a) {
            case 0:
                ((p1) this.b).b3 = true;
                break;
            default:
                ((a71) this.b).w1 = true;
                break;
        }
    }
}
