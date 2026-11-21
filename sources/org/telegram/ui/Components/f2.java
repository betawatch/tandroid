package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f2(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.a;
        int i10 = 17;
        int i11 = 0;
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
                org.telegram.messenger.g0.g3(new mf(25, (jr) obj, tLObject));
                break;
            case 2:
                org.telegram.messenger.g0.g3(new mf(26, (js) obj, tLObject));
                break;
            case 3:
                org.telegram.messenger.g0.g3(new ou(2, (pw) obj, tLObject));
                break;
            case 4:
                xx xxVar = (xx) obj;
                if (tLObject != null) {
                    org.telegram.messenger.g0.g3(new ou(7, xxVar, tLObject));
                    break;
                }
                break;
            case 5:
                org.telegram.messenger.g0.g3(new ou(15, (a60) obj, tLObject));
                break;
            case 6:
                org.telegram.messenger.g0.g3(new g((l60) obj, tL_error, tLObject, 16));
                break;
            case 7:
                org.telegram.messenger.g0.g3(new g((za0) obj, tL_error, tLObject, 19));
                break;
            case 8:
                org.telegram.messenger.g0.g3(new ou(24, (of0) obj, tLObject));
                break;
            case 9:
                wh0 wh0Var = (wh0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i12 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    wh0Var.post(new org.telegram.ui.b0(wh0Var, i12, tL_messages_messageReactionsList, i10));
                    break;
                }
                break;
            case 10:
                org.telegram.messenger.g0.g3(new xh0((gi0) obj, tLObject, i11));
                break;
            case 11:
                org.telegram.messenger.g0.g3(new g((wr0) obj, tL_error, tLObject, 27));
                break;
            case 12:
                org.telegram.messenger.g0.g3(new es0((kw0) obj, tL_error, tLObject, 3));
                break;
            case 13:
                org.telegram.messenger.g0.g3(new di.e8(tLObject, (org.telegram.messenger.x10) obj, 1));
                break;
            case 14:
                b21 b21Var = (b21) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    org.telegram.messenger.mp.u1(b21Var.e).V3(updates, false);
                    if (!updates.chats.isEmpty()) {
                        org.telegram.messenger.g0.h3(new fm0(14, b21Var, updates), 1000L);
                        break;
                    }
                }
                break;
            case 15:
                org.telegram.messenger.g0.g3(new fm0(i10, (b31) obj, tLObject));
                break;
            case 16:
                j41 j41Var = (j41) obj;
                j41Var.getClass();
                org.telegram.messenger.g0.g3(new es0(j41Var, tL_error, tLObject, 6));
                break;
            default:
                int i13 = UndoView.j0;
                org.telegram.messenger.g0.g3(new fm0(20, (UndoView) obj, tLObject));
                break;
        }
    }
}
