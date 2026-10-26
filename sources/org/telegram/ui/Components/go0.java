package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class go0 implements zl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.r2 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ go0(Object obj, int i10, org.telegram.ui.ActionBar.r2 r2Var, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = r2Var;
    }

    @Override // org.telegram.ui.Components.zl0
    public final void c(int i10, View view) {
        switch (this.a) {
            case 0:
                oo0 oo0Var = (oo0) this.d;
                ArrayList arrayList = oo0Var.r;
                bi.r1 r1Var = oo0Var.d;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    if (!UserConfig.getInstance(this.b).isPremium()) {
                        new tg.y0(this.c, 24, true).show();
                        break;
                    } else {
                        long j10 = ((lo0) arrayList.get(i10)).a.h;
                        if (oo0Var.f(oo0Var.h == j10 ? null : ((lo0) arrayList.get(i10)).a)) {
                            int i11 = 0;
                            while (i11 < r1Var.getChildCount()) {
                                if (r1Var.getChildAt(i11) == view) {
                                    if (i11 <= 1) {
                                        r1Var.w0(-AndroidUtilities.dp(i11 == 0 ? 90.0f : 50.0f), 0, null);
                                    } else if (i11 >= r1Var.getChildCount() - 2) {
                                        r1Var.w0(AndroidUtilities.dp(i11 == r1Var.getChildCount() - 1 ? 80.0f : 50.0f), 0, null);
                                    }
                                }
                                i11++;
                            }
                            r1Var.M(new org.telegram.ui.ar(3));
                            if (oo0Var.h != j10) {
                                oo0Var.h = j10;
                                ((no0) view).a(true, true);
                                break;
                            } else {
                                oo0Var.h = 0L;
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                tg.m1 m1Var = (tg.m1) this.d;
                if (view instanceof org.telegram.ui.gw0) {
                    org.telegram.ui.gw0 gw0Var = (org.telegram.ui.gw0) view;
                    PremiumPreviewFragment.r0(this.b, gw0Var.f.a);
                    m1Var.showDialog(new tg.y0(this.c, gw0Var.f.a, false));
                    break;
                }
                break;
        }
    }
}
