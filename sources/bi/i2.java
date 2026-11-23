package bi;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.w10;
import org.telegram.ui.Components.b51;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class i2 implements w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p3 b;

    public /* synthetic */ i2(p3 p3Var, int i7) {
        this.a = i7;
        this.b = p3Var;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                this.b.v2.setTitleMinSideInset(org.telegram.messenger.g0.L(6.0f) + ((Integer) obj).intValue());
                break;
            default:
                List list = (List) obj;
                p3 p3Var = this.b;
                if (p3Var.getContext() != null && !p3Var.J) {
                    ArrayList b10 = wg.r.b(1, list);
                    p3Var.V1 = b10;
                    List c10 = wg.r.c(b10);
                    p3Var.V1 = c10;
                    if (!((ArrayList) c10).isEmpty()) {
                        p3Var.h1();
                        b51 b51Var = p3Var.U1;
                        if (b51Var != null) {
                            b51Var.O(true);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
