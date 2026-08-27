package org.telegram.ui;

import android.view.TextureView;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ay0 implements org.telegram.ui.ActionBar.s0, ku0, org.telegram.ui.Components.f8 {
    public final /* synthetic */ ProfileActivity a;

    public /* synthetic */ ay0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // org.telegram.ui.ku0
    public /* synthetic */ TextureView K() {
        return null;
    }

    @Override // org.telegram.ui.Components.f8
    public void V0(int i10, int i11) {
        ProfileActivity profileActivity = this.a;
        long a2 = profileActivity.a();
        profileActivity.getMessagesController().setDialogHistoryTTL(a2, i10);
        if (profileActivity.r2 == null && profileActivity.q2 == null) {
            return;
        }
        UndoView undoView = profileActivity.I;
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(a2));
        TLRPC.UserFull userFull = profileActivity.r2;
        undoView.k(a2, i11, user, Integer.valueOf(userFull != null ? userFull.ttl_period : profileActivity.q2.ttl_period), null, null);
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void d() {
        org.telegram.ui.Components.ol0.d(new b5(this.a, 18));
    }

    @Override // org.telegram.ui.Components.f8
    public void dismiss() {
        this.a.P0.M(null, null);
    }

    @Override // org.telegram.ui.Components.f8
    public void j1() {
        this.a.presentFragment(new q4());
        dismiss();
    }

    @Override // org.telegram.ui.ku0
    public void w0(MessageObject messageObject) {
        ProfileActivity profileActivity = this.a;
        profileActivity.a.I0(true);
        hz0 hz0Var = profileActivity.K;
        if (hz0Var != null && hz0Var.getCurrentListView() != null) {
            profileActivity.K.getCurrentListView().I0(true);
        }
        profileActivity.Z0.setBackgroundColor(i0.b.d(0.1f, profileActivity.P3(profileActivity.R4.f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.a7, profileActivity.v0)));
    }

    @Override // org.telegram.ui.ku0
    public void y(MessageObject messageObject) {
        org.telegram.ui.Components.tg0 tg0Var = this.a.i0;
        if (tg0Var == null || !tg0Var.a) {
            return;
        }
        tg0Var.K.d(0.0f, true);
        tg0Var.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void c() {
    }
}
