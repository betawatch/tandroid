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
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.xb1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e extends View {
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public float I;
    public final float J;
    public float K;
    public float L;
    public float M;
    public final Rect N;
    public final Rect O;
    public ValueAnimator P;
    public ValueAnimator Q;
    public d R;
    public boolean S;
    public org.telegram.ui.Cells.y T;
    public final Paint U;
    public final ch0 V;
    public final Drawable W;
    public final FabBackgroundDrawable a;
    public final b0 a0;
    public final FabBackgroundDrawable b;
    public final Paint b0;
    public final Drawable c;
    public ValueAnimator c0;
    public final Drawable d;
    public final StaticLayout e;
    public final StaticLayout f;
    public final StaticLayout h;
    public final gc n;
    public final gc r;
    public b s;
    public final int w;
    public float x;
    public float y;

    public e(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.n = new gc(this);
        this.r = new gc(this);
        this.E = true;
        this.F = true;
        this.N = new Rect();
        this.O = new Rect();
        this.U = new Paint(1);
        Paint paint2 = new Paint(1);
        this.b0 = paint2;
        b0 b0Var = new b0(org.telegram.messenger.g0.L(45.0f), org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(8.0f), 4);
        this.a0 = b0Var;
        b0Var.h = true;
        b0Var.i = 0.0f;
        b0Var.d = 0.0f;
        b0Var.b(0.0d);
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.J = ViewConfiguration.get(activity).getScaledTouchSlop();
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
        String M0 = bd.M0(2131754716, null);
        String M02 = bd.M0(2131751604, null);
        String M03 = bd.M0(2131746061, null);
        int measureText = (int) textPaint.measureText(M0);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.e = new StaticLayout(M0, textPaint, measureText, alignment, 1.0f, 0.0f, false);
        this.f = new StaticLayout(M02, textPaint, (int) textPaint.measureText(M02), alignment, 1.0f, 0.0f, false);
        this.h = new StaticLayout(M03, textPaint, (int) textPaint.measureText(M03), alignment, 1.0f, 0.0f, false);
        this.c = activity.getDrawable(R.drawable.calls_decline).mutate();
        Drawable mutate = activity.getDrawable(R.drawable.ic_close_white).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        ch0 ch0Var = new ch0(R.raw.call_accept, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(48.0f), true, null);
        this.V = ch0Var;
        ch0Var.K(1);
        ch0Var.P(90);
        ch0Var.R(this);
        this.W = activity.getDrawable(R.drawable.calls_video).mutate();
        paint.setColor(-1);
        paint.setAlpha(20);
        org.telegram.ui.Cells.y j02 = k6.j0(org.telegram.messenger.g0.L(52.0f), 0, i0.a.o(-1, 76));
        this.T = j02;
        j02.setCallback(this);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.T.setState(getDrawableState());
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
        org.telegram.ui.Cells.y yVar = this.T;
        if (yVar != null) {
            yVar.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.c0 = null;
            this.V.stop();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        if (!this.S) {
            if (this.E) {
                float L = (org.telegram.messenger.g0.L(2.0f) * 0.04f) + this.x;
                this.x = L;
                if (L > org.telegram.messenger.g0.L(4.0f)) {
                    this.x = org.telegram.messenger.g0.L(4.0f);
                    this.E = false;
                }
            } else {
                float L2 = this.x - (org.telegram.messenger.g0.L(2.0f) * 0.04f);
                this.x = L2;
                if (L2 < 0.0f) {
                    this.x = 0.0f;
                    this.E = true;
                }
            }
            if (this.F) {
                float L3 = (org.telegram.messenger.g0.L(4.0f) * 0.03f) + this.y;
                this.y = L3;
                if (L3 > org.telegram.messenger.g0.L(10.0f)) {
                    this.y = org.telegram.messenger.g0.L(10.0f);
                    this.F = false;
                }
            } else {
                float L4 = this.y - (org.telegram.messenger.g0.L(5.0f) * 0.03f);
                this.y = L4;
                if (L4 < org.telegram.messenger.g0.L(5.0f)) {
                    this.y = org.telegram.messenger.g0.L(5.0f);
                    this.F = true;
                }
            }
            invalidate();
        }
        this.y = (org.telegram.messenger.g0.L(8.0f) * 0.005f) + this.y;
        int measuredWidth = getMeasuredWidth();
        int i3 = this.w;
        int z10 = k5.z(46.0f, measuredWidth, i3);
        int L5 = org.telegram.messenger.g0.L(40.0f);
        int measuredWidth2 = getMeasuredWidth() - org.telegram.messenger.g0.L(46.0f);
        int L6 = org.telegram.messenger.g0.L(40.0f) + i3;
        this.O.set(z10, L5, measuredWidth2, L6);
        canvas.save();
        canvas.translate(0.0f, org.telegram.messenger.g0.L(40.0f));
        canvas.save();
        float a10 = this.r.a(0.1f);
        float f11 = i3;
        float f12 = f11 / 2.0f;
        canvas.scale(a10, a10, r6.centerX(), r6.top + f12);
        canvas.translate(((this.L + getMeasuredWidth()) - org.telegram.messenger.g0.L(46.0f)) - f11, 0.0f);
        boolean z11 = this.S;
        FabBackgroundDrawable fabBackgroundDrawable = this.b;
        if (z11) {
            f10 = 2.0f;
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.U, 31);
            fabBackgroundDrawable.draw(canvas);
            Drawable drawable = this.d;
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                if (bitmapDrawable.getBitmap() != null) {
                    canvas.drawBitmap(bitmapDrawable.getBitmap(), (Rect) null, bitmapDrawable.getBounds(), this.b0);
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
        canvas.translate(f12 - (staticLayout.getWidth() / f10), org.telegram.messenger.g0.L(4.0f) + i3);
        staticLayout.draw(canvas);
        canvas.restore();
        if (this.H) {
            this.T.setBounds(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), i3 - org.telegram.messenger.g0.L(4.0f), i3 - org.telegram.messenger.g0.L(4.0f));
            this.T.draw(canvas);
        }
        canvas.restore();
        int L7 = org.telegram.messenger.g0.L(46.0f);
        int L8 = org.telegram.messenger.g0.L(40.0f);
        int L9 = org.telegram.messenger.g0.L(46.0f) + i3;
        int L10 = org.telegram.messenger.g0.L(40.0f) + i3;
        this.N.set(L7, L8, L9, L10);
        canvas.save();
        float a11 = this.n.a(0.1f);
        canvas.scale(a11, a11, r6.centerX(), r6.top + f12);
        canvas.translate(this.K + org.telegram.messenger.g0.L(46.0f), 0.0f);
        if (!this.S) {
            b0 b0Var = this.a0;
            b0Var.c();
            float f13 = (int) f12;
            b0Var.a(canvas, f13, f13, this);
        }
        this.a.draw(canvas);
        if (this.S) {
            canvas.save();
            StaticLayout staticLayout2 = this.h;
            canvas.translate(f12 - (staticLayout2.getWidth() / f10), org.telegram.messenger.g0.L(4.0f) + i3);
            staticLayout2.draw(canvas);
            canvas.restore();
        } else {
            canvas.save();
            StaticLayout staticLayout3 = this.e;
            canvas.translate(f12 - (staticLayout3.getWidth() / f10), org.telegram.messenger.g0.L(4.0f) + i3);
            staticLayout3.draw(canvas);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
        this.V.draw(canvas);
        canvas.restore();
        if (!this.H) {
            this.T.setBounds(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), i3 - org.telegram.messenger.g0.L(4.0f), i3 - org.telegram.messenger.g0.L(4.0f));
            this.T.draw(canvas);
        }
        canvas.restore();
        canvas.restore();
        if (this.G) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        b bVar = this.s;
        if (bVar != null) {
            Rect rect = bVar.c;
            int x10 = (int) motionEvent.getX();
            int y9 = (int) motionEvent.getY();
            if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
                for (int i3 = 0; i3 < bVar.b; i3++) {
                    e eVar = bVar.g;
                    if (i3 == 0) {
                        rect.set(eVar.N);
                    } else if (i3 == 1) {
                        rect.set(eVar.O);
                    } else {
                        rect.setEmpty();
                    }
                    if (rect.contains(x10, y9)) {
                        if (i3 != bVar.e) {
                            bVar.e = i3;
                            bVar.a(i3);
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
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        int i11 = this.w;
        this.M = (getMeasuredWidth() / 2.0f) - ((i11 / 2.0f) + org.telegram.messenger.g0.L(46.0f));
        int y9 = org.telegram.messenger.camera.q.y(28.0f, i11, 2);
        this.c.setBounds(y9, y9, org.telegram.messenger.g0.L(28.0f) + y9, org.telegram.messenger.g0.L(28.0f) + y9);
        this.d.setBounds(y9, y9, org.telegram.messenger.g0.L(28.0f) + y9, org.telegram.messenger.g0.L(28.0f) + y9);
        float L = org.telegram.messenger.g0.L(3.0f);
        Paint paint = this.U;
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
            gc gcVar = this.n;
            gc gcVar2 = this.r;
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        if (this.G) {
                            return true;
                        }
                    }
                }
                float y9 = motionEvent.getY() - this.I;
                if (this.G) {
                    boolean z10 = this.H;
                    float f10 = this.J;
                    if (z10) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.K, 0.0f);
                        ofFloat.addUpdateListener(new a(this, 0));
                        ofFloat.start();
                        this.P = ofFloat;
                        if (this.R != null && (Math.abs(y9) < f10 || this.K > this.M * 0.8f)) {
                            ((xb1) this.R).b();
                        }
                    } else {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.L, 0.0f);
                        ofFloat2.addUpdateListener(new a(this, 1));
                        ofFloat2.start();
                        this.Q = ofFloat2;
                        if (this.R != null && (Math.abs(y9) < f10 || (-this.L) > this.M * 0.8f)) {
                            ((xb1) this.R).a();
                        }
                    }
                }
                getParent().requestDisallowInterceptTouchEvent(false);
                this.G = false;
                gcVar2.c(false);
                gcVar.c(false);
                setPressed(false);
                return false;
            }
            motionEvent.getX();
            this.I = motionEvent.getY();
            if (this.P == null && this.O.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.T = k6.j0(org.telegram.messenger.g0.L(52.0f), 0, this.S ? k6.x0(null, k6.i6, false) : -51130);
                this.G = true;
                this.H = true;
                gcVar2.c(true);
                gcVar.c(false);
                setPressed(true);
                invalidate();
                return true;
            }
            if (this.Q == null && this.N.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.T = k6.j0(org.telegram.messenger.g0.L(52.0f), 0, -11677354);
                this.G = true;
                this.H = false;
                gcVar2.c(false);
                gcVar.c(true);
                setPressed(true);
                ValueAnimator valueAnimator = this.Q;
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
        this.R = dVar;
    }

    public void setRetryMod(boolean z10) {
        this.S = z10;
        FabBackgroundDrawable fabBackgroundDrawable = this.b;
        if (z10) {
            fabBackgroundDrawable.setColor(-1);
            return;
        }
        this.V.start();
        b0 b0Var = this.a0;
        if (!b0Var.e) {
            invalidate();
        }
        b0Var.e = true;
        fabBackgroundDrawable.setColor(-1041108);
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 60, 0, 0, 60, 0, 0, 0, 0);
        this.c0 = ofInt;
        ofInt.addUpdateListener(new a(this, 2));
        this.c0.setDuration(1500L);
        this.c0.setRepeatMode(1);
        this.c0.setRepeatCount(-1);
        this.c0.start();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.T == drawable || super.verifyDrawable(drawable);
    }
}
