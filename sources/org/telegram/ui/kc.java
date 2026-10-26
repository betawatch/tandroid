package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class kc extends c61 {
    public final /* synthetic */ fc e2;
    public final /* synthetic */ t51[] f2;
    public final /* synthetic */ bd g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc(bd bdVar, bd bdVar2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.u6 u6Var, int i11, int i12, fc fcVar, t51[] t51VarArr) {
        super(bdVar2, activity, true, num, i10, true, u6Var, i11, i12);
        this.g2 = bdVar;
        this.e2 = fcVar;
        this.f2 = t51VarArr;
    }

    @Override // org.telegram.ui.c61
    public final long getDialogId() {
        return this.g2.a;
    }

    @Override // org.telegram.ui.c61
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.c61
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.e2.run(Long.valueOf(l4 == null ? 0L : l4.longValue()), num, tL_starGiftUnique);
        t51 t51Var = this.f2[0];
        if (t51Var != null) {
            this.g2.Q = null;
            t51Var.dismiss();
        }
    }
}
