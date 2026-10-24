package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class jc extends b61 {
    public final /* synthetic */ ec e2;
    public final /* synthetic */ s51[] f2;
    public final /* synthetic */ bd g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc(bd bdVar, bd bdVar2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.g6 g6Var, int i11, int i12, ec ecVar, s51[] s51VarArr) {
        super(bdVar2, activity, true, num, i10, true, g6Var, i11, i12);
        this.g2 = bdVar;
        this.e2 = ecVar;
        this.f2 = s51VarArr;
    }

    @Override // org.telegram.ui.b61
    public final long getDialogId() {
        return this.g2.a;
    }

    @Override // org.telegram.ui.b61
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.b61
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.e2.run(Long.valueOf(l4 == null ? 0L : l4.longValue()), num, tL_starGiftUnique);
        s51 s51Var = this.f2[0];
        if (s51Var != null) {
            this.g2.Q = null;
            s51Var.dismiss();
        }
    }
}
