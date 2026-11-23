package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class wl0 implements qj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.g2 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wl0(Object obj, int i7, org.telegram.ui.ActionBar.g2 g2Var, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = i7;
        this.c = g2Var;
    }

    @Override // org.telegram.ui.Components.qj0
    public final void c(int i7, View view) {
        switch (this.a) {
            case 0:
                em0 em0Var = (em0) this.d;
                ArrayList arrayList = em0Var.r;
                di.b1 b1Var = em0Var.d;
                if (i7 >= 0 && i7 < arrayList.size()) {
                    if (!org.telegram.messenger.k10.i(this.b).q()) {
                        new ug.y0(this.c, 24, true).show();
                        break;
                    } else {
                        long j3 = ((bm0) arrayList.get(i7)).a.h;
                        if (em0Var.f(em0Var.h == j3 ? null : ((bm0) arrayList.get(i7)).a)) {
                            int i10 = 0;
                            while (i10 < b1Var.getChildCount()) {
                                if (b1Var.getChildAt(i10) == view) {
                                    if (i10 <= 1) {
                                        b1Var.w0(-org.telegram.messenger.g0.L(i10 == 0 ? 90.0f : 50.0f), 0, null);
                                    } else if (i10 >= b1Var.getChildCount() - 2) {
                                        b1Var.w0(org.telegram.messenger.g0.L(i10 == b1Var.getChildCount() - 1 ? 80.0f : 50.0f), 0, null);
                                    }
                                }
                                i10++;
                            }
                            b1Var.M(new org.telegram.ui.hq(3));
                            if (em0Var.h != j3) {
                                em0Var.h = j3;
                                ((dm0) view).a(true, true);
                                break;
                            } else {
                                em0Var.h = 0L;
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                ug.h1 h1Var = (ug.h1) this.d;
                if (view instanceof org.telegram.ui.js0) {
                    org.telegram.ui.js0 js0Var = (org.telegram.ui.js0) view;
                    PremiumPreviewFragment.v0(this.b, js0Var.f.a);
                    h1Var.t(new ug.y0(this.c, js0Var.f.a, false));
                    break;
                }
                break;
        }
    }
}
