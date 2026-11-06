package org.telegram.ui.Cells;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.x71;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public abstract class ga extends pj0 implements ls {
    public static final byte[] p3 = new byte[1024];
    public boolean e3;
    public final jg.b0 f3;
    public final HashMap g3;
    public final HashMap h3;
    public org.telegram.ui.ActionBar.j6 i3;
    public final fa j3;
    public final ArrayList k3;
    public final ArrayList l3;
    public final int m3;
    public int n3;
    public final org.telegram.ui.ActionBar.f2 o3;

    public ga(Context context, org.telegram.ui.ActionBar.f2 f2Var, int i7, ArrayList arrayList, ArrayList arrayList2) {
        super(context, null);
        this.g3 = new HashMap();
        this.h3 = new HashMap();
        this.k3 = arrayList2;
        this.l3 = arrayList;
        this.m3 = i7;
        this.o3 = f2Var;
        if (i7 == 2) {
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, this, null);
        } else {
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this, null);
        }
        setItemAnimator(null);
        setLayoutAnimation(null);
        jg.b0 b0Var = new jg.b0(3);
        this.f3 = b0Var;
        setPadding(0, 0, 0, 0);
        setClipToPadding(false);
        b0Var.j1(0);
        setLayoutManager(b0Var);
        fa faVar = new fa(this, context);
        this.j3 = faVar;
        setAdapter(faVar);
        setOnItemClickListener(new bj0() { // from class: org.telegram.ui.Cells.ba
            @Override // org.telegram.ui.Components.bj0
            public final void c(int i10, View view) {
                ga gaVar = ga.this;
                gaVar.getClass();
                gaVar.B1(((ThemesHorizontalListCell$InnerThemeView) view).b, view);
                int left = view.getLeft();
                int right = view.getRight();
                if (left < 0) {
                    gaVar.w0(left - org.telegram.messenger.g0.L(8.0f), 0, null);
                } else if (right > gaVar.getMeasuredWidth()) {
                    gaVar.w0(right - gaVar.getMeasuredWidth(), 0, null);
                }
            }
        });
        setOnItemLongClickListener(new ca(this, 0));
    }

    public final void A1(int i7) {
        View view;
        if (i7 == 0 && (view = (View) getParent()) != null) {
            i7 = view.getMeasuredWidth();
        }
        if (i7 == 0) {
            return;
        }
        org.telegram.ui.ActionBar.j6 D0 = this.m3 == 1 ? org.telegram.ui.ActionBar.k6.J : org.telegram.ui.ActionBar.k6.D0();
        this.i3 = D0;
        ArrayList arrayList = this.l3;
        int indexOf = arrayList.indexOf(D0);
        if (indexOf >= 0 || (indexOf = this.k3.indexOf(this.i3) + arrayList.size()) >= 0) {
            this.f3.h1(indexOf, (i7 - org.telegram.messenger.g0.L(76.0f)) / 2);
        }
    }

    public final void B1(org.telegram.ui.ActionBar.j6 j6Var, View view) {
        TLRPC.TL_theme tL_theme = j6Var.F;
        if (tL_theme != null) {
            if (!j6Var.U) {
                return;
            }
            if (tL_theme.document == null) {
                org.telegram.ui.ActionBar.f2 f2Var = this.o3;
                if (f2Var != null) {
                    f2Var.presentFragment(new x71(j6Var, null, true));
                    return;
                }
                return;
            }
        }
        if (!TextUtils.isEmpty(j6Var.d)) {
            org.telegram.ui.ActionBar.e6.a(false);
        }
        SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0).edit();
        edit.putString((this.m3 == 1 || j6Var.q()) ? "lastDarkTheme" : "lastDayTheme", j6Var.m());
        edit.commit();
        if (this.m3 == 1) {
            if (j6Var == org.telegram.ui.ActionBar.k6.J) {
                return;
            }
            boolean z9 = org.telegram.ui.ActionBar.k6.I == org.telegram.ui.ActionBar.k6.J;
            org.telegram.ui.ActionBar.k6.J = j6Var;
            if (z9) {
                org.telegram.ui.ActionBar.k6.m(true);
            }
        } else if (j6Var == org.telegram.ui.ActionBar.k6.D0()) {
            return;
        } else {
            org.telegram.ui.ActionBar.k6.K1(j6Var, false, -1, view);
        }
        D1();
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                themesHorizontalListCell$InnerThemeView.a.a(themesHorizontalListCell$InnerThemeView.b == (themesHorizontalListCell$InnerThemeView.a0.m3 == 1 ? org.telegram.ui.ActionBar.k6.J : org.telegram.ui.ActionBar.k6.D0()), true);
            }
        }
        org.telegram.ui.ActionBar.r3.q(j6Var, j6Var.Y);
        if (this.m3 != 1) {
            org.telegram.ui.ActionBar.k6.M1(this.o3);
        }
    }

    public abstract void D1();

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != qs.Y1) {
            if (i7 == qs.Z1) {
                this.g3.remove((String) objArr[0]);
                return;
            }
            return;
        }
        String str = (String) objArr[0];
        File file = (File) objArr[1];
        org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) this.g3.get(str);
        if (j6Var != null) {
            this.g3.remove(str);
            if (this.h3.remove(j6Var) != null) {
                Utilities.e.c(new l2.z0(this, j6Var, file, 24));
            } else {
                z1(j6Var);
            }
        }
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i7 = 0; i7 < 4; i7++) {
            qs.f(i7).c(this, qs.Y1);
            qs.f(i7).c(this, qs.Z1);
        }
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        for (int i7 = 0; i7 < 4; i7++) {
            qs.f(i7).n(this, qs.Y1);
            qs.f(i7).n(this, qs.Z1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.e3) {
            canvas.drawLine(hd.a0 ? 0.0f : org.telegram.messenger.g0.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (hd.a0 ? org.telegram.messenger.g0.L(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
        }
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getParent() != null && getParent().getParent() != null) {
            getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        super.setBackgroundColor(i7);
        g1();
    }

    public void setDrawDivider(boolean z9) {
        this.e3 = z9;
    }

    public final void z1(org.telegram.ui.ActionBar.j6 j6Var) {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                if (themesHorizontalListCell$InnerThemeView.b == j6Var && themesHorizontalListCell$InnerThemeView.c()) {
                    themesHorizontalListCell$InnerThemeView.b.U = true;
                    themesHorizontalListCell$InnerThemeView.a();
                }
            }
        }
    }

    public void C1(org.telegram.ui.ActionBar.j6 j6Var) {
    }
}
