// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class k22 extends y46 {
    public final /* synthetic */ ar0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k22(ar0 ar0Var, Context context) {
        super(context);
        this.r = ar0Var;
    }

    @Override // y46
    public final int k(int i, View view) {
        return uh9.f(7.0f, ((m22) this.r.R).n.getPaddingTop(), super.k(i, view));
    }

    @Override // y46
    public final int m(int i) {
        return super.m(i) << 1;
    }
}
