package bi;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.y10;
import org.telegram.ui.Components.c51;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class g2 implements y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n3 b;

    public /* synthetic */ g2(n3 n3Var, int i7) {
        this.a = i7;
        this.b = n3Var;
    }

    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                this.b.v2.setTitleMinSideInset(org.telegram.messenger.g0.L(6.0f) + ((Integer) obj).intValue());
                break;
            default:
                List list = (List) obj;
                n3 n3Var = this.b;
                if (n3Var.getContext() != null && !n3Var.J) {
                    ArrayList b10 = wg.s.b(1, list);
                    n3Var.V1 = b10;
                    List c10 = wg.s.c(b10);
                    n3Var.V1 = c10;
                    if (!((ArrayList) c10).isEmpty()) {
                        n3Var.h1();
                        c51 c51Var = n3Var.U1;
                        if (c51Var != null) {
                            c51Var.O(true);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
