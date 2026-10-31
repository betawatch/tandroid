package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class hl extends org.telegram.ui.Components.ab0 {
    public final /* synthetic */ un H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl(un unVar, Context context, un unVar2, tg.b bVar, org.telegram.messenger.nj njVar, TLRPC.User user, TLRPC.Chat chat, int i10, org.telegram.ui.Components.wa0 wa0Var, int i11, boolean z10) {
        super(context, unVar2, bVar, njVar, user, chat, i10, wa0Var, i11, z10);
        this.H = unVar;
    }

    @Override // org.telegram.ui.Components.ab0
    public final void b() {
        org.telegram.messenger.jj jjVar;
        kn knVar;
        un unVar = this.H;
        kn knVar2 = unVar.B5;
        if (knVar2 == null || (jjVar = knVar2.a) == null || !((knVar = unVar.v5.d) == null || knVar.a == null || jjVar.f1() == unVar.v5.d.a.f1())) {
            unVar.B5 = unVar.v5.d;
        }
    }

    @Override // org.telegram.ui.Components.ab0
    public final void c(boolean z10) {
        int i10;
        boolean z11;
        org.telegram.messenger.lj ljVar;
        a(false);
        un unVar = this.H;
        org.telegram.messenger.nj njVar = unVar.v5;
        if (njVar != null) {
            if (!z10) {
                unVar.C5 = true;
            }
            org.telegram.messenger.lj ljVar2 = njVar.b;
            if (ljVar2 != null) {
                int size = ljVar2.e.size();
                i10 = 0;
                z11 = false;
                for (int i11 = 0; i11 < size; i11++) {
                    org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) unVar.v5.b.e.get(i11);
                    if (jjVar.D4()) {
                        i10 = 3;
                    } else if (jjVar.T3()) {
                        if (i10 != 2) {
                            i10 = jjVar.Z3() ? 2 : 1;
                        }
                    } else if (jjVar.z3()) {
                        z11 = true;
                    }
                    unVar.m6[0].put(jjVar.f1(), jjVar);
                }
            } else {
                i10 = 0;
                z11 = false;
            }
            Bundle j10 = org.telegram.ui.Cells.f1.j(3, "onlySelect", "dialogsType", true);
            j10.putBoolean("quote", !z10);
            boolean z12 = (z10 || (ljVar = unVar.v5.a) == null || ljVar.e.isEmpty() || unVar.v5.d != null) ? false : true;
            j10.putBoolean("reply_to", z12);
            if (z12) {
                long o10 = org.telegram.messenger.o5.o(((org.telegram.messenger.jj) unVar.v5.a.e.get(0)).b1());
                if (o10 != 0 && o10 != unVar.a() && o10 != unVar.getUserConfig().e() && o10 > 0) {
                    j10.putLong("reply_to_author", o10);
                }
            }
            j10.putInt("hasPoll", i10);
            j10.putBoolean("hasInvoice", z11);
            org.telegram.messenger.lj ljVar3 = unVar.v5.b;
            j10.putInt("messagesCount", ljVar3 != null ? ljVar3.e.size() : 0);
            j10.putBoolean("canSelectTopics", true);
            ay ayVar = new ay(j10);
            ayVar.C2 = unVar;
            unVar.presentFragment(ayVar);
        }
    }
}
