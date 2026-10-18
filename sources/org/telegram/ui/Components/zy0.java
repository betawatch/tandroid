package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class zy0 {
    public final int a;
    public final org.telegram.ui.Cells.w0 b;
    public final org.telegram.ui.ActionBar.d6 c;
    public final uj0 d;
    public TL_account.TL_birthday e;
    public d11 f;
    public d11[] g;
    public d11[] h;
    public boolean i;
    public d11 j;
    public final RectF k = new RectF();
    public final Paint l = new Paint(1);
    public final yc m;

    public zy0(int i10, org.telegram.ui.Cells.w0 w0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        this.a = i10;
        this.b = w0Var;
        this.c = d6Var;
        uj0 uj0Var = new uj0(R.raw.cake, AndroidUtilities.dp(66.0f), AndroidUtilities.dp(66.0f), true, null);
        this.d = uj0Var;
        uj0Var.H(false);
        this.m = new yc(w0Var);
    }

    public final void a(Canvas canvas) {
        int dp = AndroidUtilities.dp(66.0f);
        org.telegram.ui.Cells.w0 w0Var = this.b;
        int width = (w0Var.getWidth() - dp) / 2;
        int dp2 = AndroidUtilities.dp(13.0f) + dp;
        uj0 uj0Var = this.d;
        uj0Var.setBounds(width, AndroidUtilities.dp(13.0f), width + dp, dp2);
        uj0Var.draw(canvas);
        this.f.c((w0Var.getWidth() - this.f.l()) / 2.0f, AndroidUtilities.dp(19.0f) + dp, 1.0f, -1, canvas);
        int j10 = (int) (this.f.j() + AndroidUtilities.dp(19.0f) + dp + AndroidUtilities.dp(17.0f));
        int i10 = 0;
        for (int i11 = 0; i11 < this.g.length; i11++) {
            i10 = (int) (Math.max(this.g[i11].l(), this.h[i11].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f) + i10);
        }
        int width2 = (w0Var.getWidth() - i10) / 2;
        int i12 = 0;
        while (i12 < this.g.length) {
            float max = Math.max(this.g[i12].l(), this.h[i12].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f);
            float f7 = width2;
            float f10 = (max / 2.0f) + f7;
            int i13 = (int) (f7 + max);
            d11 d11Var = this.g[i12];
            d11Var.c(f10 - (d11Var.l() / 2.0f), j10, 0.75f, -1, canvas);
            d11 d11Var2 = this.h[i12];
            d11Var2.c(f10 - (d11Var2.l() / 2.0f), AndroidUtilities.dp(16.0f) + j10, 1.0f, -1, canvas);
            i12++;
            width2 = i13;
        }
        if (this.i) {
            int dp3 = AndroidUtilities.dp(38.0f) + j10;
            canvas.save();
            float l4 = this.j.l() + AndroidUtilities.dp(26.0f);
            float dp4 = AndroidUtilities.dp(30.0f);
            float f11 = dp3;
            RectF rectF = this.k;
            rectF.set((w0Var.getWidth() - l4) / 2.0f, f11, (w0Var.getWidth() + l4) / 2.0f, f11 + dp4);
            float a2 = this.m.a(0.1f);
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            float f12 = dp4 / 2.0f;
            canvas.drawRoundRect(rectF, f12, f12, this.l);
            this.j.c(rectF.left + AndroidUtilities.dp(13.0f), rectF.centerY(), 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final void b() {
        f5.l(this.b.getContext(), LocaleController.getString(R.string.DateOfBirth), LocaleController.getString(R.string.DateOfBirthAddToProfile), this.e, new z2(this, 12), null, true, false, this.c).a.show();
    }

    public final void c(MessageObject messageObject) {
        TLRPC.TL_messageActionSuggestBirthday tL_messageActionSuggestBirthday = (TLRPC.TL_messageActionSuggestBirthday) messageObject.messageOwner.action;
        this.e = tL_messageActionSuggestBirthday.birthday;
        d11 d11Var = new d11(TextUtils.concat(messageObject.messageText, ":"), 13.0f, null);
        d11Var.n(6);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        d11Var.a();
        d11Var.q(AndroidUtilities.dp(174.0f) - AndroidUtilities.dp(32.0f));
        this.f = d11Var;
        int i10 = (tL_messageActionSuggestBirthday.birthday.flags & 1) != 0 ? 3 : 2;
        d11[] d11VarArr = new d11[i10];
        this.g = d11VarArr;
        this.h = new d11[i10];
        d11VarArr[0] = new d11(LocaleController.getString(R.string.DateDay), 11.0f, null);
        this.h[0] = new d11("" + tL_messageActionSuggestBirthday.birthday.day, 11.0f, AndroidUtilities.bold());
        this.g[1] = new d11(LocaleController.getString(R.string.DateMonth), 11.0f, null);
        d11[] d11VarArr2 = this.h;
        StringBuilder sb2 = new StringBuilder("");
        int i11 = tL_messageActionSuggestBirthday.birthday.month - 1;
        sb2.append((i11 < 0 || i11 >= 12) ? i2.d.j(i11, "") : LocaleController.getString(new int[]{R.string.January, R.string.February, R.string.March, R.string.April, R.string.May, R.string.June, R.string.July, R.string.August, R.string.September, R.string.October, R.string.November, R.string.December}[i11]));
        d11VarArr2[1] = new d11(sb2.toString(), 11.0f, AndroidUtilities.bold());
        if ((tL_messageActionSuggestBirthday.birthday.flags & 1) != 0) {
            this.g[2] = new d11(LocaleController.getString(R.string.DateYear), 11.0f, null);
            this.h[2] = new d11("" + tL_messageActionSuggestBirthday.birthday.year, 11.0f, AndroidUtilities.bold());
        }
        this.i = !messageObject.isOutOwner();
        org.telegram.ui.ActionBar.d6 d6Var = this.c;
        this.l.setColor(org.telegram.ui.ActionBar.h6.m1(0.12f, d6Var != null ? d6Var.a() : org.telegram.ui.ActionBar.h6.I.q() ? -1 : -16777216));
        this.j = new d11(LocaleController.getString(R.string.SuggestedDateOfBirthView), 14.0f, AndroidUtilities.bold());
    }
}
