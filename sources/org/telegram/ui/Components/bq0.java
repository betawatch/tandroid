package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class bq0 extends org.telegram.ui.Cells.e7 {
    public final /* synthetic */ dq0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bq0(dq0 dq0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, 0, g6Var);
        this.K = dq0Var;
    }

    @Override // org.telegram.ui.Cells.e7
    public final String a() {
        return this.K.f.X ? LocaleController.getString(R.string.RepostToStory) : LocaleController.getString(R.string.FwdMyStory);
    }
}
