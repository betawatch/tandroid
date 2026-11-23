package org.telegram.ui;

import android.graphics.RectF;
import android.view.TextureView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class pu0 implements org.telegram.ui.ActionBar.n0, dr0, gh.a, org.telegram.ui.Components.j8 {
    public final /* synthetic */ ProfileActivity a;

    public /* synthetic */ pu0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // gh.a
    public /* synthetic */ float A1() {
        return 0.0f;
    }

    @Override // gh.a
    public int A2() {
        ProfileActivity profileActivity = this.a;
        gh.e eVar = profileActivity.M5;
        return org.telegram.ui.ActionBar.m6.r1(profileActivity.l4(), eVar.a(eVar.e));
    }

    @Override // gh.a
    public /* synthetic */ int D1() {
        return 0;
    }

    @Override // org.telegram.ui.dr0
    public void G0(org.telegram.messenger.gj gjVar) {
        ProfileActivity profileActivity = this.a;
        profileActivity.a.I0(true);
        vv0 vv0Var = profileActivity.O;
        if (vv0Var != null && vv0Var.getCurrentListView() != null) {
            profileActivity.O.getCurrentListView().I0(true);
        }
        profileActivity.d1.setBackgroundColor(i0.a.f(0.1f, profileActivity.f4(profileActivity.Z4.f), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.a7, profileActivity.A0)));
    }

    @Override // org.telegram.ui.dr0
    public void H(org.telegram.messenger.gj gjVar) {
        org.telegram.ui.Components.zf0 zf0Var = this.a.n0;
        if (zf0Var == null || !zf0Var.a) {
            return;
        }
        zf0Var.L.e(true, 0.0f);
        zf0Var.invalidate();
    }

    @Override // gh.a
    public /* synthetic */ int M0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.j8
    public void R0(int i7, int i10) {
        RectF rectF = ProfileActivity.Z6;
        ProfileActivity profileActivity = this.a;
        long a10 = profileActivity.a();
        profileActivity.getMessagesController().T4(i7, a10);
        if (profileActivity.w2 == null && profileActivity.v2 == null) {
            return;
        }
        UndoView undoView = profileActivity.M;
        TLRPC.User c22 = profileActivity.getMessagesController().c2(Long.valueOf(a10));
        TLRPC.UserFull userFull = profileActivity.w2;
        undoView.k(a10, i10, c22, Integer.valueOf(userFull != null ? userFull.ttl_period : profileActivity.v2.ttl_period), null, null);
    }

    @Override // gh.a
    public int U0() {
        ProfileActivity profileActivity = this.a;
        gh.e eVar = profileActivity.M5;
        return i0.a.f(profileActivity.l4(), 352321535, eVar.a(eVar.d));
    }

    @Override // gh.a
    public int W1() {
        ProfileActivity profileActivity = this.a;
        gh.e eVar = profileActivity.M5;
        return org.telegram.ui.ActionBar.m6.r1(profileActivity.l4(), eVar.a(eVar.b));
    }

    @Override // gh.a
    public /* synthetic */ float Y0() {
        return -1.0f;
    }

    @Override // gh.a
    public /* synthetic */ float Z0() {
        return -1.0f;
    }

    @Override // org.telegram.ui.Components.j8
    public void d1() {
        this.a.presentFragment(new p4());
        dismiss();
    }

    @Override // org.telegram.ui.Components.j8
    public void dismiss() {
        this.a.T0.V(null, null);
    }

    @Override // org.telegram.ui.dr0
    public /* synthetic */ TextureView f0() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.n0
    public void k() {
        RectF rectF = ProfileActivity.Z6;
        org.telegram.ui.Components.yk0.d(new a5(this.a, 19));
    }

    @Override // gh.a
    public int t0() {
        ProfileActivity profileActivity = this.a;
        gh.e eVar = profileActivity.M5;
        return i0.a.f(profileActivity.l4(), 553648127, eVar.a(eVar.c));
    }

    @Override // org.telegram.ui.ActionBar.n0
    public void j() {
    }
}
