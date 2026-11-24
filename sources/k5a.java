// default package

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class k5a implements View.OnClickListener {
    public final /* synthetic */ ly1 a;
    public final /* synthetic */ TLRPC.TL_authorization b;
    public final /* synthetic */ n5a c;

    public k5a(n5a n5aVar, ly1 ly1Var, TLRPC.TL_authorization tL_authorization) {
        this.c = n5aVar;
        this.a = ly1Var;
        this.b = tL_authorization;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ((Switch) this.a.f).c(!r3.h, true);
        this.b.encrypted_requests_disabled = !r3.h;
        this.c.E0();
    }
}
