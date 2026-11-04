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
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.o71;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class ga extends tj0 implements cs {
    public static final byte[] q3 = new byte[1024];
    public boolean f3;
    public final kg.y g3;
    public final HashMap h3;
    public final HashMap i3;
    public org.telegram.ui.ActionBar.j6 j3;
    public final fa k3;
    public final ArrayList l3;
    public final ArrayList m3;
    public final int n3;
    public int o3;
    public final org.telegram.ui.ActionBar.d2 p3;

    public ga(Context context, org.telegram.ui.ActionBar.d2 d2Var, int i3, ArrayList arrayList, ArrayList arrayList2) {
        super(context, null);
        this.h3 = new HashMap();
        this.i3 = new HashMap();
        this.l3 = arrayList2;
        this.m3 = arrayList;
        this.n3 = i3;
        this.p3 = d2Var;
        if (i3 == 2) {
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, this, null);
        } else {
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this, null);
        }
        setItemAnimator(null);
        setLayoutAnimation(null);
        kg.y yVar = new kg.y(3);
        this.g3 = yVar;
        setPadding(0, 0, 0, 0);
        setClipToPadding(false);
        yVar.j1(0);
        setLayoutManager(yVar);
        fa faVar = new fa(this, context);
        this.k3 = faVar;
        setAdapter(faVar);
        setOnItemClickListener(new fj0() { // from class: org.telegram.ui.Cells.ba
            @Override // org.telegram.ui.Components.fj0
            public final void f(int i10, View view) {
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

    public final void A1(int i3) {
        View view;
        if (i3 == 0 && (view = (View) getParent()) != null) {
            i3 = view.getMeasuredWidth();
        }
        if (i3 == 0) {
            return;
        }
        org.telegram.ui.ActionBar.j6 D0 = this.n3 == 1 ? org.telegram.ui.ActionBar.k6.J : org.telegram.ui.ActionBar.k6.D0();
        this.j3 = D0;
        ArrayList arrayList = this.m3;
        int indexOf = arrayList.indexOf(D0);
        if (indexOf >= 0 || (indexOf = this.l3.indexOf(this.j3) + arrayList.size()) >= 0) {
            this.g3.h1(indexOf, (i3 - org.telegram.messenger.g0.L(76.0f)) / 2);
        }
    }

    public final void B1(org.telegram.ui.ActionBar.j6 j6Var, View view) {
        TLRPC.TL_theme tL_theme = j6Var.G;
        if (tL_theme != null) {
            if (!j6Var.V) {
                return;
            }
            if (tL_theme.document == null) {
                org.telegram.ui.ActionBar.d2 d2Var = this.p3;
                if (d2Var != null) {
                    d2Var.presentFragment(new o71(j6Var, null, true));
                    return;
                }
                return;
            }
        }
        if (!TextUtils.isEmpty(j6Var.d)) {
            org.telegram.ui.ActionBar.d6.a(false);
        }
        SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0).edit();
        edit.putString((this.n3 == 1 || j6Var.q()) ? "lastDarkTheme" : "lastDayTheme", j6Var.m());
        edit.commit();
        if (this.n3 == 1) {
            if (j6Var == org.telegram.ui.ActionBar.k6.J) {
                return;
            }
            boolean z10 = org.telegram.ui.ActionBar.k6.I == org.telegram.ui.ActionBar.k6.J;
            org.telegram.ui.ActionBar.k6.J = j6Var;
            if (z10) {
                org.telegram.ui.ActionBar.k6.m(true);
            }
        } else if (j6Var == org.telegram.ui.ActionBar.k6.D0()) {
            return;
        } else {
            org.telegram.ui.ActionBar.k6.K1(j6Var, false, -1, view);
        }
        D1();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                themesHorizontalListCell$InnerThemeView.a.a(themesHorizontalListCell$InnerThemeView.b == (themesHorizontalListCell$InnerThemeView.b0.n3 == 1 ? org.telegram.ui.ActionBar.k6.J : org.telegram.ui.ActionBar.k6.D0()), true);
            }
        }
        org.telegram.ui.ActionBar.p3.q(j6Var, j6Var.Z);
        if (this.n3 != 1) {
            org.telegram.ui.ActionBar.k6.M1(this.p3);
        }
    }

    public abstract void D1();

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 != hs.Y1) {
            if (i3 == hs.Z1) {
                this.h3.remove((String) objArr[0]);
                return;
            }
            return;
        }
        String str = (String) objArr[0];
        File file = (File) objArr[1];
        org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) this.h3.get(str);
        if (j6Var != null) {
            this.h3.remove(str);
            if (this.i3.remove(j6Var) != null) {
                Utilities.e.c(new lg.y(this, j6Var, file, 28));
            } else {
                z1(j6Var);
            }
        }
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i3 = 0; i3 < 4; i3++) {
            hs.f(i3).c(this, hs.Y1);
            hs.f(i3).c(this, hs.Z1);
        }
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        for (int i3 = 0; i3 < 4; i3++) {
            hs.f(i3).n(this, hs.Y1);
            hs.f(i3).n(this, hs.Z1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f3) {
            canvas.drawLine(bd.a0 ? 0.0f : org.telegram.messenger.g0.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (bd.a0 ? org.telegram.messenger.g0.L(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
        }
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getParent() != null && getParent().getParent() != null) {
            getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i3) {
        super.setBackgroundColor(i3);
        g1();
    }

    public void setDrawDivider(boolean z10) {
        this.f3 = z10;
    }

    public final void z1(org.telegram.ui.ActionBar.j6 j6Var) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                if (themesHorizontalListCell$InnerThemeView.b == j6Var && themesHorizontalListCell$InnerThemeView.c()) {
                    themesHorizontalListCell$InnerThemeView.b.V = true;
                    themesHorizontalListCell$InnerThemeView.a();
                }
            }
        }
    }

    public void C1(org.telegram.ui.ActionBar.j6 j6Var) {
    }
}
