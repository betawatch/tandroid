package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ts {
    public int a;
    public int b;
    public h11 c;
    public int d;
    public int e;

    public static ts b(org.telegram.ui.Cells.s2 s2Var, MessagesController.DialogFilter dialogFilter) {
        ts tsVar = new ts();
        tsVar.a = dialogFilter.id;
        tsVar.b = dialogFilter.color;
        String str = dialogFilter.name;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        h11 h11Var = new h11(spannableStringBuilder, 10.0f, AndroidUtilities.bold());
        h11Var.s(s2Var);
        tsVar.c = h11Var;
        tsVar.c.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, h11Var.a.getFontMetricsInt(), false), dialogFilter.entities, tsVar.c.a.getFontMetricsInt()));
        tsVar.c.p(26);
        int dp = AndroidUtilities.dp(9.32f);
        h11 h11Var2 = tsVar.c;
        tsVar.e = dp + ((int) h11Var2.c);
        h11Var2.j();
        int[] iArr = org.telegram.ui.ActionBar.g6.r8;
        tsVar.d = org.telegram.ui.ActionBar.g6.x0(null, iArr[dialogFilter.color % iArr.length], false);
        return tsVar;
    }

    public final void a(Canvas canvas) {
        org.telegram.ui.ActionBar.g6.A0.setColor(org.telegram.ui.ActionBar.g6.m1(org.telegram.ui.ActionBar.g6.I.q() ? 0.2f : 0.1f, this.d));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, this.e, AndroidUtilities.dp(14.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.g6.A0);
        this.c.c(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
