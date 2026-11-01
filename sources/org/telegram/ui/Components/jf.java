package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class jf implements org.telegram.ui.ds0 {
    public boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ org.telegram.messenger.ff d;
    public final /* synthetic */ lf e;

    public jf(lf lfVar, Object obj, Object obj2, org.telegram.messenger.ff ffVar) {
        this.e = lfVar;
        this.b = obj;
        this.c = obj2;
        this.d = ffVar;
    }

    @Override // org.telegram.ui.ds0
    public final boolean A() {
        return this.a;
    }

    @Override // org.telegram.ui.ds0
    public final CharSequence C(int i10) {
        return null;
    }

    @Override // org.telegram.ui.ds0
    public final org.telegram.ui.fs0 E(org.telegram.messenger.kj kjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return null;
    }

    @Override // org.telegram.ui.ds0
    public final void F(boolean z10) {
        this.a = z10;
    }

    @Override // org.telegram.ui.ds0
    public final int H() {
        return 0;
    }

    @Override // org.telegram.ui.ds0
    public final /* synthetic */ boolean I() {
        return true;
    }

    @Override // org.telegram.ui.ds0
    public final boolean K() {
        return false;
    }

    @Override // org.telegram.ui.ds0
    public final /* synthetic */ boolean L() {
        return false;
    }

    @Override // org.telegram.ui.ds0
    public final /* synthetic */ boolean N() {
        return true;
    }

    @Override // org.telegram.ui.ds0
    public final /* synthetic */ boolean O() {
        return false;
    }

    @Override // org.telegram.ui.ds0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.ds0
    public final /* synthetic */ boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.ds0
    public final int R(Object obj) {
        return 0;
    }

    @Override // org.telegram.ui.ds0
    public final int S(int i10) {
        return 0;
    }

    @Override // org.telegram.ui.ds0
    public final boolean T() {
        return false;
    }

    @Override // org.telegram.ui.ds0
    public final boolean U() {
        return true;
    }

    @Override // org.telegram.ui.ds0
    public final org.telegram.messenger.kj V() {
        return null;
    }

    @Override // org.telegram.ui.ds0
    public final boolean Z() {
        return false;
    }

    @Override // org.telegram.ui.ds0
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.ds0
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.ds0
    public final String b0() {
        return "";
    }

    @Override // org.telegram.ui.ds0
    public final ArrayList c() {
        return null;
    }

    @Override // org.telegram.ui.ds0
    public final CharSequence c0(int i10) {
        return null;
    }

    @Override // org.telegram.ui.ds0
    public final void d() {
        vh.f fVar;
        nc h12 = PhotoViewer.v1().h1();
        if (h12 == null || (fVar = h12.f) == null) {
            return;
        }
        rt rtVar = fVar.a;
        rtVar.requestFocus();
        org.telegram.messenger.i0.J3(rtVar);
    }

    @Override // org.telegram.ui.ds0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.ds0
    public final /* synthetic */ boolean h() {
        return false;
    }

    @Override // org.telegram.ui.ds0
    public final org.telegram.messenger.lc j(int i10) {
        return null;
    }

    @Override // org.telegram.ui.ds0
    public final int k(int i10, org.telegram.messenger.y20 y20Var) {
        return 0;
    }

    @Override // org.telegram.ui.ds0
    public final boolean l() {
        return true;
    }

    @Override // org.telegram.ui.ds0
    public final void o(int i10, org.telegram.messenger.y20 y20Var, boolean z10, int i11, int i12, boolean z11) {
        this.e.B(null, this.b, null, this.c, z10, i11, i12, this.d, this.a);
    }

    @Override // org.telegram.ui.ds0
    public final boolean p() {
        return false;
    }

    @Override // org.telegram.ui.ds0
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // org.telegram.ui.ds0
    public final boolean r() {
        return false;
    }

    @Override // org.telegram.ui.ds0
    public final /* synthetic */ boolean t() {
        return true;
    }

    @Override // org.telegram.ui.ds0
    public final boolean u() {
        return false;
    }

    @Override // org.telegram.ui.ds0
    public final HashMap v() {
        return null;
    }

    @Override // org.telegram.ui.ds0
    public final /* synthetic */ boolean w() {
        return false;
    }

    @Override // org.telegram.ui.ds0
    public final boolean x(int i10) {
        return false;
    }

    @Override // org.telegram.ui.ds0
    public final int y() {
        return 0;
    }

    @Override // org.telegram.ui.ds0
    public final boolean z() {
        return true;
    }

    @Override // org.telegram.ui.ds0
    public final void B(int i10) {
    }

    @Override // org.telegram.ui.ds0
    public final void M(org.telegram.messenger.y20 y20Var) {
    }

    @Override // org.telegram.ui.ds0
    public final void X(int i10) {
    }

    @Override // org.telegram.ui.ds0
    public final /* synthetic */ void Y(int i10) {
    }

    @Override // org.telegram.ui.ds0
    public final void a0(int i10) {
    }

    @Override // org.telegram.ui.ds0
    public final void e(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.ds0
    public final void D() {
    }

    @Override // org.telegram.ui.ds0
    public final void G() {
    }

    @Override // org.telegram.ui.ds0
    public final /* synthetic */ void J() {
    }

    @Override // org.telegram.ui.ds0
    public final /* synthetic */ void W() {
    }

    @Override // org.telegram.ui.ds0
    public final /* synthetic */ void i() {
    }

    @Override // org.telegram.ui.ds0
    public final /* synthetic */ void m() {
    }

    @Override // org.telegram.ui.ds0
    public final void n() {
    }

    @Override // org.telegram.ui.ds0
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.ds0
    public final void f(String str, String str2, boolean z10) {
    }
}
