package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Interpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oa1 implements org.telegram.ui.Components.pk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ oa1(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.ui.Components.pk0
    public final void a(int i10, View view) {
        Interpolator interpolator;
        int i11 = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                xa1 xa1Var = (xa1) obj2;
                ta1 ta1Var = (ta1) obj;
                ThemeActivity themeActivity = ((va1) obj3).e;
                int i12 = themeActivity.f;
                org.telegram.ui.ActionBar.f6 A0 = i12 == 1 ? org.telegram.ui.ActionBar.g6.J : org.telegram.ui.ActionBar.g6.A0();
                if (i10 == xa1Var.h() - 1) {
                    interpolator = null;
                    themeActivity.presentFragment(new nc1(A0, false, 1, false, i12 == 1));
                } else {
                    interpolator = null;
                    org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) xa1Var.e.get(i10);
                    if (!TextUtils.isEmpty(e6Var.o) && e6Var.a != org.telegram.ui.ActionBar.g6.n) {
                        org.telegram.ui.ActionBar.b6.a(false);
                    }
                    int i13 = A0.U;
                    int i14 = e6Var.a;
                    if (i13 != i14) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, A0, Boolean.valueOf(i12 == 1), null, Integer.valueOf(e6Var.a));
                        org.telegram.ui.ActionBar.b4.q(A0, e6Var.a);
                        org.telegram.ui.ActionBar.g6.F1(themeActivity);
                    } else {
                        themeActivity.presentFragment(new nc1(A0, false, 1, i14 >= 100, i12 == 1));
                    }
                }
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i15 = left - dp;
                if (i15 < 0) {
                    ta1Var.v0(i15, 0, interpolator);
                } else {
                    int i16 = right + dp;
                    if (i16 > ta1Var.getMeasuredWidth()) {
                        ta1Var.v0(i16 - ta1Var.getMeasuredWidth(), 0, interpolator);
                    }
                }
                int childCount = ta1Var.getChildCount();
                for (int i17 = 0; i17 < childCount; i17++) {
                    View childAt = ta1Var.getChildAt(i17);
                    if (childAt instanceof ThemeActivity.InnerAccentView) {
                        ((ThemeActivity.InnerAccentView) childAt).a(true);
                    }
                }
                break;
            default:
                t01.V((t01) obj3, (Context) obj2, (String) obj, view, i10);
                break;
        }
    }
}
