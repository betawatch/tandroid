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
import org.telegram.ui.he1;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public abstract class na extends mm0 implements NotificationCenter.NotificationCenterDelegate {
    public static final byte[] g3 = new byte[1024];
    public boolean V2;
    public final hg.a0 W2;
    public final HashMap X2;
    public final HashMap Y2;
    public org.telegram.ui.ActionBar.f6 Z2;
    public final ma a3;
    public final ArrayList b3;
    public final ArrayList c3;
    public final int d3;
    public int e3;
    public final org.telegram.ui.ActionBar.m2 f3;

    public na(Context context, org.telegram.ui.ActionBar.m2 m2Var, int i10, ArrayList arrayList, ArrayList arrayList2) {
        super(context, null);
        this.X2 = new HashMap();
        this.Y2 = new HashMap();
        this.b3 = arrayList2;
        this.c3 = arrayList;
        this.d3 = i10;
        this.f3 = m2Var;
        if (i10 == 2) {
            setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.h5, false));
        } else {
            setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
        }
        setItemAnimator(null);
        setLayoutAnimation(null);
        hg.a0 a0Var = new hg.a0(3);
        this.W2 = a0Var;
        setPadding(0, 0, 0, 0);
        setClipToPadding(false);
        a0Var.j1(0);
        setLayoutManager(a0Var);
        ma maVar = new ma(this, context);
        this.a3 = maVar;
        setAdapter(maVar);
        setOnItemClickListener(new am0() { // from class: org.telegram.ui.Cells.ia
            @Override // org.telegram.ui.Components.am0
            public final void a(int i11, View view) {
                na naVar = na.this;
                naVar.getClass();
                naVar.z1(((ThemesHorizontalListCell$InnerThemeView) view).b);
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

    public abstract void B1();

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.fileLoaded) {
            if (i10 == NotificationCenter.fileLoadFailed) {
                this.X2.remove((String) objArr[0]);
                return;
            }
            return;
        }
        String str = (String) objArr[0];
        File file = (File) objArr[1];
        org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.X2.get(str);
        if (f6Var != null) {
            this.X2.remove(str);
            if (this.Y2.remove(f6Var) != null) {
                Utilities.globalQueue.postRunnable(new n2.h(this, f6Var, file, 13));
            } else {
                x1(f6Var);
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
        if (this.V2) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.k0);
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
        f1();
    }

    public void setDrawDivider(boolean z10) {
        this.V2 = z10;
    }

    public final void x1(org.telegram.ui.ActionBar.f6 f6Var) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                if (themesHorizontalListCell$InnerThemeView.b == f6Var && themesHorizontalListCell$InnerThemeView.c()) {
                    themesHorizontalListCell$InnerThemeView.b.U = true;
                    themesHorizontalListCell$InnerThemeView.a();
                }
            }
        }
    }

    public final void y1(int i10) {
        View view;
        if (i10 == 0 && (view = (View) getParent()) != null) {
            i10 = view.getMeasuredWidth();
        }
        if (i10 == 0) {
            return;
        }
        org.telegram.ui.ActionBar.f6 B0 = this.d3 == 1 ? org.telegram.ui.ActionBar.g6.J : org.telegram.ui.ActionBar.g6.B0();
        this.Z2 = B0;
        ArrayList arrayList = this.c3;
        int indexOf = arrayList.indexOf(B0);
        if (indexOf >= 0 || (indexOf = this.b3.indexOf(this.Z2) + arrayList.size()) >= 0) {
            this.W2.h1(indexOf, (i10 - AndroidUtilities.dp(76.0f)) / 2);
        }
    }

    public final void z1(org.telegram.ui.ActionBar.f6 f6Var) {
        TLRPC.TL_theme tL_theme = f6Var.F;
        if (tL_theme != null) {
            if (!f6Var.U) {
                return;
            }
            if (tL_theme.document == null) {
                org.telegram.ui.ActionBar.m2 m2Var = this.f3;
                if (m2Var != null) {
                    m2Var.presentFragment(new he1(f6Var, null, true));
                    return;
                }
                return;
            }
        }
        if (!TextUtils.isEmpty(f6Var.d)) {
            org.telegram.ui.ActionBar.b6.a(false);
        }
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
        edit.putString((this.d3 == 1 || f6Var.q()) ? "lastDarkTheme" : "lastDayTheme", f6Var.m());
        edit.commit();
        if (this.d3 == 1) {
            if (f6Var == org.telegram.ui.ActionBar.g6.J) {
                return;
            }
            boolean z10 = org.telegram.ui.ActionBar.g6.I == org.telegram.ui.ActionBar.g6.J;
            org.telegram.ui.ActionBar.g6.J = f6Var;
            if (z10) {
                org.telegram.ui.ActionBar.g6.l(true);
            }
        } else if (f6Var == org.telegram.ui.ActionBar.g6.B0()) {
            return;
        } else {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, f6Var, Boolean.FALSE, null, -1);
        }
        B1();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                themesHorizontalListCell$InnerThemeView.a.a(themesHorizontalListCell$InnerThemeView.b == (themesHorizontalListCell$InnerThemeView.a0.d3 == 1 ? org.telegram.ui.ActionBar.g6.J : org.telegram.ui.ActionBar.g6.B0()), true);
            }
        }
        org.telegram.ui.ActionBar.b4.q(f6Var, f6Var.Y);
        if (this.d3 != 1) {
            org.telegram.ui.ActionBar.g6.G1(this.f3);
        }
    }

    public void A1(org.telegram.ui.ActionBar.f6 f6Var) {
    }
}
