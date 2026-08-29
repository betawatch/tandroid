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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class fz0 extends org.telegram.ui.Components.hv0 implements r0.n {
    public final a5.e s0;
    public final /* synthetic */ ProfileActivity t0;
    public boolean u0;
    public final Paint v0;
    public boolean w0;
    public final ArrayList x0;
    public final org.telegram.ui.Components.wp0 y0;
    public final /* synthetic */ ProfileActivity z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz0(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.z0 = profileActivity;
        this.t0 = profileActivity;
        this.s0 = new a5.e();
        this.v0 = new Paint();
        this.x0 = new ArrayList();
        this.y0 = new org.telegram.ui.Components.wp0(11);
    }

    @Override // r0.m
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        org.telegram.ui.ActionBar.l lVar;
        int i13;
        org.telegram.ui.Components.jl0 currentListView;
        int L0;
        ProfileActivity profileActivity = this.t0;
        if (viewGroup == profileActivity.a) {
            if (profileActivity.F4 == -1 || !profileActivity.M) {
                return;
            }
            lVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
            boolean z10 = lVar.j0;
            int top = profileActivity.K.getTop();
            boolean z11 = false;
            if (i11 >= 0) {
                if (z10) {
                    org.telegram.ui.Components.jl0 currentListView2 = profileActivity.K.getCurrentListView();
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
            if (top <= 0 && (currentListView = profileActivity.K.getCurrentListView()) != null && (L0 = ((f2.j0) currentListView.getLayoutManager()).L0()) != -1) {
                f2.n1 K = currentListView.K(L0);
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

    @Override // org.telegram.ui.Components.hv0
    public final void L(Canvas canvas, ArrayList arrayList) {
        canvas.save();
        ProfileActivity profileActivity = this.t0;
        canvas.translate(0.0f, profileActivity.a.getY());
        profileActivity.K.Q(canvas, arrayList);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.hv0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.l lVar;
        ProfileActivity profileActivity = this.z0;
        org.telegram.ui.Components.d50 d50Var = profileActivity.t0;
        Paint paint = profileActivity.m2;
        qg.d dVar = profileActivity.j6;
        lg.e eVar = profileActivity.i6;
        Paint paint2 = profileActivity.u0;
        if (Build.VERSION.SDK_INT >= 31 && eVar != null) {
            ProfileActivity.B0(profileActivity);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (dVar != null && !dVar.n) {
                RecordingCanvas a2 = dVar.a(measuredWidth, measuredHeight);
                a2.drawColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.a7, profileActivity.v0));
                if (SharedConfig.chatBlurEnabled()) {
                    eVar.b(a2, -2);
                }
                dVar.b();
            }
        }
        int i10 = org.telegram.ui.ActionBar.g6.a7;
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(i10, profileActivity.v0));
        if (profileActivity.a.getVisibility() == 0) {
            int v02 = org.telegram.ui.ActionBar.g6.v0(i10, profileActivity.v0);
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
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = profileActivity.a.getChildAt(i11);
                profileActivity.a.getClass();
                if (RecyclerView.R(childAt) != -1) {
                    arrayList.add(profileActivity.a.getChildAt(i11));
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
        if (d50Var.getAlpha() > 0) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), profileActivity.t0);
        }
        if (profileActivity.s0 != null) {
            int save = canvas.save();
            canvas.translate(profileActivity.s0.getLeft(), profileActivity.s0.getTop());
            View view2 = profileActivity.s0;
            lVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
            if (view2 == lVar.getBackButton()) {
                int max = Math.max(profileActivity.s0.getMeasuredWidth(), profileActivity.s0.getMeasuredHeight()) / 2;
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (((d50Var.getAlpha() / 255.0f) * alpha) / 0.3f));
                float f9 = max;
                canvas.drawCircle(f9, f9, 0.7f * f9, paint2);
                paint2.setAlpha(alpha);
            }
            profileActivity.s0.draw(canvas);
            canvas.restoreToCount(save);
        }
        op0 op0Var = profileActivity.Q;
        if (op0Var != null && op0Var.getVisibility() == 0) {
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
        int v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, profileActivity.v0);
        int i13 = profileActivity.h6;
        by0 by0Var2 = profileActivity.a;
        AndroidUtilities.drawNavigationBarProtection(canvas, this, v03, i13, by0Var2 != null ? by0Var2.getAlpha() : 0.0f);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.it0[] it0VarArr;
        org.telegram.ui.Components.it0 it0Var;
        ProfileActivity profileActivity = this.z0;
        qy0 qy0Var = profileActivity.R4;
        if (qy0Var.n) {
            return qy0Var.g(motionEvent);
        }
        hz0 hz0Var = profileActivity.K;
        if (hz0Var != null && (it0Var = (it0VarArr = hz0Var.g0)[0]) != null && it0Var.h.getFastScroll() != null && it0VarArr[0].h.getFastScroll().n) {
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
        org.telegram.ui.ActionBar.l lVar;
        ProfileActivity profileActivity = this.z0;
        if (profileActivity.R4.n) {
            if (view == profileActivity.V) {
                return true;
            }
            lVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
            if (view == lVar || view == profileActivity.v) {
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
    public final void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        ProfileActivity profileActivity = this.t0;
        try {
            if (viewGroup == profileActivity.a && profileActivity.M) {
                org.telegram.ui.Components.jl0 currentListView = profileActivity.K.getCurrentListView();
                if (profileActivity.K.getTop() == 0) {
                    iArr[1] = i13;
                    currentListView.scrollBy(0, i13);
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
            AndroidUtilities.runOnUIThread(new ez0(this, 1));
        }
    }

    @Override // r0.m
    public final void n(int i10, View view) {
        this.s0.a = 0;
    }

    @Override // r0.m
    public final boolean o(View view, View view2, int i10, int i11) {
        return this.t0.F4 != -1 && i10 == 2;
    }

    @Override // org.telegram.ui.Components.hv0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ProfileActivity profileActivity = this.z0;
        profileActivity.C0 = true;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.n5[] n5VarArr = profileActivity.C;
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
            org.telegram.ui.Components.n5[] n5VarArr2 = profileActivity.D;
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

    @Override // org.telegram.ui.Components.hv0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ProfileActivity profileActivity = this.z0;
        int i10 = 0;
        profileActivity.C0 = false;
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.n5[] n5VarArr = profileActivity.C;
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
            org.telegram.ui.Components.n5[] n5VarArr2 = profileActivity.D;
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

    @Override // org.telegram.ui.Components.hv0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
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
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.l lVar;
        boolean z10;
        char c3;
        org.telegram.ui.Components.ir[] irVarArr;
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
        char c6;
        int measuredWidth2;
        int max2;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        ProfileActivity profileActivity = this.z0;
        org.telegram.ui.Components.ir[] irVarArr2 = profileActivity.G;
        org.telegram.ui.Components.ir[] irVarArr3 = profileActivity.F;
        HashMap hashMap = profileActivity.U1;
        org.telegram.ui.ActionBar.h5[] h5VarArr = profileActivity.f;
        lVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
        int i15 = 0;
        int i16 = currentActionBarHeight + (lVar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
        by0 by0Var = profileActivity.a;
        if (by0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) by0Var.getLayoutParams();
            if (layoutParams.topMargin != i16) {
                layoutParams.topMargin = i16;
            }
        }
        org.telegram.ui.Components.jl0 jl0Var = profileActivity.b;
        if (jl0Var != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) jl0Var.getLayoutParams();
            if (layoutParams2.topMargin != i16) {
                layoutParams2.topMargin = i16;
            }
        }
        int size = View.MeasureSpec.getSize(i11);
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        if (profileActivity.y0 == getMeasuredWidth() && profileActivity.z0 == getMeasuredHeight()) {
            irVarArr = irVarArr2;
            z10 = false;
            c3 = 0;
        } else {
            int i17 = profileActivity.y0;
            z10 = (i17 == 0 || i17 == getMeasuredWidth()) ? false : true;
            profileActivity.A0 = 0;
            int i18 = profileActivity.d.e.J2;
            profileActivity.y0 = getMeasuredWidth();
            profileActivity.z0 = getMeasuredHeight();
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(profileActivity.a.getMeasuredHeight(), 0);
            hashMap.clear();
            c3 = 0;
            while (i15 < i18) {
                int j10 = profileActivity.d.j(i15);
                org.telegram.ui.Components.ir[] irVarArr4 = irVarArr2;
                hashMap.put(Integer.valueOf(i15), Integer.valueOf(profileActivity.A0));
                if (j10 == 13) {
                    profileActivity.A0 += profileActivity.a.getMeasuredHeight();
                } else {
                    f2.n1 g10 = profileActivity.d.g(null, j10);
                    View view2 = g10.a;
                    profileActivity.d.v(g10, i15);
                    view2.measure(makeMeasureSpec, makeMeasureSpec2);
                    profileActivity.A0 += view2.getMeasuredHeight();
                }
                i15++;
                irVarArr2 = irVarArr4;
            }
            irVarArr = irVarArr2;
            org.telegram.ui.Components.qw0 qw0Var = profileActivity.L;
            if (qw0Var != null) {
                ((FrameLayout.LayoutParams) qw0Var.getLayoutParams()).topMargin = profileActivity.T3() + AndroidUtilities.statusBarHeight;
            }
        }
        if (profileActivity.c5 != null) {
            org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[c3];
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
                org.telegram.ui.Components.vl0 vl0Var = profileActivity.H;
                if (vl0Var != null) {
                    vl0Var.b(Color.argb(179, 255, 255, 255));
                }
                Drawable drawable = profileActivity.x;
                if (drawable != null) {
                    drawable.setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
                }
                org.telegram.ui.Components.ir irVar = irVarArr3[0];
                if (irVar != null) {
                    irVar.b(1.0f);
                }
                org.telegram.ui.Components.ir irVar2 = irVarArr3[1];
                if (irVar2 != null) {
                    irVar2.b(1.0f);
                }
                org.telegram.ui.Components.ir irVar3 = irVarArr[0];
                if (irVar3 != null) {
                    irVar3.b(1.0f);
                }
                org.telegram.ui.Components.ir irVar4 = irVarArr[1];
                if (irVar4 != null) {
                    irVar4.b(1.0f);
                }
                profileActivity.Y4(1.0f);
                profileActivity.r[1].setTextColor(-1275068417);
                lVar3 = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
                lVar3.B(1090519039, false);
                lVar4 = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
                lVar4.C(-1, false);
                wz0 wz0Var = profileActivity.J;
                wz0Var.A = true;
                wz0Var.setVisibility(0);
                profileActivity.J.e(1.0f, false);
                profileActivity.a0.setForegroundAlpha(1.0f);
                profileActivity.U.setVisibility(4);
                profileActivity.j0.L();
                profileActivity.j0.setVisibility(0);
                h01 h01Var = profileActivity.X5;
                if (h01Var != null) {
                    h01Var.a(603979775);
                }
                oy0 oy0Var = profileActivity.q0;
                if (oy0Var != null) {
                    oy0Var.setExpandProgress(1.0f);
                }
                jh.u0 u0Var = profileActivity.r0;
                if (u0Var != null) {
                    u0Var.setExpandProgress(1.0f);
                }
                org.telegram.ui.Components.zg0 zg0Var = profileActivity.W;
                if (zg0Var != null) {
                    zg0Var.setParentExpanded(1.0f);
                }
                org.telegram.ui.Components.rh0 rh0Var = profileActivity.Y;
                if (rh0Var != null) {
                    rh0Var.setParentExpanded(1.0f);
                }
                org.telegram.ui.Components.aw0 aw0Var = profileActivity.P;
                if (aw0Var != null) {
                    aw0Var.setParentExpanded(1.0f);
                }
                c6 = 0;
                profileActivity.j1 = false;
                profileActivity.V4();
            } else {
                c6 = 0;
            }
            profileActivity.z3();
            profileActivity.k2 = true;
            profileActivity.l2 = true;
            NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
            int i19 = NotificationCenter.needCheckSystemBarColors;
            Object[] objArr = new Object[1];
            objArr[c6] = Boolean.TRUE;
            globalInstance.lambda$postNotificationNameOnUIThread$1(i19, objArr);
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
                measuredWidth2 = profileActivity.T3() + i16;
                max2 = 0;
            } else {
                measuredWidth2 = profileActivity.a.getMeasuredWidth() + profileActivity.O3();
                max2 = Math.max(0, getMeasuredHeight() - ((profileActivity.T3() + profileActivity.A0) + i16));
            }
            if (profileActivity.A1 != 0) {
                max2 += AndroidUtilities.dp(48.0f) + AndroidUtilities.navigationBarHeight;
                profileActivity.a.setBottomGlowOffset(AndroidUtilities.dp(48.0f) + AndroidUtilities.navigationBarHeight);
            } else {
                profileActivity.a.setBottomGlowOffset(0);
            }
            float f9 = measuredWidth2 - i16;
            profileActivity.N1 = f9;
            if (profileActivity.F1 == 0) {
                profileActivity.M1 = f9;
            }
            profileActivity.c.h1(0, -i16);
            profileActivity.a.setPadding(0, measuredWidth2, 0, max2);
            measureChildWithMargins(profileActivity.a, i10, 0, i11, 0);
            by0 by0Var2 = profileActivity.a;
            by0Var2.layout(0, i16, by0Var2.getMeasuredWidth(), profileActivity.a.getMeasuredHeight() + i16);
            this.u0 = false;
        } else if (z15 && !profileActivity.C1 && !profileActivity.P4) {
            this.u0 = true;
            if (profileActivity.E0 || !(profileActivity.j2 || AndroidUtilities.isTablet())) {
                measuredWidth = profileActivity.a.getMeasuredWidth() + profileActivity.O3();
                max = Math.max(0, getMeasuredHeight() - ((profileActivity.T3() + profileActivity.A0) + i16));
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
                by0 by0Var3 = profileActivity.a;
                View F = by0Var3.F(view);
                f2.n1 T = F == null ? null : by0Var3.T(F);
                i12 = T.b();
                if (i12 == -1 && (i12 = T.g) == -1) {
                    i12 = T.c;
                }
            }
            int top = view != null ? view.getTop() : measuredWidth;
            lVar2 = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
            if ((lVar2.j0 || profileActivity.n1) && (i13 = profileActivity.F4) >= 0) {
                profileActivity.c.h1(i13, -measuredWidth);
            } else {
                if (profileActivity.Q4 || paddingTop != measuredWidth) {
                    int i21 = profileActivity.Q5;
                    if (i21 >= 0) {
                        profileActivity.c.h1(i21, profileActivity.R5 - measuredWidth);
                    } else {
                        if ((z10 && profileActivity.k2) || view == null) {
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
                                    by0 by0Var4 = profileActivity.a;
                                    by0Var4.layout(0, i16, by0Var4.getMeasuredWidth(), profileActivity.a.getMeasuredHeight() + i16);
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                }
                            }
                            this.u0 = false;
                            z13 = size <= View.MeasureSpec.getSize(i10);
                            if (z13 == this.w0) {
                                post(new ez0(this, 0));
                                this.w0 = z13;
                                return;
                            }
                            return;
                        }
                        if (i12 == 0 && !profileActivity.k2 && top > profileActivity.T3()) {
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
                this.u0 = false;
                if (size <= View.MeasureSpec.getSize(i10)) {
                }
                if (z13 == this.w0) {
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
            this.u0 = false;
            if (size <= View.MeasureSpec.getSize(i10)) {
            }
            if (z13 == this.w0) {
            }
        }
        if (size <= View.MeasureSpec.getSize(i10)) {
        }
        if (z13 == this.w0) {
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        ProfileActivity profileActivity = this.z0;
        rg.c.c(profileActivity.l6, profileActivity.fragmentView);
        profileActivity.m6.d();
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.u0) {
            return;
        }
        super.requestLayout();
    }

    @Override // r0.m
    public final void s(View view, View view2, int i10, int i11) {
        this.s0.a = i10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
    }

    @Override // r0.m
    public final void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
