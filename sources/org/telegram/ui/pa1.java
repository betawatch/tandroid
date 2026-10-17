package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Interpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pa1 implements org.telegram.ui.Components.wl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pa1(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.ui.Components.wl0
    public final void a(int i10, View view) {
        Interpolator interpolator;
        int i11 = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                ya1 ya1Var = (ya1) obj2;
                ua1 ua1Var = (ua1) obj;
                ThemeActivity themeActivity = ((wa1) obj3).e;
                int i12 = themeActivity.f;
                org.telegram.ui.ActionBar.g6 B0 = i12 == 1 ? org.telegram.ui.ActionBar.h6.J : org.telegram.ui.ActionBar.h6.B0();
                if (i10 == ya1Var.h() - 1) {
                    interpolator = null;
                    themeActivity.presentFragment(new mc1(B0, false, 1, false, i12 == 1));
                } else {
                    interpolator = null;
                    org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) ya1Var.e.get(i10);
                    if (!TextUtils.isEmpty(f6Var.o) && f6Var.a != org.telegram.ui.ActionBar.h6.n) {
                        org.telegram.ui.ActionBar.c6.a(false);
                    }
                    int i13 = B0.Y;
                    int i14 = f6Var.a;
                    if (i13 != i14) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, B0, Boolean.valueOf(i12 == 1), null, Integer.valueOf(f6Var.a));
                        org.telegram.ui.ActionBar.c4.p(B0, f6Var.a);
                        org.telegram.ui.ActionBar.h6.G1(themeActivity);
                    } else {
                        themeActivity.presentFragment(new mc1(B0, false, 1, i14 >= 100, i12 == 1));
                    }
                }
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i15 = left - dp;
                if (i15 < 0) {
                    ua1Var.v0(i15, 0, interpolator);
                } else {
                    int i16 = right + dp;
                    if (i16 > ua1Var.getMeasuredWidth()) {
                        ua1Var.v0(i16 - ua1Var.getMeasuredWidth(), 0, interpolator);
                    }
                }
                int childCount = ua1Var.getChildCount();
                for (int i17 = 0; i17 < childCount; i17++) {
                    View childAt = ua1Var.getChildAt(i17);
                    if (childAt instanceof ThemeActivity.InnerAccentView) {
                        ((ThemeActivity.InnerAccentView) childAt).a(true);
                    }
                }
                break;
            default:
                b11.V((b11) obj3, (Context) obj2, (String) obj, view, i10);
                break;
        }
    }
}
