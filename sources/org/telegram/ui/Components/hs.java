package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class hs {
    public int a;
    public int b;
    public f01 c;
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
        f01 f01Var = new f01(spannableStringBuilder, 10.0f, AndroidUtilities.bold());
        f01Var.s(r2Var);
        hsVar.c = f01Var;
        hsVar.c.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, f01Var.a.getFontMetricsInt(), false), dialogFilter.entities, hsVar.c.a.getFontMetricsInt()));
        hsVar.c.p(26);
        int dp = AndroidUtilities.dp(9.32f);
        f01 f01Var2 = hsVar.c;
        hsVar.e = dp + ((int) f01Var2.c);
        f01Var2.j();
        int[] iArr = org.telegram.ui.ActionBar.h6.r8;
        hsVar.d = org.telegram.ui.ActionBar.h6.w0(null, iArr[dialogFilter.color % iArr.length], false);
        return hsVar;
    }

    public final void a(Canvas canvas) {
        org.telegram.ui.ActionBar.h6.A0.setColor(org.telegram.ui.ActionBar.h6.l1(org.telegram.ui.ActionBar.h6.I.q() ? 0.2f : 0.1f, this.d));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, this.e, AndroidUtilities.dp(14.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.h6.A0);
        this.c.c(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
