package org.telegram.messenger;

import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class ci implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ f1 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ci(f1 f1Var, Object obj, Object obj2, int i10) {
        this.a = i10;
        this.b = f1Var;
        this.c = obj;
        this.d = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        int i11 = 1;
        Object obj = this.d;
        Object obj2 = this.c;
        f1 f1Var = this.b;
        switch (i10) {
            case 0:
                ui uiVar = (ui) f1Var;
                TLRPC.TL_messages_faveSticker tL_messages_faveSticker = (TLRPC.TL_messages_faveSticker) obj;
                if (tL_error != null && w8.r(tL_error.text) && obj2 != null) {
                    uiVar.getFileRefController().u(new Object[]{tL_messages_faveSticker}, obj2);
                    break;
                } else {
                    i0.g3(new eg(uiVar, 2));
                    break;
                }
                break;
            case 1:
                ui uiVar2 = (ui) f1Var;
                TLRPC.TL_messages_saveRecentSticker tL_messages_saveRecentSticker = (TLRPC.TL_messages_saveRecentSticker) obj;
                uiVar2.getClass();
                if (tL_error != null && w8.r(tL_error.text) && obj2 != null) {
                    uiVar2.getFileRefController().u(new Object[]{tL_messages_saveRecentSticker}, obj2);
                    break;
                }
                break;
            case 2:
                i0.g3(new cn((vp) f1Var, tL_error, tLObject, (Long) obj2, (q20) obj));
                break;
            case 3:
                vp vpVar = (vp) f1Var;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) obj2;
                TLRPC.TL_messages_createChat tL_messages_createChat = (TLRPC.TL_messages_createChat) obj;
                if (tL_error == null) {
                    if (tLObject instanceof TLRPC.TL_messages_invitedUsers) {
                        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) tLObject;
                        vpVar.L3(tL_messages_invitedUsers.updates, false);
                        i0.g3(new e4(7, vpVar, tL_messages_invitedUsers));
                        break;
                    }
                } else {
                    i0.g3(new ul(vpVar, tL_error, k2Var, tL_messages_createChat, 1));
                    break;
                }
                break;
            case 4:
                vp vpVar2 = (vp) f1Var;
                org.telegram.ui.ActionBar.k2 k2Var2 = (org.telegram.ui.ActionBar.k2) obj2;
                TLRPC.TL_channels_createChannel tL_channels_createChannel = (TLRPC.TL_channels_createChannel) obj;
                if (tL_error == null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    vpVar2.L3(updates, false);
                    i0.g3(new oi(18, vpVar2, updates));
                    break;
                } else {
                    i0.g3(new ul(vpVar2, tL_error, k2Var2, tL_channels_createChannel, 2));
                    break;
                }
            case 5:
                vp vpVar3 = (vp) f1Var;
                TLRPC.TL_messages_saveGif tL_messages_saveGif = (TLRPC.TL_messages_saveGif) obj;
                vpVar3.getClass();
                if (tL_error != null && w8.r(tL_error.text)) {
                    vpVar3.getFileRefController().u(new Object[]{tL_messages_saveGif}, obj2);
                    break;
                }
                break;
            case 6:
                vp vpVar4 = (vp) f1Var;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (tLObject != null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    if (w3.T(chat)) {
                        vpVar4.I3(tL_messages_affectedHistory.pts, tL_messages_affectedHistory.pts_count, chat.id);
                    } else {
                        vpVar4.J3(tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
                    }
                    new ArrayList();
                    vpVar4.getMessagesStorage().c2(chat != null ? -chat.id : user.id, null, false, 0, 0, false, null);
                    break;
                }
                break;
            case 7:
                vp vpVar5 = (vp) f1Var;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) obj2;
                String str = (String) obj;
                if ((tLObject instanceof TLRPC.TL_boolTrue) && chatFull != null) {
                    i0.g3(new kg((f1) vpVar5, (TLObject) chatFull, str, 14));
                    break;
                }
                break;
            case 8:
                vp vpVar6 = (vp) f1Var;
                Runnable runnable = (Runnable) obj2;
                Runnable runnable2 = (Runnable) obj;
                vpVar6.getClass();
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
                    vpVar6.L3((TLRPC.Updates) tLObject, false);
                    i0.g3(new eo(vpVar6, i11));
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 9:
                i0.g3(new kx((qz) f1Var, (String) obj2, (List) obj, i11));
                break;
            case 10:
                i0.g3(new ul((qz) f1Var, tLObject, (cz) obj2, (String) obj, 24));
                break;
            default:
                qz qzVar = (qz) f1Var;
                org.telegram.ui.ActionBar.k2 k2Var3 = (org.telegram.ui.ActionBar.k2) obj2;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                if (tL_error != null) {
                    i0.g3(new fx(qzVar, tL_error, k2Var3, tL_messages_editMessage, 0));
                    break;
                } else {
                    qzVar.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                    break;
                }
        }
    }
}
