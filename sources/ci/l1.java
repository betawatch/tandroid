package ci;

import android.view.ViewGroup;
import org.telegram.ui.a71;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class l1 extends w7.a6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ l1(ViewGroup viewGroup, int i10) {
        this.a = i10;
        this.b = viewGroup;
    }

    @Override // w7.a6
    public final void a() {
        switch (this.a) {
            case 0:
                ((p1) this.b).i3 = false;
                break;
            default:
                ((a71) this.b).w1 = false;
                break;
        }
    }

    @Override // w7.a6
    public final void b() {
        switch (this.a) {
            case 0:
                ((p1) this.b).i3 = true;
                break;
            default:
                ((a71) this.b).w1 = true;
                break;
        }
    }
}
