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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.rc;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class n0 {
    public final s1 a;
    public final org.telegram.ui.Components.z8[] b;
    public final ImageReceiver[] c;
    public final TextPaint d;
    public final CharSequence e;
    public StaticLayout f;
    public final boolean g;
    public final Drawable h;
    public final Paint i;
    public final Paint j;
    public final k01 k;
    public boolean l;
    public boolean m;
    public final rc n;
    public final TLObject o;

    public n0(int i10, s1 s1Var, TLObject[] tLObjectArr, int i11) {
        TLObject tLObject;
        this.d = new TextPaint(1);
        this.i = new Paint(1);
        this.j = new Paint(1);
        new Paint(1);
        this.a = s1Var;
        this.o = tLObjectArr[0];
        this.n = new l0(s1Var, s1Var, 0);
        this.c = new ImageReceiver[3];
        this.b = new org.telegram.ui.Components.z8[3];
        for (int i12 = 0; i12 < 3; i12++) {
            this.c[i12] = new ImageReceiver(s1Var);
            this.c[i12].setParentView(s1Var);
            this.c[i12].setRoundRadius(AndroidUtilities.dp(54.0f));
            this.b[i12] = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
            if (i12 >= tLObjectArr.length || (tLObject = tLObjectArr[i12]) == null) {
                Paint paint = new Paint(1);
                int v = org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ra, s1Var.Fd), org.telegram.ui.ActionBar.j6.l1(0.5f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.y6, s1Var.Fd)));
                paint.setColor(v);
                this.c[i12].setImageBitmap(new m0(paint, v));
            } else {
                this.b[i12].j(i10, tLObject);
                this.c[i12].setForUserOrChat(tLObjectArr[i12], this.b[i12]);
            }
        }
        if (s1Var.J0) {
            a();
        }
        this.d.setTextSize(AndroidUtilities.dp(11.0f));
        boolean isPremium = UserConfig.getInstance(s1Var.F7).isPremium();
        this.e = LocaleController.getString(isPremium ? R.string.MoreSimilar : R.string.UnlockSimilar);
        this.i.setStyle(Paint.Style.STROKE);
        this.g = true;
        this.h = isPremium ? null : s1Var.getContext().getResources().getDrawable(R.drawable.mini_switch_lock).mutate();
        if (c(this.o) == null) {
            this.k = null;
        } else {
            this.k = new k01(kf.k0.j(i11, "+"), 9.33f, AndroidUtilities.bold());
        }
    }

    public static String c(TLObject tLObject) {
        int i10;
        if (tLObject instanceof TLRPC.Chat) {
            int i11 = ((TLRPC.Chat) tLObject).participants_count;
            if (i11 > 1) {
                return LocaleController.formatShortNumber(i11, null);
            }
        } else if ((tLObject instanceof TLRPC.User) && (i10 = ((TLRPC.User) tLObject).bot_active_users) > 1) {
            return LocaleController.formatShortNumber(i10, null);
        }
        return null;
    }

    public final void a() {
        int i10 = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.c;
            if (i10 >= imageReceiverArr.length) {
                return;
            }
            imageReceiverArr[i10].onAttachedToWindow();
            i10++;
        }
    }

    public final void b(Canvas canvas, int i10, float f10) {
        canvas.save();
        float a2 = this.n.a(0.075f);
        float f11 = i10;
        canvas.scale(a2, a2, f11 / 2.0f, AndroidUtilities.dp(99.0f) / 2.0f);
        StaticLayout staticLayout = this.f;
        TextPaint textPaint = this.d;
        if (staticLayout == null || staticLayout.getWidth() != i10) {
            if (Build.VERSION.SDK_INT >= 23) {
                CharSequence charSequence = this.e;
                this.f = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10).setMaxLines(2).setEllipsize(TextUtils.TruncateAt.END).setBreakStrategy(0).setAlignment(Layout.Alignment.ALIGN_CENTER).build();
            } else {
                this.f = kw0.c(this.e, textPaint, i10, Layout.Alignment.ALIGN_CENTER, 0.0f, false, TextUtils.TruncateAt.END, i10 - AndroidUtilities.dp(16.0f), 2, false);
            }
        }
        if (this.f != null) {
            canvas.save();
            canvas.translate((i10 - this.f.getWidth()) / 2.0f, AndroidUtilities.dp(66.33f));
            int length = this.c.length;
            s1 s1Var = this.a;
            if (length <= 1) {
                textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ec, s1Var.Fd));
            } else {
                textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.y6, s1Var.Fd));
            }
            textPaint.setAlpha((int) (textPaint.getAlpha() * f10));
            this.f.draw(canvas);
            canvas.restore();
        }
        k01 k01Var = this.k;
        if (k01Var != null) {
            k01Var.p = i10 - AndroidUtilities.dp(32.0f);
            Drawable drawable = this.h;
            float l10 = (f11 - (k01Var.l() + AndroidUtilities.dp(drawable != null ? 17.0f : 8.0f))) / 2.0f;
            float dp = AndroidUtilities.dp(54.0f) + AndroidUtilities.dp(4.165f);
            boolean z4 = this.g;
            if (drawable != null) {
                drawable.setBounds((int) ((z4 ? k01Var.l() + AndroidUtilities.dp(1.33f) : 0.0f) + l10 + AndroidUtilities.dp(3.0f)), (int) org.telegram.messenger.y3.A(drawable.getIntrinsicHeight(), 2.0f, 0.625f, dp), (int) ((drawable.getIntrinsicWidth() * 0.625f) + (z4 ? AndroidUtilities.dp(1.33f) + k01Var.l() : 0.0f) + l10 + AndroidUtilities.dp(3.0f)), (int) vh.w2.c(drawable.getIntrinsicHeight(), 2.0f, 0.625f, dp));
                drawable.draw(canvas);
            }
            this.k.c(l10 + AndroidUtilities.dp(!z4 ? 12.66f : 4.0f), dp, f10, -1, canvas);
        }
        canvas.restore();
    }

    public n0(int i10, s1 s1Var, TLObject tLObject) {
        CharSequence charSequence;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.i = new Paint(1);
        this.j = new Paint(1);
        new Paint(1);
        this.a = s1Var;
        this.o = tLObject;
        this.n = new l0(s1Var, s1Var, 1);
        ImageReceiver[] imageReceiverArr = {r3};
        this.c = imageReceiverArr;
        ImageReceiver imageReceiver = new ImageReceiver(s1Var);
        imageReceiver.setParentView(s1Var);
        imageReceiverArr[0].setRoundRadius(AndroidUtilities.dp(54.0f));
        if (s1Var.J0) {
            a();
        }
        org.telegram.ui.Components.z8[] z8VarArr = {r3};
        this.b = z8VarArr;
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        z8Var.j(i10, tLObject);
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
        this.h = s1Var.getContext().getResources().getDrawable(R.drawable.mini_reply_user).mutate();
        if (c(tLObject) == null) {
            this.k = null;
        } else {
            this.k = new k01(c(tLObject), 9.33f, AndroidUtilities.bold());
        }
    }
}
