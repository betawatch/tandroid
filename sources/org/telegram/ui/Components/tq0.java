package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class tq0 extends org.telegram.ui.Cells.e7 {
    public final /* synthetic */ vq0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq0(vq0 vq0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, 0, d6Var);
        this.N = vq0Var;
    }

    @Override // org.telegram.ui.Cells.e7
    public final String a() {
        return this.N.f.a0 ? LocaleController.getString(R.string.RepostToStory) : LocaleController.getString(R.string.FwdMyStory);
    }
}
