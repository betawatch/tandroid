// default package

import android.content.Context;
import android.text.TextUtils;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class m3a extends cw9 {
    public dn9 f;
    public final /* synthetic */ z3a h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3a(z3a z3aVar, Context context, x53 x53Var) {
        super(context, 13.0f, x53Var);
        this.h = z3aVar;
    }

    @Override // cw9
    public final void a(String str) {
        dn9 dn9Var = this.f;
        if (dn9Var != null) {
            hl.r(dn9Var);
        }
        this.f = new dn9(this, str, (byte) 22);
        boolean isEmpty = TextUtils.isEmpty(str);
        dn9 dn9Var2 = this.f;
        if (isEmpty) {
            dn9Var2.run();
        } else {
            hl.d3(dn9Var2, 300L);
        }
        if (this.f != null) {
            z3a z3aVar = this.h;
            if (z3aVar.R) {
                return;
            }
            z3aVar.R = true;
            z3aVar.x.E();
            z3aVar.y.g1(0, -z3aVar.r.getPaddingTop());
        }
    }
}
