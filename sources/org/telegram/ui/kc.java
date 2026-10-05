package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class kc extends a71 {
    public final /* synthetic */ fc d2;
    public final /* synthetic */ r61[] e2;
    public final /* synthetic */ cd f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc(cd cdVar, cd cdVar2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11, int i12, fc fcVar, r61[] r61VarArr) {
        super(cdVar2, activity, true, num, i10, true, d6Var, i11, i12);
        this.f2 = cdVar;
        this.d2 = fcVar;
        this.e2 = r61VarArr;
    }

    @Override // org.telegram.ui.a71
    public final long getDialogId() {
        return this.f2.a;
    }

    @Override // org.telegram.ui.a71
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.a71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.d2.run(Long.valueOf(l4 == null ? 0L : l4.longValue()), num, tL_starGiftUnique);
        r61 r61Var = this.e2[0];
        if (r61Var != null) {
            this.f2.Q = null;
            r61Var.dismiss();
        }
    }
}
