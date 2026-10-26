package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class e31 extends Drawable {
    public final TextPaint a;
    public final Paint b;
    public StaticLayout c;
    public float d;
    public int e;
    public int f;
    public Drawable g;
    public int h;
    public final Context i;
    public final org.telegram.ui.ActionBar.u6 j;
    public boolean k;
    public boolean l;
    public boolean m;
    public ColorFilter n;

    public e31(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        this.b = new Paint(1);
        Paint paint = new Paint(1);
        this.d = 0.0f;
        this.e = 0;
        this.f = -1;
        this.i = context;
        this.j = u6Var;
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(Paint.Style.STROKE);
    }

    public static e31 a(int i10) {
        e31 e31Var = new e31(ApplicationLoader.applicationContext, null);
        e31Var.b(i10);
        e31Var.l = true;
        return e31Var;
    }

    public final void b(int i10) {
        String str;
        if (this.f != i10) {
            this.f = i10;
            boolean z10 = this.m;
            Context context = this.i;
            if (z10) {
                this.g = context.getDrawable(R.drawable.msg_autodelete_badge2).mutate();
            } else {
                Drawable mutate = context.getDrawable(i10 == 0 ? R.drawable.msg_mini_autodelete : R.drawable.msg_mini_autodelete_empty).mutate();
                this.g = mutate;
                mutate.setColorFilter(this.n);
            }
            invalidateSelf();
            int i11 = this.f;
            if (i11 >= 1 && i11 < 60) {
                str = ic.a.i(i10, "");
                if (str.length() < 2) {
                    str = org.telegram.messenger.t.h(R.string.SecretChatTimerSeconds, a1.g.u(str));
                }
            } else if (i11 >= 60 && i11 < 3600) {
                str = "" + (i10 / 60);
                if (str.length() < 2) {
                    str = org.telegram.messenger.t.h(R.string.SecretChatTimerMinutes, a1.g.u(str));
                }
            } else if (i11 >= 3600 && i11 < 86400) {
                str = "" + ((i10 / 60) / 60);
                if (str.length() < 2) {
                    str = org.telegram.messenger.t.h(R.string.SecretChatTimerHours, a1.g.u(str));
                }
            } else if (i11 >= 86400 && i11 < 604800) {
                str = "" + (((i10 / 60) / 60) / 24);
                if (str.length() < 2) {
                    str = org.telegram.messenger.t.h(R.string.SecretChatTimerDays, a1.g.u(str));
                }
            } else if (i11 < 2678400) {
                str = "" + ((((i10 / 60) / 60) / 24) / 7);
                if (str.length() < 2) {
                    str = org.telegram.messenger.t.h(R.string.SecretChatTimerWeeks, a1.g.u(str));
                } else if (str.length() > 2) {
                    str = "c";
                }
            } else if (i11 < 31449600) {
                str = "" + ((((i10 / 60) / 60) / 24) / 30);
                if (str.length() < 2) {
                    str = org.telegram.messenger.t.h(R.string.SecretChatTimerMonths, a1.g.u(str));
                }
            } else {
                str = "" + ((((i10 / 60) / 60) / 24) / 364);
                if (str.length() < 2) {
                    str = org.telegram.messenger.t.h(R.string.SecretChatTimerYears, a1.g.u(str));
                }
            }
            String str2 = str;
            float dp = AndroidUtilities.dp(11.0f);
            TextPaint textPaint = this.a;
            textPaint.setTextSize(dp);
            float measureText = textPaint.measureText(str2);
            this.d = measureText;
            if (measureText > AndroidUtilities.dp(13.0f)) {
                textPaint.setTextSize(AndroidUtilities.dp(9.0f));
                this.d = textPaint.measureText(str2);
            }
            if (this.d > AndroidUtilities.dp(13.0f)) {
                textPaint.setTextSize(AndroidUtilities.dp(6.0f));
                this.d = textPaint.measureText(str2);
            }
            try {
                StaticLayout staticLayout = new StaticLayout(str2, textPaint, (int) Math.ceil(this.d), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.c = staticLayout;
                this.e = staticLayout.getHeight();
            } catch (Exception e) {
                this.c = null;
                FileLog.e(e);
            }
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int dp = AndroidUtilities.dp(23.0f);
        int dp2 = AndroidUtilities.dp(23.0f);
        boolean z10 = this.m;
        Paint paint = this.b;
        TextPaint textPaint = this.a;
        org.telegram.ui.ActionBar.u6 u6Var = this.j;
        if (z10) {
            textPaint.setColor(-1);
        } else if (this.l) {
            textPaint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.F8, u6Var));
        } else {
            if (!this.k) {
                paint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.s8, u6Var));
            }
            textPaint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.A8, u6Var));
        }
        if (this.g != null) {
            if (!this.l && !this.m) {
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint);
                int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.A8, u6Var);
                if (this.h != w02) {
                    this.h = w02;
                    this.g.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                }
            }
            if (this.m) {
                this.g.setBounds(getBounds().left, getBounds().top, this.g.getIntrinsicWidth() + getBounds().left, this.g.getIntrinsicHeight() + getBounds().top);
                this.g.draw(canvas);
            } else {
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(getBounds().centerX() - AndroidUtilities.dp(10.5f), getBounds().centerY() - AndroidUtilities.dp(10.5f), this.g.getIntrinsicWidth() + (getBounds().centerX() - AndroidUtilities.dp(10.5f)), this.g.getIntrinsicHeight() + (getBounds().centerY() - AndroidUtilities.dp(10.5f)));
                this.g.setBounds(rect);
                this.g.draw(canvas);
            }
        }
        if (this.f == 0 || this.c == null) {
            return;
        }
        int i10 = AndroidUtilities.density != 3.0f ? 0 : -1;
        canvas.save();
        if (this.m) {
            canvas.translate((float) (((getBounds().width() / 2) - Math.ceil(this.d / 2.0f)) + i10), (getBounds().height() - this.e) / 2.0f);
            this.c.draw(canvas);
        } else {
            canvas.translate(((int) ((dp / 2) - Math.ceil(this.d / 2.0f))) + i10, (dp2 - this.e) / 2.0f);
            this.c.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(23.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(23.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.n = colorFilter;
        if (this.l) {
            this.g.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }
}
