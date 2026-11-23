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
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.y71;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public abstract class ja extends ek0 implements fs {
    public static final byte[] q3 = new byte[1024];
    public boolean f3;
    public final jg.b0 g3;
    public final HashMap h3;
    public final HashMap i3;
    public org.telegram.ui.ActionBar.m6 j3;
    public final ia k3;
    public final ArrayList l3;
    public final ArrayList m3;
    public final int n3;
    public int o3;
    public final org.telegram.ui.ActionBar.g2 p3;

    public ja(Context context, org.telegram.ui.ActionBar.g2 g2Var, int i7, ArrayList arrayList, ArrayList arrayList2) {
        super(context, null);
        this.h3 = new HashMap();
        this.i3 = new HashMap();
        this.l3 = arrayList2;
        this.m3 = arrayList;
        this.n3 = i7;
        this.p3 = g2Var;
        if (i7 == 2) {
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.h5, this, null);
        } else {
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, this, null);
        }
        setItemAnimator(null);
        setLayoutAnimation(null);
        jg.b0 b0Var = new jg.b0(3);
        this.g3 = b0Var;
        setPadding(0, 0, 0, 0);
        setClipToPadding(false);
        b0Var.j1(0);
        setLayoutManager(b0Var);
        ia iaVar = new ia(this, context);
        this.k3 = iaVar;
        setAdapter(iaVar);
        setOnItemClickListener(new qj0() { // from class: org.telegram.ui.Cells.da
            @Override // org.telegram.ui.Components.qj0
            public final void b(int i10, View view) {
                ja jaVar = ja.this;
                jaVar.getClass();
                jaVar.B1(((ThemesHorizontalListCell$InnerThemeView) view).b, view);
                int left = view.getLeft();
                int right = view.getRight();
                if (left < 0) {
                    jaVar.w0(left - org.telegram.messenger.g0.L(8.0f), 0, null);
                } else if (right > jaVar.getMeasuredWidth()) {
                    jaVar.w0(right - jaVar.getMeasuredWidth(), 0, null);
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
        org.telegram.ui.ActionBar.m6 D0 = this.n3 == 1 ? org.telegram.ui.ActionBar.n6.J : org.telegram.ui.ActionBar.n6.D0();
        this.j3 = D0;
        ArrayList arrayList = this.m3;
        int indexOf = arrayList.indexOf(D0);
        if (indexOf >= 0 || (indexOf = this.l3.indexOf(this.j3) + arrayList.size()) >= 0) {
            this.g3.h1(indexOf, (i7 - org.telegram.messenger.g0.L(76.0f)) / 2);
        }
    }

    public final void B1(org.telegram.ui.ActionBar.m6 m6Var, View view) {
        TLRPC.TL_theme tL_theme = m6Var.G;
        if (tL_theme != null) {
            if (!m6Var.V) {
                return;
            }
            if (tL_theme.document == null) {
                org.telegram.ui.ActionBar.g2 g2Var = this.p3;
                if (g2Var != null) {
                    g2Var.presentFragment(new y71(m6Var, null, true));
                    return;
                }
                return;
            }
        }
        if (!TextUtils.isEmpty(m6Var.d)) {
            org.telegram.ui.ActionBar.h6.a(false);
        }
        SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0).edit();
        edit.putString((this.n3 == 1 || m6Var.q()) ? "lastDarkTheme" : "lastDayTheme", m6Var.m());
        edit.commit();
        if (this.n3 == 1) {
            if (m6Var == org.telegram.ui.ActionBar.n6.J) {
                return;
            }
            boolean z10 = org.telegram.ui.ActionBar.n6.I == org.telegram.ui.ActionBar.n6.J;
            org.telegram.ui.ActionBar.n6.J = m6Var;
            if (z10) {
                org.telegram.ui.ActionBar.n6.m(true);
            }
        } else if (m6Var == org.telegram.ui.ActionBar.n6.D0()) {
            return;
        } else {
            org.telegram.ui.ActionBar.n6.K1(m6Var, false, -1, view);
        }
        D1();
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                themesHorizontalListCell$InnerThemeView.a.a(themesHorizontalListCell$InnerThemeView.b == (themesHorizontalListCell$InnerThemeView.b0.n3 == 1 ? org.telegram.ui.ActionBar.n6.J : org.telegram.ui.ActionBar.n6.D0()), true);
            }
        }
        org.telegram.ui.ActionBar.s3.q(m6Var, m6Var.Z);
        if (this.n3 != 1) {
            org.telegram.ui.ActionBar.n6.M1(this.p3);
        }
    }

    public abstract void D1();

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != ks.Y1) {
            if (i7 == ks.Z1) {
                this.h3.remove((String) objArr[0]);
                return;
            }
            return;
        }
        String str = (String) objArr[0];
        File file = (File) objArr[1];
        org.telegram.ui.ActionBar.m6 m6Var = (org.telegram.ui.ActionBar.m6) this.h3.get(str);
        if (m6Var != null) {
            this.h3.remove(str);
            if (this.i3.remove(m6Var) != null) {
                Utilities.e.c(new fa(this, m6Var, file, 0));
            } else {
                z1(m6Var);
            }
        }
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i7 = 0; i7 < 4; i7++) {
            ks.f(i7).c(this, ks.Y1);
            ks.f(i7).c(this, ks.Z1);
        }
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        for (int i7 = 0; i7 < 4; i7++) {
            ks.f(i7).n(this, ks.Y1);
            ks.f(i7).n(this, ks.Z1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f3) {
            canvas.drawLine(gd.a0 ? 0.0f : org.telegram.messenger.g0.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (gd.a0 ? org.telegram.messenger.g0.L(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.n6.k0);
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

    public final void z1(org.telegram.ui.ActionBar.m6 m6Var) {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                if (themesHorizontalListCell$InnerThemeView.b == m6Var && themesHorizontalListCell$InnerThemeView.c()) {
                    themesHorizontalListCell$InnerThemeView.b.V = true;
                    themesHorizontalListCell$InnerThemeView.a();
                }
            }
        }
    }

    public void C1(org.telegram.ui.ActionBar.m6 m6Var) {
    }
}
