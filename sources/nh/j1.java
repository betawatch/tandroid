package nh;

import android.view.ViewGroup;
import org.telegram.ui.d61;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class j1 extends i7.g6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ j1(ViewGroup viewGroup, int i10) {
        this.a = i10;
        this.b = viewGroup;
    }

    @Override // i7.g6
    public final void a() {
        switch (this.a) {
            case 0:
                ((n1) this.b).X2 = false;
                break;
            default:
                ((d61) this.b).s1 = false;
                break;
        }
    }

    @Override // i7.g6
    public final void b() {
        switch (this.a) {
            case 0:
                ((n1) this.b).X2 = true;
                break;
            default:
                ((d61) this.b).s1 = true;
                break;
        }
    }
}
