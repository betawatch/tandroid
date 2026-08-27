package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class vr {
    public int a;
    public int b;
    public pz0 c;
    public int d;
    public int e;

    public static vr b(org.telegram.ui.Cells.p2 p2Var, MessagesController.DialogFilter dialogFilter) {
        vr vrVar = new vr();
        vrVar.a = dialogFilter.id;
        vrVar.b = dialogFilter.color;
        String str = dialogFilter.name;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        pz0 pz0Var = new pz0(spannableStringBuilder, 10.0f, AndroidUtilities.bold());
        pz0Var.s(p2Var);
        vrVar.c = pz0Var;
        vrVar.c.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, pz0Var.a.getFontMetricsInt(), false), dialogFilter.entities, vrVar.c.a.getFontMetricsInt()));
        vrVar.c.p(26);
        int dp = AndroidUtilities.dp(9.32f);
        pz0 pz0Var2 = vrVar.c;
        vrVar.e = dp + ((int) pz0Var2.c);
        pz0Var2.j();
        int[] iArr = org.telegram.ui.ActionBar.g6.r8;
        vrVar.d = org.telegram.ui.ActionBar.g6.w0(null, iArr[dialogFilter.color % iArr.length], false);
        return vrVar;
    }

    public final void a(Canvas canvas) {
        org.telegram.ui.ActionBar.g6.A0.setColor(org.telegram.ui.ActionBar.g6.l1(org.telegram.ui.ActionBar.g6.I.q() ? 0.2f : 0.1f, this.d));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, this.e, AndroidUtilities.dp(14.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.g6.A0);
        this.c.c(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
