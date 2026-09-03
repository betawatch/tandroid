package jg;

import android.content.Context;
import k7.c6;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l5;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class j extends d {
    public final l5 r;
    public Object s;

    public j(Context context, g6 g6Var) {
        super(context, g6Var);
        this.c.setVisibility(8);
        l5 l5Var = this.e;
        int i10 = k6.B6;
        l5Var.setTextColor(k6.v0(i10, g6Var));
        l5 l5Var2 = new l5(context);
        this.r = l5Var2;
        l5Var2.setTextSize(16);
        l5Var2.setTextColor(k6.v0(i10, g6Var));
        l5Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        addView(l5Var2);
        boolean z4 = LocaleController.isRTL;
        l5Var2.setLayoutParams(c6.d(-1, -2.0f, (z4 ? 3 : 5) | 16, z4 ? 20.0f : 0.0f, 0.0f, z4 ? 0.0f : 20.0f, 0.0f));
    }

    @Override // jg.d
    public final boolean b() {
        return true;
    }

    public Object getGifCode() {
        return this.s;
    }
}
