package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class p3 implements org.telegram.ui.web.f0 {
    public final /* synthetic */ q3 a;

    public p3(q3 q3Var) {
        this.a = q3Var;
    }

    @Override // org.telegram.ui.web.f0
    public final void b() {
        z3 z3Var = this.a.G.G;
        if (z3Var != null) {
            z3Var.dismiss(true);
        }
    }

    @Override // org.telegram.ui.web.f0
    public final /* synthetic */ String g(boolean z10, boolean z11) {
        return "UNSUPPORTED";
    }

    @Override // org.telegram.ui.web.f0
    public final /* synthetic */ boolean h() {
        return false;
    }

    @Override // org.telegram.ui.web.f0
    public final void j() {
        q3 q3Var = this.a;
        m4 m4Var = q3Var.G;
        z3 z3Var = m4Var.G;
        if (z3Var == null) {
            if (m4Var.q0[0] == q3Var) {
                m4Var.G();
            }
        } else {
            if (z3Var.h) {
                return;
            }
            z3Var.h = true;
            z3Var.release();
            z3Var.G.s();
        }
    }

    @Override // org.telegram.ui.web.f0
    public final void o(int i10, boolean z10) {
        q3.a(this.a, z10, i10);
    }

    @Override // org.telegram.ui.web.f0
    public final void y() {
        q3 q3Var = this.a;
        m4 m4Var = q3Var.G;
        if (m4Var.q0[0] == q3Var) {
            m4Var.G();
        }
    }

    @Override // org.telegram.ui.web.f0
    public final /* synthetic */ ph.u0 z() {
        return null;
    }

    @Override // org.telegram.ui.web.f0
    public final /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.web.f0
    public final /* synthetic */ void c() {
    }

    @Override // org.telegram.ui.web.f0
    public final /* synthetic */ void d(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.web.f0
    public final /* synthetic */ void e(String str) {
    }

    @Override // org.telegram.ui.web.f0
    public final /* synthetic */ void f(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.web.f0
    public final void i(boolean z10) {
    }

    @Override // org.telegram.ui.web.f0
    public final void k(boolean z10) {
    }

    @Override // org.telegram.ui.web.f0
    public final void m(int i10) {
    }

    @Override // org.telegram.ui.web.f0
    public final /* synthetic */ void p(boolean z10) {
    }

    @Override // org.telegram.ui.web.f0
    public final /* synthetic */ void r(int i10) {
    }

    @Override // org.telegram.ui.web.f0
    public final void s() {
    }

    @Override // org.telegram.ui.web.f0
    public final void t(boolean z10) {
    }

    @Override // org.telegram.ui.web.f0
    public final /* synthetic */ void w(boolean z10) {
    }

    @Override // org.telegram.ui.web.f0
    public final void x(boolean z10) {
    }

    @Override // org.telegram.ui.web.f0
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
    }

    @Override // org.telegram.ui.web.f0
    public final void u(int i10, int i11, boolean z10) {
    }

    @Override // org.telegram.ui.web.f0
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
    }

    @Override // org.telegram.ui.web.f0
    public final void q(boolean z10, boolean z11, String str, long j10, int i10, int i11, boolean z12, boolean z13) {
    }

    @Override // org.telegram.ui.web.f0
    public final void l(boolean z10, boolean z11, String str, long j10, int i10, int i11, boolean z12, boolean z13, String str2) {
    }
}
