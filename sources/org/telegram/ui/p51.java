package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p51 implements org.telegram.ui.Components.fj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p51(Object obj, Object obj2, Object obj3, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.ui.Components.fj0
    public final void f(int i3, View view) {
        switch (this.a) {
            case 0:
                v51 v51Var = (v51) this.b;
                x51 x51Var = (x51) this.c;
                u51 u51Var = (u51) this.d;
                ThemeActivity themeActivity = v51Var.e;
                int i10 = themeActivity.f;
                org.telegram.ui.ActionBar.j6 D0 = i10 == 1 ? org.telegram.ui.ActionBar.k6.J : org.telegram.ui.ActionBar.k6.D0();
                if (i3 == x51Var.b() - 1) {
                    themeActivity.presentFragment(new l71(D0, false, 1, false, i10 == 1));
                } else {
                    org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) x51Var.e.get(i3);
                    if (!TextUtils.isEmpty(g6Var.o) && g6Var.a != org.telegram.ui.ActionBar.k6.n) {
                        org.telegram.ui.ActionBar.d6.a(false);
                    }
                    int i11 = D0.Z;
                    int i12 = g6Var.a;
                    if (i11 != i12) {
                        org.telegram.ui.ActionBar.k6.K1(D0, i10 == 1, i12, view);
                        org.telegram.ui.ActionBar.p3.q(D0, g6Var.a);
                        org.telegram.ui.ActionBar.k6.M1(themeActivity);
                    } else {
                        themeActivity.presentFragment(new l71(D0, false, 1, i12 >= 100, i10 == 1));
                    }
                }
                int left = view.getLeft();
                int right = view.getRight();
                int L = org.telegram.messenger.g0.L(52.0f);
                int i13 = left - L;
                if (i13 < 0) {
                    u51Var.w0(i13, 0, null);
                } else {
                    int i14 = right + L;
                    if (i14 > u51Var.getMeasuredWidth()) {
                        u51Var.w0(i14 - u51Var.getMeasuredWidth(), 0, null);
                    }
                }
                int childCount = u51Var.getChildCount();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = u51Var.getChildAt(i15);
                    if (childAt instanceof ThemeActivity.InnerAccentView) {
                        ((ThemeActivity.InnerAccentView) childAt).a(true);
                    }
                }
                break;
            default:
                yw0.a0((yw0) this.b, (Context) this.c, (String) this.d, view, i3);
                break;
        }
    }
}
