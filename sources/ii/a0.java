package ii;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.i6;
import org.telegram.messenger.k5;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.lu0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class a0 extends View implements z5 {
    public final org.telegram.ui.Cells.y E;
    public boolean F;
    public int G;
    public ch0 H;
    public int I;
    public int J;
    public final RectF a;
    public final Paint b;
    public final TextPaint c;
    public final x d;
    public final ch0 e;
    public boolean f;
    public float h;
    public String n;
    public StaticLayout r;
    public float s;
    public boolean w;
    public boolean x;
    public boolean y;

    public a0(Context context) {
        super(context);
        this.a = new RectF();
        this.b = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        x xVar = new x(this);
        this.d = xVar;
        ch0 ch0Var = new ch0(R.raw.bot_webview_sheet_to_cross, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
        this.e = ch0Var;
        this.n = bd.M0(2131752891, null);
        this.F = true;
        updateColors();
        xVar.n = true;
        xVar.h = false;
        xVar.a(false, 0.0f);
        xVar.setCallback(this);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        xVar.a.setStrokeCap(Paint.Cap.ROUND);
        xVar.l = true;
        int L = org.telegram.messenger.g0.L(16.0f);
        int x02 = k6.x0(null, k6.Ei, false);
        this.G = x02;
        org.telegram.ui.Cells.y k02 = k6.k0(L, L, L, L, 0, x02, x02);
        this.E = k02;
        k02.setCallback(this);
        ch0Var.setCallback(this);
        ch0Var.R(this);
        setContentDescription(bd.M0(2131754917, "AccDescrBotMenu"));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.Rf));
        hashSet.add(Integer.valueOf(k6.Tf));
        hashSet.add(Integer.valueOf(k6.Ei));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e1  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        float interpolation;
        if (this.r != null) {
            boolean z11 = this.f;
            if (z11) {
                float f10 = this.h;
                if (f10 != 1.0f) {
                    float f11 = f10 + 0.10666667f;
                    this.h = f11;
                    if (f11 > 1.0f) {
                        this.h = 1.0f;
                    } else {
                        invalidate();
                    }
                    z10 = true;
                    interpolation = xq.f.getInterpolation(this.h);
                    if (z10 && interpolation > 0.0f) {
                        this.c.setAlpha((int) (255.0f * interpolation));
                    }
                    if (this.F) {
                        this.a.set(0.0f, 0.0f, org.telegram.messenger.camera.q.b(this.s, org.telegram.messenger.g0.L(4.0f), interpolation, org.telegram.messenger.g0.L(40.0f)), getMeasuredHeight());
                        canvas.drawRoundRect(this.a, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), this.b);
                        int x02 = k6.x0(null, k6.Ei, false);
                        if (x02 != this.G) {
                            org.telegram.ui.Cells.y yVar = this.E;
                            this.G = x02;
                            k6.H1(yVar, x02, true);
                        }
                        org.telegram.ui.Cells.y yVar2 = this.E;
                        RectF rectF = this.a;
                        yVar2.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        this.E.draw(canvas);
                    }
                    if (this.x) {
                        canvas.save();
                        canvas.translate(org.telegram.messenger.g0.L(9.5f), org.telegram.messenger.g0.L(6.0f));
                        ch0 ch0Var = this.e;
                        ch0Var.setBounds(0, 0, ch0Var.b, ch0Var.c);
                        ch0Var.draw(canvas);
                        canvas.restore();
                        if (ch0Var.l0) {
                            invalidate();
                        }
                    } else {
                        canvas.save();
                        canvas.translate(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(4.0f));
                        this.d.draw(canvas);
                        canvas.restore();
                    }
                    if (interpolation > 0.0f) {
                        canvas.save();
                        canvas.translate(org.telegram.messenger.g0.L(34.0f), (getMeasuredHeight() - this.r.getHeight()) / 2.0f);
                        this.r.draw(canvas);
                        canvas.restore();
                    }
                    if (z10) {
                        org.telegram.messenger.g0.L(4.0f);
                    }
                }
            }
            if (!z11) {
                float f12 = this.h;
                if (f12 != 0.0f) {
                    float f13 = f12 - 0.10666667f;
                    this.h = f13;
                    if (f13 < 0.0f) {
                        this.h = 0.0f;
                    } else {
                        invalidate();
                    }
                    z10 = true;
                    interpolation = xq.f.getInterpolation(this.h);
                    if (z10) {
                        this.c.setAlpha((int) (255.0f * interpolation));
                    }
                    if (this.F) {
                    }
                    if (this.x) {
                    }
                    if (interpolation > 0.0f) {
                    }
                    if (z10) {
                    }
                }
            }
            z10 = false;
            interpolation = xq.f.getInterpolation(this.h);
            if (z10) {
            }
            if (this.F) {
            }
            if (this.x) {
            }
            if (interpolation > 0.0f) {
            }
            if (z10) {
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.E.setState(getDrawableState());
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.E.jumpToCurrentState();
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        int size = (View.MeasureSpec.getSize(i10) + View.MeasureSpec.getSize(i3)) << 16;
        if (this.J != size || this.r == null) {
            this.d.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float L = org.telegram.messenger.g0.L(15.0f);
            TextPaint textPaint = this.c;
            textPaint.setTextSize(L);
            this.J = size;
            int i11 = (int) (org.telegram.messenger.g0.q.x * 0.6f);
            StaticLayout c2 = lu0.c(i6.m(this.n, textPaint.getFontMetricsInt(), false, null, 0), textPaint, i11, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, i11, 1, true);
            this.r = c2;
            this.s = c2.getLineCount() > 0 ? this.r.getLineWidth(0) : 0.0f;
        }
        org.telegram.messenger.g0.L(4.0f);
        int L2 = org.telegram.messenger.g0.L(40.0f);
        if (this.f) {
            L2 = k5.C(4.0f, (int) this.s, L2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(L2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), TLObject.FLAG_30));
    }

    public void setDrawBackgroundDrawable(boolean z10) {
        this.F = z10;
        invalidate();
    }

    public void setOpened(boolean z10) {
        if (this.w != z10) {
            this.w = z10;
        }
        if (!this.x) {
            this.d.a(true, z10 ? 1.0f : 0.0f);
            return;
        }
        if (this.y != z10) {
            ch0 ch0Var = this.e;
            ch0Var.stop();
            ch0Var.h = true;
            ch0Var.P(z10 ? ch0Var.e[0] : 1);
            ch0Var.start();
            this.y = z10;
        }
    }

    public void setWebView(boolean z10) {
        this.x = z10;
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        TextPaint textPaint = this.c;
        try {
            this.b.setColor(k6.x0(null, k6.Rf, false));
            int x02 = k6.x0(null, k6.Tf, false);
            x xVar = this.d;
            xVar.k = x02;
            xVar.j = x02;
            ch0 ch0Var = this.e;
            if (ch0Var != null) {
                if (ch0Var == this.H) {
                    if (x02 != this.I) {
                    }
                }
                this.H = ch0Var;
                this.I = x02;
                ch0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            int alpha = textPaint.getAlpha();
            textPaint.setColor(x02);
            if (alpha != 255) {
                textPaint.setAlpha(alpha);
            }
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || this.E == drawable;
    }
}
