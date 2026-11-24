// default package

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class lw5 extends c79 {
    public final /* synthetic */ Bitmap F;
    public final /* synthetic */ q88 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw5(q88 q88Var, Context context, gu7 gu7Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, gu7Var, bitmap, null, null);
        this.G = q88Var;
        this.F = bitmap2;
    }

    @Override // c79
    public final void g(m01 m01Var) {
        int indexOf = m01.a.indexOf(m01Var);
        int i = indexOf + 1;
        if (i <= 1 || this.F != null) {
            indexOf = i;
        }
        q88 q88Var = this.G;
        q88Var.j1.b(indexOf);
        q88Var.s(m01Var);
    }
}
