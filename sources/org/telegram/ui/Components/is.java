package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class is {
    public int a;
    public int b;
    public v01 c;
    public int d;
    public int e;

    public static is b(org.telegram.ui.Cells.s2 s2Var, MessagesController.DialogFilter dialogFilter) {
        is isVar = new is();
        isVar.a = dialogFilter.id;
        isVar.b = dialogFilter.color;
        String str = dialogFilter.name;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        v01 v01Var = new v01(spannableStringBuilder, 10.0f, AndroidUtilities.bold());
        v01Var.s(s2Var);
        isVar.c = v01Var;
        isVar.c.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, v01Var.a.getFontMetricsInt(), false), dialogFilter.entities, isVar.c.a.getFontMetricsInt()));
        isVar.c.p(26);
        int dp = AndroidUtilities.dp(9.32f);
        v01 v01Var2 = isVar.c;
        isVar.e = dp + ((int) v01Var2.c);
        v01Var2.j();
        int[] iArr = org.telegram.ui.ActionBar.h6.r8;
        isVar.d = org.telegram.ui.ActionBar.h6.w0(null, iArr[dialogFilter.color % iArr.length], false);
        return isVar;
    }

    public final void a(Canvas canvas) {
        org.telegram.ui.ActionBar.h6.A0.setColor(org.telegram.ui.ActionBar.h6.l1(org.telegram.ui.ActionBar.h6.I.q() ? 0.2f : 0.1f, this.d));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, this.e, AndroidUtilities.dp(14.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.h6.A0);
        this.c.c(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
