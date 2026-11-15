package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class v1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v1(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.a;
        int i10 = 17;
        int i11 = 23;
        int i12 = 0;
        Object obj = this.b;
        switch (i7) {
            case 0:
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    org.telegram.messenger.np.s1(cVar.a).O3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            case 1:
                org.telegram.messenger.g0.h3(new od(27, (ar) obj, tLObject));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new od(28, (as) obj, tLObject));
                break;
            case 3:
                org.telegram.messenger.g0.h3(new vs(4, (hw) obj, tLObject));
                break;
            case 4:
                qx qxVar = (qx) obj;
                if (tLObject != null) {
                    org.telegram.messenger.g0.h3(new vs(9, qxVar, tLObject));
                    break;
                }
                break;
            case 5:
                org.telegram.messenger.g0.h3(new vs(i10, (p50) obj, tLObject));
                break;
            case 6:
                org.telegram.messenger.g0.h3(new yf((a60) obj, tL_error, tLObject, 12));
                break;
            case 7:
                org.telegram.messenger.g0.h3(new yf((oa0) obj, tL_error, tLObject, 15));
                break;
            case 8:
                org.telegram.messenger.g0.h3(new vs(26, (cf0) obj, tLObject));
                break;
            case 9:
                lh0 lh0Var = (lh0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i13 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    lh0Var.post(new org.telegram.ui.f0(lh0Var, i13, tL_messages_messageReactionsList, 16));
                    break;
                }
                break;
            case 10:
                org.telegram.messenger.g0.h3(new mh0((vh0) obj, tLObject, i12));
                break;
            case 11:
                org.telegram.messenger.g0.h3(new yf((mr0) obj, tL_error, tLObject, i11));
                break;
            case 12:
                org.telegram.messenger.g0.h3(new yf((bw0) obj, tL_error, tLObject, 29));
                break;
            case 13:
                org.telegram.messenger.g0.h3(new di.a8(tLObject, (org.telegram.messenger.z10) obj, 1));
                break;
            case 14:
                p11 p11Var = (p11) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    org.telegram.messenger.np.s1(p11Var.e).O3(updates, false);
                    if (!updates.chats.isEmpty()) {
                        org.telegram.messenger.g0.i3(new hh0(i10, p11Var, updates), 1000L);
                        break;
                    }
                }
                break;
            case 15:
                org.telegram.messenger.g0.h3(new hh0(20, (p21) obj, tLObject));
                break;
            case 16:
                w31 w31Var = (w31) obj;
                w31Var.getClass();
                org.telegram.messenger.g0.h3(new lv0(w31Var, tL_error, tLObject, 2));
                break;
            default:
                int i14 = UndoView.j0;
                org.telegram.messenger.g0.h3(new hh0(i11, (UndoView) obj, tLObject));
                break;
        }
    }
}
