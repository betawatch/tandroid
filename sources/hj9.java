// default package

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
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class hj9 extends qi9 {
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

    public hj9(uj9 uj9Var, Rect rect, int i, TL_iv.pageBlockSlideshow pageblockslideshow, boolean z) {
        super(uj9Var, rect, i);
        this.Y = new ArrayList();
        this.m0 = new Path();
        this.X = z;
        for (int i2 = 0; i2 < pageblockslideshow.items.size(); i2++) {
            TL_iv.PageBlock pageBlock = pageblockslideshow.items.get(i2);
            ki9 ki9Var = pageBlock instanceof TL_iv.pageBlockPhoto ? new ki9(uj9Var, (TL_iv.pageBlockPhoto) pageBlock) : pageBlock instanceof TL_iv.pageBlockVideo ? new ki9(uj9Var, (TL_iv.pageBlockVideo) pageBlock) : null;
            if (ki9Var != null) {
                this.Y.add(ki9Var);
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
        int i3 = 0;
        float f = 0.0f;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            float f2 = ((ki9) obj).F;
            if (f2 <= 0.0f) {
                f2 = 1.0f;
            }
            f += f2;
        }
        int max = (int) (this.Z / Math.max(0.5f, f / arrayList.size()));
        Point point = gm.q;
        int max2 = (int) (Math.max(point.x, point.y) * 0.55f);
        this.a0 = max > max2 ? max2 : max;
        int size2 = arrayList.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList.get(i4);
            i4++;
            ((ki9) obj2).m(0, 0, this.Z, this.a0);
        }
    }

    @Override // qi9
    public final int B() {
        return !this.Y.isEmpty() ? 1 : 0;
    }

    @Override // qi9
    public final CharSequence D(int i) {
        ArrayList arrayList = this.Y;
        if (arrayList.isEmpty()) {
            return null;
        }
        int max = Math.max(0, Math.min(this.b0, arrayList.size() - 1));
        return TextUtils.concat(((ki9) arrayList.get(max)).f(), ", ", jb6.a0(null, null, 2131747562, Integer.valueOf(max + 1), Integer.valueOf(arrayList.size())));
    }

    @Override // qi9
    public final int H() {
        return this.a0;
    }

    @Override // qi9
    public final int I() {
        return J();
    }

    @Override // qi9
    public final int J() {
        Rect rect = this.b;
        return rect.left + this.c + rect.right;
    }

    @Override // qi9
    public final boolean P() {
        if (this.d0) {
            return true;
        }
        ValueAnimator valueAnimator = this.l0;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    @Override // qi9
    public final void S() {
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ki9 ki9Var = (ki9) obj;
            View view = this.W;
            ki9Var.T = view;
            ImageReceiver imageReceiver = ki9Var.c;
            imageReceiver.p0(view);
            imageReceiver.I();
            ImageReceiver imageReceiver2 = ki9Var.d;
            imageReceiver2.p0(view);
            imageReceiver2.I();
            ki9Var.d(view);
            ki9Var.n(view, false);
        }
    }

    @Override // qi9
    public final boolean T(int i, View view) {
        ArrayList arrayList = this.Y;
        if (arrayList.isEmpty()) {
            return false;
        }
        return ((ki9) arrayList.get(Math.max(0, Math.min(this.b0, arrayList.size() - 1)))).j(view);
    }

    @Override // qi9
    public final void U() {
        int i = 0;
        Z(false);
        this.d0 = false;
        this.e0 = false;
        VelocityTracker velocityTracker = this.k0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.k0 = null;
        }
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ki9 ki9Var = (ki9) obj;
            ki9Var.c.K();
            ki9Var.d.K();
            ki9Var.e = null;
            er3.q(ki9Var.a.a).v(ki9Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0172  */
    @Override // qi9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V(Canvas canvas) {
        float f;
        float f2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int L;
        int i6;
        int i7;
        int size;
        int i8;
        float i9;
        int i10;
        ArrayList arrayList;
        float f3;
        ki9 ki9Var;
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
        boolean Q = Q();
        int L2 = gm.L(2.0f);
        uj9 uj9Var = this.a;
        int i11 = (Q || uj9Var.C()) ? 0 : uj9Var.S - L2;
        int i12 = (Q || uj9Var.C()) ? 0 : uj9Var.T - L2;
        int i13 = this.Z;
        int i14 = i13 + i11 + i12;
        canvas2.save();
        int i15 = this.a0;
        Path path = this.m0;
        if (Q) {
            L = gm.L(8.0f);
            path.rewind();
            f = 2.0f;
            f2 = 3.0f;
            float f4 = L;
            path.addRoundRect(0.0f, 0.0f, i13, i15, f4, f4, Path.Direction.CW);
            canvas2.clipPath(path);
        } else {
            f = 2.0f;
            f2 = 3.0f;
            if (!uj9Var.C()) {
                if (this.X) {
                    int i16 = gda.U0;
                    int L3 = i16 > 2 ? gm.L(i16 - 2) : gm.L(i16);
                    i3 = Math.min(gm.L(3.0f), L3);
                    i4 = ((uj9Var.D() || !uj9Var.F()) && !uj9Var.A()) ? L3 : i3;
                    if ((uj9Var.D() && uj9Var.F()) || uj9Var.A()) {
                        L3 = i3;
                    }
                    float f5 = i4;
                    i = 1;
                    float f6 = L3;
                    float f7 = i3;
                    i5 = L3;
                    path.rewind();
                    path.addRoundRect(-i11, 0.0f, i13 + i12, i15, new float[]{f5, f5, f6, f6, f7, f7, f7, f7}, Path.Direction.CW);
                    canvas2.clipPath(path);
                    i2 = i3;
                } else {
                    i = 1;
                    canvas2.clipRect(-i11, 0, uj9Var.C + i12, i15);
                    i2 = 0;
                    i3 = 0;
                    i4 = 0;
                    i5 = 0;
                }
                i6 = this.b0;
                float f8 = 0.0f;
                if ((i6 == 0 && this.c0 < 0.0f) || (i6 == arrayList2.size() - 1 && this.c0 > 0.0f)) {
                    canvas2.drawColor(cmb.p1(0.2f, cmb.v0(uj9Var.D() ? cmb.Sb : cmb.Md, uj9Var.D)));
                }
                float f9 = i14;
                float f10 = (-this.c0) * f9;
                i7 = this.b0 - 1;
                while (i7 <= this.b0 + 1) {
                    if (i7 < 0 || i7 >= arrayList2.size()) {
                        i10 = i7;
                        arrayList = arrayList2;
                        f3 = f9;
                    } else {
                        ki9 ki9Var2 = (ki9) arrayList2.get(i7);
                        canvas2.save();
                        canvas2.translate(((i7 - this.b0) * i14) + f10, f8);
                        ImageReceiver imageReceiver = ki9Var2.c;
                        arrayList = arrayList2;
                        imageReceiver.r0(i7 == 0 ? i4 : 0, i7 == arrayList2.size() + (-1) ? i5 : 0, i7 == arrayList2.size() + (-1) ? i3 : 0, i7 == 0 ? i2 : 0);
                        i10 = i7;
                        ki9Var2.d.r0(i7 == 0 ? i4 : 0, i7 == arrayList.size() + (-1) ? i5 : 0, i7 == arrayList.size() + (-1) ? i3 : 0, i7 == 0 ? i2 : 0);
                        float f11 = -i11;
                        imageReceiver.i0(f11, 0.0f, f9, i15);
                        if (imageReceiver.B() && imageReceiver.i1 == 1.0f) {
                            canvas2 = canvas;
                            f3 = f9;
                            ki9Var = ki9Var2;
                        } else {
                            f3 = f9;
                            ki9Var = ki9Var2;
                            canvas2 = canvas;
                            canvas2.drawRect(f11, 0.0f, i14 + i12, i15, o0);
                        }
                        ki9Var.c(canvas2);
                        canvas2.restore();
                    }
                    i7 = i10 + 1;
                    f9 = f3;
                    arrayList2 = arrayList;
                    f8 = 0.0f;
                }
                canvas2.restore();
                size = arrayList2.size();
                i8 = i;
                if (size > i8) {
                    if (n0 == null) {
                        Paint paint2 = new Paint(i8);
                        n0 = paint2;
                        paint2.setColor(-1);
                        n0.setShadowLayer(gm.N(f2), 0.0f, gm.N(1.0f), TLObject.FLAG_31);
                    }
                    float L4 = gm.L(5.0f) + (i15 - gm.L(23.0f));
                    int L5 = gm.L(4.0f) + hg9.y(6.0f, size - 1, gm.L(7.0f) * size);
                    float f12 = this.b0 + this.c0;
                    if (L5 < i14) {
                        i9 = (i14 - L5) / f;
                    } else {
                        float L6 = gm.L(4.0f);
                        int L7 = gm.L(13.0f);
                        i9 = L6 - (Utilities.i(f12 - (((i14 - gm.L(8.0f)) / 2) / L7), Math.max(0, (size - (r9 << 1)) - 1), 0.0f) * L7);
                    }
                    canvas2.save();
                    canvas2.clipRect(0, i15 - gm.L(23.0f), i14, i15);
                    for (int i17 = 0; i17 < size; i17++) {
                        float max = Math.max(0.0f, 1.0f - Math.abs(i17 - f12));
                        n0.setAlpha((int) ((max * 95.0f) + 160.0f));
                        canvas2.drawCircle(gm.L(4.0f) + i9 + (gm.L(13.0f) * i17), L4, (gm.L(1.0f) * max) + gm.L(f), n0);
                    }
                    canvas2.restore();
                    return;
                }
                return;
            }
            L = gm.L(12.0f);
            path.rewind();
            float f13 = L;
            path.addRoundRect(0.0f, 0.0f, i13, i15, f13, f13, Path.Direction.CW);
            canvas2.clipPath(path);
        }
        i3 = L;
        i4 = i3;
        i5 = i4;
        i = 1;
        i2 = i5;
        i6 = this.b0;
        float f82 = 0.0f;
        if (i6 == 0) {
            canvas2.drawColor(cmb.p1(0.2f, cmb.v0(uj9Var.D() ? cmb.Sb : cmb.Md, uj9Var.D)));
            float f92 = i14;
            float f102 = (-this.c0) * f92;
            i7 = this.b0 - 1;
            while (i7 <= this.b0 + 1) {
            }
            canvas2.restore();
            size = arrayList2.size();
            i8 = i;
            if (size > i8) {
            }
        }
        canvas2.drawColor(cmb.p1(0.2f, cmb.v0(uj9Var.D() ? cmb.Sb : cmb.Md, uj9Var.D)));
        float f922 = i14;
        float f1022 = (-this.c0) * f922;
        i7 = this.b0 - 1;
        while (i7 <= this.b0 + 1) {
        }
        canvas2.restore();
        size = arrayList2.size();
        i8 = i;
        if (size > i8) {
        }
    }

    @Override // qi9
    public final boolean X(MotionEvent motionEvent) {
        boolean k;
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
                Z(true);
                ValueAnimator valueAnimator = this.l0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.l0 = null;
                }
                int i = this.b0;
                if (i >= 0 && i < arrayList.size()) {
                    ((ki9) arrayList.get(this.b0)).k(this.W, motionEvent);
                }
            } else {
                float f = 0.0f;
                if (actionMasked != 2) {
                    if (actionMasked == 1 || actionMasked == 3) {
                        boolean z = this.e0;
                        this.e0 = false;
                        if (!z && actionMasked == 1 && (velocityTracker = this.k0) != null) {
                            velocityTracker.addMovement(motionEvent);
                            this.k0.computeCurrentVelocity(1000, this.j0);
                            float xVelocity = this.k0.getXVelocity();
                            float yVelocity = this.k0.getYVelocity();
                            if (Math.abs(xVelocity) >= this.i0 && Math.abs(xVelocity) > Math.abs(yVelocity)) {
                                f = xVelocity;
                            }
                        }
                        VelocityTracker velocityTracker3 = this.k0;
                        if (velocityTracker3 != null) {
                            velocityTracker3.recycle();
                            this.k0 = null;
                        }
                        Z(false);
                        if (!z) {
                            if (this.d0) {
                                this.d0 = false;
                                h0(f);
                            } else {
                                int i2 = this.b0;
                                if (i2 >= 0 && i2 < arrayList.size()) {
                                    k = ((ki9) arrayList.get(this.b0)).k(this.W, motionEvent);
                                    return k;
                                }
                            }
                        }
                    }
                    return false;
                }
                if (!this.e0) {
                    VelocityTracker velocityTracker4 = this.k0;
                    if (velocityTracker4 != null) {
                        velocityTracker4.addMovement(motionEvent);
                    }
                    float x = motionEvent.getX() - this.f0;
                    float y = motionEvent.getY() - this.g0;
                    if (this.d0 || Math.abs(y) <= this.h0 || Math.abs(y) <= Math.abs(x)) {
                        if (!this.d0 && Math.abs(x) > this.h0 && Math.abs(x) > Math.abs(y)) {
                            this.d0 = true;
                            int i3 = this.b0;
                            if (i3 >= 0 && i3 < arrayList.size()) {
                                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                                obtain.setAction(3);
                                ((ki9) arrayList.get(this.b0)).k(this.W, obtain);
                                obtain.recycle();
                            }
                        }
                        if (!this.d0) {
                            int i4 = this.b0;
                            if (i4 >= 0 && i4 < arrayList.size()) {
                                k = ((ki9) arrayList.get(this.b0)).k(this.W, motionEvent);
                                return k;
                            }
                            return false;
                        }
                        float f2 = (-x) / this.Z;
                        int i5 = this.b0;
                        if (i5 == 0 && f2 < 0.0f) {
                            f2 *= 0.3f;
                        }
                        if (i5 == arrayList.size() - 1 && f2 > 0.0f) {
                            f2 *= 0.3f;
                        }
                        this.c0 = f2;
                        View view2 = this.W;
                        if (view2 != null) {
                            view2.invalidate();
                        }
                    } else {
                        this.e0 = true;
                        int i6 = this.b0;
                        if (i6 >= 0 && i6 < arrayList.size()) {
                            MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                            obtain2.setAction(3);
                            ((ki9) arrayList.get(this.b0)).k(this.W, obtain2);
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

    public final void h0(float f) {
        int i;
        ArrayList arrayList = this.Y;
        if (f >= 0.0f || this.b0 >= arrayList.size() - 1) {
            i = -1;
            if (f <= 0.0f || this.b0 <= 0) {
                if (this.c0 <= 0.5f || this.b0 >= arrayList.size() - 1) {
                    if (this.c0 >= -0.5f || this.b0 <= 0) {
                        i = 0;
                    }
                }
            }
            int i2 = i + this.b0;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.c0, i2 - r7);
            this.l0 = ofFloat;
            ofFloat.setDuration(420L);
            this.l0.setInterpolator(d53.h);
            this.l0.addUpdateListener(new p29(this, (byte) 5));
            this.l0.addListener(new co(this, i2, (byte) 11));
            this.l0.start();
        }
        i = 1;
        int i22 = i + this.b0;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.c0, i22 - r7);
        this.l0 = ofFloat2;
        ofFloat2.setDuration(420L);
        this.l0.setInterpolator(d53.h);
        this.l0.addUpdateListener(new p29(this, (byte) 5));
        this.l0.addListener(new co(this, i22, (byte) 11));
        this.l0.start();
    }

    @Override // qi9
    public final void z(int i, Rect rect) {
        Rect rect2 = this.b;
        int i2 = rect2.left;
        int i3 = ((int) this.N) + rect2.top;
        rect.set(i2, i3, this.Z + i2, this.a0 + i3);
    }
}
