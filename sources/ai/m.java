package ai;

import android.view.ViewGroup;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.f61;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class m extends kb1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ ViewGroup d;

    public /* synthetic */ m(ViewGroup viewGroup, int i10) {
        this.c = i10;
        this.d = viewGroup;
    }

    @Override // org.telegram.ui.Components.kb1
    public final void N() {
        switch (this.c) {
            case 0:
                ((x0) this.d).v = false;
                break;
            case 1:
                ((fi.n1) this.d).j3 = false;
                break;
            default:
                ((f61) this.d).x1 = false;
                break;
        }
    }

    @Override // org.telegram.ui.Components.kb1
    public void O() {
        switch (this.c) {
            case 1:
                ((fi.n1) this.d).j3 = true;
                break;
            case 2:
                ((f61) this.d).x1 = true;
                break;
        }
    }
}
