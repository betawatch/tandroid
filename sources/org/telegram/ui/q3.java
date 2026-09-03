package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class q3 implements org.telegram.ui.web.g0 {
    public final /* synthetic */ r3 a;

    public q3(r3 r3Var) {
        this.a = r3Var;
    }

    @Override // org.telegram.ui.web.g0
    public final void b() {
        a4 a4Var = this.a.H.H;
        if (a4Var != null) {
            a4Var.dismiss(true);
        }
    }

    @Override // org.telegram.ui.web.g0
    public final /* synthetic */ String g(boolean z4, boolean z10) {
        return "UNSUPPORTED";
    }

    @Override // org.telegram.ui.web.g0
    public final /* synthetic */ boolean h() {
        return false;
    }

    @Override // org.telegram.ui.web.g0
    public final void j() {
        r3 r3Var = this.a;
        n4 n4Var = r3Var.H;
        a4 a4Var = n4Var.H;
        if (a4Var == null) {
            if (n4Var.r0[0] == r3Var) {
                n4Var.G();
            }
        } else {
            if (a4Var.h) {
                return;
            }
            a4Var.h = true;
            a4Var.release();
            a4Var.H.s();
        }
    }

    @Override // org.telegram.ui.web.g0
    public final void o(int i10, boolean z4) {
        r3.a(this.a, z4, i10);
    }

    @Override // org.telegram.ui.web.g0
    public final void y() {
        r3 r3Var = this.a;
        n4 n4Var = r3Var.H;
        if (n4Var.r0[0] == r3Var) {
            n4Var.G();
        }
    }

    @Override // org.telegram.ui.web.g0
    public final /* synthetic */ rh.u0 z() {
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
    public final void i(boolean z4) {
    }

    @Override // org.telegram.ui.web.g0
    public final void k(boolean z4) {
    }

    @Override // org.telegram.ui.web.g0
    public final void m(int i10) {
    }

    @Override // org.telegram.ui.web.g0
    public final /* synthetic */ void p(boolean z4) {
    }

    @Override // org.telegram.ui.web.g0
    public final /* synthetic */ void r(int i10) {
    }

    @Override // org.telegram.ui.web.g0
    public final void s() {
    }

    @Override // org.telegram.ui.web.g0
    public final void t(boolean z4) {
    }

    @Override // org.telegram.ui.web.g0
    public final /* synthetic */ void w(boolean z4) {
    }

    @Override // org.telegram.ui.web.g0
    public final void x(boolean z4) {
    }

    @Override // org.telegram.ui.web.g0
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
    }

    @Override // org.telegram.ui.web.g0
    public final void u(int i10, int i11, boolean z4) {
    }

    @Override // org.telegram.ui.web.g0
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
    }

    @Override // org.telegram.ui.web.g0
    public final void q(boolean z4, boolean z10, String str, long j10, int i10, int i11, boolean z11, boolean z12) {
    }

    @Override // org.telegram.ui.web.g0
    public final void l(boolean z4, boolean z10, String str, long j10, int i10, int i11, boolean z11, boolean z12, String str2) {
    }
}
