package bi;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class c2 extends a6 {
    public final /* synthetic */ ViewTreeObserver T;
    public final /* synthetic */ j1 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(long j3, String str, long j10, org.telegram.ui.ActionBar.e6 e6Var, ViewTreeObserver viewTreeObserver, j1 j1Var) {
        super(j3, str, j10, e6Var);
        this.T = viewTreeObserver;
        this.U = j1Var;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onPause() {
        super.onPause();
        this.T.removeOnPreDrawListener(this.U);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onResume() {
        super.onResume();
        this.T.addOnPreDrawListener(this.U);
    }
}
