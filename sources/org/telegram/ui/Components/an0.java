package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class an0 implements al0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ an0(Object obj, int i10, org.telegram.ui.ActionBar.o2 o2Var, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = o2Var;
    }

    @Override // org.telegram.ui.Components.al0
    public final void d(int i10, View view) {
        switch (this.a) {
            case 0:
                jn0 jn0Var = (jn0) this.d;
                ArrayList arrayList = jn0Var.r;
                ai.w0 w0Var = jn0Var.d;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    if (!UserConfig.getInstance(this.b).isPremium()) {
                        new rg.x0(this.c, 24, true).show();
                        break;
                    } else {
                        long j3 = ((gn0) arrayList.get(i10)).a.h;
                        if (jn0Var.f(jn0Var.h == j3 ? null : ((gn0) arrayList.get(i10)).a)) {
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
                            w0Var.N(new org.telegram.ui.kr(3));
                            if (jn0Var.h != j3) {
                                jn0Var.h = j3;
                                ((in0) view).a(true, true);
                                break;
                            } else {
                                jn0Var.h = 0L;
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                rg.k1 k1Var = (rg.k1) this.d;
                if (view instanceof org.telegram.ui.ww0) {
                    org.telegram.ui.ww0 ww0Var = (org.telegram.ui.ww0) view;
                    PremiumPreviewFragment.q0(this.b, ww0Var.f.a);
                    k1Var.showDialog(new rg.x0(this.c, ww0Var.f.a, false));
                    break;
                }
                break;
        }
    }
}
