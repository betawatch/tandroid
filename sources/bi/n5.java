package bi;

import org.telegram.messenger.w10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.j71;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class n5 implements w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v6 b;

    public /* synthetic */ n5(v6 v6Var, int i7) {
        this.a = i7;
        this.b = v6Var;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                v6 v6Var = this.b;
                v6Var.f(true);
                j71 j71Var = v6Var.n;
                int i7 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                j71Var.e(i7, v6Var.e.f(i7) + 1);
                org.telegram.ui.ActionBar.g2 g2Var = v6Var.a;
                if (g2Var instanceof ProfileActivity) {
                    ((ProfileActivity) g2Var).X4(true);
                }
                v6Var.o();
                break;
            default:
                v6 v6Var2 = this.b;
                v6Var2.e.b((String) obj, new n5(v6Var2, 0));
                break;
        }
    }
}
