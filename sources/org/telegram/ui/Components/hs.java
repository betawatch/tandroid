package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class hs {
    public int a;
    public int b;
    public l01 c;
    public int d;
    public int e;

    public static hs b(org.telegram.ui.Cells.r2 r2Var, MessagesController.DialogFilter dialogFilter) {
        hs hsVar = new hs();
        hsVar.a = dialogFilter.id;
        hsVar.b = dialogFilter.color;
        String str = dialogFilter.name;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        l01 l01Var = new l01(spannableStringBuilder, 10.0f, AndroidUtilities.bold());
        l01Var.s(r2Var);
        hsVar.c = l01Var;
        hsVar.c.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, l01Var.a.getFontMetricsInt(), false), dialogFilter.entities, hsVar.c.a.getFontMetricsInt()));
        hsVar.c.p(26);
        int dp = AndroidUtilities.dp(9.32f);
        l01 l01Var2 = hsVar.c;
        hsVar.e = dp + ((int) l01Var2.c);
        l01Var2.j();
        int[] iArr = org.telegram.ui.ActionBar.k6.r8;
        hsVar.d = org.telegram.ui.ActionBar.k6.w0(null, iArr[dialogFilter.color % iArr.length], false);
        return hsVar;
    }

    public final void a(Canvas canvas) {
        org.telegram.ui.ActionBar.k6.A0.setColor(org.telegram.ui.ActionBar.k6.l1(org.telegram.ui.ActionBar.k6.I.q() ? 0.2f : 0.1f, this.d));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, this.e, AndroidUtilities.dp(14.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.k6.A0);
        this.c.c(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
