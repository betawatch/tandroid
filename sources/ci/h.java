package ci;

import android.view.ViewGroup;
import c8.ra;
import hi.w1;
import org.telegram.ui.q11;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class h extends ra {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ h(ViewGroup viewGroup, int i7) {
        this.a = i7;
        this.b = viewGroup;
    }

    @Override // c8.ra
    public final void a() {
        switch (this.a) {
            case 0:
                ((h0) this.b).w = false;
                break;
            case 1:
                ((w1) this.b).j3 = false;
                break;
            default:
                ((q11) this.b).y1 = false;
                break;
        }
    }

    @Override // c8.ra
    public void b() {
        switch (this.a) {
            case 1:
                ((w1) this.b).j3 = true;
                break;
            case 2:
                ((q11) this.b).y1 = true;
                break;
        }
    }
}
