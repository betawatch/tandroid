// default package

import android.app.Activity;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ix9 extends pk3 {
    public final /* synthetic */ uj3 g0;
    public final /* synthetic */ bj3 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ix9(bj3 bj3Var, d79 d79Var, Activity activity, int i, int i2, uj3 uj3Var) {
        super(d79Var, activity, i, i2);
        this.h0 = bj3Var;
        this.g0 = uj3Var;
    }

    @Override // l9c
    public final void O(boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.O(z);
        ax9 ax9Var = this.h0.j0;
        ax9Var.e(this.Z || this.a0 || (arrayList = this.S) == null || !arrayList.isEmpty() || (arrayList2 = this.T) == null || !arrayList2.isEmpty() || (arrayList3 = this.V) == null || !arrayList3.isEmpty() || (arrayList4 = this.U) == null || !arrayList4.isEmpty(), z);
        if (!TextUtils.isEmpty(this.e0)) {
            ax9Var.d.setText(ob6.M0(2131747898, null));
            ax9Var.e.setVisibility(8);
        } else {
            ax9Var.d.setText(ob6.M0(2131747962, null));
            ax9Var.e.setVisibility(0);
            ax9Var.e.setText(ob6.M0(2131747963, null));
        }
    }
}
