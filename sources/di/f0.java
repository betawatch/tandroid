package di;

import android.content.Context;
import org.telegram.messenger.q10;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class f0 extends c51 {
    public final /* synthetic */ int Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(ek0 ek0Var, Context context, int i7, int i10, boolean z10, q10 q10Var, org.telegram.ui.ActionBar.h6 h6Var, int i11) {
        super(ek0Var, context, i7, i10, z10, q10Var, h6Var);
        this.Q = i11;
    }

    @Override // org.telegram.ui.Components.c51, org.telegram.ui.Components.dk0
    public boolean D(v4.f1 f1Var) {
        switch (this.Q) {
            case 0:
                return false;
            default:
                return super.D(f1Var);
        }
    }

    @Override // org.telegram.ui.Components.c51
    public int I(int i7) {
        switch (this.Q) {
            case 1:
                if (i7 == org.telegram.ui.ActionBar.m6.i5) {
                    return -15921907;
                }
                return org.telegram.ui.ActionBar.m6.w0(i7, this.x);
            default:
                return super.I(i7);
        }
    }
}
