package org.telegram.ui;

import android.graphics.RectF;
import android.view.TextureView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class nu0 implements org.telegram.ui.ActionBar.n0, br0, gh.a, org.telegram.ui.Components.c8 {
    public final /* synthetic */ ProfileActivity a;

    public /* synthetic */ nu0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // gh.a
    public /* synthetic */ float A1() {
        return 0.0f;
    }

    @Override // gh.a
    public int A2() {
        ProfileActivity profileActivity = this.a;
        gh.e eVar = profileActivity.K5;
        return org.telegram.ui.ActionBar.j6.r1(profileActivity.k4(), eVar.a(eVar.e));
    }

    @Override // gh.a
    public /* synthetic */ int D1() {
        return 0;
    }

    @Override // org.telegram.ui.br0
    public void G0(org.telegram.messenger.gj gjVar) {
        ProfileActivity profileActivity = this.a;
        profileActivity.a.I0(true);
        uv0 uv0Var = profileActivity.O;
        if (uv0Var != null && uv0Var.getCurrentListView() != null) {
            profileActivity.O.getCurrentListView().I0(true);
        }
        profileActivity.d1.setBackgroundColor(i0.a.f(0.1f, profileActivity.e4(profileActivity.X4.f), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.a7, profileActivity.A0)));
    }

    @Override // org.telegram.ui.br0
    public void I(org.telegram.messenger.gj gjVar) {
        org.telegram.ui.Components.nf0 nf0Var = this.a.n0;
        if (nf0Var == null || !nf0Var.a) {
            return;
        }
        nf0Var.L.e(true, 0.0f);
        nf0Var.invalidate();
    }

    @Override // gh.a
    public /* synthetic */ int M0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.c8
    public void R0(int i7, int i10) {
        RectF rectF = ProfileActivity.X6;
        ProfileActivity profileActivity = this.a;
        long a10 = profileActivity.a();
        profileActivity.getMessagesController().J4(i7, a10);
        if (profileActivity.w2 == null && profileActivity.v2 == null) {
            return;
        }
        UndoView undoView = profileActivity.M;
        TLRPC.User a22 = profileActivity.getMessagesController().a2(Long.valueOf(a10));
        TLRPC.UserFull userFull = profileActivity.w2;
        undoView.k(a10, i10, a22, Integer.valueOf(userFull != null ? userFull.ttl_period : profileActivity.v2.ttl_period), null, null);
    }

    @Override // gh.a
    public int U0() {
        ProfileActivity profileActivity = this.a;
        gh.e eVar = profileActivity.K5;
        return i0.a.f(profileActivity.k4(), 352321535, eVar.a(eVar.d));
    }

    @Override // gh.a
    public int W1() {
        ProfileActivity profileActivity = this.a;
        gh.e eVar = profileActivity.K5;
        return org.telegram.ui.ActionBar.j6.r1(profileActivity.k4(), eVar.a(eVar.b));
    }

    @Override // gh.a
    public /* synthetic */ float Y0() {
        return -1.0f;
    }

    @Override // gh.a
    public /* synthetic */ float Z0() {
        return -1.0f;
    }

    @Override // org.telegram.ui.Components.c8
    public void dismiss() {
        this.a.T0.V(null, null);
    }

    @Override // org.telegram.ui.br0
    public /* synthetic */ TextureView g0() {
        return null;
    }

    @Override // org.telegram.ui.Components.c8
    public void g1() {
        this.a.presentFragment(new p4());
        dismiss();
    }

    @Override // org.telegram.ui.ActionBar.n0
    public void k() {
        RectF rectF = ProfileActivity.X6;
        org.telegram.ui.Components.ok0.d(new a5(this.a, 19));
    }

    @Override // gh.a
    public int t0() {
        ProfileActivity profileActivity = this.a;
        gh.e eVar = profileActivity.K5;
        return i0.a.f(profileActivity.k4(), 553648127, eVar.a(eVar.c));
    }

    @Override // org.telegram.ui.ActionBar.n0
    public void i() {
    }
}
