package bi;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class c2 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j3 b;

    public /* synthetic */ c2(j3 j3Var, int i7) {
        this.a = i7;
        this.b = j3Var;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                this.b.v2.setTitleMinSideInset(org.telegram.messenger.g0.L(6.0f) + ((Integer) obj).intValue());
                break;
            default:
                List list = (List) obj;
                j3 j3Var = this.b;
                if (j3Var.getContext() != null && !j3Var.J) {
                    ArrayList b10 = wg.s.b(1, list);
                    j3Var.V1 = b10;
                    List c10 = wg.s.c(b10);
                    j3Var.V1 = c10;
                    if (!((ArrayList) c10).isEmpty()) {
                        j3Var.h1();
                        z41 z41Var = j3Var.U1;
                        if (z41Var != null) {
                            z41Var.O(true);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
