package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class hc extends w61 {
    public final /* synthetic */ cc a2;
    public final /* synthetic */ n61[] b2;
    public final /* synthetic */ bd c2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hc(bd bdVar, bd bdVar2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.g6 g6Var, int i11, int i12, cc ccVar, n61[] n61VarArr) {
        super(bdVar2, activity, true, num, i10, true, g6Var, i11, i12);
        this.c2 = bdVar;
        this.a2 = ccVar;
        this.b2 = n61VarArr;
    }

    @Override // org.telegram.ui.w61
    public final long getDialogId() {
        return this.c2.a;
    }

    @Override // org.telegram.ui.w61
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.w61
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.a2.run(Long.valueOf(l10 == null ? 0L : l10.longValue()), num, tL_starGiftUnique);
        n61 n61Var = this.b2[0];
        if (n61Var != null) {
            this.c2.N = null;
            n61Var.dismiss();
        }
    }
}
