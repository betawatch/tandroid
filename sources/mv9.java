// default package

import android.app.Activity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class mv9 extends bf5 {
    public final /* synthetic */ sj3 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv9(sj3 sj3Var, r59 r59Var, Activity activity, int i) {
        super(r59Var, activity, i);
        this.f0 = sj3Var;
    }

    @Override // l7c
    public final void O(boolean z) {
        super.O(z);
        iv9 iv9Var = this.f0.v0;
        iv9Var.e(false, z);
        iv9Var.d.setText(jb6.M0(2131747901, null));
        iv9Var.e.setVisibility(8);
    }
}
