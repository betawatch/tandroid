// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class l62 extends u26 {
    public final /* synthetic */ z12 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l62(z12 z12Var, Context context) {
        super(context);
        this.r = z12Var;
    }

    @Override // u26
    public final int k(int i, View view) {
        return de9.f(8.0f, ((p62) this.r.V).s.getPaddingTop() - gl.m, super.k(i, view));
    }

    @Override // u26
    public final int m(int i) {
        return super.m(i) << 1;
    }
}
