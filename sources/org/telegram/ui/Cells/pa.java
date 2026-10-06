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
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.ud1;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public abstract class pa extends zl0 implements NotificationCenter.NotificationCenterDelegate {
    public static final byte[] p3 = new byte[1024];
    public boolean e3;
    public final gg.b0 f3;
    public final HashMap g3;
    public final HashMap h3;
    public org.telegram.ui.ActionBar.h6 i3;
    public final oa j3;
    public final ArrayList k3;
    public final ArrayList l3;
    public final int m3;
    public int n3;
    public final org.telegram.ui.ActionBar.n2 o3;

    public pa(Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10, ArrayList arrayList, ArrayList arrayList2) {
        super(context, null);
        this.g3 = new HashMap();
        this.h3 = new HashMap();
        this.k3 = arrayList2;
        this.l3 = arrayList;
        this.m3 = i10;
        this.o3 = n2Var;
        if (i10 == 2) {
            setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.h5, false));
        } else {
            setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.d6, false));
        }
        setItemAnimator(null);
        setLayoutAnimation(null);
        gg.b0 b0Var = new gg.b0(3);
        this.f3 = b0Var;
        setPadding(0, 0, 0, 0);
        setClipToPadding(false);
        b0Var.j1(0);
        setLayoutManager(b0Var);
        oa oaVar = new oa(this, context);
        this.j3 = oaVar;
        setAdapter(oaVar);
        setOnItemClickListener(new ml0() { // from class: org.telegram.ui.Cells.ka
            @Override // org.telegram.ui.Components.ml0
            public final void d(int i11, View view) {
                pa paVar = pa.this;
                paVar.getClass();
                paVar.z1(((ThemesHorizontalListCell$InnerThemeView) view).b);
                int left = view.getLeft();
                int right = view.getRight();
                if (left < 0) {
                    paVar.w0(left - AndroidUtilities.dp(8.0f), 0, null);
                } else if (right > paVar.getMeasuredWidth()) {
                    paVar.w0(right - paVar.getMeasuredWidth(), 0, null);
                }
            }
        });
        setOnItemLongClickListener(new la(this, 0));
    }

    public abstract void B1();

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.fileLoaded) {
            if (i10 == NotificationCenter.fileLoadFailed) {
                this.g3.remove((String) objArr[0]);
                return;
            }
            return;
        }
        String str = (String) objArr[0];
        File file = (File) objArr[1];
        org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.g3.get(str);
        if (h6Var != null) {
            this.g3.remove(str);
            if (this.h3.remove(h6Var) != null) {
                Utilities.globalQueue.postRunnable(new org.telegram.messenger.video.o(this, h6Var, file, 8));
            } else {
                x1(h6Var);
            }
        }
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i10 = 0; i10 < 4; i10++) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoadFailed);
        }
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
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
        if (this.e3) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.i6.k0);
        }
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
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
        this.e3 = z10;
    }

    public final void x1(org.telegram.ui.ActionBar.h6 h6Var) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                if (themesHorizontalListCell$InnerThemeView.b == h6Var && themesHorizontalListCell$InnerThemeView.c()) {
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
        org.telegram.ui.ActionBar.h6 A0 = this.m3 == 1 ? org.telegram.ui.ActionBar.i6.J : org.telegram.ui.ActionBar.i6.A0();
        this.i3 = A0;
        ArrayList arrayList = this.l3;
        int indexOf = arrayList.indexOf(A0);
        if (indexOf >= 0 || (indexOf = this.k3.indexOf(this.i3) + arrayList.size()) >= 0) {
            this.f3.h1(indexOf, (i10 - AndroidUtilities.dp(76.0f)) / 2);
        }
    }

    public final void z1(org.telegram.ui.ActionBar.h6 h6Var) {
        TLRPC.TL_theme tL_theme = h6Var.F;
        if (tL_theme != null) {
            if (!h6Var.U) {
                return;
            }
            if (tL_theme.document == null) {
                org.telegram.ui.ActionBar.n2 n2Var = this.o3;
                if (n2Var != null) {
                    n2Var.presentFragment(new ud1(h6Var, null, true));
                    return;
                }
                return;
            }
        }
        if (!TextUtils.isEmpty(h6Var.d)) {
            org.telegram.ui.ActionBar.c6.a(false);
        }
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
        edit.putString((this.m3 == 1 || h6Var.q()) ? "lastDarkTheme" : "lastDayTheme", h6Var.m());
        edit.commit();
        if (this.m3 == 1) {
            if (h6Var == org.telegram.ui.ActionBar.i6.J) {
                return;
            }
            boolean z10 = org.telegram.ui.ActionBar.i6.I == org.telegram.ui.ActionBar.i6.J;
            org.telegram.ui.ActionBar.i6.J = h6Var;
            if (z10) {
                org.telegram.ui.ActionBar.i6.l(true);
            }
        } else if (h6Var == org.telegram.ui.ActionBar.i6.A0()) {
            return;
        } else {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, h6Var, Boolean.FALSE, null, -1);
        }
        B1();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                themesHorizontalListCell$InnerThemeView.a.a(themesHorizontalListCell$InnerThemeView.b == (themesHorizontalListCell$InnerThemeView.a0.m3 == 1 ? org.telegram.ui.ActionBar.i6.J : org.telegram.ui.ActionBar.i6.A0()), true);
            }
        }
        org.telegram.ui.ActionBar.c4.q(h6Var, h6Var.Y);
        if (this.m3 != 1) {
            org.telegram.ui.ActionBar.i6.F1(this.o3);
        }
    }

    public void A1(org.telegram.ui.ActionBar.h6 h6Var) {
    }
}
