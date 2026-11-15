package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class tm implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ tm(np npVar, long j3, Object obj, TLObject tLObject, int i7) {
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
                g0.h3(new im((np) this.b, tLObject, this.c, (TLRPC.messages_SavedReactionTags) this.d, (TLRPC.TL_messages_getSavedReactionTags) this.e, 2));
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
                    npVar.M3(tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
                    vr messagesStorage = npVar.getMessagesStorage();
                    messagesStorage.a.c(new rp(messagesStorage, j3, 5));
                    break;
                }
                break;
            default:
                h00 h00Var = (h00) this.b;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                h00Var.getClass();
                if (tL_error != null) {
                    boolean equals = "PINNED_TOO_MUCH".equals(tL_error.text);
                    long j10 = this.c;
                    if (!equals) {
                        if ("PINNED_TOPIC_NOT_MODIFIED".equals(tL_error.text)) {
                            g0.h3(new di.rb((Object) h00Var, j10, false, 4));
                            break;
                        }
                    } else if (e2Var != null) {
                        h00Var.a(j10, arrayList, true);
                        g0.h3(new b4(14, h00Var, e2Var));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ tm(h00 h00Var, org.telegram.ui.ActionBar.e2 e2Var, long j3, ArrayList arrayList) {
        this.a = 2;
        this.b = h00Var;
        this.d = e2Var;
        this.c = j3;
        this.e = arrayList;
    }
}
