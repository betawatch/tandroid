package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class xn0 implements wl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xn0(Object obj, int i10, org.telegram.ui.ActionBar.n2 n2Var, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = n2Var;
    }

    @Override // org.telegram.ui.Components.wl0
    public final void a(int i10, View view) {
        switch (this.a) {
            case 0:
                fo0 fo0Var = (fo0) this.d;
                ArrayList arrayList = fo0Var.r;
                ai.u1 u1Var = fo0Var.d;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    if (!UserConfig.getInstance(this.b).isPremium()) {
                        new sg.y0(this.c, 24, true).show();
                        break;
                    } else {
                        long j10 = ((co0) arrayList.get(i10)).a.h;
                        if (fo0Var.f(fo0Var.h == j10 ? null : ((co0) arrayList.get(i10)).a)) {
                            int i11 = 0;
                            while (i11 < u1Var.getChildCount()) {
                                if (u1Var.getChildAt(i11) == view) {
                                    if (i11 <= 1) {
                                        u1Var.v0(-AndroidUtilities.dp(i11 == 0 ? 90.0f : 50.0f), 0, null);
                                    } else if (i11 >= u1Var.getChildCount() - 2) {
                                        u1Var.v0(AndroidUtilities.dp(i11 == u1Var.getChildCount() - 1 ? 80.0f : 50.0f), 0, null);
                                    }
                                }
                                i11++;
                            }
                            u1Var.M(new org.telegram.ui.xq(3));
                            if (fo0Var.h != j10) {
                                fo0Var.h = j10;
                                ((eo0) view).a(true, true);
                                break;
                            } else {
                                fo0Var.h = 0L;
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                sg.m1 m1Var = (sg.m1) this.d;
                if (view instanceof org.telegram.ui.yv0) {
                    org.telegram.ui.yv0 yv0Var = (org.telegram.ui.yv0) view;
                    PremiumPreviewFragment.q0(this.b, yv0Var.f.a);
                    m1Var.showDialog(new sg.y0(this.c, yv0Var.f.a, false));
                    break;
                }
                break;
        }
    }
}
