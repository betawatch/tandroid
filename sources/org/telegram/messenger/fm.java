package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class fm implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fm(c1 c1Var, long j3, int i7, int i10) {
        this.a = i10;
        this.d = c1Var;
        this.b = j3;
        this.c = i7;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                np npVar = (np) this.d;
                npVar.t8.remove(this.b + "_" + this.c);
                if (tL_error == null && tLObject != null) {
                    npVar.O3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            case 1:
                h00 h00Var = (h00) this.d;
                a0.h hVar = new a0.h();
                boolean z10 = tLObject instanceof TLRPC.TL_messages_savedDialogs;
                long j3 = this.b;
                int i7 = this.c;
                int i10 = 0;
                if (!z10) {
                    if (!(tLObject instanceof TLRPC.TL_messages_savedDialogsSlice)) {
                        if (!(tLObject instanceof TLRPC.TL_messages_savedDialogsNotModified)) {
                            if (!(tLObject instanceof TLRPC.TL_messages_forumTopics)) {
                                g0.h3(new zz(h00Var, j3, 0));
                                break;
                            } else {
                                TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject;
                                while (i10 < tL_messages_forumTopics.messages.size()) {
                                    hVar.k(tL_messages_forumTopics.messages.get(i10), tL_messages_forumTopics.messages.get(i10).id);
                                    i10++;
                                }
                                g0.h3(new di.v7(h00Var, tL_messages_forumTopics, j3, tL_messages_forumTopics, hVar, i7));
                                break;
                            }
                        } else {
                            g0.h3(new fr(h00Var, j3, (TLRPC.TL_messages_savedDialogsNotModified) tLObject, 5));
                            break;
                        }
                    } else {
                        TLRPC.TL_messages_savedDialogsSlice tL_messages_savedDialogsSlice = (TLRPC.TL_messages_savedDialogsSlice) tLObject;
                        while (i10 < tL_messages_savedDialogsSlice.messages.size()) {
                            hVar.k(tL_messages_savedDialogsSlice.messages.get(i10), tL_messages_savedDialogsSlice.messages.get(i10).id);
                            i10++;
                        }
                        g0.h3(new z1(h00Var, tL_messages_savedDialogsSlice, j3, hVar, i7, 7));
                        break;
                    }
                } else {
                    TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject;
                    while (i10 < tL_messages_savedDialogs.messages.size()) {
                        hVar.k(tL_messages_savedDialogs.messages.get(i10), tL_messages_savedDialogs.messages.get(i10).id);
                        i10++;
                    }
                    g0.h3(new z1(h00Var, tL_messages_savedDialogs, j3, hVar, i7, 8));
                    break;
                }
            default:
                g0.h3(new di.x7(this.c, 2, this.b, (org.telegram.ui.g4) this.d, tLObject));
                break;
        }
    }

    public /* synthetic */ fm(org.telegram.ui.g4 g4Var, int i7, long j3) {
        this.a = 2;
        this.d = g4Var;
        this.c = i7;
        this.b = j3;
    }
}
