package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class kc extends g71 {
    public final /* synthetic */ fc d2;
    public final /* synthetic */ x61[] e2;
    public final /* synthetic */ bd f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc(bd bdVar, bd bdVar2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.e6 e6Var, int i11, int i12, fc fcVar, x61[] x61VarArr) {
        super(bdVar2, activity, true, num, i10, true, e6Var, i11, i12);
        this.f2 = bdVar;
        this.d2 = fcVar;
        this.e2 = x61VarArr;
    }

    @Override // org.telegram.ui.g71
    public final long getDialogId() {
        return this.f2.a;
    }

    @Override // org.telegram.ui.g71
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.g71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.d2.run(Long.valueOf(l4 == null ? 0L : l4.longValue()), num, tL_starGiftUnique);
        x61 x61Var = this.e2[0];
        if (x61Var != null) {
            this.f2.Q = null;
            x61Var.dismiss();
        }
    }
}
