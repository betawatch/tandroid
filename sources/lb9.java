// default package

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
