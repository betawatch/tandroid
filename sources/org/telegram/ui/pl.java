package org.telegram.ui;

import android.animation.Animator;
import android.os.Bundle;
import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class pl extends org.telegram.ui.Cells.i9 {
    public an w0;

    @Override // org.telegram.ui.Cells.u9
    public final void I(int i7, int i10, org.telegram.messenger.gj gjVar) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.messenger.bj U8;
        an anVar = this.w0;
        if (anVar != null) {
            int min = Math.min(i10, anVar.getMessagesController().p4 + i7);
            if (gjVar.c1() != 0 && (U8 = this.w0.U8(gjVar.c1())) != null && !U8.i) {
                gjVar = U8.h;
            }
            if (gjVar == null) {
                return;
            }
            qm b10 = qm.b(i7, min, gjVar);
            if (b10.i == null) {
                return;
            }
            qj qjVar = this.w0.a0;
            if (qjVar != null && qjVar.getVisibility() == 0) {
                kVar = ((org.telegram.ui.ActionBar.e2) this.w0).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.e2) this.w0).actionBar;
                    if (kVar2.x()) {
                        this.w0.O7(false);
                    }
                }
                this.w0.jc(gjVar, b10);
                qj qjVar2 = this.w0.a0;
                if (qjVar2 != null) {
                    qjVar2.W0();
                    return;
                }
                return;
            }
            an anVar2 = this.w0;
            anVar2.C5 = b10;
            anVar2.E5 = gjVar;
            anVar2.w5 = new org.telegram.messenger.kj(anVar2.h != null, anVar2.W9(), org.telegram.messenger.t3.p0(this.w0.e));
            an anVar3 = this.w0;
            anVar3.w5.f(anVar3.E5, anVar3.U8(gjVar.c1()), this.w0.a(), this.w0.C5);
            Bundle j3 = org.telegram.ui.Cells.y0.j(3, "onlySelect", "dialogsType", true);
            j3.putBoolean("quote", true);
            j3.putInt("messagesCount", 1);
            j3.putBoolean("canSelectTopics", true);
            yw ywVar = new yw(j3);
            an anVar4 = this.w0;
            ywVar.E2 = anVar4;
            anVar4.presentFragment(ywVar);
        }
    }

    @Override // org.telegram.ui.Cells.u9
    public final boolean b() {
        an anVar;
        an anVar2 = this.w0;
        if ((anVar2 != null && anVar2.a() == 489000) || (anVar = this.w0) == null) {
            return true;
        }
        if (!org.telegram.messenger.m5.C(anVar.a()) && this.w0.W9()) {
            return false;
        }
        org.telegram.ui.Cells.p9 p9Var = this.W;
        return p9Var == null || ((org.telegram.ui.Cells.q1) p9Var).getMessageObject() == null || ((org.telegram.ui.Cells.q1) this.W).getMessageObject().k == null || !((org.telegram.ui.Cells.q1) this.W).getMessageObject().k.noforwards;
    }

    public final void d0(an anVar) {
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.p0;
            if (i7 >= sparseArray.size()) {
                sparseArray.clear();
                f(false);
                this.C = null;
                this.w0 = anVar;
                return;
            }
            ((Animator) sparseArray.get(sparseArray.keyAt(i7))).cancel();
            i7++;
        }
    }

    @Override // org.telegram.ui.Cells.u9
    public final boolean e() {
        org.telegram.ui.Cells.p9 p9Var;
        an anVar;
        org.telegram.ui.Cells.p9 p9Var2;
        TLRPC.Chat chat;
        an anVar2 = this.w0;
        if (anVar2 == null || anVar2.a() != 489000) {
            an anVar3 = this.w0;
            boolean z10 = (anVar3 != null && anVar3.W9()) || !((p9Var = this.W) == null || ((org.telegram.ui.Cells.q1) p9Var).getMessageObject() == null || ((org.telegram.ui.Cells.q1) this.W).getMessageObject().k == null || !((org.telegram.ui.Cells.q1) this.W).getMessageObject().k.noforwards);
            if (!this.s0 && (anVar = this.w0) != null && anVar.h == null && (((p9Var2 = this.W) == null || (((org.telegram.ui.Cells.q1) p9Var2).getMessageObject() != null && ((org.telegram.ui.Cells.q1) this.W).getMessageObject().D != 23 && !((org.telegram.ui.Cells.q1) this.W).getMessageObject().T4() && !((org.telegram.ui.Cells.q1) this.W).getMessageObject().z3() && ((((org.telegram.ui.Cells.q1) this.W).getMessageObject().y2 == null || org.telegram.messenger.mv.c(((org.telegram.ui.Cells.q1) this.W).getMessageObject())) && !this.w0.t9.q0))) && !this.w0.getMessagesController().t7.B(this.w0.k6) && !org.telegram.messenger.q10.A(this.w0.k6) && (!z10 || (chat = this.w0.e) == null || org.telegram.messenger.t3.B(chat)))) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.u9
    public final int o() {
        an anVar = this.w0;
        if (anVar == null) {
            return 0;
        }
        return anVar.Xa;
    }

    @Override // org.telegram.ui.Cells.u9
    public final int p() {
        an anVar = this.w0;
        if (anVar == null) {
            return 0;
        }
        return (int) anVar.O9;
    }

    @Override // org.telegram.ui.Cells.u9
    public final org.telegram.ui.ActionBar.e6 q() {
        an anVar = this.w0;
        if (anVar != null) {
            return anVar.Aa;
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.u9
    public final int t(int i7) {
        return org.telegram.ui.ActionBar.j6.w0(i7, this.w0.Aa);
    }
}
