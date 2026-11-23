package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class t50 implements org.telegram.ui.j90 {
    public final /* synthetic */ u50 a;

    public t50(u50 u50Var) {
        this.a = u50Var;
    }

    @Override // org.telegram.ui.j90
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
            tL_channelAdminLogEvent.user_id = org.telegram.messenger.k10.i(lbVar.getAccountInstance().a).n;
            i7 = ((org.telegram.ui.ActionBar.g2) lbVar).currentAccount;
            if (new org.telegram.messenger.gj(i7, tL_channelAdminLogEvent, lbVar.o0, lbVar.n0, lbVar.f, lbVar.U, true).U < 0) {
                return;
            }
            lbVar.W0();
            lbVar.F.f();
            org.telegram.ui.lb.P0(lbVar);
        }
    }

    @Override // org.telegram.ui.j90
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override // org.telegram.ui.j90
    public final void c(TLObject tLObject) {
    }
}
