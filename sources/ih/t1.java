package ih;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class t1 extends r5 {
    public final /* synthetic */ ViewTreeObserver J;
    public final /* synthetic */ a1 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(long j10, String str, long j11, org.telegram.ui.ActionBar.c6 c6Var, ViewTreeObserver viewTreeObserver, a1 a1Var) {
        super(j10, str, j11, c6Var);
        this.J = viewTreeObserver;
        this.K = a1Var;
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
