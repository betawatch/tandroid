package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Interpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qa1 implements org.telegram.ui.Components.mk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qa1(Object obj, Object obj2, Object obj3, int i9) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.ui.Components.mk0
    public final void a(int i9, View view) {
        Interpolator interpolator;
        int i10 = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i10) {
            case 0:
                za1 za1Var = (za1) obj2;
                va1 va1Var = (va1) obj;
                ThemeActivity themeActivity = ((xa1) obj3).e;
                int i11 = themeActivity.f;
                org.telegram.ui.ActionBar.e6 A0 = i11 == 1 ? org.telegram.ui.ActionBar.f6.J : org.telegram.ui.ActionBar.f6.A0();
                if (i9 == za1Var.h() - 1) {
                    interpolator = null;
                    themeActivity.presentFragment(new oc1(A0, false, 1, false, i11 == 1));
                } else {
                    interpolator = null;
                    org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) za1Var.e.get(i9);
                    if (!TextUtils.isEmpty(d6Var.o) && d6Var.a != org.telegram.ui.ActionBar.f6.n) {
                        org.telegram.ui.ActionBar.a6.a(false);
                    }
                    int i12 = A0.U;
                    int i13 = d6Var.a;
                    if (i12 != i13) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, A0, Boolean.valueOf(i11 == 1), null, Integer.valueOf(d6Var.a));
                        org.telegram.ui.ActionBar.b4.q(A0, d6Var.a);
                        org.telegram.ui.ActionBar.f6.F1(themeActivity);
                    } else {
                        themeActivity.presentFragment(new oc1(A0, false, 1, i13 >= 100, i11 == 1));
                    }
                }
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i14 = left - dp;
                if (i14 < 0) {
                    va1Var.v0(i14, 0, interpolator);
                } else {
                    int i15 = right + dp;
                    if (i15 > va1Var.getMeasuredWidth()) {
                        va1Var.v0(i15 - va1Var.getMeasuredWidth(), 0, interpolator);
                    }
                }
                int childCount = va1Var.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = va1Var.getChildAt(i16);
                    if (childAt instanceof ThemeActivity.InnerAccentView) {
                        ((ThemeActivity.InnerAccentView) childAt).a(true);
                    }
                }
                break;
            default:
                s01.U((s01) obj3, (Context) obj2, (String) obj, view, i9);
                break;
        }
    }
}
