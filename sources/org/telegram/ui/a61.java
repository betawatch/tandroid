package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class a61 implements org.telegram.ui.Components.cj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a61(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.ui.Components.cj0
    public final void c(int i7, View view) {
        switch (this.a) {
            case 0:
                g61 g61Var = (g61) this.b;
                i61 i61Var = (i61) this.c;
                f61 f61Var = (f61) this.d;
                ThemeActivity themeActivity = g61Var.e;
                int i10 = themeActivity.f;
                org.telegram.ui.ActionBar.k6 D0 = i10 == 1 ? org.telegram.ui.ActionBar.l6.J : org.telegram.ui.ActionBar.l6.D0();
                if (i7 == i61Var.b() - 1) {
                    themeActivity.presentFragment(new w71(D0, false, 1, false, i10 == 1));
                } else {
                    org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) i61Var.e.get(i7);
                    if (!TextUtils.isEmpty(i6Var.o) && i6Var.a != org.telegram.ui.ActionBar.l6.n) {
                        org.telegram.ui.ActionBar.f6.a(false);
                    }
                    int i11 = D0.Y;
                    int i12 = i6Var.a;
                    if (i11 != i12) {
                        org.telegram.ui.ActionBar.l6.K1(D0, i10 == 1, i12, view);
                        org.telegram.ui.ActionBar.r3.q(D0, i6Var.a);
                        org.telegram.ui.ActionBar.l6.M1(themeActivity);
                    } else {
                        themeActivity.presentFragment(new w71(D0, false, 1, i12 >= 100, i10 == 1));
                    }
                }
                int left = view.getLeft();
                int right = view.getRight();
                int L = org.telegram.messenger.g0.L(52.0f);
                int i13 = left - L;
                if (i13 < 0) {
                    f61Var.w0(i13, 0, null);
                } else {
                    int i14 = right + L;
                    if (i14 > f61Var.getMeasuredWidth()) {
                        f61Var.w0(i14 - f61Var.getMeasuredWidth(), 0, null);
                    }
                }
                int childCount = f61Var.getChildCount();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = f61Var.getChildAt(i15);
                    if (childAt instanceof ThemeActivity.InnerAccentView) {
                        ((ThemeActivity.InnerAccentView) childAt).a(true);
                    }
                }
                break;
            default:
                kx0.a0((kx0) this.b, (Context) this.c, (String) this.d, view, i7);
                break;
        }
    }
}
