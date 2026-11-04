package ai;

import org.telegram.messenger.u10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.m61;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l3 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u4 b;

    public /* synthetic */ l3(u4 u4Var, int i3) {
        this.a = i3;
        this.b = u4Var;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                u4 u4Var = this.b;
                u4Var.f(true);
                m61 m61Var = u4Var.n;
                int i3 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                m61Var.d(i3, u4Var.e.f(i3) + 1);
                org.telegram.ui.ActionBar.d2 d2Var = u4Var.a;
                if (d2Var instanceof ProfileActivity) {
                    ((ProfileActivity) d2Var).U4(true);
                }
                u4Var.o();
                break;
            default:
                u4 u4Var2 = this.b;
                u4Var2.e.b((String) obj, new l3(u4Var2, 0));
                break;
        }
    }
}
