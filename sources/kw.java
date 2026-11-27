// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.m;
import org.telegram.ui.o;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class kw implements uu0 {
    public final /* synthetic */ m a;

    public kw(m mVar) {
        this.a = mVar;
    }

    @Override // uu0
    public final wr0 A() {
        return null;
    }

    @Override // uu0
    public final void b() {
        tw twVar = this.a.M.L;
        if (twVar != null) {
            twVar.a(true);
        }
    }

    @Override // uu0
    public final String g(boolean z, boolean z2) {
        return "UNSUPPORTED";
    }

    @Override // uu0
    public final boolean h() {
        return false;
    }

    @Override // uu0
    public final void j() {
        m mVar = this.a;
        o oVar = mVar.M;
        tw twVar = oVar.L;
        if (twVar == null) {
            if (oVar.v0[0] == mVar) {
                oVar.D();
            }
        } else {
            if (twVar.h) {
                return;
            }
            twVar.h = true;
            twVar.release();
            twVar.L.p();
        }
    }

    @Override // uu0
    public final void o(int i, boolean z) {
        this.a.g(i, z);
    }

    @Override // uu0
    public final void z() {
        m mVar = this.a;
        o oVar = mVar.M;
        if (oVar.v0[0] == mVar) {
            oVar.D();
        }
    }

    @Override // uu0
    public final void a() {
    }

    @Override // uu0
    public final void c() {
    }

    @Override // uu0
    public final void s() {
    }

    @Override // uu0
    public final void d(TLRPC.Document document) {
    }

    @Override // uu0
    public final void e(String str) {
    }

    @Override // uu0
    public final void f(ArrayList arrayList) {
    }

    @Override // uu0
    public final void i(boolean z) {
    }

    @Override // uu0
    public final void k(boolean z) {
    }

    @Override // uu0
    public final void m(int i) {
    }

    @Override // uu0
    public final void p(boolean z) {
    }

    @Override // uu0
    public final void r(int i) {
    }

    @Override // uu0
    public final void t(boolean z) {
    }

    @Override // uu0
    public final void w(boolean z) {
    }

    @Override // uu0
    public final void x(int i) {
    }

    @Override // uu0
    public final void y(boolean z) {
    }

    @Override // uu0
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
    }

    @Override // uu0
    public final void u(int i, int i2, boolean z) {
    }

    @Override // uu0
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
    }

    @Override // uu0
    public final void l(boolean z, boolean z2, String str, long j, int i, int i2, boolean z3, boolean z4, String str2) {
    }

    @Override // uu0
    public final void q(boolean z, boolean z2, String str, long j, int i, int i2, boolean z3, boolean z4) {
    }
}
