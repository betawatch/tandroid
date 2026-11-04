package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w1(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i3 = this.a;
        int i10 = 14;
        int i11 = 1;
        int i12 = 28;
        int i13 = 0;
        Object obj = this.b;
        switch (i3) {
            case 0:
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    org.telegram.messenger.hp.s1(cVar.a).O3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            case 1:
                org.telegram.messenger.g0.h3(new cl(8, (tq) obj, tLObject));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new cl(9, (ur) obj, tLObject));
                break;
            case 3:
                org.telegram.messenger.g0.h3(new cl(15, (aw) obj, tLObject));
                break;
            case 4:
                jx jxVar = (jx) obj;
                if (tLObject != null) {
                    org.telegram.messenger.g0.h3(new cl(20, jxVar, tLObject));
                    break;
                }
                break;
            case 5:
                org.telegram.messenger.g0.h3(new cl(i12, (i50) obj, tLObject));
                break;
            case 6:
                org.telegram.messenger.g0.h3(new e7(obj, (Object) tL_error, (Object) tLObject, i10));
                break;
            case 7:
                org.telegram.messenger.g0.h3(new e7(obj, (Object) tL_error, (Object) tLObject, 17));
                break;
            case 8:
                org.telegram.messenger.g0.h3(new j50(7, (bf0) obj, tLObject));
                break;
            case 9:
                kh0 kh0Var = (kh0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i14 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    kh0Var.post(new org.telegram.ui.f4(kh0Var, i14, tL_messages_messageReactionsList, i10));
                    break;
                }
                break;
            case 10:
                org.telegram.messenger.g0.h3(new lh0((uh0) obj, tLObject, i13));
                break;
            case 11:
                kr0 kr0Var = (kr0) obj;
                kr0Var.getClass();
                org.telegram.messenger.g0.h3(new e7((Object) kr0Var, (Object) tL_error, (Object) tLObject, 25));
                break;
            case 12:
                org.telegram.messenger.g0.h3(new iv0((xv0) obj, tL_error, tLObject, i11));
                break;
            case 13:
                org.telegram.messenger.g0.h3(new ci.j8(tLObject, (org.telegram.messenger.u10) obj, i11));
                break;
            case 14:
                g11 g11Var = (g11) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    org.telegram.messenger.hp.s1(g11Var.e).O3(updates, false);
                    if (!updates.chats.isEmpty()) {
                        org.telegram.messenger.g0.i3(new j50(i12, g11Var, updates), 1000L);
                        break;
                    }
                }
                break;
            case 15:
                org.telegram.messenger.g0.h3(new p11(i13, (f21) obj, tLObject));
                break;
            case 16:
                m31 m31Var = (m31) obj;
                m31Var.getClass();
                org.telegram.messenger.g0.h3(new iv0(m31Var, tL_error, tLObject, 4));
                break;
            default:
                int i15 = UndoView.j0;
                org.telegram.messenger.g0.h3(new p11(3, (UndoView) obj, tLObject));
                break;
        }
    }
}
