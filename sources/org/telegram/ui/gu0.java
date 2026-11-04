package org.telegram.ui;

import android.graphics.RectF;
import android.view.TextureView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class gu0 implements org.telegram.ui.ActionBar.n0, tq0, hh.a, org.telegram.ui.Components.d8 {
    public final /* synthetic */ ProfileActivity a;

    public /* synthetic */ gu0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // hh.a
    public /* synthetic */ int F() {
        return 0;
    }

    @Override // org.telegram.ui.tq0
    public void G(org.telegram.messenger.zi ziVar) {
        org.telegram.ui.Components.nf0 nf0Var = this.a.n0;
        if (nf0Var == null || !nf0Var.a) {
            return;
        }
        nf0Var.L.e(true, 0.0f);
        nf0Var.invalidate();
    }

    @Override // org.telegram.ui.tq0
    public void I0(org.telegram.messenger.zi ziVar) {
        ProfileActivity profileActivity = this.a;
        profileActivity.a.I0(true);
        mv0 mv0Var = profileActivity.O;
        if (mv0Var != null && mv0Var.getCurrentListView() != null) {
            profileActivity.O.getCurrentListView().I0(true);
        }
        profileActivity.d1.setBackgroundColor(i0.a.f(0.1f, profileActivity.f4(profileActivity.W4.f), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, profileActivity.A0)));
    }

    @Override // hh.a
    public int M() {
        ProfileActivity profileActivity = this.a;
        hh.e eVar = profileActivity.H5;
        return i0.a.f(profileActivity.l4(), 352321535, eVar.a(eVar.d));
    }

    @Override // hh.a
    public /* synthetic */ float O() {
        return -1.0f;
    }

    @Override // hh.a
    public /* synthetic */ float W() {
        return -1.0f;
    }

    @Override // org.telegram.ui.Components.d8
    public void W0(int i3, int i10) {
        RectF rectF = ProfileActivity.T6;
        ProfileActivity profileActivity = this.a;
        long a10 = profileActivity.a();
        profileActivity.getMessagesController().I4(i3, a10);
        if (profileActivity.v2 == null && profileActivity.u2 == null) {
            return;
        }
        UndoView undoView = profileActivity.M;
        TLRPC.User a22 = profileActivity.getMessagesController().a2(Long.valueOf(a10));
        TLRPC.UserFull userFull = profileActivity.v2;
        undoView.k(a10, i10, a22, Integer.valueOf(userFull != null ? userFull.ttl_period : profileActivity.u2.ttl_period), null, null);
    }

    @Override // hh.a
    public /* synthetic */ float a0() {
        return 0.0f;
    }

    @Override // hh.a
    public /* synthetic */ int c0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.d8
    public void dismiss() {
        this.a.T0.U(null, null);
    }

    @Override // org.telegram.ui.ActionBar.n0
    public void g() {
        RectF rectF = ProfileActivity.T6;
        org.telegram.ui.Components.nk0.d(new c5(this.a, 18));
    }

    @Override // org.telegram.ui.Components.d8
    public void g1() {
        this.a.presentFragment(new r4());
        dismiss();
    }

    @Override // org.telegram.ui.tq0
    public /* synthetic */ TextureView i0() {
        return null;
    }

    @Override // hh.a
    public int u0() {
        ProfileActivity profileActivity = this.a;
        hh.e eVar = profileActivity.H5;
        return org.telegram.ui.ActionBar.k6.r1(profileActivity.l4(), eVar.a(eVar.b));
    }

    @Override // hh.a
    public int w0() {
        ProfileActivity profileActivity = this.a;
        hh.e eVar = profileActivity.H5;
        return org.telegram.ui.ActionBar.k6.r1(profileActivity.l4(), eVar.a(eVar.e));
    }

    @Override // hh.a
    public int x() {
        ProfileActivity profileActivity = this.a;
        hh.e eVar = profileActivity.H5;
        return i0.a.f(profileActivity.l4(), 553648127, eVar.a(eVar.c));
    }

    @Override // org.telegram.ui.ActionBar.n0
    public void e() {
    }
}
