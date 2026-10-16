package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Interpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fc1 implements org.telegram.ui.Components.am0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fc1(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.ui.Components.am0
    public final void a(int i10, View view) {
        Interpolator interpolator;
        int i11 = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                oc1 oc1Var = (oc1) obj2;
                kc1 kc1Var = (kc1) obj;
                ThemeActivity themeActivity = ((mc1) obj3).e;
                int i12 = themeActivity.f;
                org.telegram.ui.ActionBar.f6 B0 = i12 == 1 ? org.telegram.ui.ActionBar.g6.J : org.telegram.ui.ActionBar.g6.B0();
                if (i10 == oc1Var.h() - 1) {
                    interpolator = null;
                    themeActivity.presentFragment(new ce1(B0, false, 1, false, i12 == 1));
                } else {
                    interpolator = null;
                    org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) oc1Var.e.get(i10);
                    if (!TextUtils.isEmpty(e6Var.o) && e6Var.a != org.telegram.ui.ActionBar.g6.n) {
                        org.telegram.ui.ActionBar.b6.a(false);
                    }
                    int i13 = B0.Y;
                    int i14 = e6Var.a;
                    if (i13 != i14) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, B0, Boolean.valueOf(i12 == 1), null, Integer.valueOf(e6Var.a));
                        org.telegram.ui.ActionBar.b4.q(B0, e6Var.a);
                        org.telegram.ui.ActionBar.g6.G1(themeActivity);
                    } else {
                        themeActivity.presentFragment(new ce1(B0, false, 1, i14 >= 100, i12 == 1));
                    }
                }
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i15 = left - dp;
                if (i15 < 0) {
                    kc1Var.v0(i15, 0, interpolator);
                } else {
                    int i16 = right + dp;
                    if (i16 > kc1Var.getMeasuredWidth()) {
                        kc1Var.v0(i16 - kc1Var.getMeasuredWidth(), 0, interpolator);
                    }
                }
                int childCount = kc1Var.getChildCount();
                for (int i17 = 0; i17 < childCount; i17++) {
                    View childAt = kc1Var.getChildAt(i17);
                    if (childAt instanceof ThemeActivity.InnerAccentView) {
                        ((ThemeActivity.InnerAccentView) childAt).a(true);
                    }
                }
                break;
            default:
                c21.V((c21) obj3, (Context) obj2, (String) obj, view, i10);
                break;
        }
    }
}
