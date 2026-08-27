package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class fc extends a61 {
    public final /* synthetic */ ac Z1;
    public final /* synthetic */ r51[] a2;
    public final /* synthetic */ xc b2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc(xc xcVar, xc xcVar2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11, int i12, ac acVar, r51[] r51VarArr) {
        super(xcVar2, activity, true, num, i10, true, c6Var, i11, i12);
        this.b2 = xcVar;
        this.Z1 = acVar;
        this.a2 = r51VarArr;
    }

    @Override // org.telegram.ui.a61
    public final long getDialogId() {
        return this.b2.a;
    }

    @Override // org.telegram.ui.a61
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.a61
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.Z1.run(Long.valueOf(l10 == null ? 0L : l10.longValue()), num, tL_starGiftUnique);
        r51 r51Var = this.a2[0];
        if (r51Var != null) {
            this.b2.M = null;
            r51Var.dismiss();
        }
    }
}
