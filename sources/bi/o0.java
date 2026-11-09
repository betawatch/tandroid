package bi;

import android.content.Context;
import org.telegram.messenger.v10;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class o0 extends m41 {
    public final /* synthetic */ int P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(qj0 qj0Var, Context context, int i7, int i10, boolean z9, v10 v10Var, org.telegram.ui.ActionBar.g6 g6Var, int i11) {
        super(qj0Var, context, i7, i10, z9, v10Var, g6Var);
        this.P = i11;
    }

    @Override // org.telegram.ui.Components.m41, org.telegram.ui.Components.pj0
    public boolean D(v4.d1 d1Var) {
        switch (this.P) {
            case 0:
                return false;
            default:
                return super.D(d1Var);
        }
    }

    @Override // org.telegram.ui.Components.m41
    public int I(int i7) {
        switch (this.P) {
            case 1:
                if (i7 == org.telegram.ui.ActionBar.l6.i5) {
                    return -15921907;
                }
                return org.telegram.ui.ActionBar.l6.w0(i7, this.x);
            default:
                return super.I(i7);
        }
    }
}
