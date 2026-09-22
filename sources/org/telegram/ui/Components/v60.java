package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class v60 implements org.telegram.ui.yb0 {
    public final /* synthetic */ w60 a;

    public v60(w60 w60Var) {
        this.a = w60Var;
    }

    @Override // org.telegram.ui.yb0
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        int i10;
        org.telegram.ui.ib ibVar = this.a.a.c.j0;
        if (ibVar != null) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
            TLRPC.TL_channelAdminLogEventActionExportedInviteEdit tL_channelAdminLogEventActionExportedInviteEdit = new TLRPC.TL_channelAdminLogEventActionExportedInviteEdit();
            tL_channelAdminLogEventActionExportedInviteEdit.new_invite = tL_chatInviteExported;
            tL_channelAdminLogEventActionExportedInviteEdit.prev_invite = tL_chatInviteExported;
            tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteEdit;
            tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
            org.telegram.ui.vb vbVar = ibVar.a;
            tL_channelAdminLogEvent.user_id = vbVar.getAccountInstance().getUserConfig().clientUserId;
            i10 = ((org.telegram.ui.ActionBar.n2) vbVar).currentAccount;
            if (new MessageObject(i10, tL_channelAdminLogEvent, (ArrayList<MessageObject>) vbVar.n0, (HashMap<String, ArrayList<MessageObject>>) vbVar.m0, vbVar.f, vbVar.T, true).contentType < 0) {
                return;
            }
            vbVar.R0();
            vbVar.E.l();
            org.telegram.ui.vb.K0(vbVar);
        }
    }

    @Override // org.telegram.ui.yb0
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override // org.telegram.ui.yb0
    public final void c(TLObject tLObject) {
    }
}
