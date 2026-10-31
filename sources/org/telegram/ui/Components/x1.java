package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class x1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        int i11 = 27;
        int i12 = 21;
        int i13 = 0;
        Object obj = this.b;
        switch (i10) {
            case 0:
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    org.telegram.messenger.vp.r1(cVar.a).L3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            case 1:
                org.telegram.messenger.i0.g3(new cd(i11, (cr) obj, tLObject));
                break;
            case 2:
                org.telegram.messenger.i0.g3(new cd(28, (fs) obj, tLObject));
                break;
            case 3:
                org.telegram.messenger.i0.g3(new at(4, (pw) obj, tLObject));
                break;
            case 4:
                zx zxVar = (zx) obj;
                if (tLObject != null) {
                    org.telegram.messenger.i0.g3(new at(9, zxVar, tLObject));
                    break;
                }
                break;
            case 5:
                org.telegram.messenger.i0.g3(new at(17, (c60) obj, tLObject));
                break;
            case 6:
                org.telegram.messenger.i0.g3(new jg((m60) obj, tL_error, tLObject, 10));
                break;
            case 7:
                org.telegram.messenger.i0.g3(new jg((gb0) obj, tL_error, tLObject, 13));
                break;
            case 8:
                org.telegram.messenger.i0.g3(new at(26, (cg0) obj, tLObject));
                break;
            case 9:
                li0 li0Var = (li0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i14 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    li0Var.post(new ji0(li0Var, i14, tL_messages_messageReactionsList, i13));
                    break;
                }
                break;
            case 10:
                org.telegram.messenger.i0.g3(new mi0((vi0) obj, tLObject, i13));
                break;
            case 11:
                ls0 ls0Var = (ls0) obj;
                ls0Var.getClass();
                org.telegram.messenger.i0.g3(new jg(ls0Var, tL_error, tLObject, i12));
                break;
            case 12:
                org.telegram.messenger.i0.g3(new jg((cx0) obj, tL_error, tLObject, i11));
                break;
            case 13:
                org.telegram.messenger.i0.g3(new nw0(tLObject, (org.telegram.messenger.q20) obj, i13));
                break;
            case 14:
                o21 o21Var = (o21) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    org.telegram.messenger.vp.r1(o21Var.n).L3(updates, false);
                    if (!updates.chats.isEmpty()) {
                        org.telegram.messenger.i0.h3(new gi0(16, o21Var, updates), 1000L);
                        break;
                    }
                }
                break;
            case 15:
                org.telegram.messenger.i0.g3(new gi0(18, (m31) obj, tLObject));
                break;
            case 16:
                v41 v41Var = (v41) obj;
                v41Var.getClass();
                org.telegram.messenger.i0.g3(new u41(v41Var, tL_error, tLObject, i13));
                break;
            default:
                int i15 = UndoView.i0;
                org.telegram.messenger.i0.g3(new gi0(i12, (UndoView) obj, tLObject));
                break;
        }
    }
}
