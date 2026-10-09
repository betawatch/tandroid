package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class yo0 extends kt {
    public final /* synthetic */ org.telegram.ui.ty d0;
    public final /* synthetic */ org.telegram.ui.dy e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo0(org.telegram.ui.dy dyVar, qm0 qm0Var, Context context, int i10, int i11, org.telegram.ui.ty tyVar) {
        super(qm0Var, context, i10, i11);
        this.e0 = dyVar;
        this.d0 = tyVar;
    }

    @Override // org.telegram.ui.Components.c71
    public final void N(boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.N(z10);
        qo0 qo0Var = this.e0.g0;
        qo0Var.e(this.W || this.X || (arrayList = this.P) == null || !arrayList.isEmpty() || (arrayList2 = this.Q) == null || !arrayList2.isEmpty() || (arrayList3 = this.S) == null || !arrayList3.isEmpty() || (arrayList4 = this.R) == null || !arrayList4.isEmpty(), z10);
        if (!TextUtils.isEmpty(this.b0)) {
            qo0Var.d.setText(LocaleController.getString(R.string.NoResult));
            qo0Var.e.setVisibility(8);
        } else {
            qo0Var.d.setText(LocaleController.getString(R.string.NoChannelsTitle));
            qo0Var.e.setVisibility(0);
            qo0Var.e.setText(LocaleController.getString(R.string.NoChannelsMessage));
        }
    }
}
