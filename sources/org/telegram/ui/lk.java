package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class lk extends org.telegram.ui.Components.ia0 {
    public final /* synthetic */ an H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk(an anVar, Context context, an anVar2, dh.c cVar, org.telegram.messenger.mj mjVar, TLRPC.User user, TLRPC.Chat chat, int i7, org.telegram.ui.Components.ea0 ea0Var, int i10, boolean z9) {
        super(context, anVar2, cVar, mjVar, user, chat, i7, ea0Var, i10, z9);
        this.H = anVar;
    }

    @Override // org.telegram.ui.Components.ia0
    public final void b() {
        org.telegram.messenger.ij ijVar;
        qm qmVar;
        an anVar = this.H;
        qm qmVar2 = anVar.B5;
        if (qmVar2 == null || (ijVar = qmVar2.a) == null || !((qmVar = anVar.v5.d) == null || qmVar.a == null || ijVar.f1() == anVar.v5.d.a.f1())) {
            anVar.B5 = anVar.v5.d;
        }
    }

    @Override // org.telegram.ui.Components.ia0
    public final void c(boolean z9) {
        int i7;
        boolean z10;
        org.telegram.messenger.kj kjVar;
        a(false);
        an anVar = this.H;
        org.telegram.messenger.mj mjVar = anVar.v5;
        if (mjVar != null) {
            if (!z9) {
                anVar.C5 = true;
            }
            org.telegram.messenger.kj kjVar2 = mjVar.b;
            if (kjVar2 != null) {
                int size = kjVar2.e.size();
                i7 = 0;
                z10 = false;
                for (int i10 = 0; i10 < size; i10++) {
                    org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) anVar.v5.b.e.get(i10);
                    if (ijVar.E4()) {
                        i7 = 3;
                    } else if (ijVar.U3()) {
                        if (i7 != 2) {
                            i7 = ijVar.a4() ? 2 : 1;
                        }
                    } else if (ijVar.A3()) {
                        z10 = true;
                    }
                    anVar.m6[0].put(ijVar.f1(), ijVar);
                }
            } else {
                i7 = 0;
                z10 = false;
            }
            Bundle h = org.telegram.ui.Cells.f1.h(3, "onlySelect", "dialogsType", true);
            h.putBoolean("quote", !z9);
            boolean z11 = (z9 || (kjVar = anVar.v5.a) == null || kjVar.e.isEmpty() || anVar.v5.d != null) ? false : true;
            h.putBoolean("reply_to", z11);
            if (z11) {
                long o4 = org.telegram.messenger.m5.o(((org.telegram.messenger.ij) anVar.v5.a.e.get(0)).b1());
                if (o4 != 0 && o4 != anVar.a() && o4 != anVar.getUserConfig().e() && o4 > 0) {
                    h.putLong("reply_to_author", o4);
                }
            }
            h.putInt("hasPoll", i7);
            h.putBoolean("hasInvoice", z10);
            org.telegram.messenger.kj kjVar3 = anVar.v5.b;
            h.putInt("messagesCount", kjVar3 != null ? kjVar3.e.size() : 0);
            h.putBoolean("canSelectTopics", true);
            ww wwVar = new ww(h);
            wwVar.C2 = anVar;
            anVar.presentFragment(wwVar);
        }
    }
}
