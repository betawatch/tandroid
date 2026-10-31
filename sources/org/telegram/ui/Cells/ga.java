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
import org.telegram.messenger.cd;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.p91;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class ga extends tk0 implements us {
    public static final byte[] p3 = new byte[1024];
    public boolean e3;
    public final dh.f f3;
    public final HashMap g3;
    public final HashMap h3;
    public org.telegram.ui.ActionBar.s6 i3;
    public final fa j3;
    public final ArrayList k3;
    public final ArrayList l3;
    public final int m3;
    public int n3;
    public final org.telegram.ui.ActionBar.k2 o3;

    public ga(Context context, org.telegram.ui.ActionBar.k2 k2Var, int i10, ArrayList arrayList, ArrayList arrayList2) {
        super(context, null);
        this.g3 = new HashMap();
        this.h3 = new HashMap();
        this.k3 = arrayList2;
        this.l3 = arrayList;
        this.m3 = i10;
        this.o3 = k2Var;
        if (i10 == 2) {
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.h5, this, null);
        } else {
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, this, null);
        }
        setItemAnimator(null);
        setLayoutAnimation(null);
        dh.f fVar = new dh.f(2);
        this.f3 = fVar;
        setPadding(0, 0, 0, 0);
        setClipToPadding(false);
        fVar.j1(0);
        setLayoutManager(fVar);
        fa faVar = new fa(this, context);
        this.j3 = faVar;
        setAdapter(faVar);
        setOnItemClickListener(new gk0() { // from class: org.telegram.ui.Cells.ba
            @Override // org.telegram.ui.Components.gk0
            public final void f(int i11, View view) {
                ga gaVar = ga.this;
                gaVar.getClass();
                gaVar.B1(((ThemesHorizontalListCell$InnerThemeView) view).b, view);
                int left = view.getLeft();
                int right = view.getRight();
                if (left < 0) {
                    gaVar.w0(left - org.telegram.messenger.i0.L(8.0f), 0, null);
                } else if (right > gaVar.getMeasuredWidth()) {
                    gaVar.w0(right - gaVar.getMeasuredWidth(), 0, null);
                }
            }
        });
        setOnItemLongClickListener(new ca(this, 0));
    }

    public final void A1(int i10) {
        View view;
        if (i10 == 0 && (view = (View) getParent()) != null) {
            i10 = view.getMeasuredWidth();
        }
        if (i10 == 0) {
            return;
        }
        org.telegram.ui.ActionBar.s6 D0 = this.m3 == 1 ? org.telegram.ui.ActionBar.t6.J : org.telegram.ui.ActionBar.t6.D0();
        this.i3 = D0;
        ArrayList arrayList = this.l3;
        int indexOf = arrayList.indexOf(D0);
        if (indexOf >= 0 || (indexOf = this.k3.indexOf(this.i3) + arrayList.size()) >= 0) {
            this.f3.h1(indexOf, (i10 - org.telegram.messenger.i0.L(76.0f)) / 2);
        }
    }

    public final void B1(org.telegram.ui.ActionBar.s6 s6Var, View view) {
        TLRPC.TL_theme tL_theme = s6Var.F;
        if (tL_theme != null) {
            if (!s6Var.U) {
                return;
            }
            if (tL_theme.document == null) {
                org.telegram.ui.ActionBar.k2 k2Var = this.o3;
                if (k2Var != null) {
                    k2Var.presentFragment(new p91(s6Var, null, true));
                    return;
                }
                return;
            }
        }
        if (!TextUtils.isEmpty(s6Var.d)) {
            org.telegram.ui.ActionBar.o6.a(false);
        }
        SharedPreferences.Editor edit = org.telegram.messenger.w0.b.getSharedPreferences("themeconfig", 0).edit();
        edit.putString((this.m3 == 1 || s6Var.q()) ? "lastDarkTheme" : "lastDayTheme", s6Var.m());
        edit.commit();
        if (this.m3 == 1) {
            if (s6Var == org.telegram.ui.ActionBar.t6.J) {
                return;
            }
            boolean z10 = org.telegram.ui.ActionBar.t6.I == org.telegram.ui.ActionBar.t6.J;
            org.telegram.ui.ActionBar.t6.J = s6Var;
            if (z10) {
                org.telegram.ui.ActionBar.t6.m(true);
            }
        } else if (s6Var == org.telegram.ui.ActionBar.t6.D0()) {
            return;
        } else {
            org.telegram.ui.ActionBar.t6.K1(s6Var, false, -1, view);
        }
        D1();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                themesHorizontalListCell$InnerThemeView.a.a(themesHorizontalListCell$InnerThemeView.b == (themesHorizontalListCell$InnerThemeView.a0.m3 == 1 ? org.telegram.ui.ActionBar.t6.J : org.telegram.ui.ActionBar.t6.D0()), true);
            }
        }
        org.telegram.ui.ActionBar.y3.q(s6Var, s6Var.Y);
        if (this.m3 != 1) {
            org.telegram.ui.ActionBar.t6.M1(this.o3);
        }
    }

    public abstract void D1();

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != zs.Y1) {
            if (i10 == zs.Z1) {
                this.g3.remove((String) objArr[0]);
                return;
            }
            return;
        }
        String str = (String) objArr[0];
        File file = (File) objArr[1];
        org.telegram.ui.ActionBar.s6 s6Var = (org.telegram.ui.ActionBar.s6) this.g3.get(str);
        if (s6Var != null) {
            this.g3.remove(str);
            if (this.h3.remove(s6Var) != null) {
                Utilities.e.c(new li.s(this, s6Var, file, 24));
            } else {
                z1(s6Var);
            }
        }
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i10 = 0; i10 < 4; i10++) {
            zs.f(i10).c(this, zs.Y1);
            zs.f(i10).c(this, zs.Z1);
        }
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        for (int i10 = 0; i10 < 4; i10++) {
            zs.f(i10).n(this, zs.Y1);
            zs.f(i10).n(this, zs.Z1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.e3) {
            canvas.drawLine(cd.X ? 0.0f : org.telegram.messenger.i0.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (cd.X ? org.telegram.messenger.i0.L(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.k0);
        }
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getParent() != null && getParent().getParent() != null) {
            getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        super.setBackgroundColor(i10);
        g1();
    }

    public void setDrawDivider(boolean z10) {
        this.e3 = z10;
    }

    public final void z1(org.telegram.ui.ActionBar.s6 s6Var) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                if (themesHorizontalListCell$InnerThemeView.b == s6Var && themesHorizontalListCell$InnerThemeView.c()) {
                    themesHorizontalListCell$InnerThemeView.b.U = true;
                    themesHorizontalListCell$InnerThemeView.a();
                }
            }
        }
    }

    public void C1(org.telegram.ui.ActionBar.s6 s6Var) {
    }
}
