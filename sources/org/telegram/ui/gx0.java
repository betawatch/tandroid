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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class gx0 extends org.telegram.ui.Components.uu0 implements r0.l {
    public final ac.g f0;
    public final /* synthetic */ ProfileActivity g0;
    public boolean h0;
    public final Paint i0;
    public boolean j0;
    public final ArrayList k0;
    public final ex0 l0;
    public final /* synthetic */ ProfileActivity m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gx0(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.m0 = profileActivity;
        this.g0 = profileActivity;
        this.f0 = new ac.g();
        this.i0 = new Paint();
        this.k0 = new ArrayList();
        this.l0 = new ex0(0);
    }

    @Override // org.telegram.ui.Components.uu0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.ActionBar.l lVar;
        ProfileActivity profileActivity = this.m0;
        org.telegram.ui.Components.l40 l40Var = profileActivity.x0;
        Paint paint = profileActivity.p2;
        Paint paint2 = profileActivity.y0;
        float f7 = profileActivity.A5;
        Paint paint3 = this.i0;
        if (f7 > 0.0f) {
            paint3.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.a7, profileActivity.z0));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), ProfileActivity.I0(profileActivity), paint3);
        }
        int i10 = org.telegram.ui.ActionBar.t6.a7;
        paint.setColor(org.telegram.ui.ActionBar.t6.w0(i10, profileActivity.z0));
        if (profileActivity.a.getVisibility() == 0) {
            paint3.setColor(org.telegram.ui.ActionBar.t6.w0(i10, profileActivity.z0));
            if (profileActivity.G1) {
                paint.setAlpha((int) (profileActivity.a.getAlpha() * 255.0f));
            }
            if (profileActivity.G1) {
                paint3.setAlpha((int) (profileActivity.a.getAlpha() * 255.0f));
            }
            int childCount = profileActivity.a.getChildCount();
            ArrayList arrayList = this.k0;
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
            Collections.sort(arrayList, this.l0);
            profileActivity.a.getY();
            int size = arrayList.size();
            if (!profileActivity.F1 && size > 0 && !z10) {
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
        if (l40Var.getAlpha() > 0) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), profileActivity.x0);
        } else {
            canvas2 = canvas;
        }
        if (profileActivity.w0 != null) {
            int save = canvas.save();
            canvas.translate(profileActivity.w0.getLeft(), profileActivity.w0.getTop());
            View view2 = profileActivity.w0;
            lVar = ((org.telegram.ui.ActionBar.k2) profileActivity).actionBar;
            if (view2 == lVar.getBackButton()) {
                int max = Math.max(profileActivity.w0.getMeasuredWidth(), profileActivity.w0.getMeasuredHeight()) / 2;
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (((l40Var.getAlpha() / 255.0f) * alpha) / 0.3f));
                float f10 = max;
                canvas.drawCircle(f10, f10, 0.7f * f10, paint2);
                paint2.setAlpha(alpha);
            }
            profileActivity.w0.draw(canvas);
            canvas.restoreToCount(save);
        }
        do0 do0Var = profileActivity.T;
        if (do0Var != null && do0Var.getVisibility() == 0) {
            if (profileActivity.T.getAlpha() == 1.0f) {
                profileActivity.T.draw(canvas);
            } else if (profileActivity.T.getAlpha() != 0.0f) {
                canvas2.saveLayerAlpha(profileActivity.T.getLeft(), profileActivity.T.getTop(), profileActivity.T.getRight(), profileActivity.T.getBottom(), (int) (profileActivity.T.getAlpha() * 255.0f), 31);
                canvas.translate(profileActivity.T.getLeft(), profileActivity.T.getTop());
                profileActivity.T.draw(canvas);
                canvas.restore();
            }
        }
        if (profileActivity.I0) {
            return;
        }
        canvas.save();
        bw0 bw0Var = profileActivity.a;
        canvas.translate(bw0Var != null ? bw0Var.getTranslationX() : 0.0f, 0.0f);
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, profileActivity.z0);
        int i13 = profileActivity.H6;
        bw0 bw0Var2 = profileActivity.a;
        org.telegram.messenger.i0.O(canvas, this, w02, i13, bw0Var2 != null ? bw0Var2.getAlpha() : 0.0f);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.ss0[] ss0VarArr;
        org.telegram.ui.Components.ss0 ss0Var;
        ProfileActivity profileActivity = this.m0;
        ow0 ow0Var = profileActivity.V4;
        if (ow0Var.n) {
            return ow0Var.g(motionEvent);
        }
        ix0 ix0Var = profileActivity.N;
        if (ix0Var != null && (ss0Var = (ss0VarArr = ix0Var.m0)[0]) != null && ss0Var.h.getFastScroll() != null && ss0VarArr[0].h.getFastScroll().n) {
            ix0 ix0Var2 = profileActivity.N;
            if (ix0Var2.d) {
                return ix0Var2.X(motionEvent);
            }
        }
        ix0 ix0Var3 = profileActivity.N;
        if (ix0Var3 == null || !ix0Var3.O(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.l lVar;
        ProfileActivity profileActivity = this.m0;
        if (profileActivity.V4.n) {
            if (view == profileActivity.Y) {
                return true;
            }
            lVar = ((org.telegram.ui.ActionBar.k2) profileActivity).actionBar;
            if (view == lVar || view == profileActivity.s) {
                return true;
            }
        }
        if (view == profileActivity.T) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // r0.k
    public final void k(int i10, View view) {
        this.f0.a = 0;
    }

    @Override // r0.l
    public final void l(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        ProfileActivity profileActivity = this.g0;
        try {
            if (view == profileActivity.a && profileActivity.P) {
                org.telegram.ui.Components.tk0 currentListView = profileActivity.N.getCurrentListView();
                if (profileActivity.N.getTop() == 0) {
                    iArr[1] = i13;
                    currentListView.scrollBy(0, i13);
                }
            }
        } catch (Throwable th2) {
            org.telegram.messenger.f8.g(th2, true);
            org.telegram.messenger.i0.g3(new fx0(this, 1));
        }
    }

    @Override // r0.k
    public final boolean n(View view, View view2, int i10, int i11) {
        return this.g0.J4 != -1 && i10 == 2;
    }

    @Override // org.telegram.ui.Components.uu0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ProfileActivity profileActivity = this.m0;
        profileActivity.G0 = true;
        org.telegram.ui.Components.d5 d5Var = profileActivity.F;
        if (d5Var != null) {
            d5Var.a();
        }
        org.telegram.ui.Components.d5 d5Var2 = profileActivity.G;
        if (d5Var2 != null) {
            d5Var2.a();
        }
    }

    @Override // org.telegram.ui.Components.uu0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ProfileActivity profileActivity = this.m0;
        profileActivity.G0 = false;
        org.telegram.ui.Components.d5 d5Var = profileActivity.F;
        if (d5Var != null) {
            d5Var.b();
        }
        org.telegram.ui.Components.d5 d5Var2 = profileActivity.G;
        if (d5Var2 != null) {
            d5Var2.b();
        }
    }

    @Override // org.telegram.ui.Components.uu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ProfileActivity profileActivity = this.m0;
        profileActivity.j6 = -1;
        profileActivity.T4 = false;
        profileActivity.U4 = false;
        profileActivity.N3();
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03be  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.l lVar;
        boolean z10;
        int measuredWidth;
        int max;
        int i12;
        View view;
        org.telegram.ui.ActionBar.l lVar2;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z11;
        char c10;
        int measuredWidth2;
        int max2;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        ProfileActivity profileActivity = this.m0;
        HashMap hashMap = profileActivity.X1;
        lVar = ((org.telegram.ui.ActionBar.k2) profileActivity).actionBar;
        int i17 = currentActionBarHeight + (lVar.getOccupyStatusBar() ? org.telegram.messenger.i0.m : 0);
        bw0 bw0Var = profileActivity.a;
        if (bw0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) bw0Var.getLayoutParams();
            if (layoutParams.topMargin != i17) {
                layoutParams.topMargin = i17;
            }
        }
        org.telegram.ui.Components.tk0 tk0Var = profileActivity.b;
        if (tk0Var != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) tk0Var.getLayoutParams();
            if (layoutParams2.topMargin != i17) {
                layoutParams2.topMargin = i17;
            }
        }
        int size = View.MeasureSpec.getSize(i11);
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        if (profileActivity.C0 == getMeasuredWidth() && profileActivity.D0 == getMeasuredHeight()) {
            z10 = false;
        } else {
            int i18 = profileActivity.C0;
            z10 = (i18 == 0 || i18 == getMeasuredWidth()) ? false : true;
            profileActivity.E0 = 0;
            int i19 = profileActivity.d.e.M2;
            profileActivity.C0 = getMeasuredWidth();
            profileActivity.D0 = getMeasuredHeight();
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(profileActivity.a.getMeasuredHeight(), 0);
            hashMap.clear();
            for (int i20 = 0; i20 < i19; i20++) {
                int d = profileActivity.d.d(i20);
                hashMap.put(Integer.valueOf(i20), Integer.valueOf(profileActivity.E0));
                if (d == 13) {
                    profileActivity.E0 += profileActivity.a.getMeasuredHeight();
                } else {
                    s4.c1 a2 = profileActivity.d.a(null, d);
                    View view2 = a2.a;
                    profileActivity.d.t(a2, i20);
                    view2.measure(makeMeasureSpec, makeMeasureSpec2);
                    profileActivity.E0 += view2.getMeasuredHeight();
                }
            }
            org.telegram.ui.Components.dw0 dw0Var = profileActivity.O;
            if (dw0Var != null) {
                ((FrameLayout.LayoutParams) dw0Var.getLayoutParams()).topMargin = profileActivity.i4() + org.telegram.messenger.i0.m;
            }
        }
        boolean z12 = profileActivity.l5;
        if (!z12 && ((z11 = profileActivity.m1) || (profileActivity.F1 && profileActivity.I1 == 2))) {
            this.h0 = true;
            if (z11) {
                org.telegram.ui.ActionBar.p5 p5Var = profileActivity.T0;
                if (p5Var != null) {
                    p5Var.setAlpha(0.0f);
                    profileActivity.T0.setEnabled(false);
                    profileActivity.T0.setVisibility(8);
                }
                profileActivity.f.setTextColor(-1);
                profileActivity.f.setPivotY(r4.getMeasuredHeight());
                profileActivity.f.setScaleX(1.38f);
                profileActivity.f.setScaleY(1.38f);
                org.telegram.ui.Components.kl0 kl0Var = profileActivity.K;
                if (kl0Var != null) {
                    kl0Var.b(Color.argb(org.telegram.messenger.zs.J2, org.telegram.messenger.zs.e4, org.telegram.messenger.zs.e4, org.telegram.messenger.zs.e4));
                }
                Drawable drawable = profileActivity.x;
                if (drawable != null) {
                    drawable.setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
                }
                org.telegram.ui.Components.fr frVar = profileActivity.I;
                if (frVar != null) {
                    frVar.a(1.0f);
                }
                org.telegram.ui.Components.fr frVar2 = profileActivity.J;
                if (frVar2 != null) {
                    frVar2.a(1.0f);
                }
                profileActivity.s5(1.0f);
                profileActivity.r.setTextColor(-1275068417);
                lVar3 = ((org.telegram.ui.ActionBar.k2) profileActivity).actionBar;
                lVar3.C(1090519039, false);
                lVar4 = ((org.telegram.ui.ActionBar.k2) profileActivity).actionBar;
                lVar4.D(-1, false);
                yx0 yx0Var = profileActivity.M;
                yx0Var.E = true;
                yx0Var.setVisibility(0);
                profileActivity.M.e(false, 1.0f);
                profileActivity.e0.setForegroundAlpha(1.0f);
                profileActivity.X.setVisibility(4);
                profileActivity.n0.L();
                profileActivity.n0.setVisibility(0);
                iy0 iy0Var = profileActivity.x6;
                if (iy0Var != null) {
                    iy0Var.a(603979775);
                }
                mw0 mw0Var = profileActivity.u0;
                if (mw0Var != null) {
                    mw0Var.setExpandProgress(1.0f);
                }
                rh.g0 g0Var = profileActivity.v0;
                if (g0Var != null) {
                    g0Var.setExpandProgress(1.0f);
                }
                org.telegram.ui.Components.hg0 hg0Var = profileActivity.Z;
                if (hg0Var != null) {
                    hg0Var.setParentExpanded(1.0f);
                }
                profileActivity.Y4(1.0f);
                org.telegram.ui.Components.bh0 bh0Var = profileActivity.b0;
                if (bh0Var != null) {
                    bh0Var.setParentExpanded(1.0f);
                }
                org.telegram.ui.Components.nv0 nv0Var = profileActivity.S;
                if (nv0Var != null) {
                    nv0Var.setParentExpanded(1.0f);
                }
                c10 = 0;
                profileActivity.m1 = false;
                profileActivity.p5();
            } else {
                c10 = 0;
            }
            profileActivity.L3();
            profileActivity.n2 = true;
            profileActivity.o2 = true;
            org.telegram.messenger.zs e = org.telegram.messenger.zs.e();
            Object[] objArr = new Object[1];
            objArr[c10] = Boolean.TRUE;
            e.k(org.telegram.messenger.zs.r4, objArr);
            if (profileActivity.S0 != null) {
                if (profileActivity.t4()) {
                    profileActivity.S0.t(21);
                } else {
                    profileActivity.S0.S(21);
                }
                if (profileActivity.q0 != null) {
                    profileActivity.S0.S(34);
                    profileActivity.S0.S(35);
                    profileActivity.S0.t(31);
                }
            }
            profileActivity.k2 = 1.0f;
            if (profileActivity.m2) {
                measuredWidth2 = profileActivity.i4() + i17;
                max2 = 0;
            } else {
                measuredWidth2 = profileActivity.a.getMeasuredWidth() + profileActivity.d4();
                max2 = Math.max(0, getMeasuredHeight() - ((profileActivity.i4() + profileActivity.E0) + i17));
            }
            if (profileActivity.D1 != 0) {
                max2 += org.telegram.messenger.i0.L(48.0f) + org.telegram.messenger.i0.n;
                profileActivity.a.setBottomGlowOffset(org.telegram.messenger.i0.L(48.0f) + org.telegram.messenger.i0.n);
            } else {
                profileActivity.a.setBottomGlowOffset(0);
            }
            float f7 = measuredWidth2 - i17;
            profileActivity.Q1 = f7;
            if (profileActivity.I1 == 0) {
                profileActivity.P1 = f7;
            }
            profileActivity.c.h1(0, -i17);
            profileActivity.a.setPadding(0, measuredWidth2, 0, max2);
            measureChildWithMargins(profileActivity.a, i10, 0, i11, 0);
            bw0 bw0Var2 = profileActivity.a;
            bw0Var2.layout(0, i17, bw0Var2.getMeasuredWidth(), profileActivity.a.getMeasuredHeight() + i17);
            this.h0 = false;
        } else if (z12 && !profileActivity.F1 && !profileActivity.T4) {
            this.h0 = true;
            if (profileActivity.I0 || !(profileActivity.m2 || org.telegram.messenger.i0.Q1())) {
                measuredWidth = profileActivity.a.getMeasuredWidth() + profileActivity.d4();
                max = Math.max(0, getMeasuredHeight() - ((profileActivity.i4() + profileActivity.E0) + i17));
            } else {
                measuredWidth = profileActivity.i4();
                max = 0;
            }
            if (profileActivity.D1 != 0) {
                max += org.telegram.messenger.i0.L(48.0f) + org.telegram.messenger.i0.n;
                profileActivity.a.setBottomGlowOffset(org.telegram.messenger.i0.L(48.0f) + org.telegram.messenger.i0.n);
            } else {
                profileActivity.a.setBottomGlowOffset(0);
            }
            int paddingTop = profileActivity.a.getPaddingTop();
            int i21 = 0;
            while (true) {
                if (i21 >= profileActivity.a.getChildCount()) {
                    i12 = -1;
                    view = null;
                    break;
                } else {
                    i12 = RecyclerView.R(profileActivity.a.getChildAt(i21));
                    if (i12 != -1) {
                        view = profileActivity.a.getChildAt(i21);
                        break;
                    }
                    i21++;
                }
            }
            if (view == null && (view = profileActivity.a.getChildAt(0)) != null) {
                bw0 bw0Var3 = profileActivity.a;
                View F = bw0Var3.F(view);
                s4.c1 T = F != null ? bw0Var3.T(F) : null;
                i12 = T.b();
                if (i12 == -1 && (i12 = T.g) == -1) {
                    i12 = T.c;
                }
            }
            int top = view != null ? view.getTop() : measuredWidth;
            lVar2 = ((org.telegram.ui.ActionBar.k2) profileActivity).actionBar;
            if ((lVar2.n0 || profileActivity.q1) && (i13 = profileActivity.J4) >= 0) {
                profileActivity.c.h1(i13, -measuredWidth);
            } else {
                if (profileActivity.U4 || paddingTop != measuredWidth) {
                    int i22 = profileActivity.j6;
                    if (i22 >= 0) {
                        profileActivity.c.h1(i22, profileActivity.k6 - measuredWidth);
                    } else if ((z10 && profileActivity.n2) || view == null) {
                        i15 = 0;
                        profileActivity.c.h1(0, profileActivity.i4() - measuredWidth);
                        i14 = i15;
                        if (paddingTop == measuredWidth || profileActivity.a.getPaddingBottom() != max) {
                            profileActivity.a.setPadding(i15, measuredWidth, i15, max);
                            i16 = 1;
                        } else {
                            i16 = i14;
                        }
                        if (i16 != 0) {
                            measureChildWithMargins(profileActivity.a, i10, 0, i11, 0);
                            try {
                                bw0 bw0Var4 = profileActivity.a;
                                bw0Var4.layout(0, i17, bw0Var4.getMeasuredWidth(), profileActivity.a.getMeasuredHeight() + i17);
                            } catch (Exception e7) {
                                org.telegram.messenger.f8.g(e7, true);
                            }
                        }
                        this.h0 = false;
                    } else {
                        if (i12 == 0 && !profileActivity.n2 && top > profileActivity.i4()) {
                            top = profileActivity.i4();
                        }
                        profileActivity.c.h1(i12, top - measuredWidth);
                    }
                }
                i15 = 0;
                i14 = i15;
                if (paddingTop == measuredWidth) {
                }
                profileActivity.a.setPadding(i15, measuredWidth, i15, max);
                i16 = 1;
                if (i16 != 0) {
                }
                this.h0 = false;
            }
            i14 = 1;
            i15 = 0;
            if (paddingTop == measuredWidth) {
            }
            profileActivity.a.setPadding(i15, measuredWidth, i15, max);
            i16 = 1;
            if (i16 != 0) {
            }
            this.h0 = false;
        }
        boolean z13 = size > View.MeasureSpec.getSize(i10);
        if (z13 != this.j0) {
            post(new fx0(this, 0));
            this.j0 = z13;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        ProfileActivity profileActivity = this.m0;
        yg.d.c(profileActivity.I6, profileActivity.fragmentView);
        profileActivity.J6.d();
    }

    @Override // r0.k
    public final void q(View view, View view2, int i10, int i11) {
        this.f0.a = i10;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.h0) {
            return;
        }
        super.requestLayout();
    }

    @Override // r0.k
    public final void s(View view, int i10, int i11, int[] iArr, int i12) {
        org.telegram.ui.ActionBar.l lVar;
        int i13;
        org.telegram.ui.Components.tk0 currentListView;
        int L0;
        ProfileActivity profileActivity = this.g0;
        if (view == profileActivity.a) {
            if (profileActivity.J4 == -1 || !profileActivity.P) {
                return;
            }
            lVar = ((org.telegram.ui.ActionBar.k2) profileActivity).actionBar;
            boolean z10 = lVar.n0;
            int top = profileActivity.N.getTop();
            boolean z11 = false;
            if (i11 >= 0) {
                if (z10) {
                    org.telegram.ui.Components.tk0 currentListView2 = profileActivity.N.getCurrentListView();
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
            if (top <= 0 && (currentListView = profileActivity.N.getCurrentListView()) != null && (L0 = ((s4.a0) currentListView.getLayoutManager()).L0()) != -1) {
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

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
    }

    @Override // r0.k
    public final void m(View view, int i10, int i11, int i12, int i13, int i14) {
    }
}
