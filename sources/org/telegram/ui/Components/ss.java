package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ss {
    public int a;
    public int b;
    public q11 c;
    public int d;
    public boolean e;
    public int f;
    public int g;

    public static ss b(org.telegram.ui.Cells.p2 p2Var, MessagesController.DialogFilter dialogFilter) {
        ss ssVar = new ss();
        ssVar.a = dialogFilter.id;
        ssVar.b = dialogFilter.color;
        String str = dialogFilter.name;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        q11 q11Var = new q11(spannableStringBuilder, 10.0f, AndroidUtilities.bold());
        q11Var.s(p2Var);
        ssVar.c = q11Var;
        ssVar.c.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, q11Var.a.getFontMetricsInt(), false), dialogFilter.entities, ssVar.c.a.getFontMetricsInt()));
        ssVar.c.p(26);
        int dp = AndroidUtilities.dp(9.32f);
        q11 q11Var2 = ssVar.c;
        ssVar.g = dp + ((int) q11Var2.c);
        q11Var2.j();
        int[] iArr = org.telegram.ui.ActionBar.y6.r8;
        int i10 = iArr[dialogFilter.color % iArr.length];
        ssVar.f = i10;
        ssVar.e = true;
        ssVar.d = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
        return ssVar;
    }

    public final void a(Canvas canvas) {
        if (this.e) {
            this.d = org.telegram.ui.ActionBar.y6.x0(null, this.f, false);
        }
        org.telegram.ui.ActionBar.y6.A0.setColor(org.telegram.ui.ActionBar.y6.o1(org.telegram.ui.ActionBar.y6.I.q() ? 0.2f : 0.1f, this.d));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, this.g, AndroidUtilities.dp(14.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.y6.A0);
        this.c.c(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
