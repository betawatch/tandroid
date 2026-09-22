package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class k60 implements org.telegram.ui.wb0 {
    public final /* synthetic */ l60 a;

    public k60(l60 l60Var) {
        this.a = l60Var;
    }

    @Override // org.telegram.ui.wb0
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        int i10;
        org.telegram.ui.hb hbVar = this.a.a.c.j0;
        if (hbVar != null) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
            TLRPC.TL_channelAdminLogEventActionExportedInviteEdit tL_channelAdminLogEventActionExportedInviteEdit = new TLRPC.TL_channelAdminLogEventActionExportedInviteEdit();
            tL_channelAdminLogEventActionExportedInviteEdit.new_invite = tL_chatInviteExported;
            tL_channelAdminLogEventActionExportedInviteEdit.prev_invite = tL_chatInviteExported;
            tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteEdit;
            tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
            org.telegram.ui.ub ubVar = hbVar.a;
            tL_channelAdminLogEvent.user_id = ubVar.getAccountInstance().getUserConfig().clientUserId;
            i10 = ((org.telegram.ui.ActionBar.n2) ubVar).currentAccount;
            if (new MessageObject(i10, tL_channelAdminLogEvent, (ArrayList<MessageObject>) ubVar.n0, (HashMap<String, ArrayList<MessageObject>>) ubVar.m0, ubVar.f, ubVar.T, true).contentType < 0) {
                return;
            }
            ubVar.R0();
            ubVar.E.l();
            org.telegram.ui.ub.K0(ubVar);
        }
    }

    @Override // org.telegram.ui.wb0
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override // org.telegram.ui.wb0
    public final void c(TLObject tLObject) {
    }
}
