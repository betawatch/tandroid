package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nn0 implements kl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nn0(Object obj, int i10, org.telegram.ui.ActionBar.n2 n2Var, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = n2Var;
    }

    @Override // org.telegram.ui.Components.kl0
    public final void d(int i10, View view) {
        switch (this.a) {
            case 0:
                vn0 vn0Var = (vn0) this.d;
                ArrayList arrayList = vn0Var.r;
                ai.w0 w0Var = vn0Var.d;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    if (!UserConfig.getInstance(this.b).isPremium()) {
                        new rg.x0(this.c, 24, true).show();
                        break;
                    } else {
                        long j3 = ((sn0) arrayList.get(i10)).a.h;
                        if (vn0Var.f(vn0Var.h == j3 ? null : ((sn0) arrayList.get(i10)).a)) {
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
                            w0Var.N(new org.telegram.ui.ir(3));
                            if (vn0Var.h != j3) {
                                vn0Var.h = j3;
                                ((un0) view).a(true, true);
                                break;
                            } else {
                                vn0Var.h = 0L;
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                rg.k1 k1Var = (rg.k1) this.d;
                if (view instanceof org.telegram.ui.uw0) {
                    org.telegram.ui.uw0 uw0Var = (org.telegram.ui.uw0) view;
                    PremiumPreviewFragment.q0(this.b, uw0Var.f.a);
                    k1Var.showDialog(new rg.x0(this.c, uw0Var.f.a, false));
                    break;
                }
                break;
        }
    }
}
