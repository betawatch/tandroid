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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.ad1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class ra extends nm0 implements NotificationCenter.NotificationCenterDelegate {
    public static final byte[] q3 = new byte[1024];
    public boolean f3;
    public final ig.a0 g3;
    public final HashMap h3;
    public final HashMap i3;
    public org.telegram.ui.ActionBar.x6 j3;
    public final qa k3;
    public final ArrayList l3;
    public final ArrayList m3;
    public final int n3;
    public int o3;
    public final org.telegram.ui.ActionBar.r2 p3;

    public ra(Context context, org.telegram.ui.ActionBar.r2 r2Var, int i10, ArrayList arrayList, ArrayList arrayList2) {
        super(context, null);
        this.h3 = new HashMap();
        this.i3 = new HashMap();
        this.l3 = arrayList2;
        this.m3 = arrayList;
        this.n3 = i10;
        this.p3 = r2Var;
        if (i10 == 2) {
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.h5, this, null);
        } else {
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, this, null);
        }
        setItemAnimator(null);
        setLayoutAnimation(null);
        ig.a0 a0Var = new ig.a0(3);
        this.g3 = a0Var;
        setPadding(0, 0, 0, 0);
        setClipToPadding(false);
        a0Var.k1(0);
        setLayoutManager(a0Var);
        qa qaVar = new qa(this, context);
        this.k3 = qaVar;
        setAdapter(qaVar);
        setOnItemClickListener(new am0() { // from class: org.telegram.ui.Cells.ma
            @Override // org.telegram.ui.Components.am0
            public final void c(int i11, View view) {
                ra raVar = ra.this;
                raVar.getClass();
                raVar.E1(((ThemesHorizontalListCell$InnerThemeView) view).b, view);
                int left = view.getLeft();
                int right = view.getRight();
                if (left < 0) {
                    raVar.w0(left - AndroidUtilities.dp(8.0f), 0, null);
                } else if (right > raVar.getMeasuredWidth()) {
                    raVar.w0(right - raVar.getMeasuredWidth(), 0, null);
                }
            }
        });
        setOnItemLongClickListener(new na(this, 0));
    }

    public final void C1(org.telegram.ui.ActionBar.x6 x6Var) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                if (themesHorizontalListCell$InnerThemeView.b == x6Var && themesHorizontalListCell$InnerThemeView.c()) {
                    themesHorizontalListCell$InnerThemeView.b.U = true;
                    themesHorizontalListCell$InnerThemeView.a();
                }
            }
        }
    }

    public final void D1(int i10) {
        View view;
        if (i10 == 0 && (view = (View) getParent()) != null) {
            i10 = view.getMeasuredWidth();
        }
        if (i10 == 0) {
            return;
        }
        org.telegram.ui.ActionBar.x6 C0 = this.n3 == 1 ? org.telegram.ui.ActionBar.y6.J : org.telegram.ui.ActionBar.y6.C0();
        this.j3 = C0;
        ArrayList arrayList = this.m3;
        int indexOf = arrayList.indexOf(C0);
        if (indexOf >= 0 || (indexOf = this.l3.indexOf(this.j3) + arrayList.size()) >= 0) {
            this.g3.h1(indexOf, (i10 - AndroidUtilities.dp(76.0f)) / 2);
        }
    }

    public final void E1(org.telegram.ui.ActionBar.x6 x6Var, View view) {
        TLRPC.TL_theme tL_theme = x6Var.F;
        if (tL_theme != null) {
            if (!x6Var.U) {
                return;
            }
            if (tL_theme.document == null) {
                org.telegram.ui.ActionBar.r2 r2Var = this.p3;
                if (r2Var != null) {
                    r2Var.presentFragment(new ad1(x6Var, null, true));
                    return;
                }
                return;
            }
        }
        if (!TextUtils.isEmpty(x6Var.d)) {
            org.telegram.ui.ActionBar.t6.a(false);
        }
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
        edit.putString((this.n3 == 1 || x6Var.q()) ? "lastDarkTheme" : "lastDayTheme", x6Var.m());
        edit.commit();
        if (this.n3 == 1) {
            if (x6Var == org.telegram.ui.ActionBar.y6.J) {
                return;
            }
            boolean z10 = org.telegram.ui.ActionBar.y6.I == org.telegram.ui.ActionBar.y6.J;
            org.telegram.ui.ActionBar.y6.J = x6Var;
            if (z10) {
                org.telegram.ui.ActionBar.y6.l(true);
            }
        } else if (x6Var == org.telegram.ui.ActionBar.y6.C0()) {
            return;
        } else {
            org.telegram.ui.ActionBar.y6.H1(x6Var, false, -1, view);
        }
        G1();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                themesHorizontalListCell$InnerThemeView.a.a(themesHorizontalListCell$InnerThemeView.b == (themesHorizontalListCell$InnerThemeView.a0.n3 == 1 ? org.telegram.ui.ActionBar.y6.J : org.telegram.ui.ActionBar.y6.C0()), true);
            }
        }
        org.telegram.ui.ActionBar.h4.p(x6Var, x6Var.Y);
        if (this.n3 != 1) {
            org.telegram.ui.ActionBar.y6.J1(this.p3);
        }
    }

    public abstract void G1();

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.fileLoaded) {
            if (i10 == NotificationCenter.fileLoadFailed) {
                this.h3.remove((String) objArr[0]);
                return;
            }
            return;
        }
        String str = (String) objArr[0];
        File file = (File) objArr[1];
        org.telegram.ui.ActionBar.x6 x6Var = (org.telegram.ui.ActionBar.x6) this.h3.get(str);
        if (x6Var != null) {
            this.h3.remove(str);
            if (this.i3.remove(x6Var) != null) {
                Utilities.globalQueue.postRunnable(new jg.f1(this, x6Var, file, 26));
            } else {
                C1(x6Var);
            }
        }
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i10 = 0; i10 < 4; i10++) {
            NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.fileLoadFailed);
        }
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        for (int i10 = 0; i10 < 4; i10++) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileLoadFailed);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f3) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.y6.k0);
        }
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
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
        this.f3 = z10;
    }

    public void F1(org.telegram.ui.ActionBar.x6 x6Var) {
    }
}
