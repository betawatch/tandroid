package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ws {
    public int a;
    public int b;
    public l11 c;
    public int d;
    public int e;

    public static ws b(org.telegram.ui.Cells.s2 s2Var, MessagesController.DialogFilter dialogFilter) {
        ws wsVar = new ws();
        wsVar.a = dialogFilter.id;
        wsVar.b = dialogFilter.color;
        String str = dialogFilter.name;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        l11 l11Var = new l11(spannableStringBuilder, 10.0f, AndroidUtilities.bold());
        l11Var.s(s2Var);
        wsVar.c = l11Var;
        wsVar.c.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, l11Var.a.getFontMetricsInt(), false), dialogFilter.entities, wsVar.c.a.getFontMetricsInt()));
        wsVar.c.p(26);
        int dp = AndroidUtilities.dp(9.32f);
        l11 l11Var2 = wsVar.c;
        wsVar.e = dp + ((int) l11Var2.c);
        l11Var2.j();
        int[] iArr = org.telegram.ui.ActionBar.i6.r8;
        wsVar.d = org.telegram.ui.ActionBar.i6.x0(null, iArr[dialogFilter.color % iArr.length], false);
        return wsVar;
    }

    public final void a(Canvas canvas) {
        org.telegram.ui.ActionBar.i6.A0.setColor(org.telegram.ui.ActionBar.i6.m1(org.telegram.ui.ActionBar.i6.I.q() ? 0.2f : 0.1f, this.d));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, this.e, AndroidUtilities.dp(14.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.i6.A0);
        this.c.c(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
