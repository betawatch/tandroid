package ai;

import android.view.ViewGroup;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.c61;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class m extends gb1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ ViewGroup d;

    public /* synthetic */ m(ViewGroup viewGroup, int i10) {
        this.c = i10;
        this.d = viewGroup;
    }

    @Override // org.telegram.ui.Components.gb1
    public final void N() {
        switch (this.c) {
            case 0:
                ((x0) this.d).v = false;
                break;
            case 1:
                ((fi.n1) this.d).j3 = false;
                break;
            default:
                ((c61) this.d).x1 = false;
                break;
        }
    }

    @Override // org.telegram.ui.Components.gb1
    public void O() {
        switch (this.c) {
            case 1:
                ((fi.n1) this.d).j3 = true;
                break;
            case 2:
                ((c61) this.d).x1 = true;
                break;
        }
    }
}
