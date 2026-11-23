package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class qm implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ qm(np npVar, long j3, Object obj, TLObject tLObject, int i7) {
        this.a = i7;
        this.b = npVar;
        this.c = j3;
        this.d = obj;
        this.e = tLObject;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                g0.g3(new im((np) this.b, tLObject, this.c, (TLRPC.messages_SavedReactionTags) this.d, (TLRPC.TL_messages_getSavedReactionTags) this.e, 2));
                break;
            case 1:
                np npVar = (np) this.b;
                int[] iArr = (int[]) this.d;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.e;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i7 = tL_messages_affectedHistory.offset;
                    long j3 = this.c;
                    if (i7 > 0) {
                        npVar.i0(j3, iArr[0], inputPeer);
                    }
                    npVar.T3(tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
                    ur messagesStorage = npVar.getMessagesStorage();
                    messagesStorage.a.c(new qp(messagesStorage, j3, 5));
                    break;
                }
                break;
            default:
                f00 f00Var = (f00) this.b;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                f00Var.getClass();
                if (tL_error != null) {
                    boolean equals = "PINNED_TOO_MUCH".equals(tL_error.text);
                    long j10 = this.c;
                    if (!equals) {
                        if ("PINNED_TOPIC_NOT_MODIFIED".equals(tL_error.text)) {
                            g0.g3(new di.vb((Object) f00Var, j10, false, 4));
                            break;
                        }
                    } else if (g2Var != null) {
                        f00Var.a(j10, arrayList, true);
                        g0.g3(new w3(14, f00Var, g2Var));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ qm(f00 f00Var, org.telegram.ui.ActionBar.g2 g2Var, long j3, ArrayList arrayList) {
        this.a = 2;
        this.b = f00Var;
        this.d = g2Var;
        this.c = j3;
        this.e = arrayList;
    }
}
