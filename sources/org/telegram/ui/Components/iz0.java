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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class iz0 {
    public final int a;
    public final org.telegram.ui.Cells.w0 b;
    public final org.telegram.ui.ActionBar.e6 c;
    public final ck0 d;
    public TL_account.TL_birthday e;
    public l11 f;
    public l11[] g;
    public l11[] h;
    public boolean i;
    public l11 j;
    public final RectF k = new RectF();
    public final Paint l = new Paint(1);
    public final bd m;

    public iz0(int i10, org.telegram.ui.Cells.w0 w0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.a = i10;
        this.b = w0Var;
        this.c = e6Var;
        ck0 ck0Var = new ck0(R.raw.cake, AndroidUtilities.dp(66.0f), AndroidUtilities.dp(66.0f), true, null);
        this.d = ck0Var;
        ck0Var.H(false);
        this.m = new bd(w0Var);
    }

    public final void a(Canvas canvas) {
        int dp = AndroidUtilities.dp(66.0f);
        org.telegram.ui.Cells.w0 w0Var = this.b;
        int width = (w0Var.getWidth() - dp) / 2;
        int dp2 = AndroidUtilities.dp(13.0f) + dp;
        ck0 ck0Var = this.d;
        ck0Var.setBounds(width, AndroidUtilities.dp(13.0f), width + dp, dp2);
        ck0Var.draw(canvas);
        this.f.c((w0Var.getWidth() - this.f.l()) / 2.0f, AndroidUtilities.dp(19.0f) + dp, 1.0f, -1, canvas);
        int j3 = (int) (this.f.j() + AndroidUtilities.dp(19.0f) + dp + AndroidUtilities.dp(17.0f));
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
            l11 l11Var = this.g[i12];
            l11Var.c(f10 - (l11Var.l() / 2.0f), j3, 0.75f, -1, canvas);
            l11 l11Var2 = this.h[i12];
            l11Var2.c(f10 - (l11Var2.l() / 2.0f), AndroidUtilities.dp(16.0f) + j3, 1.0f, -1, canvas);
            i12++;
            width2 = i13;
        }
        if (this.i) {
            int dp3 = AndroidUtilities.dp(38.0f) + j3;
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
        g5.l(this.b.getContext(), LocaleController.getString(R.string.DateOfBirth), LocaleController.getString(R.string.DateOfBirthAddToProfile), this.e, new a3(this, 12), null, true, false, this.c).a.show();
    }

    public final void c(MessageObject messageObject) {
        TLRPC.TL_messageActionSuggestBirthday tL_messageActionSuggestBirthday = (TLRPC.TL_messageActionSuggestBirthday) messageObject.messageOwner.action;
        this.e = tL_messageActionSuggestBirthday.birthday;
        l11 l11Var = new l11(TextUtils.concat(messageObject.messageText, ":"), 13.0f, null);
        l11Var.n(6);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        l11Var.a();
        l11Var.q(AndroidUtilities.dp(174.0f) - AndroidUtilities.dp(32.0f));
        this.f = l11Var;
        int i10 = (tL_messageActionSuggestBirthday.birthday.flags & 1) != 0 ? 3 : 2;
        l11[] l11VarArr = new l11[i10];
        this.g = l11VarArr;
        this.h = new l11[i10];
        l11VarArr[0] = new l11(LocaleController.getString(R.string.DateDay), 11.0f, null);
        this.h[0] = new l11("" + tL_messageActionSuggestBirthday.birthday.day, 11.0f, AndroidUtilities.bold());
        this.g[1] = new l11(LocaleController.getString(R.string.DateMonth), 11.0f, null);
        l11[] l11VarArr2 = this.h;
        StringBuilder sb2 = new StringBuilder("");
        int i11 = tL_messageActionSuggestBirthday.birthday.month - 1;
        sb2.append((i11 < 0 || i11 >= 12) ? hg.c.h(i11, "") : LocaleController.getString(new int[]{R.string.January, R.string.February, R.string.March, R.string.April, R.string.May, R.string.June, R.string.July, R.string.August, R.string.September, R.string.October, R.string.November, R.string.December}[i11]));
        l11VarArr2[1] = new l11(sb2.toString(), 11.0f, AndroidUtilities.bold());
        if ((tL_messageActionSuggestBirthday.birthday.flags & 1) != 0) {
            this.g[2] = new l11(LocaleController.getString(R.string.DateYear), 11.0f, null);
            this.h[2] = new l11("" + tL_messageActionSuggestBirthday.birthday.year, 11.0f, AndroidUtilities.bold());
        }
        this.i = !messageObject.isOutOwner();
        org.telegram.ui.ActionBar.e6 e6Var = this.c;
        this.l.setColor(org.telegram.ui.ActionBar.i6.m1(0.12f, e6Var != null ? e6Var.a() : org.telegram.ui.ActionBar.i6.I.q() ? -1 : -16777216));
        this.j = new l11(LocaleController.getString(R.string.SuggestedDateOfBirthView), 14.0f, AndroidUtilities.bold());
    }
}
