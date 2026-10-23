package ei;

import android.view.ViewGroup;
import org.telegram.ui.x51;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
            case 1:
                ((x51) this.b).w1 = false;
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
                ((o1) this.b).Z2 = true;
                break;
            case 1:
                ((x51) this.b).w1 = true;
                break;
        }
    }
}
