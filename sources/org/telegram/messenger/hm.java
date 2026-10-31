package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class hm implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ f1 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ hm(vp vpVar, long j10, Object obj, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = vpVar;
        this.c = j10;
        this.d = obj;
        this.e = tLObject;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                i0.g3(new ym((vp) this.b, tLObject, this.c, (TLRPC.messages_SavedReactionTags) this.d, (TLRPC.TL_messages_getSavedReactionTags) this.e, 2));
                break;
            case 1:
                vp vpVar = (vp) this.b;
                int[] iArr = (int[]) this.d;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.e;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i10 = tL_messages_affectedHistory.offset;
                    long j10 = this.c;
                    if (i10 > 0) {
                        vpVar.i0(j10, iArr[0], inputPeer);
                    }
                    vpVar.J3(tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
                    hs messagesStorage = vpVar.getMessagesStorage();
                    messagesStorage.a.c(new cq(messagesStorage, j10, 5));
                    break;
                }
                break;
            default:
                x00 x00Var = (x00) this.b;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                x00Var.getClass();
                if (tL_error != null) {
                    boolean equals = "PINNED_TOO_MUCH".equals(tL_error.text);
                    long j11 = this.c;
                    if (!equals) {
                        if ("PINNED_TOPIC_NOT_MODIFIED".equals(tL_error.text)) {
                            i0.g3(new kt((Object) x00Var, j11, false, 1));
                            break;
                        }
                    } else if (k2Var != null) {
                        x00Var.a(j11, arrayList, true);
                        i0.g3(new e4(12, x00Var, k2Var));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ hm(x00 x00Var, org.telegram.ui.ActionBar.k2 k2Var, long j10, ArrayList arrayList) {
        this.a = 2;
        this.b = x00Var;
        this.d = k2Var;
        this.c = j10;
        this.e = arrayList;
    }
}
