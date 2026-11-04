package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b50 implements org.telegram.ui.d90 {
    public final /* synthetic */ c50 a;

    public b50(c50 c50Var) {
        this.a = c50Var;
    }

    @Override // org.telegram.ui.d90
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        int i3;
        org.telegram.ui.za zaVar = this.a.a.c.b2;
        if (zaVar != null) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
            TLRPC.TL_channelAdminLogEventActionExportedInviteEdit tL_channelAdminLogEventActionExportedInviteEdit = new TLRPC.TL_channelAdminLogEventActionExportedInviteEdit();
            tL_channelAdminLogEventActionExportedInviteEdit.new_invite = tL_chatInviteExported;
            tL_channelAdminLogEventActionExportedInviteEdit.prev_invite = tL_chatInviteExported;
            tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteEdit;
            tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
            org.telegram.ui.kb kbVar = zaVar.a;
            tL_channelAdminLogEvent.user_id = org.telegram.messenger.h10.i(kbVar.getAccountInstance().a).n;
            i3 = ((org.telegram.ui.ActionBar.d2) kbVar).currentAccount;
            if (new org.telegram.messenger.zi(i3, tL_channelAdminLogEvent, kbVar.o0, kbVar.n0, kbVar.f, kbVar.U, true).U < 0) {
                return;
            }
            kbVar.W0();
            kbVar.F.f();
            org.telegram.ui.kb.P0(kbVar);
        }
    }

    @Override // org.telegram.ui.d90
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override // org.telegram.ui.d90
    public final void c(TLObject tLObject) {
    }
}
