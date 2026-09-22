package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zm0 implements zk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zm0(Object obj, int i10, org.telegram.ui.ActionBar.n2 n2Var, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = n2Var;
    }

    @Override // org.telegram.ui.Components.zk0
    public final void d(int i10, View view) {
        switch (this.a) {
            case 0:
                hn0 hn0Var = (hn0) this.d;
                ArrayList arrayList = hn0Var.r;
                ai.w0 w0Var = hn0Var.d;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    if (!UserConfig.getInstance(this.b).isPremium()) {
                        new rg.x0(this.c, 24, true).show();
                        break;
                    } else {
                        long j3 = ((en0) arrayList.get(i10)).a.h;
                        if (hn0Var.f(hn0Var.h == j3 ? null : ((en0) arrayList.get(i10)).a)) {
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
                            w0Var.M(new org.telegram.ui.kr(3));
                            if (hn0Var.h != j3) {
                                hn0Var.h = j3;
                                ((gn0) view).a(true, true);
                                break;
                            } else {
                                hn0Var.h = 0L;
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
