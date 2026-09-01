package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Interpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fb1 implements org.telegram.ui.Components.jl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fb1(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.ui.Components.jl0
    public final void f(int i10, View view) {
        Interpolator interpolator;
        int i11 = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                ob1 ob1Var = (ob1) obj2;
                kb1 kb1Var = (kb1) obj;
                ThemeActivity themeActivity = ((mb1) obj3).e;
                int i12 = themeActivity.f;
                org.telegram.ui.ActionBar.j6 A0 = i12 == 1 ? org.telegram.ui.ActionBar.k6.J : org.telegram.ui.ActionBar.k6.A0();
                if (i10 == ob1Var.h() - 1) {
                    interpolator = null;
                    themeActivity.presentFragment(new ed1(A0, false, 1, false, i12 == 1));
                } else {
                    interpolator = null;
                    org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) ob1Var.e.get(i10);
                    if (!TextUtils.isEmpty(i6Var.o) && i6Var.a != org.telegram.ui.ActionBar.k6.n) {
                        org.telegram.ui.ActionBar.f6.a(false);
                    }
                    int i13 = A0.V;
                    int i14 = i6Var.a;
                    if (i13 != i14) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, A0, Boolean.valueOf(i12 == 1), null, Integer.valueOf(i6Var.a));
                        org.telegram.ui.ActionBar.f4.q(A0, i6Var.a);
                        org.telegram.ui.ActionBar.k6.F1(themeActivity);
                    } else {
                        themeActivity.presentFragment(new ed1(A0, false, 1, i14 >= 100, i12 == 1));
                    }
                }
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i15 = left - dp;
                if (i15 < 0) {
                    kb1Var.v0(i15, 0, interpolator);
                } else {
                    int i16 = right + dp;
                    if (i16 > kb1Var.getMeasuredWidth()) {
                        kb1Var.v0(i16 - kb1Var.getMeasuredWidth(), 0, interpolator);
                    }
                }
                int childCount = kb1Var.getChildCount();
                for (int i17 = 0; i17 < childCount; i17++) {
                    View childAt = kb1Var.getChildAt(i17);
                    if (childAt instanceof ThemeActivity.InnerAccentView) {
                        ((ThemeActivity.InnerAccentView) childAt).a(true);
                    }
                }
                break;
            default:
                g11.V((g11) obj3, (Context) obj2, (String) obj, view, i10);
                break;
        }
    }
}
