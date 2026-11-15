package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class i50 implements org.telegram.ui.h90 {
    public final /* synthetic */ j50 a;

    public i50(j50 j50Var) {
        this.a = j50Var;
    }

    @Override // org.telegram.ui.h90
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        int i7;
        org.telegram.ui.ab abVar = this.a.a.c.e2;
        if (abVar != null) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
            TLRPC.TL_channelAdminLogEventActionExportedInviteEdit tL_channelAdminLogEventActionExportedInviteEdit = new TLRPC.TL_channelAdminLogEventActionExportedInviteEdit();
            tL_channelAdminLogEventActionExportedInviteEdit.new_invite = tL_chatInviteExported;
            tL_channelAdminLogEventActionExportedInviteEdit.prev_invite = tL_chatInviteExported;
            tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteEdit;
            tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
            org.telegram.ui.lb lbVar = abVar.a;
            tL_channelAdminLogEvent.user_id = org.telegram.messenger.m10.i(lbVar.getAccountInstance().a).n;
            i7 = ((org.telegram.ui.ActionBar.e2) lbVar).currentAccount;
            if (new org.telegram.messenger.gj(i7, tL_channelAdminLogEvent, lbVar.o0, lbVar.n0, lbVar.f, lbVar.U, true).U < 0) {
                return;
            }
            lbVar.W0();
            lbVar.F.f();
            org.telegram.ui.lb.P0(lbVar);
        }
    }

    @Override // org.telegram.ui.h90
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override // org.telegram.ui.h90
    public final void c(TLObject tLObject) {
    }
}
