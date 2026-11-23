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
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.a81;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public abstract class ia extends ek0 implements gs {
    public static final byte[] q3 = new byte[1024];
    public boolean f3;
    public final jg.b0 g3;
    public final HashMap h3;
    public final HashMap i3;
    public org.telegram.ui.ActionBar.l6 j3;
    public final ha k3;
    public final ArrayList l3;
    public final ArrayList m3;
    public final int n3;
    public int o3;
    public final org.telegram.ui.ActionBar.g2 p3;

    public ia(Context context, org.telegram.ui.ActionBar.g2 g2Var, int i7, ArrayList arrayList, ArrayList arrayList2) {
        super(context, null);
        this.h3 = new HashMap();
        this.i3 = new HashMap();
        this.l3 = arrayList2;
        this.m3 = arrayList;
        this.n3 = i7;
        this.p3 = g2Var;
        if (i7 == 2) {
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.h5, this, null);
        } else {
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, this, null);
        }
        setItemAnimator(null);
        setLayoutAnimation(null);
        jg.b0 b0Var = new jg.b0(3);
        this.g3 = b0Var;
        setPadding(0, 0, 0, 0);
        setClipToPadding(false);
        b0Var.j1(0);
        setLayoutManager(b0Var);
        ha haVar = new ha(this, context);
        this.k3 = haVar;
        setAdapter(haVar);
        setOnItemClickListener(new qj0() { // from class: org.telegram.ui.Cells.da
            @Override // org.telegram.ui.Components.qj0
            public final void c(int i10, View view) {
                ia iaVar = ia.this;
                iaVar.getClass();
                iaVar.B1(((ThemesHorizontalListCell$InnerThemeView) view).b, view);
                int left = view.getLeft();
                int right = view.getRight();
                if (left < 0) {
                    iaVar.w0(left - org.telegram.messenger.g0.L(8.0f), 0, null);
                } else if (right > iaVar.getMeasuredWidth()) {
                    iaVar.w0(right - iaVar.getMeasuredWidth(), 0, null);
                }
            }
        });
        setOnItemLongClickListener(new ea(this, 0));
    }

    public final void A1(int i7) {
        View view;
        if (i7 == 0 && (view = (View) getParent()) != null) {
            i7 = view.getMeasuredWidth();
        }
        if (i7 == 0) {
            return;
        }
        org.telegram.ui.ActionBar.l6 D0 = this.n3 == 1 ? org.telegram.ui.ActionBar.m6.J : org.telegram.ui.ActionBar.m6.D0();
        this.j3 = D0;
        ArrayList arrayList = this.m3;
        int indexOf = arrayList.indexOf(D0);
        if (indexOf >= 0 || (indexOf = this.l3.indexOf(this.j3) + arrayList.size()) >= 0) {
            this.g3.h1(indexOf, (i7 - org.telegram.messenger.g0.L(76.0f)) / 2);
        }
    }

    public final void B1(org.telegram.ui.ActionBar.l6 l6Var, View view) {
        TLRPC.TL_theme tL_theme = l6Var.G;
        if (tL_theme != null) {
            if (!l6Var.V) {
                return;
            }
            if (tL_theme.document == null) {
                org.telegram.ui.ActionBar.g2 g2Var = this.p3;
                if (g2Var != null) {
                    g2Var.presentFragment(new a81(l6Var, null, true));
                    return;
                }
                return;
            }
        }
        if (!TextUtils.isEmpty(l6Var.d)) {
            org.telegram.ui.ActionBar.g6.a(false);
        }
        SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0).edit();
        edit.putString((this.n3 == 1 || l6Var.q()) ? "lastDarkTheme" : "lastDayTheme", l6Var.m());
        edit.commit();
        if (this.n3 == 1) {
            if (l6Var == org.telegram.ui.ActionBar.m6.J) {
                return;
            }
            boolean z10 = org.telegram.ui.ActionBar.m6.I == org.telegram.ui.ActionBar.m6.J;
            org.telegram.ui.ActionBar.m6.J = l6Var;
            if (z10) {
                org.telegram.ui.ActionBar.m6.m(true);
            }
        } else if (l6Var == org.telegram.ui.ActionBar.m6.D0()) {
            return;
        } else {
            org.telegram.ui.ActionBar.m6.K1(l6Var, false, -1, view);
        }
        D1();
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                themesHorizontalListCell$InnerThemeView.a.a(themesHorizontalListCell$InnerThemeView.b == (themesHorizontalListCell$InnerThemeView.b0.n3 == 1 ? org.telegram.ui.ActionBar.m6.J : org.telegram.ui.ActionBar.m6.D0()), true);
            }
        }
        org.telegram.ui.ActionBar.s3.q(l6Var, l6Var.Z);
        if (this.n3 != 1) {
            org.telegram.ui.ActionBar.m6.M1(this.p3);
        }
    }

    public abstract void D1();

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != ls.Y1) {
            if (i7 == ls.Z1) {
                this.h3.remove((String) objArr[0]);
                return;
            }
            return;
        }
        String str = (String) objArr[0];
        File file = (File) objArr[1];
        org.telegram.ui.ActionBar.l6 l6Var = (org.telegram.ui.ActionBar.l6) this.h3.get(str);
        if (l6Var != null) {
            this.h3.remove(str);
            if (this.i3.remove(l6Var) != null) {
                Utilities.e.c(new kg.y(this, l6Var, file, 29));
            } else {
                z1(l6Var);
            }
        }
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i7 = 0; i7 < 4; i7++) {
            ls.f(i7).c(this, ls.Y1);
            ls.f(i7).c(this, ls.Z1);
        }
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        for (int i7 = 0; i7 < 4; i7++) {
            ls.f(i7).n(this, ls.Y1);
            ls.f(i7).n(this, ls.Z1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f3) {
            canvas.drawLine(hd.a0 ? 0.0f : org.telegram.messenger.g0.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (hd.a0 ? org.telegram.messenger.g0.L(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.m6.k0);
        }
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
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

    public void setDrawDivider(boolean z10) {
        this.f3 = z10;
    }

    public final void z1(org.telegram.ui.ActionBar.l6 l6Var) {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                if (themesHorizontalListCell$InnerThemeView.b == l6Var && themesHorizontalListCell$InnerThemeView.c()) {
                    themesHorizontalListCell$InnerThemeView.b.V = true;
                    themesHorizontalListCell$InnerThemeView.a();
                }
            }
        }
    }

    public void C1(org.telegram.ui.ActionBar.l6 l6Var) {
    }
}
