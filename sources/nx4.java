// default package

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class nx4 extends nd9 {
    public final /* synthetic */ ViewTreeObserver d0;
    public final /* synthetic */ fx4 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx4(long j, String str, long j2, vnb vnbVar, ViewTreeObserver viewTreeObserver, fx4 fx4Var) {
        super(j, str, j2, vnbVar);
        this.d0 = viewTreeObserver;
        this.e0 = fx4Var;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onPause() {
        super.onPause();
        this.d0.removeOnPreDrawListener(this.e0);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onResume() {
        super.onResume();
        this.d0.addOnPreDrawListener(this.e0);
    }
}
