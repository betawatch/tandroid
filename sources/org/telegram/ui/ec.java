package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ec extends b61 {
    public final /* synthetic */ zb Z1;
    public final /* synthetic */ s51[] a2;
    public final /* synthetic */ xc b2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ec(xc xcVar, xc xcVar2, Activity activity, Integer num, int i9, org.telegram.ui.ActionBar.b6 b6Var, int i10, int i11, zb zbVar, s51[] s51VarArr) {
        super(xcVar2, activity, true, num, i9, true, b6Var, i10, i11);
        this.b2 = xcVar;
        this.Z1 = zbVar;
        this.a2 = s51VarArr;
    }

    @Override // org.telegram.ui.b61
    public final long getDialogId() {
        return this.b2.a;
    }

    @Override // org.telegram.ui.b61
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.b61
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.Z1.run(Long.valueOf(l10 == null ? 0L : l10.longValue()), num, tL_starGiftUnique);
        s51 s51Var = this.a2[0];
        if (s51Var != null) {
            this.b2.M = null;
            s51Var.dismiss();
        }
    }
}
