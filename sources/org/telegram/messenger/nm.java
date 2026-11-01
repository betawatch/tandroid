package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class nm implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nm(f1 f1Var, long j10, int i10, int i11) {
        this.a = i11;
        this.d = f1Var;
        this.b = j10;
        this.c = i10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                wp wpVar = (wp) this.d;
                wpVar.t8.remove(this.b + "_" + this.c);
                if (tL_error == null && tLObject != null) {
                    wpVar.L3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            case 1:
                y00 y00Var = (y00) this.d;
                a0.h hVar = new a0.h();
                boolean z10 = tLObject instanceof TLRPC.TL_messages_savedDialogs;
                long j10 = this.b;
                int i10 = this.c;
                int i11 = 0;
                if (!z10) {
                    if (!(tLObject instanceof TLRPC.TL_messages_savedDialogsSlice)) {
                        if (!(tLObject instanceof TLRPC.TL_messages_savedDialogsNotModified)) {
                            if (!(tLObject instanceof TLRPC.TL_messages_forumTopics)) {
                                i0.g3(new p00(y00Var, j10, 0));
                                break;
                            } else {
                                TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject;
                                while (i11 < tL_messages_forumTopics.messages.size()) {
                                    hVar.k(tL_messages_forumTopics.messages.get(i11), tL_messages_forumTopics.messages.get(i11).id);
                                    i11++;
                                }
                                i0.g3(new o00(y00Var, tL_messages_forumTopics, j10, tL_messages_forumTopics, hVar, i10));
                                break;
                            }
                        } else {
                            i0.g3(new pr(y00Var, j10, (TLRPC.TL_messages_savedDialogsNotModified) tLObject, 5));
                            break;
                        }
                    } else {
                        TLRPC.TL_messages_savedDialogsSlice tL_messages_savedDialogsSlice = (TLRPC.TL_messages_savedDialogsSlice) tLObject;
                        while (i11 < tL_messages_savedDialogsSlice.messages.size()) {
                            hVar.k(tL_messages_savedDialogsSlice.messages.get(i11), tL_messages_savedDialogsSlice.messages.get(i11).id);
                            i11++;
                        }
                        i0.g3(new d2(y00Var, tL_messages_savedDialogsSlice, j10, hVar, i10, 7));
                        break;
                    }
                } else {
                    TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject;
                    while (i11 < tL_messages_savedDialogs.messages.size()) {
                        hVar.k(tL_messages_savedDialogs.messages.get(i11), tL_messages_savedDialogs.messages.get(i11).id);
                        i11++;
                    }
                    i0.g3(new d2(y00Var, tL_messages_savedDialogs, j10, hVar, i10, 8));
                    break;
                }
            default:
                i0.g3(new org.telegram.ui.z(this.c, 0, this.b, (org.telegram.ui.h4) this.d, tLObject));
                break;
        }
    }

    public /* synthetic */ nm(org.telegram.ui.h4 h4Var, int i10, long j10) {
        this.a = 2;
        this.d = h4Var;
        this.c = i10;
        this.b = j10;
    }
}
