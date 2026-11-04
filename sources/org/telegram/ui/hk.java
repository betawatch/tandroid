package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class hk extends org.telegram.ui.Components.da0 {
    public final /* synthetic */ wm I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk(wm wmVar, Context context, wm wmVar2, eh.c cVar, org.telegram.messenger.dj djVar, TLRPC.User user, TLRPC.Chat chat, int i3, org.telegram.ui.Components.z90 z90Var, int i10, boolean z10) {
        super(context, wmVar2, cVar, djVar, user, chat, i3, z90Var, i10, z10);
        this.I = wmVar;
    }

    @Override // org.telegram.ui.Components.da0
    public final void b() {
        org.telegram.messenger.zi ziVar;
        mm mmVar;
        wm wmVar = this.I;
        mm mmVar2 = wmVar.C5;
        if (mmVar2 == null || (ziVar = mmVar2.a) == null || !((mmVar = wmVar.w5.d) == null || mmVar.a == null || ziVar.f1() == wmVar.w5.d.a.f1())) {
            wmVar.C5 = wmVar.w5.d;
        }
    }

    @Override // org.telegram.ui.Components.da0
    public final void c(boolean z10) {
        int i3;
        boolean z11;
        org.telegram.messenger.bj bjVar;
        a(false);
        wm wmVar = this.I;
        org.telegram.messenger.dj djVar = wmVar.w5;
        if (djVar != null) {
            if (!z10) {
                wmVar.D5 = true;
            }
            org.telegram.messenger.bj bjVar2 = djVar.b;
            if (bjVar2 != null) {
                int size = bjVar2.e.size();
                i3 = 0;
                z11 = false;
                for (int i10 = 0; i10 < size; i10++) {
                    org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) wmVar.w5.b.e.get(i10);
                    if (ziVar.E4()) {
                        i3 = 3;
                    } else if (ziVar.U3()) {
                        if (i3 != 2) {
                            i3 = ziVar.a4() ? 2 : 1;
                        }
                    } else if (ziVar.A3()) {
                        z11 = true;
                    }
                    wmVar.n6[0].put(ziVar.f1(), ziVar);
                }
            } else {
                i3 = 0;
                z11 = false;
            }
            Bundle l10 = org.telegram.ui.Cells.f1.l(3, "onlySelect", "dialogsType", true);
            l10.putBoolean("quote", !z10);
            boolean z12 = (z10 || (bjVar = wmVar.w5.a) == null || bjVar.e.isEmpty() || wmVar.w5.d != null) ? false : true;
            l10.putBoolean("reply_to", z12);
            if (z12) {
                long o10 = org.telegram.messenger.m5.o(((org.telegram.messenger.zi) wmVar.w5.a.e.get(0)).b1());
                if (o10 != 0 && o10 != wmVar.a() && o10 != wmVar.getUserConfig().e() && o10 > 0) {
                    l10.putLong("reply_to_author", o10);
                }
            }
            l10.putInt("hasPoll", i3);
            l10.putBoolean("hasInvoice", z11);
            org.telegram.messenger.bj bjVar3 = wmVar.w5.b;
            l10.putInt("messagesCount", bjVar3 != null ? bjVar3.e.size() : 0);
            l10.putBoolean("canSelectTopics", true);
            uw uwVar = new uw(l10);
            uwVar.D2 = wmVar;
            wmVar.presentFragment(uwVar);
        }
    }
}
