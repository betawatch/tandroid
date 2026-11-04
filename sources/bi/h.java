package bi;

import android.view.ViewGroup;
import b8.of;
import gi.m1;
import org.telegram.ui.g11;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h extends of {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ h(ViewGroup viewGroup, int i3) {
        this.a = i3;
        this.b = viewGroup;
    }

    @Override // b8.of
    public final void a() {
        switch (this.a) {
            case 0:
                ((h0) this.b).w = false;
                break;
            case 1:
                ((m1) this.b).j3 = false;
                break;
            default:
                ((g11) this.b).y1 = false;
                break;
        }
    }

    @Override // b8.of
    public void b() {
        switch (this.a) {
            case 1:
                ((m1) this.b).j3 = true;
                break;
            case 2:
                ((g11) this.b).y1 = true;
                break;
        }
    }
}
