package bi;

import org.telegram.messenger.y10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.i71;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k5 implements y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s6 b;

    public /* synthetic */ k5(s6 s6Var, int i7) {
        this.a = i7;
        this.b = s6Var;
    }

    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                s6 s6Var = this.b;
                s6Var.f(true);
                i71 i71Var = s6Var.n;
                int i7 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                i71Var.e(i7, s6Var.e.f(i7) + 1);
                org.telegram.ui.ActionBar.g2 g2Var = s6Var.a;
                if (g2Var instanceof ProfileActivity) {
                    ((ProfileActivity) g2Var).X4(true);
                }
                s6Var.o();
                break;
            default:
                s6 s6Var2 = this.b;
                s6Var2.e.b((String) obj, new k5(s6Var2, 0));
                break;
        }
    }
}
