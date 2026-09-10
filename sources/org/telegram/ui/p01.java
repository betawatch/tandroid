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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class p01 extends org.telegram.ui.Components.aw0 implements r0.m {
    public boolean A0;
    public final ArrayList B0;
    public final org.telegram.ui.Components.m9 C0;
    public final /* synthetic */ ProfileActivity D0;
    public final b2.q0 w0;
    public final /* synthetic */ ProfileActivity x0;
    public boolean y0;
    public final Paint z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p01(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.D0 = profileActivity;
        this.x0 = profileActivity;
        this.w0 = new b2.q0();
        this.z0 = new Paint();
        this.B0 = new ArrayList();
        this.C0 = new org.telegram.ui.Components.m9(20);
    }

    @Override // r0.l
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        org.telegram.ui.ActionBar.l lVar;
        int i13;
        org.telegram.ui.Components.vl0 currentListView;
        int L0;
        ProfileActivity profileActivity = this.x0;
        if (viewGroup == profileActivity.a) {
            if (profileActivity.J4 == -1 || !profileActivity.Q) {
                return;
            }
            lVar = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
            boolean z10 = lVar.n0;
            int top = profileActivity.O.getTop();
            boolean z11 = false;
            if (i11 >= 0) {
                if (z10) {
                    org.telegram.ui.Components.vl0 currentListView2 = profileActivity.O.getCurrentListView();
                    iArr[1] = i11;
                    if (top > 0) {
                        iArr[1] = 0;
                    }
                    if (currentListView2 == null || (i13 = iArr[1]) <= 0) {
                        return;
                    }
                    currentListView2.scrollBy(0, i13);
                    return;
                }
                return;
            }
            if (top <= 0 && (currentListView = profileActivity.O.getCurrentListView()) != null && (L0 = ((s4.c0) currentListView.getLayoutManager()).L0()) != -1) {
                s4.c1 K = currentListView.K(L0);
                int top2 = K != null ? K.a.getTop() : -1;
                int paddingTop = currentListView.getPaddingTop();
                if (top2 != paddingTop || L0 != 0) {
                    iArr[1] = L0 != 0 ? i11 : Math.max(i11, top2 - paddingTop);
                    currentListView.scrollBy(0, i11);
                    z11 = true;
                }
            }
            if (z10) {
                if (z11 || top >= 0) {
                    iArr[1] = i11;
                } else {
                    iArr[1] = i11 - Math.max(top, i11);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.aw0
    public final void L(Canvas canvas, ArrayList arrayList) {
        canvas.save();
        ProfileActivity profileActivity = this.x0;
        canvas.translate(0.0f, profileActivity.a.getY());
        profileActivity.O.Q(canvas, arrayList);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.aw0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.l lVar;
        ProfileActivity profileActivity = this.D0;
        org.telegram.ui.Components.p50 p50Var = profileActivity.x0;
        Paint paint = profileActivity.q2;
        eh.d dVar = profileActivity.n6;
        zg.e eVar = profileActivity.m6;
        Paint paint2 = profileActivity.y0;
        if (Build.VERSION.SDK_INT >= 31 && eVar != null) {
            ProfileActivity.B0(profileActivity);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (dVar != null && !dVar.n) {
                RecordingCanvas a2 = dVar.a(measuredWidth, measuredHeight);
                a2.drawColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a7, profileActivity.z0));
                if (SharedConfig.chatBlurEnabled()) {
                    eVar.b(a2, -2);
                }
                dVar.c();
            }
        }
        int i10 = org.telegram.ui.ActionBar.j6.a7;
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(i10, profileActivity.z0));
        if (profileActivity.a.getVisibility() == 0) {
            int v02 = org.telegram.ui.ActionBar.j6.v0(i10, profileActivity.z0);
            Paint paint3 = this.z0;
            paint3.setColor(v02);
            if (profileActivity.H1) {
                paint.setAlpha((int) (profileActivity.a.getAlpha() * 255.0f));
            }
            if (profileActivity.H1) {
                paint3.setAlpha((int) (profileActivity.a.getAlpha() * 255.0f));
            }
            int childCount = profileActivity.a.getChildCount();
            ArrayList arrayList = this.B0;
            arrayList.clear();
            boolean z10 = false;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = profileActivity.a.getChildAt(i11);
                profileActivity.a.getClass();
                if (RecyclerView.R(childAt) != -1) {
                    arrayList.add(profileActivity.a.getChildAt(i11));
                } else {
                    z10 = true;
                }
            }
            Collections.sort(arrayList, this.C0);
            profileActivity.a.getY();
            int size = arrayList.size();
            if (!profileActivity.G1 && size > 0 && !z10) {
                ((View) arrayList.get(0)).getY();
            }
            boolean z11 = false;
            for (int i12 = 0; i12 < size; i12++) {
                View view = (View) arrayList.get(i12);
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
        if (p50Var.getAlpha() > 0) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), profileActivity.x0);
        }
        if (profileActivity.w0 != null) {
            int save = canvas.save();
            canvas.translate(profileActivity.w0.getLeft(), profileActivity.w0.getTop());
            View view2 = profileActivity.w0;
            lVar = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
            if (view2 == lVar.getBackButton()) {
                int max = Math.max(profileActivity.w0.getMeasuredWidth(), profileActivity.w0.getMeasuredHeight()) / 2;
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (((p50Var.getAlpha() / 255.0f) * alpha) / 0.3f));
                float f7 = max;
                canvas.drawCircle(f7, f7, 0.7f * f7, paint2);
                paint2.setAlpha(alpha);
            }
            profileActivity.w0.draw(canvas);
            canvas.restoreToCount(save);
        }
        t50 t50Var = profileActivity.U;
        if (t50Var != null && t50Var.getVisibility() == 0) {
            if (profileActivity.U.getAlpha() == 1.0f) {
                profileActivity.U.draw(canvas);
            } else if (profileActivity.U.getAlpha() != 0.0f) {
                canvas.saveLayerAlpha(profileActivity.U.getLeft(), profileActivity.U.getTop(), profileActivity.U.getRight(), profileActivity.U.getBottom(), (int) (profileActivity.U.getAlpha() * 255.0f), 31);
                canvas.translate(profileActivity.U.getLeft(), profileActivity.U.getTop());
                profileActivity.U.draw(canvas);
                canvas.restore();
            }
        }
        if (profileActivity.I0) {
            return;
        }
        canvas.save();
        jz0 jz0Var = profileActivity.a;
        canvas.translate(jz0Var != null ? jz0Var.getTranslationX() : 0.0f, 0.0f);
        int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, profileActivity.z0);
        int i13 = profileActivity.l6;
        jz0 jz0Var2 = profileActivity.a;
        AndroidUtilities.drawNavigationBarProtection(canvas, this, v03, i13, jz0Var2 != null ? jz0Var2.getAlpha() : 0.0f);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.au0[] au0VarArr;
        org.telegram.ui.Components.au0 au0Var;
        ProfileActivity profileActivity = this.D0;
        xz0 xz0Var = profileActivity.V4;
        if (xz0Var.n) {
            return xz0Var.g(motionEvent);
        }
        r01 r01Var = profileActivity.O;
        if (r01Var != null && (au0Var = (au0VarArr = r01Var.k0)[0]) != null && au0Var.h.getFastScroll() != null && au0VarArr[0].h.getFastScroll().n) {
            r01 r01Var2 = profileActivity.O;
            if (r01Var2.d) {
                return r01Var2.O(motionEvent);
            }
        }
        r01 r01Var3 = profileActivity.O;
        if (r01Var3 == null || !r01Var3.H(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.l lVar;
        ProfileActivity profileActivity = this.D0;
        if (profileActivity.V4.n) {
            if (view == profileActivity.Z) {
                return true;
            }
            lVar = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
            if (view == lVar || view == profileActivity.v) {
                return true;
            }
        }
        if (view == profileActivity.U) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // r0.m
    public final void h(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        ProfileActivity profileActivity = this.x0;
        try {
            if (viewGroup == profileActivity.a && profileActivity.Q) {
                org.telegram.ui.Components.vl0 currentListView = profileActivity.O.getCurrentListView();
                if (profileActivity.O.getTop() == 0) {
                    iArr[1] = i13;
                    currentListView.scrollBy(0, i13);
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
            AndroidUtilities.runOnUIThread(new o01(this, 1));
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // r0.l
    public final void n(int i10, View view) {
        this.w0.a = 0;
    }

    @Override // r0.l
    public final boolean o(View view, View view2, int i10, int i11) {
        return this.x0.J4 != -1 && i10 == 2;
    }

    @Override // org.telegram.ui.Components.aw0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ProfileActivity profileActivity = this.D0;
        profileActivity.G0 = true;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.n5[] n5VarArr = profileActivity.G;
            if (i11 >= n5VarArr.length) {
                break;
            }
            org.telegram.ui.Components.n5 n5Var = n5VarArr[i11];
            if (n5Var != null) {
                n5Var.a();
            }
            i11++;
        }
        while (true) {
            org.telegram.ui.Components.n5[] n5VarArr2 = profileActivity.H;
            if (i10 >= n5VarArr2.length) {
                return;
            }
            org.telegram.ui.Components.n5 n5Var2 = n5VarArr2[i10];
            if (n5Var2 != null) {
                n5Var2.a();
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.aw0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ProfileActivity profileActivity = this.D0;
        int i10 = 0;
        profileActivity.G0 = false;
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.n5[] n5VarArr = profileActivity.G;
            if (i11 >= n5VarArr.length) {
                break;
            }
            org.telegram.ui.Components.n5 n5Var = n5VarArr[i11];
            if (n5Var != null) {
                n5Var.b();
            }
            i11++;
        }
        while (true) {
            org.telegram.ui.Components.n5[] n5VarArr2 = profileActivity.H;
            if (i10 >= n5VarArr2.length) {
                return;
            }
            org.telegram.ui.Components.n5 n5Var2 = n5VarArr2[i10];
            if (n5Var2 != null) {
                n5Var2.b();
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.aw0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ProfileActivity profileActivity = this.D0;
        profileActivity.U5 = -1;
        profileActivity.T4 = false;
        profileActivity.U4 = false;
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
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.l lVar;
        boolean z10;
        char c10;
        org.telegram.ui.Components.vr[] vrVarArr;
        int measuredWidth;
        int max;
        View view;
        int i12;
        org.telegram.ui.ActionBar.l lVar2;
        int i13;
        int i14;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        char c11;
        int measuredWidth2;
        int max2;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        ProfileActivity profileActivity = this.D0;
        org.telegram.ui.Components.vr[] vrVarArr2 = profileActivity.K;
        org.telegram.ui.Components.vr[] vrVarArr3 = profileActivity.J;
        HashMap hashMap = profileActivity.Y1;
        org.telegram.ui.ActionBar.l5[] l5VarArr = profileActivity.f;
        lVar = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
        int i15 = 0;
        int i16 = currentActionBarHeight + (lVar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
        jz0 jz0Var = profileActivity.a;
        if (jz0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) jz0Var.getLayoutParams();
            if (layoutParams.topMargin != i16) {
                layoutParams.topMargin = i16;
            }
        }
        org.telegram.ui.Components.vl0 vl0Var = profileActivity.b;
        if (vl0Var != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) vl0Var.getLayoutParams();
            if (layoutParams2.topMargin != i16) {
                layoutParams2.topMargin = i16;
            }
        }
        int size = View.MeasureSpec.getSize(i11);
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        if (profileActivity.C0 == getMeasuredWidth() && profileActivity.D0 == getMeasuredHeight()) {
            vrVarArr = vrVarArr2;
            z10 = false;
            c10 = 0;
        } else {
            int i17 = profileActivity.C0;
            z10 = (i17 == 0 || i17 == getMeasuredWidth()) ? false : true;
            profileActivity.E0 = 0;
            int i18 = profileActivity.d.e.N2;
            profileActivity.C0 = getMeasuredWidth();
            profileActivity.D0 = getMeasuredHeight();
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(profileActivity.a.getMeasuredHeight(), 0);
            hashMap.clear();
            c10 = 0;
            while (i15 < i18) {
                int j3 = profileActivity.d.j(i15);
                org.telegram.ui.Components.vr[] vrVarArr4 = vrVarArr2;
                hashMap.put(Integer.valueOf(i15), Integer.valueOf(profileActivity.E0));
                if (j3 == 13) {
                    profileActivity.E0 += profileActivity.a.getMeasuredHeight();
                } else {
                    s4.c1 g10 = profileActivity.d.g(null, j3);
                    View view2 = g10.a;
                    profileActivity.d.v(g10, i15);
                    view2.measure(makeMeasureSpec, makeMeasureSpec2);
                    profileActivity.E0 += view2.getMeasuredHeight();
                }
                i15++;
                vrVarArr2 = vrVarArr4;
            }
            vrVarArr = vrVarArr2;
            org.telegram.ui.Components.jx0 jx0Var = profileActivity.P;
            if (jx0Var != null) {
                ((FrameLayout.LayoutParams) jx0Var.getLayoutParams()).topMargin = profileActivity.T3() + AndroidUtilities.statusBarHeight;
            }
        }
        if (profileActivity.g5 != null) {
            org.telegram.ui.ActionBar.l5 l5Var = l5VarArr[c10];
            l5Var.setRightPadding(l5Var.getMeasuredWidth() - profileActivity.g5.n().getTitleTextView().getMeasuredWidth());
        }
        boolean z15 = profileActivity.l5;
        if (!z15 && ((z14 = profileActivity.n1) || (profileActivity.G1 && profileActivity.J1 == 2))) {
            this.y0 = true;
            if (z14) {
                org.telegram.ui.ActionBar.w0 w0Var = profileActivity.U0;
                if (w0Var != null) {
                    w0Var.setAlpha(0.0f);
                    profileActivity.U0.setEnabled(false);
                    profileActivity.U0.setVisibility(8);
                }
                l5VarArr[1].setTextColor(-1);
                l5VarArr[1].setPivotY(r8.getMeasuredHeight());
                l5VarArr[1].setScaleX(1.38f);
                l5VarArr[1].setScaleY(1.38f);
                org.telegram.ui.Components.hm0 hm0Var = profileActivity.L;
                if (hm0Var != null) {
                    hm0Var.b(Color.argb(179, 255, 255, 255));
                }
                Drawable drawable = profileActivity.x;
                if (drawable != null) {
                    drawable.setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
                }
                org.telegram.ui.Components.vr vrVar = vrVarArr3[0];
                if (vrVar != null) {
                    vrVar.b(1.0f);
                }
                org.telegram.ui.Components.vr vrVar2 = vrVarArr3[1];
                if (vrVar2 != null) {
                    vrVar2.b(1.0f);
                }
                org.telegram.ui.Components.vr vrVar3 = vrVarArr[0];
                if (vrVar3 != null) {
                    vrVar3.b(1.0f);
                }
                org.telegram.ui.Components.vr vrVar4 = vrVarArr[1];
                if (vrVar4 != null) {
                    vrVar4.b(1.0f);
                }
                profileActivity.Y4(1.0f);
                profileActivity.r[1].setTextColor(-1275068417);
                lVar3 = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
                lVar3.A(1090519039, false);
                lVar4 = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
                lVar4.C(-1, false);
                g11 g11Var = profileActivity.N;
                g11Var.E = true;
                g11Var.setVisibility(0);
                profileActivity.N.e(1.0f, false);
                profileActivity.e0.setForegroundAlpha(1.0f);
                profileActivity.Y.setVisibility(4);
                profileActivity.n0.L();
                profileActivity.n0.setVisibility(0);
                q11 q11Var = profileActivity.b6;
                if (q11Var != null) {
                    q11Var.a(603979775);
                }
                vz0 vz0Var = profileActivity.u0;
                if (vz0Var != null) {
                    vz0Var.setExpandProgress(1.0f);
                }
                xh.g0 g0Var = profileActivity.v0;
                if (g0Var != null) {
                    g0Var.setExpandProgress(1.0f);
                }
                org.telegram.ui.Components.nh0 nh0Var = profileActivity.a0;
                if (nh0Var != null) {
                    nh0Var.setParentExpanded(1.0f);
                }
                org.telegram.ui.Components.fi0 fi0Var = profileActivity.c0;
                if (fi0Var != null) {
                    fi0Var.setParentExpanded(1.0f);
                }
                org.telegram.ui.Components.tw0 tw0Var = profileActivity.T;
                if (tw0Var != null) {
                    tw0Var.setParentExpanded(1.0f);
                }
                c11 = 0;
                profileActivity.n1 = false;
                profileActivity.V4();
            } else {
                c11 = 0;
            }
            profileActivity.z3();
            profileActivity.o2 = true;
            profileActivity.p2 = true;
            NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
            int i19 = NotificationCenter.needCheckSystemBarColors;
            Object[] objArr = new Object[1];
            objArr[c11] = Boolean.TRUE;
            globalInstance.lambda$postNotificationNameOnUIThread$1(i19, objArr);
            if (profileActivity.T0 != null) {
                if (profileActivity.g4()) {
                    profileActivity.T0.r(21);
                } else {
                    profileActivity.T0.K(21);
                }
                if (profileActivity.q0 != null) {
                    profileActivity.T0.K(34);
                    profileActivity.T0.K(35);
                    profileActivity.T0.r(31);
                }
            }
            profileActivity.l2 = 1.0f;
            if (profileActivity.n2) {
                measuredWidth2 = profileActivity.T3() + i16;
                max2 = 0;
            } else {
                measuredWidth2 = profileActivity.a.getMeasuredWidth() + profileActivity.O3();
                max2 = Math.max(0, getMeasuredHeight() - ((profileActivity.T3() + profileActivity.E0) + i16));
            }
            if (profileActivity.E1 != 0) {
                max2 += AndroidUtilities.dp(48.0f) + AndroidUtilities.navigationBarHeight;
                profileActivity.a.setBottomGlowOffset(AndroidUtilities.dp(48.0f) + AndroidUtilities.navigationBarHeight);
            } else {
                profileActivity.a.setBottomGlowOffset(0);
            }
            float f7 = measuredWidth2 - i16;
            profileActivity.R1 = f7;
            if (profileActivity.J1 == 0) {
                profileActivity.Q1 = f7;
            }
            profileActivity.c.h1(0, -i16);
            profileActivity.a.setPadding(0, measuredWidth2, 0, max2);
            measureChildWithMargins(profileActivity.a, i10, 0, i11, 0);
            jz0 jz0Var2 = profileActivity.a;
            jz0Var2.layout(0, i16, jz0Var2.getMeasuredWidth(), profileActivity.a.getMeasuredHeight() + i16);
            this.y0 = false;
        } else if (z15 && !profileActivity.G1 && !profileActivity.T4) {
            this.y0 = true;
            if (profileActivity.I0 || !(profileActivity.n2 || AndroidUtilities.isTablet())) {
                measuredWidth = profileActivity.a.getMeasuredWidth() + profileActivity.O3();
                max = Math.max(0, getMeasuredHeight() - ((profileActivity.T3() + profileActivity.E0) + i16));
            } else {
                measuredWidth = profileActivity.T3();
                max = 0;
            }
            if (profileActivity.E1 != 0) {
                max += AndroidUtilities.dp(48.0f) + AndroidUtilities.navigationBarHeight;
                profileActivity.a.setBottomGlowOffset(AndroidUtilities.dp(48.0f) + AndroidUtilities.navigationBarHeight);
            } else {
                profileActivity.a.setBottomGlowOffset(0);
            }
            int paddingTop = profileActivity.a.getPaddingTop();
            int i20 = 0;
            while (true) {
                if (i20 >= profileActivity.a.getChildCount()) {
                    view = null;
                    i12 = -1;
                    break;
                } else {
                    i12 = RecyclerView.R(profileActivity.a.getChildAt(i20));
                    if (i12 != -1) {
                        view = profileActivity.a.getChildAt(i20);
                        break;
                    }
                    i20++;
                }
            }
            if (view == null && (view = profileActivity.a.getChildAt(0)) != null) {
                jz0 jz0Var3 = profileActivity.a;
                View F = jz0Var3.F(view);
                s4.c1 T = F == null ? null : jz0Var3.T(F);
                i12 = T.b();
                if (i12 == -1 && (i12 = T.g) == -1) {
                    i12 = T.c;
                }
            }
            int top = view != null ? view.getTop() : measuredWidth;
            lVar2 = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
            if ((lVar2.n0 || profileActivity.r1) && (i13 = profileActivity.J4) >= 0) {
                profileActivity.c.h1(i13, -measuredWidth);
            } else {
                if (profileActivity.U4 || paddingTop != measuredWidth) {
                    int i21 = profileActivity.U5;
                    if (i21 >= 0) {
                        profileActivity.c.h1(i21, profileActivity.V5 - measuredWidth);
                    } else {
                        if ((z10 && profileActivity.o2) || view == null) {
                            i14 = 0;
                            profileActivity.c.h1(0, profileActivity.T3() - measuredWidth);
                            z11 = false;
                            if (paddingTop == measuredWidth || profileActivity.a.getPaddingBottom() != max) {
                                profileActivity.a.setPadding(i14, measuredWidth, i14, max);
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if (z12) {
                                measureChildWithMargins(profileActivity.a, i10, 0, i11, 0);
                                try {
                                    jz0 jz0Var4 = profileActivity.a;
                                    jz0Var4.layout(0, i16, jz0Var4.getMeasuredWidth(), profileActivity.a.getMeasuredHeight() + i16);
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                            }
                            this.y0 = false;
                            z13 = size <= View.MeasureSpec.getSize(i10);
                            if (z13 == this.A0) {
                                post(new o01(this, 0));
                                this.A0 = z13;
                                return;
                            }
                            return;
                        }
                        if (i12 == 0 && !profileActivity.o2 && top > profileActivity.T3()) {
                            top = profileActivity.T3();
                        }
                        profileActivity.c.h1(i12, top - measuredWidth);
                    }
                }
                i14 = 0;
                z11 = false;
                if (paddingTop == measuredWidth) {
                }
                profileActivity.a.setPadding(i14, measuredWidth, i14, max);
                z12 = true;
                if (z12) {
                }
                this.y0 = false;
                if (size <= View.MeasureSpec.getSize(i10)) {
                }
                if (z13 == this.A0) {
                }
            }
            i14 = 0;
            z11 = true;
            if (paddingTop == measuredWidth) {
            }
            profileActivity.a.setPadding(i14, measuredWidth, i14, max);
            z12 = true;
            if (z12) {
            }
            this.y0 = false;
            if (size <= View.MeasureSpec.getSize(i10)) {
            }
            if (z13 == this.A0) {
            }
        }
        if (size <= View.MeasureSpec.getSize(i10)) {
        }
        if (z13 == this.A0) {
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        ProfileActivity profileActivity = this.D0;
        fh.d.c(profileActivity.p6, profileActivity.fragmentView);
        profileActivity.q6.d();
    }

    @Override // r0.l
    public final void r(View view, View view2, int i10, int i11) {
        this.w0.a = i10;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.y0) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
    }

    @Override // r0.l
    public final void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
