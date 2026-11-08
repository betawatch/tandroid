package bi;

import org.telegram.messenger.c20;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n2 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c20 b;

    public /* synthetic */ n2(c20 c20Var, int i7) {
        this.a = i7;
        this.b = c20Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                this.b.a((TL_stars.StarGift) obj);
                break;
            default:
                Boolean bool = (Boolean) obj;
                c20 c20Var = this.b;
                if (c20Var != null) {
                    c20Var.a(bool);
                    break;
                }
                break;
        }
    }
}
