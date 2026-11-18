package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class mk extends org.telegram.ui.Components.ua0 {
    public final /* synthetic */ bn I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk(bn bnVar, Context context, bn bnVar2, dh.c cVar, org.telegram.messenger.jj jjVar, TLRPC.User user, TLRPC.Chat chat, int i7, org.telegram.ui.Components.qa0 qa0Var, int i10, boolean z10) {
        super(context, bnVar2, cVar, jjVar, user, chat, i7, qa0Var, i10, z10);
        this.I = bnVar;
    }

    @Override // org.telegram.ui.Components.ua0
    public final void b() {
        org.telegram.messenger.fj fjVar;
        rm rmVar;
        bn bnVar = this.I;
        rm rmVar2 = bnVar.D5;
        if (rmVar2 == null || (fjVar = rmVar2.a) == null || !((rmVar = bnVar.x5.d) == null || rmVar.a == null || fjVar.e1() == bnVar.x5.d.a.e1())) {
            bnVar.D5 = bnVar.x5.d;
        }
    }

    @Override // org.telegram.ui.Components.ua0
    public final void c(boolean z10) {
        int i7;
        boolean z11;
        org.telegram.messenger.hj hjVar;
        a(false);
        bn bnVar = this.I;
        org.telegram.messenger.jj jjVar = bnVar.x5;
        if (jjVar != null) {
            if (!z10) {
                bnVar.E5 = true;
            }
            org.telegram.messenger.hj hjVar2 = jjVar.b;
            if (hjVar2 != null) {
                int size = hjVar2.e.size();
                i7 = 0;
                z11 = false;
                for (int i10 = 0; i10 < size; i10++) {
                    org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) bnVar.x5.b.e.get(i10);
                    if (fjVar.D4()) {
                        i7 = 3;
                    } else if (fjVar.T3()) {
                        if (i7 != 2) {
                            i7 = fjVar.Z3() ? 2 : 1;
                        }
                    } else if (fjVar.z3()) {
                        z11 = true;
                    }
                    bnVar.o6[0].put(fjVar.e1(), fjVar);
                }
            } else {
                i7 = 0;
                z11 = false;
            }
            Bundle l10 = org.telegram.ui.Cells.c0.l(3, "onlySelect", "dialogsType", true);
            l10.putBoolean("quote", !z10);
            boolean z12 = (z10 || (hjVar = bnVar.x5.a) == null || hjVar.e.isEmpty() || bnVar.x5.d != null) ? false : true;
            l10.putBoolean("reply_to", z12);
            if (z12) {
                bnVar.gb(l10, (org.telegram.messenger.fj) bnVar.x5.a.e.get(0));
            }
            l10.putInt("hasPoll", i7);
            l10.putBoolean("hasInvoice", z11);
            org.telegram.messenger.hj hjVar3 = bnVar.x5.b;
            l10.putInt("messagesCount", hjVar3 != null ? hjVar3.e.size() : 0);
            l10.putBoolean("canSelectTopics", true);
            cx cxVar = new cx(l10);
            cxVar.E2 = bnVar;
            bnVar.presentFragment(cxVar);
        }
    }
}
