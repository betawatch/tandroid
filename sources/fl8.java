// default package

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class fl8 implements r69 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ e c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fl8(Object obj, int i, e eVar, byte b) {
        this.a = b;
        this.d = obj;
        this.b = i;
        this.c = eVar;
    }

    @Override // r69
    public final void e(int i, View view) {
        byte b = this.a;
        e eVar = this.c;
        int i2 = this.b;
        Object obj = this.d;
        switch (b) {
            case 0:
                kl8 kl8Var = (kl8) obj;
                if (view instanceof yk8) {
                    yk8 yk8Var = (yk8) view;
                    PremiumPreviewFragment.u0(i2, yk8Var.f.a);
                    kl8Var.u(new xk8(eVar, (int) yk8Var.f.a, false));
                    break;
                }
                break;
            default:
                ow9 ow9Var = (ow9) obj;
                ArrayList arrayList = ow9Var.r;
                gw9 gw9Var = ow9Var.d;
                if (i >= 0 && i < arrayList.size()) {
                    if (!yac.h(i2).p()) {
                        new xk8(eVar, 24, true).show();
                        break;
                    } else {
                        long j = ((lw9) arrayList.get(i)).a.h;
                        if (ow9Var.f(ow9Var.h == j ? null : ((lw9) arrayList.get(i)).a)) {
                            int i3 = 0;
                            while (i3 < gw9Var.getChildCount()) {
                                if (gw9Var.getChildAt(i3) == view) {
                                    if (i3 <= 1) {
                                        gw9Var.y0(-hl.L(i3 == 0 ? 90.0f : 50.0f), 0, null);
                                    } else if (i3 >= gw9Var.getChildCount() - 2) {
                                        gw9Var.y0(hl.L(i3 == gw9Var.getChildCount() - 1 ? 80.0f : 50.0f), 0, null);
                                    }
                                }
                                i3++;
                            }
                            gw9Var.N(new t42((byte) 3));
                            if (ow9Var.h != j) {
                                ow9Var.h = j;
                                ((nw9) view).a(true, true);
                                break;
                            } else {
                                ow9Var.h = 0L;
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
