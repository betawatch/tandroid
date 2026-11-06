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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class wu extends fu {
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

    public wu(kv kvVar, Rect rect, int i7, TL_iv.pageBlockSlideshow pageblockslideshow, boolean z9) {
        super(kvVar, rect, i7);
        this.X = new ArrayList();
        this.l0 = new Path();
        this.W = z9;
        for (int i10 = 0; i10 < pageblockslideshow.items.size(); i10++) {
            TL_iv.PageBlock pageBlock = pageblockslideshow.items.get(i10);
            yt ytVar = pageBlock instanceof TL_iv.pageBlockPhoto ? new yt(kvVar, (TL_iv.pageBlockPhoto) pageBlock) : pageBlock instanceof TL_iv.pageBlockVideo ? new yt(kvVar, (TL_iv.pageBlockVideo) pageBlock) : null;
            if (ytVar != null) {
                this.X.add(ytVar);
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
        int i11 = 0;
        float f10 = 0.0f;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            float f11 = ((yt) obj).E;
            if (f11 <= 0.0f) {
                f11 = 1.0f;
            }
            f10 += f11;
        }
        int max = (int) (this.Y / Math.max(0.5f, f10 / arrayList.size()));
        Point point = g0.q;
        int max2 = (int) (Math.max(point.x, point.y) * 0.55f);
        this.Z = max > max2 ? max2 : max;
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList.get(i12);
            i12++;
            ((yt) obj2).l(0, 0, this.Y, this.Z);
        }
    }

    @Override // org.telegram.messenger.fu
    public final void A(int i7, Rect rect) {
        Rect rect2 = this.b;
        int i10 = rect2.left;
        int i11 = ((int) this.M) + rect2.top;
        rect.set(i10, i11, this.Y + i10, this.Z + i11);
    }

    @Override // org.telegram.messenger.fu
    public final int B() {
        return !this.X.isEmpty() ? 1 : 0;
    }

    @Override // org.telegram.messenger.fu
    public final CharSequence E(int i7) {
        ArrayList arrayList = this.X;
        if (arrayList.isEmpty()) {
            return null;
        }
        int max = Math.max(0, Math.min(this.a0, arrayList.size() - 1));
        return TextUtils.concat(((yt) arrayList.get(max)).f(), ", ", hd.a0(null, null, 2131747828, Integer.valueOf(max + 1), Integer.valueOf(arrayList.size())));
    }

    @Override // org.telegram.messenger.fu
    public final int I() {
        return this.Z;
    }

    @Override // org.telegram.messenger.fu
    public final int J() {
        return K();
    }

    @Override // org.telegram.messenger.fu
    public final int K() {
        Rect rect = this.b;
        return rect.left + this.c + rect.right;
    }

    @Override // org.telegram.messenger.fu
    public final boolean Q() {
        if (this.c0) {
            return true;
        }
        ValueAnimator valueAnimator = this.k0;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    @Override // org.telegram.messenger.fu
    public final void T() {
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            yt ytVar = (yt) obj;
            View view = this.V;
            ytVar.S = view;
            ImageReceiver imageReceiver = ytVar.c;
            imageReceiver.H0(view);
            imageReceiver.P();
            ImageReceiver imageReceiver2 = ytVar.d;
            imageReceiver2.H0(view);
            imageReceiver2.P();
            ytVar.d(view);
            ytVar.m(view, false);
        }
    }

    @Override // org.telegram.messenger.fu
    public final boolean U(int i7, View view) {
        ArrayList arrayList = this.X;
        if (arrayList.isEmpty()) {
            return false;
        }
        return ((yt) arrayList.get(Math.max(0, Math.min(this.a0, arrayList.size() - 1)))).j(view);
    }

    @Override // org.telegram.messenger.fu
    public final void V() {
        int i7 = 0;
        a0(false);
        this.c0 = false;
        this.d0 = false;
        VelocityTracker velocityTracker = this.j0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.j0 = null;
        }
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            yt ytVar = (yt) obj;
            ytVar.c.R();
            ytVar.d.R();
            ytVar.e = null;
            z5.q(ytVar.a.a).v(ytVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0176  */
    @Override // org.telegram.messenger.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W(Canvas canvas) {
        float f10;
        float f11;
        int i7;
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
        yt ytVar;
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
        boolean R = R();
        int L2 = g0.L(2.0f);
        kv kvVar = this.a;
        int i20 = (R || kvVar.D()) ? 0 : kvVar.S - L2;
        int i21 = (R || kvVar.D()) ? 0 : kvVar.T - L2;
        int i22 = this.Y;
        int i23 = i22 + i20 + i21;
        canvas2.save();
        int i24 = this.Z;
        Path path = this.l0;
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
            if (!kvVar.D()) {
                if (this.W) {
                    int i25 = iz.Y0;
                    int L3 = i25 > 2 ? g0.L(i25 - 2) : g0.L(i25);
                    i11 = Math.min(g0.L(3.0f), L3);
                    i12 = ((kvVar.E() || !kvVar.G()) && !kvVar.B()) ? L3 : i11;
                    if ((kvVar.E() && kvVar.G()) || kvVar.B()) {
                        L3 = i11;
                    }
                    float f14 = i12;
                    i7 = 1;
                    float f15 = L3;
                    float f16 = i11;
                    i13 = L3;
                    path.rewind();
                    path.addRoundRect(-i20, 0.0f, i22 + i21, i24, new float[]{f14, f14, f15, f15, f16, f16, f16, f16}, Path.Direction.CW);
                    canvas2.clipPath(path);
                    i10 = i11;
                } else {
                    i7 = 1;
                    canvas2.clipRect(-i20, 0, kvVar.C + i21, i24);
                    i10 = 0;
                    i11 = 0;
                    i12 = 0;
                    i13 = 0;
                }
                i14 = this.a0;
                float f17 = 0.0f;
                if ((i14 == 0 && this.b0 < 0.0f) || (i14 == arrayList2.size() - 1 && this.b0 > 0.0f)) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.k6.r1(0.2f, org.telegram.ui.ActionBar.k6.w0(kvVar.E() ? org.telegram.ui.ActionBar.k6.Qb : org.telegram.ui.ActionBar.k6.Kd, kvVar.D)));
                }
                float f18 = i23;
                float f19 = (-this.b0) * f18;
                i15 = this.a0 - 1;
                while (i15 <= this.a0 + 1) {
                    if (i15 < 0 || i15 >= arrayList2.size()) {
                        arrayList = arrayList2;
                        i18 = i10;
                        i19 = i15;
                        f12 = f18;
                    } else {
                        yt ytVar2 = (yt) arrayList2.get(i15);
                        canvas2.save();
                        canvas2.translate(((i15 - this.a0) * i23) + f19, f17);
                        ImageReceiver imageReceiver = ytVar2.c;
                        ImageReceiver imageReceiver2 = ytVar2.c;
                        int i26 = i15 == 0 ? i12 : 0;
                        int i27 = i15 == arrayList2.size() + (-1) ? i13 : 0;
                        arrayList = arrayList2;
                        int i28 = i15 == arrayList2.size() + (-1) ? i11 : 0;
                        i18 = i10;
                        if (i15 != 0) {
                            i10 = 0;
                        }
                        imageReceiver.K0(i26, i27, i28, i10);
                        ytVar2.d.K0(i15 == 0 ? i12 : 0, i15 == arrayList.size() + (-1) ? i13 : 0, i15 == arrayList.size() + (-1) ? i11 : 0, i15 == 0 ? i18 : 0);
                        float f20 = -i20;
                        imageReceiver2.y0(f20, 0.0f, f18, i24);
                        if (imageReceiver2.I() && imageReceiver2.h1 == 1.0f) {
                            canvas2 = canvas;
                            i19 = i15;
                            f12 = f18;
                            ytVar = ytVar2;
                        } else {
                            f12 = f18;
                            ytVar = ytVar2;
                            i19 = i15;
                            canvas2 = canvas;
                            canvas2.drawRect(f20, 0.0f, i23 + i21, i24, n0);
                        }
                        ytVar.c(canvas2);
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
                i16 = i7;
                if (size > i16) {
                    if (m0 == null) {
                        Paint paint2 = new Paint(i16);
                        m0 = paint2;
                        paint2.setColor(-1);
                        m0.setShadowLayer(g0.N(f11), 0.0f, g0.N(1.0f), TLObject.FLAG_31);
                    }
                    float L4 = g0.L(5.0f) + (i24 - g0.L(23.0f));
                    int L5 = g0.L(4.0f) + k5.D(6.0f, size - 1, g0.L(7.0f) * size);
                    float f21 = this.a0 + this.b0;
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
                        m0.setAlpha((int) ((max * 95.0f) + 160.0f));
                        canvas2.drawCircle(g0.L(4.0f) + i17 + (g0.L(13.0f) * i29), L4, (g0.L(1.0f) * max) + g0.L(f10), m0);
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
        i7 = 1;
        i10 = i13;
        i14 = this.a0;
        float f172 = 0.0f;
        if (i14 == 0) {
            canvas2.drawColor(org.telegram.ui.ActionBar.k6.r1(0.2f, org.telegram.ui.ActionBar.k6.w0(kvVar.E() ? org.telegram.ui.ActionBar.k6.Qb : org.telegram.ui.ActionBar.k6.Kd, kvVar.D)));
            float f182 = i23;
            float f192 = (-this.b0) * f182;
            i15 = this.a0 - 1;
            while (i15 <= this.a0 + 1) {
            }
            canvas2.restore();
            size = arrayList2.size();
            i16 = i7;
            if (size > i16) {
            }
        }
        canvas2.drawColor(org.telegram.ui.ActionBar.k6.r1(0.2f, org.telegram.ui.ActionBar.k6.w0(kvVar.E() ? org.telegram.ui.ActionBar.k6.Qb : org.telegram.ui.ActionBar.k6.Kd, kvVar.D)));
        float f1822 = i23;
        float f1922 = (-this.b0) * f1822;
        i15 = this.a0 - 1;
        while (i15 <= this.a0 + 1) {
        }
        canvas2.restore();
        size = arrayList2.size();
        i16 = i7;
        if (size > i16) {
        }
    }

    @Override // org.telegram.messenger.fu
    public final boolean Y(MotionEvent motionEvent) {
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
                a0(true);
                ValueAnimator valueAnimator = this.k0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.k0 = null;
                }
                int i7 = this.a0;
                if (i7 >= 0 && i7 < arrayList.size()) {
                    ((yt) arrayList.get(this.a0)).k(this.V, motionEvent);
                }
            } else {
                float f10 = 0.0f;
                if (actionMasked != 2) {
                    if (actionMasked == 1 || actionMasked == 3) {
                        boolean z9 = this.d0;
                        this.d0 = false;
                        if (!z9 && actionMasked == 1 && (velocityTracker = this.j0) != null) {
                            velocityTracker.addMovement(motionEvent);
                            this.j0.computeCurrentVelocity(1000, this.i0);
                            float xVelocity = this.j0.getXVelocity();
                            float yVelocity = this.j0.getYVelocity();
                            if (Math.abs(xVelocity) >= this.h0 && Math.abs(xVelocity) > Math.abs(yVelocity)) {
                                f10 = xVelocity;
                            }
                        }
                        VelocityTracker velocityTracker3 = this.j0;
                        if (velocityTracker3 != null) {
                            velocityTracker3.recycle();
                            this.j0 = null;
                        }
                        a0(false);
                        if (!z9) {
                            if (this.c0) {
                                this.c0 = false;
                                i0(f10);
                            } else {
                                int i10 = this.a0;
                                if (i10 >= 0 && i10 < arrayList.size()) {
                                    k10 = ((yt) arrayList.get(this.a0)).k(this.V, motionEvent);
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
                    float y10 = motionEvent.getY() - this.f0;
                    if (this.c0 || Math.abs(y10) <= this.g0 || Math.abs(y10) <= Math.abs(x10)) {
                        if (!this.c0 && Math.abs(x10) > this.g0 && Math.abs(x10) > Math.abs(y10)) {
                            this.c0 = true;
                            int i11 = this.a0;
                            if (i11 >= 0 && i11 < arrayList.size()) {
                                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                                obtain.setAction(3);
                                ((yt) arrayList.get(this.a0)).k(this.V, obtain);
                                obtain.recycle();
                            }
                        }
                        if (!this.c0) {
                            int i12 = this.a0;
                            if (i12 >= 0 && i12 < arrayList.size()) {
                                k10 = ((yt) arrayList.get(this.a0)).k(this.V, motionEvent);
                                motionEvent.offsetLocation(rect.left, rect.top);
                                return k10;
                            }
                            motionEvent.offsetLocation(rect.left, rect.top);
                            return false;
                        }
                        float f11 = (-x10) / this.Y;
                        int i13 = this.a0;
                        if (i13 == 0 && f11 < 0.0f) {
                            f11 *= 0.3f;
                        }
                        if (i13 == arrayList.size() - 1 && f11 > 0.0f) {
                            f11 *= 0.3f;
                        }
                        this.b0 = f11;
                        View view2 = this.V;
                        if (view2 != null) {
                            view2.invalidate();
                        }
                    } else {
                        this.d0 = true;
                        int i14 = this.a0;
                        if (i14 >= 0 && i14 < arrayList.size()) {
                            MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                            obtain2.setAction(3);
                            ((yt) arrayList.get(this.a0)).k(this.V, obtain2);
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
        int i7;
        ArrayList arrayList = this.X;
        if (f10 >= 0.0f || this.a0 >= arrayList.size() - 1) {
            i7 = -1;
            if (f10 <= 0.0f || this.a0 <= 0) {
                if (this.b0 <= 0.5f || this.a0 >= arrayList.size() - 1) {
                    if (this.b0 >= -0.5f || this.a0 <= 0) {
                        i7 = 0;
                    }
                }
            }
            int i10 = i7 + this.a0;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b0, i10 - r7);
            this.k0 = ofFloat;
            ofFloat.setDuration(420L);
            this.k0.setInterpolator(org.telegram.ui.Components.xq.h);
            this.k0.addUpdateListener(new g(this, 2));
            this.k0.addListener(new hi.m2(this, i10, 3));
            this.k0.start();
        }
        i7 = 1;
        int i102 = i7 + this.a0;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.b0, i102 - r7);
        this.k0 = ofFloat2;
        ofFloat2.setDuration(420L);
        this.k0.setInterpolator(org.telegram.ui.Components.xq.h);
        this.k0.addUpdateListener(new g(this, 2));
        this.k0.addListener(new hi.m2(this, i102, 3));
        this.k0.start();
    }
}
