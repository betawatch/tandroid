// default package

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class iv4 extends z99 {
    public final /* synthetic */ ViewTreeObserver V;
    public final /* synthetic */ bv4 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv4(long j, String str, long j2, wjb wjbVar, ViewTreeObserver viewTreeObserver, bv4 bv4Var) {
        super(j, str, j2, wjbVar);
        this.V = viewTreeObserver;
        this.W = bv4Var;
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
