package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w1(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.a;
        int i10 = 13;
        int i11 = 24;
        int i12 = 0;
        Object obj = this.b;
        switch (i7) {
            case 0:
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    org.telegram.messenger.qp.s1(cVar.a).O3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            case 1:
                org.telegram.messenger.g0.h3(new ro(4, (sq) obj, tLObject));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new ro(5, (tr) obj, tLObject));
                break;
            case 3:
                org.telegram.messenger.g0.h3(new ro(11, (bw) obj, tLObject));
                break;
            case 4:
                lx lxVar = (lx) obj;
                if (tLObject != null) {
                    org.telegram.messenger.g0.h3(new ro(16, lxVar, tLObject));
                    break;
                }
                break;
            case 5:
                org.telegram.messenger.g0.h3(new ro(i11, (m50) obj, tLObject));
                break;
            case 6:
                org.telegram.messenger.g0.h3(new mg((x50) obj, tL_error, tLObject, 10));
                break;
            case 7:
                org.telegram.messenger.g0.h3(new mg((na0) obj, tL_error, tLObject, i10));
                break;
            case 8:
                org.telegram.messenger.g0.h3(new r80(3, (ze0) obj, tLObject));
                break;
            case 9:
                hh0 hh0Var = (hh0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i13 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    hh0Var.post(new org.telegram.ui.q8(hh0Var, i13, tL_messages_messageReactionsList, i10));
                    break;
                }
                break;
            case 10:
                org.telegram.messenger.g0.h3(new ih0((rh0) obj, tLObject, i12));
                break;
            case 11:
                org.telegram.messenger.g0.h3(new mg((mr0) obj, tL_error, tLObject, 21));
                break;
            case 12:
                org.telegram.messenger.g0.h3(new mg((yv0) obj, tL_error, tLObject, 27));
                break;
            case 13:
                org.telegram.messenger.g0.h3(new bi.j9(tLObject, (org.telegram.messenger.c20) obj, 1));
                break;
            case 14:
                m11 m11Var = (m11) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    org.telegram.messenger.qp.s1(m11Var.e).O3(updates, false);
                    if (!updates.chats.isEmpty()) {
                        org.telegram.messenger.g0.i3(new r80(i11, m11Var, updates), 1000L);
                        break;
                    }
                }
                break;
            case 15:
                org.telegram.messenger.g0.h3(new r80(26, (k21) obj, tLObject));
                break;
            case 16:
                s31 s31Var = (s31) obj;
                s31Var.getClass();
                org.telegram.messenger.g0.h3(new r31(s31Var, tL_error, tLObject, i12));
                break;
            default:
                int i14 = UndoView.i0;
                org.telegram.messenger.g0.h3(new r80(29, (UndoView) obj, tLObject));
                break;
        }
    }
}
