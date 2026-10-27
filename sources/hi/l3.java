package hi;

import a8.me;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import fi.k8;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.me0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.ww0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class l3 extends ww0 implements org.telegram.ui.ActionBar.z3 {
    public final Paint l0;
    public boolean m0;
    public final RectF n0;
    public final Path o0;
    public final /* synthetic */ m3 p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(m3 m3Var, Context context) {
        super(context, null);
        this.p0 = m3Var;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        this.l0 = new Paint(1);
        this.n0 = new RectF();
        this.o0 = new Path();
    }

    @Override // org.telegram.ui.Components.ww0, org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(y6.d6));
        hashSet.add(Integer.valueOf(y6.a7));
        hashSet.add(Integer.valueOf(y6.G6));
        hashSet.add(Integer.valueOf(y6.u8));
        hashSet.add(Integer.valueOf(y6.G8));
        hashSet.add(Integer.valueOf(y6.E8));
        hashSet.add(Integer.valueOf(y6.F8));
        hashSet.add(Integer.valueOf(y6.I5));
    }

    @Override // org.telegram.ui.Components.ww0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        Paint paint;
        m3 m3Var = this.p0;
        me0 me0Var = m3Var.t0;
        Rect rect = m3Var.n;
        Rect rect2 = m3Var.h;
        if (this.m0) {
            return;
        }
        int visibility = me0Var.getVisibility();
        Paint paint2 = this.l0;
        if (visibility != 0) {
            float f7 = m3Var.g0;
            if (f7 < 1.0f && f7 > 0.0f) {
                paint2.setColor(y6.o1(m3Var.R0, m3Var.S));
                int i10 = rect2.left;
                if (i10 > 0) {
                    canvas.drawRect(0.0f, 0.0f, i10, getHeight(), paint2);
                }
                if (rect2.top > 0) {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), rect2.top, paint2);
                }
                if (rect2.bottom > 0) {
                    canvas.drawRect(0.0f, getHeight() - rect2.bottom, getWidth(), getHeight(), paint2);
                }
                if (rect2.right > 0) {
                    canvas.drawRect(getWidth() - rect2.right, 0.0f, getWidth(), getHeight(), paint2);
                }
            }
        }
        if (m3Var.v == null || AndroidUtilities.isTablet()) {
            z10 = false;
        } else {
            canvas.save();
            canvas.translate((1.0f - m3Var.g0) * rect.left, 0.0f);
            me meVar = m3Var.v;
            int lerp = AndroidUtilities.lerp((getWidth() - rect.left) - rect.right, getWidth(), m3Var.g0);
            getHeight();
            meVar.s(canvas, true, false, lerp, 1.0f - m3Var.g0);
            canvas.translate((1.0f - m3Var.g0) * (-rect.left), 0.0f);
            z10 = true;
        }
        super.dispatchDraw(canvas);
        if (z10) {
            canvas.restore();
        }
        if (me0Var.getVisibility() != 0) {
            paint2.setColor(y6.o1(m3Var.R0, m3Var.S));
            int i11 = rect2.left;
            if (i11 > 0) {
                paint = paint2;
                canvas.drawRect(0.0f, 0.0f, (1.0f - m3Var.g0) * i11, getHeight(), paint);
            } else {
                paint = paint2;
            }
            if (rect2.top > 0) {
                canvas.drawRect(0.0f, 0.0f, getWidth(), (1.0f - m3Var.g0) * rect2.top, paint);
            }
            if (rect2.bottom > 0) {
                float height = getHeight();
                float f10 = rect2.bottom;
                i3 i3Var = m3Var.m0;
                canvas.drawRect(0.0f, height - (f10 * ((i3Var == null || i3Var.getTotalHeight() <= 0) ? 1.0f - m3Var.g0 : 1.0f)), getWidth(), getHeight(), paint);
            }
            if (rect2.right > 0) {
                canvas.drawRect(ic.a.d(1.0f, m3Var.g0, rect2.right, getWidth()), 0.0f, getWidth(), getHeight(), paint);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        m3 m3Var = this.p0;
        Rect rect = m3Var.n;
        LaunchActivity launchActivity = LaunchActivity.I1;
        org.telegram.ui.ActionBar.s3 P = launchActivity != null ? launchActivity.P() : null;
        if (P != null && rect != null) {
            int i10 = (int) ((1.0f - m3Var.g0) * ((int) P.G));
            if (motionEvent.getY() >= (getHeight() - rect.bottom) - i10 && motionEvent.getY() <= getHeight() - rect.bottom && !AndroidUtilities.isTablet()) {
                return P.j(motionEvent.getX(), motionEvent.getY() - ((getHeight() - rect.bottom) - i10), motionEvent.getAction());
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        m3 m3Var = this.p0;
        Rect rect = m3Var.n;
        d3 d3Var = m3Var.w;
        Paint paint = m3Var.O;
        j3 j3Var = m3Var.X;
        Drawable drawable = m3Var.Z;
        if (this.m0) {
            return;
        }
        super.draw(canvas);
        float f7 = AndroidUtilities.isTablet() ? 0.0f : m3Var.c;
        paint.setColor(m3Var.a);
        paint.setAlpha((int) ((1.0f - m3Var.g0) * (1.0f - (Math.min(0.5f, f7) / 0.5f)) * paint.getAlpha()));
        canvas.save();
        float f10 = 1.0f - f7;
        float lerp = AndroidUtilities.isTablet() ? AndroidUtilities.lerp(d3Var.getTranslationY() + AndroidUtilities.dp(12.0f), AndroidUtilities.statusBarHeight / 2.0f, m3Var.c) : AndroidUtilities.lerp(d3Var.getTranslationY(), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + AndroidUtilities.statusBarHeight, f7) + AndroidUtilities.dp(12.0f);
        canvas.scale(f10, f10, getWidth() / 2.0f, lerp);
        canvas.drawLine((getWidth() / 2.0f) - AndroidUtilities.dp(16.0f), lerp, (getWidth() / 2.0f) + AndroidUtilities.dp(16.0f), lerp, paint);
        canvas.restore();
        drawable.setAlpha((int) (j3Var.getAlpha() * 255.0f));
        float translationY = j3Var.getTranslationY() + j3Var.getY() + j3Var.getHeight();
        drawable.setBounds(rect.left, (int) translationY, getWidth() - rect.right, (int) (translationY + drawable.getIntrinsicHeight()));
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        m3 m3Var = this.p0;
        if (view != m3Var.w || !m3Var.i0 || m3Var.k0 <= 0 || m3Var.j0 <= 0) {
            z10 = false;
        } else {
            canvas.save();
            canvas.clipRect(view.getX(), view.getY(), view.getX() + AndroidUtilities.lerp(m3Var.j0, view.getWidth(), m3Var.h0), view.getY() + AndroidUtilities.lerp(m3Var.k0, view.getHeight(), m3Var.h0));
            z10 = true;
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (z10) {
            canvas.restore();
        }
        return drawChild;
    }

    @Override // org.telegram.ui.ActionBar.z3
    public RectF getRect() {
        d3 d3Var = this.p0.w;
        float left = d3Var.getLeft();
        float translationY = d3Var.getTranslationY() + AndroidUtilities.dp(24.0f);
        float right = d3Var.getRight();
        float height = getHeight();
        RectF rectF = this.n0;
        rectF.set(left, translationY, right, height);
        return rectF;
    }

    @Override // org.telegram.ui.Components.ww0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qc.a(this, new k8(3));
    }

    @Override // org.telegram.ui.Components.ww0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qc.h(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        m3 m3Var = this.p0;
        Paint paint = m3Var.U;
        Paint paint2 = m3Var.Q;
        d3 d3Var = m3Var.w;
        if (this.m0) {
            return;
        }
        super.onDraw(canvas);
        if (m3Var.t0.getVisibility() != 0) {
            canvas.save();
            me meVar = m3Var.v;
            if (meVar != null) {
                int width = getWidth();
                getHeight();
                canvas2 = canvas;
                meVar.s(canvas2, false, false, width, 1.0f - m3Var.g0);
            } else {
                canvas2 = canvas;
            }
            if (!m3Var.W) {
                int w02 = y6.w0(y6.d6, m3Var.F);
                paint2.setColor(w02);
                m3Var.y.setFlickerViewColor(w02);
                org.telegram.ui.c3 c3Var = m3Var.Y0;
                if (c3Var != null) {
                    c3Var.b(AndroidUtilities.computePerceivedBrightness(paint2.getColor()) <= 0.721f, false);
                    m3Var.Y0.setBackgroundColor(paint2.getColor());
                }
            }
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas2.drawRect(rectF, m3Var.P);
            org.telegram.ui.ActionBar.s3 s3Var = m3Var.s;
            int i10 = s3Var != null ? (int) s3Var.G : 0;
            paint.setColor(m3Var.R);
            float dp = AndroidUtilities.dp(16.0f) * (AndroidUtilities.isTablet() ? 1.0f : 1.0f - m3Var.c);
            rectF.set(AndroidUtilities.lerp(d3Var.getLeft(), 0, m3Var.g0), AndroidUtilities.lerp(d3Var.getTranslationY(), 0.0f, m3Var.c), d3Var.getRight(), d3Var.getTranslationY() + AndroidUtilities.dp(24.0f) + dp);
            canvas2.drawRoundRect(rectF, dp, dp, paint);
            rectF.set(AndroidUtilities.lerp(d3Var.getLeft(), 0, m3Var.g0), d3Var.getTranslationY() + AndroidUtilities.dp(24.0f), AndroidUtilities.lerp(d3Var.getRight(), getWidth(), m3Var.g0), getHeight() - i10);
            canvas2.drawRect(rectF, paint2);
            canvas2.restore();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        m3 m3Var = this.p0;
        d3 d3Var = m3Var.w;
        if (motionEvent.getAction() != 0 || (motionEvent.getY() > AndroidUtilities.lerp(d3Var.getTranslationY() + AndroidUtilities.dp(24.0f), 0.0f, m3Var.c) && motionEvent.getX() <= d3Var.getRight() && motionEvent.getX() >= d3Var.getLeft())) {
            return super.onTouchEvent(motionEvent);
        }
        m3Var.k(true);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.z3
    public void setDrawingFromOverlay(boolean z10) {
        if (this.m0 != z10) {
            this.m0 = z10;
            invalidate();
            m3 m3Var = this.p0;
            m3Var.H();
            LaunchActivity launchActivity = LaunchActivity.I1;
            if (launchActivity == null || !m3Var.e0) {
                return;
            }
            launchActivity.E0(m3Var.S);
        }
    }

    @Override // org.telegram.ui.Components.ww0, org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        int w02;
        m3 m3Var = this.p0;
        Paint paint = m3Var.Q;
        l3 l3Var = m3Var.f;
        j3 j3Var = m3Var.X;
        u6 u6Var = m3Var.F;
        if (j3Var == null || l3Var == null) {
            return;
        }
        try {
            if (m3Var.y != null && paint != null) {
                if (!m3Var.V) {
                    int i10 = m3Var.v0;
                    if (i10 < 0) {
                        i10 = y6.d6;
                    }
                    int w03 = y6.w0(i10, u6Var);
                    int i11 = m3Var.R;
                    if (w03 != i11) {
                        m3Var.R = w03;
                        if ((j3Var.getBackground() instanceof ColorDrawable) && ((ColorDrawable) j3Var.getBackground()).getColor() == i11) {
                            j3Var.setBackgroundColor(m3Var.R);
                        }
                    }
                }
                if (m3Var.I0 && m3Var.m0 != null && (w02 = y6.w0(y6.a7, u6Var)) != m3Var.S) {
                    m3Var.z(w02, false);
                    m3Var.I0 = true;
                }
                if (m3Var.a == m3Var.b) {
                    int x02 = y6.x0(null, y6.Ii, false);
                    m3Var.b = x02;
                    m3Var.a = x02;
                }
                int color = paint.getColor();
                if (!m3Var.V) {
                    color = (((((((((((color * 31) + y6.w0(y6.G6, u6Var)) * 31) + y6.w0(y6.u8, u6Var)) * 31) + y6.w0(y6.G8, u6Var)) * 31) + y6.w0(y6.E8, u6Var)) * 31) + y6.w0(y6.F8, u6Var)) * 31) + y6.w0(y6.I5, u6Var);
                }
                if (!m3Var.J0 || color != m3Var.K0) {
                    m3Var.J0 = true;
                    m3Var.K0 = color;
                    m3Var.B();
                }
                m3Var.F();
                l3Var.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.z3
    public final float y(Canvas canvas, RectF rectF, float f7, RectF rectF2, float f10) {
        m3 m3Var = this.p0;
        d3 d3Var = m3Var.w;
        float left = d3Var.getLeft();
        float translationY = d3Var.getTranslationY() + AndroidUtilities.dp(24.0f);
        float right = d3Var.getRight();
        float height = getHeight();
        RectF rectF3 = this.n0;
        rectF3.set(left, translationY, right, height);
        AndroidUtilities.lerpCentered(rectF3, rectF, f7, rectF2);
        canvas.save();
        Path path = this.o0;
        path.rewind();
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(16.0f) * (AndroidUtilities.isTablet() ? 1.0f : 1.0f - m3Var.c), AndroidUtilities.dp(18.0f), f7);
        path.addRoundRect(rectF2, lerp, lerp, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawPaint(m3Var.Q);
        if (d3Var != null) {
            canvas.save();
            canvas.translate(rectF2.left, (f7 * AndroidUtilities.dp(51.0f)) + Math.max(d3Var.getY(), rectF2.top));
            d3Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
        return lerp;
    }
}
