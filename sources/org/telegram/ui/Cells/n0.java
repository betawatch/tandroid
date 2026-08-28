package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.rv0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class n0 {
    public final t1 a;
    public final org.telegram.ui.Components.z8[] b;
    public final ImageReceiver[] c;
    public final TextPaint d;
    public final CharSequence e;
    public StaticLayout f;
    public final boolean g;
    public final Drawable h;
    public final Paint i;
    public final Paint j;
    public final nz0 k;
    public boolean l;
    public boolean m;
    public final pc n;
    public final TLObject o;

    public n0(int i9, t1 t1Var, TLObject[] tLObjectArr, int i10) {
        TLObject tLObject;
        this.d = new TextPaint(1);
        this.i = new Paint(1);
        this.j = new Paint(1);
        new Paint(1);
        this.a = t1Var;
        this.o = tLObjectArr[0];
        this.n = new l0(t1Var, t1Var, 0);
        this.c = new ImageReceiver[3];
        this.b = new org.telegram.ui.Components.z8[3];
        for (int i11 = 0; i11 < 3; i11++) {
            this.c[i11] = new ImageReceiver(t1Var);
            this.c[i11].setParentView(t1Var);
            this.c[i11].setRoundRadius(AndroidUtilities.dp(54.0f));
            this.b[i11] = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
            if (i11 >= tLObjectArr.length || (tLObject = tLObjectArr[i11]) == null) {
                Paint paint = new Paint(1);
                int v = org.telegram.ui.ActionBar.f6.v(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.ra, t1Var.Ed), org.telegram.ui.ActionBar.f6.l1(0.5f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.y6, t1Var.Ed)));
                paint.setColor(v);
                this.c[i11].setImageBitmap(new m0(paint, v));
            } else {
                this.b[i11].j(i9, tLObject);
                this.c[i11].setForUserOrChat(tLObjectArr[i11], this.b[i11]);
            }
        }
        if (t1Var.I0) {
            a();
        }
        this.d.setTextSize(AndroidUtilities.dp(11.0f));
        boolean isPremium = UserConfig.getInstance(t1Var.E7).isPremium();
        this.e = LocaleController.getString(isPremium ? R.string.MoreSimilar : R.string.UnlockSimilar);
        this.i.setStyle(Paint.Style.STROKE);
        this.g = true;
        this.h = isPremium ? null : t1Var.getContext().getResources().getDrawable(R.drawable.mini_switch_lock).mutate();
        if (c(this.o) == null) {
            this.k = null;
        } else {
            this.k = new nz0(j3.r0.l(i10, "+"), 9.33f, AndroidUtilities.bold());
        }
    }

    public static String c(TLObject tLObject) {
        int i9;
        if (tLObject instanceof TLRPC.Chat) {
            int i10 = ((TLRPC.Chat) tLObject).participants_count;
            if (i10 > 1) {
                return LocaleController.formatShortNumber(i10, null);
            }
        } else if ((tLObject instanceof TLRPC.User) && (i9 = ((TLRPC.User) tLObject).bot_active_users) > 1) {
            return LocaleController.formatShortNumber(i9, null);
        }
        return null;
    }

    public final void a() {
        int i9 = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.c;
            if (i9 >= imageReceiverArr.length) {
                return;
            }
            imageReceiverArr[i9].onAttachedToWindow();
            i9++;
        }
    }

    public final void b(Canvas canvas, int i9, float f10) {
        canvas.save();
        float a2 = this.n.a(0.075f);
        float f11 = i9;
        canvas.scale(a2, a2, f11 / 2.0f, AndroidUtilities.dp(99.0f) / 2.0f);
        StaticLayout staticLayout = this.f;
        TextPaint textPaint = this.d;
        if (staticLayout == null || staticLayout.getWidth() != i9) {
            if (Build.VERSION.SDK_INT >= 23) {
                CharSequence charSequence = this.e;
                this.f = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i9).setMaxLines(2).setEllipsize(TextUtils.TruncateAt.END).setBreakStrategy(0).setAlignment(Layout.Alignment.ALIGN_CENTER).build();
            } else {
                this.f = rv0.c(this.e, textPaint, i9, Layout.Alignment.ALIGN_CENTER, 0.0f, false, TextUtils.TruncateAt.END, i9 - AndroidUtilities.dp(16.0f), 2, false);
            }
        }
        if (this.f != null) {
            canvas.save();
            canvas.translate((i9 - this.f.getWidth()) / 2.0f, AndroidUtilities.dp(66.33f));
            int length = this.c.length;
            t1 t1Var = this.a;
            if (length <= 1) {
                textPaint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.ec, t1Var.Ed));
            } else {
                textPaint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.y6, t1Var.Ed));
            }
            textPaint.setAlpha((int) (textPaint.getAlpha() * f10));
            this.f.draw(canvas);
            canvas.restore();
        }
        nz0 nz0Var = this.k;
        if (nz0Var != null) {
            nz0Var.p = i9 - AndroidUtilities.dp(32.0f);
            Drawable drawable = this.h;
            float l10 = (f11 - (nz0Var.l() + AndroidUtilities.dp(drawable != null ? 17.0f : 8.0f))) / 2.0f;
            float dp = AndroidUtilities.dp(54.0f) + AndroidUtilities.dp(4.165f);
            boolean z10 = this.g;
            if (drawable != null) {
                drawable.setBounds((int) ((z10 ? nz0Var.l() + AndroidUtilities.dp(1.33f) : 0.0f) + l10 + AndroidUtilities.dp(3.0f)), (int) ll.c(drawable.getIntrinsicHeight(), 2.0f, 0.625f, dp), (int) ((drawable.getIntrinsicWidth() * 0.625f) + (z10 ? AndroidUtilities.dp(1.33f) + nz0Var.l() : 0.0f) + l10 + AndroidUtilities.dp(3.0f)), (int) j2.b(drawable.getIntrinsicHeight(), 2.0f, 0.625f, dp));
                drawable.draw(canvas);
            }
            this.k.c(l10 + AndroidUtilities.dp(!z10 ? 12.66f : 4.0f), dp, f10, -1, canvas);
        }
        canvas.restore();
    }

    public n0(int i9, t1 t1Var, TLObject tLObject) {
        CharSequence charSequence;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.i = new Paint(1);
        this.j = new Paint(1);
        new Paint(1);
        this.a = t1Var;
        this.o = tLObject;
        this.n = new l0(t1Var, t1Var, 1);
        ImageReceiver[] imageReceiverArr = {r3};
        this.c = imageReceiverArr;
        ImageReceiver imageReceiver = new ImageReceiver(t1Var);
        imageReceiver.setParentView(t1Var);
        imageReceiverArr[0].setRoundRadius(AndroidUtilities.dp(54.0f));
        if (t1Var.I0) {
            a();
        }
        org.telegram.ui.Components.z8[] z8VarArr = {r3};
        this.b = z8VarArr;
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        z8Var.j(i9, tLObject);
        imageReceiverArr[0].setForUserOrChat(tLObject, z8VarArr[0]);
        textPaint.setTextSize(AndroidUtilities.dp(11.0f));
        if (tLObject instanceof TLRPC.Chat) {
            charSequence = ((TLRPC.Chat) tLObject).title;
        } else if (tLObject instanceof TLRPC.User) {
            charSequence = UserObject.getUserName((TLRPC.User) tLObject);
        } else {
            charSequence = "";
        }
        try {
            charSequence = Emoji.replaceEmoji(charSequence, textPaint.getFontMetricsInt(), false);
        } catch (Exception unused) {
        }
        this.e = charSequence;
        this.i.setStyle(Paint.Style.STROKE);
        this.g = false;
        this.h = t1Var.getContext().getResources().getDrawable(R.drawable.mini_reply_user).mutate();
        if (c(tLObject) == null) {
            this.k = null;
        } else {
            this.k = new nz0(c(tLObject), 9.33f, AndroidUtilities.bold());
        }
    }
}
