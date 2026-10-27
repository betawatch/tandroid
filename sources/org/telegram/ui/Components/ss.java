package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ss {
    public int a;
    public int b;
    public r11 c;
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
        r11 r11Var = new r11(spannableStringBuilder, 10.0f, AndroidUtilities.bold());
        r11Var.s(p2Var);
        ssVar.c = r11Var;
        ssVar.c.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, r11Var.a.getFontMetricsInt(), false), dialogFilter.entities, ssVar.c.a.getFontMetricsInt()));
        ssVar.c.p(26);
        int dp = AndroidUtilities.dp(9.32f);
        r11 r11Var2 = ssVar.c;
        ssVar.g = dp + ((int) r11Var2.c);
        r11Var2.j();
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
