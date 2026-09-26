package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mn0 implements kl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.m2 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mn0(Object obj, int i10, org.telegram.ui.ActionBar.m2 m2Var, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = m2Var;
    }

    @Override // org.telegram.ui.Components.kl0
    public final void d(int i10, View view) {
        switch (this.a) {
            case 0:
                un0 un0Var = (un0) this.d;
                ArrayList arrayList = un0Var.r;
                ai.w0 w0Var = un0Var.d;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    if (!UserConfig.getInstance(this.b).isPremium()) {
                        new rg.x0(this.c, 24, true).show();
                        break;
                    } else {
                        long j3 = ((rn0) arrayList.get(i10)).a.h;
                        if (un0Var.f(un0Var.h == j3 ? null : ((rn0) arrayList.get(i10)).a)) {
                            int i11 = 0;
                            while (i11 < w0Var.getChildCount()) {
                                if (w0Var.getChildAt(i11) == view) {
                                    if (i11 <= 1) {
                                        w0Var.v0(-AndroidUtilities.dp(i11 == 0 ? 90.0f : 50.0f), 0, null);
                                    } else if (i11 >= w0Var.getChildCount() - 2) {
                                        w0Var.v0(AndroidUtilities.dp(i11 == w0Var.getChildCount() - 1 ? 80.0f : 50.0f), 0, null);
                                    }
                                }
                                i11++;
                            }
                            w0Var.M(new org.telegram.ui.fr(3));
                            if (un0Var.h != j3) {
                                un0Var.h = j3;
                                ((tn0) view).a(true, true);
                                break;
                            } else {
                                un0Var.h = 0L;
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                rg.k1 k1Var = (rg.k1) this.d;
                if (view instanceof org.telegram.ui.lw0) {
                    org.telegram.ui.lw0 lw0Var = (org.telegram.ui.lw0) view;
                    PremiumPreviewFragment.q0(this.b, lw0Var.f.a);
                    k1Var.showDialog(new rg.x0(this.c, lw0Var.f.a, false));
                    break;
                }
                break;
        }
    }
}
