package kh;

import android.view.ViewGroup;
import org.telegram.ui.b61;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class m1 extends g7.f6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ m1(ViewGroup viewGroup, int i9) {
        this.a = i9;
        this.b = viewGroup;
    }

    @Override // g7.f6
    public final void a() {
        switch (this.a) {
            case 0:
                ((q1) this.b).X2 = false;
                break;
            default:
                ((b61) this.b).s1 = false;
                break;
        }
    }

    @Override // g7.f6
    public final void b() {
        switch (this.a) {
            case 0:
                ((q1) this.b).X2 = true;
                break;
            default:
                ((b61) this.b).s1 = true;
                break;
        }
    }
}
