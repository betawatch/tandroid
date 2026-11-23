package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        int i10 = 17;
        int i11 = 28;
        int i12 = 4;
        int i13 = 16;
        int i14 = 0;
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
                org.telegram.messenger.g0.g3(new xd(27, (gr) obj, tLObject));
                break;
            case 2:
                org.telegram.messenger.g0.g3(new xd(i11, (gs) obj, tLObject));
                break;
            case 3:
                org.telegram.messenger.g0.g3(new bt(i12, (mw) obj, tLObject));
                break;
            case 4:
                ux uxVar = (ux) obj;
                if (tLObject != null) {
                    org.telegram.messenger.g0.g3(new bt(9, uxVar, tLObject));
                    break;
                }
                break;
            case 5:
                org.telegram.messenger.g0.g3(new bt(i10, (x50) obj, tLObject));
                break;
            case 6:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Cells.fa((i60) obj, tL_error, tLObject, i10));
                break;
            case 7:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Cells.fa((wa0) obj, tL_error, tLObject, 20));
                break;
            case 8:
                org.telegram.messenger.g0.g3(new bt(26, (nf0) obj, tLObject));
                break;
            case 9:
                wh0 wh0Var = (wh0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i15 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    wh0Var.post(new org.telegram.ui.f0(wh0Var, i15, tL_messages_messageReactionsList, i13));
                    break;
                }
                break;
            case 10:
                org.telegram.messenger.g0.g3(new xh0((gi0) obj, tLObject, i14));
                break;
            case 11:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Cells.fa((vr0) obj, tL_error, tLObject, i11));
                break;
            case 12:
                org.telegram.messenger.g0.g3(new as0((jw0) obj, tL_error, tLObject, i12));
                break;
            case 13:
                org.telegram.messenger.g0.g3(new di.e8(tLObject, (org.telegram.messenger.w10) obj, 1));
                break;
            case 14:
                z11 z11Var = (z11) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    org.telegram.messenger.mp.u1(z11Var.e).V3(updates, false);
                    if (!updates.chats.isEmpty()) {
                        org.telegram.messenger.g0.h3(new sh0(i13, z11Var, updates), 1000L);
                        break;
                    }
                }
                break;
            case 15:
                org.telegram.messenger.g0.g3(new sh0(19, (a31) obj, tLObject));
                break;
            case 16:
                i41 i41Var = (i41) obj;
                i41Var.getClass();
                org.telegram.messenger.g0.g3(new as0(i41Var, tL_error, tLObject, 7));
                break;
            default:
                int i16 = UndoView.j0;
                org.telegram.messenger.g0.g3(new sh0(22, (UndoView) obj, tLObject));
                break;
        }
    }
}
