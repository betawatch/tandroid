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
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.od1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public abstract class la extends sl0 implements NotificationCenter.NotificationCenterDelegate {
    public static final byte[] f3 = new byte[1024];
    public boolean U2;
    public final org.telegram.ui.k V2;
    public final HashMap W2;
    public final HashMap X2;
    public org.telegram.ui.ActionBar.j6 Y2;
    public final ka Z2;
    public final ArrayList a3;
    public final ArrayList b3;
    public final int c3;
    public int d3;
    public final org.telegram.ui.ActionBar.p2 e3;

    public la(Context context, org.telegram.ui.ActionBar.p2 p2Var, int i10, ArrayList arrayList, ArrayList arrayList2) {
        super(context, null);
        this.W2 = new HashMap();
        this.X2 = new HashMap();
        this.a3 = arrayList2;
        this.b3 = arrayList;
        this.c3 = i10;
        this.e3 = p2Var;
        if (i10 == 2) {
            setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.h5, false));
        } else {
            setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
        }
        setItemAnimator(null);
        setLayoutAnimation(null);
        org.telegram.ui.k kVar = new org.telegram.ui.k(1);
        this.V2 = kVar;
        setPadding(0, 0, 0, 0);
        setClipToPadding(false);
        kVar.j1(0);
        setLayoutManager(kVar);
        ka kaVar = new ka(this, context);
        this.Z2 = kaVar;
        setAdapter(kaVar);
        setOnItemClickListener(new il0() { // from class: org.telegram.ui.Cells.ga
            @Override // org.telegram.ui.Components.il0
            public final void f(int i11, View view) {
                la laVar = la.this;
                laVar.getClass();
                laVar.x1(((ThemesHorizontalListCell$InnerThemeView) view).b);
                int left = view.getLeft();
                int right = view.getRight();
                if (left < 0) {
                    laVar.v0(left - AndroidUtilities.dp(8.0f), 0, null);
                } else if (right > laVar.getMeasuredWidth()) {
                    laVar.v0(right - laVar.getMeasuredWidth(), 0, null);
                }
            }
        });
        setOnItemLongClickListener(new ha(this, 0));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.fileLoaded) {
            if (i10 == NotificationCenter.fileLoadFailed) {
                this.W2.remove((String) objArr[0]);
                return;
            }
            return;
        }
        String str = (String) objArr[0];
        File file = (File) objArr[1];
        org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) this.W2.get(str);
        if (j6Var != null) {
            this.W2.remove(str);
            if (this.X2.remove(j6Var) != null) {
                Utilities.globalQueue.postRunnable(new mh.p6(this, j6Var, file, 22));
            } else {
                v1(j6Var);
            }
        }
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i10 = 0; i10 < 4; i10++) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoadFailed);
        }
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
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
        if (this.U2) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
        }
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getParent() != null && getParent().getParent() != null) {
            getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        super.setBackgroundColor(i10);
        e1();
    }

    public void setDrawDivider(boolean z4) {
        this.U2 = z4;
    }

    public final void v1(org.telegram.ui.ActionBar.j6 j6Var) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                if (themesHorizontalListCell$InnerThemeView.b == j6Var && themesHorizontalListCell$InnerThemeView.c()) {
                    themesHorizontalListCell$InnerThemeView.b.R = true;
                    themesHorizontalListCell$InnerThemeView.a();
                }
            }
        }
    }

    public final void w1(int i10) {
        View view;
        if (i10 == 0 && (view = (View) getParent()) != null) {
            i10 = view.getMeasuredWidth();
        }
        if (i10 == 0) {
            return;
        }
        org.telegram.ui.ActionBar.j6 A0 = this.c3 == 1 ? org.telegram.ui.ActionBar.k6.J : org.telegram.ui.ActionBar.k6.A0();
        this.Y2 = A0;
        ArrayList arrayList = this.b3;
        int indexOf = arrayList.indexOf(A0);
        if (indexOf >= 0 || (indexOf = this.a3.indexOf(this.Y2) + arrayList.size()) >= 0) {
            this.V2.h1(indexOf, (i10 - AndroidUtilities.dp(76.0f)) / 2);
        }
    }

    public final void x1(org.telegram.ui.ActionBar.j6 j6Var) {
        TLRPC.TL_theme tL_theme = j6Var.C;
        if (tL_theme != null) {
            if (!j6Var.R) {
                return;
            }
            if (tL_theme.document == null) {
                org.telegram.ui.ActionBar.p2 p2Var = this.e3;
                if (p2Var != null) {
                    p2Var.presentFragment(new od1(j6Var, null, true));
                    return;
                }
                return;
            }
        }
        if (!TextUtils.isEmpty(j6Var.d)) {
            org.telegram.ui.ActionBar.f6.a(false);
        }
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
        edit.putString((this.c3 == 1 || j6Var.q()) ? "lastDarkTheme" : "lastDayTheme", j6Var.m());
        edit.commit();
        if (this.c3 == 1) {
            if (j6Var == org.telegram.ui.ActionBar.k6.J) {
                return;
            }
            boolean z4 = org.telegram.ui.ActionBar.k6.I == org.telegram.ui.ActionBar.k6.J;
            org.telegram.ui.ActionBar.k6.J = j6Var;
            if (z4) {
                org.telegram.ui.ActionBar.k6.l(true);
            }
        } else if (j6Var == org.telegram.ui.ActionBar.k6.A0()) {
            return;
        } else {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, j6Var, Boolean.FALSE, null, -1);
        }
        z1();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                themesHorizontalListCell$InnerThemeView.a.a(themesHorizontalListCell$InnerThemeView.b == (themesHorizontalListCell$InnerThemeView.U.c3 == 1 ? org.telegram.ui.ActionBar.k6.J : org.telegram.ui.ActionBar.k6.A0()), true);
            }
        }
        org.telegram.ui.ActionBar.f4.q(j6Var, j6Var.V);
        if (this.c3 != 1) {
            org.telegram.ui.ActionBar.k6.F1(this.e3);
        }
    }

    public abstract void z1();

    public void y1(org.telegram.ui.ActionBar.j6 j6Var) {
    }
}
