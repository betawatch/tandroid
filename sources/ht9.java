// default package

import android.app.Activity;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ht9 extends vj3 {
    public final /* synthetic */ hi3 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ht9(hi3 hi3Var, o39 o39Var, Activity activity, int i, int i2) {
        super(o39Var, activity, i, i2, false, null);
        this.l0 = hi3Var;
    }

    @Override // l5c
    public final void O(boolean z) {
        ArrayList arrayList;
        super.O(z);
        gt9 gt9Var = this.l0.o0;
        gt9Var.e(this.c0 || this.d0 || (arrayList = this.W) == null || !arrayList.isEmpty(), z);
        gt9Var.d.setText(k96.M0(2131747975, null));
        gt9Var.e.setVisibility(8);
    }
}
