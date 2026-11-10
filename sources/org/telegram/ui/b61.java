package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b61 implements org.telegram.ui.Components.bj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b61(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.ui.Components.bj0
    public final void c(int i7, View view) {
        switch (this.a) {
            case 0:
                h61 h61Var = (h61) this.b;
                j61 j61Var = (j61) this.c;
                g61 g61Var = (g61) this.d;
                ThemeActivity themeActivity = h61Var.e;
                int i10 = themeActivity.f;
                org.telegram.ui.ActionBar.l6 D0 = i10 == 1 ? org.telegram.ui.ActionBar.m6.J : org.telegram.ui.ActionBar.m6.D0();
                if (i7 == j61Var.b() - 1) {
                    themeActivity.presentFragment(new x71(D0, false, 1, false, i10 == 1));
                } else {
                    org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) j61Var.e.get(i7);
                    if (!TextUtils.isEmpty(j6Var.o) && j6Var.a != org.telegram.ui.ActionBar.m6.n) {
                        org.telegram.ui.ActionBar.g6.a(false);
                    }
                    int i11 = D0.Y;
                    int i12 = j6Var.a;
                    if (i11 != i12) {
                        org.telegram.ui.ActionBar.m6.K1(D0, i10 == 1, i12, view);
                        org.telegram.ui.ActionBar.s3.q(D0, j6Var.a);
                        org.telegram.ui.ActionBar.m6.M1(themeActivity);
                    } else {
                        themeActivity.presentFragment(new x71(D0, false, 1, i12 >= 100, i10 == 1));
                    }
                }
                int left = view.getLeft();
                int right = view.getRight();
                int L = org.telegram.messenger.g0.L(52.0f);
                int i13 = left - L;
                if (i13 < 0) {
                    g61Var.w0(i13, 0, null);
                } else {
                    int i14 = right + L;
                    if (i14 > g61Var.getMeasuredWidth()) {
                        g61Var.w0(i14 - g61Var.getMeasuredWidth(), 0, null);
                    }
                }
                int childCount = g61Var.getChildCount();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = g61Var.getChildAt(i15);
                    if (childAt instanceof ThemeActivity.InnerAccentView) {
                        ((ThemeActivity.InnerAccentView) childAt).a(true);
                    }
                }
                break;
            default:
                lx0.a0((lx0) this.b, (Context) this.c, (String) this.d, view, i7);
                break;
        }
    }
}
