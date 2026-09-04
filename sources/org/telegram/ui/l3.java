package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class l3 implements org.telegram.ui.web.i0 {
    public final /* synthetic */ m3 a;

    public l3(m3 m3Var) {
        this.a = m3Var;
    }

    @Override // org.telegram.ui.web.i0
    public final void b() {
        v3 v3Var = this.a.K.K;
        if (v3Var != null) {
            v3Var.dismiss(true);
        }
    }

    @Override // org.telegram.ui.web.i0
    public final /* synthetic */ String g(boolean z10, boolean z11) {
        return "UNSUPPORTED";
    }

    @Override // org.telegram.ui.web.i0
    public final /* synthetic */ boolean h() {
        return false;
    }

    @Override // org.telegram.ui.web.i0
    public final void j() {
        m3 m3Var = this.a;
        i4 i4Var = m3Var.K;
        v3 v3Var = i4Var.K;
        if (v3Var == null) {
            if (i4Var.u0[0] == m3Var) {
                i4Var.G();
            }
        } else {
            if (v3Var.h) {
                return;
            }
            v3Var.h = true;
            v3Var.release();
            v3Var.K.s();
        }
    }

    @Override // org.telegram.ui.web.i0
    public final void o(int i10, boolean z10) {
        m3.a(this.a, z10, i10);
    }

    @Override // org.telegram.ui.web.i0
    public final void y() {
        m3 m3Var = this.a;
        i4 i4Var = m3Var.K;
        if (i4Var.u0[0] == m3Var) {
            i4Var.G();
        }
    }

    @Override // org.telegram.ui.web.i0
    public final /* synthetic */ fi.a1 z() {
        return null;
    }

    @Override // org.telegram.ui.web.i0
    public final /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.web.i0
    public final /* synthetic */ void c() {
    }

    @Override // org.telegram.ui.web.i0
    public final /* synthetic */ void d(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.web.i0
    public final /* synthetic */ void e(String str) {
    }

    @Override // org.telegram.ui.web.i0
    public final /* synthetic */ void f(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.web.i0
    public final void i(boolean z10) {
    }

    @Override // org.telegram.ui.web.i0
    public final void k(boolean z10) {
    }

    @Override // org.telegram.ui.web.i0
    public final void m(int i10) {
    }

    @Override // org.telegram.ui.web.i0
    public final /* synthetic */ void p(boolean z10) {
    }

    @Override // org.telegram.ui.web.i0
    public final /* synthetic */ void r(int i10) {
    }

    @Override // org.telegram.ui.web.i0
    public final void s() {
    }

    @Override // org.telegram.ui.web.i0
    public final void t(boolean z10) {
    }

    @Override // org.telegram.ui.web.i0
    public final /* synthetic */ void w(boolean z10) {
    }

    @Override // org.telegram.ui.web.i0
    public final void x(boolean z10) {
    }

    @Override // org.telegram.ui.web.i0
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
    }

    @Override // org.telegram.ui.web.i0
    public final void u(int i10, int i11, boolean z10) {
    }

    @Override // org.telegram.ui.web.i0
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
    }

    @Override // org.telegram.ui.web.i0
    public final void q(boolean z10, boolean z11, String str, long j3, int i10, int i11, boolean z12, boolean z13) {
    }

    @Override // org.telegram.ui.web.i0
    public final void l(boolean z10, boolean z11, String str, long j3, int i10, int i11, boolean z12, boolean z13, String str2) {
    }
}
