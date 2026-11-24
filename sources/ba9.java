// default package

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ba9 extends su3 {
    public final /* synthetic */ ca9 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba9(ca9 ca9Var, Context context, ylb ylbVar) {
        super(context, "", true, false, 1024, ylbVar);
        this.F = ca9Var;
    }

    @Override // su3
    public final void b(Editable editable) {
        ca9 ca9Var = this.F;
        b61 b61Var = ca9Var.s;
        if (b61Var != null) {
            b61Var.setEnabled(ca9Var.d.optional || !TextUtils.isEmpty(ca9Var.n.getText()));
        }
    }
}
