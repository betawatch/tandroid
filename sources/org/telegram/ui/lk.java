package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class lk extends org.telegram.ui.Components.ja0 {
    public final /* synthetic */ an I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk(an anVar, Context context, an anVar2, dh.c cVar, org.telegram.messenger.kj kjVar, TLRPC.User user, TLRPC.Chat chat, int i7, org.telegram.ui.Components.fa0 fa0Var, int i10, boolean z10) {
        super(context, anVar2, cVar, kjVar, user, chat, i7, fa0Var, i10, z10);
        this.I = anVar;
    }

    @Override // org.telegram.ui.Components.ja0
    public final void b() {
        org.telegram.messenger.gj gjVar;
        qm qmVar;
        an anVar = this.I;
        qm qmVar2 = anVar.C5;
        if (qmVar2 == null || (gjVar = qmVar2.a) == null || !((qmVar = anVar.w5.d) == null || qmVar.a == null || gjVar.e1() == anVar.w5.d.a.e1())) {
            anVar.C5 = anVar.w5.d;
        }
    }

    @Override // org.telegram.ui.Components.ja0
    public final void c(boolean z10) {
        int i7;
        boolean z11;
        org.telegram.messenger.ij ijVar;
        a(false);
        an anVar = this.I;
        org.telegram.messenger.kj kjVar = anVar.w5;
        if (kjVar != null) {
            if (!z10) {
                anVar.D5 = true;
            }
            org.telegram.messenger.ij ijVar2 = kjVar.b;
            if (ijVar2 != null) {
                int size = ijVar2.e.size();
                i7 = 0;
                z11 = false;
                for (int i10 = 0; i10 < size; i10++) {
                    org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) anVar.w5.b.e.get(i10);
                    if (gjVar.D4()) {
                        i7 = 3;
                    } else if (gjVar.T3()) {
                        if (i7 != 2) {
                            i7 = gjVar.Z3() ? 2 : 1;
                        }
                    } else if (gjVar.z3()) {
                        z11 = true;
                    }
                    anVar.n6[0].put(gjVar.e1(), gjVar);
                }
            } else {
                i7 = 0;
                z11 = false;
            }
            Bundle j3 = org.telegram.ui.Cells.y0.j(3, "onlySelect", "dialogsType", true);
            j3.putBoolean("quote", !z10);
            boolean z12 = (z10 || (ijVar = anVar.w5.a) == null || ijVar.e.isEmpty() || anVar.w5.d != null) ? false : true;
            j3.putBoolean("reply_to", z12);
            if (z12) {
                anVar.gb(j3, (org.telegram.messenger.gj) anVar.w5.a.e.get(0));
            }
            j3.putInt("hasPoll", i7);
            j3.putBoolean("hasInvoice", z11);
            org.telegram.messenger.ij ijVar3 = anVar.w5.b;
            j3.putInt("messagesCount", ijVar3 != null ? ijVar3.e.size() : 0);
            j3.putBoolean("canSelectTopics", true);
            yw ywVar = new yw(j3);
            ywVar.E2 = anVar;
            anVar.presentFragment(ywVar);
        }
    }
}
