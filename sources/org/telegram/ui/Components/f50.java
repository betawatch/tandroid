package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class f50 implements org.telegram.ui.g90 {
    public final /* synthetic */ g50 a;

    public f50(g50 g50Var) {
        this.a = g50Var;
    }

    @Override // org.telegram.ui.g90
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        int i7;
        org.telegram.ui.bb bbVar = this.a.a.c.a2;
        if (bbVar != null) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
            TLRPC.TL_channelAdminLogEventActionExportedInviteEdit tL_channelAdminLogEventActionExportedInviteEdit = new TLRPC.TL_channelAdminLogEventActionExportedInviteEdit();
            tL_channelAdminLogEventActionExportedInviteEdit.new_invite = tL_chatInviteExported;
            tL_channelAdminLogEventActionExportedInviteEdit.prev_invite = tL_chatInviteExported;
            tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteEdit;
            tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
            org.telegram.ui.mb mbVar = bbVar.a;
            tL_channelAdminLogEvent.user_id = org.telegram.messenger.p10.i(mbVar.getAccountInstance().a).n;
            i7 = ((org.telegram.ui.ActionBar.f2) mbVar).currentAccount;
            if (new org.telegram.messenger.ij(i7, tL_channelAdminLogEvent, mbVar.n0, mbVar.m0, mbVar.f, mbVar.T, true).U < 0) {
                return;
            }
            mbVar.W0();
            mbVar.E.f();
            org.telegram.ui.mb.P0(mbVar);
        }
    }

    @Override // org.telegram.ui.g90
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override // org.telegram.ui.g90
    public final void c(TLObject tLObject) {
    }
}
