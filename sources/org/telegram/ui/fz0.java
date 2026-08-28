package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RecordingCanvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class fz0 extends org.telegram.ui.Components.xu0 implements r0.n {
    public final d5.p s0;
    public final /* synthetic */ ProfileActivity t0;
    public boolean u0;
    public final Paint v0;
    public boolean w0;
    public final ArrayList x0;
    public final org.telegram.ui.Components.jn0 y0;
    public final /* synthetic */ ProfileActivity z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz0(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.z0 = profileActivity;
        this.t0 = profileActivity;
        this.s0 = new d5.p();
        this.v0 = new Paint();
        this.x0 = new ArrayList();
        this.y0 = new org.telegram.ui.Components.jn0(13);
    }

    @Override // r0.m
    public final void E(ViewGroup viewGroup, int i9, int i10, int[] iArr, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        int i12;
        org.telegram.ui.Components.wk0 currentListView;
        int L0;
        ProfileActivity profileActivity = this.t0;
        if (viewGroup == profileActivity.a) {
            if (profileActivity.F4 == -1 || !profileActivity.M) {
                return;
            }
            kVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
            boolean z10 = kVar.j0;
            int top = profileActivity.K.getTop();
            boolean z11 = false;
            if (i10 >= 0) {
                if (z10) {
                    org.telegram.ui.Components.wk0 currentListView2 = profileActivity.K.getCurrentListView();
                    iArr[1] = i10;
                    if (top > 0) {
                        iArr[1] = 0;
                    }
                    if (currentListView2 == null || (i12 = iArr[1]) <= 0) {
                        return;
                    }
                    currentListView2.scrollBy(0, i12);
                    return;
                }
                return;
            }
            if (top <= 0 && (currentListView = profileActivity.K.getCurrentListView()) != null && (L0 = ((f2.m0) currentListView.getLayoutManager()).L0()) != -1) {
                f2.q1 K = currentListView.K(L0);
                int top2 = K != null ? K.a.getTop() : -1;
                int paddingTop = currentListView.getPaddingTop();
                if (top2 != paddingTop || L0 != 0) {
                    iArr[1] = L0 != 0 ? i10 : Math.max(i10, top2 - paddingTop);
                    currentListView.scrollBy(0, i10);
                    z11 = true;
                }
            }
            if (z10) {
                if (z11 || top >= 0) {
                    iArr[1] = i10;
                } else {
                    iArr[1] = i10 - Math.max(top, i10);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.xu0
    public final void L(Canvas canvas, ArrayList arrayList) {
        canvas.save();
        ProfileActivity profileActivity = this.t0;
        canvas.translate(0.0f, profileActivity.a.getY());
        profileActivity.K.Q(canvas, arrayList);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.xu0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        ProfileActivity profileActivity = this.z0;
        org.telegram.ui.Components.p40 p40Var = profileActivity.t0;
        Paint paint = profileActivity.m2;
        ng.d dVar = profileActivity.j6;
        ig.e eVar = profileActivity.i6;
        Paint paint2 = profileActivity.u0;
        if (Build.VERSION.SDK_INT >= 31 && eVar != null) {
            ProfileActivity.A0(profileActivity);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (dVar != null && !dVar.n) {
                RecordingCanvas a2 = dVar.a(measuredWidth, measuredHeight);
                a2.drawColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.a7, profileActivity.v0));
                if (SharedConfig.chatBlurEnabled()) {
                    eVar.b(a2, -2);
                }
                dVar.b();
            }
        }
        int i9 = org.telegram.ui.ActionBar.f6.a7;
        paint.setColor(org.telegram.ui.ActionBar.f6.v0(i9, profileActivity.v0));
        if (profileActivity.a.getVisibility() == 0) {
            int v02 = org.telegram.ui.ActionBar.f6.v0(i9, profileActivity.v0);
            Paint paint3 = this.v0;
            paint3.setColor(v02);
            if (profileActivity.D1) {
                paint.setAlpha((int) (profileActivity.a.getAlpha() * 255.0f));
            }
            if (profileActivity.D1) {
                paint3.setAlpha((int) (profileActivity.a.getAlpha() * 255.0f));
            }
            int childCount = profileActivity.a.getChildCount();
            ArrayList arrayList = this.x0;
            arrayList.clear();
            boolean z10 = false;
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = profileActivity.a.getChildAt(i10);
                profileActivity.a.getClass();
                if (RecyclerView.R(childAt) != -1) {
                    arrayList.add(profileActivity.a.getChildAt(i10));
                } else {
                    z10 = true;
                }
            }
            Collections.sort(arrayList, this.y0);
            profileActivity.a.getY();
            int size = arrayList.size();
            if (!profileActivity.C1 && size > 0 && !z10) {
                ((View) arrayList.get(0)).getY();
            }
            boolean z11 = false;
            for (int i11 = 0; i11 < size; i11++) {
                View view = (View) arrayList.get(i11);
                boolean z12 = view.getBackground() != null;
                profileActivity.a.getY();
                view.getY();
                if (z11 == z12) {
                    view.getAlpha();
                } else {
                    view.getAlpha();
                    z11 = z12;
                }
            }
        }
        super.dispatchDraw(canvas);
        if (p40Var.getAlpha() > 0) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), profileActivity.t0);
        }
        if (profileActivity.s0 != null) {
            int save = canvas.save();
            canvas.translate(profileActivity.s0.getLeft(), profileActivity.s0.getTop());
            View view2 = profileActivity.s0;
            kVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
            if (view2 == kVar.getBackButton()) {
                int max = Math.max(profileActivity.s0.getMeasuredWidth(), profileActivity.s0.getMeasuredHeight()) / 2;
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (((p40Var.getAlpha() / 255.0f) * alpha) / 0.3f));
                float f10 = max;
                canvas.drawCircle(f10, f10, 0.7f * f10, paint2);
                paint2.setAlpha(alpha);
            }
            profileActivity.s0.draw(canvas);
            canvas.restoreToCount(save);
        }
        yi0 yi0Var = profileActivity.Q;
        if (yi0Var != null && yi0Var.getVisibility() == 0) {
            if (profileActivity.Q.getAlpha() == 1.0f) {
                profileActivity.Q.draw(canvas);
            } else if (profileActivity.Q.getAlpha() != 0.0f) {
                canvas.saveLayerAlpha(profileActivity.Q.getLeft(), profileActivity.Q.getTop(), profileActivity.Q.getRight(), profileActivity.Q.getBottom(), (int) (profileActivity.Q.getAlpha() * 255.0f), 31);
                canvas.translate(profileActivity.Q.getLeft(), profileActivity.Q.getTop());
                profileActivity.Q.draw(canvas);
                canvas.restore();
            }
        }
        if (profileActivity.E0) {
            return;
        }
        canvas.save();
        by0 by0Var = profileActivity.a;
        canvas.translate(by0Var != null ? by0Var.getTranslationX() : 0.0f, 0.0f);
        int v03 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d6, profileActivity.v0);
        int i12 = profileActivity.h6;
        by0 by0Var2 = profileActivity.a;
        AndroidUtilities.drawNavigationBarProtection(canvas, this, v03, i12, by0Var2 != null ? by0Var2.getAlpha() : 0.0f);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.xs0[] xs0VarArr;
        org.telegram.ui.Components.xs0 xs0Var;
        ProfileActivity profileActivity = this.z0;
        qy0 qy0Var = profileActivity.R4;
        if (qy0Var.n) {
            return qy0Var.g(motionEvent);
        }
        hz0 hz0Var = profileActivity.K;
        if (hz0Var != null && (xs0Var = (xs0VarArr = hz0Var.g0)[0]) != null && xs0Var.h.getFastScroll() != null && xs0VarArr[0].h.getFastScroll().n) {
            hz0 hz0Var2 = profileActivity.K;
            if (hz0Var2.d) {
                return hz0Var2.O(motionEvent);
            }
        }
        hz0 hz0Var3 = profileActivity.K;
        if (hz0Var3 == null || !hz0Var3.H(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        ProfileActivity profileActivity = this.z0;
        if (profileActivity.R4.n) {
            if (view == profileActivity.V) {
                return true;
            }
            kVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
            if (view == kVar || view == profileActivity.v) {
                return true;
            }
        }
        if (view == profileActivity.Q) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // r0.n
    public final void i(ViewGroup viewGroup, int i9, int i10, int i11, int i12, int i13, int[] iArr) {
        ProfileActivity profileActivity = this.t0;
        try {
            if (viewGroup == profileActivity.a && profileActivity.M) {
                org.telegram.ui.Components.wk0 currentListView = profileActivity.K.getCurrentListView();
                if (profileActivity.K.getTop() == 0) {
                    iArr[1] = i12;
                    currentListView.scrollBy(0, i12);
                }
            }
        } catch (Throwable th) {
            FileLog.e(th);
            AndroidUtilities.runOnUIThread(new ez0(this, 1));
        }
    }

    @Override // org.telegram.ui.Components.xu0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ProfileActivity profileActivity = this.z0;
        profileActivity.C0 = true;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.i5[] i5VarArr = profileActivity.C;
            if (i10 >= i5VarArr.length) {
                break;
            }
            org.telegram.ui.Components.i5 i5Var = i5VarArr[i10];
            if (i5Var != null) {
                i5Var.a();
            }
            i10++;
        }
        while (true) {
            org.telegram.ui.Components.i5[] i5VarArr2 = profileActivity.D;
            if (i9 >= i5VarArr2.length) {
                return;
            }
            org.telegram.ui.Components.i5 i5Var2 = i5VarArr2[i9];
            if (i5Var2 != null) {
                i5Var2.a();
            }
            i9++;
        }
    }

    @Override // org.telegram.ui.Components.xu0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ProfileActivity profileActivity = this.z0;
        int i9 = 0;
        profileActivity.C0 = false;
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.i5[] i5VarArr = profileActivity.C;
            if (i10 >= i5VarArr.length) {
                break;
            }
            org.telegram.ui.Components.i5 i5Var = i5VarArr[i10];
            if (i5Var != null) {
                i5Var.b();
            }
            i10++;
        }
        while (true) {
            org.telegram.ui.Components.i5[] i5VarArr2 = profileActivity.D;
            if (i9 >= i5VarArr2.length) {
                return;
            }
            org.telegram.ui.Components.i5 i5Var2 = i5VarArr2[i9];
            if (i5Var2 != null) {
                i5Var2.b();
            }
            i9++;
        }
    }

    @Override // org.telegram.ui.Components.xu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        ProfileActivity profileActivity = this.z0;
        profileActivity.Q5 = -1;
        profileActivity.P4 = false;
        profileActivity.Q4 = false;
        profileActivity.A3();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0432  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i9, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        boolean z10;
        char c10;
        org.telegram.ui.Components.fr[] frVarArr;
        int measuredWidth;
        int max;
        View view;
        int i11;
        org.telegram.ui.ActionBar.k kVar2;
        int i12;
        int i13;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        char c11;
        int measuredWidth2;
        int max2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        ProfileActivity profileActivity = this.z0;
        org.telegram.ui.Components.fr[] frVarArr2 = profileActivity.G;
        org.telegram.ui.Components.fr[] frVarArr3 = profileActivity.F;
        HashMap hashMap = profileActivity.U1;
        org.telegram.ui.ActionBar.h5[] h5VarArr = profileActivity.f;
        kVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
        int i14 = 0;
        int i15 = currentActionBarHeight + (kVar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
        by0 by0Var = profileActivity.a;
        if (by0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) by0Var.getLayoutParams();
            if (layoutParams.topMargin != i15) {
                layoutParams.topMargin = i15;
            }
        }
        org.telegram.ui.Components.wk0 wk0Var = profileActivity.b;
        if (wk0Var != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) wk0Var.getLayoutParams();
            if (layoutParams2.topMargin != i15) {
                layoutParams2.topMargin = i15;
            }
        }
        int size = View.MeasureSpec.getSize(i10);
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        if (profileActivity.y0 == getMeasuredWidth() && profileActivity.z0 == getMeasuredHeight()) {
            frVarArr = frVarArr2;
            z10 = false;
            c10 = 0;
        } else {
            int i16 = profileActivity.y0;
            z10 = (i16 == 0 || i16 == getMeasuredWidth()) ? false : true;
            profileActivity.A0 = 0;
            int i17 = profileActivity.d.e.J2;
            profileActivity.y0 = getMeasuredWidth();
            profileActivity.z0 = getMeasuredHeight();
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(profileActivity.a.getMeasuredHeight(), 0);
            hashMap.clear();
            c10 = 0;
            while (i14 < i17) {
                int j10 = profileActivity.d.j(i14);
                org.telegram.ui.Components.fr[] frVarArr4 = frVarArr2;
                hashMap.put(Integer.valueOf(i14), Integer.valueOf(profileActivity.A0));
                if (j10 == 13) {
                    profileActivity.A0 += profileActivity.a.getMeasuredHeight();
                } else {
                    f2.q1 g10 = profileActivity.d.g(null, j10);
                    View view2 = g10.a;
                    profileActivity.d.v(g10, i14);
                    view2.measure(makeMeasureSpec, makeMeasureSpec2);
                    profileActivity.A0 += view2.getMeasuredHeight();
                }
                i14++;
                frVarArr2 = frVarArr4;
            }
            frVarArr = frVarArr2;
            org.telegram.ui.Components.gw0 gw0Var = profileActivity.L;
            if (gw0Var != null) {
                ((FrameLayout.LayoutParams) gw0Var.getLayoutParams()).topMargin = profileActivity.T3() + AndroidUtilities.statusBarHeight;
            }
        }
        if (profileActivity.c5 != null) {
            org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[c10];
            h5Var.setRightPadding(h5Var.getMeasuredWidth() - profileActivity.c5.o().getTitleTextView().getMeasuredWidth());
        }
        boolean z15 = profileActivity.h5;
        if (!z15 && ((z14 = profileActivity.j1) || (profileActivity.C1 && profileActivity.F1 == 2))) {
            this.u0 = true;
            if (z14) {
                org.telegram.ui.ActionBar.w0 w0Var = profileActivity.Q0;
                if (w0Var != null) {
                    w0Var.setAlpha(0.0f);
                    profileActivity.Q0.setEnabled(false);
                    profileActivity.Q0.setVisibility(8);
                }
                h5VarArr[1].setTextColor(-1);
                h5VarArr[1].setPivotY(r8.getMeasuredHeight());
                h5VarArr[1].setScaleX(1.38f);
                h5VarArr[1].setScaleY(1.38f);
                org.telegram.ui.Components.il0 il0Var = profileActivity.H;
                if (il0Var != null) {
                    il0Var.b(Color.argb(179, 255, 255, 255));
                }
                Drawable drawable = profileActivity.x;
                if (drawable != null) {
                    drawable.setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
                }
                org.telegram.ui.Components.fr frVar = frVarArr3[0];
                if (frVar != null) {
                    frVar.b(1.0f);
                }
                org.telegram.ui.Components.fr frVar2 = frVarArr3[1];
                if (frVar2 != null) {
                    frVar2.b(1.0f);
                }
                org.telegram.ui.Components.fr frVar3 = frVarArr[0];
                if (frVar3 != null) {
                    frVar3.b(1.0f);
                }
                org.telegram.ui.Components.fr frVar4 = frVarArr[1];
                if (frVar4 != null) {
                    frVar4.b(1.0f);
                }
                profileActivity.Y4(1.0f);
                profileActivity.r[1].setTextColor(-1275068417);
                kVar3 = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
                kVar3.A(1090519039, false);
                kVar4 = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
                kVar4.C(-1, false);
                wz0 wz0Var = profileActivity.J;
                wz0Var.A = true;
                wz0Var.setVisibility(0);
                profileActivity.J.e(1.0f, false);
                profileActivity.a0.setForegroundAlpha(1.0f);
                profileActivity.U.setVisibility(4);
                profileActivity.j0.L();
                profileActivity.j0.setVisibility(0);
                g01 g01Var = profileActivity.X5;
                if (g01Var != null) {
                    g01Var.a(603979775);
                }
                oy0 oy0Var = profileActivity.q0;
                if (oy0Var != null) {
                    oy0Var.setExpandProgress(1.0f);
                }
                gh.v0 v0Var = profileActivity.r0;
                if (v0Var != null) {
                    v0Var.setExpandProgress(1.0f);
                }
                org.telegram.ui.Components.pg0 pg0Var = profileActivity.W;
                if (pg0Var != null) {
                    pg0Var.setParentExpanded(1.0f);
                }
                org.telegram.ui.Components.hh0 hh0Var = profileActivity.Y;
                if (hh0Var != null) {
                    hh0Var.setParentExpanded(1.0f);
                }
                org.telegram.ui.Components.qv0 qv0Var = profileActivity.P;
                if (qv0Var != null) {
                    qv0Var.setParentExpanded(1.0f);
                }
                c11 = 0;
                profileActivity.j1 = false;
                profileActivity.V4();
            } else {
                c11 = 0;
            }
            profileActivity.z3();
            profileActivity.k2 = true;
            profileActivity.l2 = true;
            NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
            int i18 = NotificationCenter.needCheckSystemBarColors;
            Object[] objArr = new Object[1];
            objArr[c11] = Boolean.TRUE;
            globalInstance.lambda$postNotificationNameOnUIThread$1(i18, objArr);
            if (profileActivity.P0 != null) {
                if (profileActivity.g4()) {
                    profileActivity.P0.r(21);
                } else {
                    profileActivity.P0.K(21);
                }
                if (profileActivity.m0 != null) {
                    profileActivity.P0.K(34);
                    profileActivity.P0.K(35);
                    profileActivity.P0.r(31);
                }
            }
            profileActivity.h2 = 1.0f;
            if (profileActivity.j2) {
                measuredWidth2 = profileActivity.T3() + i15;
                max2 = 0;
            } else {
                measuredWidth2 = profileActivity.a.getMeasuredWidth() + profileActivity.O3();
                max2 = Math.max(0, getMeasuredHeight() - ((profileActivity.T3() + profileActivity.A0) + i15));
            }
            if (profileActivity.A1 != 0) {
                max2 += AndroidUtilities.dp(48.0f) + AndroidUtilities.navigationBarHeight;
                profileActivity.a.setBottomGlowOffset(AndroidUtilities.dp(48.0f) + AndroidUtilities.navigationBarHeight);
            } else {
                profileActivity.a.setBottomGlowOffset(0);
            }
            float f10 = measuredWidth2 - i15;
            profileActivity.N1 = f10;
            if (profileActivity.F1 == 0) {
                profileActivity.M1 = f10;
            }
            profileActivity.c.h1(0, -i15);
            profileActivity.a.setPadding(0, measuredWidth2, 0, max2);
            measureChildWithMargins(profileActivity.a, i9, 0, i10, 0);
            by0 by0Var2 = profileActivity.a;
            by0Var2.layout(0, i15, by0Var2.getMeasuredWidth(), profileActivity.a.getMeasuredHeight() + i15);
            this.u0 = false;
        } else if (z15 && !profileActivity.C1 && !profileActivity.P4) {
            this.u0 = true;
            if (profileActivity.E0 || !(profileActivity.j2 || AndroidUtilities.isTablet())) {
                measuredWidth = profileActivity.a.getMeasuredWidth() + profileActivity.O3();
                max = Math.max(0, getMeasuredHeight() - ((profileActivity.T3() + profileActivity.A0) + i15));
            } else {
                measuredWidth = profileActivity.T3();
                max = 0;
            }
            if (profileActivity.A1 != 0) {
                max += AndroidUtilities.dp(48.0f) + AndroidUtilities.navigationBarHeight;
                profileActivity.a.setBottomGlowOffset(AndroidUtilities.dp(48.0f) + AndroidUtilities.navigationBarHeight);
            } else {
                profileActivity.a.setBottomGlowOffset(0);
            }
            int paddingTop = profileActivity.a.getPaddingTop();
            int i19 = 0;
            while (true) {
                if (i19 >= profileActivity.a.getChildCount()) {
                    view = null;
                    i11 = -1;
                    break;
                } else {
                    i11 = RecyclerView.R(profileActivity.a.getChildAt(i19));
                    if (i11 != -1) {
                        view = profileActivity.a.getChildAt(i19);
                        break;
                    }
                    i19++;
                }
            }
            if (view == null && (view = profileActivity.a.getChildAt(0)) != null) {
                by0 by0Var3 = profileActivity.a;
                View F = by0Var3.F(view);
                f2.q1 T = F == null ? null : by0Var3.T(F);
                i11 = T.b();
                if (i11 == -1 && (i11 = T.g) == -1) {
                    i11 = T.c;
                }
            }
            int top = view != null ? view.getTop() : measuredWidth;
            kVar2 = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
            if ((kVar2.j0 || profileActivity.n1) && (i12 = profileActivity.F4) >= 0) {
                profileActivity.c.h1(i12, -measuredWidth);
            } else {
                if (profileActivity.Q4 || paddingTop != measuredWidth) {
                    int i20 = profileActivity.Q5;
                    if (i20 >= 0) {
                        profileActivity.c.h1(i20, profileActivity.R5 - measuredWidth);
                    } else {
                        if ((z10 && profileActivity.k2) || view == null) {
                            i13 = 0;
                            profileActivity.c.h1(0, profileActivity.T3() - measuredWidth);
                            z11 = false;
                            if (paddingTop == measuredWidth || profileActivity.a.getPaddingBottom() != max) {
                                profileActivity.a.setPadding(i13, measuredWidth, i13, max);
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if (z12) {
                                measureChildWithMargins(profileActivity.a, i9, 0, i10, 0);
                                try {
                                    by0 by0Var4 = profileActivity.a;
                                    by0Var4.layout(0, i15, by0Var4.getMeasuredWidth(), profileActivity.a.getMeasuredHeight() + i15);
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                }
                            }
                            this.u0 = false;
                            z13 = size <= View.MeasureSpec.getSize(i9);
                            if (z13 == this.w0) {
                                post(new ez0(this, 0));
                                this.w0 = z13;
                                return;
                            }
                            return;
                        }
                        if (i11 == 0 && !profileActivity.k2 && top > profileActivity.T3()) {
                            top = profileActivity.T3();
                        }
                        profileActivity.c.h1(i11, top - measuredWidth);
                    }
                }
                i13 = 0;
                z11 = false;
                if (paddingTop == measuredWidth) {
                }
                profileActivity.a.setPadding(i13, measuredWidth, i13, max);
                z12 = true;
                if (z12) {
                }
                this.u0 = false;
                if (size <= View.MeasureSpec.getSize(i9)) {
                }
                if (z13 == this.w0) {
                }
            }
            i13 = 0;
            z11 = true;
            if (paddingTop == measuredWidth) {
            }
            profileActivity.a.setPadding(i13, measuredWidth, i13, max);
            z12 = true;
            if (z12) {
            }
            this.u0 = false;
            if (size <= View.MeasureSpec.getSize(i9)) {
            }
            if (z13 == this.w0) {
            }
        }
        if (size <= View.MeasureSpec.getSize(i9)) {
        }
        if (z13 == this.w0) {
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        ProfileActivity profileActivity = this.z0;
        og.d.c(profileActivity.l6, profileActivity.fragmentView);
        profileActivity.m6.d();
    }

    @Override // r0.m
    public final void p(int i9, View view) {
        this.s0.a = 0;
    }

    @Override // r0.m
    public final boolean q(View view, View view2, int i9, int i10) {
        return this.t0.F4 != -1 && i9 == 2;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.u0) {
            return;
        }
        super.requestLayout();
    }

    @Override // r0.m
    public final void t(View view, View view2, int i9, int i10) {
        this.s0.a = i9;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
    }

    @Override // r0.m
    public final void c(ViewGroup viewGroup, int i9, int i10, int i11, int i12, int i13) {
    }
}
