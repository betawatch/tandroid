package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class j3 implements org.telegram.ui.web.d0 {
    public final /* synthetic */ k3 a;

    public j3(k3 k3Var) {
        this.a = k3Var;
    }

    @Override // org.telegram.ui.web.d0
    public final /* synthetic */ hi.v0 A() {
        return null;
    }

    @Override // org.telegram.ui.web.d0
    public final void b() {
        t3 t3Var = this.a.L.K;
        if (t3Var != null) {
            t3Var.a(true);
        }
    }

    @Override // org.telegram.ui.web.d0
    public final /* synthetic */ String g(boolean z9, boolean z10) {
        return "UNSUPPORTED";
    }

    @Override // org.telegram.ui.web.d0
    public final /* synthetic */ boolean h() {
        return false;
    }

    @Override // org.telegram.ui.web.d0
    public final void j() {
        k3 k3Var = this.a;
        g4 g4Var = k3Var.L;
        t3 t3Var = g4Var.K;
        if (t3Var == null) {
            if (g4Var.u0[0] == k3Var) {
                g4Var.E();
            }
        } else {
            if (t3Var.h) {
                return;
            }
            t3Var.h = true;
            t3Var.release();
            t3Var.K.q();
        }
    }

    @Override // org.telegram.ui.web.d0
    public final void o(int i7, boolean z9) {
        k3.a(this.a, z9, i7);
    }

    @Override // org.telegram.ui.web.d0
    public final void z() {
        k3 k3Var = this.a;
        g4 g4Var = k3Var.L;
        if (g4Var.u0[0] == k3Var) {
            g4Var.E();
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
    public final void i(boolean z9) {
    }

    @Override // org.telegram.ui.web.d0
    public final void k(boolean z9) {
    }

    @Override // org.telegram.ui.web.d0
    public final void m(int i7) {
    }

    @Override // org.telegram.ui.web.d0
    public final /* synthetic */ void p(boolean z9) {
    }

    @Override // org.telegram.ui.web.d0
    public final /* synthetic */ void r(int i7) {
    }

    @Override // org.telegram.ui.web.d0
    public final void t(boolean z9) {
    }

    @Override // org.telegram.ui.web.d0
    public final /* synthetic */ void w(boolean z9) {
    }

    @Override // org.telegram.ui.web.d0
    public final void x(int i7) {
    }

    @Override // org.telegram.ui.web.d0
    public final void y(boolean z9) {
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
    public final void u(int i7, int i10, boolean z9) {
    }

    @Override // org.telegram.ui.web.d0
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
    }

    @Override // org.telegram.ui.web.d0
    public final void l(boolean z9, boolean z10, String str, long j3, int i7, int i10, boolean z11, boolean z12, String str2) {
    }

    @Override // org.telegram.ui.web.d0
    public final void q(boolean z9, boolean z10, String str, long j3, int i7, int i10, boolean z11, boolean z12) {
    }
}
