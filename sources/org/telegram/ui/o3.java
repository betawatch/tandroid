package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class o3 implements org.telegram.ui.web.f0 {
    public final /* synthetic */ p3 a;

    public o3(p3 p3Var) {
        this.a = p3Var;
    }

    @Override // org.telegram.ui.web.f0
    public final void b() {
        y3 y3Var = this.a.H.H;
        if (y3Var != null) {
            y3Var.dismiss(true);
        }
    }

    @Override // org.telegram.ui.web.f0
    public final /* synthetic */ String g(boolean z4, boolean z10) {
        return "UNSUPPORTED";
    }

    @Override // org.telegram.ui.web.f0
    public final /* synthetic */ boolean h() {
        return false;
    }

    @Override // org.telegram.ui.web.f0
    public final void j() {
        p3 p3Var = this.a;
        l4 l4Var = p3Var.H;
        y3 y3Var = l4Var.H;
        if (y3Var == null) {
            if (l4Var.r0[0] == p3Var) {
                l4Var.G();
            }
        } else {
            if (y3Var.h) {
                return;
            }
            y3Var.h = true;
            y3Var.release();
            y3Var.H.s();
        }
    }

    @Override // org.telegram.ui.web.f0
    public final void o(int i10, boolean z4) {
        p3.a(this.a, z4, i10);
    }

    @Override // org.telegram.ui.web.f0
    public final void y() {
        p3 p3Var = this.a;
        l4 l4Var = p3Var.H;
        if (l4Var.r0[0] == p3Var) {
            l4Var.G();
        }
    }

    @Override // org.telegram.ui.web.f0
    public final /* synthetic */ sh.u0 z() {
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
    public final void i(boolean z4) {
    }

    @Override // org.telegram.ui.web.f0
    public final void k(boolean z4) {
    }

    @Override // org.telegram.ui.web.f0
    public final void m(int i10) {
    }

    @Override // org.telegram.ui.web.f0
    public final /* synthetic */ void p(boolean z4) {
    }

    @Override // org.telegram.ui.web.f0
    public final /* synthetic */ void r(int i10) {
    }

    @Override // org.telegram.ui.web.f0
    public final void s() {
    }

    @Override // org.telegram.ui.web.f0
    public final void t(boolean z4) {
    }

    @Override // org.telegram.ui.web.f0
    public final /* synthetic */ void w(boolean z4) {
    }

    @Override // org.telegram.ui.web.f0
    public final void x(boolean z4) {
    }

    @Override // org.telegram.ui.web.f0
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
    }

    @Override // org.telegram.ui.web.f0
    public final void u(int i10, int i11, boolean z4) {
    }

    @Override // org.telegram.ui.web.f0
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
    }

    @Override // org.telegram.ui.web.f0
    public final void q(boolean z4, boolean z10, String str, long j10, int i10, int i11, boolean z11, boolean z12) {
    }

    @Override // org.telegram.ui.web.f0
    public final void l(boolean z4, boolean z10, String str, long j10, int i10, int i11, boolean z11, boolean z12, String str2) {
    }
}
