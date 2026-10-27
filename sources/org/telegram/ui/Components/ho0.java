package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ho0 implements am0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.r2 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ho0(Object obj, int i10, org.telegram.ui.ActionBar.r2 r2Var, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = r2Var;
    }

    @Override // org.telegram.ui.Components.am0
    public final void c(int i10, View view) {
        switch (this.a) {
            case 0:
                po0 po0Var = (po0) this.d;
                ArrayList arrayList = po0Var.r;
                bi.r1 r1Var = po0Var.d;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    if (!UserConfig.getInstance(this.b).isPremium()) {
                        new tg.y0(this.c, 24, true).show();
                        break;
                    } else {
                        long j10 = ((mo0) arrayList.get(i10)).a.h;
                        if (po0Var.f(po0Var.h == j10 ? null : ((mo0) arrayList.get(i10)).a)) {
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
                            r1Var.M(new org.telegram.ui.cr(3));
                            if (po0Var.h != j10) {
                                po0Var.h = j10;
                                ((oo0) view).a(true, true);
                                break;
                            } else {
                                po0Var.h = 0L;
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                tg.m1 m1Var = (tg.m1) this.d;
                if (view instanceof org.telegram.ui.iw0) {
                    org.telegram.ui.iw0 iw0Var = (org.telegram.ui.iw0) view;
                    PremiumPreviewFragment.r0(this.b, iw0Var.f.a);
                    m1Var.showDialog(new tg.y0(this.c, iw0Var.f.a, false));
                    break;
                }
                break;
        }
    }
}
