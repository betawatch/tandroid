package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ic extends z61 {
    public final /* synthetic */ dc d2;
    public final /* synthetic */ q61[] e2;
    public final /* synthetic */ ad f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic(ad adVar, ad adVar2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11, int i12, dc dcVar, q61[] q61VarArr) {
        super(adVar2, activity, true, num, i10, true, d6Var, i11, i12);
        this.f2 = adVar;
        this.d2 = dcVar;
        this.e2 = q61VarArr;
    }

    @Override // org.telegram.ui.z61
    public final long getDialogId() {
        return this.f2.a;
    }

    @Override // org.telegram.ui.z61
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.z61
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.d2.run(Long.valueOf(l4 == null ? 0L : l4.longValue()), num, tL_starGiftUnique);
        q61 q61Var = this.e2[0];
        if (q61Var != null) {
            this.f2.Q = null;
            q61Var.dismiss();
        }
    }
}
