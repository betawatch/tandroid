package bi;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class w2 extends h8 {
    public final /* synthetic */ ViewTreeObserver V;
    public final /* synthetic */ f2 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(long j3, String str, long j10, org.telegram.ui.ActionBar.i6 i6Var, ViewTreeObserver viewTreeObserver, f2 f2Var) {
        super(j3, str, j10, i6Var);
        this.V = viewTreeObserver;
        this.W = f2Var;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onPause() {
        super.onPause();
        this.V.removeOnPreDrawListener(this.W);
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onResume() {
        super.onResume();
        this.V.addOnPreDrawListener(this.W);
    }
}
