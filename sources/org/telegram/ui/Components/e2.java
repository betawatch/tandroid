package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class e2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e2(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.a;
        int i10 = 15;
        int i11 = 5;
        int i12 = 18;
        int i13 = 0;
        Object obj = this.b;
        switch (i7) {
            case 0:
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    org.telegram.messenger.mp.u1(cVar.a).V3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            case 1:
                org.telegram.messenger.g0.g3(new mg(23, (hr) obj, tLObject));
                break;
            case 2:
                org.telegram.messenger.g0.g3(new mg(24, (hs) obj, tLObject));
                break;
            case 3:
                org.telegram.messenger.g0.g3(new dw(i13, (nw) obj, tLObject));
                break;
            case 4:
                vx vxVar = (vx) obj;
                if (tLObject != null) {
                    org.telegram.messenger.g0.g3(new dw(i11, vxVar, tLObject));
                    break;
                }
                break;
            case 5:
                org.telegram.messenger.g0.g3(new dw(13, (x50) obj, tLObject));
                break;
            case 6:
                org.telegram.messenger.g0.g3(new k7(obj, (Object) tL_error, (Object) tLObject, i10));
                break;
            case 7:
                org.telegram.messenger.g0.g3(new k7(obj, (Object) tL_error, (Object) tLObject, i12));
                break;
            case 8:
                org.telegram.messenger.g0.g3(new dw(22, (mf0) obj, tLObject));
                break;
            case 9:
                uh0 uh0Var = (uh0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i14 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    uh0Var.post(new org.telegram.ui.b0(uh0Var, i14, tL_messages_messageReactionsList, 17));
                    break;
                }
                break;
            case 10:
                org.telegram.messenger.g0.g3(new vh0((ei0) obj, tLObject, i13));
                break;
            case 11:
                org.telegram.messenger.g0.g3(new k7(obj, (Object) tL_error, (Object) tLObject, 26));
                break;
            case 12:
                org.telegram.messenger.g0.g3(new sv0((iw0) obj, tL_error, tLObject, 2));
                break;
            case 13:
                org.telegram.messenger.g0.g3(new di.d8(tLObject, (org.telegram.messenger.x10) obj, 1));
                break;
            case 14:
                z11 z11Var = (z11) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    org.telegram.messenger.mp.u1(z11Var.e).V3(updates, false);
                    if (!updates.chats.isEmpty()) {
                        org.telegram.messenger.g0.h3(new hn0(12, z11Var, updates), 1000L);
                        break;
                    }
                }
                break;
            case 15:
                org.telegram.messenger.g0.g3(new hn0(i10, (y21) obj, tLObject));
                break;
            case 16:
                g41 g41Var = (g41) obj;
                g41Var.getClass();
                org.telegram.messenger.g0.g3(new sv0(g41Var, tL_error, tLObject, i11));
                break;
            default:
                int i15 = UndoView.j0;
                org.telegram.messenger.g0.g3(new hn0(i12, (UndoView) obj, tLObject));
                break;
        }
    }
}
