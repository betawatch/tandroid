package bi;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class a3 extends k8 {
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
