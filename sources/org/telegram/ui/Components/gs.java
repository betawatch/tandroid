package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class gs {
    public int a;
    public int b;
    public h01 c;
    public int d;
    public int e;

    public static gs b(org.telegram.ui.Cells.r2 r2Var, MessagesController.DialogFilter dialogFilter) {
        gs gsVar = new gs();
        gsVar.a = dialogFilter.id;
        gsVar.b = dialogFilter.color;
        String str = dialogFilter.name;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        h01 h01Var = new h01(spannableStringBuilder, 10.0f, AndroidUtilities.bold());
        h01Var.s(r2Var);
        gsVar.c = h01Var;
        gsVar.c.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, h01Var.a.getFontMetricsInt(), false), dialogFilter.entities, gsVar.c.a.getFontMetricsInt()));
        gsVar.c.p(26);
        int dp = AndroidUtilities.dp(9.32f);
        h01 h01Var2 = gsVar.c;
        gsVar.e = dp + ((int) h01Var2.c);
        h01Var2.j();
        int[] iArr = org.telegram.ui.ActionBar.j6.r8;
        gsVar.d = org.telegram.ui.ActionBar.j6.w0(null, iArr[dialogFilter.color % iArr.length], false);
        return gsVar;
    }

    public final void a(Canvas canvas) {
        org.telegram.ui.ActionBar.j6.A0.setColor(org.telegram.ui.ActionBar.j6.l1(org.telegram.ui.ActionBar.j6.I.q() ? 0.2f : 0.1f, this.d));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, this.e, AndroidUtilities.dp(14.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.j6.A0);
        this.c.c(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
