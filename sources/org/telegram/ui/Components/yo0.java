package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class yo0 extends et {
    public final /* synthetic */ org.telegram.ui.cy f0;
    public final /* synthetic */ org.telegram.ui.jx g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo0(org.telegram.ui.jx jxVar, mm0 mm0Var, Context context, int i10, int i11, org.telegram.ui.cy cyVar) {
        super(mm0Var, context, i10, i11);
        this.g0 = jxVar;
        this.f0 = cyVar;
    }

    @Override // org.telegram.ui.Components.j71
    public final void O(boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.O(z10);
        qo0 qo0Var = this.g0.i0;
        qo0Var.e(this.Y || this.Z || (arrayList = this.R) == null || !arrayList.isEmpty() || (arrayList2 = this.S) == null || !arrayList2.isEmpty() || (arrayList3 = this.U) == null || !arrayList3.isEmpty() || (arrayList4 = this.T) == null || !arrayList4.isEmpty(), z10);
        if (!TextUtils.isEmpty(this.d0)) {
            qo0Var.d.setText(LocaleController.getString(R.string.NoResult));
            qo0Var.e.setVisibility(8);
        } else {
            qo0Var.d.setText(LocaleController.getString(R.string.NoChannelsTitle));
            qo0Var.e.setVisibility(0);
            qo0Var.e.setText(LocaleController.getString(R.string.NoChannelsMessage));
        }
    }
}
