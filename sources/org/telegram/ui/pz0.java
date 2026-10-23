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
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class pz0 extends org.telegram.ui.Components.ow0 implements r0.m {
    public boolean A0;
    public final ArrayList B0;
    public final o70 C0;
    public final /* synthetic */ ProfileActivity D0;
    public final b2.u0 w0;
    public final /* synthetic */ ProfileActivity x0;
    public boolean y0;
    public final Paint z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pz0(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.D0 = profileActivity;
        this.x0 = profileActivity;
        this.w0 = new b2.u0();
        this.z0 = new Paint();
        this.B0 = new ArrayList();
        this.C0 = new o70(5);
    }

    @Override // r0.l
    public final void D(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        org.telegram.ui.Components.mm0 currentListView;
        int L0;
        ProfileActivity profileActivity = this.x0;
        if (viewGroup == profileActivity.a) {
            if (profileActivity.L4 == -1 || !profileActivity.Q) {
                return;
            }
            kVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
            boolean z10 = kVar.n0;
            int top = profileActivity.O.getTop();
            boolean z11 = false;
            if (i11 >= 0) {
                if (z10) {
                    org.telegram.ui.Components.mm0 currentListView2 = profileActivity.O.getCurrentListView();
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
            if (top <= 0 && (currentListView = profileActivity.O.getCurrentListView()) != null && (L0 = ((s4.b0) currentListView.getLayoutManager()).L0()) != -1) {
                s4.b1 K = currentListView.K(L0);
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

    @Override // org.telegram.ui.Components.ow0
    public final void K(Canvas canvas, ArrayList arrayList) {
        canvas.save();
        ProfileActivity profileActivity = this.x0;
        canvas.translate(0.0f, profileActivity.a.getY());
        profileActivity.O.R(canvas, arrayList);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.ow0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        ProfileActivity profileActivity = this.D0;
        org.telegram.ui.Components.p50 p50Var = profileActivity.y0;
        Paint paint = profileActivity.r2;
        gh.d dVar = profileActivity.t6;
        bh.f fVar = profileActivity.s6;
        Paint paint2 = profileActivity.z0;
        if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
            ProfileActivity.B0(profileActivity);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (dVar != null && !dVar.n) {
                RecordingCanvas a2 = dVar.a(measuredWidth, measuredHeight);
                a2.drawColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, profileActivity.A0));
                if (SharedConfig.chatBlurEnabled()) {
                    fVar.b(a2, -2);
                }
                dVar.c();
            }
        }
        int i10 = org.telegram.ui.ActionBar.k6.a7;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(i10, profileActivity.A0));
        if (profileActivity.a.getVisibility() == 0) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(i10, profileActivity.A0);
            Paint paint3 = this.z0;
            paint3.setColor(w02);
            if (profileActivity.I1) {
                paint.setAlpha((int) (profileActivity.a.getAlpha() * 255.0f));
            }
            if (profileActivity.I1) {
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
            if (!profileActivity.H1 && size > 0 && !z10) {
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
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), profileActivity.y0);
        }
        if (profileActivity.x0 != null) {
            int save = canvas.save();
            canvas.translate(profileActivity.x0.getLeft(), profileActivity.x0.getTop());
            View view2 = profileActivity.x0;
            kVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
            if (view2 == kVar.getBackButton()) {
                int max = Math.max(profileActivity.x0.getMeasuredWidth(), profileActivity.x0.getMeasuredHeight()) / 2;
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (((p50Var.getAlpha() / 255.0f) * alpha) / 0.3f));
                float f7 = max;
                canvas.drawCircle(f7, f7, 0.7f * f7, paint2);
                paint2.setAlpha(alpha);
            }
            profileActivity.x0.draw(canvas);
            canvas.restoreToCount(save);
        }
        e50 e50Var = profileActivity.U;
        if (e50Var != null && e50Var.getVisibility() == 0) {
            if (profileActivity.U.getAlpha() == 1.0f) {
                profileActivity.U.draw(canvas);
            } else if (profileActivity.U.getAlpha() != 0.0f) {
                canvas.saveLayerAlpha(profileActivity.U.getLeft(), profileActivity.U.getTop(), profileActivity.U.getRight(), profileActivity.U.getBottom(), (int) (profileActivity.U.getAlpha() * 255.0f), 31);
                canvas.translate(profileActivity.U.getLeft(), profileActivity.U.getTop());
                profileActivity.U.draw(canvas);
                canvas.restore();
            }
        }
        if (profileActivity.J0) {
            return;
        }
        canvas.save();
        ly0 ly0Var = profileActivity.a;
        canvas.translate(ly0Var != null ? ly0Var.getTranslationX() : 0.0f, 0.0f);
        int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, profileActivity.A0);
        int i13 = profileActivity.r6;
        ly0 ly0Var2 = profileActivity.a;
        AndroidUtilities.drawNavigationBarProtection(canvas, this, w03, i13, ly0Var2 != null ? ly0Var2.getAlpha() : 0.0f);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.qu0[] qu0VarArr;
        org.telegram.ui.Components.qu0 qu0Var;
        ProfileActivity profileActivity = this.D0;
        az0 az0Var = profileActivity.X4;
        if (az0Var.n) {
            return az0Var.g(motionEvent);
        }
        rz0 rz0Var = profileActivity.O;
        if (rz0Var != null && (qu0Var = (qu0VarArr = rz0Var.k0)[0]) != null && qu0Var.h.getFastScroll() != null && qu0VarArr[0].h.getFastScroll().n) {
            rz0 rz0Var2 = profileActivity.O;
            if (rz0Var2.d) {
                return rz0Var2.P(motionEvent);
            }
        }
        rz0 rz0Var3 = profileActivity.O;
        if (rz0Var3 == null || !rz0Var3.I(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        ProfileActivity profileActivity = this.D0;
        if (profileActivity.X4.n) {
            if (view == profileActivity.Z) {
                return true;
            }
            kVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
            if (view == kVar || view == profileActivity.v) {
                return true;
            }
        }
        if (view == profileActivity.U) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // r0.m
    public final void h(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        ProfileActivity profileActivity = this.x0;
        try {
            if (viewGroup == profileActivity.a && profileActivity.Q) {
                org.telegram.ui.Components.mm0 currentListView = profileActivity.O.getCurrentListView();
                if (profileActivity.O.getTop() == 0) {
                    iArr[1] = i13;
                    currentListView.scrollBy(0, i13);
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
            AndroidUtilities.runOnUIThread(new oz0(this, 1));
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // r0.l
    public final void m(int i10, View view) {
        this.w0.a = 0;
    }

    @Override // r0.l
    public final boolean o(View view, View view2, int i10, int i11) {
        return this.x0.L4 != -1 && i10 == 2;
    }

    @Override // org.telegram.ui.Components.ow0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ProfileActivity profileActivity = this.D0;
        profileActivity.H0 = true;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.p5[] p5VarArr = profileActivity.G;
            if (i11 >= p5VarArr.length) {
                break;
            }
            org.telegram.ui.Components.p5 p5Var = p5VarArr[i11];
            if (p5Var != null) {
                p5Var.a();
            }
            i11++;
        }
        while (true) {
            org.telegram.ui.Components.p5[] p5VarArr2 = profileActivity.H;
            if (i10 >= p5VarArr2.length) {
                return;
            }
            org.telegram.ui.Components.p5 p5Var2 = p5VarArr2[i10];
            if (p5Var2 != null) {
                p5Var2.a();
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.ow0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ProfileActivity profileActivity = this.D0;
        int i10 = 0;
        profileActivity.H0 = false;
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.p5[] p5VarArr = profileActivity.G;
            if (i11 >= p5VarArr.length) {
                break;
            }
            org.telegram.ui.Components.p5 p5Var = p5VarArr[i11];
            if (p5Var != null) {
                p5Var.b();
            }
            i11++;
        }
        while (true) {
            org.telegram.ui.Components.p5[] p5VarArr2 = profileActivity.H;
            if (i10 >= p5VarArr2.length) {
                return;
            }
            org.telegram.ui.Components.p5 p5Var2 = p5VarArr2[i10];
            if (p5Var2 != null) {
                p5Var2.b();
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.ow0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ProfileActivity profileActivity = this.D0;
        profileActivity.W5 = -1;
        profileActivity.V4 = false;
        profileActivity.W4 = false;
        profileActivity.C3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0434  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        boolean z10;
        org.telegram.ui.Components.as[] asVarArr;
        char c10;
        boolean z11;
        int measuredWidth;
        int max;
        int i12;
        View view;
        org.telegram.ui.ActionBar.k kVar2;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z12;
        boolean z13;
        char c11;
        int measuredWidth2;
        int max2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        ProfileActivity profileActivity = this.D0;
        org.telegram.ui.Components.as[] asVarArr2 = profileActivity.K;
        org.telegram.ui.Components.as[] asVarArr3 = profileActivity.J;
        HashMap hashMap = profileActivity.Z1;
        org.telegram.ui.ActionBar.n5[] n5VarArr = profileActivity.f;
        kVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
        int i17 = 0;
        int i18 = currentActionBarHeight + (kVar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
        ly0 ly0Var = profileActivity.a;
        if (ly0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ly0Var.getLayoutParams();
            if (layoutParams.topMargin != i18) {
                layoutParams.topMargin = i18;
            }
        }
        org.telegram.ui.Components.mm0 mm0Var = profileActivity.b;
        if (mm0Var != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) mm0Var.getLayoutParams();
            if (layoutParams2.topMargin != i18) {
                layoutParams2.topMargin = i18;
            }
        }
        int size = View.MeasureSpec.getSize(i11);
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        if (profileActivity.D0 == getMeasuredWidth() && profileActivity.E0 == getMeasuredHeight()) {
            asVarArr = asVarArr2;
            z10 = false;
            c10 = 0;
        } else {
            int i19 = profileActivity.D0;
            z10 = (i19 == 0 || i19 == getMeasuredWidth()) ? false : true;
            profileActivity.F0 = 0;
            int i20 = profileActivity.d.e.O2;
            profileActivity.D0 = getMeasuredWidth();
            profileActivity.E0 = getMeasuredHeight();
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(profileActivity.a.getMeasuredHeight(), 0);
            hashMap.clear();
            char c12 = 0;
            while (i17 < i20) {
                int j10 = profileActivity.d.j(i17);
                org.telegram.ui.Components.as[] asVarArr4 = asVarArr2;
                hashMap.put(Integer.valueOf(i17), Integer.valueOf(profileActivity.F0));
                if (j10 == 13) {
                    profileActivity.F0 += profileActivity.a.getMeasuredHeight();
                } else {
                    s4.b1 g10 = profileActivity.d.g(null, j10);
                    View view2 = g10.a;
                    profileActivity.d.v(g10, i17);
                    view2.measure(makeMeasureSpec, makeMeasureSpec2);
                    profileActivity.F0 += view2.getMeasuredHeight();
                }
                i17++;
                asVarArr2 = asVarArr4;
            }
            asVarArr = asVarArr2;
            org.telegram.ui.Components.wx0 wx0Var = profileActivity.P;
            c10 = c12;
            if (wx0Var != null) {
                ((FrameLayout.LayoutParams) wx0Var.getLayoutParams()).topMargin = profileActivity.V3() + AndroidUtilities.statusBarHeight;
                c10 = c12;
            }
        }
        if (profileActivity.i5 != null) {
            org.telegram.ui.ActionBar.n5 n5Var = n5VarArr[c10];
            n5Var.setRightPadding(n5Var.getMeasuredWidth() - profileActivity.i5.p().getTitleTextView().getMeasuredWidth());
        }
        boolean z14 = profileActivity.n5;
        if (!z14 && ((z13 = profileActivity.o1) || (profileActivity.H1 && profileActivity.K1 == 2))) {
            this.y0 = true;
            if (z13) {
                org.telegram.ui.ActionBar.u0 u0Var = profileActivity.V0;
                if (u0Var != null) {
                    u0Var.setAlpha(0.0f);
                    profileActivity.V0.setEnabled(c10);
                    profileActivity.V0.setVisibility(8);
                }
                n5VarArr[1].setTextColor(-1);
                n5VarArr[1].setPivotY(r8.getMeasuredHeight());
                n5VarArr[1].setScaleX(1.38f);
                n5VarArr[1].setScaleY(1.38f);
                org.telegram.ui.Components.zm0 zm0Var = profileActivity.L;
                if (zm0Var != null) {
                    zm0Var.b(Color.argb(MessagesStorage.LAST_DB_VERSION, 255, 255, 255));
                }
                Drawable drawable = profileActivity.x;
                if (drawable != null) {
                    drawable.setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
                }
                org.telegram.ui.Components.as asVar = asVarArr3[0];
                if (asVar != null) {
                    asVar.b(1.0f);
                }
                org.telegram.ui.Components.as asVar2 = asVarArr3[1];
                if (asVar2 != null) {
                    asVar2.b(1.0f);
                }
                org.telegram.ui.Components.as asVar3 = asVarArr[0];
                if (asVar3 != null) {
                    asVar3.b(1.0f);
                }
                org.telegram.ui.Components.as asVar4 = asVarArr[1];
                if (asVar4 != null) {
                    asVar4.b(1.0f);
                }
                profileActivity.c5(1.0f);
                profileActivity.r[1].setTextColor(-1275068417);
                kVar3 = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
                kVar3.A(1090519039, false);
                kVar4 = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
                kVar4.B(-1, false);
                g01 g01Var = profileActivity.N;
                g01Var.E = true;
                g01Var.setVisibility(0);
                profileActivity.N.e(1.0f, false);
                profileActivity.f0.setForegroundAlpha(1.0f);
                profileActivity.Y.setVisibility(4);
                profileActivity.o0.L();
                profileActivity.o0.setVisibility(0);
                r01 r01Var = profileActivity.h6;
                if (r01Var != null) {
                    r01Var.a(603979775);
                }
                yy0 yy0Var = profileActivity.v0;
                if (yy0Var != null) {
                    yy0Var.setExpandProgress(1.0f);
                }
                ai.j1 j1Var = profileActivity.w0;
                if (j1Var != null) {
                    j1Var.setExpandProgress(1.0f);
                }
                org.telegram.ui.Components.ci0 ci0Var = profileActivity.a0;
                if (ci0Var != null) {
                    ci0Var.setParentExpanded(1.0f);
                }
                org.telegram.ui.Components.vi0 vi0Var = profileActivity.c0;
                if (vi0Var != null) {
                    vi0Var.setParentExpanded(1.0f);
                }
                org.telegram.ui.Components.hx0 hx0Var = profileActivity.T;
                if (hx0Var != null) {
                    hx0Var.setParentExpanded(1.0f);
                }
                c11 = 0;
                profileActivity.o1 = false;
                profileActivity.Z4();
            } else {
                c11 = c10;
            }
            profileActivity.B3();
            profileActivity.p2 = true;
            profileActivity.q2 = true;
            NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
            int i21 = NotificationCenter.needCheckSystemBarColors;
            Object[] objArr = new Object[1];
            objArr[c11] = Boolean.TRUE;
            globalInstance.lambda$postNotificationNameOnUIThread$1(i21, objArr);
            if (profileActivity.U0 != null) {
                if (profileActivity.i4()) {
                    profileActivity.U0.r(21);
                } else {
                    profileActivity.U0.K(21);
                }
                if (profileActivity.r0 != null) {
                    profileActivity.U0.K(34);
                    profileActivity.U0.K(35);
                    profileActivity.U0.r(31);
                }
            }
            profileActivity.m2 = 1.0f;
            if (profileActivity.o2) {
                measuredWidth2 = profileActivity.V3() + i18;
                max2 = 0;
            } else {
                measuredWidth2 = profileActivity.a.getMeasuredWidth() + profileActivity.Q3();
                max2 = Math.max(0, getMeasuredHeight() - ((profileActivity.V3() + profileActivity.F0) + i18));
            }
            if (profileActivity.F1 != 0) {
                max2 += AndroidUtilities.dp(48.0f) + AndroidUtilities.navigationBarHeight;
                profileActivity.a.setBottomGlowOffset(AndroidUtilities.dp(48.0f) + AndroidUtilities.navigationBarHeight);
            } else {
                profileActivity.a.setBottomGlowOffset(0);
            }
            float f7 = measuredWidth2 - i18;
            profileActivity.S1 = f7;
            if (profileActivity.K1 == 0) {
                profileActivity.R1 = f7;
            }
            profileActivity.c.h1(0, -i18);
            profileActivity.a.setPadding(0, measuredWidth2, 0, max2);
            measureChildWithMargins(profileActivity.a, i10, 0, i11, 0);
            ly0 ly0Var2 = profileActivity.a;
            ly0Var2.layout(0, i18, ly0Var2.getMeasuredWidth(), profileActivity.a.getMeasuredHeight() + i18);
            this.y0 = false;
        } else if (z14 && !profileActivity.H1 && !profileActivity.V4) {
            z11 = true;
            this.y0 = true;
            if (profileActivity.J0 || !(profileActivity.o2 || AndroidUtilities.isTablet())) {
                measuredWidth = profileActivity.a.getMeasuredWidth() + profileActivity.Q3();
                max = Math.max(0, getMeasuredHeight() - ((profileActivity.V3() + profileActivity.F0) + i18));
            } else {
                measuredWidth = profileActivity.V3();
                max = 0;
            }
            if (profileActivity.F1 != 0) {
                max += AndroidUtilities.dp(48.0f) + AndroidUtilities.navigationBarHeight;
                profileActivity.a.setBottomGlowOffset(AndroidUtilities.dp(48.0f) + AndroidUtilities.navigationBarHeight);
            } else {
                profileActivity.a.setBottomGlowOffset(0);
            }
            int paddingTop = profileActivity.a.getPaddingTop();
            int i22 = 0;
            while (true) {
                if (i22 >= profileActivity.a.getChildCount()) {
                    i12 = -1;
                    view = null;
                    break;
                } else {
                    i12 = RecyclerView.R(profileActivity.a.getChildAt(i22));
                    if (i12 != -1) {
                        view = profileActivity.a.getChildAt(i22);
                        break;
                    }
                    i22++;
                }
            }
            if (view == null && (view = profileActivity.a.getChildAt(0)) != null) {
                ly0 ly0Var3 = profileActivity.a;
                View F = ly0Var3.F(view);
                s4.b1 T = F == null ? null : ly0Var3.T(F);
                i12 = T.b();
                if (i12 == -1 && (i12 = T.g) == -1) {
                    i12 = T.c;
                }
            }
            int top = view != null ? view.getTop() : measuredWidth;
            kVar2 = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
            if ((kVar2.n0 || profileActivity.s1) && (i13 = profileActivity.L4) >= 0) {
                profileActivity.c.h1(i13, -measuredWidth);
            } else {
                if (profileActivity.W4 || paddingTop != measuredWidth) {
                    int i23 = profileActivity.W5;
                    if (i23 >= 0) {
                        profileActivity.c.h1(i23, profileActivity.X5 - measuredWidth);
                    } else {
                        if ((z10 && profileActivity.p2) || view == null) {
                            i15 = 0;
                            profileActivity.c.h1(0, profileActivity.V3() - measuredWidth);
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
                                    ly0 ly0Var4 = profileActivity.a;
                                    ly0Var4.layout(0, i18, ly0Var4.getMeasuredWidth(), profileActivity.a.getMeasuredHeight() + i18);
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                            }
                            this.y0 = false;
                            z12 = size <= View.MeasureSpec.getSize(i10) ? z11 : false;
                            if (z12 == this.A0) {
                                post(new oz0(this, 0));
                                this.A0 = z12;
                                return;
                            }
                            return;
                        }
                        if (i12 == 0 && !profileActivity.p2 && top > profileActivity.V3()) {
                            top = profileActivity.V3();
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
                this.y0 = false;
                if (size <= View.MeasureSpec.getSize(i10)) {
                }
                if (z12 == this.A0) {
                }
            }
            i14 = 1;
            i15 = 0;
            if (paddingTop == measuredWidth) {
            }
            profileActivity.a.setPadding(i15, measuredWidth, i15, max);
            i16 = 1;
            if (i16 != 0) {
            }
            this.y0 = false;
            if (size <= View.MeasureSpec.getSize(i10)) {
            }
            if (z12 == this.A0) {
            }
        }
        z11 = true;
        if (size <= View.MeasureSpec.getSize(i10)) {
        }
        if (z12 == this.A0) {
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        ProfileActivity profileActivity = this.D0;
        hh.d.c(profileActivity.w6, profileActivity.fragmentView);
        profileActivity.x6.d();
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
