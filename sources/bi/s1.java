package bi;

import android.view.ViewGroup;
import org.telegram.ui.l71;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class s1 extends w7.b6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ s1(ViewGroup viewGroup, int i10) {
        this.a = i10;
        this.b = viewGroup;
    }

    @Override // w7.b6
    public final void a() {
        switch (this.a) {
            case 0:
                ((w1) this.b).b3 = false;
                break;
            default:
                ((l71) this.b).w1 = false;
                break;
        }
    }

    @Override // w7.b6
    public final void b() {
        switch (this.a) {
            case 0:
                ((w1) this.b).b3 = true;
                break;
            default:
                ((l71) this.b).w1 = true;
                break;
        }
    }
}
