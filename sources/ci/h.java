package ci;

import android.view.ViewGroup;
import c8.oa;
import hi.o1;
import org.telegram.ui.s11;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class h extends oa {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ h(ViewGroup viewGroup, int i7) {
        this.a = i7;
        this.b = viewGroup;
    }

    @Override // c8.oa
    public final void a() {
        switch (this.a) {
            case 0:
                ((h0) this.b).w = false;
                break;
            case 1:
                ((o1) this.b).j3 = false;
                break;
            default:
                ((s11) this.b).y1 = false;
                break;
        }
    }

    @Override // c8.oa
    public void b() {
        switch (this.a) {
            case 1:
                ((o1) this.b).j3 = true;
                break;
            case 2:
                ((s11) this.b).y1 = true;
                break;
        }
    }
}
