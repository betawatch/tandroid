package bi;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class c3 extends m8 {
    public final /* synthetic */ ViewTreeObserver V;
    public final /* synthetic */ l2 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(long j3, String str, long j10, org.telegram.ui.ActionBar.i6 i6Var, ViewTreeObserver viewTreeObserver, l2 l2Var) {
        super(j3, str, j10, i6Var);
        this.V = viewTreeObserver;
        this.W = l2Var;
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
