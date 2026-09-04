package di;

import android.view.ViewGroup;
import org.telegram.ui.j71;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class l1 extends w7.y5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ l1(ViewGroup viewGroup, int i10) {
        this.a = i10;
        this.b = viewGroup;
    }

    @Override // w7.y5
    public final void a() {
        switch (this.a) {
            case 0:
                ((p1) this.b).b3 = false;
                break;
            default:
                ((j71) this.b).w1 = false;
                break;
        }
    }

    @Override // w7.y5
    public final void b() {
        switch (this.a) {
            case 0:
                ((p1) this.b).b3 = true;
                break;
            default:
                ((j71) this.b).w1 = true;
                break;
        }
    }
}
