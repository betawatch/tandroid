package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class lo0 extends ws {
    public final /* synthetic */ org.telegram.ui.uy d0;
    public final /* synthetic */ org.telegram.ui.dy e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo0(org.telegram.ui.dy dyVar, zl0 zl0Var, Context context, int i10, int i11, org.telegram.ui.uy uyVar) {
        super(zl0Var, context, i10, i11);
        this.e0 = dyVar;
        this.d0 = uyVar;
    }

    @Override // org.telegram.ui.Components.w61
    public final void N(boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.N(z10);
        do0 do0Var = this.e0.i0;
        do0Var.e(this.W || this.X || (arrayList = this.P) == null || !arrayList.isEmpty() || (arrayList2 = this.Q) == null || !arrayList2.isEmpty() || (arrayList3 = this.S) == null || !arrayList3.isEmpty() || (arrayList4 = this.R) == null || !arrayList4.isEmpty(), z10);
        if (!TextUtils.isEmpty(this.b0)) {
            do0Var.d.setText(LocaleController.getString(R.string.NoResult));
            do0Var.e.setVisibility(8);
        } else {
            do0Var.d.setText(LocaleController.getString(R.string.NoChannelsTitle));
            do0Var.e.setVisibility(0);
            do0Var.e.setText(LocaleController.getString(R.string.NoChannelsMessage));
        }
    }
}
