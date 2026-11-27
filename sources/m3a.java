// default package

import android.content.Context;
import android.text.TextUtils;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class m3a extends cw9 {
    public en9 f;
    public final /* synthetic */ z3a h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3a(z3a z3aVar, Context context, x53 x53Var) {
        super(context, 13.0f, x53Var);
        this.h = z3aVar;
    }

    @Override // cw9
    public final void a(String str) {
        en9 en9Var = this.f;
        if (en9Var != null) {
            hl.r(en9Var);
        }
        this.f = new en9(this, str, (byte) 21);
        boolean isEmpty = TextUtils.isEmpty(str);
        en9 en9Var2 = this.f;
        if (isEmpty) {
            en9Var2.run();
        } else {
            hl.d3(en9Var2, 300L);
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
