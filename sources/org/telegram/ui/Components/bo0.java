package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bo0 implements am0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.m2 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bo0(Object obj, int i10, org.telegram.ui.ActionBar.m2 m2Var, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = m2Var;
    }

    @Override // org.telegram.ui.Components.am0
    public final void a(int i10, View view) {
        switch (this.a) {
            case 0:
                ko0 ko0Var = (ko0) this.d;
                ArrayList arrayList = ko0Var.r;
                bi.o0 o0Var = ko0Var.d;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    if (!UserConfig.getInstance(this.b).isPremium()) {
                        new sg.y0(this.c, 24, true).show();
                        break;
                    } else {
                        long j10 = ((ho0) arrayList.get(i10)).a.h;
                        if (ko0Var.f(ko0Var.h == j10 ? null : ((ho0) arrayList.get(i10)).a)) {
                            int i11 = 0;
                            while (i11 < o0Var.getChildCount()) {
                                if (o0Var.getChildAt(i11) == view) {
                                    if (i11 <= 1) {
                                        o0Var.v0(-AndroidUtilities.dp(i11 == 0 ? 90.0f : 50.0f), 0, null);
                                    } else if (i11 >= o0Var.getChildCount() - 2) {
                                        o0Var.v0(AndroidUtilities.dp(i11 == o0Var.getChildCount() - 1 ? 80.0f : 50.0f), 0, null);
                                    }
                                }
                                i11++;
                            }
                            o0Var.M(new org.telegram.ui.or(3));
                            if (ko0Var.h != j10) {
                                ko0Var.h = j10;
                                ((jo0) view).a(true, true);
                                break;
                            } else {
                                ko0Var.h = 0L;
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                sg.m1 m1Var = (sg.m1) this.d;
                if (view instanceof org.telegram.ui.ax0) {
                    org.telegram.ui.ax0 ax0Var = (org.telegram.ui.ax0) view;
                    PremiumPreviewFragment.q0(this.b, ax0Var.f.a);
                    m1Var.showDialog(new sg.y0(this.c, ax0Var.f.a, false));
                    break;
                }
                break;
        }
    }
}
