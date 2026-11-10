package ai;

import android.view.ViewGroup;
import c8.ja;
import org.telegram.ui.t11;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                ((t11) this.b).x1 = false;
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
                ((t11) this.b).x1 = true;
                break;
        }
    }
}
