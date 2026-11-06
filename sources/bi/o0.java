package bi;

import android.content.Context;
import org.telegram.messenger.v10;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.pj0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class o0 extends f41 {
    public final /* synthetic */ int P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(pj0 pj0Var, Context context, int i7, int i10, boolean z9, v10 v10Var, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        super(pj0Var, context, i7, i10, z9, v10Var, f6Var);
        this.P = i11;
    }

    @Override // org.telegram.ui.Components.f41, org.telegram.ui.Components.oj0
    public boolean D(v4.d1 d1Var) {
        switch (this.P) {
            case 0:
                return false;
            default:
                return super.D(d1Var);
        }
    }

    @Override // org.telegram.ui.Components.f41
    public int I(int i7) {
        switch (this.P) {
            case 1:
                if (i7 == org.telegram.ui.ActionBar.k6.i5) {
                    return -15921907;
                }
                return org.telegram.ui.ActionBar.k6.w0(i7, this.x);
            default:
                return super.I(i7);
        }
    }
}
