package ki;

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
import org.telegram.messenger.gd;
import org.telegram.messenger.j6;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.wu0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class z extends View implements c6 {
    public final org.telegram.ui.Cells.y E;
    public boolean F;
    public int G;
    public mh0 H;
    public int I;
    public int J;
    public final RectF a;
    public final Paint b;
    public final TextPaint c;
    public final w d;
    public final mh0 e;
    public boolean f;
    public float h;
    public String n;
    public StaticLayout r;
    public float s;
    public boolean w;
    public boolean x;
    public boolean y;

    public z(Context context) {
        super(context);
        this.a = new RectF();
        this.b = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        w wVar = new w(this);
        this.d = wVar;
        mh0 mh0Var = new mh0(R.raw.bot_webview_sheet_to_cross, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
        this.e = mh0Var;
        this.n = gd.M0(2131752880, null);
        this.F = true;
        updateColors();
        wVar.n = true;
        wVar.h = false;
        wVar.a(false, 0.0f);
        wVar.setCallback(this);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        wVar.a.setStrokeCap(Paint.Cap.ROUND);
        wVar.l = true;
        int L = org.telegram.messenger.g0.L(16.0f);
        int x02 = n6.x0(null, n6.Hi, false);
        this.G = x02;
        org.telegram.ui.Cells.y k02 = n6.k0(L, L, L, L, 0, x02, x02);
        this.E = k02;
        k02.setCallback(this);
        mh0Var.setCallback(this);
        mh0Var.R(this);
        setContentDescription(gd.M0(2131754917, "AccDescrBotMenu"));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(n6.Uf));
        hashSet.add(Integer.valueOf(n6.Wf));
        hashSet.add(Integer.valueOf(n6.Hi));
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
                    interpolation = lr.f.getInterpolation(this.h);
                    if (z10 && interpolation > 0.0f) {
                        this.c.setAlpha((int) (255.0f * interpolation));
                    }
                    if (this.F) {
                        this.a.set(0.0f, 0.0f, n10.b(this.s, org.telegram.messenger.g0.L(4.0f), interpolation, org.telegram.messenger.g0.L(40.0f)), getMeasuredHeight());
                        canvas.drawRoundRect(this.a, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), this.b);
                        int x02 = n6.x0(null, n6.Hi, false);
                        if (x02 != this.G) {
                            org.telegram.ui.Cells.y yVar = this.E;
                            this.G = x02;
                            n6.H1(yVar, x02, true);
                        }
                        org.telegram.ui.Cells.y yVar2 = this.E;
                        RectF rectF = this.a;
                        yVar2.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        this.E.draw(canvas);
                    }
                    if (this.x) {
                        canvas.save();
                        canvas.translate(org.telegram.messenger.g0.L(9.5f), org.telegram.messenger.g0.L(6.0f));
                        mh0 mh0Var = this.e;
                        mh0Var.setBounds(0, 0, mh0Var.b, mh0Var.c);
                        mh0Var.draw(canvas);
                        canvas.restore();
                        if (mh0Var.l0) {
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
                    interpolation = lr.f.getInterpolation(this.h);
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
            interpolation = lr.f.getInterpolation(this.h);
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
    public final void onMeasure(int i7, int i10) {
        int size = (View.MeasureSpec.getSize(i10) + View.MeasureSpec.getSize(i7)) << 16;
        if (this.J != size || this.r == null) {
            this.d.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float L = org.telegram.messenger.g0.L(15.0f);
            TextPaint textPaint = this.c;
            textPaint.setTextSize(L);
            this.J = size;
            int i11 = (int) (org.telegram.messenger.g0.q.x * 0.6f);
            StaticLayout c10 = wu0.c(j6.m(this.n, textPaint.getFontMetricsInt(), false, null, 0), textPaint, i11, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, i11, 1, true);
            this.r = c10;
            this.s = c10.getLineCount() > 0 ? this.r.getLineWidth(0) : 0.0f;
        }
        org.telegram.messenger.g0.L(4.0f);
        int L2 = org.telegram.messenger.g0.L(40.0f);
        if (this.f) {
            L2 = org.telegram.messenger.f3.C(4.0f, (int) this.s, L2);
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
            mh0 mh0Var = this.e;
            mh0Var.stop();
            mh0Var.h = true;
            mh0Var.P(z10 ? mh0Var.e[0] : 1);
            mh0Var.start();
            this.y = z10;
        }
    }

    public void setWebView(boolean z10) {
        this.x = z10;
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        TextPaint textPaint = this.c;
        try {
            this.b.setColor(n6.x0(null, n6.Uf, false));
            int x02 = n6.x0(null, n6.Wf, false);
            w wVar = this.d;
            wVar.k = x02;
            wVar.j = x02;
            mh0 mh0Var = this.e;
            if (mh0Var != null) {
                if (mh0Var == this.H) {
                    if (x02 != this.I) {
                    }
                }
                this.H = mh0Var;
                this.I = x02;
                mh0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
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
