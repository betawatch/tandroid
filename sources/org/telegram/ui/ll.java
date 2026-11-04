package org.telegram.ui;

import android.animation.Animator;
import android.os.Bundle;
import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ll extends org.telegram.ui.Cells.i9 {
    public wm w0;

    @Override // org.telegram.ui.Cells.u9
    public final void I(int i3, int i10, org.telegram.messenger.zi ziVar) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.messenger.ui S8;
        wm wmVar = this.w0;
        if (wmVar != null) {
            int min = Math.min(i10, wmVar.getMessagesController().o4 + i3);
            if (ziVar.d1() != 0 && (S8 = this.w0.S8(ziVar.d1())) != null && !S8.i) {
                ziVar = S8.h;
            }
            if (ziVar == null) {
                return;
            }
            mm b10 = mm.b(i3, min, ziVar);
            if (b10.i == null) {
                return;
            }
            mj mjVar = this.w0.a0;
            if (mjVar != null && mjVar.getVisibility() == 0) {
                kVar = ((org.telegram.ui.ActionBar.d2) this.w0).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.d2) this.w0).actionBar;
                    if (kVar2.v()) {
                        this.w0.N7(false);
                    }
                }
                this.w0.fc(ziVar, b10);
                mj mjVar2 = this.w0.a0;
                if (mjVar2 != null) {
                    mjVar2.G0();
                    return;
                }
                return;
            }
            wm wmVar2 = this.w0;
            wmVar2.C5 = b10;
            wmVar2.E5 = ziVar;
            wmVar2.w5 = new org.telegram.messenger.dj(wmVar2.h != null, wmVar2.U9(), org.telegram.messenger.t3.p0(this.w0.e));
            wm wmVar3 = this.w0;
            wmVar3.w5.f(wmVar3.E5, wmVar3.S8(ziVar.d1()), this.w0.a(), this.w0.C5);
            Bundle l10 = org.telegram.ui.Cells.f1.l(3, "onlySelect", "dialogsType", true);
            l10.putBoolean("quote", true);
            l10.putInt("messagesCount", 1);
            l10.putBoolean("canSelectTopics", true);
            uw uwVar = new uw(l10);
            wm wmVar4 = this.w0;
            uwVar.D2 = wmVar4;
            wmVar4.presentFragment(uwVar);
        }
    }

    @Override // org.telegram.ui.Cells.u9
    public final boolean b() {
        wm wmVar;
        wm wmVar2 = this.w0;
        if ((wmVar2 != null && wmVar2.a() == 489000) || (wmVar = this.w0) == null) {
            return true;
        }
        if (!org.telegram.messenger.m5.C(wmVar.a()) && this.w0.U9()) {
            return false;
        }
        org.telegram.ui.Cells.p9 p9Var = this.W;
        return p9Var == null || ((org.telegram.ui.Cells.q1) p9Var).getMessageObject() == null || ((org.telegram.ui.Cells.q1) this.W).getMessageObject().k == null || !((org.telegram.ui.Cells.q1) this.W).getMessageObject().k.noforwards;
    }

    public final void d0(wm wmVar) {
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.p0;
            if (i3 >= sparseArray.size()) {
                sparseArray.clear();
                f(false);
                this.C = null;
                this.w0 = wmVar;
                return;
            }
            ((Animator) sparseArray.get(sparseArray.keyAt(i3))).cancel();
            i3++;
        }
    }

    @Override // org.telegram.ui.Cells.u9
    public final boolean e() {
        org.telegram.ui.Cells.p9 p9Var;
        wm wmVar;
        org.telegram.ui.Cells.p9 p9Var2;
        TLRPC.Chat chat;
        wm wmVar2 = this.w0;
        if (wmVar2 == null || wmVar2.a() != 489000) {
            wm wmVar3 = this.w0;
            boolean z10 = (wmVar3 != null && wmVar3.U9()) || !((p9Var = this.W) == null || ((org.telegram.ui.Cells.q1) p9Var).getMessageObject() == null || ((org.telegram.ui.Cells.q1) this.W).getMessageObject().k == null || !((org.telegram.ui.Cells.q1) this.W).getMessageObject().k.noforwards);
            if (!this.s0 && (wmVar = this.w0) != null && wmVar.h == null && (((p9Var2 = this.W) == null || (((org.telegram.ui.Cells.q1) p9Var2).getMessageObject() != null && ((org.telegram.ui.Cells.q1) this.W).getMessageObject().D != 23 && !((org.telegram.ui.Cells.q1) this.W).getMessageObject().U4() && !((org.telegram.ui.Cells.q1) this.W).getMessageObject().A3() && ((((org.telegram.ui.Cells.q1) this.W).getMessageObject().w2 == null || org.telegram.messenger.gv.c(((org.telegram.ui.Cells.q1) this.W).getMessageObject())) && !this.w0.r9.q0))) && !this.w0.getMessagesController().s7.B(this.w0.k6) && !org.telegram.messenger.l10.A(this.w0.k6) && (!z10 || (chat = this.w0.e) == null || org.telegram.messenger.t3.B(chat)))) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.u9
    public final int o() {
        wm wmVar = this.w0;
        if (wmVar == null) {
            return 0;
        }
        return wmVar.Va;
    }

    @Override // org.telegram.ui.Cells.u9
    public final int p() {
        wm wmVar = this.w0;
        if (wmVar == null) {
            return 0;
        }
        return (int) wmVar.M9;
    }

    @Override // org.telegram.ui.Cells.u9
    public final org.telegram.ui.ActionBar.e6 q() {
        wm wmVar = this.w0;
        if (wmVar != null) {
            return wmVar.ya;
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.u9
    public final int t(int i3) {
        return org.telegram.ui.ActionBar.k6.w0(i3, this.w0.ya);
    }
}
