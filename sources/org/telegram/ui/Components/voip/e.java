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
import org.telegram.messenger.x3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.uc;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.mh1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class e extends View {
    public boolean A;
    public boolean B;
    public boolean C;
    public float D;
    public final float E;
    public float F;
    public float G;
    public float H;
    public final Rect I;
    public final Rect J;
    public ValueAnimator K;
    public ValueAnimator L;
    public d M;
    public boolean N;
    public org.telegram.ui.Cells.z O;
    public final Paint P;
    public final xi0 Q;
    public final Drawable R;
    public final q0 S;
    public final Paint T;
    public ValueAnimator U;
    public final FabBackgroundDrawable a;
    public final FabBackgroundDrawable b;
    public final Drawable c;
    public final Drawable d;
    public final StaticLayout e;
    public final StaticLayout f;
    public final StaticLayout h;
    public final uc n;
    public final uc r;
    public b s;
    public final int v;
    public float w;
    public float x;
    public boolean y;

    public e(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.n = new uc(this);
        this.r = new uc(this);
        this.y = true;
        this.A = true;
        this.I = new Rect();
        this.J = new Rect();
        this.P = new Paint(1);
        Paint paint2 = new Paint(1);
        this.T = paint2;
        q0 q0Var = new q0(AndroidUtilities.dp(45.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(8.0f), 4);
        this.S = q0Var;
        q0Var.h = true;
        q0Var.i = 0.0f;
        q0Var.d = 0.0f;
        q0Var.b(0.0d);
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.E = ViewConfiguration.get(activity).getScaledTouchSlop();
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
        xi0 xi0Var = new xi0(R.raw.call_accept, "" + R.raw.call_accept, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), true, null);
        this.Q = xi0Var;
        xi0Var.I(1);
        xi0Var.N(90);
        xi0Var.r0 = this;
        this.R = activity.getDrawable(R.drawable.calls_video).mutate();
        paint.setColor(-1);
        paint.setAlpha(20);
        org.telegram.ui.Cells.z h02 = g6.h0(AndroidUtilities.dp(52.0f), 0, i0.a.k(-1, 76));
        this.O = h02;
        h02.setCallback(this);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.O.setState(getDrawableState());
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
        org.telegram.ui.Cells.z zVar = this.O;
        if (zVar != null) {
            zVar.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.U;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.U = null;
            this.Q.stop();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f9;
        if (!this.N) {
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
            if (this.A) {
                float dp3 = (AndroidUtilities.dp(4.0f) * 0.03f) + this.x;
                this.x = dp3;
                if (dp3 > AndroidUtilities.dp(10.0f)) {
                    this.x = AndroidUtilities.dp(10.0f);
                    this.A = false;
                }
            } else {
                float dp4 = this.x - (AndroidUtilities.dp(5.0f) * 0.03f);
                this.x = dp4;
                if (dp4 < AndroidUtilities.dp(5.0f)) {
                    this.x = AndroidUtilities.dp(5.0f);
                    this.A = true;
                }
            }
            invalidate();
        }
        this.x = (AndroidUtilities.dp(8.0f) * 0.005f) + this.x;
        int measuredWidth = getMeasuredWidth();
        int i10 = this.v;
        int B = x3.B(46.0f, measuredWidth, i10);
        int dp5 = AndroidUtilities.dp(40.0f);
        int measuredWidth2 = getMeasuredWidth() - AndroidUtilities.dp(46.0f);
        int dp6 = AndroidUtilities.dp(40.0f) + i10;
        this.J.set(B, dp5, measuredWidth2, dp6);
        canvas.save();
        canvas.translate(0.0f, AndroidUtilities.dp(40.0f));
        canvas.save();
        float a2 = this.r.a(0.1f);
        float f10 = i10;
        float f11 = f10 / 2.0f;
        canvas.scale(a2, a2, r6.centerX(), r6.top + f11);
        canvas.translate(((this.G + getMeasuredWidth()) - AndroidUtilities.dp(46.0f)) - f10, 0.0f);
        boolean z10 = this.N;
        FabBackgroundDrawable fabBackgroundDrawable = this.b;
        if (z10) {
            f9 = 2.0f;
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.P, 31);
            fabBackgroundDrawable.draw(canvas);
            Drawable drawable = this.d;
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                if (bitmapDrawable.getBitmap() != null) {
                    canvas.drawBitmap(bitmapDrawable.getBitmap(), (Rect) null, bitmapDrawable.getBounds(), this.T);
                }
            }
            canvas.restore();
        } else {
            f9 = 2.0f;
            fabBackgroundDrawable.draw(canvas);
            this.c.draw(canvas);
        }
        canvas.save();
        StaticLayout staticLayout = this.f;
        canvas.translate(f11 - (staticLayout.getWidth() / f9), AndroidUtilities.dp(4.0f) + i10);
        staticLayout.draw(canvas);
        canvas.restore();
        if (this.C) {
            this.O.setBounds(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), i10 - AndroidUtilities.dp(4.0f), i10 - AndroidUtilities.dp(4.0f));
            this.O.draw(canvas);
        }
        canvas.restore();
        int dp7 = AndroidUtilities.dp(46.0f);
        int dp8 = AndroidUtilities.dp(40.0f);
        int dp9 = AndroidUtilities.dp(46.0f) + i10;
        int dp10 = AndroidUtilities.dp(40.0f) + i10;
        this.I.set(dp7, dp8, dp9, dp10);
        canvas.save();
        float a10 = this.n.a(0.1f);
        canvas.scale(a10, a10, r6.centerX(), r6.top + f11);
        canvas.translate(this.F + AndroidUtilities.dp(46.0f), 0.0f);
        if (!this.N) {
            q0 q0Var = this.S;
            q0Var.c();
            float f12 = (int) f11;
            q0Var.a(canvas, f12, f12, this);
        }
        this.a.draw(canvas);
        if (this.N) {
            canvas.save();
            StaticLayout staticLayout2 = this.h;
            canvas.translate(f11 - (staticLayout2.getWidth() / f9), AndroidUtilities.dp(4.0f) + i10);
            staticLayout2.draw(canvas);
            canvas.restore();
        } else {
            canvas.save();
            StaticLayout staticLayout3 = this.e;
            canvas.translate(f11 - (staticLayout3.getWidth() / f9), AndroidUtilities.dp(4.0f) + i10);
            staticLayout3.draw(canvas);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        this.Q.draw(canvas);
        canvas.restore();
        if (!this.C) {
            this.O.setBounds(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), i10 - AndroidUtilities.dp(4.0f), i10 - AndroidUtilities.dp(4.0f));
            this.O.draw(canvas);
        }
        canvas.restore();
        canvas.restore();
        if (this.B) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        b bVar = this.s;
        if (bVar != null) {
            Rect rect = bVar.c;
            int x4 = (int) motionEvent.getX();
            int y8 = (int) motionEvent.getY();
            if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
                for (int i10 = 0; i10 < bVar.b; i10++) {
                    e eVar = bVar.g;
                    if (i10 == 0) {
                        rect.set(eVar.I);
                    } else if (i10 == 1) {
                        rect.set(eVar.J);
                    } else {
                        rect.setEmpty();
                    }
                    if (rect.contains(x4, y8)) {
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
        this.H = (getMeasuredWidth() / 2.0f) - ((i12 / 2.0f) + AndroidUtilities.dp(46.0f));
        int x4 = org.telegram.ui.b.x(28.0f, i12, 2);
        this.c.setBounds(x4, x4, AndroidUtilities.dp(28.0f) + x4, AndroidUtilities.dp(28.0f) + x4);
        this.d.setBounds(x4, x4, AndroidUtilities.dp(28.0f) + x4, AndroidUtilities.dp(28.0f) + x4);
        float dp = AndroidUtilities.dp(3.0f);
        Paint paint = this.P;
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
            uc ucVar = this.n;
            uc ucVar2 = this.r;
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        if (this.B) {
                            return true;
                        }
                    }
                }
                float y8 = motionEvent.getY() - this.D;
                if (this.B) {
                    boolean z10 = this.C;
                    float f9 = this.E;
                    if (z10) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.F, 0.0f);
                        ofFloat.addUpdateListener(new a(this, 0));
                        ofFloat.start();
                        this.K = ofFloat;
                        if (this.M != null && (Math.abs(y8) < f9 || this.F > this.H * 0.8f)) {
                            ((mh1) this.M).b();
                        }
                    } else {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.G, 0.0f);
                        ofFloat2.addUpdateListener(new a(this, 1));
                        ofFloat2.start();
                        this.L = ofFloat2;
                        if (this.M != null && (Math.abs(y8) < f9 || (-this.G) > this.H * 0.8f)) {
                            ((mh1) this.M).a();
                        }
                    }
                }
                getParent().requestDisallowInterceptTouchEvent(false);
                this.B = false;
                ucVar2.c(false);
                ucVar.c(false);
                setPressed(false);
                return false;
            }
            motionEvent.getX();
            this.D = motionEvent.getY();
            if (this.K == null && this.J.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.O = g6.h0(AndroidUtilities.dp(52.0f), 0, this.N ? g6.w0(null, g6.i6, false) : -51130);
                this.B = true;
                this.C = true;
                ucVar2.c(true);
                ucVar.c(false);
                setPressed(true);
                invalidate();
                return true;
            }
            if (this.L == null && this.I.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.O = g6.h0(AndroidUtilities.dp(52.0f), 0, -11677354);
                this.B = true;
                this.C = false;
                ucVar2.c(false);
                ucVar.c(true);
                setPressed(true);
                ValueAnimator valueAnimator = this.L;
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
        this.M = dVar;
    }

    public void setRetryMod(boolean z10) {
        this.N = z10;
        FabBackgroundDrawable fabBackgroundDrawable = this.b;
        if (z10) {
            fabBackgroundDrawable.setColor(-1);
            return;
        }
        this.Q.start();
        q0 q0Var = this.S;
        if (!q0Var.e) {
            invalidate();
        }
        q0Var.e = true;
        fabBackgroundDrawable.setColor(-1041108);
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 60, 0, 0, 60, 0, 0, 0, 0);
        this.U = ofInt;
        ofInt.addUpdateListener(new a(this, 2));
        this.U.setDuration(1500L);
        this.U.setRepeatMode(1);
        this.U.setRepeatCount(-1);
        this.U.start();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.O == drawable || super.verifyDrawable(drawable);
    }
}
