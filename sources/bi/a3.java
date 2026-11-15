package bi;

import org.telegram.messenger.z10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.v61;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class a3 implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i4 b;

    public /* synthetic */ a3(i4 i4Var, int i7) {
        this.a = i7;
        this.b = i4Var;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                i4 i4Var = this.b;
                i4Var.f(true);
                v61 v61Var = i4Var.n;
                int i7 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                v61Var.d(i7, i4Var.e.f(i7) + 1);
                org.telegram.ui.ActionBar.e2 e2Var = i4Var.a;
                if (e2Var instanceof ProfileActivity) {
                    ((ProfileActivity) e2Var).W4(true);
                }
                i4Var.o();
                break;
            default:
                i4 i4Var2 = this.b;
                i4Var2.e.b((String) obj, new a3(i4Var2, 0));
                break;
        }
    }
}
