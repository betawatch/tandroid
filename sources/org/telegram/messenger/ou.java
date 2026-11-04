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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class ou extends xt {
    public static Paint n0;
    public static Paint o0;
    public final boolean X;
    public final ArrayList Y;
    public final int Z;
    public final int a0;
    public int b0;
    public float c0;
    public boolean d0;
    public boolean e0;
    public float f0;
    public float g0;
    public int h0;
    public int i0;
    public int j0;
    public VelocityTracker k0;
    public ValueAnimator l0;
    public final Path m0;

    public ou(cv cvVar, Rect rect, int i3, TL_iv.pageBlockSlideshow pageblockslideshow, boolean z10) {
        super(cvVar, rect, i3);
        this.Y = new ArrayList();
        this.m0 = new Path();
        this.X = z10;
        for (int i10 = 0; i10 < pageblockslideshow.items.size(); i10++) {
            TL_iv.PageBlock pageBlock = pageblockslideshow.items.get(i10);
            qt qtVar = pageBlock instanceof TL_iv.pageBlockPhoto ? new qt(cvVar, (TL_iv.pageBlockPhoto) pageBlock) : pageBlock instanceof TL_iv.pageBlockVideo ? new qt(cvVar, (TL_iv.pageBlockVideo) pageBlock) : null;
            if (qtVar != null) {
                this.Y.add(qtVar);
            }
        }
        ArrayList arrayList = this.Y;
        if (arrayList.isEmpty()) {
            this.a0 = 0;
            this.Z = 0;
            return;
        }
        this.Z = this.c;
        int size = arrayList.size();
        int i11 = 0;
        float f10 = 0.0f;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            float f11 = ((qt) obj).F;
            if (f11 <= 0.0f) {
                f11 = 1.0f;
            }
            f10 += f11;
        }
        int max = (int) (this.Z / Math.max(0.5f, f10 / arrayList.size()));
        Point point = g0.q;
        int max2 = (int) (Math.max(point.x, point.y) * 0.55f);
        this.a0 = max > max2 ? max2 : max;
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList.get(i12);
            i12++;
            ((qt) obj2).l(0, 0, this.Z, this.a0);
        }
    }

    @Override // org.telegram.messenger.xt
    public final void A(int i3, Rect rect) {
        Rect rect2 = this.b;
        int i10 = rect2.left;
        int i11 = ((int) this.N) + rect2.top;
        rect.set(i10, i11, this.Z + i10, this.a0 + i11);
    }

    @Override // org.telegram.messenger.xt
    public final int B() {
        return !this.Y.isEmpty() ? 1 : 0;
    }

    @Override // org.telegram.messenger.xt
    public final CharSequence E(int i3) {
        ArrayList arrayList = this.Y;
        if (arrayList.isEmpty()) {
            return null;
        }
        int max = Math.max(0, Math.min(this.b0, arrayList.size() - 1));
        return TextUtils.concat(((qt) arrayList.get(max)).f(), ", ", bd.a0(null, null, 2131747837, Integer.valueOf(max + 1), Integer.valueOf(arrayList.size())));
    }

    @Override // org.telegram.messenger.xt
    public final int I() {
        return this.a0;
    }

    @Override // org.telegram.messenger.xt
    public final int J() {
        return K();
    }

    @Override // org.telegram.messenger.xt
    public final int K() {
        Rect rect = this.b;
        return rect.left + this.c + rect.right;
    }

    @Override // org.telegram.messenger.xt
    public final boolean Q() {
        if (this.d0) {
            return true;
        }
        ValueAnimator valueAnimator = this.l0;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    @Override // org.telegram.messenger.xt
    public final void T() {
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            qt qtVar = (qt) obj;
            View view = this.W;
            qtVar.T = view;
            ImageReceiver imageReceiver = qtVar.c;
            imageReceiver.H0(view);
            imageReceiver.P();
            ImageReceiver imageReceiver2 = qtVar.d;
            imageReceiver2.H0(view);
            imageReceiver2.P();
            qtVar.d(view);
            qtVar.m(view, false);
        }
    }

    @Override // org.telegram.messenger.xt
    public final boolean U(int i3, View view) {
        ArrayList arrayList = this.Y;
        if (arrayList.isEmpty()) {
            return false;
        }
        return ((qt) arrayList.get(Math.max(0, Math.min(this.b0, arrayList.size() - 1)))).j(view);
    }

    @Override // org.telegram.messenger.xt
    public final void V() {
        int i3 = 0;
        a0(false);
        this.d0 = false;
        this.e0 = false;
        VelocityTracker velocityTracker = this.k0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.k0 = null;
        }
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            qt qtVar = (qt) obj;
            qtVar.c.R();
            qtVar.d.R();
            qtVar.e = null;
            z5.q(qtVar.a.a).v(qtVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0176  */
    @Override // org.telegram.messenger.xt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W(Canvas canvas) {
        float f10;
        float f11;
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        int L;
        int i14;
        int i15;
        int size;
        int i16;
        float i17;
        ArrayList arrayList;
        int i18;
        int i19;
        float f12;
        qt qtVar;
        Canvas canvas2 = canvas;
        ArrayList arrayList2 = this.Y;
        if (arrayList2.isEmpty()) {
            return;
        }
        if (o0 == null) {
            Paint paint = new Paint(1);
            o0 = paint;
            paint.setColor(251658240);
        }
        boolean R = R();
        int L2 = g0.L(2.0f);
        cv cvVar = this.a;
        int i20 = (R || cvVar.D()) ? 0 : cvVar.S - L2;
        int i21 = (R || cvVar.D()) ? 0 : cvVar.T - L2;
        int i22 = this.Z;
        int i23 = i22 + i20 + i21;
        canvas2.save();
        int i24 = this.a0;
        Path path = this.m0;
        if (R) {
            L = g0.L(8.0f);
            path.rewind();
            f10 = 2.0f;
            f11 = 3.0f;
            float f13 = L;
            path.addRoundRect(0.0f, 0.0f, i22, i24, f13, f13, Path.Direction.CW);
            canvas2.clipPath(path);
        } else {
            f10 = 2.0f;
            f11 = 3.0f;
            if (!cvVar.D()) {
                if (this.X) {
                    int i25 = az.Y0;
                    int L3 = i25 > 2 ? g0.L(i25 - 2) : g0.L(i25);
                    i11 = Math.min(g0.L(3.0f), L3);
                    i12 = ((cvVar.E() || !cvVar.G()) && !cvVar.B()) ? L3 : i11;
                    if ((cvVar.E() && cvVar.G()) || cvVar.B()) {
                        L3 = i11;
                    }
                    float f14 = i12;
                    i3 = 1;
                    float f15 = L3;
                    float f16 = i11;
                    i13 = L3;
                    path.rewind();
                    path.addRoundRect(-i20, 0.0f, i22 + i21, i24, new float[]{f14, f14, f15, f15, f16, f16, f16, f16}, Path.Direction.CW);
                    canvas2.clipPath(path);
                    i10 = i11;
                } else {
                    i3 = 1;
                    canvas2.clipRect(-i20, 0, cvVar.C + i21, i24);
                    i10 = 0;
                    i11 = 0;
                    i12 = 0;
                    i13 = 0;
                }
                i14 = this.b0;
                float f17 = 0.0f;
                if ((i14 == 0 && this.c0 < 0.0f) || (i14 == arrayList2.size() - 1 && this.c0 > 0.0f)) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.k6.r1(0.2f, org.telegram.ui.ActionBar.k6.w0(cvVar.E() ? org.telegram.ui.ActionBar.k6.Qb : org.telegram.ui.ActionBar.k6.Kd, cvVar.D)));
                }
                float f18 = i23;
                float f19 = (-this.c0) * f18;
                i15 = this.b0 - 1;
                while (i15 <= this.b0 + 1) {
                    if (i15 < 0 || i15 >= arrayList2.size()) {
                        arrayList = arrayList2;
                        i18 = i10;
                        i19 = i15;
                        f12 = f18;
                    } else {
                        qt qtVar2 = (qt) arrayList2.get(i15);
                        canvas2.save();
                        canvas2.translate(((i15 - this.b0) * i23) + f19, f17);
                        ImageReceiver imageReceiver = qtVar2.c;
                        ImageReceiver imageReceiver2 = qtVar2.c;
                        int i26 = i15 == 0 ? i12 : 0;
                        int i27 = i15 == arrayList2.size() + (-1) ? i13 : 0;
                        arrayList = arrayList2;
                        int i28 = i15 == arrayList2.size() + (-1) ? i11 : 0;
                        i18 = i10;
                        if (i15 != 0) {
                            i10 = 0;
                        }
                        imageReceiver.K0(i26, i27, i28, i10);
                        qtVar2.d.K0(i15 == 0 ? i12 : 0, i15 == arrayList.size() + (-1) ? i13 : 0, i15 == arrayList.size() + (-1) ? i11 : 0, i15 == 0 ? i18 : 0);
                        float f20 = -i20;
                        imageReceiver2.y0(f20, 0.0f, f18, i24);
                        if (imageReceiver2.I() && imageReceiver2.i1 == 1.0f) {
                            canvas2 = canvas;
                            i19 = i15;
                            f12 = f18;
                            qtVar = qtVar2;
                        } else {
                            f12 = f18;
                            qtVar = qtVar2;
                            i19 = i15;
                            canvas2 = canvas;
                            canvas2.drawRect(f20, 0.0f, i23 + i21, i24, o0);
                        }
                        qtVar.c(canvas2);
                        canvas2.restore();
                    }
                    i15 = i19 + 1;
                    f18 = f12;
                    i10 = i18;
                    arrayList2 = arrayList;
                    f17 = 0.0f;
                }
                canvas2.restore();
                size = arrayList2.size();
                i16 = i3;
                if (size > i16) {
                    if (n0 == null) {
                        Paint paint2 = new Paint(i16);
                        n0 = paint2;
                        paint2.setColor(-1);
                        n0.setShadowLayer(g0.N(f11), 0.0f, g0.N(1.0f), TLObject.FLAG_31);
                    }
                    float L4 = g0.L(5.0f) + (i24 - g0.L(23.0f));
                    int L5 = g0.L(4.0f) + k5.D(6.0f, size - 1, g0.L(7.0f) * size);
                    float f21 = this.b0 + this.c0;
                    if (L5 < i23) {
                        i17 = (i23 - L5) / f10;
                    } else {
                        float L6 = g0.L(4.0f);
                        int L7 = g0.L(13.0f);
                        i17 = L6 - (Utilities.i(f21 - (((i23 - g0.L(8.0f)) / 2) / L7), Math.max(0, (size - (r10 * 2)) - 1), 0.0f) * L7);
                    }
                    canvas2.save();
                    canvas2.clipRect(0, i24 - g0.L(23.0f), i23, i24);
                    for (int i29 = 0; i29 < size; i29++) {
                        float max = Math.max(0.0f, 1.0f - Math.abs(i29 - f21));
                        n0.setAlpha((int) ((max * 95.0f) + 160.0f));
                        canvas2.drawCircle(g0.L(4.0f) + i17 + (g0.L(13.0f) * i29), L4, (g0.L(1.0f) * max) + g0.L(f10), n0);
                    }
                    canvas2.restore();
                    return;
                }
                return;
            }
            L = g0.L(12.0f);
            path.rewind();
            float f22 = L;
            path.addRoundRect(0.0f, 0.0f, i22, i24, f22, f22, Path.Direction.CW);
            canvas2.clipPath(path);
        }
        i11 = L;
        i12 = i11;
        i13 = i12;
        i3 = 1;
        i10 = i13;
        i14 = this.b0;
        float f172 = 0.0f;
        if (i14 == 0) {
            canvas2.drawColor(org.telegram.ui.ActionBar.k6.r1(0.2f, org.telegram.ui.ActionBar.k6.w0(cvVar.E() ? org.telegram.ui.ActionBar.k6.Qb : org.telegram.ui.ActionBar.k6.Kd, cvVar.D)));
            float f182 = i23;
            float f192 = (-this.c0) * f182;
            i15 = this.b0 - 1;
            while (i15 <= this.b0 + 1) {
            }
            canvas2.restore();
            size = arrayList2.size();
            i16 = i3;
            if (size > i16) {
            }
        }
        canvas2.drawColor(org.telegram.ui.ActionBar.k6.r1(0.2f, org.telegram.ui.ActionBar.k6.w0(cvVar.E() ? org.telegram.ui.ActionBar.k6.Qb : org.telegram.ui.ActionBar.k6.Kd, cvVar.D)));
        float f1822 = i23;
        float f1922 = (-this.c0) * f1822;
        i15 = this.b0 - 1;
        while (i15 <= this.b0 + 1) {
        }
        canvas2.restore();
        size = arrayList2.size();
        i16 = i3;
        if (size > i16) {
        }
    }

    @Override // org.telegram.messenger.xt
    public final boolean Y(MotionEvent motionEvent) {
        boolean k10;
        VelocityTracker velocityTracker;
        View view;
        int actionMasked = motionEvent.getActionMasked();
        Rect rect = this.b;
        motionEvent.offsetLocation(-rect.left, -rect.top);
        ArrayList arrayList = this.Y;
        try {
            if (actionMasked == 0) {
                if (this.h0 == 0 && (view = this.W) != null) {
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
                    this.h0 = viewConfiguration.getScaledTouchSlop();
                    this.i0 = viewConfiguration.getScaledMinimumFlingVelocity();
                    this.j0 = viewConfiguration.getScaledMaximumFlingVelocity();
                }
                this.f0 = motionEvent.getX();
                this.g0 = motionEvent.getY();
                this.d0 = false;
                this.e0 = false;
                VelocityTracker velocityTracker2 = this.k0;
                if (velocityTracker2 == null) {
                    this.k0 = VelocityTracker.obtain();
                } else {
                    velocityTracker2.clear();
                }
                this.k0.addMovement(motionEvent);
                a0(true);
                ValueAnimator valueAnimator = this.l0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.l0 = null;
                }
                int i3 = this.b0;
                if (i3 >= 0 && i3 < arrayList.size()) {
                    ((qt) arrayList.get(this.b0)).k(this.W, motionEvent);
                }
            } else {
                float f10 = 0.0f;
                if (actionMasked != 2) {
                    if (actionMasked == 1 || actionMasked == 3) {
                        boolean z10 = this.e0;
                        this.e0 = false;
                        if (!z10 && actionMasked == 1 && (velocityTracker = this.k0) != null) {
                            velocityTracker.addMovement(motionEvent);
                            this.k0.computeCurrentVelocity(1000, this.j0);
                            float xVelocity = this.k0.getXVelocity();
                            float yVelocity = this.k0.getYVelocity();
                            if (Math.abs(xVelocity) >= this.i0 && Math.abs(xVelocity) > Math.abs(yVelocity)) {
                                f10 = xVelocity;
                            }
                        }
                        VelocityTracker velocityTracker3 = this.k0;
                        if (velocityTracker3 != null) {
                            velocityTracker3.recycle();
                            this.k0 = null;
                        }
                        a0(false);
                        if (!z10) {
                            if (this.d0) {
                                this.d0 = false;
                                i0(f10);
                            } else {
                                int i10 = this.b0;
                                if (i10 >= 0 && i10 < arrayList.size()) {
                                    k10 = ((qt) arrayList.get(this.b0)).k(this.W, motionEvent);
                                    motionEvent.offsetLocation(rect.left, rect.top);
                                    return k10;
                                }
                            }
                        }
                    }
                    motionEvent.offsetLocation(rect.left, rect.top);
                    return false;
                }
                if (!this.e0) {
                    VelocityTracker velocityTracker4 = this.k0;
                    if (velocityTracker4 != null) {
                        velocityTracker4.addMovement(motionEvent);
                    }
                    float x10 = motionEvent.getX() - this.f0;
                    float y9 = motionEvent.getY() - this.g0;
                    if (this.d0 || Math.abs(y9) <= this.h0 || Math.abs(y9) <= Math.abs(x10)) {
                        if (!this.d0 && Math.abs(x10) > this.h0 && Math.abs(x10) > Math.abs(y9)) {
                            this.d0 = true;
                            int i11 = this.b0;
                            if (i11 >= 0 && i11 < arrayList.size()) {
                                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                                obtain.setAction(3);
                                ((qt) arrayList.get(this.b0)).k(this.W, obtain);
                                obtain.recycle();
                            }
                        }
                        if (!this.d0) {
                            int i12 = this.b0;
                            if (i12 >= 0 && i12 < arrayList.size()) {
                                k10 = ((qt) arrayList.get(this.b0)).k(this.W, motionEvent);
                                motionEvent.offsetLocation(rect.left, rect.top);
                                return k10;
                            }
                            motionEvent.offsetLocation(rect.left, rect.top);
                            return false;
                        }
                        float f11 = (-x10) / this.Z;
                        int i13 = this.b0;
                        if (i13 == 0 && f11 < 0.0f) {
                            f11 *= 0.3f;
                        }
                        if (i13 == arrayList.size() - 1 && f11 > 0.0f) {
                            f11 *= 0.3f;
                        }
                        this.c0 = f11;
                        View view2 = this.W;
                        if (view2 != null) {
                            view2.invalidate();
                        }
                    } else {
                        this.e0 = true;
                        int i14 = this.b0;
                        if (i14 >= 0 && i14 < arrayList.size()) {
                            MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                            obtain2.setAction(3);
                            ((qt) arrayList.get(this.b0)).k(this.W, obtain2);
                            obtain2.recycle();
                        }
                        a0(false);
                    }
                }
            }
            return true;
        } finally {
            motionEvent.offsetLocation(rect.left, rect.top);
        }
    }

    public final void i0(float f10) {
        int i3;
        ArrayList arrayList = this.Y;
        if (f10 >= 0.0f || this.b0 >= arrayList.size() - 1) {
            i3 = -1;
            if (f10 <= 0.0f || this.b0 <= 0) {
                if (this.c0 <= 0.5f || this.b0 >= arrayList.size() - 1) {
                    if (this.c0 >= -0.5f || this.b0 <= 0) {
                        i3 = 0;
                    }
                }
            }
            int i10 = i3 + this.b0;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.c0, i10 - r7);
            this.l0 = ofFloat;
            ofFloat.setDuration(420L);
            this.l0.setInterpolator(org.telegram.ui.Components.xq.h);
            this.l0.addUpdateListener(new g(this, 2));
            this.l0.addListener(new ii.m2(this, i10, 3));
            this.l0.start();
        }
        i3 = 1;
        int i102 = i3 + this.b0;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.c0, i102 - r7);
        this.l0 = ofFloat2;
        ofFloat2.setDuration(420L);
        this.l0.setInterpolator(org.telegram.ui.Components.xq.h);
        this.l0.addUpdateListener(new g(this, 2));
        this.l0.addListener(new ii.m2(this, i102, 3));
        this.l0.start();
    }
}
