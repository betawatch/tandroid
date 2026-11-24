// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.m;
import org.telegram.ui.o;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jx implements uv0 {
    public final /* synthetic */ m a;

    public jx(m mVar) {
        this.a = mVar;
    }

    @Override // uv0
    public final ws0 A() {
        return null;
    }

    @Override // uv0
    public final void b() {
        sx sxVar = this.a.M.L;
        if (sxVar != null) {
            sxVar.a(true);
        }
    }

    @Override // uv0
    public final String g(boolean z, boolean z2) {
        return "UNSUPPORTED";
    }

    @Override // uv0
    public final boolean h() {
        return false;
    }

    @Override // uv0
    public final void j() {
        m mVar = this.a;
        o oVar = mVar.M;
        sx sxVar = oVar.L;
        if (sxVar == null) {
            if (oVar.v0[0] == mVar) {
                oVar.D();
            }
        } else {
            if (sxVar.h) {
                return;
            }
            sxVar.h = true;
            sxVar.release();
            sxVar.L.p();
        }
    }

    @Override // uv0
    public final void o(int i, boolean z) {
        this.a.g(i, z);
    }

    @Override // uv0
    public final void z() {
        m mVar = this.a;
        o oVar = mVar.M;
        if (oVar.v0[0] == mVar) {
            oVar.D();
        }
    }

    @Override // uv0
    public final void a() {
    }

    @Override // uv0
    public final void c() {
    }

    @Override // uv0
    public final void d(TLRPC.Document document) {
    }

    @Override // uv0
    public final void e(String str) {
    }

    @Override // uv0
    public final void f(ArrayList arrayList) {
    }

    @Override // uv0
    public final void i(boolean z) {
    }

    @Override // uv0
    public final void k(boolean z) {
    }

    @Override // uv0
    public final void m(int i) {
    }

    @Override // uv0
    public final void p(boolean z) {
    }

    @Override // uv0
    public final void r(int i) {
    }

    @Override // uv0
    public final void s() {
    }

    @Override // uv0
    public final void t(boolean z) {
    }

    @Override // uv0
    public final void w(boolean z) {
    }

    @Override // uv0
    public final void x(int i) {
    }

    @Override // uv0
    public final void y(boolean z) {
    }

    @Override // uv0
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
    }

    @Override // uv0
    public final void u(int i, int i2, boolean z) {
    }

    @Override // uv0
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
    }

    @Override // uv0
    public final void l(boolean z, boolean z2, String str, long j, int i, int i2, boolean z3, boolean z4, String str2) {
    }

    @Override // uv0
    public final void q(boolean z, boolean z2, String str, long j, int i, int i2, boolean z3, boolean z4) {
    }
}
