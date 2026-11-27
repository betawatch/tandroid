// default package

import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class jt8 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ eu8 b;

    public /* synthetic */ jt8(eu8 eu8Var, byte b) {
        this.a = b;
        this.b = eu8Var;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        eu8 eu8Var = this.b;
        switch (b) {
            case 0:
                eu8Var.f(true);
                uic uicVar = eu8Var.n;
                int i = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                uicVar.e(i, eu8Var.e.f(i) + 1);
                e eVar = eu8Var.a;
                if (eVar instanceof ProfileActivity) {
                    ((ProfileActivity) eVar).k3(true);
                }
                eu8Var.o();
                break;
            default:
                eu8Var.e.b(new jt8(eu8Var, (byte) 0), (String) obj);
                break;
        }
    }
}
