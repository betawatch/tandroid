package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class ac extends q11 {
    public final /* synthetic */ vb e2;
    public final /* synthetic */ h11[] f2;
    public final /* synthetic */ rc g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(rc rcVar, rc rcVar2, Activity activity, Integer num, int i7, org.telegram.ui.ActionBar.f6 f6Var, int i10, int i11, vb vbVar, h11[] h11VarArr) {
        super(rcVar2, activity, true, num, i7, true, f6Var, i10, i11);
        this.g2 = rcVar;
        this.e2 = vbVar;
        this.f2 = h11VarArr;
    }

    @Override // org.telegram.ui.q11
    public final long getDialogId() {
        return this.g2.a;
    }

    @Override // org.telegram.ui.q11
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.q11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.e2.a(Long.valueOf(l10 == null ? 0L : l10.longValue()), num, tL_starGiftUnique);
        h11 h11Var = this.f2[0];
        if (h11Var != null) {
            this.g2.Q = null;
            h11Var.dismiss();
        }
    }
}
