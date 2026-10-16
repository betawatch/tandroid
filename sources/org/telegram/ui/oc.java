package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class oc extends r71 {
    public final /* synthetic */ jc d2;
    public final /* synthetic */ i71[] e2;
    public final /* synthetic */ gd f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc(gd gdVar, gd gdVar2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11, int i12, jc jcVar, i71[] i71VarArr) {
        super(gdVar2, activity, true, num, i10, true, c6Var, i11, i12);
        this.f2 = gdVar;
        this.d2 = jcVar;
        this.e2 = i71VarArr;
    }

    @Override // org.telegram.ui.r71
    public final long getDialogId() {
        return this.f2.a;
    }

    @Override // org.telegram.ui.r71
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.r71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.d2.run(Long.valueOf(l4 == null ? 0L : l4.longValue()), num, tL_starGiftUnique);
        i71 i71Var = this.e2[0];
        if (i71Var != null) {
            this.f2.Q = null;
            i71Var.dismiss();
        }
    }
}
