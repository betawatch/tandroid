package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ll0 implements fj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ll0(Object obj, int i3, org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = i3;
        this.c = d2Var;
    }

    @Override // org.telegram.ui.Components.fj0
    public final void f(int i3, View view) {
        switch (this.a) {
            case 0:
                tl0 tl0Var = (tl0) this.d;
                ArrayList arrayList = tl0Var.r;
                ci.j1 j1Var = tl0Var.d;
                if (i3 >= 0 && i3 < arrayList.size()) {
                    if (!org.telegram.messenger.h10.i(this.b).q()) {
                        new vg.v0(this.c, 24, true).show();
                        break;
                    } else {
                        long j10 = ((ql0) arrayList.get(i3)).a.h;
                        if (tl0Var.f(tl0Var.h == j10 ? null : ((ql0) arrayList.get(i3)).a)) {
                            int i10 = 0;
                            while (i10 < j1Var.getChildCount()) {
                                if (j1Var.getChildAt(i10) == view) {
                                    if (i10 <= 1) {
                                        j1Var.w0(-org.telegram.messenger.g0.L(i10 == 0 ? 90.0f : 50.0f), 0, null);
                                    } else if (i10 >= j1Var.getChildCount() - 2) {
                                        j1Var.w0(org.telegram.messenger.g0.L(i10 == j1Var.getChildCount() - 1 ? 80.0f : 50.0f), 0, null);
                                    }
                                }
                                i10++;
                            }
                            j1Var.M(new org.telegram.ui.cq(3));
                            if (tl0Var.h != j10) {
                                tl0Var.h = j10;
                                ((sl0) view).a(true, true);
                                break;
                            } else {
                                tl0Var.h = 0L;
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                vg.h1 h1Var = (vg.h1) this.d;
                if (view instanceof org.telegram.ui.yr0) {
                    org.telegram.ui.yr0 yr0Var = (org.telegram.ui.yr0) view;
                    PremiumPreviewFragment.v0(this.b, yr0Var.f.a);
                    h1Var.t(new vg.v0(this.c, yr0Var.f.a, false));
                    break;
                }
                break;
        }
    }
}
