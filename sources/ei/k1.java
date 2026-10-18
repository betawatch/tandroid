package ei;

import android.view.ViewGroup;
import org.telegram.ui.z51;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
                ((z51) this.b).w1 = false;
                break;
            default:
                ((zh.d0) this.b).v = false;
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
                ((z51) this.b).w1 = true;
                break;
        }
    }
}
