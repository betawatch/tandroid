package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class ml0 implements gj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e2 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ml0(Object obj, int i7, org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = i7;
        this.c = e2Var;
    }

    @Override // org.telegram.ui.Components.gj0
    public final void b(int i7, View view) {
        switch (this.a) {
            case 0:
                ul0 ul0Var = (ul0) this.d;
                ArrayList arrayList = ul0Var.r;
                di.c1 c1Var = ul0Var.d;
                if (i7 >= 0 && i7 < arrayList.size()) {
                    if (!org.telegram.messenger.m10.i(this.b).q()) {
                        new ug.x0(this.c, 24, true).show();
                        break;
                    } else {
                        long j3 = ((rl0) arrayList.get(i7)).a.h;
                        if (ul0Var.f(ul0Var.h == j3 ? null : ((rl0) arrayList.get(i7)).a)) {
                            int i10 = 0;
                            while (i10 < c1Var.getChildCount()) {
                                if (c1Var.getChildAt(i10) == view) {
                                    if (i10 <= 1) {
                                        c1Var.w0(-org.telegram.messenger.g0.L(i10 == 0 ? 90.0f : 50.0f), 0, null);
                                    } else if (i10 >= c1Var.getChildCount() - 2) {
                                        c1Var.w0(org.telegram.messenger.g0.L(i10 == c1Var.getChildCount() - 1 ? 80.0f : 50.0f), 0, null);
                                    }
                                }
                                i10++;
                            }
                            c1Var.M(new org.telegram.ui.gq(3));
                            if (ul0Var.h != j3) {
                                ul0Var.h = j3;
                                ((tl0) view).a(true, true);
                                break;
                            } else {
                                ul0Var.h = 0L;
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                ug.g1 g1Var = (ug.g1) this.d;
                if (view instanceof org.telegram.ui.fs0) {
                    org.telegram.ui.fs0 fs0Var = (org.telegram.ui.fs0) view;
                    PremiumPreviewFragment.v0(this.b, fs0Var.f.a);
                    g1Var.t(new ug.x0(this.c, fs0Var.f.a, false));
                    break;
                }
                break;
        }
    }
}
