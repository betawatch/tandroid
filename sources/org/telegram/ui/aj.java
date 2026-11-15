package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class aj extends sl {
    public final r1.f A3;
    public final r1.g B3;
    public boolean C3;
    public final Path D3;
    public boolean E3;
    public int F3;
    public final /* synthetic */ an G3;
    public int g3;
    public final ArrayList h3;
    public final ArrayList i3;
    public final ArrayList j3;
    public final ArrayList k3;
    public final ArrayList l3;
    public int m3;
    public int n3;
    public int o3;
    public long p3;
    public float q3;
    public float r3;
    public boolean s3;
    public final float t3;
    public final Paint u3;
    public final Paint v3;
    public final r1.f w3;
    public final r1.g x3;
    public final r1.f y3;
    public final r1.g z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(an anVar, Context context, ym ymVar) {
        super(anVar, context, ymVar);
        this.G3 = anVar;
        this.h3 = new ArrayList();
        this.i3 = new ArrayList();
        this.j3 = new ArrayList();
        this.k3 = new ArrayList();
        this.l3 = new ArrayList(10);
        this.t3 = 2000.0f;
        Paint paint = new Paint(1);
        this.u3 = paint;
        Paint paint2 = new Paint(1);
        this.v3 = paint2;
        r1.f fVar = new r1.f(0.0f);
        this.w3 = fVar;
        r1.g gVar = new r1.g(fVar);
        gVar.h = 0.0f;
        gVar.g = 2000.0f;
        gVar.m = org.telegram.ui.Cells.y0.n(0.0f, 1500.0f, 1.0f);
        final int i7 = 0;
        gVar.b(new r1.d(this) { // from class: org.telegram.ui.zi
            public final /* synthetic */ aj b;

            {
                this.b = this;
            }

            @Override // r1.d
            public final void a(r1.g gVar2, float f10, float f11) {
                switch (i7) {
                    case 0:
                        this.b.invalidate();
                        break;
                    case 1:
                        this.b.invalidate();
                        break;
                    default:
                        this.b.invalidate();
                        break;
                }
            }
        });
        this.x3 = gVar;
        r1.f fVar2 = new r1.f(0.0f);
        this.y3 = fVar2;
        r1.g gVar2 = new r1.g(fVar2);
        gVar2.h = 0.0f;
        gVar2.m = org.telegram.ui.Cells.y0.n(0.0f, 400.0f, 0.5f);
        final int i10 = 1;
        gVar2.b(new r1.d(this) { // from class: org.telegram.ui.zi
            public final /* synthetic */ aj b;

            {
                this.b = this;
            }

            @Override // r1.d
            public final void a(r1.g gVar22, float f10, float f11) {
                switch (i10) {
                    case 0:
                        this.b.invalidate();
                        break;
                    case 1:
                        this.b.invalidate();
                        break;
                    default:
                        this.b.invalidate();
                        break;
                }
            }
        });
        this.z3 = gVar2;
        r1.f fVar3 = new r1.f(0.0f);
        this.A3 = fVar3;
        r1.g gVar3 = new r1.g(fVar3);
        gVar3.h = 0.0f;
        gVar3.m = org.telegram.ui.Cells.y0.n(0.0f, 200.0f, 1.0f);
        final int i11 = 2;
        gVar3.b(new r1.d(this) { // from class: org.telegram.ui.zi
            public final /* synthetic */ aj b;

            {
                this.b = this;
            }

            @Override // r1.d
            public final void a(r1.g gVar22, float f10, float f11) {
                switch (i11) {
                    case 0:
                        this.b.invalidate();
                        break;
                    case 1:
                        this.b.invalidate();
                        break;
                    default:
                        this.b.invalidate();
                        break;
                }
            }
        });
        this.B3 = gVar3;
        this.D3 = new Path();
        this.F3 = 0;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A1(Canvas canvas, RectF rectF) {
        float f10;
        ArrayList arrayList;
        ArrayList arrayList2 = this.h3;
        int size = arrayList2.size();
        an anVar = this.G3;
        boolean z10 = 1;
        boolean z11 = false;
        if (size > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) arrayList2.get(i7);
                if (!an.m2(anVar, q1Var, rectF)) {
                    canvas.save();
                    canvas.translate(q1Var.S1(false) + q1Var.getLeft(), q1Var.getY() + q1Var.getPaddingTop());
                    q1Var.y1(q1Var.a() ? q1Var.getAlpha() : 1.0f, canvas, true);
                    canvas.restore();
                }
            }
            arrayList2.clear();
        }
        ArrayList arrayList3 = this.i3;
        int size2 = arrayList3.size();
        if (size2 > 0) {
            for (int i10 = 0; i10 < size2; i10++) {
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) arrayList3.get(i10);
                if (!an.m2(anVar, q1Var2, rectF)) {
                    float S1 = q1Var2.S1(false) + q1Var2.getLeft();
                    float y10 = q1Var2.getY() + q1Var2.getPaddingTop();
                    float alpha = q1Var2.a() ? q1Var2.getAlpha() : 1.0f;
                    canvas.save();
                    canvas.translate(S1, y10);
                    q1Var2.setInvalidatesParent(true);
                    q1Var2.h1(canvas, alpha);
                    q1Var2.setInvalidatesParent(false);
                    canvas.restore();
                }
            }
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.j3;
        int size3 = arrayList4.size();
        if (size3 > 0) {
            int i11 = 0;
            while (i11 < size3) {
                org.telegram.ui.Cells.q1 q1Var3 = (org.telegram.ui.Cells.q1) arrayList4.get(i11);
                if (an.m2(anVar, q1Var3, rectF)) {
                    arrayList = arrayList4;
                } else {
                    boolean z12 = (q1Var3.getCurrentPosition() == null || (q1Var3.getCurrentPosition().l & z10) != 0) ? z11 : z10;
                    float alpha2 = q1Var3.a() ? q1Var3.getAlpha() : 1.0f;
                    float S12 = q1Var3.S1(z11) + q1Var3.getLeft();
                    float y11 = q1Var3.getY() + q1Var3.getPaddingTop();
                    canvas.save();
                    org.telegram.messenger.bj currentMessagesGroup = q1Var3.getCurrentMessagesGroup();
                    if (currentMessagesGroup != null) {
                        org.telegram.messenger.aj ajVar = currentMessagesGroup.m;
                        if (ajVar.j) {
                            float S13 = q1Var3.S1(z10);
                            float f11 = ajVar.a + S13 + ajVar.e;
                            arrayList = arrayList4;
                            float f12 = ajVar.b + ajVar.f;
                            float f13 = ajVar.c + S13 + ajVar.g;
                            float f14 = ajVar.d + ajVar.h;
                            if (!ajVar.j) {
                                f12 += q1Var3.getTranslationY();
                                f14 += q1Var3.getTranslationY();
                            }
                            canvas.clipRect(f11 + org.telegram.messenger.g0.L(8.0f), f12 + org.telegram.messenger.g0.L(8.0f), f13 - org.telegram.messenger.g0.L(8.0f), f14 - org.telegram.messenger.g0.L(8.0f));
                        } else {
                            arrayList = arrayList4;
                        }
                    } else {
                        arrayList = arrayList4;
                    }
                    if (q1Var3.getTransitionParams().w0) {
                        canvas.translate(S12, y11);
                        q1Var3.setInvalidatesParent(true);
                        q1Var3.Q0(alpha2, canvas, z12);
                        q1Var3.setInvalidatesParent(false);
                    }
                    canvas.restore();
                }
                i11++;
                arrayList4 = arrayList;
                z10 = 1;
                z11 = false;
            }
            f10 = 8.0f;
            arrayList4.clear();
        } else {
            f10 = 8.0f;
        }
        ArrayList arrayList5 = this.k3;
        int size4 = arrayList5.size();
        if (size4 > 0) {
            for (int i12 = 0; i12 < size4; i12++) {
                org.telegram.ui.Cells.q1 q1Var4 = (org.telegram.ui.Cells.q1) arrayList5.get(i12);
                if (!an.m2(anVar, q1Var4, rectF)) {
                    boolean z13 = q1Var4.getCurrentPosition() != null && (q1Var4.getCurrentPosition().l & 1) == 0;
                    float alpha3 = q1Var4.a() ? q1Var4.getAlpha() : 1.0f;
                    float S14 = q1Var4.S1(false) + q1Var4.getLeft();
                    float y12 = q1Var4.getY() + q1Var4.getPaddingTop();
                    canvas.save();
                    org.telegram.messenger.bj currentMessagesGroup2 = q1Var4.getCurrentMessagesGroup();
                    if (currentMessagesGroup2 != null) {
                        org.telegram.messenger.aj ajVar2 = currentMessagesGroup2.m;
                        if (ajVar2.j) {
                            float S15 = q1Var4.S1(true);
                            float f15 = ajVar2.a + S15 + ajVar2.e;
                            float f16 = ajVar2.b + ajVar2.f;
                            float f17 = ajVar2.c + S15 + ajVar2.g;
                            float f18 = ajVar2.d + ajVar2.h;
                            if (!ajVar2.j) {
                                f16 += q1Var4.getTranslationY();
                                f18 += q1Var4.getTranslationY();
                            }
                            canvas.clipRect(f15 + org.telegram.messenger.g0.L(f10), f16 + org.telegram.messenger.g0.L(f10), f17 - org.telegram.messenger.g0.L(f10), f18 - org.telegram.messenger.g0.L(f10));
                        }
                    }
                    if (!z13 && q1Var4.getTransitionParams().w0) {
                        canvas.translate(S14, y12);
                        q1Var4.setInvalidatesParent(true);
                        q1Var4.o1(canvas, alpha3, null);
                        q1Var4.V0(canvas, alpha3);
                        q1Var4.setInvalidatesParent(false);
                    }
                    canvas.restore();
                }
            }
            arrayList5.clear();
        }
    }

    public final void B1(boolean z10) {
        float f10;
        VelocityTracker velocityTracker;
        an anVar = this.G3;
        if (!z10 || (velocityTracker = anVar.A9) == null) {
            f10 = 0.0f;
        } else {
            velocityTracker.computeCurrentVelocity(1000);
            f10 = anVar.A9.getXVelocity();
        }
        VelocityTracker velocityTracker2 = anVar.A9;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            anVar.A9 = null;
        }
        anVar.x9 = false;
        anVar.C0.R = true;
        org.telegram.ui.Components.v01 v01Var = anVar.n0;
        if (v01Var != null) {
            v01Var.settle(f10);
        }
    }

    public final void C1(MotionEvent motionEvent) {
        TLRPC.Chat chat;
        org.telegram.messenger.bj U8;
        org.telegram.messenger.gj gjVar;
        boolean z10;
        ArrayList arrayList;
        TLRPC.Chat chat2;
        boolean z11;
        an anVar = this.G3;
        if (motionEvent != null) {
            anVar.Q4 = true;
        }
        if (anVar.ga() && anVar.u9 == null) {
            if (motionEvent == null) {
                if (anVar.x9) {
                    B1(false);
                }
                anVar.w9 = false;
            } else {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    z11 = ((org.telegram.ui.ActionBar.e2) anVar).inPreviewMode;
                    boolean z12 = (z11 || anVar.A9() || motionEvent.getX() < ((float) getMeasuredWidth()) * 0.55f) ? false : true;
                    anVar.w9 = z12;
                    if (z12) {
                        anVar.x9 = false;
                        anVar.y9 = motionEvent.getX();
                        anVar.z9 = motionEvent.getY();
                        VelocityTracker velocityTracker = anVar.A9;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                        }
                        VelocityTracker obtain = VelocityTracker.obtain();
                        anVar.A9 = obtain;
                        obtain.addMovement(motionEvent);
                        return;
                    }
                    anVar.x9 = false;
                } else if (anVar.w9 || anVar.x9) {
                    if (actionMasked != 2) {
                        if (actionMasked == 1 || actionMasked == 3) {
                            if (anVar.x9) {
                                VelocityTracker velocityTracker2 = anVar.A9;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.addMovement(motionEvent);
                                }
                                B1(actionMasked == 1);
                            }
                            anVar.w9 = false;
                            return;
                        }
                        return;
                    }
                    VelocityTracker velocityTracker3 = anVar.A9;
                    if (velocityTracker3 != null) {
                        velocityTracker3.addMovement(motionEvent);
                    }
                    float x10 = motionEvent.getX() - anVar.y9;
                    float abs = Math.abs(motionEvent.getY() - anVar.z9);
                    if (!anVar.w9 || anVar.x9 || getScrollState() != 0 || x10 > (-org.telegram.messenger.g0.a1(true, 0.4f)) || Math.abs(x10) / 3.0f <= abs || anVar.A8() == null) {
                        if (anVar.x9) {
                            anVar.n0.setProgress((-(motionEvent.getX() - anVar.y9)) / anVar.n0.getContentWidth());
                            return;
                        }
                        return;
                    }
                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    super.onInterceptTouchEvent(obtain2);
                    obtain2.recycle();
                    anVar.C0.R = false;
                    anVar.w9 = false;
                    anVar.x9 = true;
                    anVar.y9 = motionEvent.getX();
                    org.telegram.ui.Components.v01 v01Var = anVar.n0;
                    ValueAnimator valueAnimator = v01Var.K;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        v01Var.K = null;
                    }
                    org.telegram.messenger.g0.v1(anVar.m1);
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        return;
                    }
                    return;
                }
            }
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !anVar.B9 && !anVar.v9 && anVar.u9 == null) {
            z10 = ((org.telegram.ui.ActionBar.e2) anVar).inPreviewMode;
            if (!z10) {
                View pressedChildView = getPressedChildView();
                if (!(pressedChildView instanceof org.telegram.ui.Cells.q1)) {
                    if (!(pressedChildView instanceof org.telegram.ui.Cells.t0)) {
                        return;
                    }
                    org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) pressedChildView;
                    float x11 = motionEvent.getX() - pressedChildView.getX();
                    float y10 = motionEvent.getY() - pressedChildView.getY();
                    if (!t0Var.V()) {
                        return;
                    }
                    org.telegram.ui.Wallet.c4 c4Var = t0Var.J0;
                    float f10 = (x11 - t0Var.L0) - (t0Var.k0 / 2.0f);
                    float paddingTop = (y10 - t0Var.M0) - t0Var.getPaddingTop();
                    org.telegram.ui.Wallet.b4 b4Var = c4Var.m;
                    if (b4Var != null && b4Var.n && c4Var.w.contains((int) f10, (int) paddingTop)) {
                        return;
                    }
                }
                if (anVar.u9 != null) {
                    an.e2(anVar, 0.0f);
                }
                anVar.u9 = pressedChildView;
                org.telegram.messenger.gj a22 = an.a2(anVar);
                boolean U6 = anVar.U6(a22);
                int i7 = anVar.g4;
                if ((i7 != 0 && i7 != 5 && i7 != 8 && (i7 != 3 || anVar.s4 != anVar.getUserConfig().e())) || (((arrayList = anVar.p4) != null && arrayList.contains(a22)) || ((anVar.a9(a22) == 1 && (org.telegram.messenger.gj.B0(a22.k) == anVar.c7 || a22.m5())) || ((anVar.h == null && a22.e1() < 0) || (((chat2 = anVar.e) != null && org.telegram.messenger.t3.c0(chat2) && !U6) || anVar.A9() || (org.telegram.messenger.gj.c3(a22.k) && a22.N3())))))) {
                    an.e2(anVar, 0.0f);
                    anVar.u9 = null;
                    return;
                } else {
                    this.o3 = motionEvent.getPointerId(0);
                    anVar.v9 = true;
                    this.m3 = (int) motionEvent.getX();
                    this.n3 = (int) motionEvent.getY();
                    return;
                }
            }
        }
        if (anVar.u9 != null && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.o3) {
            int max = Math.max(org.telegram.messenger.g0.L(-80.0f), Math.min(0, (int) (motionEvent.getX() - this.m3)));
            int abs2 = Math.abs(((int) motionEvent.getY()) - this.n3);
            if (getScrollState() == 0 && anVar.v9 && !anVar.B9 && max <= (-org.telegram.messenger.g0.a1(true, 0.4f)) && Math.abs(max) / 3 > abs2) {
                MotionEvent obtain3 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                anVar.u9.onTouchEvent(obtain3);
                super.onInterceptTouchEvent(obtain3);
                obtain3.recycle();
                anVar.C0.R = false;
                anVar.v9 = false;
                anVar.B9 = true;
                this.m3 = (int) motionEvent.getX();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            }
            if (anVar.B9) {
                if (Math.abs(max) < org.telegram.messenger.g0.L(50.0f)) {
                    this.s3 = false;
                } else if (!this.s3) {
                    try {
                        performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    this.s3 = true;
                }
                float f11 = max;
                an.e2(anVar, f11);
                org.telegram.messenger.gj a23 = an.a2(anVar);
                if (a23 != null && (a23.h4() || org.telegram.messenger.gj.L4(a23.k))) {
                    anVar.vd(false, false);
                }
                View view = anVar.u9;
                if (view instanceof org.telegram.ui.Cells.q1) {
                    D1((org.telegram.ui.Cells.q1) view, f11);
                }
                invalidate();
                return;
            }
            return;
        }
        if (anVar.u9 != null) {
            if (motionEvent != null) {
                if (motionEvent.getPointerId(0) != this.o3) {
                    return;
                }
                if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1 && motionEvent.getAction() != 6) {
                    return;
                }
            }
            if (motionEvent != null && motionEvent.getAction() != 3) {
                View view2 = anVar.u9;
                if (Math.abs(view2 instanceof org.telegram.ui.Cells.q1 ? ((org.telegram.ui.Cells.q1) view2).S1(false) : view2 instanceof org.telegram.ui.Cells.t0 ? ((org.telegram.ui.Cells.t0) view2).getWalletSlidingOffset() : 0.0f) >= org.telegram.messenger.g0.L(50.0f)) {
                    org.telegram.messenger.gj a24 = an.a2(anVar);
                    boolean U62 = anVar.U6(a24);
                    uj ujVar = anVar.d1;
                    if ((ujVar == null || ujVar.getVisibility() != 0 || ((anVar.X0 && U62) || a24.X1)) && ((chat = anVar.e) == null || ((!org.telegram.messenger.t3.r0(chat) || anVar.fa()) && ((!org.telegram.messenger.t3.T(anVar.e) || org.telegram.messenger.t3.w(5, anVar.e) || anVar.e.megagroup) && org.telegram.messenger.t3.n(anVar.e))))) {
                        anVar.ic(an.a2(anVar));
                    } else {
                        if (a24.c1() != 0 && (U8 = anVar.U8(a24.c1())) != null && (gjVar = U8.h) != null) {
                            a24 = gjVar;
                        }
                        anVar.E5 = a24;
                        Bundle j3 = org.telegram.ui.Cells.y0.j(3, "onlySelect", "dialogsType", true);
                        j3.putBoolean("quote", true);
                        j3.putBoolean("reply_to", true);
                        anVar.gb(j3, a24);
                        j3.putInt("messagesCount", 1);
                        j3.putBoolean("canSelectTopics", true);
                        yw ywVar = new yw(j3);
                        ywVar.E2 = anVar;
                        anVar.presentFragment(ywVar);
                    }
                }
            }
            View view3 = anVar.u9;
            float slidingOffsetX = view3 instanceof org.telegram.ui.Cells.q1 ? ((org.telegram.ui.Cells.q1) view3).getSlidingOffsetX() : view3 instanceof org.telegram.ui.Cells.t0 ? ((org.telegram.ui.Cells.t0) view3).getWalletSlidingOffset() : 0.0f;
            this.r3 = slidingOffsetX;
            if (slidingOffsetX == 0.0f) {
                anVar.u9 = null;
            }
            this.p3 = System.currentTimeMillis();
            this.q3 = 0.0f;
            invalidate();
            anVar.v9 = false;
            anVar.B9 = false;
            anVar.C0.R = true;
        }
    }

    public final void D1(org.telegram.ui.Cells.q1 q1Var, float f10) {
        org.telegram.messenger.bj currentMessagesGroup = q1Var.getCurrentMessagesGroup();
        if (currentMessagesGroup == null) {
            return;
        }
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt != q1Var && (childAt instanceof org.telegram.ui.Cells.q1)) {
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                if (q1Var2.getCurrentMessagesGroup() == currentMessagesGroup) {
                    q1Var2.setSlidingOffset(f10);
                    q1Var2.invalidate();
                }
            }
        }
        invalidate();
    }

    @Override // org.telegram.ui.Components.uj0
    public final boolean F0(View view) {
        return (view.getVisibility() == 4 || view.getVisibility() == 8) ? false : true;
    }

    @Override // android.view.View
    public final AccessibilityNodeInfo createAccessibilityNodeInfo() {
        if (this.G3.h != null) {
            return null;
        }
        return super.createAccessibilityNodeInfo();
    }

    @Override // org.telegram.ui.Components.uj0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        an anVar = this.G3;
        anVar.J8 = null;
        canvas.save();
        if (anVar.ra != null && anVar.na) {
            boolean z10 = anVar.oa;
        }
        this.F1.setEmpty();
        if (anVar.ja != 0.0f) {
            int save = canvas.save();
            float measuredHeight = (-anVar.ja) - (anVar.qa != 0.0f ? (anVar.A0.getMeasuredHeight() - anVar.ja) * anVar.qa : 0.0f);
            anVar.Va = measuredHeight;
            canvas.translate(0.0f, measuredHeight);
            z1(canvas, null);
            super.dispatchDraw(canvas);
            A1(canvas, null);
            canvas.restoreToCount(save);
        } else {
            z1(canvas, null);
            super.dispatchDraw(canvas);
            A1(canvas, null);
        }
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002b, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r2.e7) <= 200) goto L8;
     */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        ArrayList arrayList;
        boolean z10;
        float f10;
        int i7;
        int L;
        int i10;
        org.telegram.ui.ActionBar.r4 r4Var;
        float f11;
        org.telegram.ui.ActionBar.r4 r4Var2;
        boolean z11;
        om omVar;
        int i11;
        int i12;
        float f12;
        int L2;
        int i13;
        float f13;
        float f14;
        boolean z12;
        an anVar = this.G3;
        ArrayList arrayList2 = anVar.L6;
        ColorMatrix colorMatrix = anVar.i7;
        m.b3 b3Var = anVar.j7;
        org.telegram.ui.ActionBar.r4 r4Var3 = anVar.k7;
        Paint paint = anVar.s7;
        Paint paint2 = anVar.g7;
        ArrayList arrayList3 = anVar.f7;
        Paint paint3 = anVar.h7;
        long j3 = anVar.e7 != 0 ? 0L : 0L;
        if (!org.telegram.messenger.g0.Q1() && !anVar.v4 && anVar.f == null) {
            TLRPC.Chat chat = anVar.e;
            boolean z13 = (chat == null || org.telegram.messenger.t3.V(chat)) && anVar.g4 != 7;
            if (anVar.ja != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, -anVar.ja);
            }
            int i14 = org.telegram.ui.ActionBar.j6.d6;
            org.telegram.ui.ActionBar.e6 e6Var = this.o2;
            boolean z14 = i0.a.h(org.telegram.ui.ActionBar.j6.w0(i14, e6Var)) <= 0.699999988079071d;
            int i15 = org.telegram.ui.ActionBar.j6.i6;
            boolean z15 = z13;
            int f15 = i0.a.f(z14 ? 0.9f : 0.5f, org.telegram.ui.ActionBar.j6.w0(i15, e6Var), Color.argb(z14 ? 33 : 3, org.telegram.messenger.ns.e4, org.telegram.messenger.ns.e4, org.telegram.messenger.ns.e4));
            int o4 = i0.a.o(org.telegram.ui.ActionBar.j6.w0(i15, e6Var), z14 ? 24 : an.ld);
            if (anVar.r7 != o4 || anVar.q7 != f15) {
                anVar.q7 = f15;
                anVar.r7 = o4;
                int L3 = org.telegram.messenger.g0.L(200.0f);
                anVar.m7 = L3;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, L3, 0.0f, new int[]{o4, f15, f15, o4}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                anVar.p7 = linearGradient;
                anVar.n7 = (-anVar.m7) * 2;
                paint2.setShader(linearGradient);
                int argb = Color.argb(z14 ? 43 : 96, org.telegram.messenger.ns.e4, org.telegram.messenger.ns.e4, org.telegram.messenger.ns.e4);
                LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, anVar.m7, 0.0f, new int[]{0, argb, argb, 0}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                anVar.u7 = linearGradient2;
                paint.setShader(linearGradient2);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            org.telegram.ui.ActionBar.r4 r4Var4 = r4Var3;
            long j10 = anVar.l7;
            int i16 = 2;
            Matrix matrix = anVar.t7;
            m.b3 b3Var2 = b3Var;
            Matrix matrix2 = anVar.o7;
            long abs = Math.abs(j10 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            long j11 = abs < 4 ? j3 : abs;
            int width = getWidth();
            anVar.l7 = elapsedRealtime;
            int i17 = (int) (anVar.n7 + ((width * j11) / 400.0f));
            anVar.n7 = i17;
            if (i17 >= width * 2) {
                anVar.n7 = (-anVar.m7) * 2;
            }
            matrix2.setTranslate(anVar.n7, 0.0f);
            LinearGradient linearGradient3 = anVar.p7;
            if (linearGradient3 != null) {
                linearGradient3.setLocalMatrix(matrix2);
            }
            matrix.setTranslate(anVar.n7, 0.0f);
            LinearGradient linearGradient4 = anVar.u7;
            if (linearGradient4 != null) {
                linearGradient4.setLocalMatrix(matrix);
            }
            int height = ((getHeight() - anVar.Xa) - ((int) (anVar.t9(org.telegram.ui.Components.l11.c) + anVar.w.d()))) - org.telegram.messenger.g0.L(57.0f);
            int i18 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            for (int i19 = 0; i19 < getChildCount(); i19++) {
                int top = getChildAt(i19).getTop();
                if (top < i18) {
                    i18 = top;
                }
            }
            if (anVar.e7 == j3 && i18 <= 0) {
                z12 = ((org.telegram.ui.ActionBar.e2) anVar).fragmentBeginToShow;
                anVar.a7(z12);
            }
            Paint W0 = W0("paintChatActionBackground");
            if (paint3.getColor() != W0.getColor()) {
                paint3.setColor(W0.getColor());
            }
            if (paint3.getShader() != W0.getShader()) {
                paint3.setShader(W0.getShader());
                colorMatrix.setSaturation(an.md);
                paint3.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            }
            int i20 = 0;
            while (i20 < getChildCount()) {
                View childAt = getChildAt(i20);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                    org.telegram.messenger.bj currentMessagesGroup = q1Var.getCurrentMessagesGroup();
                    float top2 = childAt.getTop() + q1Var.M1(true).getBounds().top;
                    if (currentMessagesGroup != null) {
                        f13 = 1.0f;
                        f14 = r13.b + currentMessagesGroup.m.f;
                    } else {
                        f13 = 1.0f;
                        f14 = 0.0f;
                    }
                    int i21 = (int) (top2 + f14);
                    i13 = i20;
                    if (anVar.e7 == j3 && anVar.da()) {
                        i21 = org.telegram.messenger.g0.W1(childAt.getAlpha(), height, i21);
                    } else if (childAt.getAlpha() != f13) {
                        i21 = height;
                    }
                    if (i21 < height) {
                        height = i21;
                    }
                } else {
                    i13 = i20;
                    if (childAt instanceof org.telegram.ui.Cells.t0) {
                        int W1 = (anVar.e7 == j3 && anVar.da()) ? org.telegram.messenger.g0.W1(childAt.getAlpha(), height, childAt.getTop()) : childAt.getAlpha() == 1.0f ? childAt.getTop() : height;
                        if (W1 < height) {
                            height = W1;
                        }
                    }
                }
                i20 = i13 + 1;
            }
            if (anVar.da()) {
                boolean z16 = org.telegram.messenger.gz.o() != 0 && org.telegram.ui.ActionBar.j6.d1();
                int i22 = org.telegram.ui.ActionBar.j6.d6;
                boolean z17 = i0.a.h(org.telegram.ui.ActionBar.j6.w0(i22, e6Var)) <= 0.699999988079071d && org.telegram.ui.ActionBar.j6.d1();
                boolean z18 = i0.a.h(org.telegram.ui.ActionBar.j6.w0(i22, e6Var)) <= 0.009999999776482582d && org.telegram.ui.ActionBar.j6.d1();
                if (z16) {
                    org.telegram.ui.ActionBar.j6.r(0.0f, getY() - anVar.S9, getMeasuredWidth(), org.telegram.messenger.g0.q.y);
                }
                int alpha = org.telegram.ui.ActionBar.j6.h2.getAlpha();
                if (z18) {
                    org.telegram.ui.ActionBar.j6.h2.setAlpha((int) (alpha * 4.0f));
                }
                if (anVar.e7 != j3) {
                    z10 = z17;
                    f10 = 1.0f - ((System.currentTimeMillis() - anVar.e7) / 200.0f);
                } else {
                    z10 = z17;
                    f10 = 1.0f;
                }
                int alpha2 = paint2.getAlpha();
                int alpha3 = paint3.getAlpha();
                int alpha4 = paint.getAlpha();
                ym ymVar = anVar.Aa;
                float f16 = (ymVar == null || !ymVar.q || paint3.getShader() == null) ? 1.0f : 0.3f;
                paint3.setAlpha((int) (255.0f * f10 * f16));
                float f17 = alpha2;
                paint2.setAlpha((int) (f10 * f16 * f17));
                paint.setAlpha((int) (f10 * f17));
                int i23 = 0;
                while (height > anVar.Wa) {
                    int L4 = height - org.telegram.messenger.g0.L(3.0f);
                    if (i23 >= arrayList3.size()) {
                        omVar = new om();
                        r4Var2 = r4Var4;
                        TLRPC.Chat chat2 = anVar.e;
                        if (chat2 == null || !org.telegram.messenger.t3.V(chat2)) {
                            z11 = z16;
                            omVar.b = Utilities.c.nextInt(org.telegram.messenger.g0.L(64.0f)) + org.telegram.messenger.g0.L(64.0f);
                        } else {
                            z11 = z16;
                            omVar.b = Utilities.c.nextInt(org.telegram.messenger.g0.L(64.0f)) + org.telegram.messenger.g0.L(128.0f);
                        }
                        float width2 = anVar.A0.getWidth() * 0.8f;
                        if (z15) {
                            f12 = 42.0f;
                            L2 = 0;
                        } else {
                            f12 = 42.0f;
                            L2 = org.telegram.messenger.g0.L(42.0f);
                        }
                        omVar.a = (int) Math.min(width2 - L2, (((Utilities.c.nextFloat() * 0.35f) + 0.4f) * anVar.A0.getWidth()) + org.telegram.messenger.g0.L(f12));
                        arrayList3.add(omVar);
                    } else {
                        r4Var2 = r4Var4;
                        z11 = z16;
                        omVar = (om) arrayList3.get(i23);
                    }
                    boolean z19 = z10;
                    if (anVar.e7 != j3) {
                        i11 = i16;
                        i12 = arrayList2.size() <= i11 ? Math.min(omVar.c, L4) : omVar.c;
                    } else {
                        i11 = i16;
                        i12 = L4;
                    }
                    omVar.c = i12;
                    height = L4 - omVar.b;
                    i23++;
                    i16 = i11;
                    z16 = z11;
                    z10 = z19;
                    r4Var4 = r4Var2;
                }
                org.telegram.ui.ActionBar.r4 r4Var5 = r4Var4;
                boolean z20 = z16;
                boolean z21 = z10;
                if (arrayList3.isEmpty()) {
                    L = getHeight() - anVar.Xa;
                    i7 = 0;
                } else {
                    i7 = 0;
                    L = ((om) arrayList3.get(0)).c + org.telegram.messenger.g0.L(3.0f);
                }
                int L5 = org.telegram.messenger.g0.L(z15 ? 3.0f : 51.0f);
                if (anVar.ba()) {
                    L5 = org.telegram.messenger.g0.W1(anVar.m9(), L5, org.telegram.messenger.g0.L(71.0f));
                }
                while (i7 < arrayList3.size() && L > anVar.Wa) {
                    int L6 = L - org.telegram.messenger.g0.L(3.0f);
                    om omVar2 = (om) arrayList3.get(i7);
                    int i24 = omVar2.c;
                    ArrayList arrayList4 = arrayList3;
                    boolean z22 = z21;
                    org.telegram.ui.ActionBar.r4 r4Var6 = r4Var5;
                    r4Var6.setBounds(L5, i24 - omVar2.b, omVar2.a, i24);
                    m.b3 b3Var3 = b3Var2;
                    if (z20) {
                        r4Var6.d(canvas, b3Var3, paint3);
                    }
                    r4Var6.d(canvas, b3Var3, paint2);
                    if (z22) {
                        r4Var6.d(canvas, b3Var3, org.telegram.ui.ActionBar.j6.h2);
                    }
                    r4Var6.d(canvas, b3Var3, paint);
                    if (z15) {
                        b3Var2 = b3Var3;
                        i10 = L5;
                        r4Var = r4Var6;
                    } else {
                        if (z20) {
                            f11 = 27.0f;
                            b3Var2 = b3Var3;
                            i10 = L5;
                            canvas.drawCircle(org.telegram.messenger.g0.L(27.0f), i24 - org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(21.0f), paint3);
                        } else {
                            b3Var2 = b3Var3;
                            i10 = L5;
                            f11 = 27.0f;
                        }
                        canvas.drawCircle(org.telegram.messenger.g0.L(f11), i24 - org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(21.0f), paint2);
                        if (z22) {
                            r4Var = r4Var6;
                            canvas.drawCircle(org.telegram.messenger.g0.L(f11), i24 - org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.ui.ActionBar.j6.h2);
                        } else {
                            r4Var = r4Var6;
                        }
                        canvas.drawCircle(org.telegram.messenger.g0.L(f11), i24 - org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(21.0f), paint);
                    }
                    L = L6 - omVar2.b;
                    i7++;
                    arrayList3 = arrayList4;
                    z21 = z22;
                    L5 = i10;
                    r4Var5 = r4Var;
                }
                arrayList = arrayList3;
                paint3.setAlpha(alpha3);
                paint2.setAlpha(alpha2);
                paint.setAlpha(alpha4);
                org.telegram.ui.ActionBar.j6.h2.setAlpha(alpha);
                invalidate();
            } else {
                arrayList = arrayList3;
                if (System.currentTimeMillis() - anVar.e7 > 200) {
                    arrayList.clear();
                }
            }
            arrayList.size();
            arrayList2.size();
            if (anVar.ja != 0.0f) {
                canvas.restore();
            }
        }
        super.draw(canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x028c, code lost:
    
        if ((r4 & 1) != 0) goto L161;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0199  */
    /* JADX WARN: Type inference failed for: r0v52, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v61, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11, types: [org.telegram.ui.Cells.p4] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v15, types: [org.telegram.ui.Cells.p4] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v18, types: [org.telegram.ui.Cells.p4] */
    /* JADX WARN: Type inference failed for: r11v40 */
    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.Cells.q1 q1Var;
        boolean z10;
        org.telegram.ui.Cells.q1 q1Var2;
        org.telegram.ui.Cells.t0 t0Var;
        int i7;
        org.telegram.messenger.bj bjVar;
        int i10;
        boolean z11;
        float f10;
        boolean z12;
        float f11;
        boolean z13;
        float f12;
        boolean z14;
        boolean z15;
        int paddingTop;
        float f13;
        float checkBoxTranslation;
        int i11;
        float f14;
        int b10;
        int b11;
        int i12;
        int i13;
        org.telegram.messenger.gj gjVar;
        an anVar = this.G3;
        if (anVar.da()) {
            invalidate();
        }
        boolean z16 = view == anVar.Y8;
        boolean z17 = view instanceof org.telegram.ui.Cells.q1;
        if (z17) {
            q1Var = (org.telegram.ui.Cells.q1) view;
            z10 = q1Var.ib.x0;
        } else {
            q1Var = null;
            z10 = false;
        }
        if ((!org.telegram.ui.Components.st0.f0 && ((view.getY() > getMeasuredHeight() || view.getY() + view.getMeasuredHeight() < 0.0f) && !z10)) || view.getVisibility() == 4 || view.getVisibility() == 8) {
            z16 = true;
        }
        if (z17) {
            q1Var2 = (org.telegram.ui.Cells.q1) view;
            if (anVar.E6.contains(q1Var2)) {
                z16 = true;
            }
            org.telegram.messenger.yi currentPosition = q1Var2.getCurrentPosition();
            bjVar = q1Var2.getCurrentMessagesGroup();
            if (currentPosition != null) {
                int i14 = currentPosition.e;
                int i15 = currentPosition.i;
                if (i14 != i15 && i15 == 1000 && currentPosition.m == null && bjVar.b) {
                    i7 = q1Var2.getBackgroundDrawableLeft();
                    i10 = 0;
                    i13 = q1Var2.M1;
                    if (i13 != 7) {
                    }
                    anVar.J8 = q1Var2;
                    if (!z16) {
                    }
                    if (z16) {
                    }
                    t0Var = null;
                } else if (currentPosition.m != null) {
                    i10 = view.getBottom() - org.telegram.messenger.g0.L((q1Var2.I2() ? 1 : 0) + 1);
                    i7 = 0;
                    i13 = q1Var2.M1;
                    if ((i13 != 7 || i13 == 4) && (gjVar = q1Var2.Q5) != null && gjVar.D != 5 && MediaController.B().I(q1Var2.Q5)) {
                        anVar.J8 = q1Var2;
                    }
                    if (!z16) {
                        View view2 = anVar.Y8;
                        if (view2 instanceof org.telegram.ui.Cells.q1) {
                            org.telegram.ui.Cells.q1 q1Var3 = (org.telegram.ui.Cells.q1) view2;
                            if (q1Var3.getCurrentMessagesGroup() != null && q1Var3.getCurrentMessagesGroup() == bjVar) {
                                z16 = true;
                            }
                        }
                    }
                    if (z16) {
                        q1Var2.getPhotoImage().getClass();
                    }
                    t0Var = null;
                }
            }
            i7 = 0;
            i10 = 0;
            i13 = q1Var2.M1;
            if (i13 != 7) {
            }
            anVar.J8 = q1Var2;
            if (!z16) {
            }
            if (z16) {
            }
            t0Var = null;
        } else {
            if (view instanceof org.telegram.ui.Cells.t0) {
                t0Var = (org.telegram.ui.Cells.t0) view;
                q1Var2 = null;
            } else {
                q1Var2 = null;
                t0Var = null;
            }
            i7 = 0;
            bjVar = null;
            i10 = 0;
        }
        if (i7 != 0) {
            canvas.save();
        } else if (i10 != 0) {
            canvas.save();
        }
        if (z16) {
            z16 = false;
        }
        if (z16) {
            z11 = true;
            f10 = 0.0f;
            z12 = false;
        } else {
            boolean z18 = (q1Var2 == null || q1Var2.ib.w1 || bjVar == null || !bjVar.m.j) ? false : true;
            if (z18) {
                canvas.save();
                float S1 = q1Var2.S1(true);
                org.telegram.messenger.aj ajVar = bjVar.m;
                z11 = true;
                float f15 = ajVar.c + S1;
                f10 = 0.0f;
                canvas.clipRect(ajVar.a + S1 + ajVar.e + org.telegram.messenger.g0.L(4.0f), ajVar.b + ajVar.f + org.telegram.messenger.g0.L(4.0f), (f15 + ajVar.g) - org.telegram.messenger.g0.L(4.0f), (ajVar.d + ajVar.h) - org.telegram.messenger.g0.L(4.0f));
            } else {
                z11 = true;
                f10 = 0.0f;
            }
            if (q1Var2 != null) {
                org.telegram.ui.Cells.x1 x1Var = q1Var2.ib;
                if (x1Var.w1) {
                    canvas.save();
                    canvas.translate(q1Var2.getX(), q1Var2.getY());
                    q1Var2.d1(canvas);
                    canvas.restore();
                    z12 = x1Var.h;
                    if (z18) {
                        canvas.restore();
                    }
                    if (q1Var2 == null && q1Var2.k2()) {
                        canvas.save();
                        canvas.translate(q1Var2.getX(), q1Var2.getPaddingTopAnimated() + q1Var2.getY());
                        q1Var2.i1(canvas);
                        canvas.restore();
                    } else if (t0Var != null) {
                        canvas.save();
                        canvas.translate(t0Var.getX(), t0Var.getY());
                        t0Var.J(canvas);
                        canvas.restore();
                    }
                }
            }
            z12 = (q1Var2 == null || !z18) ? super.drawChild(canvas, view, j3) : super.drawChild(canvas, view, j3);
            if (z18) {
            }
            if (q1Var2 == null) {
            }
            if (t0Var != null) {
            }
        }
        if (i7 != 0 || i10 != 0) {
            canvas.restore();
        }
        if (view.getTranslationY() != f10) {
            canvas.save();
            f11 = f10;
            canvas.translate(f11, view.getTranslationY());
        } else {
            f11 = f10;
        }
        if (q1Var2 != null) {
            q1Var2.S0(canvas);
        }
        if (view.getTranslationY() != f11) {
            canvas.restore();
        }
        if (view.getTranslationY() != f11) {
            canvas.save();
            canvas.translate(f11, view.getTranslationY());
        }
        if (q1Var2 != null) {
            org.telegram.messenger.gj messageObject = q1Var2.getMessageObject();
            org.telegram.messenger.yi currentPosition2 = q1Var2.getCurrentPosition();
            if (!z16) {
                if (currentPosition2 != null || q1Var2.getTransitionParams().x0) {
                    if (currentPosition2 == null || currentPosition2.h || (currentPosition2.a == 0 && currentPosition2.c == 0)) {
                        if (currentPosition2 == null || currentPosition2.h) {
                            this.h3.add(q1Var2);
                        }
                        if ((currentPosition2 == null || (currentPosition2.a == 0 && currentPosition2.c == 0)) && q1Var2.j2()) {
                            this.i3.add(q1Var2);
                        }
                    }
                    if (currentPosition2 != null || q1Var2.getTransitionParams().D0 || q1Var2.getTransitionParams().x0) {
                        if (currentPosition2 == null || (currentPosition2.l & q1Var2.D()) != 0) {
                            this.j3.add(q1Var2);
                        }
                        if (currentPosition2 != null) {
                            int i16 = currentPosition2.l;
                            if ((i16 & 8) != 0) {
                            }
                        }
                        this.k3.add(q1Var2);
                    }
                }
                if (anVar.I8 != null && ((messageObject.h4() || org.telegram.messenger.gj.L4(messageObject.k)) && !messageObject.T4() && MediaController.B().I(messageObject))) {
                    ImageReceiver photoImage = q1Var2.getPhotoImage();
                    float x10 = q1Var2.getX() + photoImage.L0;
                    float y10 = (anVar.A0.getY() + ((q1Var2.getY() + q1Var2.getPaddingTop()) + photoImage.M0)) - anVar.I8.getTop();
                    if (anVar.I8.getTranslationX() != x10 || anVar.I8.getTranslationY() != y10) {
                        anVar.I8.setTranslationX(x10);
                        anVar.I8.setTranslationY(y10);
                        anVar.fragmentView.invalidate();
                        anVar.I8.invalidate();
                    }
                }
            }
        }
        if (q1Var != null) {
            org.telegram.messenger.gj messageObject2 = q1Var.getMessageObject();
            org.telegram.messenger.yi currentPosition3 = q1Var.getCurrentPosition();
            ImageReceiver avatarImage = q1Var.getAvatarImage();
            if (avatarImage != null && anVar.m9() < 1.0f) {
                org.telegram.messenger.bj u92 = anVar.u9(messageObject2);
                if (!q1Var.getMessageObject().Z) {
                    anVar.A0.getClass();
                    if (RecyclerView.R(view) != -1) {
                        z14 = z11;
                        z15 = (!anVar.A0.W1 || (u92 != null && u92.m.j)) ? z11 : false;
                        paddingTop = view.getPaddingTop() + (!z15 ? view.getTop() : (int) view.getY());
                        if (q1Var.m()) {
                            if (q1Var.za) {
                                b11 = ((SparseArray) anVar.n9.j).indexOfValue(view);
                                if (b11 >= 0) {
                                    b11 = ((SparseArray) anVar.n9.j).keyAt(b11);
                                }
                            } else {
                                b11 = anVar.A0.T(view).b();
                            }
                            if (b11 >= 0) {
                                if (u92 != null) {
                                    ArrayList arrayList = u92.e;
                                    if (currentPosition3 != null) {
                                        int indexOf = arrayList.indexOf(currentPosition3);
                                        f13 = 1.0f;
                                        int size = arrayList.size();
                                        if ((currentPosition3.l & 8) != 0) {
                                            i12 = (b11 - size) + indexOf;
                                        } else {
                                            i12 = b11 - 1;
                                            int i17 = indexOf + 1;
                                            while (i17 < size) {
                                                int i18 = i17;
                                                z13 = z12;
                                                if (((org.telegram.messenger.yi) arrayList.get(i17)).c > currentPosition3.d) {
                                                    break;
                                                }
                                                i12--;
                                                i17 = i18 + 1;
                                                z12 = z13;
                                            }
                                        }
                                        z13 = z12;
                                        if (q1Var.za) {
                                            if (anVar.A0.K(i12) != null) {
                                                if (view.getTranslationY() != 0.0f) {
                                                    canvas.restore();
                                                }
                                                avatarImage.O0(false, false);
                                                return z13;
                                            }
                                        } else if (((View) ((SparseArray) anVar.n9.j).get(i12)) != null) {
                                            if (view.getTranslationY() != 0.0f) {
                                                canvas.restore();
                                            }
                                            avatarImage.O0(false, false);
                                            return z13;
                                        }
                                        checkBoxTranslation = q1Var.getCheckBoxTranslation() + q1Var.getSlidingOffsetX();
                                        int layoutHeight = (int) (q1Var2.getLayoutHeight() + q1Var2.getTransitionParams().j0 + ((int) (q1Var.getPaddingTopAnimated() + ((int) (0 + (!z15 ? view.getTop() : view.getY()))))));
                                        int measuredHeight = anVar.A0.getMeasuredHeight() - anVar.A0.getPaddingBottom();
                                        boolean z19 = ((!q1Var.n1 || q1Var.o1) && checkBoxTranslation == 0.0f) ? z11 : false;
                                        if (!q1Var.K2() || q1Var.getTransitionParams().l2) {
                                            if (q1Var.getTransitionParams().l2) {
                                                float f16 = q1Var.getTransitionParams().L1;
                                                if (!q1Var.K2()) {
                                                    f16 = f13 - f16;
                                                }
                                                layoutHeight = (int) com.google.android.gms.internal.vision.e2.z(f13, f16, Math.min(layoutHeight, measuredHeight), layoutHeight * f16);
                                            }
                                        } else if (layoutHeight > measuredHeight) {
                                            layoutHeight = measuredHeight;
                                        }
                                        if (!z15 && view.getTranslationY() != 0.0f) {
                                            canvas.restore();
                                        }
                                        if (q1Var.j()) {
                                            if (q1Var.za) {
                                                b10 = ((SparseArray) anVar.n9.j).indexOfValue(view);
                                                if (b10 >= 0) {
                                                    b10 = ((SparseArray) anVar.n9.j).keyAt(b10);
                                                }
                                            } else {
                                                b10 = anVar.A0.T(view).b();
                                            }
                                            if (b10 >= 0) {
                                                float f17 = checkBoxTranslation;
                                                ?? r11 = q1Var;
                                                int i19 = b10;
                                                int i20 = 0;
                                                while (i20 < 20) {
                                                    i20++;
                                                    if (u92 != null) {
                                                        ArrayList arrayList2 = u92.e;
                                                        if (currentPosition3 != null) {
                                                            int indexOf2 = arrayList2.indexOf(currentPosition3);
                                                            if (indexOf2 < 0) {
                                                                break;
                                                            }
                                                            arrayList2.size();
                                                            i11 = layoutHeight;
                                                            if ((currentPosition3.l & 4) != 0) {
                                                                i19 = i19 + indexOf2 + 1;
                                                            } else {
                                                                i19++;
                                                                int i21 = indexOf2 - 1;
                                                                while (i21 >= 0) {
                                                                    int i22 = i21;
                                                                    if (((org.telegram.messenger.yi) arrayList2.get(i21)).d < currentPosition3.c) {
                                                                        break;
                                                                    }
                                                                    i19++;
                                                                    i21 = i22 - 1;
                                                                }
                                                            }
                                                            if (!r11.l()) {
                                                                ?? r02 = (View) ((SparseArray) anVar.n9.j).get(i19);
                                                                if (r02 == 0) {
                                                                    break;
                                                                }
                                                                paddingTop = r02.getPaddingTop() + r02.getTop();
                                                                if (!(r02 instanceof org.telegram.ui.Cells.p4)) {
                                                                    break;
                                                                }
                                                                r11 = (org.telegram.ui.Cells.p4) r02;
                                                                float checkBoxTranslation2 = r11.getCheckBoxTranslation() + r11.getSlidingOffsetX();
                                                                if (z19 && checkBoxTranslation2 > 0.0f) {
                                                                    f17 = checkBoxTranslation2;
                                                                }
                                                                if (!r11.j()) {
                                                                    break;
                                                                }
                                                                layoutHeight = i11;
                                                                r11 = r11;
                                                            } else {
                                                                v4.e1 K = anVar.A0.K(i19);
                                                                if (K == null) {
                                                                    break;
                                                                }
                                                                ?? r03 = K.a;
                                                                paddingTop = r03.getPaddingTop() + r03.getTop();
                                                                if (!(r03 instanceof org.telegram.ui.Cells.q1)) {
                                                                    break;
                                                                }
                                                                r11 = (org.telegram.ui.Cells.p4) r03;
                                                                float checkBoxTranslation3 = r11.getCheckBoxTranslation() + r11.getSlidingOffsetX();
                                                                if (z19 && checkBoxTranslation3 > 0.0f) {
                                                                    f17 = checkBoxTranslation3;
                                                                }
                                                                if (!r11.j()) {
                                                                    break;
                                                                }
                                                                layoutHeight = i11;
                                                                r11 = r11;
                                                            }
                                                            int L = i11 - org.telegram.messenger.g0.L(48.0f) < paddingTop ? org.telegram.messenger.g0.L(48.0f) + paddingTop : i11;
                                                            if (!q1Var.m()) {
                                                                int bottom = z15 ? view.getBottom() : (int) (q1Var.getDeltaBottom() + q1Var.getY() + q1Var.getMeasuredHeight());
                                                                if (L > bottom) {
                                                                    L = bottom;
                                                                }
                                                            }
                                                            canvas.save();
                                                            if (checkBoxTranslation != 0.0f) {
                                                                canvas.translate(checkBoxTranslation, 0.0f);
                                                            }
                                                            if (q1Var instanceof org.telegram.ui.Cells.q1) {
                                                                org.telegram.ui.Cells.q1 q1Var4 = q1Var;
                                                                if (q1Var4.getCurrentMessagesGroup() != null && q1Var4.getCurrentMessagesGroup().m.j) {
                                                                    L = (int) (L - q1Var4.getTranslationY());
                                                                }
                                                            }
                                                            if (z14) {
                                                                avatarImage.M0 = L - org.telegram.messenger.g0.L(44.0f);
                                                            }
                                                            if (q1Var.a()) {
                                                                avatarImage.setAlpha(q1Var.getAlpha() * (1.0f - anVar.m9()));
                                                                canvas.scale(q1Var.getScaleX(), q1Var.getScaleY(), q1Var.getPivotX() + q1Var.getX(), q1Var.getY() + (q1Var.getHeight() >> 1));
                                                                f14 = 1.0f;
                                                            } else {
                                                                f14 = 1.0f;
                                                                avatarImage.setAlpha(1.0f - anVar.m9());
                                                            }
                                                            if (z14) {
                                                                avatarImage.O0(z11, false);
                                                            }
                                                            if (anVar.m9() > 0.0f) {
                                                                canvas.scale(f14 - anVar.m9(), f14 - anVar.m9(), avatarImage.y(), avatarImage.A());
                                                                f12 = 0.0f;
                                                                canvas.translate(anVar.m9() * org.telegram.messenger.g0.L(24.0f), 0.0f);
                                                            } else {
                                                                f12 = 0.0f;
                                                            }
                                                            avatarImage.h(canvas, null);
                                                            canvas.restore();
                                                            if (!z15 && view.getTranslationY() != f12) {
                                                                canvas.save();
                                                            }
                                                            if (view.getTranslationY() != f12) {
                                                                canvas.restore();
                                                            }
                                                            return z13;
                                                        }
                                                    }
                                                    i11 = layoutHeight;
                                                    i19++;
                                                    if (!r11.l()) {
                                                    }
                                                    if (i11 - org.telegram.messenger.g0.L(48.0f) < paddingTop) {
                                                    }
                                                    if (!q1Var.m()) {
                                                    }
                                                    canvas.save();
                                                    if (checkBoxTranslation != 0.0f) {
                                                    }
                                                    if (q1Var instanceof org.telegram.ui.Cells.q1) {
                                                    }
                                                    if (z14) {
                                                    }
                                                    if (q1Var.a()) {
                                                    }
                                                    if (z14) {
                                                    }
                                                    if (anVar.m9() > 0.0f) {
                                                    }
                                                    avatarImage.h(canvas, null);
                                                    canvas.restore();
                                                    if (!z15) {
                                                        canvas.save();
                                                    }
                                                    if (view.getTranslationY() != f12) {
                                                    }
                                                    return z13;
                                                }
                                                i11 = layoutHeight;
                                                q1Var = r11;
                                                checkBoxTranslation = f17;
                                                if (i11 - org.telegram.messenger.g0.L(48.0f) < paddingTop) {
                                                }
                                                if (!q1Var.m()) {
                                                }
                                                canvas.save();
                                                if (checkBoxTranslation != 0.0f) {
                                                }
                                                if (q1Var instanceof org.telegram.ui.Cells.q1) {
                                                }
                                                if (z14) {
                                                }
                                                if (q1Var.a()) {
                                                }
                                                if (z14) {
                                                }
                                                if (anVar.m9() > 0.0f) {
                                                }
                                                avatarImage.h(canvas, null);
                                                canvas.restore();
                                                if (!z15) {
                                                }
                                                if (view.getTranslationY() != f12) {
                                                }
                                                return z13;
                                            }
                                        }
                                        i11 = layoutHeight;
                                        if (i11 - org.telegram.messenger.g0.L(48.0f) < paddingTop) {
                                        }
                                        if (!q1Var.m()) {
                                        }
                                        canvas.save();
                                        if (checkBoxTranslation != 0.0f) {
                                        }
                                        if (q1Var instanceof org.telegram.ui.Cells.q1) {
                                        }
                                        if (z14) {
                                        }
                                        if (q1Var.a()) {
                                        }
                                        if (z14) {
                                        }
                                        if (anVar.m9() > 0.0f) {
                                        }
                                        avatarImage.h(canvas, null);
                                        canvas.restore();
                                        if (!z15) {
                                        }
                                        if (view.getTranslationY() != f12) {
                                        }
                                        return z13;
                                    }
                                }
                                z13 = z12;
                                f13 = 1.0f;
                                i12 = b11 - 1;
                                if (q1Var.za) {
                                }
                                checkBoxTranslation = q1Var.getCheckBoxTranslation() + q1Var.getSlidingOffsetX();
                                int layoutHeight2 = (int) (q1Var2.getLayoutHeight() + q1Var2.getTransitionParams().j0 + ((int) (q1Var.getPaddingTopAnimated() + ((int) (0 + (!z15 ? view.getTop() : view.getY()))))));
                                int measuredHeight2 = anVar.A0.getMeasuredHeight() - anVar.A0.getPaddingBottom();
                                if (q1Var.n1) {
                                }
                                if (q1Var.K2()) {
                                }
                                if (q1Var.getTransitionParams().l2) {
                                }
                                if (!z15) {
                                    canvas.restore();
                                }
                                if (q1Var.j()) {
                                }
                                i11 = layoutHeight2;
                                if (i11 - org.telegram.messenger.g0.L(48.0f) < paddingTop) {
                                }
                                if (!q1Var.m()) {
                                }
                                canvas.save();
                                if (checkBoxTranslation != 0.0f) {
                                }
                                if (q1Var instanceof org.telegram.ui.Cells.q1) {
                                }
                                if (z14) {
                                }
                                if (q1Var.a()) {
                                }
                                if (z14) {
                                }
                                if (anVar.m9() > 0.0f) {
                                }
                                avatarImage.h(canvas, null);
                                canvas.restore();
                                if (!z15) {
                                }
                                if (view.getTranslationY() != f12) {
                                }
                                return z13;
                            }
                        }
                        z13 = z12;
                        f13 = 1.0f;
                        checkBoxTranslation = q1Var.getCheckBoxTranslation() + q1Var.getSlidingOffsetX();
                        int layoutHeight22 = (int) (q1Var2.getLayoutHeight() + q1Var2.getTransitionParams().j0 + ((int) (q1Var.getPaddingTopAnimated() + ((int) (0 + (!z15 ? view.getTop() : view.getY()))))));
                        int measuredHeight22 = anVar.A0.getMeasuredHeight() - anVar.A0.getPaddingBottom();
                        if (q1Var.n1) {
                        }
                        if (q1Var.K2()) {
                        }
                        if (q1Var.getTransitionParams().l2) {
                        }
                        if (!z15) {
                        }
                        if (q1Var.j()) {
                        }
                        i11 = layoutHeight22;
                        if (i11 - org.telegram.messenger.g0.L(48.0f) < paddingTop) {
                        }
                        if (!q1Var.m()) {
                        }
                        canvas.save();
                        if (checkBoxTranslation != 0.0f) {
                        }
                        if (q1Var instanceof org.telegram.ui.Cells.q1) {
                        }
                        if (z14) {
                        }
                        if (q1Var.a()) {
                        }
                        if (z14) {
                        }
                        if (anVar.m9() > 0.0f) {
                        }
                        avatarImage.h(canvas, null);
                        canvas.restore();
                        if (!z15) {
                        }
                        if (view.getTranslationY() != f12) {
                        }
                        return z13;
                    }
                }
                z14 = false;
                if (anVar.A0.W1) {
                }
                paddingTop = view.getPaddingTop() + (!z15 ? view.getTop() : (int) view.getY());
                if (q1Var.m()) {
                }
                z13 = z12;
                f13 = 1.0f;
                checkBoxTranslation = q1Var.getCheckBoxTranslation() + q1Var.getSlidingOffsetX();
                int layoutHeight222 = (int) (q1Var2.getLayoutHeight() + q1Var2.getTransitionParams().j0 + ((int) (q1Var.getPaddingTopAnimated() + ((int) (0 + (!z15 ? view.getTop() : view.getY()))))));
                int measuredHeight222 = anVar.A0.getMeasuredHeight() - anVar.A0.getPaddingBottom();
                if (q1Var.n1) {
                }
                if (q1Var.K2()) {
                }
                if (q1Var.getTransitionParams().l2) {
                }
                if (!z15) {
                }
                if (q1Var.j()) {
                }
                i11 = layoutHeight222;
                if (i11 - org.telegram.messenger.g0.L(48.0f) < paddingTop) {
                }
                if (!q1Var.m()) {
                }
                canvas.save();
                if (checkBoxTranslation != 0.0f) {
                }
                if (q1Var instanceof org.telegram.ui.Cells.q1) {
                }
                if (z14) {
                }
                if (q1Var.a()) {
                }
                if (z14) {
                }
                if (anVar.m9() > 0.0f) {
                }
                avatarImage.h(canvas, null);
                canvas.restore();
                if (!z15) {
                }
                if (view.getTranslationY() != f12) {
                }
                return z13;
            }
        }
        z13 = z12;
        f12 = 0.0f;
        if (view.getTranslationY() != f12) {
        }
        return z13;
    }

    @Override // org.telegram.ui.Components.uj0
    public final void j1(View view, float f10, float f11, boolean z10) {
        org.telegram.messenger.bj currentMessagesGroup;
        super.j1(view, f10, f11, z10);
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
            if (messageObject.I3() || messageObject.U2() || (currentMessagesGroup = q1Var.getCurrentMessagesGroup()) == null) {
                return;
            }
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                if (childAt != view && (childAt instanceof org.telegram.ui.Cells.q1)) {
                    org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                    if (q1Var2.getCurrentMessagesGroup() == currentMessagesGroup) {
                        q1Var2.setPressed(z10);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:196:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0720  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x08a3  */
    /* JADX WARN: Removed duplicated region for block: B:229:? A[RETURN, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        float f11;
        wo woVar;
        int i7;
        float f12;
        int i10;
        String M0;
        String M02;
        String M03;
        int i11;
        TLRPC.TL_forumTopic tL_forumTopic;
        int i12;
        View view;
        Paint paint;
        Paint paint2;
        int i13;
        float f13;
        float f14;
        float f15;
        float f16;
        Paint paint3;
        float f17;
        Paint paint4;
        Paint paint5;
        float f18;
        float f19;
        org.telegram.ui.ActionBar.e6 e6Var;
        int i14;
        float f20;
        float f21;
        super.onDraw(canvas);
        an anVar = this.G3;
        View view2 = anVar.u9;
        if (view2 != null) {
            float slidingOffsetX = view2 instanceof org.telegram.ui.Cells.q1 ? ((org.telegram.ui.Cells.q1) view2).getSlidingOffsetX() : view2 instanceof org.telegram.ui.Cells.t0 ? ((org.telegram.ui.Cells.t0) view2).getWalletSlidingOffset() : 0.0f;
            if (!anVar.v9 && !anVar.B9 && this.r3 != 0.0f && slidingOffsetX != 0.0f) {
                long currentTimeMillis = System.currentTimeMillis();
                float f22 = ((currentTimeMillis - this.p3) / 180.0f) + this.q3;
                this.q3 = f22;
                if (f22 > 1.0f) {
                    this.q3 = 1.0f;
                }
                this.p3 = currentTimeMillis;
                float interpolation = (1.0f - org.telegram.messenger.g0.F.getInterpolation(this.q3)) * this.r3;
                if (interpolation == 0.0f) {
                    this.r3 = 0.0f;
                }
                View view3 = anVar.u9;
                if (view3 instanceof org.telegram.ui.Cells.q1) {
                    D1((org.telegram.ui.Cells.q1) view3, interpolation);
                }
                an.e2(anVar, interpolation);
                org.telegram.messenger.gj a22 = an.a2(anVar);
                if (a22 != null && (a22.h4() || org.telegram.messenger.gj.L4(a22.k))) {
                    anVar.vd(false, false);
                }
                float f23 = this.q3;
                if (f23 == 1.0f || f23 == 0.0f) {
                    an.e2(anVar, 0.0f);
                    anVar.u9 = null;
                }
                invalidate();
            }
            if (anVar.u9 != null && Thread.currentThread() == Looper.getMainLooper().getThread()) {
                Paint W0 = W0("paintChatActionBackground");
                Paint paint6 = org.telegram.ui.ActionBar.j6.h2;
                Paint paint7 = this.u3;
                if (paint7.getColor() != W0.getColor()) {
                    paint7.setColor(W0.getColor());
                }
                Paint paint8 = this.v3;
                if (paint8.getColor() != paint6.getColor()) {
                    paint8.setColor(paint6.getColor());
                }
                if (paint7.getShader() != W0.getShader()) {
                    paint7.setShader(W0.getShader());
                }
                if (paint8.getShader() != paint6.getShader()) {
                    paint8.setShader(paint6.getShader());
                }
                r1.f fVar = this.y3;
                float f24 = fVar.a;
                float f25 = this.t3;
                float f26 = f24 / f25;
                f10 = 255.0f;
                int color = paint8.getColor();
                if (f26 > 1.0f) {
                    this.C3 = true;
                }
                f11 = 2.0f;
                View view4 = anVar.u9;
                float S1 = view4 instanceof org.telegram.ui.Cells.q1 ? ((org.telegram.ui.Cells.q1) view4).S1(false) : view4 instanceof org.telegram.ui.Cells.t0 ? ((org.telegram.ui.Cells.t0) view4).getWalletSlidingOffset() : 0.0f;
                r1.f fVar2 = this.w3;
                float f27 = fVar2.a;
                r1.f fVar3 = this.A3;
                r1.g gVar = this.B3;
                r1.g gVar2 = this.z3;
                if (f27 == 0.0f) {
                    gVar2.d();
                    paint = paint6;
                    paint2 = paint7;
                    i13 = color;
                    double d = 0.0f;
                    gVar2.m.i = d;
                    fVar.a = 0.0f;
                    gVar.d();
                    gVar.m.i = d;
                    fVar3.a = 0.0f;
                    this.C3 = false;
                } else {
                    paint = paint6;
                    paint2 = paint7;
                    i13 = color;
                }
                if (((float) gVar2.m.i) != f25) {
                    f13 = 1.0f;
                    f14 = c8.i9.a(((-S1) - org.telegram.messenger.g0.L(20.0f)) / org.telegram.messenger.g0.L(30.0f), 0.0f, 1.0f);
                } else {
                    f13 = 1.0f;
                    f14 = 1.0f;
                }
                if (f14 == f13) {
                    r1.h hVar = gVar2.m;
                    f15 = 20.0f;
                    f16 = f26;
                    if (((float) hVar.i) != f25) {
                        double d2 = f25;
                        hVar.i = d2;
                        gVar2.h();
                        gVar.m.i = d2;
                        gVar.h();
                    }
                } else {
                    f15 = 20.0f;
                    f16 = f26;
                }
                float f28 = S1 <= ((float) (-org.telegram.messenger.g0.L(f15))) ? f25 : 0.0f;
                r1.g gVar3 = this.x3;
                r1.h hVar2 = gVar3.m;
                float f29 = f16;
                if (f28 != ((float) hVar2.i)) {
                    hVar2.i = f28;
                    if (!gVar3.f) {
                        gVar3.h();
                    }
                }
                float f30 = fVar2.a / f25;
                org.telegram.messenger.gj a23 = an.a2(anVar);
                float measuredWidth = (S1 * ((a23 == null || !a23.N3()) ? 1.0f : 0.5f)) + getMeasuredWidth();
                float measuredHeight = (anVar.u9.getMeasuredHeight() / 2.0f) + anVar.u9.getTop();
                boolean z10 = this.C3;
                float f31 = z10 ? f29 : f30;
                float f32 = z10 ? 0.0f : 1.0f - f29;
                int i15 = org.telegram.ui.ActionBar.j6.d6;
                org.telegram.ui.ActionBar.e6 e6Var2 = this.o2;
                boolean z11 = i0.a.h(org.telegram.ui.ActionBar.j6.w0(i15, e6Var2)) <= 0.5d;
                if (f30 != 0.0f) {
                    paint3 = paint8;
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set((int) ((paint2.getStrokeWidth() / 2.0f) + (measuredWidth - (org.telegram.messenger.g0.L(16.0f) * f31))), (int) ((paint2.getStrokeWidth() / 2.0f) + (measuredHeight - (org.telegram.messenger.g0.L(16.0f) * f31))), (int) (((org.telegram.messenger.g0.L(16.0f) * f31) + measuredWidth) - (paint2.getStrokeWidth() / 2.0f)), (int) (((org.telegram.messenger.g0.L(16.0f) * f31) + measuredHeight) - (paint2.getStrokeWidth() / 2.0f)));
                    org.telegram.ui.ActionBar.j6.r(0.0f, getY() + rectF.top, getMeasuredWidth(), org.telegram.messenger.g0.q.y);
                    if (f29 == 0.0f) {
                        int alpha = paint2.getAlpha();
                        paint2.setAlpha((int) (alpha * f30));
                        float f33 = f14 * 360.0f;
                        f17 = f25;
                        paint4 = paint;
                        f18 = f14;
                        e6Var = e6Var2;
                        Paint paint9 = paint2;
                        f19 = measuredWidth;
                        canvas.drawArc(rectF, -90.0f, f33, false, paint9);
                        paint9.setAlpha(alpha);
                        if (anVar.Aa.g()) {
                            int alpha2 = paint3.getAlpha();
                            paint3 = paint3;
                            if (z11) {
                                paint3.setColor(-1);
                            }
                            paint3.setAlpha((int) (alpha2 * f30));
                            paint5 = paint9;
                            canvas2 = canvas;
                            canvas2.drawArc(rectF, -90.0f, f33, false, paint3);
                        } else {
                            paint5 = paint9;
                            paint3 = paint3;
                            canvas2 = canvas;
                        }
                    } else {
                        canvas2 = canvas;
                        f17 = f25;
                        paint4 = paint;
                        paint5 = paint2;
                        f18 = f14;
                        f19 = measuredWidth;
                        e6Var = e6Var2;
                    }
                } else {
                    canvas2 = canvas;
                    paint3 = paint8;
                    f17 = f25;
                    paint4 = paint;
                    paint5 = paint2;
                    f18 = f14;
                    f19 = measuredWidth;
                    e6Var = e6Var2;
                }
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set((int) (f19 - (org.telegram.messenger.g0.L(16.0f) * f31)), (int) (measuredHeight - (org.telegram.messenger.g0.L(16.0f) * f31)), (int) ((org.telegram.messenger.g0.L(16.0f) * f31) + f19), (int) ((org.telegram.messenger.g0.L(16.0f) * f31) + measuredHeight));
                int measuredWidth2 = getMeasuredWidth();
                Point point = org.telegram.messenger.g0.q;
                org.telegram.ui.ActionBar.j6.r(0.0f, getY() + rectF2.top, measuredWidth2, point.y);
                Path path = this.D3;
                path.rewind();
                Path.Direction direction = Path.Direction.CW;
                path.addRoundRect(rectF2, org.telegram.messenger.g0.L(16.0f) * f31, org.telegram.messenger.g0.L(16.0f) * f31, direction);
                int alpha3 = W0.getAlpha();
                float f34 = 0.6f * f30 * f18;
                W0.setAlpha((int) (alpha3 * f34));
                canvas2.drawPath(path, W0);
                W0.setAlpha(alpha3);
                if (anVar.Aa.g()) {
                    int alpha4 = org.telegram.ui.ActionBar.j6.h2.getAlpha();
                    if (z11) {
                        f21 = f34;
                        org.telegram.ui.ActionBar.j6.h2.setColor(-1);
                    } else {
                        f21 = f34;
                    }
                    org.telegram.ui.ActionBar.j6.h2.setAlpha((int) (alpha4 * f21));
                    canvas2.drawPath(path, org.telegram.ui.ActionBar.j6.h2);
                    org.telegram.ui.ActionBar.j6.h2.setAlpha(alpha4);
                }
                int i16 = (f32 > 0.0f ? 1 : (f32 == 0.0f ? 0 : -1));
                if (i16 != 0) {
                    i14 = i16;
                    f20 = measuredHeight;
                    rectF2.set((int) (f19 - (org.telegram.messenger.g0.L(16.0f) * f32)), (int) (measuredHeight - (org.telegram.messenger.g0.L(16.0f) * f32)), (int) ((org.telegram.messenger.g0.L(16.0f) * f32) + f19), (int) ((org.telegram.messenger.g0.L(16.0f) * f32) + f20));
                    path.rewind();
                    path.addRoundRect(rectF2, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), direction);
                    canvas2.save();
                    canvas2.clipPath(path, Region.Op.DIFFERENCE);
                } else {
                    i14 = i16;
                    f20 = measuredHeight;
                }
                rectF2.set((int) (f19 - (org.telegram.messenger.g0.L(16.0f) * f31)), (int) (f20 - (org.telegram.messenger.g0.L(16.0f) * f31)), (int) ((org.telegram.messenger.g0.L(16.0f) * f31) + f19), (int) ((org.telegram.messenger.g0.L(16.0f) * f31) + f20));
                org.telegram.ui.ActionBar.j6.r(0.0f, getY() + rectF2.top, getMeasuredWidth(), point.y);
                path.rewind();
                path.addRoundRect(rectF2, org.telegram.messenger.g0.L(16.0f) * f31, org.telegram.messenger.g0.L(16.0f) * f31, direction);
                int alpha5 = W0.getAlpha();
                float f35 = f30 * 0.4f;
                W0.setAlpha((int) (alpha5 * f35));
                canvas2.drawPath(path, W0);
                W0.setAlpha(alpha5);
                if (anVar.Aa.g()) {
                    int alpha6 = org.telegram.ui.ActionBar.j6.h2.getAlpha();
                    if (z11) {
                        org.telegram.ui.ActionBar.j6.h2.setColor(-1);
                    }
                    org.telegram.ui.ActionBar.j6.h2.setAlpha((int) (f35 * alpha6));
                    canvas2.drawPath(path, org.telegram.ui.ActionBar.j6.h2);
                    org.telegram.ui.ActionBar.j6.h2.setAlpha(alpha6);
                }
                if (i14 != 0) {
                    canvas2.restore();
                }
                float f36 = fVar3.a / f17;
                if (f36 != 0.0f && f36 != 1.0f) {
                    float f37 = f36 + 1.0f;
                    float strokeWidth = paint5.getStrokeWidth();
                    float f38 = (1.0f - f36) * strokeWidth;
                    if (f38 != 0.0f) {
                        rectF2.set((int) ((f19 - (org.telegram.messenger.g0.L(16.0f) * f37)) + f38), (int) ((f20 - (org.telegram.messenger.g0.L(16.0f) * f37)) + f38), (int) (((org.telegram.messenger.g0.L(16.0f) * f37) + f19) - f38), (int) (((org.telegram.messenger.g0.L(16.0f) * f37) + f20) - f38));
                        org.telegram.ui.ActionBar.j6.r(0.0f, getY() + rectF2.top, getMeasuredWidth(), point.y);
                        int alpha7 = paint5.getAlpha();
                        paint5.setAlpha((int) (alpha7 * f30));
                        paint5.setStrokeWidth(f38);
                        canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(16.0f) * f37, org.telegram.messenger.g0.L(16.0f) * f37, paint5);
                        paint5.setStrokeWidth(strokeWidth);
                        paint5.setAlpha(alpha7);
                        if (anVar.Aa.g()) {
                            int alpha8 = paint3.getAlpha();
                            if (z11) {
                                paint3.setColor(-1);
                            }
                            paint3.setAlpha((int) (alpha8 * f30));
                            paint3.setStrokeWidth(f38);
                            canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(16.0f) * f37, org.telegram.messenger.g0.L(16.0f) * f37, paint3);
                            paint3.setStrokeWidth(strokeWidth);
                        }
                    }
                }
                int i17 = (int) (f30 * 255.0f);
                Drawable drawable = e6Var != null ? e6Var.getDrawable("drawableReplyIcon") : null;
                if (drawable == null) {
                    drawable = org.telegram.ui.ActionBar.j6.R0("drawableReplyIcon");
                }
                drawable.setAlpha(i17);
                drawable.setBounds((int) (f19 - ((drawable.getIntrinsicWidth() / 2) * f31)), (int) (f20 - ((drawable.getIntrinsicHeight() / 2) * f31)), (int) (((drawable.getIntrinsicWidth() / 2) * f31) + f19), (int) (((drawable.getIntrinsicHeight() / 2) * f31) + f20));
                drawable.draw(canvas2);
                drawable.setAlpha(org.telegram.messenger.ns.e4);
                int i18 = i13;
                paint3.setColor(i18);
                paint4.setColor(i18);
                if (anVar.ja != 0.0f || anVar.isInPreviewMode() || anVar.lb || (i7 = anVar.g4) == 3 || i7 == 1) {
                    woVar = anVar.la;
                    if (woVar == null) {
                        woVar.P = 0.0f;
                        woVar.O = false;
                        return;
                    }
                    return;
                }
                canvas2.save();
                if (anVar.qa != 0.0f) {
                    float measuredHeight2 = anVar.A0.getMeasuredHeight() - anVar.ja;
                    an anVar2 = anVar.pa;
                    f12 = (measuredHeight2 + (anVar2 == null ? 0.0f : anVar2.ka)) * anVar.qa;
                } else {
                    f12 = 0.0f;
                }
                canvas2.translate(0.0f, (getMeasuredHeight() - anVar.Xa) - f12);
                if (anVar.la == null) {
                    i12 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                    wo woVar2 = new wo(i12, anVar.fragmentView, anVar.k6, anVar.Qa, anVar.Ra, anVar.b(), anVar.Aa);
                    anVar.la = woVar2;
                    woVar2.T = anVar.bd.e;
                    ArrayList arrayList = anVar.Eb;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        anVar.la.g((TLRPC.Chat) anVar.Eb.get(0));
                    } else if (anVar.w4) {
                        anVar.la.h();
                    } else {
                        anVar.la.f();
                    }
                    wo woVar3 = anVar.la;
                    woVar3.G.P();
                    org.telegram.ui.Components.g5 g5Var = woVar3.l0;
                    if (g5Var != null && (view = woVar3.b0) != null) {
                        g5Var.a(view);
                    }
                    org.telegram.messenger.ns.f(woVar3.f0).c(woVar3, org.telegram.messenger.ns.r);
                }
                wo woVar4 = anVar.la;
                int measuredWidth3 = getMeasuredWidth() - (anVar.ba() ? org.telegram.messenger.g0.L(71.0f) : 0);
                ImageReceiver imageReceiver = woVar4.G;
                TextPaint textPaint = woVar4.f;
                TextPaint textPaint2 = woVar4.h;
                boolean z12 = woVar4.Y;
                if (measuredWidth3 != woVar4.c || (z12 && (tL_forumTopic = woVar4.I) != null && woVar4.J != tL_forumTopic.id)) {
                    woVar4.d = org.telegram.messenger.g0.L(56.0f) / f11;
                    woVar4.c = measuredWidth3;
                    TLRPC.Chat chat = woVar4.H;
                    if (chat != null) {
                        M0 = chat.title;
                    } else {
                        TLRPC.TL_forumTopic tL_forumTopic2 = woVar4.I;
                        if (tL_forumTopic2 != null) {
                            M0 = tL_forumTopic2.title;
                        } else {
                            if (z12) {
                                i10 = 0;
                                M0 = org.telegram.messenger.hd.a0(null, null, 2131744308, org.telegram.messenger.np.s1(woVar4.f0).M0(Long.valueOf(-woVar4.j0)).title);
                            } else {
                                i10 = 0;
                                M0 = org.telegram.messenger.hd.M0(2131744311, null);
                            }
                            int measureText = (int) textPaint.measureText((CharSequence) M0, i10, M0.length());
                            woVar4.y = measureText;
                            int C = org.telegram.messenger.i20.C(60.0f, woVar4.c, measureText);
                            woVar4.y = C;
                            woVar4.s = org.telegram.ui.Components.ou0.c(M0, textPaint, C, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, C, 1, true);
                            if (!woVar4.W) {
                                M02 = org.telegram.messenger.hd.M0(2131744309, null);
                                M03 = org.telegram.messenger.hd.M0(2131746327, null);
                            } else if (z12) {
                                M02 = org.telegram.messenger.hd.M0(2131744307, null);
                                M03 = org.telegram.messenger.hd.M0(2131746326, null);
                            } else {
                                boolean z13 = woVar4.X;
                                if (z13 && (i11 = woVar4.a) != woVar4.g0 && i11 != 0) {
                                    M02 = org.telegram.messenger.hd.M0(2131744313, null);
                                    M03 = org.telegram.messenger.hd.M0(2131746330, null);
                                } else if (z13) {
                                    M02 = org.telegram.messenger.hd.M0(2131744310, null);
                                    M03 = org.telegram.messenger.hd.M0(2131746328, null);
                                } else {
                                    M02 = org.telegram.messenger.hd.M0(2131744312, null);
                                    M03 = org.telegram.messenger.hd.M0(2131746329, null);
                                }
                            }
                            int measureText2 = (int) textPaint2.measureText(M02);
                            woVar4.E = measureText2;
                            woVar4.E = org.telegram.messenger.i20.C(60.0f, woVar4.c, measureText2);
                            int i19 = woVar4.E;
                            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                            woVar4.w = new StaticLayout(M02, textPaint2, i19, alignment, 1.0f, 0.0f, false);
                            int measureText3 = (int) textPaint2.measureText(M03);
                            woVar4.F = measureText3;
                            woVar4.F = org.telegram.messenger.i20.C(60.0f, woVar4.c, measureText3);
                            woVar4.x = new StaticLayout(M03, textPaint2, woVar4.F, alignment, 1.0f, 0.0f, false);
                            imageReceiver.y0((woVar4.c / f11) - (org.telegram.messenger.g0.L(40.0f) / f11), (org.telegram.messenger.g0.L(12.0f) + woVar4.d) - (org.telegram.messenger.g0.L(40.0f) / f11), org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f));
                            imageReceiver.J0((int) (org.telegram.messenger.g0.L(40.0f) / f11));
                            woVar4.d0.d(org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(100.0f));
                            if (z12) {
                                woVar4.J = woVar4.I == null ? 0L : r3.id;
                            }
                        }
                    }
                    i10 = 0;
                    int measureText4 = (int) textPaint.measureText((CharSequence) M0, i10, M0.length());
                    woVar4.y = measureText4;
                    int C2 = org.telegram.messenger.i20.C(60.0f, woVar4.c, measureText4);
                    woVar4.y = C2;
                    woVar4.s = org.telegram.ui.Components.ou0.c(M0, textPaint, C2, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, C2, 1, true);
                    if (!woVar4.W) {
                    }
                    int measureText22 = (int) textPaint2.measureText(M02);
                    woVar4.E = measureText22;
                    woVar4.E = org.telegram.messenger.i20.C(60.0f, woVar4.c, measureText22);
                    int i192 = woVar4.E;
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                    woVar4.w = new StaticLayout(M02, textPaint2, i192, alignment2, 1.0f, 0.0f, false);
                    int measureText32 = (int) textPaint2.measureText(M03);
                    woVar4.F = measureText32;
                    woVar4.F = org.telegram.messenger.i20.C(60.0f, woVar4.c, measureText32);
                    woVar4.x = new StaticLayout(M03, textPaint2, woVar4.F, alignment2, 1.0f, 0.0f, false);
                    imageReceiver.y0((woVar4.c / f11) - (org.telegram.messenger.g0.L(40.0f) / f11), (org.telegram.messenger.g0.L(12.0f) + woVar4.d) - (org.telegram.messenger.g0.L(40.0f) / f11), org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f));
                    imageReceiver.J0((int) (org.telegram.messenger.g0.L(40.0f) / f11));
                    woVar4.d0.d(org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(100.0f));
                    if (z12) {
                    }
                }
                float min = Math.min(1.0f, anVar.ja / org.telegram.messenger.g0.L(110.0f));
                canvas2.translate(anVar.ba() ? org.telegram.messenger.g0.W1(anVar.m9(), org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(71.0f)) : 0.0f, -(anVar.t9(org.telegram.ui.Components.l11.c) + anVar.U.getInputBubbleHeight() + anVar.w.d() + org.telegram.messenger.g0.L(10.0f)));
                anVar.la.a(canvas2, anVar.A0, min, 1.0f - anVar.qa);
                canvas2.restore();
                if (anVar.pa != null) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, r2.A0.getMeasuredWidth(), anVar.pa.A0.getMeasuredHeight(), (int) (anVar.qa * f10), 31);
                    canvas2.translate(0.0f, (getMeasuredHeight() - anVar.ja) - f12);
                    anVar.pa.A0.draw(canvas2);
                    canvas2.restore();
                    return;
                }
                return;
            }
        }
        canvas2 = canvas;
        f10 = 255.0f;
        f11 = 2.0f;
        if (anVar.ja != 0.0f) {
        }
        woVar = anVar.la;
        if (woVar == null) {
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (this.G3.h != null) {
            return;
        }
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfo.CollectionInfo collectionInfo = accessibilityNodeInfo.getCollectionInfo();
        if (collectionInfo != null) {
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(collectionInfo.getRowCount(), 1, false));
        }
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        wh.i iVar;
        org.telegram.ui.ActionBar.k kVar;
        an anVar = this.G3;
        pl plVar = anVar.t9;
        plVar.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            org.telegram.messenger.g0.r(plVar.f0);
            plVar.z = false;
        }
        if (!this.W1 && ((iVar = anVar.ta) == null || !iVar.a())) {
            boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            kVar = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
            if (kVar.x() || anVar.Y9()) {
                return onInterceptTouchEvent;
            }
            C1(motionEvent);
            if (onInterceptTouchEvent || anVar.x9) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        int i13 = this.g3;
        int i14 = i11 - i7;
        an anVar = this.G3;
        if (i13 != i14) {
            if (i13 != 0) {
                anVar.G9(false);
            }
            this.g3 = i14;
        }
        int measuredHeight = getMeasuredHeight();
        if (this.F3 != measuredHeight) {
            this.E3 = true;
            cj cjVar = anVar.B0;
            if (cjVar != null) {
                cjVar.g();
            }
            anVar.n9.a();
            this.E3 = false;
            this.F3 = measuredHeight;
        }
        anVar.i6 = false;
        pl plVar = anVar.t9;
        if (plVar != null && plVar.x()) {
            anVar.t9.w();
        }
        anVar.N9();
        anVar.da();
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        wo woVar;
        an anVar = this.G3;
        te.a aVar = anVar.bd;
        pl plVar = anVar.t9;
        plVar.getClass();
        final int i7 = 3;
        final int i10 = 0;
        final int i11 = 1;
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            org.telegram.messenger.g0.r(plVar.f0);
            plVar.z = false;
        }
        if (motionEvent.getAction() == 0) {
            anVar.Oa = true;
        }
        if (anVar.ja != 0.0f && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            float min = Math.min(1.0f, anVar.ja / org.telegram.messenger.g0.L(110.0f));
            final int i12 = 2;
            if (motionEvent.getAction() != 1 || min != 1.0f || (woVar = anVar.la) == null || woVar.S) {
                wo woVar2 = anVar.la;
                if (woVar2 != null && woVar2.S) {
                    long currentTimeMillis = System.currentTimeMillis();
                    wo woVar3 = anVar.la;
                    if (currentTimeMillis - woVar3.V < 500 && woVar3.N) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        anVar.ma = animatorSet;
                        if (anVar.la != null) {
                            aVar.a(false, true);
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(anVar.ja, org.telegram.messenger.g0.L(111.0f));
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.yi
                            public final /* synthetic */ aj b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i11) {
                                    case 0:
                                        an anVar2 = this.b.G3;
                                        anVar2.ja = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        anVar2.A0.invalidate();
                                        break;
                                    case 1:
                                        an anVar3 = this.b.G3;
                                        anVar3.ja = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        anVar3.A0.invalidate();
                                        break;
                                    case 2:
                                        an anVar4 = this.b.G3;
                                        anVar4.ja = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        anVar4.A0.invalidate();
                                        break;
                                    default:
                                        an anVar5 = this.b.G3;
                                        anVar5.ja = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        anVar5.A0.invalidate();
                                        break;
                                }
                            }
                        });
                        ofFloat.setDuration(400L);
                        ofFloat.setInterpolator(org.telegram.ui.Components.er.f);
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(org.telegram.messenger.g0.L(111.0f), 0.0f);
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.yi
                            public final /* synthetic */ aj b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i12) {
                                    case 0:
                                        an anVar2 = this.b.G3;
                                        anVar2.ja = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        anVar2.A0.invalidate();
                                        break;
                                    case 1:
                                        an anVar3 = this.b.G3;
                                        anVar3.ja = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        anVar3.A0.invalidate();
                                        break;
                                    case 2:
                                        an anVar4 = this.b.G3;
                                        anVar4.ja = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        anVar4.A0.invalidate();
                                        break;
                                    default:
                                        an anVar5 = this.b.G3;
                                        anVar5.ja = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        anVar5.A0.invalidate();
                                        break;
                                }
                            }
                        });
                        ofFloat2.setStartDelay(600L);
                        ofFloat2.setDuration(250L);
                        ofFloat2.setInterpolator(pi.k.V);
                        animatorSet.playSequentially(ofFloat, ofFloat2);
                        animatorSet.start();
                    }
                }
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(anVar.ja, 0.0f);
                anVar.ma = ofFloat3;
                if (anVar.la != null) {
                    aVar.a(false, true);
                }
                ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.yi
                    public final /* synthetic */ aj b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i7) {
                            case 0:
                                an anVar2 = this.b.G3;
                                anVar2.ja = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                anVar2.A0.invalidate();
                                break;
                            case 1:
                                an anVar3 = this.b.G3;
                                anVar3.ja = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                anVar3.A0.invalidate();
                                break;
                            case 2:
                                an anVar4 = this.b.G3;
                                anVar4.ja = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                anVar4.A0.invalidate();
                                break;
                            default:
                                an anVar5 = this.b.G3;
                                anVar5.ja = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                anVar5.A0.invalidate();
                                break;
                        }
                    }
                });
                ofFloat3.setDuration(250L);
                ofFloat3.setInterpolator(pi.k.V);
                ofFloat3.start();
            } else if (woVar.L != 1.0f) {
                float f10 = anVar.ja;
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f10, org.telegram.messenger.g0.L(8.0f) + f10);
                anVar.ma = ofFloat4;
                ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.yi
                    public final /* synthetic */ aj b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i10) {
                            case 0:
                                an anVar2 = this.b.G3;
                                anVar2.ja = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                anVar2.A0.invalidate();
                                break;
                            case 1:
                                an anVar3 = this.b.G3;
                                anVar3.ja = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                anVar3.A0.invalidate();
                                break;
                            case 2:
                                an anVar4 = this.b.G3;
                                anVar4.ja = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                anVar4.A0.invalidate();
                                break;
                            default:
                                an anVar5 = this.b.G3;
                                anVar5.ja = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                anVar5.A0.invalidate();
                                break;
                        }
                    }
                });
                ofFloat4.setDuration(200L);
                org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.f;
                ofFloat4.setInterpolator(erVar);
                ofFloat4.start();
                final wo woVar4 = anVar.la;
                bh bhVar = new bh(this, i7);
                AnimatorSet animatorSet2 = woVar4.K;
                if (animatorSet2 != null) {
                    animatorSet2.removeAllListeners();
                    woVar4.K.cancel();
                }
                woVar4.Z = bhVar;
                woVar4.K = new AnimatorSet();
                ValueAnimator ofFloat5 = ValueAnimator.ofFloat(woVar4.L, 1.0f);
                ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.vo
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i10) {
                            case 0:
                                wo woVar5 = woVar4;
                                woVar5.getClass();
                                woVar5.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                woVar5.U.invalidate();
                                View view = woVar5.b0;
                                if (view != null) {
                                    view.invalidate();
                                    break;
                                }
                                break;
                            default:
                                wo woVar6 = woVar4;
                                woVar6.getClass();
                                woVar6.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                View view2 = woVar6.b0;
                                if (view2 != null) {
                                    view2.invalidate();
                                    break;
                                }
                                break;
                        }
                    }
                });
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(woVar4.M, 0.0f);
                ofFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.vo
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i11) {
                            case 0:
                                wo woVar5 = woVar4;
                                woVar5.getClass();
                                woVar5.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                woVar5.U.invalidate();
                                View view = woVar5.b0;
                                if (view != null) {
                                    view.invalidate();
                                    break;
                                }
                                break;
                            default:
                                wo woVar6 = woVar4;
                                woVar6.getClass();
                                woVar6.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                View view2 = woVar6.b0;
                                if (view2 != null) {
                                    view2.invalidate();
                                    break;
                                }
                                break;
                        }
                    }
                });
                woVar4.K.addListener(new org.telegram.ui.Cells.w9(woVar4, 9));
                woVar4.K.playTogether(ofFloat5, ofFloat6);
                woVar4.K.setDuration(120L);
                woVar4.K.setInterpolator(erVar);
                woVar4.K.start();
            } else {
                an.f2(anVar);
            }
        }
        if (!this.W1) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            kVar = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
            if (kVar.x() || anVar.Y9()) {
                return onTouchEvent;
            }
            C1(motionEvent);
            if (anVar.B9 || anVar.x9 || onTouchEvent) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        if (this.G3.f9 != null) {
            return false;
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        org.telegram.ui.Components.hk0 c42;
        org.telegram.ui.Components.q71 q71Var;
        super.requestDisallowInterceptTouchEvent(z10);
        View view = this.G3.u9;
        if (view != null) {
            if ((view instanceof org.telegram.ui.Cells.q1) && (c42 = ((org.telegram.ui.Cells.q1) view).c4()) != null && (q71Var = c42.e0) != null && c42.f0 && q71Var.w && !q71Var.E) {
                if (!q71Var.x) {
                    return;
                }
                if (!q71Var.y && (q71Var.L & 3) != 1) {
                    return;
                }
            }
            C1(null);
        }
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.E3) {
            return;
        }
        jh.a aVar = this.G3.tc;
        if (aVar.b != 0) {
            int childCount = aVar.a.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                aVar.a.getChildAt(i7).forceLayout();
            }
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView
    public final void setItemAnimator(v4.m0 m0Var) {
        if (this.W1) {
            return;
        }
        super.setItemAnimator(m0Var);
    }

    @Override // org.telegram.ui.Components.uj0, android.view.View
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            an anVar = this.G3;
            anVar.M9();
            anVar.O9();
        }
    }

    public final void z1(Canvas canvas, RectF rectF) {
        int i7;
        int i10;
        float f10;
        char c10;
        an anVar;
        float f11;
        int i11;
        float f12;
        int i12;
        org.telegram.messenger.bj bjVar;
        int i13;
        ArrayList arrayList;
        org.telegram.messenger.aj ajVar;
        boolean z10;
        int i14;
        org.telegram.messenger.bj currentMessagesGroup;
        int i15;
        int i16;
        boolean z11;
        org.telegram.ui.ActionBar.k kVar;
        int measuredHeight;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.k kVar2;
        int measuredHeight2;
        aj ajVar2 = this;
        Canvas canvas2 = canvas;
        int childCount = ajVar2.getChildCount();
        org.telegram.messenger.bj bjVar2 = null;
        int i19 = 0;
        while (true) {
            i7 = 8;
            i10 = 2;
            f10 = 0.0f;
            c10 = 0;
            anVar = ajVar2.G3;
            if (i19 >= childCount) {
                f11 = 1.0f;
                break;
            }
            View childAt = ajVar2.getChildAt(i19);
            f11 = 1.0f;
            if (childAt.getVisibility() != 4 && childAt.getVisibility() != 8) {
                if (!an.m2(anVar, childAt, rectF)) {
                    if (childAt instanceof org.telegram.ui.Cells.y1) {
                        canvas2.save();
                        canvas2.translate(childAt.getX(), childAt.getY());
                        ((org.telegram.ui.Cells.y1) childAt).a(canvas2);
                        canvas2.restore();
                    } else if (anVar.D0.n && (childAt instanceof org.telegram.ui.Cells.f0)) {
                        float measuredHeight3 = ((((ajVar2.getMeasuredHeight() - anVar.O9) - anVar.Xa) / 2.0f) - (childAt.getMeasuredHeight() / 2)) + anVar.O9;
                        if (!((org.telegram.ui.Cells.f0) childAt).J && !anVar.A0.W1) {
                            if (childAt.getTop() > measuredHeight3) {
                                childAt.setTranslationY(measuredHeight3 - childAt.getTop());
                            } else {
                                childAt.setTranslationY(0.0f);
                            }
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.ra) {
                        float measuredHeight4 = ((((ajVar2.getMeasuredHeight() - anVar.O9) - anVar.Xa) / 2.0f) - (childAt.getMeasuredHeight() / 2)) + anVar.O9;
                        if (!((org.telegram.ui.Cells.ra) childAt).P && !anVar.A0.W1) {
                            if (childAt.getTop() > measuredHeight4) {
                                childAt.setTranslationY(measuredHeight4 - childAt.getTop());
                            } else {
                                childAt.setTranslationY(0.0f);
                            }
                        }
                    } else {
                        if (childAt instanceof org.telegram.ui.Cells.q1) {
                            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                            org.telegram.messenger.bj currentMessagesGroup2 = q1Var.getCurrentMessagesGroup();
                            if (currentMessagesGroup2 == null || currentMessagesGroup2 != bjVar2) {
                                org.telegram.messenger.yi currentPosition = q1Var.getCurrentPosition();
                                org.telegram.ui.Components.l90 backgroundDrawable = q1Var.getBackgroundDrawable();
                                if ((backgroundDrawable.f || q1Var.z2()) && (currentPosition == null || (2 & currentPosition.l) != 0)) {
                                    boolean z12 = q1Var.x6;
                                    org.telegram.ui.ActionBar.e6 e6Var = ajVar2.o2;
                                    z11 = true;
                                    if (z12 || q1Var.y6) {
                                        i16 = i19;
                                        if (currentPosition == null) {
                                            Paint W0 = ajVar2.W0("paintChatMessageBackgroundSelected");
                                            ym ymVar = anVar.Aa;
                                            if ((ymVar == null || !ymVar.q) && W0 != null) {
                                                if (anVar.V9()) {
                                                    measuredHeight = anVar.A0.getTop();
                                                } else {
                                                    kVar = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
                                                    measuredHeight = kVar.getMeasuredHeight();
                                                }
                                                float backgroundTranslationY = measuredHeight - anVar.m1.getBackgroundTranslationY();
                                                int backgroundSizeY = anVar.m1.getBackgroundSizeY();
                                                ym ymVar2 = anVar.Aa;
                                                if (ymVar2 != null) {
                                                    ymVar2.b(q1Var.getX(), backgroundTranslationY, ajVar2.getMeasuredWidth(), backgroundSizeY);
                                                } else {
                                                    org.telegram.ui.ActionBar.j6.r(q1Var.getX(), backgroundTranslationY, ajVar2.getMeasuredWidth(), backgroundSizeY);
                                                }
                                            } else {
                                                W0 = org.telegram.ui.ActionBar.j6.a2;
                                                W0.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.yd, e6Var));
                                            }
                                            Paint paint = W0;
                                            canvas2.save();
                                            canvas2.translate(0.0f, q1Var.getTranslationY());
                                            int alpha = paint.getAlpha();
                                            paint.setAlpha((int) (q1Var.getAlpha() * q1Var.getHighlightAlpha() * alpha));
                                            canvas2.drawRect(0.0f, q1Var.getTop(), ajVar2.getMeasuredWidth(), q1Var.getBottom(), paint);
                                            paint.setAlpha(alpha);
                                            canvas2.restore();
                                        }
                                    } else {
                                        int y10 = (int) q1Var.getY();
                                        canvas2.save();
                                        if (currentPosition == null) {
                                            i17 = q1Var.getMeasuredHeight();
                                            i16 = i19;
                                        } else {
                                            int measuredHeight5 = q1Var.getMeasuredHeight() + y10;
                                            long j3 = 0;
                                            float f13 = 0.0f;
                                            int i20 = 0;
                                            while (i20 < childCount) {
                                                View childAt2 = ajVar2.getChildAt(i20);
                                                int i21 = i19;
                                                if (childAt2 instanceof org.telegram.ui.Cells.q1) {
                                                    org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt2;
                                                    if (q1Var2.getCurrentMessagesGroup() == currentMessagesGroup2) {
                                                        org.telegram.ui.Components.l90 backgroundDrawable2 = q1Var2.getBackgroundDrawable();
                                                        i18 = i20;
                                                        y10 = Math.min(y10, (int) q1Var2.getY());
                                                        measuredHeight5 = Math.max(measuredHeight5, q1Var2.getMeasuredHeight() + ((int) q1Var2.getY()));
                                                        long j10 = backgroundDrawable2.l;
                                                        if (j10 > j3) {
                                                            j3 = j10;
                                                            f10 = q1Var2.getX() + backgroundDrawable2.h;
                                                            f13 = q1Var2.getY() + backgroundDrawable2.i;
                                                        }
                                                        i20 = i18 + 1;
                                                        i19 = i21;
                                                    }
                                                }
                                                i18 = i20;
                                                i20 = i18 + 1;
                                                i19 = i21;
                                            }
                                            i16 = i19;
                                            backgroundDrawable.j = f10;
                                            backgroundDrawable.k = f13 - y10;
                                            i17 = measuredHeight5 - y10;
                                        }
                                        int i22 = i17 + y10;
                                        canvas2.clipRect(0, y10, ajVar2.getMeasuredWidth(), i22);
                                        Paint W02 = ajVar2.W0("paintChatMessageBackgroundSelected");
                                        ym ymVar3 = anVar.Aa;
                                        if (ymVar3 == null || ymVar3.q || W02 == null) {
                                            backgroundDrawable.b = null;
                                            backgroundDrawable.a.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.yd, e6Var));
                                        } else {
                                            backgroundDrawable.b = W02;
                                            if (anVar.V9()) {
                                                measuredHeight2 = anVar.A0.getTop();
                                            } else {
                                                kVar2 = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
                                                measuredHeight2 = kVar2.getMeasuredHeight();
                                            }
                                            float backgroundTranslationY2 = measuredHeight2 - anVar.m1.getBackgroundTranslationY();
                                            int backgroundSizeY2 = anVar.m1.getBackgroundSizeY();
                                            ym ymVar4 = anVar.Aa;
                                            if (ymVar4 != null) {
                                                ymVar4.b(q1Var.getX(), backgroundTranslationY2, ajVar2.getMeasuredWidth(), backgroundSizeY2);
                                            } else {
                                                org.telegram.ui.ActionBar.j6.r(q1Var.getX(), backgroundTranslationY2, ajVar2.getMeasuredWidth(), backgroundSizeY2);
                                            }
                                        }
                                        backgroundDrawable.setBounds(0, y10, ajVar2.getMeasuredWidth(), i22);
                                        backgroundDrawable.draw(canvas2);
                                        canvas2.restore();
                                    }
                                } else {
                                    i16 = i19;
                                    z11 = true;
                                }
                                bjVar2 = currentMessagesGroup2;
                            } else {
                                i16 = i19;
                                z11 = true;
                            }
                            if (anVar.Y8 != q1Var && currentMessagesGroup2 == null && q1Var.L0()) {
                                canvas2.save();
                                canvas2.translate(q1Var.getX(), q1Var.getY() + q1Var.getPaddingTop());
                                if (q1Var.getScaleX() != 1.0f) {
                                    canvas2.scale(q1Var.getScaleX(), q1Var.getScaleY(), q1Var.getPivotX(), q1Var.getHeight() >> 1);
                                }
                                q1Var.M0(canvas2, z11, false);
                                canvas2.restore();
                            }
                        } else {
                            i16 = i19;
                            if (childAt instanceof org.telegram.ui.Cells.t0) {
                                org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) childAt;
                                if (t0Var.T()) {
                                    canvas2.save();
                                    canvas2.translate(t0Var.getX(), t0Var.getY() + t0Var.getPaddingTop());
                                    canvas2.scale(t0Var.getScaleX(), t0Var.getScaleY(), t0Var.getMeasuredWidth() / 2.0f, t0Var.getMeasuredHeight() / 2.0f);
                                    canvas2.translate(anVar.n9() / 2.0f, 0.0f);
                                    t0Var.H(canvas2, true);
                                    t0Var.K(canvas2, true);
                                    canvas2.restore();
                                }
                            }
                        }
                        i19 = i16 + 1;
                    }
                }
            }
            i16 = i19;
            i19 = i16 + 1;
        }
        View view = anVar.Y8;
        org.telegram.messenger.bj currentMessagesGroup3 = view instanceof org.telegram.ui.Cells.q1 ? ((org.telegram.ui.Cells.q1) view).getCurrentMessagesGroup() : null;
        int i23 = 0;
        while (i23 < 3) {
            ArrayList arrayList2 = ajVar2.l3;
            arrayList2.clear();
            if (i23 != i10 || anVar.A0.W1) {
                int i24 = 0;
                while (i24 < childCount) {
                    View childAt3 = anVar.A0.getChildAt(i24);
                    if (childAt3 instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var3 = (org.telegram.ui.Cells.q1) childAt3;
                        if (childAt3.getY() <= anVar.A0.getHeight() && childAt3.getY() + childAt3.getHeight() >= f10 && q1Var3.getVisibility() != i7 && (currentMessagesGroup = q1Var3.getCurrentMessagesGroup()) != null) {
                            org.telegram.messenger.aj ajVar3 = currentMessagesGroup.m;
                            if (i23 == 0) {
                                i14 = i7;
                                i15 = 1;
                                if (currentMessagesGroup.d.size() == 1) {
                                    i24++;
                                    i7 = i14;
                                    i10 = 2;
                                    f10 = 0.0f;
                                }
                            } else {
                                i14 = i7;
                                i15 = 1;
                            }
                            if ((i23 != i15 || ajVar3.i) && ((i23 != 0 || !q1Var3.getMessageObject().Z) && ((i23 != 1 || q1Var3.getMessageObject().Z) && ((i23 != i10 || q1Var3.za) && (i23 == i10 || !q1Var3.za))))) {
                                if (!arrayList2.contains(currentMessagesGroup)) {
                                    ajVar3.a = 0;
                                    ajVar3.b = 0;
                                    ajVar3.c = 0;
                                    ajVar3.d = 0;
                                    ajVar3.l = false;
                                    ajVar3.k = false;
                                    ajVar3.m = q1Var3;
                                    arrayList2.add(currentMessagesGroup);
                                }
                                ajVar3.k = q1Var3.J2();
                                ajVar3.l = q1Var3.I2();
                                int backgroundDrawableLeft = q1Var3.getBackgroundDrawableLeft() + q1Var3.getLeft();
                                int backgroundDrawableRight = q1Var3.getBackgroundDrawableRight() + q1Var3.getLeft();
                                int backgroundDrawableTop = q1Var3.getBackgroundDrawableTop() + q1Var3.getPaddingTop() + q1Var3.getTop();
                                int backgroundDrawableBottom = q1Var3.getBackgroundDrawableBottom() + q1Var3.getPaddingTop() + q1Var3.getTop();
                                if ((q1Var3.getCurrentPosition().l & 4) == 0) {
                                    backgroundDrawableTop -= org.telegram.messenger.g0.L(10.0f);
                                }
                                int i25 = backgroundDrawableTop;
                                if ((q1Var3.getCurrentPosition().l & 8) == 0) {
                                    backgroundDrawableBottom = org.telegram.messenger.g0.L(10.0f) + backgroundDrawableBottom;
                                }
                                int i26 = backgroundDrawableBottom;
                                if (q1Var3.za) {
                                    ajVar3.m = q1Var3;
                                }
                                int i27 = ajVar3.b;
                                if (i27 == 0 || i25 < i27) {
                                    ajVar3.b = i25;
                                }
                                int i28 = ajVar3.d;
                                if (i28 == 0 || i26 > i28) {
                                    ajVar3.d = i26;
                                }
                                int i29 = ajVar3.a;
                                if (i29 == 0 || backgroundDrawableLeft < i29) {
                                    ajVar3.a = backgroundDrawableLeft;
                                }
                                int i30 = ajVar3.c;
                                if (i30 == 0 || backgroundDrawableRight > i30) {
                                    ajVar3.c = backgroundDrawableRight;
                                }
                            }
                            i24++;
                            i7 = i14;
                            i10 = 2;
                            f10 = 0.0f;
                        }
                    }
                    i14 = i7;
                    i24++;
                    i7 = i14;
                    i10 = 2;
                    f10 = 0.0f;
                }
                i11 = i7;
                int i31 = 0;
                while (i31 < arrayList2.size()) {
                    org.telegram.messenger.bj bjVar3 = (org.telegram.messenger.bj) arrayList2.get(i31);
                    org.telegram.messenger.aj ajVar4 = bjVar3.m;
                    ArrayList arrayList3 = bjVar3.d;
                    float S1 = ajVar4.m.S1(true);
                    float f14 = ajVar4.a + S1 + ajVar4.e;
                    float f15 = ajVar4.b + ajVar4.f;
                    float f16 = ajVar4.g + ajVar4.c + S1;
                    float f17 = ajVar4.d + ajVar4.h;
                    if (!ajVar4.j) {
                        f15 += ajVar4.m.getTranslationY();
                        f17 += ajVar4.m.getTranslationY();
                    }
                    float f18 = f15;
                    if (f17 > org.telegram.messenger.g0.L(20.0f) + anVar.A0.getMeasuredHeight()) {
                        f17 = org.telegram.messenger.g0.L(20.0f) + anVar.A0.getMeasuredHeight();
                    }
                    boolean z13 = (ajVar4.m.getScaleX() == f11 && ajVar4.m.getScaleY() == f11) ? false : true;
                    if (z13) {
                        canvas2.save();
                        bjVar = bjVar3;
                        i13 = i23;
                        arrayList = arrayList2;
                        canvas2.scale(ajVar4.m.getScaleX(), ajVar4.m.getScaleY(), com.google.android.gms.internal.vision.e2.A(f16, f14, 2.0f, f14), com.google.android.gms.internal.vision.e2.A(f17, f18, 2.0f, f18));
                    } else {
                        bjVar = bjVar3;
                        i13 = i23;
                        arrayList = arrayList2;
                    }
                    int size = arrayList3.size();
                    int i32 = 0;
                    while (true) {
                        if (i32 >= size) {
                            ajVar = ajVar4;
                            z10 = true;
                            break;
                        }
                        org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList3.get(i32);
                        ajVar = ajVar4;
                        if (anVar.n6[org.telegram.messenger.gj.B0(gjVar.k) == anVar.k6 ? (char) 0 : (char) 1].indexOfKey(gjVar.e1()) < 0) {
                            z10 = false;
                            break;
                        } else {
                            i32++;
                            ajVar4 = ajVar;
                        }
                    }
                    float f19 = f17;
                    an anVar2 = anVar;
                    boolean z14 = z10;
                    org.telegram.messenger.bj bjVar4 = bjVar;
                    ajVar.m.K0(canvas, (int) f14, (int) f18, (int) f16, (int) f17, ajVar.k, ajVar.l, z14, 0);
                    if (bjVar4 != currentMessagesGroup3) {
                        ajVar.m = null;
                    }
                    ajVar.o = bjVar4.c;
                    if (z13) {
                        canvas.restore();
                        for (int i33 = 0; i33 < childCount; i33++) {
                            View childAt4 = anVar2.A0.getChildAt(i33);
                            if (childAt4 instanceof org.telegram.ui.Cells.q1) {
                                org.telegram.ui.Cells.q1 q1Var4 = (org.telegram.ui.Cells.q1) childAt4;
                                if (q1Var4.getCurrentMessagesGroup() == bjVar4) {
                                    int left = q1Var4.getLeft();
                                    int top = q1Var4.getTop();
                                    childAt4.setPivotX(((f16 - f14) / 2.0f) + (f14 - left));
                                    childAt4.setPivotY(((f19 - f18) / 2.0f) + (f18 - top));
                                }
                            }
                        }
                    }
                    i31++;
                    canvas2 = canvas;
                    anVar = anVar2;
                    i23 = i13;
                    arrayList2 = arrayList;
                    c10 = 0;
                }
                f12 = 0.0f;
                i12 = 2;
            } else {
                i11 = i7;
                i12 = i10;
                f12 = f10;
            }
            canvas2 = canvas;
            anVar = anVar;
            i7 = i11;
            f10 = f12;
            i10 = i12;
            c10 = c10;
            i23++;
            ajVar2 = this;
        }
    }
}
