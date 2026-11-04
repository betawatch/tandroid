package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class yl implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yl(c1 c1Var, long j10, int i3, int i10) {
        this.a = i10;
        this.d = c1Var;
        this.b = j10;
        this.c = i3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                hp hpVar = (hp) this.d;
                hpVar.s8.remove(this.b + "_" + this.c);
                if (tL_error == null && tLObject != null) {
                    hpVar.O3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            case 1:
                c00 c00Var = (c00) this.d;
                a0.h hVar = new a0.h();
                boolean z10 = tLObject instanceof TLRPC.TL_messages_savedDialogs;
                long j10 = this.b;
                int i3 = this.c;
                int i10 = 0;
                if (!z10) {
                    if (!(tLObject instanceof TLRPC.TL_messages_savedDialogsSlice)) {
                        if (!(tLObject instanceof TLRPC.TL_messages_savedDialogsNotModified)) {
                            if (!(tLObject instanceof TLRPC.TL_messages_forumTopics)) {
                                g0.h3(new uz(c00Var, j10, 0));
                                break;
                            } else {
                                TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject;
                                while (i10 < tL_messages_forumTopics.messages.size()) {
                                    hVar.k(tL_messages_forumTopics.messages.get(i10), tL_messages_forumTopics.messages.get(i10).id);
                                    i10++;
                                }
                                g0.h3(new ci.d8(c00Var, tL_messages_forumTopics, j10, tL_messages_forumTopics, hVar, i3));
                                break;
                            }
                        } else {
                            g0.h3(new zq(c00Var, j10, (TLRPC.TL_messages_savedDialogsNotModified) tLObject, 5));
                            break;
                        }
                    } else {
                        TLRPC.TL_messages_savedDialogsSlice tL_messages_savedDialogsSlice = (TLRPC.TL_messages_savedDialogsSlice) tLObject;
                        while (i10 < tL_messages_savedDialogsSlice.messages.size()) {
                            hVar.k(tL_messages_savedDialogsSlice.messages.get(i10), tL_messages_savedDialogsSlice.messages.get(i10).id);
                            i10++;
                        }
                        g0.h3(new z1(c00Var, tL_messages_savedDialogsSlice, j10, hVar, i3, 7));
                        break;
                    }
                } else {
                    TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject;
                    while (i10 < tL_messages_savedDialogs.messages.size()) {
                        hVar.k(tL_messages_savedDialogs.messages.get(i10), tL_messages_savedDialogs.messages.get(i10).id);
                        i10++;
                    }
                    g0.h3(new z1(c00Var, tL_messages_savedDialogs, j10, hVar, i3, 8));
                    break;
                }
            default:
                g0.h3(new ci.f8(this.c, 2, this.b, (org.telegram.ui.i4) this.d, tLObject));
                break;
        }
    }

    public /* synthetic */ yl(org.telegram.ui.i4 i4Var, int i3, long j10) {
        this.a = 2;
        this.d = i4Var;
        this.c = i3;
        this.b = j10;
    }
}
