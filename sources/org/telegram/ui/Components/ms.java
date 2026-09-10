package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ms {
    public int a;
    public int b;
    public t01 c;
    public int d;
    public int e;

    public static ms b(org.telegram.ui.Cells.r2 r2Var, MessagesController.DialogFilter dialogFilter) {
        ms msVar = new ms();
        msVar.a = dialogFilter.id;
        msVar.b = dialogFilter.color;
        String str = dialogFilter.name;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        t01 t01Var = new t01(spannableStringBuilder, 10.0f, AndroidUtilities.bold());
        t01Var.s(r2Var);
        msVar.c = t01Var;
        msVar.c.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, t01Var.a.getFontMetricsInt(), false), dialogFilter.entities, msVar.c.a.getFontMetricsInt()));
        msVar.c.p(26);
        int dp = AndroidUtilities.dp(9.32f);
        t01 t01Var2 = msVar.c;
        msVar.e = dp + ((int) t01Var2.c);
        t01Var2.j();
        int[] iArr = org.telegram.ui.ActionBar.j6.r8;
        msVar.d = org.telegram.ui.ActionBar.j6.w0(null, iArr[dialogFilter.color % iArr.length], false);
        return msVar;
    }

    public final void a(Canvas canvas) {
        org.telegram.ui.ActionBar.j6.A0.setColor(org.telegram.ui.ActionBar.j6.l1(org.telegram.ui.ActionBar.j6.I.q() ? 0.2f : 0.1f, this.d));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, this.e, AndroidUtilities.dp(14.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.j6.A0);
        this.c.c(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
