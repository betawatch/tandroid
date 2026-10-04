package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class kc extends c71 {
    public final /* synthetic */ fc d2;
    public final /* synthetic */ t61[] e2;
    public final /* synthetic */ cd f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc(cd cdVar, cd cdVar2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11, int i12, fc fcVar, t61[] t61VarArr) {
        super(cdVar2, activity, true, num, i10, true, d6Var, i11, i12);
        this.f2 = cdVar;
        this.d2 = fcVar;
        this.e2 = t61VarArr;
    }

    @Override // org.telegram.ui.c71
    public final long getDialogId() {
        return this.f2.a;
    }

    @Override // org.telegram.ui.c71
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.c71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.d2.run(Long.valueOf(l4 == null ? 0L : l4.longValue()), num, tL_starGiftUnique);
        t61 t61Var = this.e2[0];
        if (t61Var != null) {
            this.f2.Q = null;
            t61Var.dismiss();
        }
    }
}
