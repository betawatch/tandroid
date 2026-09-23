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
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.td1;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public abstract class ra extends ml0 implements NotificationCenter.NotificationCenterDelegate {
    public static final byte[] i3 = new byte[1024];
    public boolean X2;
    public final gg.b0 Y2;
    public final HashMap Z2;
    public final HashMap a3;
    public org.telegram.ui.ActionBar.g6 b3;
    public final qa c3;
    public final ArrayList d3;
    public final ArrayList e3;
    public final int f3;
    public int g3;
    public final org.telegram.ui.ActionBar.n2 h3;

    public ra(Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10, ArrayList arrayList, ArrayList arrayList2) {
        super(context, null);
        this.Z2 = new HashMap();
        this.a3 = new HashMap();
        this.d3 = arrayList2;
        this.e3 = arrayList;
        this.f3 = i10;
        this.h3 = n2Var;
        if (i10 == 2) {
            setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.h5, false));
        } else {
            setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
        }
        setItemAnimator(null);
        setLayoutAnimation(null);
        gg.b0 b0Var = new gg.b0(3);
        this.Y2 = b0Var;
        setPadding(0, 0, 0, 0);
        setClipToPadding(false);
        b0Var.j1(0);
        setLayoutManager(b0Var);
        qa qaVar = new qa(this, context);
        this.c3 = qaVar;
        setAdapter(qaVar);
        setOnItemClickListener(new al0() { // from class: org.telegram.ui.Cells.ma
            @Override // org.telegram.ui.Components.al0
            public final void d(int i11, View view) {
                ra raVar = ra.this;
                raVar.getClass();
                raVar.y1(((ThemesHorizontalListCell$InnerThemeView) view).b);
                int left = view.getLeft();
                int right = view.getRight();
                if (left < 0) {
                    raVar.v0(left - AndroidUtilities.dp(8.0f), 0, null);
                } else if (right > raVar.getMeasuredWidth()) {
                    raVar.v0(right - raVar.getMeasuredWidth(), 0, null);
                }
            }
        });
        setOnItemLongClickListener(new na(this, 0));
    }

    public abstract void A1();

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.fileLoaded) {
            if (i10 == NotificationCenter.fileLoadFailed) {
                this.Z2.remove((String) objArr[0]);
                return;
            }
            return;
        }
        String str = (String) objArr[0];
        File file = (File) objArr[1];
        org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.Z2.get(str);
        if (g6Var != null) {
            this.Z2.remove(str);
            if (this.a3.remove(g6Var) != null) {
                Utilities.globalQueue.postRunnable(new org.telegram.ui.ActionBar.p(this, g6Var, file, 5));
            } else {
                w1(g6Var);
            }
        }
    }

    @Override // org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i10 = 0; i10 < 4; i10++) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoadFailed);
        }
    }

    @Override // org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
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
        if (this.X2) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.h6.k0);
        }
    }

    @Override // org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getParent() != null && getParent().getParent() != null) {
            getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        super.setBackgroundColor(i10);
        f1();
    }

    public void setDrawDivider(boolean z10) {
        this.X2 = z10;
    }

    public final void w1(org.telegram.ui.ActionBar.g6 g6Var) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                if (themesHorizontalListCell$InnerThemeView.b == g6Var && themesHorizontalListCell$InnerThemeView.c()) {
                    themesHorizontalListCell$InnerThemeView.b.U = true;
                    themesHorizontalListCell$InnerThemeView.a();
                }
            }
        }
    }

    public final void x1(int i10) {
        View view;
        if (i10 == 0 && (view = (View) getParent()) != null) {
            i10 = view.getMeasuredWidth();
        }
        if (i10 == 0) {
            return;
        }
        org.telegram.ui.ActionBar.g6 A0 = this.f3 == 1 ? org.telegram.ui.ActionBar.h6.J : org.telegram.ui.ActionBar.h6.A0();
        this.b3 = A0;
        ArrayList arrayList = this.e3;
        int indexOf = arrayList.indexOf(A0);
        if (indexOf >= 0 || (indexOf = this.d3.indexOf(this.b3) + arrayList.size()) >= 0) {
            this.Y2.h1(indexOf, (i10 - AndroidUtilities.dp(76.0f)) / 2);
        }
    }

    public final void y1(org.telegram.ui.ActionBar.g6 g6Var) {
        TLRPC.TL_theme tL_theme = g6Var.F;
        if (tL_theme != null) {
            if (!g6Var.U) {
                return;
            }
            if (tL_theme.document == null) {
                org.telegram.ui.ActionBar.n2 n2Var = this.h3;
                if (n2Var != null) {
                    n2Var.presentFragment(new td1(g6Var, null, true));
                    return;
                }
                return;
            }
        }
        if (!TextUtils.isEmpty(g6Var.d)) {
            org.telegram.ui.ActionBar.c6.a(false);
        }
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
        edit.putString((this.f3 == 1 || g6Var.q()) ? "lastDarkTheme" : "lastDayTheme", g6Var.m());
        edit.commit();
        if (this.f3 == 1) {
            if (g6Var == org.telegram.ui.ActionBar.h6.J) {
                return;
            }
            boolean z10 = org.telegram.ui.ActionBar.h6.I == org.telegram.ui.ActionBar.h6.J;
            org.telegram.ui.ActionBar.h6.J = g6Var;
            if (z10) {
                org.telegram.ui.ActionBar.h6.l(true);
            }
        } else if (g6Var == org.telegram.ui.ActionBar.h6.A0()) {
            return;
        } else {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, g6Var, Boolean.FALSE, null, -1);
        }
        A1();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                themesHorizontalListCell$InnerThemeView.a.a(themesHorizontalListCell$InnerThemeView.b == (themesHorizontalListCell$InnerThemeView.a0.f3 == 1 ? org.telegram.ui.ActionBar.h6.J : org.telegram.ui.ActionBar.h6.A0()), true);
            }
        }
        org.telegram.ui.ActionBar.c4.q(g6Var, g6Var.Y);
        if (this.f3 != 1) {
            org.telegram.ui.ActionBar.h6.F1(this.h3);
        }
    }

    public void z1(org.telegram.ui.ActionBar.g6 g6Var) {
    }
}
