// default package

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.SessionsActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class f7a implements ca1 {
    public TLObject a = null;
    public TLRPC.TL_error b = null;
    public final /* synthetic */ SessionsActivity c;

    public f7a(SessionsActivity sessionsActivity) {
        this.c = sessionsActivity;
    }

    @Override // ca1
    public final void H(String str) {
        TLObject tLObject = this.a;
        byte b = 0;
        if (!(tLObject instanceof TLRPC.TL_authorization)) {
            if (this.b != null) {
                gl.c3(new e7a(this, b));
                return;
            }
            return;
        }
        TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
        boolean z = tL_authorization.password_pending;
        SessionsActivity sessionsActivity = this.c;
        if (z) {
            sessionsActivity.e.add(0, tL_authorization);
            sessionsActivity.V = 4;
            sessionsActivity.o0(false);
        } else {
            sessionsActivity.d.add(0, tL_authorization);
        }
        sessionsActivity.q0();
        sessionsActivity.a.f();
        sessionsActivity.r.m(this.a, 11, 0L);
    }

    @Override // ca1
    public final boolean W0(String str, u91 u91Var) {
        this.a = null;
        this.b = null;
        gl.d3(new q3a((Object) this, (Object) str, (Object) u91Var, (byte) 3), 750L);
        return true;
    }

    @Override // ca1
    public final String Z0() {
        return null;
    }

    @Override // ca1
    public final void onDismiss() {
    }

    @Override // ca1
    public final void Q1(vf7 vf7Var) {
    }
}
