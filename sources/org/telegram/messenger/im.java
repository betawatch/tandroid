package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class im implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ f1 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ im(wp wpVar, long j10, Object obj, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = wpVar;
        this.c = j10;
        this.d = obj;
        this.e = tLObject;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                i0.g3(new zm((wp) this.b, tLObject, this.c, (TLRPC.messages_SavedReactionTags) this.d, (TLRPC.TL_messages_getSavedReactionTags) this.e, 2));
                break;
            case 1:
                wp wpVar = (wp) this.b;
                int[] iArr = (int[]) this.d;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.e;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i10 = tL_messages_affectedHistory.offset;
                    long j10 = this.c;
                    if (i10 > 0) {
                        wpVar.i0(j10, iArr[0], inputPeer);
                    }
                    wpVar.J3(tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
                    is messagesStorage = wpVar.getMessagesStorage();
                    messagesStorage.a.c(new dq(messagesStorage, j10, 5));
                    break;
                }
                break;
            default:
                y00 y00Var = (y00) this.b;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                y00Var.getClass();
                if (tL_error != null) {
                    boolean equals = "PINNED_TOO_MUCH".equals(tL_error.text);
                    long j11 = this.c;
                    if (!equals) {
                        if ("PINNED_TOPIC_NOT_MODIFIED".equals(tL_error.text)) {
                            i0.g3(new lt((Object) y00Var, j11, false, 1));
                            break;
                        }
                    } else if (k2Var != null) {
                        y00Var.a(j11, arrayList, true);
                        i0.g3(new e4(12, y00Var, k2Var));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ im(y00 y00Var, org.telegram.ui.ActionBar.k2 k2Var, long j10, ArrayList arrayList) {
        this.a = 2;
        this.b = y00Var;
        this.d = k2Var;
        this.c = j10;
        this.e = arrayList;
    }
}
