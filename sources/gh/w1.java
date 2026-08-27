package gh;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class w1 extends y5 {
    public final /* synthetic */ ViewTreeObserver J;
    public final /* synthetic */ c1 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(long j10, String str, long j11, org.telegram.ui.ActionBar.c6 c6Var, ViewTreeObserver viewTreeObserver, c1 c1Var) {
        super(j10, str, j11, c6Var);
        this.J = viewTreeObserver;
        this.K = c1Var;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onPause() {
        super.onPause();
        this.J.removeOnPreDrawListener(this.K);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        this.J.addOnPreDrawListener(this.K);
    }
}
