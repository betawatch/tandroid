package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class bv extends qu {
    public final TL_iv.pageBlockMath W;
    public final Bitmap X;
    public final int Y;
    public final int Z;
    public final int a0;
    public final int b0;
    public final int c0;
    public int d0;
    public float e0;
    public int f0;
    public boolean g0;
    public int h0;
    public final Paint i0;
    public int j0;
    public int k0;
    public VelocityTracker l0;
    public OverScroller m0;
    public final mg.c2 n0;

    public bv(vv vvVar, Rect rect, int i10, TL_iv.pageBlockMath pageblockmath) {
        super(vvVar, rect, i10);
        this.i0 = new Paint(3);
        this.n0 = new mg.c2(this, 8);
        this.W = pageblockmath;
        int i11 = this.c;
        this.a0 = i11;
        bi.u a2 = (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) ? null : bi.u.a(pageblockmath.source, i0.L(vvVar.M + 4), false);
        if (a2 != null) {
            this.X = a2.a;
            this.Y = a2.b;
            this.Z = a2.c;
        }
        int D = m5.D(0.0f, 2, this.Y);
        this.b0 = D;
        this.c0 = Math.max(0, D - i11);
    }

    @Override // org.telegram.messenger.qu
    public final int H() {
        Rect rect = this.b;
        return m5.D(8.0f, 2, rect.top + this.Z) + rect.bottom;
    }

    @Override // org.telegram.messenger.qu
    public final int I() {
        return J();
    }

    @Override // org.telegram.messenger.qu
    public final int J() {
        Rect rect = this.b;
        return Math.min(this.a0, this.b0) + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.qu
    public final boolean P() {
        if (this.g0) {
            return true;
        }
        OverScroller overScroller = this.m0;
        return (overScroller == null || overScroller.isFinished()) ? false : true;
    }

    @Override // org.telegram.messenger.qu
    public final void V(Canvas canvas) {
        float f7;
        Canvas canvas2;
        Bitmap bitmap = this.X;
        if (bitmap == null) {
            return;
        }
        vv vvVar = this.a;
        int w02 = org.telegram.ui.ActionBar.t6.w0(vvVar.E() ? org.telegram.ui.ActionBar.t6.Tc : org.telegram.ui.ActionBar.t6.Sc, vvVar.D);
        Paint paint = this.i0;
        paint.setColor(w02);
        int D = m5.D(8.0f, 2, this.Z);
        int i10 = this.c0;
        Rect rect = this.b;
        if (i10 > 0) {
            f7 = 0.0f;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(-vvVar.S, 0.0f, ((vvVar.C + vvVar.T) - rect.left) - rect.right, D, zs.e4, 31);
            canvas2.save();
            canvas2.translate(i0.L(0.0f) - this.d0, i0.L(8.0f));
        } else {
            f7 = 0.0f;
            canvas2 = canvas;
            canvas2.save();
            canvas2.translate(((vvVar.C / 2.0f) - rect.left) - (this.Y / 2.0f), i0.L(8.0f));
        }
        float f10 = f7;
        canvas2.drawBitmap(bitmap, f10, f10, paint);
        if (i10 > 0) {
            canvas2.restore();
            RectF rectF = i0.P;
            int i11 = vvVar.S;
            float f11 = D;
            rectF.set(-i11, f10, i0.L(12.0f) + (-i11), f11);
            vvVar.z.o(canvas2, rectF, 0, 1.0f);
            rectF.set(r4 - i0.L(12.0f), f10, ((vvVar.C + vvVar.T) - rect.left) - rect.right, f11);
            vvVar.z.o(canvas2, rectF, 2, 1.0f);
        }
        canvas2.restore();
    }

    @Override // org.telegram.messenger.qu
    public final boolean X(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        View view;
        int i10 = this.c0;
        if (i10 > 0) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (this.h0 == 0 && (view = this.V) != null) {
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
                    this.h0 = viewConfiguration.getScaledTouchSlop();
                    this.j0 = viewConfiguration.getScaledMinimumFlingVelocity();
                    this.k0 = viewConfiguration.getScaledMaximumFlingVelocity();
                }
                if (this.m0 == null && this.V != null) {
                    this.m0 = new OverScroller(this.V.getContext());
                }
                OverScroller overScroller = this.m0;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.m0.forceFinished(true);
                }
                this.e0 = motionEvent.getX();
                this.f0 = this.d0;
                this.g0 = false;
                VelocityTracker velocityTracker2 = this.l0;
                if (velocityTracker2 == null) {
                    this.l0 = VelocityTracker.obtain();
                } else {
                    velocityTracker2.clear();
                }
                this.l0.addMovement(motionEvent);
                return true;
            }
            if (actionMasked == 2) {
                VelocityTracker velocityTracker3 = this.l0;
                if (velocityTracker3 != null) {
                    velocityTracker3.addMovement(motionEvent);
                }
                float x10 = motionEvent.getX() - this.e0;
                if (!this.g0 && Math.abs(x10) > this.h0) {
                    this.g0 = true;
                    Z(true);
                }
                if (this.g0) {
                    int i11 = (int) (this.f0 - x10);
                    int i12 = i11 >= 0 ? i11 : 0;
                    if (i12 <= i10) {
                        i10 = i12;
                    }
                    if (i10 != this.d0) {
                        this.d0 = i10;
                        View view2 = this.V;
                        if (view2 != null) {
                            view2.invalidate();
                            return true;
                        }
                    }
                    return true;
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                boolean z10 = this.g0;
                this.g0 = false;
                if (z10) {
                    Z(false);
                    if (actionMasked == 1 && (velocityTracker = this.l0) != null && this.m0 != null && this.V != null) {
                        velocityTracker.addMovement(motionEvent);
                        this.l0.computeCurrentVelocity(1000, this.k0);
                        float f7 = -this.l0.getXVelocity();
                        if (Math.abs(f7) > this.j0) {
                            this.m0.fling(this.d0, 0, (int) f7, 0, 0, this.c0, 0, 0);
                            this.V.postOnAnimation(this.n0);
                        }
                    }
                }
                VelocityTracker velocityTracker4 = this.l0;
                if (velocityTracker4 != null) {
                    velocityTracker4.recycle();
                    this.l0 = null;
                }
                if (z10 || actionMasked == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.messenger.qu
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        TL_iv.pageBlockMath pageblockmath = this.W;
        if (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) {
            return;
        }
        spannableStringBuilder.append((CharSequence) pageblockmath.source);
    }
}
