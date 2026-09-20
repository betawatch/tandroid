package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class kq0 extends org.telegram.ui.Cells.h7 {
    public final /* synthetic */ mq0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq0(mq0 mq0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, 0, f6Var);
        this.N = mq0Var;
    }

    @Override // org.telegram.ui.Cells.h7
    public final String a() {
        return this.N.f.a0 ? LocaleController.getString(R.string.RepostToStory) : LocaleController.getString(R.string.FwdMyStory);
    }
}
