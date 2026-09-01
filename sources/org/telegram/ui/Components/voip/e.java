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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.y3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.rc;
import org.telegram.ui.ai1;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class e extends View {
    public boolean B;
    public boolean C;
    public boolean D;
    public float E;
    public final float F;
    public float G;
    public float H;
    public float I;
    public final Rect J;
    public final Rect K;
    public ValueAnimator L;
    public ValueAnimator M;
    public d N;
    public boolean O;
    public org.telegram.ui.Cells.z P;
    public final Paint Q;
    public final ij0 R;
    public final Drawable S;
    public final q0 T;
    public final Paint U;
    public ValueAnimator V;
    public final FabBackgroundDrawable a;
    public final FabBackgroundDrawable b;
    public final Drawable c;
    public final Drawable d;
    public final StaticLayout e;
    public final StaticLayout f;
    public final StaticLayout h;
    public final rc n;
    public final rc r;
    public b s;
    public final int v;
    public float w;
    public float x;
    public boolean y;

    public e(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.n = new rc(this);
        this.r = new rc(this);
        this.y = true;
        this.B = true;
        this.J = new Rect();
        this.K = new Rect();
        this.Q = new Paint(1);
        Paint paint2 = new Paint(1);
        this.U = paint2;
        q0 q0Var = new q0(AndroidUtilities.dp(45.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(8.0f), 4);
        this.T = q0Var;
        q0Var.h = true;
        q0Var.i = 0.0f;
        q0Var.d = 0.0f;
        q0Var.b(0.0d);
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.F = ViewConfiguration.get(activity).getScaledTouchSlop();
        int dp = AndroidUtilities.dp(60.0f);
        this.v = dp;
        FabBackgroundDrawable fabBackgroundDrawable = new FabBackgroundDrawable();
        this.a = fabBackgroundDrawable;
        fabBackgroundDrawable.setColor(-12531895);
        FabBackgroundDrawable fabBackgroundDrawable2 = new FabBackgroundDrawable();
        this.b = fabBackgroundDrawable2;
        fabBackgroundDrawable2.setColor(-1041108);
        fabBackgroundDrawable2.setBounds(0, 0, dp, dp);
        fabBackgroundDrawable.setBounds(0, 0, dp, dp);
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(AndroidUtilities.dp(11.0f));
        textPaint.setColor(-1);
        String string = LocaleController.getString(R.string.AcceptCall);
        String string2 = LocaleController.getString(R.string.DeclineCall);
        String string3 = LocaleController.getString(R.string.RetryCall);
        int measureText = (int) textPaint.measureText(string);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.e = new StaticLayout(string, textPaint, measureText, alignment, 1.0f, 0.0f, false);
        this.f = new StaticLayout(string2, textPaint, (int) textPaint.measureText(string2), alignment, 1.0f, 0.0f, false);
        this.h = new StaticLayout(string3, textPaint, (int) textPaint.measureText(string3), alignment, 1.0f, 0.0f, false);
        this.c = activity.getDrawable(R.drawable.calls_decline).mutate();
        Drawable mutate = activity.getDrawable(R.drawable.ic_close_white).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        ij0 ij0Var = new ij0(R.raw.call_accept, "" + R.raw.call_accept, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), true, null);
        this.R = ij0Var;
        ij0Var.I(1);
        ij0Var.N(90);
        ij0Var.s0 = this;
        this.S = activity.getDrawable(R.drawable.calls_video).mutate();
        paint.setColor(-1);
        paint.setAlpha(20);
        org.telegram.ui.Cells.z h02 = k6.h0(AndroidUtilities.dp(52.0f), 0, i0.a.k(-1, 76));
        this.P = h02;
        h02.setCallback(this);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.P.setState(getDrawableState());
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
        org.telegram.ui.Cells.z zVar = this.P;
        if (zVar != null) {
            zVar.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.V;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.V = null;
            this.R.stop();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        if (!this.O) {
            if (this.y) {
                float dp = (AndroidUtilities.dp(2.0f) * 0.04f) + this.w;
                this.w = dp;
                if (dp > AndroidUtilities.dp(4.0f)) {
                    this.w = AndroidUtilities.dp(4.0f);
                    this.y = false;
                }
            } else {
                float dp2 = this.w - (AndroidUtilities.dp(2.0f) * 0.04f);
                this.w = dp2;
                if (dp2 < 0.0f) {
                    this.w = 0.0f;
                    this.y = true;
                }
            }
            if (this.B) {
                float dp3 = (AndroidUtilities.dp(4.0f) * 0.03f) + this.x;
                this.x = dp3;
                if (dp3 > AndroidUtilities.dp(10.0f)) {
                    this.x = AndroidUtilities.dp(10.0f);
                    this.B = false;
                }
            } else {
                float dp4 = this.x - (AndroidUtilities.dp(5.0f) * 0.03f);
                this.x = dp4;
                if (dp4 < AndroidUtilities.dp(5.0f)) {
                    this.x = AndroidUtilities.dp(5.0f);
                    this.B = true;
                }
            }
            invalidate();
        }
        this.x = (AndroidUtilities.dp(8.0f) * 0.005f) + this.x;
        int measuredWidth = getMeasuredWidth();
        int i10 = this.v;
        int B = y3.B(46.0f, measuredWidth, i10);
        int dp5 = AndroidUtilities.dp(40.0f);
        int measuredWidth2 = getMeasuredWidth() - AndroidUtilities.dp(46.0f);
        int dp6 = AndroidUtilities.dp(40.0f) + i10;
        this.K.set(B, dp5, measuredWidth2, dp6);
        canvas.save();
        canvas.translate(0.0f, AndroidUtilities.dp(40.0f));
        canvas.save();
        float a2 = this.r.a(0.1f);
        float f11 = i10;
        float f12 = f11 / 2.0f;
        canvas.scale(a2, a2, r6.centerX(), r6.top + f12);
        canvas.translate(((this.H + getMeasuredWidth()) - AndroidUtilities.dp(46.0f)) - f11, 0.0f);
        boolean z4 = this.O;
        FabBackgroundDrawable fabBackgroundDrawable = this.b;
        if (z4) {
            f10 = 2.0f;
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.Q, 31);
            fabBackgroundDrawable.draw(canvas);
            Drawable drawable = this.d;
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                if (bitmapDrawable.getBitmap() != null) {
                    canvas.drawBitmap(bitmapDrawable.getBitmap(), (Rect) null, bitmapDrawable.getBounds(), this.U);
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
        canvas.translate(f12 - (staticLayout.getWidth() / f10), AndroidUtilities.dp(4.0f) + i10);
        staticLayout.draw(canvas);
        canvas.restore();
        if (this.D) {
            this.P.setBounds(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), i10 - AndroidUtilities.dp(4.0f), i10 - AndroidUtilities.dp(4.0f));
            this.P.draw(canvas);
        }
        canvas.restore();
        int dp7 = AndroidUtilities.dp(46.0f);
        int dp8 = AndroidUtilities.dp(40.0f);
        int dp9 = AndroidUtilities.dp(46.0f) + i10;
        int dp10 = AndroidUtilities.dp(40.0f) + i10;
        this.J.set(dp7, dp8, dp9, dp10);
        canvas.save();
        float a10 = this.n.a(0.1f);
        canvas.scale(a10, a10, r6.centerX(), r6.top + f12);
        canvas.translate(this.G + AndroidUtilities.dp(46.0f), 0.0f);
        if (!this.O) {
            q0 q0Var = this.T;
            q0Var.c();
            float f13 = (int) f12;
            q0Var.a(canvas, f13, f13, this);
        }
        this.a.draw(canvas);
        if (this.O) {
            canvas.save();
            StaticLayout staticLayout2 = this.h;
            canvas.translate(f12 - (staticLayout2.getWidth() / f10), AndroidUtilities.dp(4.0f) + i10);
            staticLayout2.draw(canvas);
            canvas.restore();
        } else {
            canvas.save();
            StaticLayout staticLayout3 = this.e;
            canvas.translate(f12 - (staticLayout3.getWidth() / f10), AndroidUtilities.dp(4.0f) + i10);
            staticLayout3.draw(canvas);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        this.R.draw(canvas);
        canvas.restore();
        if (!this.D) {
            this.P.setBounds(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), i10 - AndroidUtilities.dp(4.0f), i10 - AndroidUtilities.dp(4.0f));
            this.P.draw(canvas);
        }
        canvas.restore();
        canvas.restore();
        if (this.C) {
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
                for (int i10 = 0; i10 < bVar.b; i10++) {
                    e eVar = bVar.g;
                    if (i10 == 0) {
                        rect.set(eVar.J);
                    } else if (i10 == 1) {
                        rect.set(eVar.K);
                    } else {
                        rect.setEmpty();
                    }
                    if (rect.contains(x10, y10)) {
                        if (i10 != bVar.e) {
                            bVar.e = i10;
                            bVar.a(i10);
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
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int i12 = this.v;
        this.I = (getMeasuredWidth() / 2.0f) - ((i12 / 2.0f) + AndroidUtilities.dp(46.0f));
        int x10 = org.telegram.ui.b.x(28.0f, i12, 2);
        this.c.setBounds(x10, x10, AndroidUtilities.dp(28.0f) + x10, AndroidUtilities.dp(28.0f) + x10);
        this.d.setBounds(x10, x10, AndroidUtilities.dp(28.0f) + x10, AndroidUtilities.dp(28.0f) + x10);
        float dp = AndroidUtilities.dp(3.0f);
        Paint paint = this.Q;
        paint.setStrokeWidth(dp);
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
            rc rcVar = this.n;
            rc rcVar2 = this.r;
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        if (this.C) {
                            return true;
                        }
                    }
                }
                float y10 = motionEvent.getY() - this.E;
                if (this.C) {
                    boolean z4 = this.D;
                    float f10 = this.F;
                    if (z4) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G, 0.0f);
                        ofFloat.addUpdateListener(new a(this, 0));
                        ofFloat.start();
                        this.L = ofFloat;
                        if (this.N != null && (Math.abs(y10) < f10 || this.G > this.I * 0.8f)) {
                            ((ai1) this.N).b();
                        }
                    } else {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.H, 0.0f);
                        ofFloat2.addUpdateListener(new a(this, 1));
                        ofFloat2.start();
                        this.M = ofFloat2;
                        if (this.N != null && (Math.abs(y10) < f10 || (-this.H) > this.I * 0.8f)) {
                            ((ai1) this.N).a();
                        }
                    }
                }
                getParent().requestDisallowInterceptTouchEvent(false);
                this.C = false;
                rcVar2.c(false);
                rcVar.c(false);
                setPressed(false);
                return false;
            }
            motionEvent.getX();
            this.E = motionEvent.getY();
            if (this.L == null && this.K.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.P = k6.h0(AndroidUtilities.dp(52.0f), 0, this.O ? k6.w0(null, k6.i6, false) : -51130);
                this.C = true;
                this.D = true;
                rcVar2.c(true);
                rcVar.c(false);
                setPressed(true);
                invalidate();
                return true;
            }
            if (this.M == null && this.J.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.P = k6.h0(AndroidUtilities.dp(52.0f), 0, -11677354);
                this.C = true;
                this.D = false;
                rcVar2.c(false);
                rcVar.c(true);
                setPressed(true);
                ValueAnimator valueAnimator = this.M;
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
        this.N = dVar;
    }

    public void setRetryMod(boolean z4) {
        this.O = z4;
        FabBackgroundDrawable fabBackgroundDrawable = this.b;
        if (z4) {
            fabBackgroundDrawable.setColor(-1);
            return;
        }
        this.R.start();
        q0 q0Var = this.T;
        if (!q0Var.e) {
            invalidate();
        }
        q0Var.e = true;
        fabBackgroundDrawable.setColor(-1041108);
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 60, 0, 0, 60, 0, 0, 0, 0);
        this.V = ofInt;
        ofInt.addUpdateListener(new a(this, 2));
        this.V.setDuration(1500L);
        this.V.setRepeatMode(1);
        this.V.setRepeatCount(-1);
        this.V.start();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.P == drawable || super.verifyDrawable(drawable);
    }
}
