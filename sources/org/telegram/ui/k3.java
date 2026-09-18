package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class k3 implements org.telegram.ui.web.h0 {
    public final /* synthetic */ l3 a;

    public k3(l3 l3Var) {
        this.a = l3Var;
    }

    @Override // org.telegram.ui.web.h0
    public final void b() {
        u3 u3Var = this.a.K.K;
        if (u3Var != null) {
            u3Var.dismiss(true);
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
        l3 l3Var = this.a;
        h4 h4Var = l3Var.K;
        u3 u3Var = h4Var.K;
        if (u3Var == null) {
            if (h4Var.u0[0] == l3Var) {
                h4Var.G();
            }
        } else {
            if (u3Var.h) {
                return;
            }
            u3Var.h = true;
            u3Var.release();
            u3Var.K.s();
        }
    }

    @Override // org.telegram.ui.web.h0
    public final void o(int i10, boolean z10) {
        l3.a(this.a, z10, i10);
    }

    @Override // org.telegram.ui.web.h0
    public final void y() {
        l3 l3Var = this.a;
        h4 h4Var = l3Var.K;
        if (h4Var.u0[0] == l3Var) {
            h4Var.G();
        }
    }

    @Override // org.telegram.ui.web.h0
    public final /* synthetic */ ei.a1 z() {
        return null;
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
    public final void x(boolean z10) {
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
    public final void q(boolean z10, boolean z11, String str, long j3, int i10, int i11, boolean z12, boolean z13) {
    }

    @Override // org.telegram.ui.web.h0
    public final void l(boolean z10, boolean z11, String str, long j3, int i10, int i11, boolean z12, boolean z13, String str2) {
    }
}
