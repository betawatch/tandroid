package bi;

import org.telegram.messenger.x10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.f71;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class i5 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q6 b;

    public /* synthetic */ i5(q6 q6Var, int i7) {
        this.a = i7;
        this.b = q6Var;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                q6 q6Var = this.b;
                q6Var.f(true);
                f71 f71Var = q6Var.n;
                int i7 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                f71Var.e(i7, q6Var.e.f(i7) + 1);
                org.telegram.ui.ActionBar.h2 h2Var = q6Var.a;
                if (h2Var instanceof ProfileActivity) {
                    ((ProfileActivity) h2Var).X4(true);
                }
                q6Var.o();
                break;
            default:
                q6 q6Var2 = this.b;
                q6Var2.e.b((String) obj, new i5(q6Var2, 0));
                break;
        }
    }
}
