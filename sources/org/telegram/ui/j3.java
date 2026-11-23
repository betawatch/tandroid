package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class j3 implements org.telegram.ui.web.c0 {
    public final /* synthetic */ k3 a;

    public j3(k3 k3Var) {
        this.a = k3Var;
    }

    @Override // org.telegram.ui.web.c0
    public final /* synthetic */ ki.v0 A() {
        return null;
    }

    @Override // org.telegram.ui.web.c0
    public final void b() {
        t3 t3Var = this.a.M.L;
        if (t3Var != null) {
            t3Var.a(true);
        }
    }

    @Override // org.telegram.ui.web.c0
    public final /* synthetic */ String g(boolean z10, boolean z11) {
        return "UNSUPPORTED";
    }

    @Override // org.telegram.ui.web.c0
    public final /* synthetic */ boolean h() {
        return false;
    }

    @Override // org.telegram.ui.web.c0
    public final void j() {
        k3 k3Var = this.a;
        g4 g4Var = k3Var.M;
        t3 t3Var = g4Var.L;
        if (t3Var == null) {
            if (g4Var.v0[0] == k3Var) {
                g4Var.E();
            }
        } else {
            if (t3Var.h) {
                return;
            }
            t3Var.h = true;
            t3Var.release();
            t3Var.L.q();
        }
    }

    @Override // org.telegram.ui.web.c0
    public final void o(int i7, boolean z10) {
        k3.a(this.a, z10, i7);
    }

    @Override // org.telegram.ui.web.c0
    public final void z() {
        k3 k3Var = this.a;
        g4 g4Var = k3Var.M;
        if (g4Var.v0[0] == k3Var) {
            g4Var.E();
        }
    }

    @Override // org.telegram.ui.web.c0
    public final /* synthetic */ void d(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.web.c0
    public final /* synthetic */ void e(String str) {
    }

    @Override // org.telegram.ui.web.c0
    public final /* synthetic */ void f(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.web.c0
    public final void i(boolean z10) {
    }

    @Override // org.telegram.ui.web.c0
    public final void k(boolean z10) {
    }

    @Override // org.telegram.ui.web.c0
    public final void m(int i7) {
    }

    @Override // org.telegram.ui.web.c0
    public final /* synthetic */ void p(boolean z10) {
    }

    @Override // org.telegram.ui.web.c0
    public final /* synthetic */ void r(int i7) {
    }

    @Override // org.telegram.ui.web.c0
    public final void t(boolean z10) {
    }

    @Override // org.telegram.ui.web.c0
    public final /* synthetic */ void w(boolean z10) {
    }

    @Override // org.telegram.ui.web.c0
    public final void x(int i7) {
    }

    @Override // org.telegram.ui.web.c0
    public final void y(boolean z10) {
    }

    @Override // org.telegram.ui.web.c0
    public final /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.web.c0
    public final /* synthetic */ void c() {
    }

    @Override // org.telegram.ui.web.c0
    public final void s() {
    }

    @Override // org.telegram.ui.web.c0
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
    }

    @Override // org.telegram.ui.web.c0
    public final void u(int i7, int i10, boolean z10) {
    }

    @Override // org.telegram.ui.web.c0
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
    }

    @Override // org.telegram.ui.web.c0
    public final void l(boolean z10, boolean z11, String str, long j3, int i7, int i10, boolean z12, boolean z13, String str2) {
    }

    @Override // org.telegram.ui.web.c0
    public final void q(boolean z10, boolean z11, String str, long j3, int i7, int i10, boolean z12, boolean z13) {
    }
}
