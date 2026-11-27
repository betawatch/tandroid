// default package

import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
