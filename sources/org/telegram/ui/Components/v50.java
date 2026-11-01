package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class v50 implements org.telegram.ui.ka0 {
    public final /* synthetic */ w50 a;

    public v50(w50 w50Var) {
        this.a = w50Var;
    }

    @Override // org.telegram.ui.ka0
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        int i10;
        org.telegram.ui.gb gbVar = this.a.a.c.a2;
        if (gbVar != null) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
            TLRPC.TL_channelAdminLogEventActionExportedInviteEdit tL_channelAdminLogEventActionExportedInviteEdit = new TLRPC.TL_channelAdminLogEventActionExportedInviteEdit();
            tL_channelAdminLogEventActionExportedInviteEdit.new_invite = tL_chatInviteExported;
            tL_channelAdminLogEventActionExportedInviteEdit.prev_invite = tL_chatInviteExported;
            tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteEdit;
            tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
            org.telegram.ui.sb sbVar = gbVar.a;
            tL_channelAdminLogEvent.user_id = org.telegram.messenger.e20.i(sbVar.getAccountInstance().a).n;
            i10 = ((org.telegram.ui.ActionBar.k2) sbVar).currentAccount;
            if (new org.telegram.messenger.kj(i10, tL_channelAdminLogEvent, sbVar.n0, sbVar.m0, sbVar.f, sbVar.T, true).U < 0) {
                return;
            }
            sbVar.W0();
            sbVar.E.f();
            org.telegram.ui.sb.P0(sbVar);
        }
    }

    @Override // org.telegram.ui.ka0
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override // org.telegram.ui.ka0
    public final void c(TLObject tLObject) {
    }
}
