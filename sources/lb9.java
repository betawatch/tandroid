// default package

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class lb9 extends zt3 {
    public final /* synthetic */ mb9 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb9(mb9 mb9Var, Context context, vnb vnbVar) {
        super(context, "", true, false, 1024, vnbVar);
        this.F = mb9Var;
    }

    @Override // zt3
    public final void b(Editable editable) {
        mb9 mb9Var = this.F;
        c51 c51Var = mb9Var.s;
        if (c51Var != null) {
            c51Var.setEnabled(mb9Var.d.optional || !TextUtils.isEmpty(mb9Var.n.getText()));
        }
    }
}
