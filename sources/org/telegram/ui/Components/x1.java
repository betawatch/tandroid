package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
        int i12 = 17;
        int i13 = 0;
        Object obj = this.b;
        switch (i10) {
            case 0:
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    org.telegram.messenger.wp.r1(cVar.a).L3((TLRPC.Updates) tLObject, false);
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
                org.telegram.messenger.i0.g3(new at(i12, (c60) obj, tLObject));
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
                mi0 mi0Var = (mi0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i14 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    mi0Var.post(new ki0(mi0Var, i14, tL_messages_messageReactionsList, i13));
                    break;
                }
                break;
            case 10:
                org.telegram.messenger.i0.g3(new ni0((wi0) obj, tLObject, i13));
                break;
            case 11:
                ms0 ms0Var = (ms0) obj;
                ms0Var.getClass();
                org.telegram.messenger.i0.g3(new jg(ms0Var, tL_error, tLObject, 21));
                break;
            case 12:
                org.telegram.messenger.i0.g3(new jg((dx0) obj, tL_error, tLObject, i11));
                break;
            case 13:
                org.telegram.messenger.i0.g3(new ow0(tLObject, (org.telegram.messenger.r20) obj, i13));
                break;
            case 14:
                p21 p21Var = (p21) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    org.telegram.messenger.wp.r1(p21Var.e).L3(updates, false);
                    if (!updates.chats.isEmpty()) {
                        org.telegram.messenger.i0.h3(new hi0(i12, p21Var, updates), 1000L);
                        break;
                    }
                }
                break;
            case 15:
                org.telegram.messenger.i0.g3(new hi0(19, (n31) obj, tLObject));
                break;
            case 16:
                w41 w41Var = (w41) obj;
                w41Var.getClass();
                org.telegram.messenger.i0.g3(new v41(w41Var, tL_error, tLObject, i13));
                break;
            default:
                int i15 = UndoView.i0;
                org.telegram.messenger.i0.g3(new hi0(22, (UndoView) obj, tLObject));
                break;
        }
    }
}
