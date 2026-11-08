package ai;

import android.view.ViewGroup;
import c8.ja;
import org.telegram.ui.q11;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class m extends ja {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ m(ViewGroup viewGroup, int i7) {
        this.a = i7;
        this.b = viewGroup;
    }

    @Override // c8.ja
    public final void a() {
        switch (this.a) {
            case 0:
                ((q0) this.b).w = false;
                break;
            case 1:
                ((fi.m1) this.b).i3 = false;
                break;
            default:
                ((q11) this.b).x1 = false;
                break;
        }
    }

    @Override // c8.ja
    public void b() {
        switch (this.a) {
            case 1:
                ((fi.m1) this.b).i3 = true;
                break;
            case 2:
                ((q11) this.b).x1 = true;
                break;
        }
    }
}
