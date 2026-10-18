package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class lc extends z51 {
    public final /* synthetic */ gc d2;
    public final /* synthetic */ q51[] e2;
    public final /* synthetic */ dd f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc(dd ddVar, dd ddVar2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11, int i12, gc gcVar, q51[] q51VarArr) {
        super(ddVar2, activity, true, num, i10, true, d6Var, i11, i12);
        this.f2 = ddVar;
        this.d2 = gcVar;
        this.e2 = q51VarArr;
    }

    @Override // org.telegram.ui.z51
    public final long getDialogId() {
        return this.f2.a;
    }

    @Override // org.telegram.ui.z51
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.z51
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.d2.run(Long.valueOf(l4 == null ? 0L : l4.longValue()), num, tL_starGiftUnique);
        q51 q51Var = this.e2[0];
        if (q51Var != null) {
            this.f2.Q = null;
            q51Var.dismiss();
        }
    }
}
