package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class qs {
    public int a;
    public int b;
    public d11 c;
    public int d;
    public int e;

    public static qs b(org.telegram.ui.Cells.r2 r2Var, MessagesController.DialogFilter dialogFilter) {
        qs qsVar = new qs();
        qsVar.a = dialogFilter.id;
        qsVar.b = dialogFilter.color;
        String str = dialogFilter.name;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        d11 d11Var = new d11(spannableStringBuilder, 10.0f, AndroidUtilities.bold());
        d11Var.s(r2Var);
        qsVar.c = d11Var;
        qsVar.c.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, d11Var.a.getFontMetricsInt(), false), dialogFilter.entities, qsVar.c.a.getFontMetricsInt()));
        qsVar.c.p(26);
        int dp = AndroidUtilities.dp(9.32f);
        d11 d11Var2 = qsVar.c;
        qsVar.e = dp + ((int) d11Var2.c);
        d11Var2.j();
        int[] iArr = org.telegram.ui.ActionBar.h6.r8;
        qsVar.d = org.telegram.ui.ActionBar.h6.x0(null, iArr[dialogFilter.color % iArr.length], false);
        return qsVar;
    }

    public final void a(Canvas canvas) {
        org.telegram.ui.ActionBar.h6.A0.setColor(org.telegram.ui.ActionBar.h6.m1(org.telegram.ui.ActionBar.h6.I.q() ? 0.2f : 0.1f, this.d));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, this.e, AndroidUtilities.dp(14.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.h6.A0);
        this.c.c(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
