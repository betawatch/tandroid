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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class iu extends xt {
    public final TL_iv.pageBlockMath X;
    public final Bitmap Y;
    public final int Z;
    public final int a0;
    public final int b0;
    public final int c0;
    public final int d0;
    public int e0;
    public float f0;
    public int g0;
    public boolean h0;
    public int i0;
    public final Paint j0;
    public int k0;
    public int l0;
    public VelocityTracker m0;
    public OverScroller n0;
    public final mi.b0 o0;

    public iu(cv cvVar, Rect rect, int i3, TL_iv.pageBlockMath pageblockmath) {
        super(cvVar, rect, i3);
        this.j0 = new Paint(3);
        this.o0 = new mi.b0(this, 9);
        this.X = pageblockmath;
        int i10 = this.c;
        this.b0 = i10;
        mi.q a10 = (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) ? null : mi.q.a(pageblockmath.source, g0.L(cvVar.M + 4), false);
        if (a10 != null) {
            this.Y = a10.a;
            this.Z = a10.b;
            this.a0 = a10.c;
        }
        int D = k5.D(0.0f, 2, this.Z);
        this.c0 = D;
        this.d0 = Math.max(0, D - i10);
    }

    @Override // org.telegram.messenger.xt
    public final int I() {
        Rect rect = this.b;
        return k5.D(8.0f, 2, rect.top + this.a0) + rect.bottom;
    }

    @Override // org.telegram.messenger.xt
    public final int J() {
        return K();
    }

    @Override // org.telegram.messenger.xt
    public final int K() {
        Rect rect = this.b;
        return Math.min(this.b0, this.c0) + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.xt
    public final boolean Q() {
        if (this.h0) {
            return true;
        }
        OverScroller overScroller = this.n0;
        return (overScroller == null || overScroller.isFinished()) ? false : true;
    }

    @Override // org.telegram.messenger.xt
    public final void W(Canvas canvas) {
        float f10;
        Canvas canvas2;
        Bitmap bitmap = this.Y;
        if (bitmap == null) {
            return;
        }
        cv cvVar = this.a;
        int w02 = org.telegram.ui.ActionBar.k6.w0(cvVar.E() ? org.telegram.ui.ActionBar.k6.Tc : org.telegram.ui.ActionBar.k6.Sc, cvVar.D);
        Paint paint = this.j0;
        paint.setColor(w02);
        int D = k5.D(8.0f, 2, this.a0);
        int i3 = this.d0;
        Rect rect = this.b;
        if (i3 > 0) {
            f10 = 0.0f;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(-cvVar.S, 0.0f, ((cvVar.C + cvVar.T) - rect.left) - rect.right, D, hs.e4, 31);
            canvas2.save();
            canvas2.translate(g0.L(0.0f) - this.e0, g0.L(8.0f));
        } else {
            f10 = 0.0f;
            canvas2 = canvas;
            canvas2.save();
            canvas2.translate(((cvVar.C / 2.0f) - rect.left) - (this.Z / 2.0f), g0.L(8.0f));
        }
        float f11 = f10;
        canvas2.drawBitmap(bitmap, f11, f11, paint);
        if (i3 > 0) {
            canvas2.restore();
            RectF rectF = g0.P;
            int i10 = cvVar.S;
            float f12 = D;
            rectF.set(-i10, f11, g0.L(12.0f) + (-i10), f12);
            cvVar.z.w(canvas2, rectF, 0, 1.0f);
            rectF.set(r4 - g0.L(12.0f), f11, ((cvVar.C + cvVar.T) - rect.left) - rect.right, f12);
            cvVar.z.w(canvas2, rectF, 2, 1.0f);
        }
        canvas2.restore();
    }

    @Override // org.telegram.messenger.xt
    public final boolean Y(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        View view;
        int i3 = this.d0;
        if (i3 > 0) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (this.i0 == 0 && (view = this.W) != null) {
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
                    this.i0 = viewConfiguration.getScaledTouchSlop();
                    this.k0 = viewConfiguration.getScaledMinimumFlingVelocity();
                    this.l0 = viewConfiguration.getScaledMaximumFlingVelocity();
                }
                if (this.n0 == null && this.W != null) {
                    this.n0 = new OverScroller(this.W.getContext());
                }
                OverScroller overScroller = this.n0;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.n0.forceFinished(true);
                }
                this.f0 = motionEvent.getX();
                this.g0 = this.e0;
                this.h0 = false;
                VelocityTracker velocityTracker2 = this.m0;
                if (velocityTracker2 == null) {
                    this.m0 = VelocityTracker.obtain();
                } else {
                    velocityTracker2.clear();
                }
                this.m0.addMovement(motionEvent);
                return true;
            }
            if (actionMasked == 2) {
                VelocityTracker velocityTracker3 = this.m0;
                if (velocityTracker3 != null) {
                    velocityTracker3.addMovement(motionEvent);
                }
                float x10 = motionEvent.getX() - this.f0;
                if (!this.h0 && Math.abs(x10) > this.i0) {
                    this.h0 = true;
                    a0(true);
                }
                if (this.h0) {
                    int i10 = (int) (this.g0 - x10);
                    int i11 = i10 >= 0 ? i10 : 0;
                    if (i11 <= i3) {
                        i3 = i11;
                    }
                    if (i3 != this.e0) {
                        this.e0 = i3;
                        View view2 = this.W;
                        if (view2 != null) {
                            view2.invalidate();
                            return true;
                        }
                    }
                    return true;
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                boolean z10 = this.h0;
                this.h0 = false;
                if (z10) {
                    a0(false);
                    if (actionMasked == 1 && (velocityTracker = this.m0) != null && this.n0 != null && this.W != null) {
                        velocityTracker.addMovement(motionEvent);
                        this.m0.computeCurrentVelocity(1000, this.l0);
                        float f10 = -this.m0.getXVelocity();
                        if (Math.abs(f10) > this.k0) {
                            this.n0.fling(this.e0, 0, (int) f10, 0, 0, this.d0, 0, 0);
                            this.W.postOnAnimation(this.o0);
                        }
                    }
                }
                VelocityTracker velocityTracker4 = this.m0;
                if (velocityTracker4 != null) {
                    velocityTracker4.recycle();
                    this.m0 = null;
                }
                if (z10 || actionMasked == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.messenger.xt
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        TL_iv.pageBlockMath pageblockmath = this.X;
        if (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) {
            return;
        }
        spannableStringBuilder.append((CharSequence) pageblockmath.source);
    }
}
