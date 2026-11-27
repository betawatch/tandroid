// default package

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class c9a implements View.OnClickListener {
    public final /* synthetic */ cz1 a;
    public final /* synthetic */ TLRPC.TL_authorization b;
    public final /* synthetic */ f9a c;

    public c9a(f9a f9aVar, cz1 cz1Var, TLRPC.TL_authorization tL_authorization) {
        this.c = f9aVar;
        this.a = cz1Var;
        this.b = tL_authorization;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ((Switch) this.a.f).c(!r3.h, true);
        this.b.encrypted_requests_disabled = !r3.h;
        this.c.F0();
    }
}
