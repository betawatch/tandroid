package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class ro0 extends ct {
    public final /* synthetic */ org.telegram.ui.cy d0;
    public final /* synthetic */ org.telegram.ui.lx e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ro0(org.telegram.ui.lx lxVar, jm0 jm0Var, Context context, int i10, int i11, org.telegram.ui.cy cyVar) {
        super(jm0Var, context, i10, i11);
        this.e0 = lxVar;
        this.d0 = cyVar;
    }

    @Override // org.telegram.ui.Components.u61
    public final void N(boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.N(z10);
        jo0 jo0Var = this.e0.g0;
        jo0Var.e(this.W || this.X || (arrayList = this.P) == null || !arrayList.isEmpty() || (arrayList2 = this.Q) == null || !arrayList2.isEmpty() || (arrayList3 = this.S) == null || !arrayList3.isEmpty() || (arrayList4 = this.R) == null || !arrayList4.isEmpty(), z10);
        if (!TextUtils.isEmpty(this.b0)) {
            jo0Var.d.setText(LocaleController.getString(R.string.NoResult));
            jo0Var.e.setVisibility(8);
        } else {
            jo0Var.d.setText(LocaleController.getString(R.string.NoChannelsTitle));
            jo0Var.e.setVisibility(0);
            jo0Var.e.setText(LocaleController.getString(R.string.NoChannelsMessage));
        }
    }
}
