package di;

import android.content.Context;
import org.telegram.messenger.p10;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class f0 extends b51 {
    public final /* synthetic */ int Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(ek0 ek0Var, Context context, int i7, int i10, boolean z10, p10 p10Var, org.telegram.ui.ActionBar.i6 i6Var, int i11) {
        super(ek0Var, context, i7, i10, z10, p10Var, i6Var);
        this.Q = i11;
    }

    @Override // org.telegram.ui.Components.b51, org.telegram.ui.Components.dk0
    public boolean D(v4.f1 f1Var) {
        switch (this.Q) {
            case 0:
                return false;
            default:
                return super.D(f1Var);
        }
    }

    @Override // org.telegram.ui.Components.b51
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
