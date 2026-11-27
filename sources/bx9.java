// default package

import android.app.Activity;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class bx9 extends nk3 {
    public final /* synthetic */ bj3 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx9(bj3 bj3Var, d79 d79Var, Activity activity, int i, int i2) {
        super(d79Var, activity, i, i2, false, null);
        this.l0 = bj3Var;
    }

    @Override // l9c
    public final void O(boolean z) {
        ArrayList arrayList;
        super.O(z);
        ax9 ax9Var = this.l0.o0;
        ax9Var.e(this.c0 || this.d0 || (arrayList = this.W) == null || !arrayList.isEmpty(), z);
        ax9Var.d.setText(ob6.M0(2131747898, null));
        ax9Var.e.setVisibility(8);
    }
}
