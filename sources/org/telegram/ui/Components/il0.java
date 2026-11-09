package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class il0 implements cj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ il0(Object obj, int i7, org.telegram.ui.ActionBar.f2 f2Var, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = i7;
        this.c = f2Var;
    }

    @Override // org.telegram.ui.Components.cj0
    public final void c(int i7, View view) {
        switch (this.a) {
            case 0:
                rl0 rl0Var = (rl0) this.d;
                ArrayList arrayList = rl0Var.r;
                bi.q1 q1Var = rl0Var.d;
                if (i7 >= 0 && i7 < arrayList.size()) {
                    if (!org.telegram.messenger.p10.i(this.b).q()) {
                        new ug.w0(this.c, 24, true).show();
                        break;
                    } else {
                        long j3 = ((ol0) arrayList.get(i7)).a.h;
                        if (rl0Var.f(rl0Var.h == j3 ? null : ((ol0) arrayList.get(i7)).a)) {
                            int i10 = 0;
                            while (i10 < q1Var.getChildCount()) {
                                if (q1Var.getChildAt(i10) == view) {
                                    if (i10 <= 1) {
                                        q1Var.w0(-org.telegram.messenger.g0.L(i10 == 0 ? 90.0f : 50.0f), 0, null);
                                    } else if (i10 >= q1Var.getChildCount() - 2) {
                                        q1Var.w0(org.telegram.messenger.g0.L(i10 == q1Var.getChildCount() - 1 ? 80.0f : 50.0f), 0, null);
                                    }
                                }
                                i10++;
                            }
                            q1Var.M(new org.telegram.ui.gq(3));
                            if (rl0Var.h != j3) {
                                rl0Var.h = j3;
                                ((ql0) view).a(true, true);
                                break;
                            } else {
                                rl0Var.h = 0L;
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                ug.f1 f1Var = (ug.f1) this.d;
                if (view instanceof org.telegram.ui.ks0) {
                    org.telegram.ui.ks0 ks0Var = (org.telegram.ui.ks0) view;
                    PremiumPreviewFragment.v0(this.b, ks0Var.f.a);
                    f1Var.t(new ug.w0(this.c, ks0Var.f.a, false));
                    break;
                }
                break;
        }
    }
}
