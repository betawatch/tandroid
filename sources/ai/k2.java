package ai;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k2 extends i6 {
    public final /* synthetic */ ViewTreeObserver R;
    public final /* synthetic */ n1 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(long j10, String str, long j11, org.telegram.ui.ActionBar.e6 e6Var, ViewTreeObserver viewTreeObserver, n1 n1Var) {
        super(j10, str, j11, e6Var);
        this.R = viewTreeObserver;
        this.S = n1Var;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onPause() {
        super.onPause();
        this.R.removeOnPreDrawListener(this.S);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        this.R.addOnPreDrawListener(this.S);
    }
}
