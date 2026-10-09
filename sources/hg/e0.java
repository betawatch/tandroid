package hg;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class e0 extends s4.e0 {
    public final /* synthetic */ f0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(f0 f0Var, Context context) {
        super(context);
        this.r = f0Var;
    }

    @Override // s4.e0
    public final int k(int i10, View view) {
        return org.telegram.messenger.q.A(8.0f, ((j0) this.r.V).s.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override // s4.e0
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
