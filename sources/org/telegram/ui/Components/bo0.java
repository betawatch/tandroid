package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class bo0 implements am0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bo0(Object obj, int i10, org.telegram.ui.ActionBar.o2 o2Var, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = o2Var;
    }

    @Override // org.telegram.ui.Components.am0
    public final void d(int i10, View view) {
        switch (this.a) {
            case 0:
                jo0 jo0Var = (jo0) this.d;
                ArrayList arrayList = jo0Var.r;
                ai.u1 u1Var = jo0Var.d;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    if (!UserConfig.getInstance(this.b).isPremium()) {
                        new sg.y0(this.c, 24, true).show();
                        break;
                    } else {
                        long j10 = ((go0) arrayList.get(i10)).a.h;
                        if (jo0Var.f(jo0Var.h == j10 ? null : ((go0) arrayList.get(i10)).a)) {
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
                            u1Var.M(new org.telegram.ui.zq(3));
                            if (jo0Var.h != j10) {
                                jo0Var.h = j10;
                                ((io0) view).a(true, true);
                                break;
                            } else {
                                jo0Var.h = 0L;
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                sg.m1 m1Var = (sg.m1) this.d;
                if (view instanceof org.telegram.ui.cw0) {
                    org.telegram.ui.cw0 cw0Var = (org.telegram.ui.cw0) view;
                    PremiumPreviewFragment.q0(this.b, cw0Var.f.a);
                    m1Var.showDialog(new sg.y0(this.c, cw0Var.f.a, false));
                    break;
                }
                break;
        }
    }
}
