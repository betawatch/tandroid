// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.m;
import org.telegram.ui.o;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class jw implements ku0 {
    public final /* synthetic */ m a;

    public jw(m mVar) {
        this.a = mVar;
    }

    @Override // ku0
    public final or0 A() {
        return null;
    }

    @Override // ku0
    public final void b() {
        sw swVar = this.a.M.L;
        if (swVar != null) {
            swVar.a(true);
        }
    }

    @Override // ku0
    public final String g(boolean z, boolean z2) {
        return "UNSUPPORTED";
    }

    @Override // ku0
    public final boolean h() {
        return false;
    }

    @Override // ku0
    public final void j() {
        m mVar = this.a;
        o oVar = mVar.M;
        sw swVar = oVar.L;
        if (swVar == null) {
            if (oVar.v0[0] == mVar) {
                oVar.D();
            }
        } else {
            if (swVar.h) {
                return;
            }
            swVar.h = true;
            swVar.release();
            swVar.L.p();
        }
    }

    @Override // ku0
    public final void o(int i, boolean z) {
        this.a.g(i, z);
    }

    @Override // ku0
    public final void z() {
        m mVar = this.a;
        o oVar = mVar.M;
        if (oVar.v0[0] == mVar) {
            oVar.D();
        }
    }

    @Override // ku0
    public final void a() {
    }

    @Override // ku0
    public final void c() {
    }

    @Override // ku0
    public final void s() {
    }

    @Override // ku0
    public final void d(TLRPC.Document document) {
    }

    @Override // ku0
    public final void e(String str) {
    }

    @Override // ku0
    public final void f(ArrayList arrayList) {
    }

    @Override // ku0
    public final void i(boolean z) {
    }

    @Override // ku0
    public final void k(boolean z) {
    }

    @Override // ku0
    public final void m(int i) {
    }

    @Override // ku0
    public final void p(boolean z) {
    }

    @Override // ku0
    public final void r(int i) {
    }

    @Override // ku0
    public final void t(boolean z) {
    }

    @Override // ku0
    public final void w(boolean z) {
    }

    @Override // ku0
    public final void x(int i) {
    }

    @Override // ku0
    public final void y(boolean z) {
    }

    @Override // ku0
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
    }

    @Override // ku0
    public final void u(int i, int i2, boolean z) {
    }

    @Override // ku0
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
    }

    @Override // ku0
    public final void l(boolean z, boolean z2, String str, long j, int i, int i2, boolean z3, boolean z4, String str2) {
    }

    @Override // ku0
    public final void q(boolean z, boolean z2, String str, long j, int i, int i2, boolean z3, boolean z4) {
    }
}
