package ci;

import android.view.ViewGroup;
import org.telegram.ui.c71;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final class l1 extends w7.a6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ l1(ViewGroup viewGroup, int i10) {
        this.a = i10;
        this.b = viewGroup;
    }

    @Override // w7.a6
    public final void a() {
        switch (this.a) {
            case 0:
                ((p1) this.b).i3 = false;
                break;
            default:
                ((c71) this.b).w1 = false;
                break;
        }
    }

    @Override // w7.a6
    public final void b() {
        switch (this.a) {
            case 0:
                ((p1) this.b).i3 = true;
                break;
            default:
                ((c71) this.b).w1 = true;
                break;
        }
    }
}
