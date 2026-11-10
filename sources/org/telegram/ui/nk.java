package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class nk extends org.telegram.ui.Components.ia0 {
    public final /* synthetic */ cn H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk(cn cnVar, Context context, cn cnVar2, dh.c cVar, org.telegram.messenger.mj mjVar, TLRPC.User user, TLRPC.Chat chat, int i7, org.telegram.ui.Components.ea0 ea0Var, int i10, boolean z9) {
        super(context, cnVar2, cVar, mjVar, user, chat, i7, ea0Var, i10, z9);
        this.H = cnVar;
    }

    @Override // org.telegram.ui.Components.ia0
    public final void b() {
        org.telegram.messenger.ij ijVar;
        sm smVar;
        cn cnVar = this.H;
        sm smVar2 = cnVar.B5;
        if (smVar2 == null || (ijVar = smVar2.a) == null || !((smVar = cnVar.v5.d) == null || smVar.a == null || ijVar.e1() == cnVar.v5.d.a.e1())) {
            cnVar.B5 = cnVar.v5.d;
        }
    }

    @Override // org.telegram.ui.Components.ia0
    public final void c(boolean z9) {
        int i7;
        boolean z10;
        org.telegram.messenger.kj kjVar;
        a(false);
        cn cnVar = this.H;
        org.telegram.messenger.mj mjVar = cnVar.v5;
        if (mjVar != null) {
            if (!z9) {
                cnVar.C5 = true;
            }
            org.telegram.messenger.kj kjVar2 = mjVar.b;
            if (kjVar2 != null) {
                int size = kjVar2.e.size();
                i7 = 0;
                z10 = false;
                for (int i10 = 0; i10 < size; i10++) {
                    org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) cnVar.v5.b.e.get(i10);
                    if (ijVar.D4()) {
                        i7 = 3;
                    } else if (ijVar.T3()) {
                        if (i7 != 2) {
                            i7 = ijVar.Z3() ? 2 : 1;
                        }
                    } else if (ijVar.z3()) {
                        z10 = true;
                    }
                    cnVar.m6[0].put(ijVar.e1(), ijVar);
                }
            } else {
                i7 = 0;
                z10 = false;
            }
            Bundle h = org.telegram.ui.Cells.f1.h(3, "onlySelect", "dialogsType", true);
            h.putBoolean("quote", !z9);
            boolean z11 = (z9 || (kjVar = cnVar.v5.a) == null || kjVar.e.isEmpty() || cnVar.v5.d != null) ? false : true;
            h.putBoolean("reply_to", z11);
            if (z11) {
                cnVar.fb(h, (org.telegram.messenger.ij) cnVar.v5.a.e.get(0));
            }
            h.putInt("hasPoll", i7);
            h.putBoolean("hasInvoice", z10);
            org.telegram.messenger.kj kjVar3 = cnVar.v5.b;
            h.putInt("messagesCount", kjVar3 != null ? kjVar3.e.size() : 0);
            h.putBoolean("canSelectTopics", true);
            zw zwVar = new zw(h);
            zwVar.D2 = cnVar;
            cnVar.presentFragment(zwVar);
        }
    }
}
