package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class sn0 implements ml0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sn0(Object obj, int i10, org.telegram.ui.ActionBar.n2 n2Var, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = n2Var;
    }

    @Override // org.telegram.ui.Components.ml0
    public final void d(int i10, View view) {
        switch (this.a) {
            case 0:
                ao0 ao0Var = (ao0) this.d;
                ArrayList arrayList = ao0Var.r;
                ai.w0 w0Var = ao0Var.d;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    if (!UserConfig.getInstance(this.b).isPremium()) {
                        new rg.y0(this.c, 24, true).show();
                        break;
                    } else {
                        long j3 = ((xn0) arrayList.get(i10)).a.h;
                        if (ao0Var.f(ao0Var.h == j3 ? null : ((xn0) arrayList.get(i10)).a)) {
                            int i11 = 0;
                            while (i11 < w0Var.getChildCount()) {
                                if (w0Var.getChildAt(i11) == view) {
                                    if (i11 <= 1) {
                                        w0Var.w0(-AndroidUtilities.dp(i11 == 0 ? 90.0f : 50.0f), 0, null);
                                    } else if (i11 >= w0Var.getChildCount() - 2) {
                                        w0Var.w0(AndroidUtilities.dp(i11 == w0Var.getChildCount() - 1 ? 80.0f : 50.0f), 0, null);
                                    }
                                }
                                i11++;
                            }
                            w0Var.M(new org.telegram.ui.hr(3));
                            if (ao0Var.h != j3) {
                                ao0Var.h = j3;
                                ((zn0) view).a(true, true);
                                break;
                            } else {
                                ao0Var.h = 0L;
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                rg.m1 m1Var = (rg.m1) this.d;
                if (view instanceof org.telegram.ui.ow0) {
                    org.telegram.ui.ow0 ow0Var = (org.telegram.ui.ow0) view;
                    PremiumPreviewFragment.q0(this.b, ow0Var.f.a);
                    m1Var.showDialog(new rg.y0(this.c, ow0Var.f.a, false));
                    break;
                }
                break;
        }
    }
}
