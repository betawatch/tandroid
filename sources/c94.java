// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class c94 extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new c94());
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        d94 d94Var = (d94) view;
        d94Var.a((TLRPC.StickerSetCovered) b8cVar.H, z, b8cVar.u, false);
        d94Var.f.a(b8cVar.u, false);
        d94Var.setAddOnClickListener(b8cVar.E);
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new d94(context, vnbVar);
    }
}
