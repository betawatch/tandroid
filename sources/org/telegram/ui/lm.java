package org.telegram.ui;

import android.animation.Animator;
import android.os.Bundle;
import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class lm extends org.telegram.ui.Cells.l9 {
    public un w0;

    @Override // org.telegram.ui.Cells.w9
    public final void I(int i10, int i11, org.telegram.messenger.jj jjVar) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.messenger.ej L8;
        un unVar = this.w0;
        if (unVar != null) {
            int min = Math.min(i11, unVar.getMessagesController().p4 + i10);
            if (jjVar.d1() != 0 && (L8 = this.w0.L8(jjVar.d1())) != null && !L8.i) {
                jjVar = L8.h;
            }
            if (jjVar == null) {
                return;
            }
            kn b10 = kn.b(i10, min, jjVar);
            if (b10.i == null) {
                return;
            }
            mk mkVar = this.w0.Z;
            if (mkVar != null && mkVar.getVisibility() == 0) {
                lVar = ((org.telegram.ui.ActionBar.k2) this.w0).actionBar;
                if (lVar != null) {
                    lVar2 = ((org.telegram.ui.ActionBar.k2) this.w0).actionBar;
                    if (lVar2.u()) {
                        this.w0.H7(false);
                    }
                }
                this.w0.Vb(jjVar, b10);
                mk mkVar2 = this.w0.Z;
                if (mkVar2 != null) {
                    mkVar2.F0();
                    return;
                }
                return;
            }
            un unVar2 = this.w0;
            unVar2.B5 = b10;
            unVar2.D5 = jjVar;
            unVar2.v5 = new org.telegram.messenger.nj(unVar2.h != null, unVar2.K9(), org.telegram.messenger.w3.p0(this.w0.e));
            un unVar3 = this.w0;
            unVar3.v5.f(unVar3.D5, unVar3.L8(jjVar.d1()), this.w0.a(), this.w0.B5);
            Bundle j10 = org.telegram.ui.Cells.f1.j(3, "onlySelect", "dialogsType", true);
            j10.putBoolean("quote", true);
            j10.putInt("messagesCount", 1);
            j10.putBoolean("canSelectTopics", true);
            ay ayVar = new ay(j10);
            un unVar4 = this.w0;
            ayVar.C2 = unVar4;
            unVar4.presentFragment(ayVar);
        }
    }

    @Override // org.telegram.ui.Cells.w9
    public final boolean b() {
        un unVar;
        un unVar2 = this.w0;
        if ((unVar2 != null && unVar2.a() == 489000) || (unVar = this.w0) == null) {
            return true;
        }
        if (!org.telegram.messenger.o5.C(unVar.a()) && this.w0.K9()) {
            return false;
        }
        org.telegram.ui.Cells.r9 r9Var = this.W;
        return r9Var == null || ((org.telegram.ui.Cells.q1) r9Var).getMessageObject() == null || ((org.telegram.ui.Cells.q1) this.W).getMessageObject().k == null || !((org.telegram.ui.Cells.q1) this.W).getMessageObject().k.noforwards;
    }

    public final void d0(un unVar) {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.p0;
            if (i10 >= sparseArray.size()) {
                sparseArray.clear();
                f(false);
                this.C = null;
                this.w0 = unVar;
                return;
            }
            ((Animator) sparseArray.get(sparseArray.keyAt(i10))).cancel();
            i10++;
        }
    }

    @Override // org.telegram.ui.Cells.w9
    public final boolean e() {
        org.telegram.ui.Cells.r9 r9Var;
        un unVar;
        org.telegram.ui.Cells.r9 r9Var2;
        TLRPC.Chat chat;
        un unVar2 = this.w0;
        if (unVar2 == null || unVar2.a() != 489000) {
            un unVar3 = this.w0;
            boolean z10 = (unVar3 != null && unVar3.K9()) || !((r9Var = this.W) == null || ((org.telegram.ui.Cells.q1) r9Var).getMessageObject() == null || ((org.telegram.ui.Cells.q1) this.W).getMessageObject().k == null || !((org.telegram.ui.Cells.q1) this.W).getMessageObject().k.noforwards);
            if (!this.s0 && (unVar = this.w0) != null && unVar.h == null && (((r9Var2 = this.W) == null || (((org.telegram.ui.Cells.q1) r9Var2).getMessageObject() != null && ((org.telegram.ui.Cells.q1) this.W).getMessageObject().D != 23 && !((org.telegram.ui.Cells.q1) this.W).getMessageObject().T4() && !((org.telegram.ui.Cells.q1) this.W).getMessageObject().z3() && ((((org.telegram.ui.Cells.q1) this.W).getMessageObject().w2 == null || org.telegram.messenger.zv.c(((org.telegram.ui.Cells.q1) this.W).getMessageObject())) && !this.w0.q9.q0))) && !this.w0.getMessagesController().t7.B(this.w0.j6) && !org.telegram.messenger.h20.A(this.w0.j6) && (!z10 || (chat = this.w0.e) == null || org.telegram.messenger.w3.B(chat)))) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.w9
    public final int o() {
        un unVar = this.w0;
        if (unVar == null) {
            return 0;
        }
        return unVar.Ua;
    }

    @Override // org.telegram.ui.Cells.w9
    public final int p() {
        un unVar = this.w0;
        if (unVar == null) {
            return 0;
        }
        return (int) unVar.L9;
    }

    @Override // org.telegram.ui.Cells.w9
    public final org.telegram.ui.ActionBar.p6 q() {
        un unVar = this.w0;
        if (unVar != null) {
            return unVar.xa;
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.w9
    public final int t(int i10) {
        return org.telegram.ui.ActionBar.t6.w0(i10, this.w0.xa);
    }
}
