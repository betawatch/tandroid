package di;

import android.content.Context;
import org.telegram.messenger.s10;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class f0 extends p41 {
    public final /* synthetic */ int Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(uj0 uj0Var, Context context, int i7, int i10, boolean z10, s10 s10Var, org.telegram.ui.ActionBar.e6 e6Var, int i11) {
        super(uj0Var, context, i7, i10, z10, s10Var, e6Var);
        this.Q = i11;
    }

    @Override // org.telegram.ui.Components.p41, org.telegram.ui.Components.tj0
    public boolean D(v4.e1 e1Var) {
        switch (this.Q) {
            case 0:
                return false;
            default:
                return super.D(e1Var);
        }
    }

    @Override // org.telegram.ui.Components.p41
    public int I(int i7) {
        switch (this.Q) {
            case 1:
                if (i7 == org.telegram.ui.ActionBar.j6.i5) {
                    return -15921907;
                }
                return org.telegram.ui.ActionBar.j6.w0(i7, this.x);
            default:
                return super.I(i7);
        }
    }
}
