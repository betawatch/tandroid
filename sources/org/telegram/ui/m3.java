package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class m3 implements org.telegram.ui.web.h0 {
    public final /* synthetic */ n3 a;

    public m3(n3 n3Var) {
        this.a = n3Var;
    }

    @Override // org.telegram.ui.web.h0
    public final /* synthetic */ gi.y0 A() {
        return null;
    }

    @Override // org.telegram.ui.web.h0
    public final void b() {
        w3 w3Var = this.a.L.K;
        if (w3Var != null) {
            w3Var.dismiss(true);
        }
    }

    @Override // org.telegram.ui.web.h0
    public final /* synthetic */ String g(boolean z10, boolean z11) {
        return "UNSUPPORTED";
    }

    @Override // org.telegram.ui.web.h0
    public final /* synthetic */ boolean h() {
        return false;
    }

    @Override // org.telegram.ui.web.h0
    public final void j() {
        n3 n3Var = this.a;
        k4 k4Var = n3Var.L;
        w3 w3Var = k4Var.K;
        if (w3Var == null) {
            if (k4Var.u0[0] == n3Var) {
                k4Var.G();
            }
        } else {
            if (w3Var.h) {
                return;
            }
            w3Var.h = true;
            w3Var.release();
            w3Var.K.s();
        }
    }

    @Override // org.telegram.ui.web.h0
    public final void o(int i10, boolean z10) {
        n3.a(this.a, z10, i10);
    }

    @Override // org.telegram.ui.web.h0
    public final void z() {
        n3 n3Var = this.a;
        k4 k4Var = n3Var.L;
        if (k4Var.u0[0] == n3Var) {
            k4Var.G();
        }
    }

    @Override // org.telegram.ui.web.h0
    public final /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.web.h0
    public final /* synthetic */ void c() {
    }

    @Override // org.telegram.ui.web.h0
    public final /* synthetic */ void d(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.web.h0
    public final /* synthetic */ void e(String str) {
    }

    @Override // org.telegram.ui.web.h0
    public final /* synthetic */ void f(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.web.h0
    public final void i(boolean z10) {
    }

    @Override // org.telegram.ui.web.h0
    public final void k(boolean z10) {
    }

    @Override // org.telegram.ui.web.h0
    public final void m(int i10) {
    }

    @Override // org.telegram.ui.web.h0
    public final /* synthetic */ void p(boolean z10) {
    }

    @Override // org.telegram.ui.web.h0
    public final /* synthetic */ void r(int i10) {
    }

    @Override // org.telegram.ui.web.h0
    public final void s() {
    }

    @Override // org.telegram.ui.web.h0
    public final void t(boolean z10) {
    }

    @Override // org.telegram.ui.web.h0
    public final /* synthetic */ void w(boolean z10) {
    }

    @Override // org.telegram.ui.web.h0
    public final void x(int i10) {
    }

    @Override // org.telegram.ui.web.h0
    public final void y(boolean z10) {
    }

    @Override // org.telegram.ui.web.h0
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
    }

    @Override // org.telegram.ui.web.h0
    public final void u(int i10, int i11, boolean z10) {
    }

    @Override // org.telegram.ui.web.h0
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
    }

    @Override // org.telegram.ui.web.h0
    public final void q(boolean z10, boolean z11, String str, long j10, int i10, int i11, boolean z12, boolean z13) {
    }

    @Override // org.telegram.ui.web.h0
    public final void l(boolean z10, boolean z11, String str, long j10, int i10, int i11, boolean z12, boolean z13, String str2) {
    }
}
