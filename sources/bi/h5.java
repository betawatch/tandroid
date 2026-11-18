package bi;

import org.telegram.messenger.x10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.f71;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class h5 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p6 b;

    public /* synthetic */ h5(p6 p6Var, int i7) {
        this.a = i7;
        this.b = p6Var;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                p6 p6Var = this.b;
                p6Var.f(true);
                f71 f71Var = p6Var.n;
                int i7 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                f71Var.e(i7, p6Var.e.f(i7) + 1);
                org.telegram.ui.ActionBar.h2 h2Var = p6Var.a;
                if (h2Var instanceof ProfileActivity) {
                    ((ProfileActivity) h2Var).X4(true);
                }
                p6Var.o();
                break;
            default:
                p6 p6Var2 = this.b;
                p6Var2.e.b((String) obj, new h5(p6Var2, 0));
                break;
        }
    }
}
