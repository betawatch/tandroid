package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class wm implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ wm(qp qpVar, long j3, Object obj, TLObject tLObject, int i7) {
        this.a = i7;
        this.b = qpVar;
        this.c = j3;
        this.d = obj;
        this.e = tLObject;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                g0.h3(new lm((qp) this.b, tLObject, this.c, (TLRPC.messages_SavedReactionTags) this.d, (TLRPC.TL_messages_getSavedReactionTags) this.e, 2));
                break;
            case 1:
                qp qpVar = (qp) this.b;
                int[] iArr = (int[]) this.d;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.e;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i7 = tL_messages_affectedHistory.offset;
                    long j3 = this.c;
                    if (i7 > 0) {
                        qpVar.i0(j3, iArr[0], inputPeer);
                    }
                    qpVar.M3(tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
                    yr messagesStorage = qpVar.getMessagesStorage();
                    messagesStorage.a.c(new xp(messagesStorage, j3, 5));
                    break;
                }
                break;
            default:
                k00 k00Var = (k00) this.b;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                k00Var.getClass();
                if (tL_error != null) {
                    boolean equals = "PINNED_TOO_MUCH".equals(tL_error.text);
                    long j10 = this.c;
                    if (!equals) {
                        if ("PINNED_TOPIC_NOT_MODIFIED".equals(tL_error.text)) {
                            g0.h3(new bi.kd((Object) k00Var, j10, false, 4));
                            break;
                        }
                    } else if (f2Var != null) {
                        k00Var.a(j10, arrayList, true);
                        g0.h3(new b4(14, k00Var, f2Var));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ wm(k00 k00Var, org.telegram.ui.ActionBar.f2 f2Var, long j3, ArrayList arrayList) {
        this.a = 2;
        this.b = k00Var;
        this.d = f2Var;
        this.c = j3;
        this.e = arrayList;
    }
}
