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
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.tc1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class ia extends zk0 implements NotificationCenter.NotificationCenterDelegate {
    public static final byte[] e3 = new byte[1024];
    public boolean T2;
    public final org.telegram.ui.j U2;
    public final HashMap V2;
    public final HashMap W2;
    public org.telegram.ui.ActionBar.f6 X2;
    public final ha Y2;
    public final ArrayList Z2;
    public final ArrayList a3;
    public final int b3;
    public int c3;
    public final org.telegram.ui.ActionBar.n2 d3;

    public ia(Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10, ArrayList arrayList, ArrayList arrayList2) {
        super(context, null);
        this.V2 = new HashMap();
        this.W2 = new HashMap();
        this.Z2 = arrayList2;
        this.a3 = arrayList;
        this.b3 = i10;
        this.d3 = n2Var;
        if (i10 == 2) {
            setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.h5, false));
        } else {
            setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
        }
        setItemAnimator(null);
        setLayoutAnimation(null);
        org.telegram.ui.j jVar = new org.telegram.ui.j(1);
        this.U2 = jVar;
        setPadding(0, 0, 0, 0);
        setClipToPadding(false);
        jVar.j1(0);
        setLayoutManager(jVar);
        ha haVar = new ha(this, context);
        this.Y2 = haVar;
        setAdapter(haVar);
        setOnItemClickListener(new pk0() { // from class: org.telegram.ui.Cells.da
            @Override // org.telegram.ui.Components.pk0
            public final void a(int i11, View view) {
                ia iaVar = ia.this;
                iaVar.getClass();
                iaVar.y1(((ThemesHorizontalListCell$InnerThemeView) view).b);
                int left = view.getLeft();
                int right = view.getRight();
                if (left < 0) {
                    iaVar.v0(left - AndroidUtilities.dp(8.0f), 0, null);
                } else if (right > iaVar.getMeasuredWidth()) {
                    iaVar.v0(right - iaVar.getMeasuredWidth(), 0, null);
                }
            }
        });
        setOnItemLongClickListener(new ea(this, 0));
    }

    public abstract void A1();

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.fileLoaded) {
            if (i10 == NotificationCenter.fileLoadFailed) {
                this.V2.remove((String) objArr[0]);
                return;
            }
            return;
        }
        String str = (String) objArr[0];
        File file = (File) objArr[1];
        org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.V2.get(str);
        if (f6Var != null) {
            this.V2.remove(str);
            if (this.W2.remove(f6Var) != null) {
                Utilities.globalQueue.postRunnable(new org.telegram.ui.ActionBar.i3(this, f6Var, file, 4));
            } else {
                w1(f6Var);
            }
        }
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i10 = 0; i10 < 4; i10++) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoadFailed);
        }
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
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
        if (this.T2) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.k0);
        }
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
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
        this.T2 = z10;
    }

    public final void w1(org.telegram.ui.ActionBar.f6 f6Var) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                if (themesHorizontalListCell$InnerThemeView.b == f6Var && themesHorizontalListCell$InnerThemeView.c()) {
                    themesHorizontalListCell$InnerThemeView.b.Q = true;
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
        org.telegram.ui.ActionBar.f6 A0 = this.b3 == 1 ? org.telegram.ui.ActionBar.g6.J : org.telegram.ui.ActionBar.g6.A0();
        this.X2 = A0;
        ArrayList arrayList = this.a3;
        int indexOf = arrayList.indexOf(A0);
        if (indexOf >= 0 || (indexOf = this.Z2.indexOf(this.X2) + arrayList.size()) >= 0) {
            this.U2.h1(indexOf, (i10 - AndroidUtilities.dp(76.0f)) / 2);
        }
    }

    public final void y1(org.telegram.ui.ActionBar.f6 f6Var) {
        TLRPC.TL_theme tL_theme = f6Var.B;
        if (tL_theme != null) {
            if (!f6Var.Q) {
                return;
            }
            if (tL_theme.document == null) {
                org.telegram.ui.ActionBar.n2 n2Var = this.d3;
                if (n2Var != null) {
                    n2Var.presentFragment(new tc1(f6Var, null, true));
                    return;
                }
                return;
            }
        }
        if (!TextUtils.isEmpty(f6Var.d)) {
            org.telegram.ui.ActionBar.b6.a(false);
        }
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
        edit.putString((this.b3 == 1 || f6Var.q()) ? "lastDarkTheme" : "lastDayTheme", f6Var.m());
        edit.commit();
        if (this.b3 == 1) {
            if (f6Var == org.telegram.ui.ActionBar.g6.J) {
                return;
            }
            boolean z10 = org.telegram.ui.ActionBar.g6.I == org.telegram.ui.ActionBar.g6.J;
            org.telegram.ui.ActionBar.g6.J = f6Var;
            if (z10) {
                org.telegram.ui.ActionBar.g6.l(true);
            }
        } else if (f6Var == org.telegram.ui.ActionBar.g6.A0()) {
            return;
        } else {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, f6Var, Boolean.FALSE, null, -1);
        }
        A1();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                themesHorizontalListCell$InnerThemeView.a.a(themesHorizontalListCell$InnerThemeView.b == (themesHorizontalListCell$InnerThemeView.T.b3 == 1 ? org.telegram.ui.ActionBar.g6.J : org.telegram.ui.ActionBar.g6.A0()), true);
            }
        }
        org.telegram.ui.ActionBar.b4.q(f6Var, f6Var.U);
        if (this.b3 != 1) {
            org.telegram.ui.ActionBar.g6.F1(this.d3);
        }
    }

    public void z1(org.telegram.ui.ActionBar.f6 f6Var) {
    }
}
