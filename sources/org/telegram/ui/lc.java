package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class lc extends i71 {
    public final /* synthetic */ gc d2;
    public final /* synthetic */ z61[] e2;
    public final /* synthetic */ cd f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc(cd cdVar, cd cdVar2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11, int i12, gc gcVar, z61[] z61VarArr) {
        super(cdVar2, activity, true, num, i10, true, f6Var, i11, i12);
        this.f2 = cdVar;
        this.d2 = gcVar;
        this.e2 = z61VarArr;
    }

    @Override // org.telegram.ui.i71
    public final long getDialogId() {
        return this.f2.a;
    }

    @Override // org.telegram.ui.i71
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.i71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.d2.run(Long.valueOf(l4 == null ? 0L : l4.longValue()), num, tL_starGiftUnique);
        z61 z61Var = this.e2[0];
        if (z61Var != null) {
            this.f2.Q = null;
            z61Var.dismiss();
        }
    }
}
