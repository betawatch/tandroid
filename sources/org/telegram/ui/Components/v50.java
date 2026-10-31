package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v50 implements org.telegram.ui.la0 {
    public final /* synthetic */ w50 a;

    public v50(w50 w50Var) {
        this.a = w50Var;
    }

    @Override // org.telegram.ui.la0
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
            tL_channelAdminLogEvent.user_id = org.telegram.messenger.d20.i(sbVar.getAccountInstance().a).n;
            i10 = ((org.telegram.ui.ActionBar.k2) sbVar).currentAccount;
            if (new org.telegram.messenger.jj(i10, tL_channelAdminLogEvent, sbVar.n0, sbVar.m0, sbVar.f, sbVar.T, true).U < 0) {
                return;
            }
            sbVar.V0();
            sbVar.E.f();
            org.telegram.ui.sb.O0(sbVar);
        }
    }

    @Override // org.telegram.ui.la0
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override // org.telegram.ui.la0
    public final void c(TLObject tLObject) {
    }
}
