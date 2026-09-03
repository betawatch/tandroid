package lh;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class s1 extends r5 {
    public final /* synthetic */ ViewTreeObserver K;
    public final /* synthetic */ z0 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(long j10, String str, long j11, g6 g6Var, ViewTreeObserver viewTreeObserver, z0 z0Var) {
        super(j10, str, j11, g6Var);
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
