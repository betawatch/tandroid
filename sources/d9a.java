// default package

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
