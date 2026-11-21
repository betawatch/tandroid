package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class pm implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ pm(mp mpVar, long j3, Object obj, TLObject tLObject, int i7) {
        this.a = i7;
        this.b = mpVar;
        this.c = j3;
        this.d = obj;
        this.e = tLObject;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                g0.g3(new hm((mp) this.b, tLObject, this.c, (TLRPC.messages_SavedReactionTags) this.d, (TLRPC.TL_messages_getSavedReactionTags) this.e, 2));
                break;
            case 1:
                mp mpVar = (mp) this.b;
                int[] iArr = (int[]) this.d;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.e;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i7 = tL_messages_affectedHistory.offset;
                    long j3 = this.c;
                    if (i7 > 0) {
                        mpVar.i0(j3, iArr[0], inputPeer);
                    }
                    mpVar.T3(tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
                    tr messagesStorage = mpVar.getMessagesStorage();
                    messagesStorage.a.c(new pp(messagesStorage, j3, 5));
                    break;
                }
                break;
            default:
                e00 e00Var = (e00) this.b;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                e00Var.getClass();
                if (tL_error != null) {
                    boolean equals = "PINNED_TOO_MUCH".equals(tL_error.text);
                    long j10 = this.c;
                    if (!equals) {
                        if ("PINNED_TOPIC_NOT_MODIFIED".equals(tL_error.text)) {
                            g0.g3(new di.vb((Object) e00Var, j10, false, 4));
                            break;
                        }
                    } else if (g2Var != null) {
                        e00Var.a(j10, arrayList, true);
                        g0.g3(new w3(14, e00Var, g2Var));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ pm(e00 e00Var, org.telegram.ui.ActionBar.g2 g2Var, long j3, ArrayList arrayList) {
        this.a = 2;
        this.b = e00Var;
        this.d = g2Var;
        this.c = j3;
        this.e = arrayList;
    }
}
