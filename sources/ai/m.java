package ai;

import android.view.ViewGroup;
import c8.ja;
import org.telegram.ui.s11;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                ((s11) this.b).x1 = false;
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
                ((s11) this.b).x1 = true;
                break;
        }
    }
}
