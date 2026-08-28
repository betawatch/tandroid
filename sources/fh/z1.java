package fh;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class z1 extends g6 {
    public final /* synthetic */ ViewTreeObserver J;
    public final /* synthetic */ e1 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(long j10, String str, long j11, org.telegram.ui.ActionBar.b6 b6Var, ViewTreeObserver viewTreeObserver, e1 e1Var) {
        super(j10, str, j11, b6Var);
        this.J = viewTreeObserver;
        this.K = e1Var;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        super.onPause();
        this.J.removeOnPreDrawListener(this.K);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        this.J.addOnPreDrawListener(this.K);
    }
}
