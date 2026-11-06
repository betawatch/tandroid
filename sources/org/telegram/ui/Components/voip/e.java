package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeProvider;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.cc1;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class e extends View {
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public float H;
    public final float I;
    public float J;
    public float K;
    public float L;
    public final Rect M;
    public final Rect N;
    public ValueAnimator O;
    public ValueAnimator P;
    public d Q;
    public boolean R;
    public org.telegram.ui.Cells.y S;
    public final Paint T;
    public final zg0 U;
    public final Drawable V;
    public final o0 W;
    public final FabBackgroundDrawable a;
    public final Paint a0;
    public final FabBackgroundDrawable b;
    public ValueAnimator b0;
    public final Drawable c;
    public final Drawable d;
    public final StaticLayout e;
    public final StaticLayout f;
    public final StaticLayout h;
    public final ic n;
    public final ic r;
    public b s;
    public final int w;
    public float x;
    public float y;

    public e(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.n = new ic(this);
        this.r = new ic(this);
        this.D = true;
        this.E = true;
        this.M = new Rect();
        this.N = new Rect();
        this.T = new Paint(1);
        Paint paint2 = new Paint(1);
        this.a0 = paint2;
        o0 o0Var = new o0(org.telegram.messenger.g0.L(45.0f), org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(8.0f), 4);
        this.W = o0Var;
        o0Var.h = true;
        o0Var.i = 0.0f;
        o0Var.d = 0.0f;
        o0Var.b(0.0d);
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.I = ViewConfiguration.get(activity).getScaledTouchSlop();
        int L = org.telegram.messenger.g0.L(60.0f);
        this.w = L;
        FabBackgroundDrawable fabBackgroundDrawable = new FabBackgroundDrawable();
        this.a = fabBackgroundDrawable;
        fabBackgroundDrawable.setColor(-12531895);
        FabBackgroundDrawable fabBackgroundDrawable2 = new FabBackgroundDrawable();
        this.b = fabBackgroundDrawable2;
        fabBackgroundDrawable2.setColor(-1041108);
        fabBackgroundDrawable2.setBounds(0, 0, L, L);
        fabBackgroundDrawable.setBounds(0, 0, L, L);
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(11.0f));
        textPaint.setColor(-1);
        String M0 = hd.M0(2131754716, null);
        String M02 = hd.M0(2131751604, null);
        String M03 = hd.M0(2131746052, null);
        int measureText = (int) textPaint.measureText(M0);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.e = new StaticLayout(M0, textPaint, measureText, alignment, 1.0f, 0.0f, false);
        this.f = new StaticLayout(M02, textPaint, (int) textPaint.measureText(M02), alignment, 1.0f, 0.0f, false);
        this.h = new StaticLayout(M03, textPaint, (int) textPaint.measureText(M03), alignment, 1.0f, 0.0f, false);
        this.c = activity.getDrawable(R.drawable.calls_decline).mutate();
        Drawable mutate = activity.getDrawable(R.drawable.ic_close_white).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        zg0 zg0Var = new zg0(R.raw.call_accept, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(48.0f), true, null);
        this.U = zg0Var;
        zg0Var.K(1);
        zg0Var.P(90);
        zg0Var.R(this);
        this.V = activity.getDrawable(R.drawable.calls_video).mutate();
        paint.setColor(-1);
        paint.setAlpha(20);
        org.telegram.ui.Cells.y j02 = k6.j0(org.telegram.messenger.g0.L(52.0f), 0, i0.a.o(-1, 76));
        this.S = j02;
        j02.setCallback(this);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.S.setState(getDrawableState());
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        if (this.s == null) {
            this.s = new b(this, this);
        }
        return this.s;
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.y yVar = this.S;
        if (yVar != null) {
            yVar.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.b0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.b0 = null;
            this.U.stop();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        if (!this.R) {
            if (this.D) {
                float L = (org.telegram.messenger.g0.L(2.0f) * 0.04f) + this.x;
                this.x = L;
                if (L > org.telegram.messenger.g0.L(4.0f)) {
                    this.x = org.telegram.messenger.g0.L(4.0f);
                    this.D = false;
                }
            } else {
                float L2 = this.x - (org.telegram.messenger.g0.L(2.0f) * 0.04f);
                this.x = L2;
                if (L2 < 0.0f) {
                    this.x = 0.0f;
                    this.D = true;
                }
            }
            if (this.E) {
                float L3 = (org.telegram.messenger.g0.L(4.0f) * 0.03f) + this.y;
                this.y = L3;
                if (L3 > org.telegram.messenger.g0.L(10.0f)) {
                    this.y = org.telegram.messenger.g0.L(10.0f);
                    this.E = false;
                }
            } else {
                float L4 = this.y - (org.telegram.messenger.g0.L(5.0f) * 0.03f);
                this.y = L4;
                if (L4 < org.telegram.messenger.g0.L(5.0f)) {
                    this.y = org.telegram.messenger.g0.L(5.0f);
                    this.E = true;
                }
            }
            invalidate();
        }
        this.y = (org.telegram.messenger.g0.L(8.0f) * 0.005f) + this.y;
        int measuredWidth = getMeasuredWidth();
        int i7 = this.w;
        int z9 = k5.z(46.0f, measuredWidth, i7);
        int L5 = org.telegram.messenger.g0.L(40.0f);
        int measuredWidth2 = getMeasuredWidth() - org.telegram.messenger.g0.L(46.0f);
        int L6 = org.telegram.messenger.g0.L(40.0f) + i7;
        this.N.set(z9, L5, measuredWidth2, L6);
        canvas.save();
        canvas.translate(0.0f, org.telegram.messenger.g0.L(40.0f));
        canvas.save();
        float a10 = this.r.a(0.1f);
        float f11 = i7;
        float f12 = f11 / 2.0f;
        canvas.scale(a10, a10, r6.centerX(), r6.top + f12);
        canvas.translate(((this.K + getMeasuredWidth()) - org.telegram.messenger.g0.L(46.0f)) - f11, 0.0f);
        boolean z10 = this.R;
        FabBackgroundDrawable fabBackgroundDrawable = this.b;
        if (z10) {
            f10 = 2.0f;
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.T, 31);
            fabBackgroundDrawable.draw(canvas);
            Drawable drawable = this.d;
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                if (bitmapDrawable.getBitmap() != null) {
                    canvas.drawBitmap(bitmapDrawable.getBitmap(), (Rect) null, bitmapDrawable.getBounds(), this.a0);
                }
            }
            canvas.restore();
        } else {
            f10 = 2.0f;
            fabBackgroundDrawable.draw(canvas);
            this.c.draw(canvas);
        }
        canvas.save();
        StaticLayout staticLayout = this.f;
        canvas.translate(f12 - (staticLayout.getWidth() / f10), org.telegram.messenger.g0.L(4.0f) + i7);
        staticLayout.draw(canvas);
        canvas.restore();
        if (this.G) {
            this.S.setBounds(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), i7 - org.telegram.messenger.g0.L(4.0f), i7 - org.telegram.messenger.g0.L(4.0f));
            this.S.draw(canvas);
        }
        canvas.restore();
        int L7 = org.telegram.messenger.g0.L(46.0f);
        int L8 = org.telegram.messenger.g0.L(40.0f);
        int L9 = org.telegram.messenger.g0.L(46.0f) + i7;
        int L10 = org.telegram.messenger.g0.L(40.0f) + i7;
        this.M.set(L7, L8, L9, L10);
        canvas.save();
        float a11 = this.n.a(0.1f);
        canvas.scale(a11, a11, r6.centerX(), r6.top + f12);
        canvas.translate(this.J + org.telegram.messenger.g0.L(46.0f), 0.0f);
        if (!this.R) {
            o0 o0Var = this.W;
            o0Var.c();
            float f13 = (int) f12;
            o0Var.a(canvas, f13, f13, this);
        }
        this.a.draw(canvas);
        if (this.R) {
            canvas.save();
            StaticLayout staticLayout2 = this.h;
            canvas.translate(f12 - (staticLayout2.getWidth() / f10), org.telegram.messenger.g0.L(4.0f) + i7);
            staticLayout2.draw(canvas);
            canvas.restore();
        } else {
            canvas.save();
            StaticLayout staticLayout3 = this.e;
            canvas.translate(f12 - (staticLayout3.getWidth() / f10), org.telegram.messenger.g0.L(4.0f) + i7);
            staticLayout3.draw(canvas);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
        this.U.draw(canvas);
        canvas.restore();
        if (!this.G) {
            this.S.setBounds(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), i7 - org.telegram.messenger.g0.L(4.0f), i7 - org.telegram.messenger.g0.L(4.0f));
            this.S.draw(canvas);
        }
        canvas.restore();
        canvas.restore();
        if (this.F) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        b bVar = this.s;
        if (bVar != null) {
            Rect rect = bVar.c;
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
                for (int i7 = 0; i7 < bVar.b; i7++) {
                    e eVar = bVar.g;
                    if (i7 == 0) {
                        rect.set(eVar.M);
                    } else if (i7 == 1) {
                        rect.set(eVar.N);
                    } else {
                        rect.setEmpty();
                    }
                    if (rect.contains(x10, y10)) {
                        if (i7 != bVar.e) {
                            bVar.e = i7;
                            bVar.a(i7);
                        }
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 10 && bVar.e != -1) {
                bVar.e = -1;
                return true;
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int i11 = this.w;
        this.L = (getMeasuredWidth() / 2.0f) - ((i11 / 2.0f) + org.telegram.messenger.g0.L(46.0f));
        int y10 = org.telegram.messenger.camera.q.y(28.0f, i11, 2);
        this.c.setBounds(y10, y10, org.telegram.messenger.g0.L(28.0f) + y10, org.telegram.messenger.g0.L(28.0f) + y10);
        this.d.setBounds(y10, y10, org.telegram.messenger.g0.L(28.0f) + y10, org.telegram.messenger.g0.L(28.0f) + y10);
        float L = org.telegram.messenger.g0.L(3.0f);
        Paint paint = this.T;
        paint.setStrokeWidth(L);
        paint.setColor(-1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r0 != 3) goto L55;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            int action = motionEvent.getAction();
            ic icVar = this.n;
            ic icVar2 = this.r;
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        if (this.F) {
                            return true;
                        }
                    }
                }
                float y10 = motionEvent.getY() - this.H;
                if (this.F) {
                    boolean z9 = this.G;
                    float f10 = this.I;
                    if (z9) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J, 0.0f);
                        ofFloat.addUpdateListener(new a(this, 0));
                        ofFloat.start();
                        this.O = ofFloat;
                        if (this.Q != null && (Math.abs(y10) < f10 || this.J > this.L * 0.8f)) {
                            ((cc1) this.Q).b();
                        }
                    } else {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.K, 0.0f);
                        ofFloat2.addUpdateListener(new a(this, 1));
                        ofFloat2.start();
                        this.P = ofFloat2;
                        if (this.Q != null && (Math.abs(y10) < f10 || (-this.K) > this.L * 0.8f)) {
                            ((cc1) this.Q).a();
                        }
                    }
                }
                getParent().requestDisallowInterceptTouchEvent(false);
                this.F = false;
                icVar2.c(false);
                icVar.c(false);
                setPressed(false);
                return false;
            }
            motionEvent.getX();
            this.H = motionEvent.getY();
            if (this.O == null && this.N.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.S = k6.j0(org.telegram.messenger.g0.L(52.0f), 0, this.R ? k6.x0(null, k6.i6, false) : -51130);
                this.F = true;
                this.G = true;
                icVar2.c(true);
                icVar.c(false);
                setPressed(true);
                invalidate();
                return true;
            }
            if (this.P == null && this.M.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.S = k6.j0(org.telegram.messenger.g0.L(52.0f), 0, -11677354);
                this.F = true;
                this.G = false;
                icVar2.c(false);
                icVar.c(true);
                setPressed(true);
                ValueAnimator valueAnimator = this.P;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                invalidate();
                return true;
            }
        }
        return false;
    }

    public void setListener(d dVar) {
        this.Q = dVar;
    }

    public void setRetryMod(boolean z9) {
        this.R = z9;
        FabBackgroundDrawable fabBackgroundDrawable = this.b;
        if (z9) {
            fabBackgroundDrawable.setColor(-1);
            return;
        }
        this.U.start();
        o0 o0Var = this.W;
        if (!o0Var.e) {
            invalidate();
        }
        o0Var.e = true;
        fabBackgroundDrawable.setColor(-1041108);
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 60, 0, 0, 60, 0, 0, 0, 0);
        this.b0 = ofInt;
        ofInt.addUpdateListener(new a(this, 2));
        this.b0.setDuration(1500L);
        this.b0.setRepeatMode(1);
        this.b0.setRepeatCount(-1);
        this.b0.start();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.S == drawable || super.verifyDrawable(drawable);
    }
}
