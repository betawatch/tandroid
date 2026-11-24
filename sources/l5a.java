// default package

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class l5a implements View.OnClickListener {
    public final /* synthetic */ ly1 a;
    public final /* synthetic */ TLRPC.TL_authorization b;
    public final /* synthetic */ n5a c;

    public l5a(n5a n5aVar, ly1 ly1Var, TLRPC.TL_authorization tL_authorization) {
        this.c = n5aVar;
        this.a = ly1Var;
        this.b = tL_authorization;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ((Switch) this.a.f).c(!r3.h, true);
        this.b.call_requests_disabled = !r3.h;
        this.c.E0();
    }
}
