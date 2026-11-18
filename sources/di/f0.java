package di;

import android.content.Context;
import org.telegram.messenger.q10;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class f0 extends z41 {
    public final /* synthetic */ int Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(ck0 ck0Var, Context context, int i7, int i10, boolean z10, q10 q10Var, org.telegram.ui.ActionBar.i6 i6Var, int i11) {
        super(ck0Var, context, i7, i10, z10, q10Var, i6Var);
        this.Q = i11;
    }

    @Override // org.telegram.ui.Components.z41, org.telegram.ui.Components.bk0
    public boolean D(v4.f1 f1Var) {
        switch (this.Q) {
            case 0:
                return false;
            default:
                return super.D(f1Var);
        }
    }

    @Override // org.telegram.ui.Components.z41
    public int I(int i7) {
        switch (this.Q) {
            case 1:
                if (i7 == org.telegram.ui.ActionBar.n6.i5) {
                    return -15921907;
                }
                return org.telegram.ui.ActionBar.n6.w0(i7, this.x);
            default:
                return super.I(i7);
        }
    }
}
