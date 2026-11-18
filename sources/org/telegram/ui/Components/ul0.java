package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ul0 implements oj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.h2 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ul0(Object obj, int i7, org.telegram.ui.ActionBar.h2 h2Var, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = i7;
        this.c = h2Var;
    }

    @Override // org.telegram.ui.Components.oj0
    public final void c(int i7, View view) {
        switch (this.a) {
            case 0:
                cm0 cm0Var = (cm0) this.d;
                ArrayList arrayList = cm0Var.r;
                di.b1 b1Var = cm0Var.d;
                if (i7 >= 0 && i7 < arrayList.size()) {
                    if (!org.telegram.messenger.j10.i(this.b).q()) {
                        new ug.z0(this.c, 24, true).show();
                        break;
                    } else {
                        long j3 = ((zl0) arrayList.get(i7)).a.h;
                        if (cm0Var.f(cm0Var.h == j3 ? null : ((zl0) arrayList.get(i7)).a)) {
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
                            if (cm0Var.h != j3) {
                                cm0Var.h = j3;
                                ((bm0) view).a(true, true);
                                break;
                            } else {
                                cm0Var.h = 0L;
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                ug.i1 i1Var = (ug.i1) this.d;
                if (view instanceof org.telegram.ui.js0) {
                    org.telegram.ui.js0 js0Var = (org.telegram.ui.js0) view;
                    PremiumPreviewFragment.v0(this.b, js0Var.f.a);
                    i1Var.t(new ug.z0(this.c, js0Var.f.a, false));
                    break;
                }
                break;
        }
    }
}
