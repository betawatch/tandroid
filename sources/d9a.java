// default package

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class d9a implements View.OnClickListener {
    public final /* synthetic */ cz1 a;
    public final /* synthetic */ TLRPC.TL_authorization b;
    public final /* synthetic */ f9a c;

    public d9a(f9a f9aVar, cz1 cz1Var, TLRPC.TL_authorization tL_authorization) {
        this.c = f9aVar;
        this.a = cz1Var;
        this.b = tL_authorization;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ((Switch) this.a.f).c(!r3.h, true);
        this.b.call_requests_disabled = !r3.h;
        this.c.F0();
    }
}
