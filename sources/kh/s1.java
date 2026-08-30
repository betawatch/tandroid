package kh;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class s1 extends r5 {
    public final /* synthetic */ ViewTreeObserver K;
    public final /* synthetic */ z0 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(long j10, String str, long j11, org.telegram.ui.ActionBar.f6 f6Var, ViewTreeObserver viewTreeObserver, z0 z0Var) {
        super(j10, str, j11, f6Var);
        this.K = viewTreeObserver;
        this.L = z0Var;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onPause() {
        super.onPause();
        this.K.removeOnPreDrawListener(this.L);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        this.K.addOnPreDrawListener(this.L);
    }
}
