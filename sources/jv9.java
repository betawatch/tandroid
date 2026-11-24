// default package

import android.app.Activity;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jv9 extends gl3 {
    public final /* synthetic */ sj3 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv9(sj3 sj3Var, r59 r59Var, Activity activity, int i, int i2) {
        super(r59Var, activity, i, i2, false, null);
        this.l0 = sj3Var;
    }

    @Override // l7c
    public final void O(boolean z) {
        ArrayList arrayList;
        super.O(z);
        iv9 iv9Var = this.l0.o0;
        iv9Var.e(this.c0 || this.d0 || (arrayList = this.W) == null || !arrayList.isEmpty(), z);
        iv9Var.d.setText(jb6.M0(2131747901, null));
        iv9Var.e.setVisibility(8);
    }
}
