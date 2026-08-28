package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class o3 implements org.telegram.ui.web.e0 {
    public final /* synthetic */ p3 a;

    public o3(p3 p3Var) {
        this.a = p3Var;
    }

    @Override // org.telegram.ui.web.e0
    public final void b() {
        y3 y3Var = this.a.G.G;
        if (y3Var != null) {
            y3Var.dismiss(true);
        }
    }

    @Override // org.telegram.ui.web.e0
    public final /* synthetic */ String g(boolean z10, boolean z11) {
        return "UNSUPPORTED";
    }

    @Override // org.telegram.ui.web.e0
    public final /* synthetic */ boolean h() {
        return false;
    }

    @Override // org.telegram.ui.web.e0
    public final void j() {
        p3 p3Var = this.a;
        l4 l4Var = p3Var.G;
        y3 y3Var = l4Var.G;
        if (y3Var == null) {
            if (l4Var.q0[0] == p3Var) {
                l4Var.G();
            }
        } else {
            if (y3Var.h) {
                return;
            }
            y3Var.h = true;
            y3Var.release();
            y3Var.G.s();
        }
    }

    @Override // org.telegram.ui.web.e0
    public final void o(int i9, boolean z10) {
        p3.a(this.a, z10, i9);
    }

    @Override // org.telegram.ui.web.e0
    public final void y() {
        p3 p3Var = this.a;
        l4 l4Var = p3Var.G;
        if (l4Var.q0[0] == p3Var) {
            l4Var.G();
        }
    }

    @Override // org.telegram.ui.web.e0
    public final /* synthetic */ mh.y0 z() {
        return null;
    }

    @Override // org.telegram.ui.web.e0
    public final /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.web.e0
    public final /* synthetic */ void c() {
    }

    @Override // org.telegram.ui.web.e0
    public final /* synthetic */ void d(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.web.e0
    public final /* synthetic */ void e(String str) {
    }

    @Override // org.telegram.ui.web.e0
    public final /* synthetic */ void f(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.web.e0
    public final void i(boolean z10) {
    }

    @Override // org.telegram.ui.web.e0
    public final void k(boolean z10) {
    }

    @Override // org.telegram.ui.web.e0
    public final void m(int i9) {
    }

    @Override // org.telegram.ui.web.e0
    public final /* synthetic */ void p(boolean z10) {
    }

    @Override // org.telegram.ui.web.e0
    public final /* synthetic */ void r(int i9) {
    }

    @Override // org.telegram.ui.web.e0
    public final void s() {
    }

    @Override // org.telegram.ui.web.e0
    public final void t(boolean z10) {
    }

    @Override // org.telegram.ui.web.e0
    public final /* synthetic */ void w(boolean z10) {
    }

    @Override // org.telegram.ui.web.e0
    public final void x(boolean z10) {
    }

    @Override // org.telegram.ui.web.e0
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
    }

    @Override // org.telegram.ui.web.e0
    public final void u(int i9, int i10, boolean z10) {
    }

    @Override // org.telegram.ui.web.e0
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
    }

    @Override // org.telegram.ui.web.e0
    public final void q(boolean z10, boolean z11, String str, long j10, int i9, int i10, boolean z12, boolean z13) {
    }

    @Override // org.telegram.ui.web.e0
    public final void l(boolean z10, boolean z11, String str, long j10, int i9, int i10, boolean z12, boolean z13, String str2) {
    }
}
