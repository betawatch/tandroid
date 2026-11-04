package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k3 implements org.telegram.ui.web.d0 {
    public final /* synthetic */ l3 a;

    public k3(l3 l3Var) {
        this.a = l3Var;
    }

    @Override // org.telegram.ui.web.d0
    public final /* synthetic */ ii.w0 A() {
        return null;
    }

    @Override // org.telegram.ui.web.d0
    public final void b() {
        u3 u3Var = this.a.M.L;
        if (u3Var != null) {
            u3Var.a(true);
        }
    }

    @Override // org.telegram.ui.web.d0
    public final /* synthetic */ String g(boolean z10, boolean z11) {
        return "UNSUPPORTED";
    }

    @Override // org.telegram.ui.web.d0
    public final /* synthetic */ boolean h() {
        return false;
    }

    @Override // org.telegram.ui.web.d0
    public final void j() {
        l3 l3Var = this.a;
        i4 i4Var = l3Var.M;
        u3 u3Var = i4Var.L;
        if (u3Var == null) {
            if (i4Var.v0[0] == l3Var) {
                i4Var.E();
            }
        } else {
            if (u3Var.h) {
                return;
            }
            u3Var.h = true;
            u3Var.release();
            u3Var.L.q();
        }
    }

    @Override // org.telegram.ui.web.d0
    public final void o(int i3, boolean z10) {
        l3.a(this.a, z10, i3);
    }

    @Override // org.telegram.ui.web.d0
    public final void z() {
        l3 l3Var = this.a;
        i4 i4Var = l3Var.M;
        if (i4Var.v0[0] == l3Var) {
            i4Var.E();
        }
    }

    @Override // org.telegram.ui.web.d0
    public final /* synthetic */ void d(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.web.d0
    public final /* synthetic */ void e(String str) {
    }

    @Override // org.telegram.ui.web.d0
    public final /* synthetic */ void f(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.web.d0
    public final void i(boolean z10) {
    }

    @Override // org.telegram.ui.web.d0
    public final void k(boolean z10) {
    }

    @Override // org.telegram.ui.web.d0
    public final void m(int i3) {
    }

    @Override // org.telegram.ui.web.d0
    public final /* synthetic */ void p(boolean z10) {
    }

    @Override // org.telegram.ui.web.d0
    public final /* synthetic */ void r(int i3) {
    }

    @Override // org.telegram.ui.web.d0
    public final void t(boolean z10) {
    }

    @Override // org.telegram.ui.web.d0
    public final /* synthetic */ void w(boolean z10) {
    }

    @Override // org.telegram.ui.web.d0
    public final void x(int i3) {
    }

    @Override // org.telegram.ui.web.d0
    public final void y(boolean z10) {
    }

    @Override // org.telegram.ui.web.d0
    public final /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.web.d0
    public final /* synthetic */ void c() {
    }

    @Override // org.telegram.ui.web.d0
    public final void s() {
    }

    @Override // org.telegram.ui.web.d0
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
    }

    @Override // org.telegram.ui.web.d0
    public final void u(int i3, int i10, boolean z10) {
    }

    @Override // org.telegram.ui.web.d0
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
    }

    @Override // org.telegram.ui.web.d0
    public final void q(boolean z10, boolean z11, String str, long j10, int i3, int i10, boolean z12, boolean z13) {
    }

    @Override // org.telegram.ui.web.d0
    public final void l(boolean z10, boolean z11, String str, long j10, int i3, int i10, boolean z12, boolean z13, String str2) {
    }
}
