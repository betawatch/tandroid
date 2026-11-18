package ci;

import android.view.ViewGroup;
import c8.oa;
import hi.o1;
import org.telegram.ui.r11;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                ((r11) this.b).y1 = false;
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
                ((r11) this.b).y1 = true;
                break;
        }
    }
}
