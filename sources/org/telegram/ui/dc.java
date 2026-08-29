package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class dc extends d61 {
    public final /* synthetic */ yb Z1;
    public final /* synthetic */ u51[] a2;
    public final /* synthetic */ vc b2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc(vc vcVar, vc vcVar2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11, int i12, yb ybVar, u51[] u51VarArr) {
        super(vcVar2, activity, true, num, i10, true, c6Var, i11, i12);
        this.b2 = vcVar;
        this.Z1 = ybVar;
        this.a2 = u51VarArr;
    }

    @Override // org.telegram.ui.d61
    public final long getDialogId() {
        return this.b2.a;
    }

    @Override // org.telegram.ui.d61
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.d61
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.Z1.run(Long.valueOf(l10 == null ? 0L : l10.longValue()), num, tL_starGiftUnique);
        u51 u51Var = this.a2[0];
        if (u51Var != null) {
            this.b2.M = null;
            u51Var.dismiss();
        }
    }
}
