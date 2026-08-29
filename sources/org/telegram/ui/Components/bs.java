package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class bs {
    public int a;
    public int b;
    public zz0 c;
    public int d;
    public int e;

    public static bs b(org.telegram.ui.Cells.p2 p2Var, MessagesController.DialogFilter dialogFilter) {
        bs bsVar = new bs();
        bsVar.a = dialogFilter.id;
        bsVar.b = dialogFilter.color;
        String str = dialogFilter.name;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        zz0 zz0Var = new zz0(spannableStringBuilder, 10.0f, AndroidUtilities.bold());
        zz0Var.s(p2Var);
        bsVar.c = zz0Var;
        bsVar.c.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, zz0Var.a.getFontMetricsInt(), false), dialogFilter.entities, bsVar.c.a.getFontMetricsInt()));
        bsVar.c.p(26);
        int dp = AndroidUtilities.dp(9.32f);
        zz0 zz0Var2 = bsVar.c;
        bsVar.e = dp + ((int) zz0Var2.c);
        zz0Var2.j();
        int[] iArr = org.telegram.ui.ActionBar.g6.r8;
        bsVar.d = org.telegram.ui.ActionBar.g6.w0(null, iArr[dialogFilter.color % iArr.length], false);
        return bsVar;
    }

    public final void a(Canvas canvas) {
        org.telegram.ui.ActionBar.g6.A0.setColor(org.telegram.ui.ActionBar.g6.l1(org.telegram.ui.ActionBar.g6.I.q() ? 0.2f : 0.1f, this.d));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, this.e, AndroidUtilities.dp(14.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.g6.A0);
        this.c.c(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
