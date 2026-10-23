package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class vq0 extends org.telegram.ui.Cells.e7 {
    public final /* synthetic */ xq0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq0(xq0 xq0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, 0, d6Var);
        this.N = xq0Var;
    }

    @Override // org.telegram.ui.Cells.e7
    public final String a() {
        return this.N.f.b0 ? LocaleController.getString(R.string.RepostToStory) : LocaleController.getString(R.string.FwdMyStory);
    }
}
