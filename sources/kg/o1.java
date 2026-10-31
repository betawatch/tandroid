package kg;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.d20;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.om0;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.fr;
import org.telegram.ui.st0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class o1 implements gk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o1(Object obj, int i10, org.telegram.ui.ActionBar.k2 k2Var, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = k2Var;
    }

    @Override // org.telegram.ui.Components.gk0
    public final void f(int i10, View view) {
        switch (this.a) {
            case 0:
                v1 v1Var = (v1) this.d;
                if (view instanceof st0) {
                    st0 st0Var = (st0) view;
                    PremiumPreviewFragment.u0(this.b, st0Var.f.a);
                    v1Var.t(new i1(this.c, st0Var.f.a, false));
                    break;
                }
                break;
            default:
                rm0 rm0Var = (rm0) this.d;
                ArrayList arrayList = rm0Var.r;
                ag.b1 b1Var = rm0Var.d;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    if (!d20.i(this.b).q()) {
                        new i1(this.c, 24, true).show();
                        break;
                    } else {
                        long j10 = ((om0) arrayList.get(i10)).a.h;
                        if (rm0Var.f(rm0Var.h == j10 ? null : ((om0) arrayList.get(i10)).a)) {
                            int i11 = 0;
                            while (i11 < b1Var.getChildCount()) {
                                if (b1Var.getChildAt(i11) == view) {
                                    if (i11 <= 1) {
                                        b1Var.w0(-org.telegram.messenger.i0.L(i11 == 0 ? 90.0f : 50.0f), 0, null);
                                    } else if (i11 >= b1Var.getChildCount() - 2) {
                                        b1Var.w0(org.telegram.messenger.i0.L(i11 == b1Var.getChildCount() - 1 ? 80.0f : 50.0f), 0, null);
                                    }
                                }
                                i11++;
                            }
                            b1Var.M(new fr(3));
                            if (rm0Var.h != j10) {
                                rm0Var.h = j10;
                                ((qm0) view).a(true, true);
                                break;
                            } else {
                                rm0Var.h = 0L;
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
