package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class qs {
    public int a;
    public int b;
    public i11 c;
    public int d;
    public boolean e;
    public int f;
    public int g;

    public static qs b(org.telegram.ui.Cells.q2 q2Var, MessagesController.DialogFilter dialogFilter) {
        qs qsVar = new qs();
        qsVar.a = dialogFilter.id;
        qsVar.b = dialogFilter.color;
        String str = dialogFilter.name;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        i11 i11Var = new i11(spannableStringBuilder, 10.0f, AndroidUtilities.bold());
        i11Var.s(q2Var);
        qsVar.c = i11Var;
        qsVar.c.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, i11Var.a.getFontMetricsInt(), false), dialogFilter.entities, qsVar.c.a.getFontMetricsInt()));
        qsVar.c.p(26);
        int dp = AndroidUtilities.dp(9.32f);
        i11 i11Var2 = qsVar.c;
        qsVar.g = dp + ((int) i11Var2.c);
        i11Var2.j();
        int[] iArr = org.telegram.ui.ActionBar.k6.r8;
        int i10 = iArr[dialogFilter.color % iArr.length];
        qsVar.f = i10;
        qsVar.e = true;
        qsVar.d = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        return qsVar;
    }

    public final void a(Canvas canvas) {
        if (this.e) {
            this.d = org.telegram.ui.ActionBar.k6.x0(null, this.f, false);
        }
        org.telegram.ui.ActionBar.k6.A0.setColor(org.telegram.ui.ActionBar.k6.o1(org.telegram.ui.ActionBar.k6.I.q() ? 0.2f : 0.1f, this.d));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, this.g, AndroidUtilities.dp(14.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.k6.A0);
        this.c.c(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
