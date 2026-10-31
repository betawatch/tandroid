package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class hv extends qu {
    public static Paint m0;
    public static Paint n0;
    public final boolean W;
    public final ArrayList X;
    public final int Y;
    public final int Z;
    public int a0;
    public float b0;
    public boolean c0;
    public boolean d0;
    public float e0;
    public float f0;
    public int g0;
    public int h0;
    public int i0;
    public VelocityTracker j0;
    public ValueAnimator k0;
    public final Path l0;

    public hv(vv vvVar, Rect rect, int i10, TL_iv.pageBlockSlideshow pageblockslideshow, boolean z10) {
        super(vvVar, rect, i10);
        this.X = new ArrayList();
        this.l0 = new Path();
        this.W = z10;
        for (int i11 = 0; i11 < pageblockslideshow.items.size(); i11++) {
            TL_iv.PageBlock pageBlock = pageblockslideshow.items.get(i11);
            ju juVar = pageBlock instanceof TL_iv.pageBlockPhoto ? new ju(vvVar, (TL_iv.pageBlockPhoto) pageBlock) : pageBlock instanceof TL_iv.pageBlockVideo ? new ju(vvVar, (TL_iv.pageBlockVideo) pageBlock) : null;
            if (juVar != null) {
                this.X.add(juVar);
            }
        }
        ArrayList arrayList = this.X;
        if (arrayList.isEmpty()) {
            this.Z = 0;
            this.Y = 0;
            return;
        }
        this.Y = this.c;
        int size = arrayList.size();
        int i12 = 0;
        float f7 = 0.0f;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            float f10 = ((ju) obj).E;
            if (f10 <= 0.0f) {
                f10 = 1.0f;
            }
            f7 += f10;
        }
        int max = (int) (this.Y / Math.max(0.5f, f7 / arrayList.size()));
        Point point = i0.q;
        int max2 = (int) (Math.max(point.x, point.y) * 0.55f);
        this.Z = max > max2 ? max2 : max;
        int size2 = arrayList.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = arrayList.get(i13);
            i13++;
            ((ju) obj2).l(0, 0, this.Y, this.Z);
        }
    }

    @Override // org.telegram.messenger.qu
    public final void A(int i10, Rect rect) {
        Rect rect2 = this.b;
        int i11 = rect2.left;
        int i12 = ((int) this.M) + rect2.top;
        rect.set(i11, i12, this.Y + i11, this.Z + i12);
    }

    @Override // org.telegram.messenger.qu
    public final int B() {
        return !this.X.isEmpty() ? 1 : 0;
    }

    @Override // org.telegram.messenger.qu
    public final CharSequence E(int i10) {
        ArrayList arrayList = this.X;
        if (arrayList.isEmpty()) {
            return null;
        }
        int max = Math.max(0, Math.min(this.a0, arrayList.size() - 1));
        return TextUtils.concat(((ju) arrayList.get(max)).f(), ", ", cd.a0(null, null, 2131747845, Integer.valueOf(max + 1), Integer.valueOf(arrayList.size())));
    }

    @Override // org.telegram.messenger.qu
    public final int H() {
        return this.Z;
    }

    @Override // org.telegram.messenger.qu
    public final int I() {
        return J();
    }

    @Override // org.telegram.messenger.qu
    public final int J() {
        Rect rect = this.b;
        return rect.left + this.c + rect.right;
    }

    @Override // org.telegram.messenger.qu
    public final boolean P() {
        if (this.c0) {
            return true;
        }
        ValueAnimator valueAnimator = this.k0;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    @Override // org.telegram.messenger.qu
    public final void S() {
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ju juVar = (ju) obj;
            View view = this.V;
            juVar.S = view;
            ImageReceiver imageReceiver = juVar.c;
            imageReceiver.H0(view);
            imageReceiver.P();
            ImageReceiver imageReceiver2 = juVar.d;
            imageReceiver2.H0(view);
            imageReceiver2.P();
            juVar.d(view);
            juVar.m(view, false);
        }
    }

    @Override // org.telegram.messenger.qu
    public final boolean T(int i10, View view) {
        ArrayList arrayList = this.X;
        if (arrayList.isEmpty()) {
            return false;
        }
        return ((ju) arrayList.get(Math.max(0, Math.min(this.a0, arrayList.size() - 1)))).j(view);
    }

    @Override // org.telegram.messenger.qu
    public final void U() {
        int i10 = 0;
        Z(false);
        this.c0 = false;
        this.d0 = false;
        VelocityTracker velocityTracker = this.j0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.j0 = null;
        }
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ju juVar = (ju) obj;
            juVar.c.R();
            juVar.d.R();
            juVar.e = null;
            b6.q(juVar.a.a).v(juVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0176  */
    @Override // org.telegram.messenger.qu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V(Canvas canvas) {
        float f7;
        float f10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int L;
        int i15;
        int i16;
        int size;
        int i17;
        float i18;
        ArrayList arrayList;
        int i19;
        int i20;
        float f11;
        ju juVar;
        Canvas canvas2 = canvas;
        ArrayList arrayList2 = this.X;
        if (arrayList2.isEmpty()) {
            return;
        }
        if (n0 == null) {
            Paint paint = new Paint(1);
            n0 = paint;
            paint.setColor(251658240);
        }
        boolean Q = Q();
        int L2 = i0.L(2.0f);
        vv vvVar = this.a;
        int i21 = (Q || vvVar.D()) ? 0 : vvVar.S - L2;
        int i22 = (Q || vvVar.D()) ? 0 : vvVar.T - L2;
        int i23 = this.Y;
        int i24 = i23 + i21 + i22;
        canvas2.save();
        int i25 = this.Z;
        Path path = this.l0;
        if (Q) {
            L = i0.L(8.0f);
            path.rewind();
            f7 = 2.0f;
            f10 = 3.0f;
            float f12 = L;
            path.addRoundRect(0.0f, 0.0f, i23, i25, f12, f12, Path.Direction.CW);
            canvas2.clipPath(path);
        } else {
            f7 = 2.0f;
            f10 = 3.0f;
            if (!vvVar.D()) {
                if (this.W) {
                    int i26 = tz.Y0;
                    int L3 = i26 > 2 ? i0.L(i26 - 2) : i0.L(i26);
                    i12 = Math.min(i0.L(3.0f), L3);
                    i13 = ((vvVar.E() || !vvVar.G()) && !vvVar.B()) ? L3 : i12;
                    if ((vvVar.E() && vvVar.G()) || vvVar.B()) {
                        L3 = i12;
                    }
                    float f13 = i13;
                    i10 = 1;
                    float f14 = L3;
                    float f15 = i12;
                    i14 = L3;
                    path.rewind();
                    path.addRoundRect(-i21, 0.0f, i23 + i22, i25, new float[]{f13, f13, f14, f14, f15, f15, f15, f15}, Path.Direction.CW);
                    canvas2.clipPath(path);
                    i11 = i12;
                } else {
                    i10 = 1;
                    canvas2.clipRect(-i21, 0, vvVar.C + i22, i25);
                    i11 = 0;
                    i12 = 0;
                    i13 = 0;
                    i14 = 0;
                }
                i15 = this.a0;
                float f16 = 0.0f;
                if ((i15 == 0 && this.b0 < 0.0f) || (i15 == arrayList2.size() - 1 && this.b0 > 0.0f)) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.t6.r1(0.2f, org.telegram.ui.ActionBar.t6.w0(vvVar.E() ? org.telegram.ui.ActionBar.t6.Qb : org.telegram.ui.ActionBar.t6.Kd, vvVar.D)));
                }
                float f17 = i24;
                float f18 = (-this.b0) * f17;
                i16 = this.a0 - 1;
                while (i16 <= this.a0 + 1) {
                    if (i16 < 0 || i16 >= arrayList2.size()) {
                        arrayList = arrayList2;
                        i19 = i11;
                        i20 = i16;
                        f11 = f17;
                    } else {
                        ju juVar2 = (ju) arrayList2.get(i16);
                        canvas2.save();
                        canvas2.translate(((i16 - this.a0) * i24) + f18, f16);
                        ImageReceiver imageReceiver = juVar2.c;
                        ImageReceiver imageReceiver2 = juVar2.c;
                        int i27 = i16 == 0 ? i13 : 0;
                        int i28 = i16 == arrayList2.size() + (-1) ? i14 : 0;
                        arrayList = arrayList2;
                        int i29 = i16 == arrayList2.size() + (-1) ? i12 : 0;
                        i19 = i11;
                        if (i16 != 0) {
                            i11 = 0;
                        }
                        imageReceiver.K0(i27, i28, i29, i11);
                        juVar2.d.K0(i16 == 0 ? i13 : 0, i16 == arrayList.size() + (-1) ? i14 : 0, i16 == arrayList.size() + (-1) ? i12 : 0, i16 == 0 ? i19 : 0);
                        float f19 = -i21;
                        imageReceiver2.y0(f19, 0.0f, f17, i25);
                        if (imageReceiver2.I() && imageReceiver2.h1 == 1.0f) {
                            canvas2 = canvas;
                            i20 = i16;
                            f11 = f17;
                            juVar = juVar2;
                        } else {
                            f11 = f17;
                            juVar = juVar2;
                            i20 = i16;
                            canvas2 = canvas;
                            canvas2.drawRect(f19, 0.0f, i24 + i22, i25, n0);
                        }
                        juVar.c(canvas2);
                        canvas2.restore();
                    }
                    i16 = i20 + 1;
                    f17 = f11;
                    i11 = i19;
                    arrayList2 = arrayList;
                    f16 = 0.0f;
                }
                canvas2.restore();
                size = arrayList2.size();
                i17 = i10;
                if (size > i17) {
                    if (m0 == null) {
                        Paint paint2 = new Paint(i17);
                        m0 = paint2;
                        paint2.setColor(-1);
                        m0.setShadowLayer(i0.N(f10), 0.0f, i0.N(1.0f), TLObject.FLAG_31);
                    }
                    float L4 = i0.L(5.0f) + (i25 - i0.L(23.0f));
                    int L5 = i0.L(4.0f) + m5.D(6.0f, size - 1, i0.L(7.0f) * size);
                    float f20 = this.a0 + this.b0;
                    if (L5 < i24) {
                        i18 = (i24 - L5) / f7;
                    } else {
                        float L6 = i0.L(4.0f);
                        int L7 = i0.L(13.0f);
                        i18 = L6 - (Utilities.i(f20 - (((i24 - i0.L(8.0f)) / 2) / L7), Math.max(0, (size - (r10 * 2)) - 1), 0.0f) * L7);
                    }
                    canvas2.save();
                    canvas2.clipRect(0, i25 - i0.L(23.0f), i24, i25);
                    for (int i30 = 0; i30 < size; i30++) {
                        float max = Math.max(0.0f, 1.0f - Math.abs(i30 - f20));
                        m0.setAlpha((int) ((max * 95.0f) + 160.0f));
                        canvas2.drawCircle(i0.L(4.0f) + i18 + (i0.L(13.0f) * i30), L4, (i0.L(1.0f) * max) + i0.L(f7), m0);
                    }
                    canvas2.restore();
                    return;
                }
                return;
            }
            L = i0.L(12.0f);
            path.rewind();
            float f21 = L;
            path.addRoundRect(0.0f, 0.0f, i23, i25, f21, f21, Path.Direction.CW);
            canvas2.clipPath(path);
        }
        i12 = L;
        i13 = i12;
        i14 = i13;
        i10 = 1;
        i11 = i14;
        i15 = this.a0;
        float f162 = 0.0f;
        if (i15 == 0) {
            canvas2.drawColor(org.telegram.ui.ActionBar.t6.r1(0.2f, org.telegram.ui.ActionBar.t6.w0(vvVar.E() ? org.telegram.ui.ActionBar.t6.Qb : org.telegram.ui.ActionBar.t6.Kd, vvVar.D)));
            float f172 = i24;
            float f182 = (-this.b0) * f172;
            i16 = this.a0 - 1;
            while (i16 <= this.a0 + 1) {
            }
            canvas2.restore();
            size = arrayList2.size();
            i17 = i10;
            if (size > i17) {
            }
        }
        canvas2.drawColor(org.telegram.ui.ActionBar.t6.r1(0.2f, org.telegram.ui.ActionBar.t6.w0(vvVar.E() ? org.telegram.ui.ActionBar.t6.Qb : org.telegram.ui.ActionBar.t6.Kd, vvVar.D)));
        float f1722 = i24;
        float f1822 = (-this.b0) * f1722;
        i16 = this.a0 - 1;
        while (i16 <= this.a0 + 1) {
        }
        canvas2.restore();
        size = arrayList2.size();
        i17 = i10;
        if (size > i17) {
        }
    }

    @Override // org.telegram.messenger.qu
    public final boolean X(MotionEvent motionEvent) {
        boolean k10;
        VelocityTracker velocityTracker;
        View view;
        int actionMasked = motionEvent.getActionMasked();
        Rect rect = this.b;
        motionEvent.offsetLocation(-rect.left, -rect.top);
        ArrayList arrayList = this.X;
        try {
            if (actionMasked == 0) {
                if (this.g0 == 0 && (view = this.V) != null) {
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
                    this.g0 = viewConfiguration.getScaledTouchSlop();
                    this.h0 = viewConfiguration.getScaledMinimumFlingVelocity();
                    this.i0 = viewConfiguration.getScaledMaximumFlingVelocity();
                }
                this.e0 = motionEvent.getX();
                this.f0 = motionEvent.getY();
                this.c0 = false;
                this.d0 = false;
                VelocityTracker velocityTracker2 = this.j0;
                if (velocityTracker2 == null) {
                    this.j0 = VelocityTracker.obtain();
                } else {
                    velocityTracker2.clear();
                }
                this.j0.addMovement(motionEvent);
                Z(true);
                ValueAnimator valueAnimator = this.k0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.k0 = null;
                }
                int i10 = this.a0;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    ((ju) arrayList.get(this.a0)).k(this.V, motionEvent);
                }
            } else {
                float f7 = 0.0f;
                if (actionMasked != 2) {
                    if (actionMasked == 1 || actionMasked == 3) {
                        boolean z10 = this.d0;
                        this.d0 = false;
                        if (!z10 && actionMasked == 1 && (velocityTracker = this.j0) != null) {
                            velocityTracker.addMovement(motionEvent);
                            this.j0.computeCurrentVelocity(1000, this.i0);
                            float xVelocity = this.j0.getXVelocity();
                            float yVelocity = this.j0.getYVelocity();
                            if (Math.abs(xVelocity) >= this.h0 && Math.abs(xVelocity) > Math.abs(yVelocity)) {
                                f7 = xVelocity;
                            }
                        }
                        VelocityTracker velocityTracker3 = this.j0;
                        if (velocityTracker3 != null) {
                            velocityTracker3.recycle();
                            this.j0 = null;
                        }
                        Z(false);
                        if (!z10) {
                            if (this.c0) {
                                this.c0 = false;
                                h0(f7);
                            } else {
                                int i11 = this.a0;
                                if (i11 >= 0 && i11 < arrayList.size()) {
                                    k10 = ((ju) arrayList.get(this.a0)).k(this.V, motionEvent);
                                    motionEvent.offsetLocation(rect.left, rect.top);
                                    return k10;
                                }
                            }
                        }
                    }
                    motionEvent.offsetLocation(rect.left, rect.top);
                    return false;
                }
                if (!this.d0) {
                    VelocityTracker velocityTracker4 = this.j0;
                    if (velocityTracker4 != null) {
                        velocityTracker4.addMovement(motionEvent);
                    }
                    float x10 = motionEvent.getX() - this.e0;
                    float y3 = motionEvent.getY() - this.f0;
                    if (this.c0 || Math.abs(y3) <= this.g0 || Math.abs(y3) <= Math.abs(x10)) {
                        if (!this.c0 && Math.abs(x10) > this.g0 && Math.abs(x10) > Math.abs(y3)) {
                            this.c0 = true;
                            int i12 = this.a0;
                            if (i12 >= 0 && i12 < arrayList.size()) {
                                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                                obtain.setAction(3);
                                ((ju) arrayList.get(this.a0)).k(this.V, obtain);
                                obtain.recycle();
                            }
                        }
                        if (!this.c0) {
                            int i13 = this.a0;
                            if (i13 >= 0 && i13 < arrayList.size()) {
                                k10 = ((ju) arrayList.get(this.a0)).k(this.V, motionEvent);
                                motionEvent.offsetLocation(rect.left, rect.top);
                                return k10;
                            }
                            motionEvent.offsetLocation(rect.left, rect.top);
                            return false;
                        }
                        float f10 = (-x10) / this.Y;
                        int i14 = this.a0;
                        if (i14 == 0 && f10 < 0.0f) {
                            f10 *= 0.3f;
                        }
                        if (i14 == arrayList.size() - 1 && f10 > 0.0f) {
                            f10 *= 0.3f;
                        }
                        this.b0 = f10;
                        View view2 = this.V;
                        if (view2 != null) {
                            view2.invalidate();
                        }
                    } else {
                        this.d0 = true;
                        int i15 = this.a0;
                        if (i15 >= 0 && i15 < arrayList.size()) {
                            MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                            obtain2.setAction(3);
                            ((ju) arrayList.get(this.a0)).k(this.V, obtain2);
                            obtain2.recycle();
                        }
                        Z(false);
                    }
                }
            }
            return true;
        } finally {
            motionEvent.offsetLocation(rect.left, rect.top);
        }
    }

    public final void h0(float f7) {
        int i10;
        ArrayList arrayList = this.X;
        int i11 = 1;
        if (f7 >= 0.0f || this.a0 >= arrayList.size() - 1) {
            i10 = -1;
            if (f7 <= 0.0f || this.a0 <= 0) {
                if (this.b0 <= 0.5f || this.a0 >= arrayList.size() - 1) {
                    if (this.b0 >= -0.5f || this.a0 <= 0) {
                        i10 = 0;
                    }
                }
            }
            int i12 = i10 + this.a0;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b0, i12 - r7);
            this.k0 = ofFloat;
            ofFloat.setDuration(420L);
            this.k0.setInterpolator(org.telegram.ui.Components.gr.h);
            this.k0.addUpdateListener(new g(this, 2));
            this.k0.addListener(new bi.d5(this, i12, i11));
            this.k0.start();
        }
        i10 = 1;
        int i122 = i10 + this.a0;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.b0, i122 - r7);
        this.k0 = ofFloat2;
        ofFloat2.setDuration(420L);
        this.k0.setInterpolator(org.telegram.ui.Components.gr.h);
        this.k0.addUpdateListener(new g(this, 2));
        this.k0.addListener(new bi.d5(this, i122, i11));
        this.k0.start();
    }
}
