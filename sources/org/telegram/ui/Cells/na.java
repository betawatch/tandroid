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
import org.telegram.ui.Components.mm0;
import org.telegram.ui.uc1;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public abstract class na extends mm0 implements NotificationCenter.NotificationCenterDelegate {
    public static final byte[] j3 = new byte[1024];
    public boolean Y2;
    public final hg.a0 Z2;
    public final HashMap a3;
    public final HashMap b3;
    public org.telegram.ui.ActionBar.j6 c3;
    public final ma d3;
    public final ArrayList e3;
    public final ArrayList f3;
    public final int g3;
    public int h3;
    public final org.telegram.ui.ActionBar.o2 i3;

    public na(Context context, org.telegram.ui.ActionBar.o2 o2Var, int i10, ArrayList arrayList, ArrayList arrayList2) {
        super(context, null);
        this.a3 = new HashMap();
        this.b3 = new HashMap();
        this.e3 = arrayList2;
        this.f3 = arrayList;
        this.g3 = i10;
        this.i3 = o2Var;
        if (i10 == 2) {
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, this, null);
        } else {
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this, null);
        }
        setItemAnimator(null);
        setLayoutAnimation(null);
        hg.a0 a0Var = new hg.a0(3);
        this.Z2 = a0Var;
        setPadding(0, 0, 0, 0);
        setClipToPadding(false);
        a0Var.j1(0);
        setLayoutManager(a0Var);
        ma maVar = new ma(this, context);
        this.d3 = maVar;
        setAdapter(maVar);
        setOnItemClickListener(new am0() { // from class: org.telegram.ui.Cells.ia
            @Override // org.telegram.ui.Components.am0
            public final void d(int i11, View view) {
                na naVar = na.this;
                naVar.getClass();
                naVar.E1(((ThemesHorizontalListCell$InnerThemeView) view).b, view);
                int left = view.getLeft();
                int right = view.getRight();
                if (left < 0) {
                    naVar.v0(left - AndroidUtilities.dp(8.0f), 0, null);
                } else if (right > naVar.getMeasuredWidth()) {
                    naVar.v0(right - naVar.getMeasuredWidth(), 0, null);
                }
            }
        });
        setOnItemLongClickListener(new ja(this, 0));
    }

    public final void C1(org.telegram.ui.ActionBar.j6 j6Var) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                if (themesHorizontalListCell$InnerThemeView.b == j6Var && themesHorizontalListCell$InnerThemeView.c()) {
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
        org.telegram.ui.ActionBar.j6 C0 = this.g3 == 1 ? org.telegram.ui.ActionBar.k6.J : org.telegram.ui.ActionBar.k6.C0();
        this.c3 = C0;
        ArrayList arrayList = this.f3;
        int indexOf = arrayList.indexOf(C0);
        if (indexOf >= 0 || (indexOf = this.e3.indexOf(this.c3) + arrayList.size()) >= 0) {
            this.Z2.h1(indexOf, (i10 - AndroidUtilities.dp(76.0f)) / 2);
        }
    }

    public final void E1(org.telegram.ui.ActionBar.j6 j6Var, View view) {
        TLRPC.TL_theme tL_theme = j6Var.F;
        if (tL_theme != null) {
            if (!j6Var.U) {
                return;
            }
            if (tL_theme.document == null) {
                org.telegram.ui.ActionBar.o2 o2Var = this.i3;
                if (o2Var != null) {
                    o2Var.presentFragment(new uc1(j6Var, null, true));
                    return;
                }
                return;
            }
        }
        if (!TextUtils.isEmpty(j6Var.d)) {
            org.telegram.ui.ActionBar.f6.a(false);
        }
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
        edit.putString((this.g3 == 1 || j6Var.q()) ? "lastDarkTheme" : "lastDayTheme", j6Var.m());
        edit.commit();
        if (this.g3 == 1) {
            if (j6Var == org.telegram.ui.ActionBar.k6.J) {
                return;
            }
            boolean z10 = org.telegram.ui.ActionBar.k6.I == org.telegram.ui.ActionBar.k6.J;
            org.telegram.ui.ActionBar.k6.J = j6Var;
            if (z10) {
                org.telegram.ui.ActionBar.k6.l(true);
            }
        } else if (j6Var == org.telegram.ui.ActionBar.k6.C0()) {
            return;
        } else {
            org.telegram.ui.ActionBar.k6.H1(j6Var, false, -1, view);
        }
        G1();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                themesHorizontalListCell$InnerThemeView.a.a(themesHorizontalListCell$InnerThemeView.b == (themesHorizontalListCell$InnerThemeView.a0.g3 == 1 ? org.telegram.ui.ActionBar.k6.J : org.telegram.ui.ActionBar.k6.C0()), true);
            }
        }
        org.telegram.ui.ActionBar.f4.p(j6Var, j6Var.Y);
        if (this.g3 != 1) {
            org.telegram.ui.ActionBar.k6.J1(this.i3);
        }
    }

    public abstract void G1();

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.fileLoaded) {
            if (i10 == NotificationCenter.fileLoadFailed) {
                this.a3.remove((String) objArr[0]);
                return;
            }
            return;
        }
        String str = (String) objArr[0];
        File file = (File) objArr[1];
        org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) this.a3.get(str);
        if (j6Var != null) {
            this.a3.remove(str);
            if (this.b3.remove(j6Var) != null) {
                Utilities.globalQueue.postRunnable(new ig.d2(this, j6Var, file, 25));
            } else {
                C1(j6Var);
            }
        }
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i10 = 0; i10 < 4; i10++) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoadFailed);
        }
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
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
        if (this.Y2) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
        }
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
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
        this.Y2 = z10;
    }

    public void F1(org.telegram.ui.ActionBar.j6 j6Var) {
    }
}
