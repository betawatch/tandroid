package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class mk extends org.telegram.ui.Components.wa0 {
    public final /* synthetic */ bn I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk(bn bnVar, Context context, bn bnVar2, dh.c cVar, org.telegram.messenger.kj kjVar, TLRPC.User user, TLRPC.Chat chat, int i7, org.telegram.ui.Components.sa0 sa0Var, int i10, boolean z10) {
        super(context, bnVar2, cVar, kjVar, user, chat, i7, sa0Var, i10, z10);
        this.I = bnVar;
    }

    @Override // org.telegram.ui.Components.wa0
    public final void b() {
        org.telegram.messenger.gj gjVar;
        rm rmVar;
        bn bnVar = this.I;
        rm rmVar2 = bnVar.D5;
        if (rmVar2 == null || (gjVar = rmVar2.a) == null || !((rmVar = bnVar.x5.d) == null || rmVar.a == null || gjVar.e1() == bnVar.x5.d.a.e1())) {
            bnVar.D5 = bnVar.x5.d;
        }
    }

    @Override // org.telegram.ui.Components.wa0
    public final void c(boolean z10) {
        int i7;
        boolean z11;
        org.telegram.messenger.ij ijVar;
        a(false);
        bn bnVar = this.I;
        org.telegram.messenger.kj kjVar = bnVar.x5;
        if (kjVar != null) {
            if (!z10) {
                bnVar.E5 = true;
            }
            org.telegram.messenger.ij ijVar2 = kjVar.b;
            if (ijVar2 != null) {
                int size = ijVar2.e.size();
                i7 = 0;
                z11 = false;
                for (int i10 = 0; i10 < size; i10++) {
                    org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) bnVar.x5.b.e.get(i10);
                    if (gjVar.D4()) {
                        i7 = 3;
                    } else if (gjVar.T3()) {
                        if (i7 != 2) {
                            i7 = gjVar.Z3() ? 2 : 1;
                        }
                    } else if (gjVar.z3()) {
                        z11 = true;
                    }
                    bnVar.o6[0].put(gjVar.e1(), gjVar);
                }
            } else {
                i7 = 0;
                z11 = false;
            }
            Bundle l10 = org.telegram.ui.Cells.c0.l(3, "onlySelect", "dialogsType", true);
            l10.putBoolean("quote", !z10);
            boolean z12 = (z10 || (ijVar = bnVar.x5.a) == null || ijVar.e.isEmpty() || bnVar.x5.d != null) ? false : true;
            l10.putBoolean("reply_to", z12);
            if (z12) {
                bnVar.gb(l10, (org.telegram.messenger.gj) bnVar.x5.a.e.get(0));
            }
            l10.putInt("hasPoll", i7);
            l10.putBoolean("hasInvoice", z11);
            org.telegram.messenger.ij ijVar3 = bnVar.x5.b;
            l10.putInt("messagesCount", ijVar3 != null ? ijVar3.e.size() : 0);
            l10.putBoolean("canSelectTopics", true);
            cx cxVar = new cx(l10);
            cxVar.E2 = bnVar;
            bnVar.presentFragment(cxVar);
        }
    }
}
