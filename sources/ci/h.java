package ci;

import android.view.ViewGroup;
import c8.ma;
import hi.o1;
import org.telegram.ui.n11;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class h extends ma {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ h(ViewGroup viewGroup, int i7) {
        this.a = i7;
        this.b = viewGroup;
    }

    @Override // c8.ma
    public final void a() {
        switch (this.a) {
            case 0:
                ((g0) this.b).w = false;
                break;
            case 1:
                ((o1) this.b).j3 = false;
                break;
            default:
                ((n11) this.b).y1 = false;
                break;
        }
    }

    @Override // c8.ma
    public void b() {
        switch (this.a) {
            case 1:
                ((o1) this.b).j3 = true;
                break;
            case 2:
                ((n11) this.b).y1 = true;
                break;
        }
    }
}
