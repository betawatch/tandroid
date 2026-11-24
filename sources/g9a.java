// default package

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.SessionsActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class g9a implements kb1 {
    public TLObject a = null;
    public TLRPC.TL_error b = null;
    public final /* synthetic */ SessionsActivity c;

    public g9a(SessionsActivity sessionsActivity) {
        this.c = sessionsActivity;
    }

    @Override // kb1
    public final String B0() {
        return null;
    }

    @Override // kb1
    public final boolean X(String str, db1 db1Var) {
        this.a = null;
        this.b = null;
        gm.d3(new hw9((Object) this, (Object) str, (Object) db1Var, (byte) 6), 750L);
        return true;
    }

    @Override // kb1
    public final void v(String str) {
        TLObject tLObject = this.a;
        byte b = 0;
        if (!(tLObject instanceof TLRPC.TL_authorization)) {
            if (this.b != null) {
                gm.c3(new f9a(this, b));
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
            sessionsActivity.p0(false);
        } else {
            sessionsActivity.d.add(0, tL_authorization);
        }
        sessionsActivity.r0();
        sessionsActivity.a.f();
        sessionsActivity.r.m(this.a, 11, 0L);
    }

    @Override // kb1
    public final void I0(yh7 yh7Var) {
    }

    @Override // kb1
    public final void onDismiss() {
    }
}
