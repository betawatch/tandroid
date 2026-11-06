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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class qu extends fu {
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
    public final m.f3 n0;

    public qu(kv kvVar, Rect rect, int i7, TL_iv.pageBlockMath pageblockmath) {
        super(kvVar, rect, i7);
        this.i0 = new Paint(3);
        this.n0 = new m.f3(this, 10);
        this.W = pageblockmath;
        int i10 = this.c;
        this.a0 = i10;
        li.q a10 = (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) ? null : li.q.a(pageblockmath.source, g0.L(kvVar.M + 4), false);
        if (a10 != null) {
            this.X = a10.a;
            this.Y = a10.b;
            this.Z = a10.c;
        }
        int D = k5.D(0.0f, 2, this.Y);
        this.b0 = D;
        this.c0 = Math.max(0, D - i10);
    }

    @Override // org.telegram.messenger.fu
    public final int I() {
        Rect rect = this.b;
        return k5.D(8.0f, 2, rect.top + this.Z) + rect.bottom;
    }

    @Override // org.telegram.messenger.fu
    public final int J() {
        return K();
    }

    @Override // org.telegram.messenger.fu
    public final int K() {
        Rect rect = this.b;
        return Math.min(this.a0, this.b0) + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.fu
    public final boolean Q() {
        if (this.g0) {
            return true;
        }
        OverScroller overScroller = this.m0;
        return (overScroller == null || overScroller.isFinished()) ? false : true;
    }

    @Override // org.telegram.messenger.fu
    public final void W(Canvas canvas) {
        float f10;
        Canvas canvas2;
        Bitmap bitmap = this.X;
        if (bitmap == null) {
            return;
        }
        kv kvVar = this.a;
        int w02 = org.telegram.ui.ActionBar.k6.w0(kvVar.E() ? org.telegram.ui.ActionBar.k6.Tc : org.telegram.ui.ActionBar.k6.Sc, kvVar.D);
        Paint paint = this.i0;
        paint.setColor(w02);
        int D = k5.D(8.0f, 2, this.Z);
        int i7 = this.c0;
        Rect rect = this.b;
        if (i7 > 0) {
            f10 = 0.0f;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(-kvVar.S, 0.0f, ((kvVar.C + kvVar.T) - rect.left) - rect.right, D, qs.e4, 31);
            canvas2.save();
            canvas2.translate(g0.L(0.0f) - this.d0, g0.L(8.0f));
        } else {
            f10 = 0.0f;
            canvas2 = canvas;
            canvas2.save();
            canvas2.translate(((kvVar.C / 2.0f) - rect.left) - (this.Y / 2.0f), g0.L(8.0f));
        }
        float f11 = f10;
        canvas2.drawBitmap(bitmap, f11, f11, paint);
        if (i7 > 0) {
            canvas2.restore();
            RectF rectF = g0.P;
            int i10 = kvVar.S;
            float f12 = D;
            rectF.set(-i10, f11, g0.L(12.0f) + (-i10), f12);
            kvVar.z.m(canvas2, rectF, 0, 1.0f);
            rectF.set(r4 - g0.L(12.0f), f11, ((kvVar.C + kvVar.T) - rect.left) - rect.right, f12);
            kvVar.z.m(canvas2, rectF, 2, 1.0f);
        }
        canvas2.restore();
    }

    @Override // org.telegram.messenger.fu
    public final boolean Y(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        View view;
        int i7 = this.c0;
        if (i7 > 0) {
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
                    a0(true);
                }
                if (this.g0) {
                    int i10 = (int) (this.f0 - x10);
                    int i11 = i10 >= 0 ? i10 : 0;
                    if (i11 <= i7) {
                        i7 = i11;
                    }
                    if (i7 != this.d0) {
                        this.d0 = i7;
                        View view2 = this.V;
                        if (view2 != null) {
                            view2.invalidate();
                            return true;
                        }
                    }
                    return true;
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                boolean z9 = this.g0;
                this.g0 = false;
                if (z9) {
                    a0(false);
                    if (actionMasked == 1 && (velocityTracker = this.l0) != null && this.m0 != null && this.V != null) {
                        velocityTracker.addMovement(motionEvent);
                        this.l0.computeCurrentVelocity(1000, this.k0);
                        float f10 = -this.l0.getXVelocity();
                        if (Math.abs(f10) > this.j0) {
                            this.m0.fling(this.d0, 0, (int) f10, 0, 0, this.c0, 0, 0);
                            this.V.postOnAnimation(this.n0);
                        }
                    }
                }
                VelocityTracker velocityTracker4 = this.l0;
                if (velocityTracker4 != null) {
                    velocityTracker4.recycle();
                    this.l0 = null;
                }
                if (z9 || actionMasked == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.messenger.fu
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        TL_iv.pageBlockMath pageblockmath = this.W;
        if (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) {
            return;
        }
        spannableStringBuilder.append((CharSequence) pageblockmath.source);
    }
}
