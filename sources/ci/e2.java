package ci;

import org.telegram.messenger.u10;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e2 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u10 b;

    public /* synthetic */ e2(u10 u10Var, int i3) {
        this.a = i3;
        this.b = u10Var;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                this.b.a((TL_stars.StarGift) obj);
                break;
            default:
                Boolean bool = (Boolean) obj;
                u10 u10Var = this.b;
                if (u10Var != null) {
                    u10Var.a(bool);
                    break;
                }
                break;
        }
    }
}
