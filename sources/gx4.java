// default package

import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class gx4 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e b;

    public /* synthetic */ gx4(e eVar, byte b) {
        this.a = b;
        this.b = eVar;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        e eVar = this.b;
        switch (b) {
            case 0:
                bg0 bg0Var = new bg0();
                bg0Var.a = true;
                eVar.showAsSheet((e) obj, bg0Var);
                break;
            default:
                Long l = (Long) obj;
                if (!eVar.isFinished) {
                    if (l != null && l.longValue() != Long.MAX_VALUE) {
                        eVar.presentFragment(ProfileActivity.Q2(l.longValue()), true);
                        break;
                    } else {
                        hl.c3(new pg6((byte) 17));
                        break;
                    }
                }
                break;
        }
    }
}
