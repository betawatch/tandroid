package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ac extends s11 {
    public final /* synthetic */ vb e2;
    public final /* synthetic */ j11[] f2;
    public final /* synthetic */ rc g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(rc rcVar, rc rcVar2, Activity activity, Integer num, int i7, org.telegram.ui.ActionBar.g6 g6Var, int i10, int i11, vb vbVar, j11[] j11VarArr) {
        super(rcVar2, activity, true, num, i7, true, g6Var, i10, i11);
        this.g2 = rcVar;
        this.e2 = vbVar;
        this.f2 = j11VarArr;
    }

    @Override // org.telegram.ui.s11
    public final long getDialogId() {
        return this.g2.a;
    }

    @Override // org.telegram.ui.s11
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.s11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.e2.a(Long.valueOf(l10 == null ? 0L : l10.longValue()), num, tL_starGiftUnique);
        j11 j11Var = this.f2[0];
        if (j11Var != null) {
            this.g2.Q = null;
            j11Var.dismiss();
        }
    }
}
