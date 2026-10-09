package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fo0 implements em0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fo0(Object obj, int i10, org.telegram.ui.ActionBar.n2 n2Var, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = n2Var;
    }

    @Override // org.telegram.ui.Components.em0
    public final void d(int i10, View view) {
        switch (this.a) {
            case 0:
                no0 no0Var = (no0) this.d;
                ArrayList arrayList = no0Var.r;
                ai.w0 w0Var = no0Var.d;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    if (!UserConfig.getInstance(this.b).isPremium()) {
                        new rg.y0(this.c, 24, true).show();
                        break;
                    } else {
                        long j3 = ((ko0) arrayList.get(i10)).a.h;
                        if (no0Var.f(no0Var.h == j3 ? null : ((ko0) arrayList.get(i10)).a)) {
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
                            w0Var.M(new org.telegram.ui.ir(3));
                            if (no0Var.h != j3) {
                                no0Var.h = j3;
                                ((mo0) view).a(true, true);
                                break;
                            } else {
                                no0Var.h = 0L;
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                rg.l1 l1Var = (rg.l1) this.d;
                if (view instanceof org.telegram.ui.uw0) {
                    org.telegram.ui.uw0 uw0Var = (org.telegram.ui.uw0) view;
                    PremiumPreviewFragment.q0(this.b, uw0Var.f.a);
                    l1Var.showDialog(new rg.y0(this.c, uw0Var.f.a, false));
                    break;
                }
                break;
        }
    }
}
