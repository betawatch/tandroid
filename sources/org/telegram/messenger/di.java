package org.telegram.messenger;

import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class di implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ di(c1 c1Var, Object obj, Object obj2, int i7) {
        this.a = i7;
        this.b = c1Var;
        this.c = obj;
        this.d = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.a;
        int i10 = 1;
        Object obj = this.d;
        Object obj2 = this.c;
        c1 c1Var = this.b;
        switch (i7) {
            case 0:
                ui uiVar = (ui) c1Var;
                TLRPC.TL_messages_faveSticker tL_messages_faveSticker = (TLRPC.TL_messages_faveSticker) obj;
                if (tL_error != null && r8.r(tL_error.text) && obj2 != null) {
                    uiVar.getFileRefController().u(new Object[]{tL_messages_faveSticker}, obj2);
                    break;
                } else {
                    g0.h3(new fg(uiVar, 2));
                    break;
                }
            case 1:
                ui uiVar2 = (ui) c1Var;
                TLRPC.TL_messages_saveRecentSticker tL_messages_saveRecentSticker = (TLRPC.TL_messages_saveRecentSticker) obj;
                uiVar2.getClass();
                if (tL_error != null && r8.r(tL_error.text) && obj2 != null) {
                    uiVar2.getFileRefController().u(new Object[]{tL_messages_saveRecentSticker}, obj2);
                    break;
                }
                break;
            case 2:
                g0.h3(new mn((qp) c1Var, tL_error, tLObject, (Long) obj2, (c20) obj));
                break;
            case 3:
                qp qpVar = (qp) c1Var;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj2;
                TLRPC.TL_messages_createChat tL_messages_createChat = (TLRPC.TL_messages_createChat) obj;
                if (tL_error == null) {
                    if (tLObject instanceof TLRPC.TL_messages_invitedUsers) {
                        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) tLObject;
                        qpVar.O3(tL_messages_invitedUsers.updates, false);
                        g0.h3(new b4(9, qpVar, tL_messages_invitedUsers));
                        break;
                    }
                } else {
                    g0.h3(new em(qpVar, tL_error, f2Var, tL_messages_createChat, 2));
                    break;
                }
                break;
            case 4:
                qp qpVar2 = (qp) c1Var;
                org.telegram.ui.ActionBar.f2 f2Var2 = (org.telegram.ui.ActionBar.f2) obj2;
                TLRPC.TL_channels_createChannel tL_channels_createChannel = (TLRPC.TL_channels_createChannel) obj;
                if (tL_error == null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    qpVar2.O3(updates, false);
                    g0.h3(new hi(20, qpVar2, updates));
                    break;
                } else {
                    g0.h3(new em(qpVar2, tL_error, f2Var2, tL_channels_createChannel, 1));
                    break;
                }
            case 5:
                qp qpVar3 = (qp) c1Var;
                TLRPC.TL_messages_saveGif tL_messages_saveGif = (TLRPC.TL_messages_saveGif) obj;
                qpVar3.getClass();
                if (tL_error != null && r8.r(tL_error.text)) {
                    qpVar3.getFileRefController().u(new Object[]{tL_messages_saveGif}, obj2);
                    break;
                }
                break;
            case 6:
                qp qpVar4 = (qp) c1Var;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (tLObject != null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    if (t3.T(chat)) {
                        qpVar4.L3(tL_messages_affectedHistory.pts, tL_messages_affectedHistory.pts_count, chat.id);
                    } else {
                        qpVar4.M3(tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
                    }
                    new ArrayList();
                    qpVar4.getMessagesStorage().c2(chat != null ? -chat.id : user.id, null, false, 0, 0, false, null);
                    break;
                }
                break;
            case 7:
                qp qpVar5 = (qp) c1Var;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) obj2;
                String str = (String) obj;
                if ((tLObject instanceof TLRPC.TL_boolTrue) && chatFull != null) {
                    g0.h3(new lg((Object) qpVar5, (Object) chatFull, str, 14));
                    break;
                }
                break;
            case 8:
                qp qpVar6 = (qp) c1Var;
                Runnable runnable = (Runnable) obj2;
                Runnable runnable2 = (Runnable) obj;
                qpVar6.getClass();
                if (tLObject == null) {
                    if (tL_error != null && !"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                        if (runnable2 != null) {
                            runnable2.run();
                            break;
                        }
                    } else if (runnable != null) {
                        runnable.run();
                        break;
                    }
                } else {
                    qpVar6.O3((TLRPC.Updates) tLObject, false);
                    g0.h3(new sn(qpVar6, 3));
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 9:
                g0.h3(new xw((gz) c1Var, (String) obj2, (List) obj, i10));
                break;
            case 10:
                g0.h3(new em((gz) c1Var, tLObject, (sy) obj2, (String) obj, 23));
                break;
            default:
                gz gzVar = (gz) c1Var;
                org.telegram.ui.ActionBar.f2 f2Var3 = (org.telegram.ui.ActionBar.f2) obj2;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                if (tL_error != null) {
                    g0.h3(new tw(gzVar, tL_error, f2Var3, tL_messages_editMessage, 0));
                    break;
                } else {
                    gzVar.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    break;
                }
        }
    }
}
