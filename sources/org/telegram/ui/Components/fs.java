package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class fs {
    public int a;
    public int b;
    public k01 c;
    public int d;
    public int e;

    public static fs b(org.telegram.ui.Cells.r2 r2Var, MessagesController.DialogFilter dialogFilter) {
        fs fsVar = new fs();
        fsVar.a = dialogFilter.id;
        fsVar.b = dialogFilter.color;
        String str = dialogFilter.name;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        k01 k01Var = new k01(spannableStringBuilder, 10.0f, AndroidUtilities.bold());
        k01Var.s(r2Var);
        fsVar.c = k01Var;
        fsVar.c.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, k01Var.a.getFontMetricsInt(), false), dialogFilter.entities, fsVar.c.a.getFontMetricsInt()));
        fsVar.c.p(26);
        int dp = AndroidUtilities.dp(9.32f);
        k01 k01Var2 = fsVar.c;
        fsVar.e = dp + ((int) k01Var2.c);
        k01Var2.j();
        int[] iArr = org.telegram.ui.ActionBar.j6.r8;
        fsVar.d = org.telegram.ui.ActionBar.j6.w0(null, iArr[dialogFilter.color % iArr.length], false);
        return fsVar;
    }

    public final void a(Canvas canvas) {
        org.telegram.ui.ActionBar.j6.A0.setColor(org.telegram.ui.ActionBar.j6.l1(org.telegram.ui.ActionBar.j6.I.q() ? 0.2f : 0.1f, this.d));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, this.e, AndroidUtilities.dp(14.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.j6.A0);
        this.c.c(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
