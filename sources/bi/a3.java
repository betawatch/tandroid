package bi;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class a3 extends j8 {
    public final /* synthetic */ ViewTreeObserver V;
    public final /* synthetic */ j2 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(long j3, String str, long j10, org.telegram.ui.ActionBar.h6 h6Var, ViewTreeObserver viewTreeObserver, j2 j2Var) {
        super(j3, str, j10, h6Var);
        this.V = viewTreeObserver;
        this.W = j2Var;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onPause() {
        super.onPause();
        this.V.removeOnPreDrawListener(this.W);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onResume() {
        super.onResume();
        this.V.addOnPreDrawListener(this.W);
    }
}
