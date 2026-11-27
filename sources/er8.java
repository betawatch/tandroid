// default package

import android.content.Context;
import android.graphics.Canvas;
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
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class er8 extends wma implements bl7 {
    public final l09 g0;
    public final /* synthetic */ ProfileActivity h0;
    public boolean i0;
    public final Paint j0;
    public boolean k0;
    public final ArrayList l0;
    public final qq7 m0;
    public final /* synthetic */ ProfileActivity n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public er8(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.n0 = profileActivity;
        this.h0 = profileActivity;
        this.g0 = new l09((byte) 3);
        this.j0 = new Paint();
        this.l0 = new ArrayList();
        this.m0 = new qq7((byte) 8);
    }

    @Override // wma, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        a aVar;
        ProfileActivity profileActivity = this.n0;
        hq8 hq8Var = profileActivity.y0;
        Paint paint = profileActivity.r2;
        Paint paint2 = profileActivity.z0;
        float f = profileActivity.G5;
        Paint paint3 = this.j0;
        if (f > 0.0f) {
            paint3.setColor(aob.v0(aob.a7, profileActivity.A0));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), profileActivity.c2(), paint3);
        }
        int i = aob.a7;
        paint.setColor(aob.v0(i, profileActivity.A0));
        if (profileActivity.a.getVisibility() == 0) {
            paint3.setColor(aob.v0(i, profileActivity.A0));
            if (profileActivity.H1) {
                paint.setAlpha((int) (profileActivity.a.getAlpha() * 255.0f));
            }
            if (profileActivity.H1) {
                paint3.setAlpha((int) (profileActivity.a.getAlpha() * 255.0f));
            }
            int childCount = profileActivity.a.getChildCount();
            ArrayList arrayList = this.l0;
            arrayList.clear();
            boolean z = false;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = profileActivity.a.getChildAt(i2);
                profileActivity.a.getClass();
                if (RecyclerView.S(childAt) != -1) {
                    arrayList.add(profileActivity.a.getChildAt(i2));
                } else {
                    z = true;
                }
            }
            Collections.sort(arrayList, this.m0);
            profileActivity.a.getY();
            int size = arrayList.size();
            if (!profileActivity.G1 && size > 0 && !z) {
                ((View) arrayList.get(0)).getY();
            }
            boolean z2 = false;
            for (int i3 = 0; i3 < size; i3++) {
                View view = (View) arrayList.get(i3);
                boolean z3 = view.getBackground() != null;
                profileActivity.a.getY();
                view.getY();
                if (z2 == z3) {
                    view.getAlpha();
                } else {
                    view.getAlpha();
                    z2 = z3;
                }
            }
        }
        super.dispatchDraw(canvas);
        if (hq8Var.getAlpha() > 0) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), profileActivity.y0);
        } else {
            canvas2 = canvas;
        }
        if (profileActivity.x0 != null) {
            int save = canvas.save();
            canvas.translate(profileActivity.x0.getLeft(), profileActivity.x0.getTop());
            View view2 = profileActivity.x0;
            aVar = ((e) profileActivity).actionBar;
            if (view2 == aVar.getBackButton()) {
                int max = Math.max(profileActivity.x0.getMeasuredWidth(), profileActivity.x0.getMeasuredHeight()) / 2;
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (((hq8Var.getAlpha() / 255.0f) * alpha) / 0.3f));
                float f2 = max;
                canvas.drawCircle(f2, f2, 0.7f * f2, paint2);
                paint2.setAlpha(alpha);
            }
            profileActivity.x0.draw(canvas);
            canvas.restoreToCount(save);
        }
        tb tbVar = profileActivity.U;
        if (tbVar != null && tbVar.getVisibility() == 0) {
            float alpha2 = profileActivity.U.getAlpha();
            tb tbVar2 = profileActivity.U;
            if (alpha2 == 1.0f) {
                tbVar2.draw(canvas);
            } else if (tbVar2.getAlpha() != 0.0f) {
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
        zp8 zp8Var = profileActivity.a;
        canvas.translate(zp8Var != null ? zp8Var.getTranslationX() : 0.0f, 0.0f);
        int v0 = aob.v0(aob.d6, profileActivity.A0);
        int i4 = profileActivity.P6;
        zp8 zp8Var2 = profileActivity.a;
        hl.O(canvas, this, v0, i4, zp8Var2 != null ? zp8Var2.getAlpha() : 0.0f);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        zha[] zhaVarArr;
        zha zhaVar;
        ProfileActivity profileActivity = this.n0;
        nq8 nq8Var = profileActivity.Z4;
        if (nq8Var.n) {
            return nq8Var.g(motionEvent);
        }
        gr8 gr8Var = profileActivity.O;
        if (gr8Var != null && (zhaVar = (zhaVarArr = gr8Var.n0)[0]) != null && zhaVar.h.getFastScroll() != null && zhaVarArr[0].h.getFastScroll().n) {
            gr8 gr8Var2 = profileActivity.O;
            if (gr8Var2.d) {
                return gr8Var2.I(motionEvent);
            }
        }
        gr8 gr8Var3 = profileActivity.O;
        if (gr8Var3 == null || !gr8Var3.A(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        a aVar;
        ProfileActivity profileActivity = this.n0;
        if (profileActivity.Z4.n) {
            if (view == profileActivity.Z) {
                return true;
            }
            aVar = ((e) profileActivity).actionBar;
            if (view == aVar || view == profileActivity.s) {
                return true;
            }
        }
        if (view == profileActivity.U) {
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // al7
    public final void k(int i, View view) {
        this.g0.b = 0;
    }

    @Override // bl7
    public final void l(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        ProfileActivity profileActivity = this.h0;
        byte b = 1;
        try {
            if (view == profileActivity.a && profileActivity.Q) {
                d79 currentListView = profileActivity.O.getCurrentListView();
                if (profileActivity.O.getTop() == 0) {
                    iArr[1] = i4;
                    currentListView.scrollBy(0, i4);
                }
            }
        } catch (Throwable th) {
            cc4.g(th, true);
            hl.c3(new dr8(this, b));
        }
    }

    @Override // al7
    public final boolean n(View view, View view2, int i, int i2) {
        return this.h0.N4 != -1 && i == 2;
    }

    @Override // wma, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ProfileActivity profileActivity = this.n0;
        profileActivity.H0 = true;
        ul ulVar = profileActivity.G;
        if (ulVar != null) {
            ulVar.a();
        }
        ul ulVar2 = profileActivity.H;
        if (ulVar2 != null) {
            ulVar2.a();
        }
    }

    @Override // wma, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ProfileActivity profileActivity = this.n0;
        profileActivity.H0 = false;
        ul ulVar = profileActivity.G;
        if (ulVar != null) {
            ulVar.b();
        }
        ul ulVar2 = profileActivity.H;
        if (ulVar2 != null) {
            ulVar2.b();
        }
    }

    @Override // wma, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ProfileActivity profileActivity = this.n0;
        profileActivity.r6 = -1;
        profileActivity.X4 = false;
        profileActivity.Y4 = false;
        profileActivity.G1();
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03af  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        a aVar;
        boolean z;
        int measuredWidth;
        int max;
        int i3;
        View view;
        a aVar2;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        char c;
        int measuredWidth2;
        int max2;
        a aVar3;
        a aVar4;
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        ProfileActivity profileActivity = this.n0;
        HashMap hashMap = profileActivity.Z1;
        aVar = ((e) profileActivity).actionBar;
        int i8 = currentActionBarHeight + (aVar.getOccupyStatusBar() ? hl.m : 0);
        zp8 zp8Var = profileActivity.a;
        if (zp8Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) zp8Var.getLayoutParams();
            if (layoutParams.topMargin != i8) {
                layoutParams.topMargin = i8;
            }
        }
        d79 d79Var = profileActivity.b;
        if (d79Var != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) d79Var.getLayoutParams();
            if (layoutParams2.topMargin != i8) {
                layoutParams2.topMargin = i8;
            }
        }
        int size = View.MeasureSpec.getSize(i2);
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        if (profileActivity.D0 == getMeasuredWidth() && profileActivity.E0 == getMeasuredHeight()) {
            z = false;
        } else {
            int i9 = profileActivity.D0;
            z = (i9 == 0 || i9 == getMeasuredWidth()) ? false : true;
            profileActivity.F0 = 0;
            int i10 = profileActivity.d.e.O2;
            profileActivity.D0 = getMeasuredWidth();
            profileActivity.E0 = getMeasuredHeight();
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(profileActivity.a.getMeasuredHeight(), 0);
            hashMap.clear();
            for (int i11 = 0; i11 < i10; i11++) {
                int d = profileActivity.d.d(i11);
                hashMap.put(Integer.valueOf(i11), Integer.valueOf(profileActivity.F0));
                if (d == 13) {
                    profileActivity.F0 = profileActivity.a.getMeasuredHeight() + profileActivity.F0;
                } else {
                    f89 a = profileActivity.d.a(null, d);
                    View view2 = a.a;
                    profileActivity.d.t(a, i11);
                    view2.measure(makeMeasureSpec, makeMeasureSpec2);
                    profileActivity.F0 = view2.getMeasuredHeight() + profileActivity.F0;
                }
            }
            z2b z2bVar = profileActivity.P;
            if (z2bVar != null) {
                ((FrameLayout.LayoutParams) z2bVar.getLayoutParams()).topMargin = profileActivity.d2() + hl.m;
            }
        }
        boolean z3 = profileActivity.r5;
        if (!z3 && ((z2 = profileActivity.n1) || (profileActivity.G1 && profileActivity.J1 == 2))) {
            this.i0 = true;
            if (z2) {
                sla slaVar = profileActivity.U0;
                if (slaVar != null) {
                    slaVar.setAlpha(0.0f);
                    profileActivity.U0.setEnabled(false);
                    profileActivity.U0.setVisibility(8);
                }
                profileActivity.f.setTextColor(-1);
                profileActivity.f.setPivotY(r4.getMeasuredHeight());
                profileActivity.f.setScaleX(1.38f);
                profileActivity.f.setScaleY(1.38f);
                yt9 yt9Var = profileActivity.L;
                if (yt9Var != null) {
                    yt9Var.b(-1275068417);
                }
                Drawable drawable = profileActivity.x;
                if (drawable != null) {
                    drawable.setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
                }
                e43 e43Var = profileActivity.J;
                if (e43Var != null) {
                    e43Var.a(1.0f);
                }
                e43 e43Var2 = profileActivity.K;
                if (e43Var2 != null) {
                    e43Var2.a(1.0f);
                }
                profileActivity.N3(1.0f);
                profileActivity.r.setTextColor(-1275068417);
                aVar3 = ((e) profileActivity).actionBar;
                aVar3.G(1090519039, false);
                aVar4 = ((e) profileActivity).actionBar;
                aVar4.H(-1, false);
                xr8 xr8Var = profileActivity.N;
                xr8Var.F = true;
                xr8Var.setVisibility(0);
                profileActivity.N.e(false, 1.0f);
                profileActivity.f0.setForegroundAlpha(1.0f);
                profileActivity.Y.setVisibility(4);
                profileActivity.o0.L();
                profileActivity.o0.setVisibility(0);
                gs8 gs8Var = profileActivity.F6;
                if (gs8Var != null) {
                    gs8Var.a(603979775);
                }
                lq8 lq8Var = profileActivity.v0;
                if (lq8Var != null) {
                    lq8Var.setExpandProgress(1.0f);
                }
                gu8 gu8Var = profileActivity.w0;
                if (gu8Var != null) {
                    gu8Var.setExpandProgress(1.0f);
                }
                ap8 ap8Var = profileActivity.a0;
                if (ap8Var != null) {
                    ap8Var.setParentExpanded(1.0f);
                }
                profileActivity.q3(1.0f);
                tu8 tu8Var = profileActivity.c0;
                if (tu8Var != null) {
                    tu8Var.setParentExpanded(1.0f);
                }
                jva jvaVar = profileActivity.T;
                if (jvaVar != null) {
                    jvaVar.setParentExpanded(1.0f);
                }
                c = 0;
                profileActivity.n1 = false;
                profileActivity.K3();
            } else {
                c = 0;
            }
            profileActivity.E1();
            profileActivity.p2 = true;
            profileActivity.q2 = true;
            jn7 e = jn7.e();
            Object[] objArr = new Object[1];
            objArr[c] = Boolean.TRUE;
            e.k(jn7.u4, objArr);
            if (profileActivity.T0 != null) {
                boolean q2 = profileActivity.q2();
                sla slaVar2 = profileActivity.T0;
                if (q2) {
                    slaVar2.u(21);
                } else {
                    slaVar2.S(21);
                }
                if (profileActivity.r0 != null) {
                    profileActivity.T0.S(34);
                    profileActivity.T0.S(35);
                    profileActivity.T0.u(31);
                }
            }
            profileActivity.m2 = 1.0f;
            if (profileActivity.o2) {
                measuredWidth2 = profileActivity.d2() + i8;
                max2 = 0;
            } else {
                measuredWidth2 = profileActivity.a.getMeasuredWidth() + profileActivity.X1();
                max2 = Math.max(0, getMeasuredHeight() - ((profileActivity.d2() + profileActivity.F0) + i8));
            }
            if (profileActivity.E1 != 0) {
                max2 += hl.L(48.0f) + hl.n;
                profileActivity.a.setBottomGlowOffset(hl.L(48.0f) + hl.n);
            } else {
                profileActivity.a.setBottomGlowOffset(0);
            }
            float f = measuredWidth2 - i8;
            profileActivity.S1 = f;
            if (profileActivity.J1 == 0) {
                profileActivity.Q1 = f;
            }
            profileActivity.c.g1(0, -i8);
            profileActivity.a.setPadding(0, measuredWidth2, 0, max2);
            measureChildWithMargins(profileActivity.a, i, 0, i2, 0);
            zp8 zp8Var2 = profileActivity.a;
            zp8Var2.layout(0, i8, zp8Var2.getMeasuredWidth(), profileActivity.a.getMeasuredHeight() + i8);
            this.i0 = false;
        } else if (z3 && !profileActivity.G1 && !profileActivity.X4) {
            this.i0 = true;
            if (profileActivity.J0 || !(profileActivity.o2 || hl.O1())) {
                measuredWidth = profileActivity.a.getMeasuredWidth() + profileActivity.X1();
                max = Math.max(0, getMeasuredHeight() - ((profileActivity.d2() + profileActivity.F0) + i8));
            } else {
                measuredWidth = profileActivity.d2();
                max = 0;
            }
            if (profileActivity.E1 != 0) {
                max += hl.L(48.0f) + hl.n;
                profileActivity.a.setBottomGlowOffset(hl.L(48.0f) + hl.n);
            } else {
                profileActivity.a.setBottomGlowOffset(0);
            }
            int paddingTop = profileActivity.a.getPaddingTop();
            int i12 = 0;
            while (true) {
                if (i12 >= profileActivity.a.getChildCount()) {
                    i3 = -1;
                    view = null;
                    break;
                } else {
                    i3 = RecyclerView.S(profileActivity.a.getChildAt(i12));
                    if (i3 != -1) {
                        view = profileActivity.a.getChildAt(i12);
                        break;
                    }
                    i12++;
                }
            }
            if (view == null && (view = profileActivity.a.getChildAt(0)) != null) {
                zp8 zp8Var3 = profileActivity.a;
                View G = zp8Var3.G(view);
                f89 U = G != null ? zp8Var3.U(G) : null;
                i3 = U.b();
                if (i3 == -1 && (i3 = U.g) == -1) {
                    i3 = U.c;
                }
            }
            int top = view != null ? view.getTop() : measuredWidth;
            aVar2 = ((e) profileActivity).actionBar;
            if ((aVar2.o0 || profileActivity.r1) && (i4 = profileActivity.N4) >= 0) {
                profileActivity.c.g1(i4, -measuredWidth);
            } else {
                if (profileActivity.Y4 || paddingTop != measuredWidth) {
                    int i13 = profileActivity.r6;
                    if (i13 >= 0) {
                        profileActivity.c.g1(i13, profileActivity.s6 - measuredWidth);
                    } else if ((z && profileActivity.p2) || view == null) {
                        i6 = 0;
                        profileActivity.c.g1(0, profileActivity.d2() - measuredWidth);
                        i5 = i6;
                        if (paddingTop == measuredWidth || profileActivity.a.getPaddingBottom() != max) {
                            profileActivity.a.setPadding(i6, measuredWidth, i6, max);
                            i7 = 1;
                        } else {
                            i7 = i5;
                        }
                        if (i7 != 0) {
                            measureChildWithMargins(profileActivity.a, i, 0, i2, 0);
                            try {
                                zp8 zp8Var4 = profileActivity.a;
                                zp8Var4.layout(0, i8, zp8Var4.getMeasuredWidth(), profileActivity.a.getMeasuredHeight() + i8);
                            } catch (Exception e2) {
                                cc4.g(e2, true);
                            }
                        }
                        this.i0 = false;
                    } else {
                        if (i3 == 0 && !profileActivity.p2 && top > profileActivity.d2()) {
                            top = profileActivity.d2();
                        }
                        profileActivity.c.g1(i3, top - measuredWidth);
                    }
                }
                i6 = 0;
                i5 = i6;
                if (paddingTop == measuredWidth) {
                }
                profileActivity.a.setPadding(i6, measuredWidth, i6, max);
                i7 = 1;
                if (i7 != 0) {
                }
                this.i0 = false;
            }
            i5 = 1;
            i6 = 0;
            if (paddingTop == measuredWidth) {
            }
            profileActivity.a.setPadding(i6, measuredWidth, i6, max);
            i7 = 1;
            if (i7 != 0) {
            }
            this.i0 = false;
        }
        boolean z4 = size > View.MeasureSpec.getSize(i);
        if (z4 != this.k0) {
            post(new dr8(this, (byte) 0));
            this.k0 = z4;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        ProfileActivity profileActivity = this.n0;
        uk0.c(profileActivity.Q6, profileActivity.fragmentView);
        profileActivity.R6.d();
    }

    @Override // al7
    public final void q(View view, View view2, int i, int i2) {
        this.g0.b = i;
    }

    @Override // al7
    public final void r(View view, int i, int i2, int[] iArr, int i3) {
        a aVar;
        int i4;
        d79 currentListView;
        int K0;
        ProfileActivity profileActivity = this.h0;
        if (view == profileActivity.a) {
            if (profileActivity.N4 == -1 || !profileActivity.Q) {
                return;
            }
            aVar = ((e) profileActivity).actionBar;
            boolean z = aVar.o0;
            int top = profileActivity.O.getTop();
            boolean z2 = false;
            if (i2 >= 0) {
                if (z) {
                    d79 currentListView2 = profileActivity.O.getCurrentListView();
                    iArr[1] = i2;
                    if (top > 0) {
                        iArr[1] = 0;
                    }
                    if (currentListView2 == null || (i4 = iArr[1]) <= 0) {
                        return;
                    }
                    currentListView2.scrollBy(0, i4);
                    return;
                }
                return;
            }
            if (top <= 0 && (currentListView = profileActivity.O.getCurrentListView()) != null && (K0 = ((x46) currentListView.getLayoutManager()).K0()) != -1) {
                f89 L = currentListView.L(K0);
                int top2 = L != null ? L.a.getTop() : -1;
                int paddingTop = currentListView.getPaddingTop();
                if (top2 != paddingTop || K0 != 0) {
                    iArr[1] = K0 != 0 ? i2 : Math.max(i2, top2 - paddingTop);
                    currentListView.scrollBy(0, i2);
                    z2 = true;
                }
            }
            if (z) {
                if (z2 || top >= 0) {
                    iArr[1] = i2;
                } else {
                    iArr[1] = i2 - Math.max(top, i2);
                }
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.i0) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
    }

    @Override // al7
    public final void m(View view, int i, int i2, int i3, int i4, int i5) {
    }
}
