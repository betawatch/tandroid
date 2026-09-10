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
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.fe1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class ra extends vl0 implements NotificationCenter.NotificationCenterDelegate {
    public static final byte[] i3 = new byte[1024];
    public boolean X2;
    public final fg.a0 Y2;
    public final HashMap Z2;
    public final HashMap a3;
    public org.telegram.ui.ActionBar.i6 b3;
    public final qa c3;
    public final ArrayList d3;
    public final ArrayList e3;
    public final int f3;
    public int g3;
    public final org.telegram.ui.ActionBar.p2 h3;

    public ra(Context context, org.telegram.ui.ActionBar.p2 p2Var, int i10, ArrayList arrayList, ArrayList arrayList2) {
        super(context, null);
        this.Z2 = new HashMap();
        this.a3 = new HashMap();
        this.d3 = arrayList2;
        this.e3 = arrayList;
        this.f3 = i10;
        this.h3 = p2Var;
        if (i10 == 2) {
            setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false));
        } else {
            setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        }
        setItemAnimator(null);
        setLayoutAnimation(null);
        fg.a0 a0Var = new fg.a0(3);
        this.Y2 = a0Var;
        setPadding(0, 0, 0, 0);
        setClipToPadding(false);
        a0Var.j1(0);
        setLayoutManager(a0Var);
        qa qaVar = new qa(this, context);
        this.c3 = qaVar;
        setAdapter(qaVar);
        setOnItemClickListener(new jl0() { // from class: org.telegram.ui.Cells.ma
            @Override // org.telegram.ui.Components.jl0
            public final void d(int i11, View view) {
                ra raVar = ra.this;
                raVar.getClass();
                raVar.x1(((ThemesHorizontalListCell$InnerThemeView) view).b);
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
        org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.Z2.get(str);
        if (i6Var != null) {
            this.Z2.remove(str);
            if (this.a3.remove(i6Var) != null) {
                Utilities.globalQueue.postRunnable(new gg.a0(this, i6Var, file, 27));
            } else {
                v1(i6Var);
            }
        }
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i10 = 0; i10 < 4; i10++) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoadFailed);
        }
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
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
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.k0);
        }
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
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

    public void setDrawDivider(boolean z10) {
        this.X2 = z10;
    }

    public final void v1(org.telegram.ui.ActionBar.i6 i6Var) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                if (themesHorizontalListCell$InnerThemeView.b == i6Var && themesHorizontalListCell$InnerThemeView.c()) {
                    themesHorizontalListCell$InnerThemeView.b.U = true;
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
        org.telegram.ui.ActionBar.i6 A0 = this.f3 == 1 ? org.telegram.ui.ActionBar.j6.J : org.telegram.ui.ActionBar.j6.A0();
        this.b3 = A0;
        ArrayList arrayList = this.e3;
        int indexOf = arrayList.indexOf(A0);
        if (indexOf >= 0 || (indexOf = this.d3.indexOf(this.b3) + arrayList.size()) >= 0) {
            this.Y2.h1(indexOf, (i10 - AndroidUtilities.dp(76.0f)) / 2);
        }
    }

    public final void x1(org.telegram.ui.ActionBar.i6 i6Var) {
        TLRPC.TL_theme tL_theme = i6Var.F;
        if (tL_theme != null) {
            if (!i6Var.U) {
                return;
            }
            if (tL_theme.document == null) {
                org.telegram.ui.ActionBar.p2 p2Var = this.h3;
                if (p2Var != null) {
                    p2Var.presentFragment(new fe1(i6Var, null, true));
                    return;
                }
                return;
            }
        }
        if (!TextUtils.isEmpty(i6Var.d)) {
            org.telegram.ui.ActionBar.e6.a(false);
        }
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
        edit.putString((this.f3 == 1 || i6Var.q()) ? "lastDarkTheme" : "lastDayTheme", i6Var.m());
        edit.commit();
        if (this.f3 == 1) {
            if (i6Var == org.telegram.ui.ActionBar.j6.J) {
                return;
            }
            boolean z10 = org.telegram.ui.ActionBar.j6.I == org.telegram.ui.ActionBar.j6.J;
            org.telegram.ui.ActionBar.j6.J = i6Var;
            if (z10) {
                org.telegram.ui.ActionBar.j6.l(true);
            }
        } else if (i6Var == org.telegram.ui.ActionBar.j6.A0()) {
            return;
        } else {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, i6Var, Boolean.FALSE, null, -1);
        }
        z1();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                themesHorizontalListCell$InnerThemeView.a.a(themesHorizontalListCell$InnerThemeView.b == (themesHorizontalListCell$InnerThemeView.a0.f3 == 1 ? org.telegram.ui.ActionBar.j6.J : org.telegram.ui.ActionBar.j6.A0()), true);
            }
        }
        org.telegram.ui.ActionBar.f4.q(i6Var, i6Var.Y);
        if (this.f3 != 1) {
            org.telegram.ui.ActionBar.j6.F1(this.h3);
        }
    }

    public abstract void z1();

    public void y1(org.telegram.ui.ActionBar.i6 i6Var) {
    }
}
