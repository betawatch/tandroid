package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class n3 implements org.telegram.ui.web.g0 {
    public final /* synthetic */ o3 a;

    public n3(o3 o3Var) {
        this.a = o3Var;
    }

    @Override // org.telegram.ui.web.g0
    public final void b() {
        x3 x3Var = this.a.K.K;
        if (x3Var != null) {
            x3Var.dismiss(true);
        }
    }

    @Override // org.telegram.ui.web.g0
    public final /* synthetic */ String g(boolean z10, boolean z11) {
        return "UNSUPPORTED";
    }

    @Override // org.telegram.ui.web.g0
    public final /* synthetic */ boolean h() {
        return false;
    }

    @Override // org.telegram.ui.web.g0
    public final void j() {
        o3 o3Var = this.a;
        l4 l4Var = o3Var.K;
        x3 x3Var = l4Var.K;
        if (x3Var == null) {
            if (l4Var.u0[0] == o3Var) {
                l4Var.G();
            }
        } else {
            if (x3Var.h) {
                return;
            }
            x3Var.h = true;
            x3Var.release();
            x3Var.K.s();
        }
    }

    @Override // org.telegram.ui.web.g0
    public final void o(int i10, boolean z10) {
        o3.a(this.a, z10, i10);
    }

    @Override // org.telegram.ui.web.g0
    public final void y() {
        o3 o3Var = this.a;
        l4 l4Var = o3Var.K;
        if (l4Var.u0[0] == o3Var) {
            l4Var.G();
        }
    }

    @Override // org.telegram.ui.web.g0
    public final /* synthetic */ gi.y0 z() {
        return null;
    }

    @Override // org.telegram.ui.web.g0
    public final /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.web.g0
    public final /* synthetic */ void c() {
    }

    @Override // org.telegram.ui.web.g0
    public final /* synthetic */ void d(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.web.g0
    public final /* synthetic */ void e(String str) {
    }

    @Override // org.telegram.ui.web.g0
    public final /* synthetic */ void f(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.web.g0
    public final void i(boolean z10) {
    }

    @Override // org.telegram.ui.web.g0
    public final void k(boolean z10) {
    }

    @Override // org.telegram.ui.web.g0
    public final void m(int i10) {
    }

    @Override // org.telegram.ui.web.g0
    public final /* synthetic */ void p(boolean z10) {
    }

    @Override // org.telegram.ui.web.g0
    public final /* synthetic */ void r(int i10) {
    }

    @Override // org.telegram.ui.web.g0
    public final void s() {
    }

    @Override // org.telegram.ui.web.g0
    public final void t(boolean z10) {
    }

    @Override // org.telegram.ui.web.g0
    public final /* synthetic */ void w(boolean z10) {
    }

    @Override // org.telegram.ui.web.g0
    public final void x(boolean z10) {
    }

    @Override // org.telegram.ui.web.g0
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
    }

    @Override // org.telegram.ui.web.g0
    public final void u(int i10, int i11, boolean z10) {
    }

    @Override // org.telegram.ui.web.g0
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
    }

    @Override // org.telegram.ui.web.g0
    public final void q(boolean z10, boolean z11, String str, long j10, int i10, int i11, boolean z12, boolean z13) {
    }

    @Override // org.telegram.ui.web.g0
    public final void l(boolean z10, boolean z11, String str, long j10, int i10, int i11, boolean z12, boolean z13, String str2) {
    }
}
