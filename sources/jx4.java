// default package

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jx4 extends zb9 {
    public final /* synthetic */ ViewTreeObserver V;
    public final /* synthetic */ cx4 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx4(long j, String str, long j2, ylb ylbVar, ViewTreeObserver viewTreeObserver, cx4 cx4Var) {
        super(j, str, j2, ylbVar);
        this.V = viewTreeObserver;
        this.W = cx4Var;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onPause() {
        super.onPause();
        this.V.removeOnPreDrawListener(this.W);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        this.V.addOnPreDrawListener(this.W);
    }
}
