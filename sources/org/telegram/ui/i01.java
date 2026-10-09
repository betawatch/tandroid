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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class i01 extends org.telegram.ui.Components.sw0 implements r0.m {
    public boolean A0;
    public final ArrayList B0;
    public final gf C0;
    public final /* synthetic */ ProfileActivity D0;
    public final b2.q0 w0;
    public final /* synthetic */ ProfileActivity x0;
    public boolean y0;
    public final Paint z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i01(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.D0 = profileActivity;
        this.x0 = profileActivity;
        this.w0 = new b2.q0();
        this.z0 = new Paint();
        this.B0 = new ArrayList();
        this.C0 = new gf(27);
    }

    @Override // r0.l
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        org.telegram.ui.Components.qm0 currentListView;
        int L0;
        ProfileActivity profileActivity = this.x0;
        if (viewGroup == profileActivity.a) {
            if (profileActivity.J4 == -1 || !profileActivity.Q) {
                return;
            }
            kVar = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
            boolean z10 = kVar.n0;
            int top = profileActivity.O.getTop();
            boolean z11 = false;
            if (i11 >= 0) {
                if (z10) {
                    org.telegram.ui.Components.qm0 currentListView2 = profileActivity.O.getCurrentListView();
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
            if (top <= 0 && (currentListView = profileActivity.O.getCurrentListView()) != null && (L0 = ((s4.d0) currentListView.getLayoutManager()).L0()) != -1) {
                s4.d1 K = currentListView.K(L0);
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

    @Override // org.telegram.ui.Components.sw0
    public final void L(Canvas canvas, ArrayList arrayList) {
        canvas.save();
        ProfileActivity profileActivity = this.x0;
        canvas.translate(0.0f, profileActivity.a.getY());
        profileActivity.O.Q(canvas, arrayList);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.sw0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        ProfileActivity profileActivity = this.D0;
        org.telegram.ui.Components.x50 x50Var = profileActivity.x0;
        Paint paint = profileActivity.q2;
        fh.d dVar = profileActivity.n6;
        ah.h hVar = profileActivity.m6;
        Paint paint2 = profileActivity.y0;
        if (Build.VERSION.SDK_INT >= 31 && hVar != null) {
            ProfileActivity.B0(profileActivity);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (dVar != null && !dVar.n) {
                RecordingCanvas a2 = dVar.a(measuredWidth, measuredHeight);
                a2.drawColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.a7, profileActivity.z0));
                if (SharedConfig.chatBlurEnabled()) {
                    hVar.b(a2, -2);
                }
                dVar.b();
            }
        }
        int i10 = org.telegram.ui.ActionBar.i6.a7;
        paint.setColor(org.telegram.ui.ActionBar.i6.w0(i10, profileActivity.z0));
        if (profileActivity.a.getVisibility() == 0) {
            int w02 = org.telegram.ui.ActionBar.i6.w0(i10, profileActivity.z0);
            Paint paint3 = this.z0;
            paint3.setColor(w02);
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
        if (x50Var.getAlpha() > 0) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), profileActivity.x0);
        }
        if (profileActivity.w0 != null) {
            int save = canvas.save();
            canvas.translate(profileActivity.w0.getLeft(), profileActivity.w0.getTop());
            View view2 = profileActivity.w0;
            kVar = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
            if (view2 == kVar.getBackButton()) {
                int max = Math.max(profileActivity.w0.getMeasuredWidth(), profileActivity.w0.getMeasuredHeight()) / 2;
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (((x50Var.getAlpha() / 255.0f) * alpha) / 0.3f));
                float f7 = max;
                canvas.drawCircle(f7, f7, 0.7f * f7, paint2);
                paint2.setAlpha(alpha);
            }
            profileActivity.w0.draw(canvas);
            canvas.restoreToCount(save);
        }
        q50 q50Var = profileActivity.U;
        if (q50Var != null && q50Var.getVisibility() == 0) {
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
        ez0 ez0Var = profileActivity.a;
        canvas.translate(ez0Var != null ? ez0Var.getTranslationX() : 0.0f, 0.0f);
        int w03 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.d6, profileActivity.z0);
        int i13 = profileActivity.l6;
        ez0 ez0Var2 = profileActivity.a;
        AndroidUtilities.drawNavigationBarProtection(canvas, this, w03, i13, ez0Var2 != null ? ez0Var2.getAlpha() : 0.0f);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.uu0[] uu0VarArr;
        org.telegram.ui.Components.uu0 uu0Var;
        ProfileActivity profileActivity = this.D0;
        tz0 tz0Var = profileActivity.V4;
        if (tz0Var.n) {
            return tz0Var.g(motionEvent);
        }
        k01 k01Var = profileActivity.O;
        if (k01Var != null && (uu0Var = (uu0VarArr = k01Var.k0)[0]) != null && uu0Var.h.getFastScroll() != null && uu0VarArr[0].h.getFastScroll().n) {
            k01 k01Var2 = profileActivity.O;
            if (k01Var2.d) {
                return k01Var2.O(motionEvent);
            }
        }
        k01 k01Var3 = profileActivity.O;
        if (k01Var3 == null || !k01Var3.H(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        ProfileActivity profileActivity = this.D0;
        if (profileActivity.V4.n) {
            if (view == profileActivity.Z) {
                return true;
            }
            kVar = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
            if (view == kVar || view == profileActivity.v) {
                return true;
            }
        }
        if (view == profileActivity.U) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // r0.m
    public final void j(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        ProfileActivity profileActivity = this.x0;
        try {
            if (viewGroup == profileActivity.a && profileActivity.Q) {
                org.telegram.ui.Components.qm0 currentListView = profileActivity.O.getCurrentListView();
                if (profileActivity.O.getTop() == 0) {
                    iArr[1] = i13;
                    currentListView.scrollBy(0, i13);
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
            AndroidUtilities.runOnUIThread(new h01(this, 1));
        }
    }

    @Override // r0.l
    public final void o(int i10, View view) {
        this.w0.a = 0;
    }

    @Override // org.telegram.ui.Components.sw0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ProfileActivity profileActivity = this.D0;
        profileActivity.G0 = true;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.q5[] q5VarArr = profileActivity.G;
            if (i11 >= q5VarArr.length) {
                break;
            }
            org.telegram.ui.Components.q5 q5Var = q5VarArr[i11];
            if (q5Var != null) {
                q5Var.a();
            }
            i11++;
        }
        while (true) {
            org.telegram.ui.Components.q5[] q5VarArr2 = profileActivity.H;
            if (i10 >= q5VarArr2.length) {
                return;
            }
            org.telegram.ui.Components.q5 q5Var2 = q5VarArr2[i10];
            if (q5Var2 != null) {
                q5Var2.a();
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.sw0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ProfileActivity profileActivity = this.D0;
        int i10 = 0;
        profileActivity.G0 = false;
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.q5[] q5VarArr = profileActivity.G;
            if (i11 >= q5VarArr.length) {
                break;
            }
            org.telegram.ui.Components.q5 q5Var = q5VarArr[i11];
            if (q5Var != null) {
                q5Var.b();
            }
            i11++;
        }
        while (true) {
            org.telegram.ui.Components.q5[] q5VarArr2 = profileActivity.H;
            if (i10 >= q5VarArr2.length) {
                return;
            }
            org.telegram.ui.Components.q5 q5Var2 = q5VarArr2[i10];
            if (q5Var2 != null) {
                q5Var2.b();
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.sw0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ProfileActivity profileActivity = this.D0;
        profileActivity.U5 = -1;
        profileActivity.T4 = false;
        profileActivity.U4 = false;
        profileActivity.A3();
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
        org.telegram.ui.Components.gs[] gsVarArr;
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
        org.telegram.ui.Components.gs[] gsVarArr2 = profileActivity.K;
        org.telegram.ui.Components.gs[] gsVarArr3 = profileActivity.J;
        HashMap hashMap = profileActivity.Y1;
        org.telegram.ui.ActionBar.j5[] j5VarArr = profileActivity.f;
        kVar = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
        int i17 = 0;
        int i18 = currentActionBarHeight + (kVar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
        ez0 ez0Var = profileActivity.a;
        if (ez0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ez0Var.getLayoutParams();
            if (layoutParams.topMargin != i18) {
                layoutParams.topMargin = i18;
            }
        }
        org.telegram.ui.Components.qm0 qm0Var = profileActivity.b;
        if (qm0Var != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) qm0Var.getLayoutParams();
            if (layoutParams2.topMargin != i18) {
                layoutParams2.topMargin = i18;
            }
        }
        int size = View.MeasureSpec.getSize(i11);
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        if (profileActivity.C0 == getMeasuredWidth() && profileActivity.D0 == getMeasuredHeight()) {
            gsVarArr = gsVarArr2;
            z10 = false;
            c10 = 0;
        } else {
            int i19 = profileActivity.C0;
            z10 = (i19 == 0 || i19 == getMeasuredWidth()) ? false : true;
            profileActivity.E0 = 0;
            int i20 = profileActivity.d.e.N2;
            profileActivity.C0 = getMeasuredWidth();
            profileActivity.D0 = getMeasuredHeight();
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(profileActivity.a.getMeasuredHeight(), 0);
            hashMap.clear();
            char c12 = 0;
            while (i17 < i20) {
                int j3 = profileActivity.d.j(i17);
                org.telegram.ui.Components.gs[] gsVarArr4 = gsVarArr2;
                hashMap.put(Integer.valueOf(i17), Integer.valueOf(profileActivity.E0));
                if (j3 == 13) {
                    profileActivity.E0 += profileActivity.a.getMeasuredHeight();
                } else {
                    s4.d1 e7 = profileActivity.d.e(null, j3);
                    View view2 = e7.a;
                    profileActivity.d.v(e7, i17);
                    view2.measure(makeMeasureSpec, makeMeasureSpec2);
                    profileActivity.E0 += view2.getMeasuredHeight();
                }
                i17++;
                gsVarArr2 = gsVarArr4;
            }
            gsVarArr = gsVarArr2;
            org.telegram.ui.Components.ay0 ay0Var = profileActivity.P;
            c10 = c12;
            if (ay0Var != null) {
                ((FrameLayout.LayoutParams) ay0Var.getLayoutParams()).topMargin = profileActivity.T3() + AndroidUtilities.statusBarHeight;
                c10 = c12;
            }
        }
        if (profileActivity.g5 != null) {
            org.telegram.ui.ActionBar.j5 j5Var = j5VarArr[c10];
            j5Var.setRightPadding(j5Var.getMeasuredWidth() - profileActivity.g5.o().getTitleTextView().getMeasuredWidth());
        }
        boolean z14 = profileActivity.l5;
        if (!z14 && ((z13 = profileActivity.n1) || (profileActivity.G1 && profileActivity.J1 == 2))) {
            this.y0 = true;
            if (z13) {
                org.telegram.ui.ActionBar.v0 v0Var = profileActivity.U0;
                if (v0Var != null) {
                    v0Var.setAlpha(0.0f);
                    profileActivity.U0.setEnabled(c10);
                    profileActivity.U0.setVisibility(8);
                }
                j5VarArr[1].setTextColor(-1);
                j5VarArr[1].setPivotY(r8.getMeasuredHeight());
                j5VarArr[1].setScaleX(1.38f);
                j5VarArr[1].setScaleY(1.38f);
                org.telegram.ui.Components.dn0 dn0Var = profileActivity.L;
                if (dn0Var != null) {
                    dn0Var.b(Color.argb(MessagesStorage.LAST_DB_VERSION, 255, 255, 255));
                }
                Drawable drawable = profileActivity.x;
                if (drawable != null) {
                    drawable.setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
                }
                org.telegram.ui.Components.gs gsVar = gsVarArr3[0];
                if (gsVar != null) {
                    gsVar.b(1.0f);
                }
                org.telegram.ui.Components.gs gsVar2 = gsVarArr3[1];
                if (gsVar2 != null) {
                    gsVar2.b(1.0f);
                }
                org.telegram.ui.Components.gs gsVar3 = gsVarArr[0];
                if (gsVar3 != null) {
                    gsVar3.b(1.0f);
                }
                org.telegram.ui.Components.gs gsVar4 = gsVarArr[1];
                if (gsVar4 != null) {
                    gsVar4.b(1.0f);
                }
                profileActivity.Y4(1.0f);
                profileActivity.r[1].setTextColor(-1275068417);
                kVar3 = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
                kVar3.C(1090519039, false);
                kVar4 = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
                kVar4.D(-1, false);
                z01 z01Var = profileActivity.N;
                z01Var.E = true;
                z01Var.setVisibility(0);
                profileActivity.N.e(1.0f, false);
                profileActivity.e0.setForegroundAlpha(1.0f);
                profileActivity.Y.setVisibility(4);
                profileActivity.n0.L();
                profileActivity.n0.setVisibility(0);
                j11 j11Var = profileActivity.b6;
                if (j11Var != null) {
                    j11Var.a(603979775);
                }
                rz0 rz0Var = profileActivity.u0;
                if (rz0Var != null) {
                    rz0Var.setExpandProgress(1.0f);
                }
                yh.e0 e0Var = profileActivity.v0;
                if (e0Var != null) {
                    e0Var.setExpandProgress(1.0f);
                }
                org.telegram.ui.Components.ii0 ii0Var = profileActivity.a0;
                if (ii0Var != null) {
                    ii0Var.setParentExpanded(1.0f);
                }
                org.telegram.ui.Components.aj0 aj0Var = profileActivity.c0;
                if (aj0Var != null) {
                    aj0Var.setParentExpanded(1.0f);
                }
                org.telegram.ui.Components.lx0 lx0Var = profileActivity.T;
                if (lx0Var != null) {
                    lx0Var.setParentExpanded(1.0f);
                }
                c11 = 0;
                profileActivity.n1 = false;
                profileActivity.V4();
            } else {
                c11 = c10;
            }
            profileActivity.z3();
            profileActivity.o2 = true;
            profileActivity.p2 = true;
            NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
            int i21 = NotificationCenter.needCheckSystemBarColors;
            Object[] objArr = new Object[1];
            objArr[c11] = Boolean.TRUE;
            globalInstance.lambda$postNotificationNameOnUIThread$1(i21, objArr);
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
                measuredWidth2 = profileActivity.T3() + i18;
                max2 = 0;
            } else {
                measuredWidth2 = profileActivity.a.getMeasuredWidth() + profileActivity.O3();
                max2 = Math.max(0, getMeasuredHeight() - ((profileActivity.T3() + profileActivity.E0) + i18));
            }
            if (profileActivity.E1 != 0) {
                max2 += AndroidUtilities.dp(48.0f) + AndroidUtilities.navigationBarHeight;
                profileActivity.a.setBottomGlowOffset(AndroidUtilities.dp(48.0f) + AndroidUtilities.navigationBarHeight);
            } else {
                profileActivity.a.setBottomGlowOffset(0);
            }
            float f7 = measuredWidth2 - i18;
            profileActivity.R1 = f7;
            if (profileActivity.J1 == 0) {
                profileActivity.Q1 = f7;
            }
            profileActivity.c.h1(0, -i18);
            profileActivity.a.setPadding(0, measuredWidth2, 0, max2);
            measureChildWithMargins(profileActivity.a, i10, 0, i11, 0);
            ez0 ez0Var2 = profileActivity.a;
            ez0Var2.layout(0, i18, ez0Var2.getMeasuredWidth(), profileActivity.a.getMeasuredHeight() + i18);
            this.y0 = false;
        } else if (z14 && !profileActivity.G1 && !profileActivity.T4) {
            z11 = true;
            this.y0 = true;
            if (profileActivity.I0 || !(profileActivity.n2 || AndroidUtilities.isTablet())) {
                measuredWidth = profileActivity.a.getMeasuredWidth() + profileActivity.O3();
                max = Math.max(0, getMeasuredHeight() - ((profileActivity.T3() + profileActivity.E0) + i18));
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
                ez0 ez0Var3 = profileActivity.a;
                View F = ez0Var3.F(view);
                s4.d1 T = F == null ? null : ez0Var3.T(F);
                i12 = T.b();
                if (i12 == -1 && (i12 = T.g) == -1) {
                    i12 = T.c;
                }
            }
            int top = view != null ? view.getTop() : measuredWidth;
            kVar2 = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
            if ((kVar2.n0 || profileActivity.r1) && (i13 = profileActivity.J4) >= 0) {
                profileActivity.c.h1(i13, -measuredWidth);
            } else {
                if (profileActivity.U4 || paddingTop != measuredWidth) {
                    int i23 = profileActivity.U5;
                    if (i23 >= 0) {
                        profileActivity.c.h1(i23, profileActivity.V5 - measuredWidth);
                    } else {
                        if ((z10 && profileActivity.o2) || view == null) {
                            i15 = 0;
                            profileActivity.c.h1(0, profileActivity.T3() - measuredWidth);
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
                                    ez0 ez0Var4 = profileActivity.a;
                                    ez0Var4.layout(0, i18, ez0Var4.getMeasuredWidth(), profileActivity.a.getMeasuredHeight() + i18);
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                }
                            }
                            this.y0 = false;
                            z12 = size <= View.MeasureSpec.getSize(i10) ? z11 : false;
                            if (z12 == this.A0) {
                                post(new h01(this, 0));
                                this.A0 = z12;
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
        gh.d.c(profileActivity.p6, profileActivity.fragmentView);
        profileActivity.q6.d();
    }

    @Override // r0.l
    public final boolean p(View view, View view2, int i10, int i11) {
        return this.x0.J4 != -1 && i10 == 2;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.y0) {
            return;
        }
        super.requestLayout();
    }

    @Override // r0.l
    public final void s(View view, View view2, int i10, int i11) {
        this.w0.a = i10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
    }

    @Override // r0.l
    public final void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
