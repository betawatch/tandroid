package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class hl extends org.telegram.ui.Components.ab0 {
    public final /* synthetic */ un H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl(un unVar, Context context, un unVar2, tg.b bVar, org.telegram.messenger.oj ojVar, TLRPC.User user, TLRPC.Chat chat, int i10, org.telegram.ui.Components.wa0 wa0Var, int i11, boolean z10) {
        super(context, unVar2, bVar, ojVar, user, chat, i10, wa0Var, i11, z10);
        this.H = unVar;
    }

    @Override // org.telegram.ui.Components.ab0
    public final void b() {
        org.telegram.messenger.kj kjVar;
        kn knVar;
        un unVar = this.H;
        kn knVar2 = unVar.B5;
        if (knVar2 == null || (kjVar = knVar2.a) == null || !((knVar = unVar.v5.d) == null || knVar.a == null || kjVar.f1() == unVar.v5.d.a.f1())) {
            unVar.B5 = unVar.v5.d;
        }
    }

    @Override // org.telegram.ui.Components.ab0
    public final void c(boolean z10) {
        int i10;
        boolean z11;
        org.telegram.messenger.mj mjVar;
        a(false);
        un unVar = this.H;
        org.telegram.messenger.oj ojVar = unVar.v5;
        if (ojVar != null) {
            if (!z10) {
                unVar.C5 = true;
            }
            org.telegram.messenger.mj mjVar2 = ojVar.b;
            if (mjVar2 != null) {
                int size = mjVar2.e.size();
                i10 = 0;
                z11 = false;
                for (int i11 = 0; i11 < size; i11++) {
                    org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) unVar.v5.b.e.get(i11);
                    if (kjVar.D4()) {
                        i10 = 3;
                    } else if (kjVar.T3()) {
                        if (i10 != 2) {
                            i10 = kjVar.Z3() ? 2 : 1;
                        }
                    } else if (kjVar.z3()) {
                        z11 = true;
                    }
                    unVar.m6[0].put(kjVar.f1(), kjVar);
                }
            } else {
                i10 = 0;
                z11 = false;
            }
            Bundle j10 = org.telegram.ui.Cells.f1.j(3, "onlySelect", "dialogsType", true);
            j10.putBoolean("quote", !z10);
            boolean z12 = (z10 || (mjVar = unVar.v5.a) == null || mjVar.e.isEmpty() || unVar.v5.d != null) ? false : true;
            j10.putBoolean("reply_to", z12);
            if (z12) {
                long o10 = org.telegram.messenger.o5.o(((org.telegram.messenger.kj) unVar.v5.a.e.get(0)).b1());
                if (o10 != 0 && o10 != unVar.a() && o10 != unVar.getUserConfig().e() && o10 > 0) {
                    j10.putLong("reply_to_author", o10);
                }
            }
            j10.putInt("hasPoll", i10);
            j10.putBoolean("hasInvoice", z11);
            org.telegram.messenger.mj mjVar3 = unVar.v5.b;
            j10.putInt("messagesCount", mjVar3 != null ? mjVar3.e.size() : 0);
            j10.putBoolean("canSelectTopics", true);
            zx zxVar = new zx(j10);
            zxVar.C2 = unVar;
            unVar.presentFragment(zxVar);
        }
    }
}
