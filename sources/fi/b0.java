package fi;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.ix0;
import org.telegram.ui.Components.yj0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class b0 extends View {
    public boolean E;
    public int F;
    public final RectF a;
    public final Paint b;
    public final TextPaint c;
    public final y d;
    public final yj0 e;
    public boolean f;
    public float h;
    public String n;
    public StaticLayout r;
    public float s;
    public boolean v;
    public boolean w;
    public boolean x;
    public final org.telegram.ui.Cells.z y;

    public b0(Context context) {
        super(context);
        this.a = new RectF();
        Paint paint = new Paint(1);
        this.b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        y yVar = new y(this);
        this.d = yVar;
        yj0 yj0Var = new yj0(R.raw.bot_webview_sheet_to_cross, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
        this.e = yj0Var;
        this.n = LocaleController.getString(R.string.BotsMenuTitle);
        this.E = true;
        paint.setColor(g6.x0(null, g6.cf, false));
        int x02 = g6.x0(null, g6.ef, false);
        yVar.k = x02;
        yVar.j = x02;
        yj0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
        textPaint.setColor(x02);
        yVar.n = true;
        yVar.h = false;
        yVar.a(0.0f, false);
        yVar.setCallback(this);
        textPaint.setTypeface(AndroidUtilities.bold());
        yVar.a.setStrokeCap(Paint.Cap.ROUND);
        yVar.l = true;
        int dp = AndroidUtilities.dp(16.0f);
        int x03 = g6.x0(null, g6.Qh, false);
        org.telegram.ui.Cells.z j02 = g6.j0(dp, dp, dp, dp, 0, x03, x03);
        this.y = j02;
        j02.setCallback(this);
        yj0Var.setCallback(this);
        yj0Var.R(this);
        setContentDescription(LocaleController.getString("AccDescrBotMenu", R.string.AccDescrBotMenu));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float interpolation;
        if (this.r != null) {
            boolean z10 = this.f;
            boolean z11 = true;
            if (z10) {
                float f7 = this.h;
                if (f7 != 1.0f) {
                    float f10 = f7 + 0.10666667f;
                    this.h = f10;
                    if (f10 > 1.0f) {
                        this.h = 1.0f;
                    } else {
                        invalidate();
                    }
                    interpolation = es.f.getInterpolation(this.h);
                    if (z11 && interpolation > 0.0f) {
                        this.c.setAlpha((int) (255.0f * interpolation));
                    }
                    if (this.E) {
                        this.a.set(0.0f, 0.0f, ((this.s + AndroidUtilities.dp(4.0f)) * interpolation) + AndroidUtilities.dp(40.0f), getMeasuredHeight());
                        canvas.drawRoundRect(this.a, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), this.b);
                        org.telegram.ui.Cells.z zVar = this.y;
                        RectF rectF = this.a;
                        zVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        this.y.draw(canvas);
                    }
                    if (this.w) {
                        canvas.save();
                        canvas.translate(AndroidUtilities.dp(9.5f), AndroidUtilities.dp(6.0f));
                        yj0 yj0Var = this.e;
                        yj0Var.setBounds(0, 0, yj0Var.b, yj0Var.c);
                        yj0Var.draw(canvas);
                        canvas.restore();
                        if (yj0Var.k0) {
                            invalidate();
                        }
                    } else {
                        canvas.save();
                        canvas.translate(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f));
                        this.d.draw(canvas);
                        canvas.restore();
                    }
                    if (interpolation > 0.0f) {
                        canvas.save();
                        canvas.translate(AndroidUtilities.dp(34.0f), (getMeasuredHeight() - this.r.getHeight()) / 2.0f);
                        this.r.draw(canvas);
                        canvas.restore();
                    }
                    if (z11) {
                        AndroidUtilities.dp(4.0f);
                    }
                }
            }
            if (!z10) {
                float f11 = this.h;
                if (f11 != 0.0f) {
                    float f12 = f11 - 0.10666667f;
                    this.h = f12;
                    if (f12 < 0.0f) {
                        this.h = 0.0f;
                    } else {
                        invalidate();
                    }
                    interpolation = es.f.getInterpolation(this.h);
                    if (z11) {
                        this.c.setAlpha((int) (255.0f * interpolation));
                    }
                    if (this.E) {
                    }
                    if (this.w) {
                    }
                    if (interpolation > 0.0f) {
                    }
                    if (z11) {
                    }
                }
            }
            z11 = false;
            interpolation = es.f.getInterpolation(this.h);
            if (z11) {
            }
            if (this.E) {
            }
            if (this.w) {
            }
            if (interpolation > 0.0f) {
            }
            if (z11) {
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.y.setState(getDrawableState());
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.y.jumpToCurrentState();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = (View.MeasureSpec.getSize(i11) + View.MeasureSpec.getSize(i10)) << 16;
        if (this.F != size || this.r == null) {
            this.d.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float dp = AndroidUtilities.dp(15.0f);
            TextPaint textPaint = this.c;
            textPaint.setTextSize(dp);
            this.F = size;
            int i12 = (int) (AndroidUtilities.displaySize.x * 0.6f);
            StaticLayout c10 = ix0.c(Emoji.replaceEmoji(this.n, textPaint.getFontMetricsInt(), false), textPaint, i12, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, i12, 1, true);
            this.r = c10;
            this.s = c10.getLineCount() > 0 ? this.r.getLineWidth(0) : 0.0f;
        }
        AndroidUtilities.dp(4.0f);
        int dp2 = AndroidUtilities.dp(40.0f);
        if (this.f) {
            dp2 = org.telegram.messenger.g0.C(4.0f, (int) this.s, dp2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
    }

    public void setDrawBackgroundDrawable(boolean z10) {
        this.E = z10;
        invalidate();
    }

    public void setOpened(boolean z10) {
        if (this.v != z10) {
            this.v = z10;
        }
        if (!this.w) {
            this.d.a(z10 ? 1.0f : 0.0f, true);
            return;
        }
        if (this.x != z10) {
            yj0 yj0Var = this.e;
            yj0Var.stop();
            yj0Var.h = true;
            yj0Var.P(z10 ? yj0Var.e[0] : 1);
            yj0Var.start();
            this.x = z10;
        }
    }

    public void setWebView(boolean z10) {
        this.w = z10;
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || this.y == drawable;
    }
}
