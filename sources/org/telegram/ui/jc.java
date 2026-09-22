package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class jc extends h71 {
    public final /* synthetic */ ec d2;
    public final /* synthetic */ y61[] e2;
    public final /* synthetic */ ad f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc(ad adVar, ad adVar2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.e6 e6Var, int i11, int i12, ec ecVar, y61[] y61VarArr) {
        super(adVar2, activity, true, num, i10, true, e6Var, i11, i12);
        this.f2 = adVar;
        this.d2 = ecVar;
        this.e2 = y61VarArr;
    }

    @Override // org.telegram.ui.h71
    public final long getDialogId() {
        return this.f2.a;
    }

    @Override // org.telegram.ui.h71
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.h71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.d2.run(Long.valueOf(l4 == null ? 0L : l4.longValue()), num, tL_starGiftUnique);
        y61 y61Var = this.e2[0];
        if (y61Var != null) {
            this.f2.Q = null;
            y61Var.dismiss();
        }
    }
}
