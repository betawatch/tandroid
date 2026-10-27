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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.qx0;
import org.telegram.ui.Components.yj0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class i0 extends View implements p6 {
    public boolean E;
    public int F;
    public yj0 G;
    public int H;
    public int I;
    public final RectF a;
    public final Paint b;
    public final TextPaint c;
    public final f0 d;
    public final yj0 e;
    public boolean f;
    public float h;
    public String n;
    public StaticLayout r;
    public float s;
    public boolean v;
    public boolean w;
    public boolean x;
    public final org.telegram.ui.Cells.y y;

    public i0(Context context) {
        super(context);
        this.a = new RectF();
        this.b = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        f0 f0Var = new f0(this);
        this.d = f0Var;
        yj0 yj0Var = new yj0(R.raw.bot_webview_sheet_to_cross, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
        this.e = yj0Var;
        this.n = LocaleController.getString(R.string.BotsMenuTitle);
        this.E = true;
        updateColors();
        f0Var.n = true;
        f0Var.h = false;
        f0Var.a(0.0f, false);
        f0Var.setCallback(this);
        textPaint.setTypeface(AndroidUtilities.bold());
        f0Var.a.setStrokeCap(Paint.Cap.ROUND);
        f0Var.l = true;
        int dp = AndroidUtilities.dp(16.0f);
        int x02 = y6.x0(null, y6.Qh, false);
        this.F = x02;
        org.telegram.ui.Cells.y j02 = y6.j0(dp, dp, dp, dp, 0, x02, x02);
        this.y = j02;
        j02.setCallback(this);
        yj0Var.setCallback(this);
        yj0Var.R(this);
        setContentDescription(LocaleController.getString("AccDescrBotMenu", R.string.AccDescrBotMenu));
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(y6.cf));
        hashSet.add(Integer.valueOf(y6.ef));
        hashSet.add(Integer.valueOf(y6.Qh));
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
                float f7 = this.h;
                if (f7 != 1.0f) {
                    float f10 = f7 + 0.10666667f;
                    this.h = f10;
                    if (f10 > 1.0f) {
                        this.h = 1.0f;
                    } else {
                        invalidate();
                    }
                    z10 = true;
                    interpolation = ds.f.getInterpolation(this.h);
                    if (z10 && interpolation > 0.0f) {
                        this.c.setAlpha((int) (255.0f * interpolation));
                    }
                    if (this.E) {
                        this.a.set(0.0f, 0.0f, wh.a(this.s, AndroidUtilities.dp(4.0f), interpolation, AndroidUtilities.dp(40.0f)), getMeasuredHeight());
                        canvas.drawRoundRect(this.a, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), this.b);
                        int x02 = y6.x0(null, y6.Qh, false);
                        if (x02 != this.F) {
                            org.telegram.ui.Cells.y yVar = this.y;
                            this.F = x02;
                            y6.E1(yVar, x02, true);
                        }
                        org.telegram.ui.Cells.y yVar2 = this.y;
                        RectF rectF = this.a;
                        yVar2.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
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
                    if (z10) {
                        AndroidUtilities.dp(4.0f);
                    }
                }
            }
            if (!z11) {
                float f11 = this.h;
                if (f11 != 0.0f) {
                    float f12 = f11 - 0.10666667f;
                    this.h = f12;
                    if (f12 < 0.0f) {
                        this.h = 0.0f;
                    } else {
                        invalidate();
                    }
                    z10 = true;
                    interpolation = ds.f.getInterpolation(this.h);
                    if (z10) {
                        this.c.setAlpha((int) (255.0f * interpolation));
                    }
                    if (this.E) {
                    }
                    if (this.w) {
                    }
                    if (interpolation > 0.0f) {
                    }
                    if (z10) {
                    }
                }
            }
            z10 = false;
            interpolation = ds.f.getInterpolation(this.h);
            if (z10) {
            }
            if (this.E) {
            }
            if (this.w) {
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
        if (this.I != size || this.r == null) {
            this.d.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float dp = AndroidUtilities.dp(15.0f);
            TextPaint textPaint = this.c;
            textPaint.setTextSize(dp);
            this.I = size;
            int i12 = (int) (AndroidUtilities.displaySize.x * 0.6f);
            StaticLayout c10 = qx0.c(Emoji.replaceEmoji(this.n, textPaint.getFontMetricsInt(), false), textPaint, i12, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, i12, 1, true);
            this.r = c10;
            this.s = c10.getLineCount() > 0 ? this.r.getLineWidth(0) : 0.0f;
        }
        AndroidUtilities.dp(4.0f);
        int dp2 = AndroidUtilities.dp(40.0f);
        if (this.f) {
            dp2 = org.telegram.messenger.t.D(4.0f, (int) this.s, dp2);
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

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        TextPaint textPaint = this.c;
        try {
            this.b.setColor(y6.x0(null, y6.cf, false));
            int x02 = y6.x0(null, y6.ef, false);
            f0 f0Var = this.d;
            f0Var.k = x02;
            f0Var.j = x02;
            yj0 yj0Var = this.e;
            if (yj0Var != null) {
                if (yj0Var == this.G) {
                    if (x02 != this.H) {
                    }
                }
                this.G = yj0Var;
                this.H = x02;
                yj0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            int alpha = textPaint.getAlpha();
            textPaint.setColor(x02);
            if (alpha != 255) {
                textPaint.setAlpha(alpha);
            }
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || this.y == drawable;
    }
}
