package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p71 implements org.telegram.ui.Components.hk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p71(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.ui.Components.hk0
    public final void f(int i10, View view) {
        switch (this.a) {
            case 0:
                v71 v71Var = (v71) this.b;
                x71 x71Var = (x71) this.c;
                u71 u71Var = (u71) this.d;
                ThemeActivity themeActivity = v71Var.e;
                int i11 = themeActivity.f;
                org.telegram.ui.ActionBar.s6 D0 = i11 == 1 ? org.telegram.ui.ActionBar.t6.J : org.telegram.ui.ActionBar.t6.D0();
                if (i10 == x71Var.b() - 1) {
                    themeActivity.presentFragment(new k91(D0, false, 1, false, i11 == 1));
                } else {
                    org.telegram.ui.ActionBar.r6 r6Var = (org.telegram.ui.ActionBar.r6) x71Var.e.get(i10);
                    if (!TextUtils.isEmpty(r6Var.o) && r6Var.a != org.telegram.ui.ActionBar.t6.n) {
                        org.telegram.ui.ActionBar.o6.a(false);
                    }
                    int i12 = D0.Y;
                    int i13 = r6Var.a;
                    if (i12 != i13) {
                        org.telegram.ui.ActionBar.t6.K1(D0, i11 == 1, i13, view);
                        org.telegram.ui.ActionBar.y3.q(D0, r6Var.a);
                        org.telegram.ui.ActionBar.t6.M1(themeActivity);
                    } else {
                        themeActivity.presentFragment(new k91(D0, false, 1, i13 >= 100, i11 == 1));
                    }
                }
                int left = view.getLeft();
                int right = view.getRight();
                int L = org.telegram.messenger.i0.L(52.0f);
                int i14 = left - L;
                if (i14 < 0) {
                    u71Var.w0(i14, 0, null);
                } else {
                    int i15 = right + L;
                    if (i15 > u71Var.getMeasuredWidth()) {
                        u71Var.w0(i15 - u71Var.getMeasuredWidth(), 0, null);
                    }
                }
                int childCount = u71Var.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = u71Var.getChildAt(i16);
                    if (childAt instanceof ThemeActivity.InnerAccentView) {
                        ((ThemeActivity.InnerAccentView) childAt).a(true);
                    }
                }
                break;
            default:
                ty0.a0((ty0) this.b, (Context) this.c, (String) this.d, view, i10);
                break;
        }
    }
}
