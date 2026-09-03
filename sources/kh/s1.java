package kh;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class s1 extends q5 {
    public final /* synthetic */ ViewTreeObserver K;
    public final /* synthetic */ z0 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(long j10, String str, long j11, f6 f6Var, ViewTreeObserver viewTreeObserver, z0 z0Var) {
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
