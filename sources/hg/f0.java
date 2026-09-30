package hg;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class f0 extends s4.d0 {
    public final /* synthetic */ g0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g0 g0Var, Context context) {
        super(context);
        this.r = g0Var;
    }

    @Override // s4.d0
    public final int k(int i10, View view) {
        return org.telegram.messenger.f0.A(8.0f, ((k0) this.r.V).s.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override // s4.d0
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
