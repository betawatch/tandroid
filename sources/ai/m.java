package ai;

import android.view.ViewGroup;
import c8.ja;
import org.telegram.ui.q11;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
