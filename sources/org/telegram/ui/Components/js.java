package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class js {
    public int a;
    public int b;
    public f11 c;
    public int d;
    public int e;

    public static js b(org.telegram.ui.Cells.s2 s2Var, MessagesController.DialogFilter dialogFilter) {
        js jsVar = new js();
        jsVar.a = dialogFilter.id;
        jsVar.b = dialogFilter.color;
        String str = dialogFilter.name;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        f11 f11Var = new f11(spannableStringBuilder, 10.0f, AndroidUtilities.bold());
        f11Var.s(s2Var);
        jsVar.c = f11Var;
        jsVar.c.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, f11Var.a.getFontMetricsInt(), false), dialogFilter.entities, jsVar.c.a.getFontMetricsInt()));
        jsVar.c.p(26);
        int dp = AndroidUtilities.dp(9.32f);
        f11 f11Var2 = jsVar.c;
        jsVar.e = dp + ((int) f11Var2.c);
        f11Var2.j();
        int[] iArr = org.telegram.ui.ActionBar.i6.r8;
        jsVar.d = org.telegram.ui.ActionBar.i6.w0(null, iArr[dialogFilter.color % iArr.length], false);
        return jsVar;
    }

    public final void a(Canvas canvas) {
        org.telegram.ui.ActionBar.i6.A0.setColor(org.telegram.ui.ActionBar.i6.l1(org.telegram.ui.ActionBar.i6.I.q() ? 0.2f : 0.1f, this.d));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, this.e, AndroidUtilities.dp(14.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.i6.A0);
        this.c.c(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
