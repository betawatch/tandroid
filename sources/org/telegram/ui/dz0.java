package org.telegram.ui;

import android.view.TextureView;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class dz0 implements org.telegram.ui.ActionBar.s0, mv0, org.telegram.ui.Components.p8 {
    public final /* synthetic */ ProfileActivity a;

    public /* synthetic */ dz0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // org.telegram.ui.mv0
    public void H(MessageObject messageObject) {
        org.telegram.ui.Components.ki0 ki0Var = this.a.m0;
        if (ki0Var == null || !ki0Var.a) {
            return;
        }
        ki0Var.O.d(0.0f, true);
        ki0Var.invalidate();
    }

    @Override // org.telegram.ui.Components.p8
    public void Q0(int i10, int i11) {
        ProfileActivity profileActivity = this.a;
        long a2 = profileActivity.a();
        profileActivity.getMessagesController().setDialogHistoryTTL(a2, i10);
        if (profileActivity.v2 == null && profileActivity.u2 == null) {
            return;
        }
        UndoView undoView = profileActivity.M;
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(a2));
        TLRPC.UserFull userFull = profileActivity.v2;
        undoView.k(a2, i11, user, Integer.valueOf(userFull != null ? userFull.ttl_period : profileActivity.u2.ttl_period), null, null);
    }

    @Override // org.telegram.ui.mv0
    public /* synthetic */ TextureView d0() {
        return null;
    }

    @Override // org.telegram.ui.Components.p8
    public void dismiss() {
        this.a.T0.M(null, null);
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void e() {
        org.telegram.ui.Components.gn0.d(new b5(this.a, 18));
    }

    @Override // org.telegram.ui.Components.p8
    public void h1() {
        this.a.presentFragment(new p4());
        dismiss();
    }

    @Override // org.telegram.ui.mv0
    public void w0(MessageObject messageObject) {
        ProfileActivity profileActivity = this.a;
        profileActivity.a.I0(true);
        k01 k01Var = profileActivity.O;
        if (k01Var != null && k01Var.getCurrentListView() != null) {
            profileActivity.O.getCurrentListView().I0(true);
        }
        profileActivity.d1.setBackgroundColor(i0.a.d(0.1f, profileActivity.P3(profileActivity.V4.f), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.a7, profileActivity.z0)));
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void c() {
    }
}
