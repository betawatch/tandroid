package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class t50 implements org.telegram.ui.ab0 {
    public final /* synthetic */ u50 a;

    public t50(u50 u50Var) {
        this.a = u50Var;
    }

    @Override // org.telegram.ui.ab0
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        int i9;
        org.telegram.ui.bb bbVar = this.a.a.c.f0;
        if (bbVar != null) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
            TLRPC.TL_channelAdminLogEventActionExportedInviteEdit tL_channelAdminLogEventActionExportedInviteEdit = new TLRPC.TL_channelAdminLogEventActionExportedInviteEdit();
            tL_channelAdminLogEventActionExportedInviteEdit.new_invite = tL_chatInviteExported;
            tL_channelAdminLogEventActionExportedInviteEdit.prev_invite = tL_chatInviteExported;
            tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteEdit;
            tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
            org.telegram.ui.pb pbVar = bbVar.a;
            tL_channelAdminLogEvent.user_id = pbVar.getAccountInstance().getUserConfig().clientUserId;
            i9 = ((org.telegram.ui.ActionBar.o2) pbVar).currentAccount;
            if (new MessageObject(i9, tL_channelAdminLogEvent, (ArrayList<MessageObject>) pbVar.n0, (HashMap<String, ArrayList<MessageObject>>) pbVar.m0, pbVar.s, pbVar.T, true).contentType < 0) {
                return;
            }
            pbVar.R0();
            pbVar.E.l();
            org.telegram.ui.pb.K0(pbVar);
        }
    }

    @Override // org.telegram.ui.ab0
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override // org.telegram.ui.ab0
    public final void c(TLObject tLObject) {
    }
}
