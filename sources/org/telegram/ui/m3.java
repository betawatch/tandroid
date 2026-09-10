package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class m3 implements org.telegram.ui.web.h0 {
    public final /* synthetic */ n3 a;

    public m3(n3 n3Var) {
        this.a = n3Var;
    }

    @Override // org.telegram.ui.web.h0
    public final void b() {
        w3 w3Var = this.a.K.K;
        if (w3Var != null) {
            w3Var.dismiss(true);
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
        n3 n3Var = this.a;
        j4 j4Var = n3Var.K;
        w3 w3Var = j4Var.K;
        if (w3Var == null) {
            if (j4Var.u0[0] == n3Var) {
                j4Var.G();
            }
        } else {
            if (w3Var.h) {
                return;
            }
            w3Var.h = true;
            w3Var.release();
            w3Var.K.s();
        }
    }

    @Override // org.telegram.ui.web.h0
    public final void o(int i10, boolean z10) {
        n3.a(this.a, z10, i10);
    }

    @Override // org.telegram.ui.web.h0
    public final void y() {
        n3 n3Var = this.a;
        j4 j4Var = n3Var.K;
        if (j4Var.u0[0] == n3Var) {
            j4Var.G();
        }
    }

    @Override // org.telegram.ui.web.h0
    public final /* synthetic */ di.d1 z() {
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
