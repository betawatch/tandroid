package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class eu extends ru {
    public final /* synthetic */ ru N1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eu(ru ruVar, org.telegram.ui.ActionBar.f2 f2Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, ArrayList arrayList) {
        super(f2Var, context, g6Var, arrayList);
        this.N1 = ruVar;
    }

    @Override // org.telegram.ui.Components.ru
    public final void L0() {
        this.N1.dismiss();
    }
}
