package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class jn0 implements jl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jn0(Object obj, int i10, org.telegram.ui.ActionBar.p2 p2Var, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = p2Var;
    }

    @Override // org.telegram.ui.Components.jl0
    public final void d(int i10, View view) {
        switch (this.a) {
            case 0:
                rn0 rn0Var = (rn0) this.d;
                ArrayList arrayList = rn0Var.r;
                bi.y1 y1Var = rn0Var.d;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    if (!UserConfig.getInstance(this.b).isPremium()) {
                        new qg.a1(this.c, 24, true).show();
                        break;
                    } else {
                        long j3 = ((on0) arrayList.get(i10)).a.h;
                        if (rn0Var.f(rn0Var.h == j3 ? null : ((on0) arrayList.get(i10)).a)) {
                            int i11 = 0;
                            while (i11 < y1Var.getChildCount()) {
                                if (y1Var.getChildAt(i11) == view) {
                                    if (i11 <= 1) {
                                        y1Var.v0(-AndroidUtilities.dp(i11 == 0 ? 90.0f : 50.0f), 0, null);
                                    } else if (i11 >= y1Var.getChildCount() - 2) {
                                        y1Var.v0(AndroidUtilities.dp(i11 == y1Var.getChildCount() - 1 ? 80.0f : 50.0f), 0, null);
                                    }
                                }
                                i11++;
                            }
                            y1Var.M(new org.telegram.ui.mr(3));
                            if (rn0Var.h != j3) {
                                rn0Var.h = j3;
                                ((qn0) view).a(true, true);
                                break;
                            } else {
                                rn0Var.h = 0L;
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                qg.m1 m1Var = (qg.m1) this.d;
                if (view instanceof org.telegram.ui.ww0) {
                    org.telegram.ui.ww0 ww0Var = (org.telegram.ui.ww0) view;
                    PremiumPreviewFragment.q0(this.b, ww0Var.f.a);
                    m1Var.showDialog(new qg.a1(this.c, ww0Var.f.a, false));
                    break;
                }
                break;
        }
    }
}
