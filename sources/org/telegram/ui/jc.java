package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class jc extends k71 {
    public final /* synthetic */ ec d2;
    public final /* synthetic */ b71[] e2;
    public final /* synthetic */ bd f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc(bd bdVar, bd bdVar2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.e6 e6Var, int i11, int i12, ec ecVar, b71[] b71VarArr) {
        super(bdVar2, activity, true, num, i10, true, e6Var, i11, i12);
        this.f2 = bdVar;
        this.d2 = ecVar;
        this.e2 = b71VarArr;
    }

    @Override // org.telegram.ui.k71
    public final long getDialogId() {
        return this.f2.a;
    }

    @Override // org.telegram.ui.k71
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.k71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.d2.run(Long.valueOf(l4 == null ? 0L : l4.longValue()), num, tL_starGiftUnique);
        b71 b71Var = this.e2[0];
        if (b71Var != null) {
            this.f2.Q = null;
            b71Var.dismiss();
        }
    }
}
