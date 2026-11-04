package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class kv0 extends org.telegram.ui.Components.qt0 implements r0.l {
    public final d2.t0 g0;
    public final /* synthetic */ ProfileActivity h0;
    public boolean i0;
    public final Paint j0;
    public boolean k0;
    public final ArrayList l0;
    public final org.telegram.ui.Components.d80 m0;
    public final /* synthetic */ ProfileActivity n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv0(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.n0 = profileActivity;
        this.h0 = profileActivity;
        this.g0 = new d2.t0();
        this.j0 = new Paint();
        this.l0 = new ArrayList();
        this.m0 = new org.telegram.ui.Components.d80(18);
    }

    @Override // org.telegram.ui.Components.qt0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.ActionBar.k kVar;
        ProfileActivity profileActivity = this.n0;
        org.telegram.ui.Components.p30 p30Var = profileActivity.y0;
        Paint paint = profileActivity.q2;
        Paint paint2 = profileActivity.z0;
        float f10 = profileActivity.B5;
        Paint paint3 = this.j0;
        if (f10 > 0.0f) {
            paint3.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, profileActivity.A0));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), ProfileActivity.J0(profileActivity), paint3);
        }
        int i3 = org.telegram.ui.ActionBar.k6.a7;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(i3, profileActivity.A0));
        if (profileActivity.a.getVisibility() == 0) {
            paint3.setColor(org.telegram.ui.ActionBar.k6.w0(i3, profileActivity.A0));
            if (profileActivity.H1) {
                paint.setAlpha((int) (profileActivity.a.getAlpha() * 255.0f));
            }
            if (profileActivity.H1) {
                paint3.setAlpha((int) (profileActivity.a.getAlpha() * 255.0f));
            }
            int childCount = profileActivity.a.getChildCount();
            ArrayList arrayList = this.l0;
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
            Collections.sort(arrayList, this.m0);
            profileActivity.a.getY();
            int size = arrayList.size();
            if (!profileActivity.G1 && size > 0 && !z10) {
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
        if (p30Var.getAlpha() > 0) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), profileActivity.y0);
        } else {
            canvas2 = canvas;
        }
        if (profileActivity.x0 != null) {
            int save = canvas.save();
            canvas.translate(profileActivity.x0.getLeft(), profileActivity.x0.getTop());
            View view2 = profileActivity.x0;
            kVar = ((org.telegram.ui.ActionBar.d2) profileActivity).actionBar;
            if (view2 == kVar.getBackButton()) {
                int max = Math.max(profileActivity.x0.getMeasuredWidth(), profileActivity.x0.getMeasuredHeight()) / 2;
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (((p30Var.getAlpha() / 255.0f) * alpha) / 0.3f));
                float f11 = max;
                canvas.drawCircle(f11, f11, 0.7f * f11, paint2);
                paint2.setAlpha(alpha);
            }
            profileActivity.x0.draw(canvas);
            canvas.restoreToCount(save);
        }
        org.telegram.ui.Components.voip.r0 r0Var = profileActivity.U;
        if (r0Var != null && r0Var.getVisibility() == 0) {
            if (profileActivity.U.getAlpha() == 1.0f) {
                profileActivity.U.draw(canvas);
            } else if (profileActivity.U.getAlpha() != 0.0f) {
                canvas2.saveLayerAlpha(profileActivity.U.getLeft(), profileActivity.U.getTop(), profileActivity.U.getRight(), profileActivity.U.getBottom(), (int) (profileActivity.U.getAlpha() * 255.0f), 31);
                canvas.translate(profileActivity.U.getLeft(), profileActivity.U.getTop());
                profileActivity.U.draw(canvas);
                canvas.restore();
            }
        }
        if (profileActivity.J0) {
            return;
        }
        canvas.save();
        hu0 hu0Var = profileActivity.a;
        canvas.translate(hu0Var != null ? hu0Var.getTranslationX() : 0.0f, 0.0f);
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, profileActivity.A0);
        int i12 = profileActivity.J6;
        hu0 hu0Var2 = profileActivity.a;
        org.telegram.messenger.g0.O(canvas, this, w02, i12, hu0Var2 != null ? hu0Var2.getAlpha() : 0.0f);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.rr0[] rr0VarArr;
        org.telegram.ui.Components.rr0 rr0Var;
        ProfileActivity profileActivity = this.n0;
        vu0 vu0Var = profileActivity.W4;
        if (vu0Var.n) {
            return vu0Var.g(motionEvent);
        }
        mv0 mv0Var = profileActivity.O;
        if (mv0Var != null && (rr0Var = (rr0VarArr = mv0Var.n0)[0]) != null && rr0Var.h.getFastScroll() != null && rr0VarArr[0].h.getFastScroll().n) {
            mv0 mv0Var2 = profileActivity.O;
            if (mv0Var2.d) {
                return mv0Var2.Z(motionEvent);
            }
        }
        mv0 mv0Var3 = profileActivity.O;
        if (mv0Var3 == null || !mv0Var3.P(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        ProfileActivity profileActivity = this.n0;
        if (profileActivity.W4.n) {
            if (view == profileActivity.Z) {
                return true;
            }
            kVar = ((org.telegram.ui.ActionBar.d2) profileActivity).actionBar;
            if (view == kVar || view == profileActivity.s) {
                return true;
            }
        }
        if (view == profileActivity.U) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // r0.k
    public final void m(int i3, View view) {
        this.g0.a = 0;
    }

    @Override // r0.l
    public final void n(View view, int i3, int i10, int i11, int i12, int i13, int[] iArr) {
        ProfileActivity profileActivity = this.h0;
        try {
            if (view == profileActivity.a && profileActivity.Q) {
                org.telegram.ui.Components.tj0 currentListView = profileActivity.O.getCurrentListView();
                if (profileActivity.O.getTop() == 0) {
                    iArr[1] = i12;
                    currentListView.scrollBy(0, i12);
                }
            }
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
            org.telegram.messenger.g0.h3(new jv0(this, 1));
        }
    }

    @Override // org.telegram.ui.Components.qt0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ProfileActivity profileActivity = this.n0;
        profileActivity.H0 = true;
        org.telegram.ui.Components.e5 e5Var = profileActivity.G;
        if (e5Var != null) {
            e5Var.a();
        }
        org.telegram.ui.Components.e5 e5Var2 = profileActivity.H;
        if (e5Var2 != null) {
            e5Var2.a();
        }
    }

    @Override // org.telegram.ui.Components.qt0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ProfileActivity profileActivity = this.n0;
        profileActivity.H0 = false;
        org.telegram.ui.Components.e5 e5Var = profileActivity.G;
        if (e5Var != null) {
            e5Var.b();
        }
        org.telegram.ui.Components.e5 e5Var2 = profileActivity.H;
        if (e5Var2 != null) {
            e5Var2.b();
        }
    }

    @Override // org.telegram.ui.Components.qt0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        ProfileActivity profileActivity = this.n0;
        profileActivity.l6 = -1;
        profileActivity.U4 = false;
        profileActivity.V4 = false;
        profileActivity.O3();
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03be  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i3, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        boolean z10;
        int measuredWidth;
        int max;
        int i11;
        View view;
        org.telegram.ui.ActionBar.k kVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z11;
        char c2;
        int measuredWidth2;
        int max2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        ProfileActivity profileActivity = this.n0;
        HashMap hashMap = profileActivity.Y1;
        kVar = ((org.telegram.ui.ActionBar.d2) profileActivity).actionBar;
        int i16 = currentActionBarHeight + (kVar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0);
        hu0 hu0Var = profileActivity.a;
        if (hu0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) hu0Var.getLayoutParams();
            if (layoutParams.topMargin != i16) {
                layoutParams.topMargin = i16;
            }
        }
        org.telegram.ui.Components.tj0 tj0Var = profileActivity.b;
        if (tj0Var != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) tj0Var.getLayoutParams();
            if (layoutParams2.topMargin != i16) {
                layoutParams2.topMargin = i16;
            }
        }
        int size = View.MeasureSpec.getSize(i10);
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        if (profileActivity.D0 == getMeasuredWidth() && profileActivity.E0 == getMeasuredHeight()) {
            z10 = false;
        } else {
            int i17 = profileActivity.D0;
            z10 = (i17 == 0 || i17 == getMeasuredWidth()) ? false : true;
            profileActivity.F0 = 0;
            int i18 = profileActivity.d.e.N2;
            profileActivity.D0 = getMeasuredWidth();
            profileActivity.E0 = getMeasuredHeight();
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(profileActivity.a.getMeasuredHeight(), 0);
            hashMap.clear();
            for (int i19 = 0; i19 < i18; i19++) {
                int d = profileActivity.d.d(i19);
                hashMap.put(Integer.valueOf(i19), Integer.valueOf(profileActivity.F0));
                if (d == 13) {
                    profileActivity.F0 += profileActivity.a.getMeasuredHeight();
                } else {
                    u4.d1 a10 = profileActivity.d.a(null, d);
                    View view2 = a10.a;
                    profileActivity.d.t(a10, i19);
                    view2.measure(makeMeasureSpec, makeMeasureSpec2);
                    profileActivity.F0 += view2.getMeasuredHeight();
                }
            }
            org.telegram.ui.Components.zu0 zu0Var = profileActivity.P;
            if (zu0Var != null) {
                ((FrameLayout.LayoutParams) zu0Var.getLayoutParams()).topMargin = profileActivity.j4() + org.telegram.messenger.g0.m;
            }
        }
        boolean z12 = profileActivity.m5;
        if (!z12 && ((z11 = profileActivity.n1) || (profileActivity.G1 && profileActivity.J1 == 2))) {
            this.i0 = true;
            if (z11) {
                org.telegram.ui.ActionBar.f5 f5Var = profileActivity.U0;
                if (f5Var != null) {
                    f5Var.setAlpha(0.0f);
                    profileActivity.U0.setEnabled(false);
                    profileActivity.U0.setVisibility(8);
                }
                profileActivity.f.setTextColor(-1);
                profileActivity.f.setPivotY(r4.getMeasuredHeight());
                profileActivity.f.setScaleX(1.38f);
                profileActivity.f.setScaleY(1.38f);
                org.telegram.ui.Components.kk0 kk0Var = profileActivity.L;
                if (kk0Var != null) {
                    kk0Var.b(Color.argb(org.telegram.messenger.hs.J2, org.telegram.messenger.hs.e4, org.telegram.messenger.hs.e4, org.telegram.messenger.hs.e4));
                }
                Drawable drawable = profileActivity.x;
                if (drawable != null) {
                    drawable.setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
                }
                org.telegram.ui.Components.wq wqVar = profileActivity.J;
                if (wqVar != null) {
                    wqVar.a(1.0f);
                }
                org.telegram.ui.Components.wq wqVar2 = profileActivity.K;
                if (wqVar2 != null) {
                    wqVar2.a(1.0f);
                }
                profileActivity.t5(1.0f);
                profileActivity.r.setTextColor(-1275068417);
                kVar3 = ((org.telegram.ui.ActionBar.d2) profileActivity).actionBar;
                kVar3.C(1090519039, false);
                kVar4 = ((org.telegram.ui.ActionBar.d2) profileActivity).actionBar;
                kVar4.D(-1, false);
                cw0 cw0Var = profileActivity.N;
                cw0Var.F = true;
                cw0Var.setVisibility(0);
                profileActivity.N.e(false, 1.0f);
                profileActivity.f0.setForegroundAlpha(1.0f);
                profileActivity.Y.setVisibility(4);
                profileActivity.o0.L();
                profileActivity.o0.setVisibility(0);
                mw0 mw0Var = profileActivity.z6;
                if (mw0Var != null) {
                    mw0Var.a(603979775);
                }
                tu0 tu0Var = profileActivity.v0;
                if (tu0Var != null) {
                    tu0Var.setExpandProgress(1.0f);
                }
                ci.z0 z0Var = profileActivity.w0;
                if (z0Var != null) {
                    z0Var.setExpandProgress(1.0f);
                }
                org.telegram.ui.Components.gf0 gf0Var = profileActivity.a0;
                if (gf0Var != null) {
                    gf0Var.setParentExpanded(1.0f);
                }
                profileActivity.Z4(1.0f);
                org.telegram.ui.Components.cg0 cg0Var = profileActivity.c0;
                if (cg0Var != null) {
                    cg0Var.setParentExpanded(1.0f);
                }
                org.telegram.ui.Components.ku0 ku0Var = profileActivity.T;
                if (ku0Var != null) {
                    ku0Var.setParentExpanded(1.0f);
                }
                c2 = 0;
                profileActivity.n1 = false;
                profileActivity.q5();
            } else {
                c2 = 0;
            }
            profileActivity.M3();
            profileActivity.o2 = true;
            profileActivity.p2 = true;
            org.telegram.messenger.hs e10 = org.telegram.messenger.hs.e();
            Object[] objArr = new Object[1];
            objArr[c2] = Boolean.TRUE;
            e10.k(org.telegram.messenger.hs.r4, objArr);
            if (profileActivity.T0 != null) {
                if (profileActivity.u4()) {
                    profileActivity.T0.t(21);
                } else {
                    profileActivity.T0.S(21);
                }
                if (profileActivity.r0 != null) {
                    profileActivity.T0.S(34);
                    profileActivity.T0.S(35);
                    profileActivity.T0.t(31);
                }
            }
            profileActivity.l2 = 1.0f;
            if (profileActivity.n2) {
                measuredWidth2 = profileActivity.j4() + i16;
                max2 = 0;
            } else {
                measuredWidth2 = profileActivity.a.getMeasuredWidth() + profileActivity.e4();
                max2 = Math.max(0, getMeasuredHeight() - ((profileActivity.j4() + profileActivity.F0) + i16));
            }
            if (profileActivity.E1 != 0) {
                max2 += org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.n;
                profileActivity.a.setBottomGlowOffset(org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.n);
            } else {
                profileActivity.a.setBottomGlowOffset(0);
            }
            float f10 = measuredWidth2 - i16;
            profileActivity.R1 = f10;
            if (profileActivity.J1 == 0) {
                profileActivity.Q1 = f10;
            }
            profileActivity.c.h1(0, -i16);
            profileActivity.a.setPadding(0, measuredWidth2, 0, max2);
            measureChildWithMargins(profileActivity.a, i3, 0, i10, 0);
            hu0 hu0Var2 = profileActivity.a;
            hu0Var2.layout(0, i16, hu0Var2.getMeasuredWidth(), profileActivity.a.getMeasuredHeight() + i16);
            this.i0 = false;
        } else if (z12 && !profileActivity.G1 && !profileActivity.U4) {
            this.i0 = true;
            if (profileActivity.J0 || !(profileActivity.n2 || org.telegram.messenger.g0.Q1())) {
                measuredWidth = profileActivity.a.getMeasuredWidth() + profileActivity.e4();
                max = Math.max(0, getMeasuredHeight() - ((profileActivity.j4() + profileActivity.F0) + i16));
            } else {
                measuredWidth = profileActivity.j4();
                max = 0;
            }
            if (profileActivity.E1 != 0) {
                max += org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.n;
                profileActivity.a.setBottomGlowOffset(org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.n);
            } else {
                profileActivity.a.setBottomGlowOffset(0);
            }
            int paddingTop = profileActivity.a.getPaddingTop();
            int i20 = 0;
            while (true) {
                if (i20 >= profileActivity.a.getChildCount()) {
                    i11 = -1;
                    view = null;
                    break;
                } else {
                    i11 = RecyclerView.R(profileActivity.a.getChildAt(i20));
                    if (i11 != -1) {
                        view = profileActivity.a.getChildAt(i20);
                        break;
                    }
                    i20++;
                }
            }
            if (view == null && (view = profileActivity.a.getChildAt(0)) != null) {
                hu0 hu0Var3 = profileActivity.a;
                View F = hu0Var3.F(view);
                u4.d1 T = F != null ? hu0Var3.T(F) : null;
                i11 = T.b();
                if (i11 == -1 && (i11 = T.g) == -1) {
                    i11 = T.c;
                }
            }
            int top = view != null ? view.getTop() : measuredWidth;
            kVar2 = ((org.telegram.ui.ActionBar.d2) profileActivity).actionBar;
            if ((kVar2.o0 || profileActivity.r1) && (i12 = profileActivity.K4) >= 0) {
                profileActivity.c.h1(i12, -measuredWidth);
            } else {
                if (profileActivity.V4 || paddingTop != measuredWidth) {
                    int i21 = profileActivity.l6;
                    if (i21 >= 0) {
                        profileActivity.c.h1(i21, profileActivity.m6 - measuredWidth);
                    } else if ((z10 && profileActivity.o2) || view == null) {
                        i14 = 0;
                        profileActivity.c.h1(0, profileActivity.j4() - measuredWidth);
                        i13 = i14;
                        if (paddingTop == measuredWidth || profileActivity.a.getPaddingBottom() != max) {
                            profileActivity.a.setPadding(i14, measuredWidth, i14, max);
                            i15 = 1;
                        } else {
                            i15 = i13;
                        }
                        if (i15 != 0) {
                            measureChildWithMargins(profileActivity.a, i3, 0, i10, 0);
                            try {
                                hu0 hu0Var4 = profileActivity.a;
                                hu0Var4.layout(0, i16, hu0Var4.getMeasuredWidth(), profileActivity.a.getMeasuredHeight() + i16);
                            } catch (Exception e11) {
                                org.telegram.messenger.a8.g(e11, true);
                            }
                        }
                        this.i0 = false;
                    } else {
                        if (i11 == 0 && !profileActivity.o2 && top > profileActivity.j4()) {
                            top = profileActivity.j4();
                        }
                        profileActivity.c.h1(i11, top - measuredWidth);
                    }
                }
                i14 = 0;
                i13 = i14;
                if (paddingTop == measuredWidth) {
                }
                profileActivity.a.setPadding(i14, measuredWidth, i14, max);
                i15 = 1;
                if (i15 != 0) {
                }
                this.i0 = false;
            }
            i13 = 1;
            i14 = 0;
            if (paddingTop == measuredWidth) {
            }
            profileActivity.a.setPadding(i14, measuredWidth, i14, max);
            i15 = 1;
            if (i15 != 0) {
            }
            this.i0 = false;
        }
        boolean z13 = size > View.MeasureSpec.getSize(i3);
        if (z13 != this.k0) {
            post(new jv0(this, 0));
            this.k0 = z13;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        ProfileActivity profileActivity = this.n0;
        jh.d.c(profileActivity.K6, profileActivity.fragmentView);
        profileActivity.L6.d();
    }

    @Override // r0.k
    public final boolean p(View view, View view2, int i3, int i10) {
        return this.h0.K4 != -1 && i3 == 2;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.i0) {
            return;
        }
        super.requestLayout();
    }

    @Override // r0.k
    public final void s(View view, View view2, int i3, int i10) {
        this.g0.a = i3;
    }

    @Override // r0.k
    public final void t(View view, int i3, int i10, int[] iArr, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        int i12;
        org.telegram.ui.Components.tj0 currentListView;
        int L0;
        ProfileActivity profileActivity = this.h0;
        if (view == profileActivity.a) {
            if (profileActivity.K4 == -1 || !profileActivity.Q) {
                return;
            }
            kVar = ((org.telegram.ui.ActionBar.d2) profileActivity).actionBar;
            boolean z10 = kVar.o0;
            int top = profileActivity.O.getTop();
            boolean z11 = false;
            if (i10 >= 0) {
                if (z10) {
                    org.telegram.ui.Components.tj0 currentListView2 = profileActivity.O.getCurrentListView();
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
            if (top <= 0 && (currentListView = profileActivity.O.getCurrentListView()) != null && (L0 = ((u4.b0) currentListView.getLayoutManager()).L0()) != -1) {
                u4.d1 K = currentListView.K(L0);
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

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
    }

    @Override // r0.k
    public final void o(View view, int i3, int i10, int i11, int i12, int i13) {
    }
}
