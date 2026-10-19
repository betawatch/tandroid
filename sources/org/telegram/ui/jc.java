package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class jc extends x51 {
    public final /* synthetic */ ec d2;
    public final /* synthetic */ o51[] e2;
    public final /* synthetic */ bd f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc(bd bdVar, bd bdVar2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11, int i12, ec ecVar, o51[] o51VarArr) {
        super(bdVar2, activity, true, num, i10, true, d6Var, i11, i12);
        this.f2 = bdVar;
        this.d2 = ecVar;
        this.e2 = o51VarArr;
    }

    @Override // org.telegram.ui.x51
    public final long getDialogId() {
        return this.f2.a;
    }

    @Override // org.telegram.ui.x51
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.x51
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.d2.run(Long.valueOf(l4 == null ? 0L : l4.longValue()), num, tL_starGiftUnique);
        o51 o51Var = this.e2[0];
        if (o51Var != null) {
            this.f2.Q = null;
            o51Var.dismiss();
        }
    }
}
