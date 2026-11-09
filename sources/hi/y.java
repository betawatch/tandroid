package hi;

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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.i6;
import org.telegram.messenger.id;
import org.telegram.messenger.k5;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.ou0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class y extends View implements b6 {
    public final org.telegram.ui.Cells.y D;
    public boolean E;
    public int F;
    public ah0 G;
    public int H;
    public int I;
    public final RectF a;
    public final Paint b;
    public final TextPaint c;
    public final v d;
    public final ah0 e;
    public boolean f;
    public float h;
    public String n;
    public StaticLayout r;
    public float s;
    public boolean w;
    public boolean x;
    public boolean y;

    public y(Context context) {
        super(context);
        this.a = new RectF();
        this.b = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        v vVar = new v(this);
        this.d = vVar;
        ah0 ah0Var = new ah0(R.raw.bot_webview_sheet_to_cross, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
        this.e = ah0Var;
        this.n = id.M0(2131752891, null);
        this.E = true;
        updateColors();
        vVar.n = true;
        vVar.h = false;
        vVar.a(false, 0.0f);
        vVar.setCallback(this);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        vVar.a.setStrokeCap(Paint.Cap.ROUND);
        vVar.l = true;
        int L = org.telegram.messenger.g0.L(16.0f);
        int x02 = l6.x0(null, l6.Ei, false);
        this.F = x02;
        org.telegram.ui.Cells.y k02 = l6.k0(L, L, L, L, 0, x02, x02);
        this.D = k02;
        k02.setCallback(this);
        ah0Var.setCallback(this);
        ah0Var.R(this);
        setContentDescription(id.M0(2131754917, "AccDescrBotMenu"));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(l6.Rf));
        hashSet.add(Integer.valueOf(l6.Tf));
        hashSet.add(Integer.valueOf(l6.Ei));
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
        boolean z9;
        float interpolation;
        if (this.r != null) {
            boolean z10 = this.f;
            if (z10) {
                float f10 = this.h;
                if (f10 != 1.0f) {
                    float f11 = f10 + 0.10666667f;
                    this.h = f11;
                    if (f11 > 1.0f) {
                        this.h = 1.0f;
                    } else {
                        invalidate();
                    }
                    z9 = true;
                    interpolation = xq.f.getInterpolation(this.h);
                    if (z9 && interpolation > 0.0f) {
                        this.c.setAlpha((int) (255.0f * interpolation));
                    }
                    if (this.E) {
                        this.a.set(0.0f, 0.0f, org.telegram.messenger.camera.q.b(this.s, org.telegram.messenger.g0.L(4.0f), interpolation, org.telegram.messenger.g0.L(40.0f)), getMeasuredHeight());
                        canvas.drawRoundRect(this.a, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), this.b);
                        int x02 = l6.x0(null, l6.Ei, false);
                        if (x02 != this.F) {
                            org.telegram.ui.Cells.y yVar = this.D;
                            this.F = x02;
                            l6.H1(yVar, x02, true);
                        }
                        org.telegram.ui.Cells.y yVar2 = this.D;
                        RectF rectF = this.a;
                        yVar2.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        this.D.draw(canvas);
                    }
                    if (this.x) {
                        canvas.save();
                        canvas.translate(org.telegram.messenger.g0.L(9.5f), org.telegram.messenger.g0.L(6.0f));
                        ah0 ah0Var = this.e;
                        ah0Var.setBounds(0, 0, ah0Var.b, ah0Var.c);
                        ah0Var.draw(canvas);
                        canvas.restore();
                        if (ah0Var.k0) {
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
                    if (z9) {
                        org.telegram.messenger.g0.L(4.0f);
                    }
                }
            }
            if (!z10) {
                float f12 = this.h;
                if (f12 != 0.0f) {
                    float f13 = f12 - 0.10666667f;
                    this.h = f13;
                    if (f13 < 0.0f) {
                        this.h = 0.0f;
                    } else {
                        invalidate();
                    }
                    z9 = true;
                    interpolation = xq.f.getInterpolation(this.h);
                    if (z9) {
                        this.c.setAlpha((int) (255.0f * interpolation));
                    }
                    if (this.E) {
                    }
                    if (this.x) {
                    }
                    if (interpolation > 0.0f) {
                    }
                    if (z9) {
                    }
                }
            }
            z9 = false;
            interpolation = xq.f.getInterpolation(this.h);
            if (z9) {
            }
            if (this.E) {
            }
            if (this.x) {
            }
            if (interpolation > 0.0f) {
            }
            if (z9) {
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.D.setState(getDrawableState());
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.D.jumpToCurrentState();
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = (View.MeasureSpec.getSize(i10) + View.MeasureSpec.getSize(i7)) << 16;
        if (this.I != size || this.r == null) {
            this.d.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float L = org.telegram.messenger.g0.L(15.0f);
            TextPaint textPaint = this.c;
            textPaint.setTextSize(L);
            this.I = size;
            int i11 = (int) (org.telegram.messenger.g0.q.x * 0.6f);
            StaticLayout c10 = ou0.c(i6.m(this.n, textPaint.getFontMetricsInt(), false, null, 0), textPaint, i11, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, i11, 1, true);
            this.r = c10;
            this.s = c10.getLineCount() > 0 ? this.r.getLineWidth(0) : 0.0f;
        }
        org.telegram.messenger.g0.L(4.0f);
        int L2 = org.telegram.messenger.g0.L(40.0f);
        if (this.f) {
            L2 = k5.C(4.0f, (int) this.s, L2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(L2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), TLObject.FLAG_30));
    }

    public void setDrawBackgroundDrawable(boolean z9) {
        this.E = z9;
        invalidate();
    }

    public void setOpened(boolean z9) {
        if (this.w != z9) {
            this.w = z9;
        }
        if (!this.x) {
            this.d.a(true, z9 ? 1.0f : 0.0f);
            return;
        }
        if (this.y != z9) {
            ah0 ah0Var = this.e;
            ah0Var.stop();
            ah0Var.h = true;
            ah0Var.P(z9 ? ah0Var.e[0] : 1);
            ah0Var.start();
            this.y = z9;
        }
    }

    public void setWebView(boolean z9) {
        this.x = z9;
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        TextPaint textPaint = this.c;
        try {
            this.b.setColor(l6.x0(null, l6.Rf, false));
            int x02 = l6.x0(null, l6.Tf, false);
            v vVar = this.d;
            vVar.k = x02;
            vVar.j = x02;
            ah0 ah0Var = this.e;
            if (ah0Var != null) {
                if (ah0Var == this.G) {
                    if (x02 != this.H) {
                    }
                }
                this.G = ah0Var;
                this.H = x02;
                ah0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
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
        return super.verifyDrawable(drawable) || this.D == drawable;
    }
}
