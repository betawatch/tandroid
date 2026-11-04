package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class mm implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ mm(hp hpVar, long j10, Object obj, TLObject tLObject, int i3) {
        this.a = i3;
        this.b = hpVar;
        this.c = j10;
        this.d = obj;
        this.e = tLObject;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                g0.h3(new bm((hp) this.b, tLObject, this.c, (TLRPC.messages_SavedReactionTags) this.d, (TLRPC.TL_messages_getSavedReactionTags) this.e, 2));
                break;
            case 1:
                hp hpVar = (hp) this.b;
                int[] iArr = (int[]) this.d;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.e;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i3 = tL_messages_affectedHistory.offset;
                    long j10 = this.c;
                    if (i3 > 0) {
                        hpVar.i0(j10, iArr[0], inputPeer);
                    }
                    hpVar.M3(tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
                    qr messagesStorage = hpVar.getMessagesStorage();
                    messagesStorage.a.c(new op(messagesStorage, j10, 5));
                    break;
                }
                break;
            default:
                c00 c00Var = (c00) this.b;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                c00Var.getClass();
                if (tL_error != null) {
                    boolean equals = "PINNED_TOO_MUCH".equals(tL_error.text);
                    long j11 = this.c;
                    if (!equals) {
                        if ("PINNED_TOPIC_NOT_MODIFIED".equals(tL_error.text)) {
                            g0.h3(new ci.cc((Object) c00Var, j11, false, 4));
                            break;
                        }
                    } else if (d2Var != null) {
                        c00Var.a(j11, arrayList, true);
                        g0.h3(new b4(14, c00Var, d2Var));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ mm(c00 c00Var, org.telegram.ui.ActionBar.d2 d2Var, long j10, ArrayList arrayList) {
        this.a = 2;
        this.b = c00Var;
        this.d = d2Var;
        this.c = j10;
        this.e = arrayList;
    }
}
