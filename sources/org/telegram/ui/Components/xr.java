package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class xr {
    public int a;
    public int b;
    public nz0 c;
    public int d;
    public int e;

    public static xr b(org.telegram.ui.Cells.r2 r2Var, MessagesController.DialogFilter dialogFilter) {
        xr xrVar = new xr();
        xrVar.a = dialogFilter.id;
        xrVar.b = dialogFilter.color;
        String str = dialogFilter.name;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        nz0 nz0Var = new nz0(spannableStringBuilder, 10.0f, AndroidUtilities.bold());
        nz0Var.s(r2Var);
        xrVar.c = nz0Var;
        xrVar.c.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, nz0Var.a.getFontMetricsInt(), false), dialogFilter.entities, xrVar.c.a.getFontMetricsInt()));
        xrVar.c.p(26);
        int dp = AndroidUtilities.dp(9.32f);
        nz0 nz0Var2 = xrVar.c;
        xrVar.e = dp + ((int) nz0Var2.c);
        nz0Var2.j();
        int[] iArr = org.telegram.ui.ActionBar.f6.r8;
        xrVar.d = org.telegram.ui.ActionBar.f6.w0(null, iArr[dialogFilter.color % iArr.length], false);
        return xrVar;
    }

    public final void a(Canvas canvas) {
        org.telegram.ui.ActionBar.f6.A0.setColor(org.telegram.ui.ActionBar.f6.l1(org.telegram.ui.ActionBar.f6.I.q() ? 0.2f : 0.1f, this.d));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, this.e, AndroidUtilities.dp(14.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.f6.A0);
        this.c.c(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
