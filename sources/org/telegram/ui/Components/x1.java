package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class x1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x1(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.a;
        int i10 = 10;
        int i11 = 13;
        int i12 = 23;
        int i13 = 0;
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
                org.telegram.messenger.g0.h3(new fq(3, (tq) obj, tLObject));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new fq(4, (ur) obj, tLObject));
                break;
            case 3:
                org.telegram.messenger.g0.h3(new fq(i10, (cw) obj, tLObject));
                break;
            case 4:
                mx mxVar = (mx) obj;
                if (tLObject != null) {
                    org.telegram.messenger.g0.h3(new fq(15, mxVar, tLObject));
                    break;
                }
                break;
            case 5:
                org.telegram.messenger.g0.h3(new fq(i12, (n50) obj, tLObject));
                break;
            case 6:
                org.telegram.messenger.g0.h3(new ng((y50) obj, tL_error, tLObject, i10));
                break;
            case 7:
                org.telegram.messenger.g0.h3(new ng((oa0) obj, tL_error, tLObject, i11));
                break;
            case 8:
                org.telegram.messenger.g0.h3(new w80(2, (af0) obj, tLObject));
                break;
            case 9:
                ih0 ih0Var = (ih0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i14 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    ih0Var.post(new org.telegram.ui.q8(ih0Var, i14, tL_messages_messageReactionsList, i11));
                    break;
                }
                break;
            case 10:
                org.telegram.messenger.g0.h3(new jh0((sh0) obj, tLObject, i13));
                break;
            case 11:
                org.telegram.messenger.g0.h3(new ng((nr0) obj, tL_error, tLObject, 21));
                break;
            case 12:
                org.telegram.messenger.g0.h3(new ng((zv0) obj, tL_error, tLObject, 27));
                break;
            case 13:
                org.telegram.messenger.g0.h3(new bi.j9(tLObject, (org.telegram.messenger.c20) obj, 1));
                break;
            case 14:
                n11 n11Var = (n11) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    org.telegram.messenger.qp.s1(n11Var.e).O3(updates, false);
                    if (!updates.chats.isEmpty()) {
                        org.telegram.messenger.g0.i3(new w80(i12, n11Var, updates), 1000L);
                        break;
                    }
                }
                break;
            case 15:
                org.telegram.messenger.g0.h3(new w80(25, (l21) obj, tLObject));
                break;
            case 16:
                t31 t31Var = (t31) obj;
                t31Var.getClass();
                org.telegram.messenger.g0.h3(new s31(t31Var, tL_error, tLObject, i13));
                break;
            default:
                int i15 = UndoView.i0;
                org.telegram.messenger.g0.h3(new w80(28, (UndoView) obj, tLObject));
                break;
        }
    }
}
