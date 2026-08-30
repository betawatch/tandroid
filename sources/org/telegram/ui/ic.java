package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ic extends q61 {
    public final /* synthetic */ dc a2;
    public final /* synthetic */ g61[] b2;
    public final /* synthetic */ bd c2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic(bd bdVar, bd bdVar2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11, int i12, dc dcVar, g61[] g61VarArr) {
        super(bdVar2, activity, true, num, i10, true, f6Var, i11, i12);
        this.c2 = bdVar;
        this.a2 = dcVar;
        this.b2 = g61VarArr;
    }

    @Override // org.telegram.ui.q61
    public final long getDialogId() {
        return this.c2.a;
    }

    @Override // org.telegram.ui.q61
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.q61
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.a2.run(Long.valueOf(l10 == null ? 0L : l10.longValue()), num, tL_starGiftUnique);
        g61 g61Var = this.b2[0];
        if (g61Var != null) {
            this.c2.N = null;
            g61Var.dismiss();
        }
    }
}
