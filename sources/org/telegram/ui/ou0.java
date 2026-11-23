package org.telegram.ui;

import android.graphics.RectF;
import android.view.TextureView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ou0 implements org.telegram.ui.ActionBar.n0, dr0, gh.a, org.telegram.ui.Components.i8 {
    public final /* synthetic */ ProfileActivity a;

    public /* synthetic */ ou0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // gh.a
    public /* synthetic */ float A1() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.i8
    public void B0(int i7, int i10) {
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
    public /* synthetic */ int D0() {
        return 0;
    }

    @Override // gh.a
    public /* synthetic */ int D1() {
        return 0;
    }

    @Override // org.telegram.ui.dr0
    public void G(org.telegram.messenger.fj fjVar) {
        org.telegram.ui.Components.yf0 yf0Var = this.a.n0;
        if (yf0Var == null || !yf0Var.a) {
            return;
        }
        yf0Var.L.e(true, 0.0f);
        yf0Var.invalidate();
    }

    @Override // gh.a
    public int Q0() {
        ProfileActivity profileActivity = this.a;
        gh.e eVar = profileActivity.M5;
        return i0.a.f(profileActivity.l4(), 352321535, eVar.a(eVar.d));
    }

    @Override // org.telegram.ui.dr0
    public /* synthetic */ TextureView T() {
        return null;
    }

    @Override // gh.a
    public /* synthetic */ float T0() {
        return -1.0f;
    }

    @Override // gh.a
    public /* synthetic */ float V0() {
        return -1.0f;
    }

    @Override // org.telegram.ui.Components.i8
    public void X0() {
        this.a.presentFragment(new p4());
        dismiss();
    }

    @Override // gh.a
    public int X1() {
        ProfileActivity profileActivity = this.a;
        gh.e eVar = profileActivity.M5;
        return org.telegram.ui.ActionBar.n6.r1(profileActivity.l4(), eVar.a(eVar.b));
    }

    @Override // org.telegram.ui.ActionBar.n0
    public void d() {
        RectF rectF = ProfileActivity.Z6;
        org.telegram.ui.Components.yk0.d(new a5(this.a, 19));
    }

    @Override // org.telegram.ui.Components.i8
    public void dismiss() {
        this.a.T0.V(null, null);
    }

    @Override // gh.a
    public int i0() {
        ProfileActivity profileActivity = this.a;
        gh.e eVar = profileActivity.M5;
        return i0.a.f(profileActivity.l4(), 553648127, eVar.a(eVar.c));
    }

    @Override // org.telegram.ui.dr0
    public void u0(org.telegram.messenger.fj fjVar) {
        ProfileActivity profileActivity = this.a;
        profileActivity.a.I0(true);
        uv0 uv0Var = profileActivity.O;
        if (uv0Var != null && uv0Var.getCurrentListView() != null) {
            profileActivity.O.getCurrentListView().I0(true);
        }
        profileActivity.d1.setBackgroundColor(i0.a.f(0.1f, profileActivity.f4(profileActivity.Z4.f), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.a7, profileActivity.A0)));
    }

    @Override // gh.a
    public int x2() {
        ProfileActivity profileActivity = this.a;
        gh.e eVar = profileActivity.M5;
        return org.telegram.ui.ActionBar.n6.r1(profileActivity.l4(), eVar.a(eVar.e));
    }

    @Override // org.telegram.ui.ActionBar.n0
    public void a() {
    }
}
