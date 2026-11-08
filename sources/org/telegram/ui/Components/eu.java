package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class eu extends ru {
    public final /* synthetic */ ru N1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eu(ru ruVar, org.telegram.ui.ActionBar.f2 f2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, ArrayList arrayList) {
        super(f2Var, context, f6Var, arrayList);
        this.N1 = ruVar;
    }

    @Override // org.telegram.ui.Components.ru
    public final void L0() {
        this.N1.dismiss();
    }
}
