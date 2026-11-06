package org.telegram.ui;

import android.animation.Animator;
import android.os.Bundle;
import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class pl extends org.telegram.ui.Cells.j9 {
    public an w0;

    @Override // org.telegram.ui.Cells.v9
    public final void I(int i7, int i10, org.telegram.messenger.ij ijVar) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.messenger.dj S8;
        an anVar = this.w0;
        if (anVar != null) {
            int min = Math.min(i10, anVar.getMessagesController().o4 + i7);
            if (ijVar.d1() != 0 && (S8 = this.w0.S8(ijVar.d1())) != null && !S8.i) {
                ijVar = S8.h;
            }
            if (ijVar == null) {
                return;
            }
            qm b10 = qm.b(i7, min, ijVar);
            if (b10.i == null) {
                return;
            }
            qj qjVar = this.w0.Z;
            if (qjVar != null && qjVar.getVisibility() == 0) {
                kVar = ((org.telegram.ui.ActionBar.f2) this.w0).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.f2) this.w0).actionBar;
                    if (kVar2.v()) {
                        this.w0.N7(false);
                    }
                }
                this.w0.fc(ijVar, b10);
                qj qjVar2 = this.w0.Z;
                if (qjVar2 != null) {
                    qjVar2.H0();
                    return;
                }
                return;
            }
            an anVar2 = this.w0;
            anVar2.B5 = b10;
            anVar2.D5 = ijVar;
            anVar2.v5 = new org.telegram.messenger.mj(anVar2.h != null, anVar2.U9(), org.telegram.messenger.t3.p0(this.w0.e));
            an anVar3 = this.w0;
            anVar3.v5.f(anVar3.D5, anVar3.S8(ijVar.d1()), this.w0.a(), this.w0.B5);
            Bundle h = org.telegram.ui.Cells.f1.h(3, "onlySelect", "dialogsType", true);
            h.putBoolean("quote", true);
            h.putInt("messagesCount", 1);
            h.putBoolean("canSelectTopics", true);
            ww wwVar = new ww(h);
            an anVar4 = this.w0;
            wwVar.C2 = anVar4;
            anVar4.presentFragment(wwVar);
        }
    }

    @Override // org.telegram.ui.Cells.v9
    public final boolean b() {
        an anVar;
        an anVar2 = this.w0;
        if ((anVar2 != null && anVar2.a() == 489000) || (anVar = this.w0) == null) {
            return true;
        }
        if (!org.telegram.messenger.m5.C(anVar.a()) && this.w0.U9()) {
            return false;
        }
        org.telegram.ui.Cells.q9 q9Var = this.W;
        return q9Var == null || ((org.telegram.ui.Cells.q1) q9Var).getMessageObject() == null || ((org.telegram.ui.Cells.q1) this.W).getMessageObject().k == null || !((org.telegram.ui.Cells.q1) this.W).getMessageObject().k.noforwards;
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

    @Override // org.telegram.ui.Cells.v9
    public final boolean e() {
        org.telegram.ui.Cells.q9 q9Var;
        an anVar;
        org.telegram.ui.Cells.q9 q9Var2;
        TLRPC.Chat chat;
        an anVar2 = this.w0;
        if (anVar2 == null || anVar2.a() != 489000) {
            an anVar3 = this.w0;
            boolean z9 = (anVar3 != null && anVar3.U9()) || !((q9Var = this.W) == null || ((org.telegram.ui.Cells.q1) q9Var).getMessageObject() == null || ((org.telegram.ui.Cells.q1) this.W).getMessageObject().k == null || !((org.telegram.ui.Cells.q1) this.W).getMessageObject().k.noforwards);
            if (!this.s0 && (anVar = this.w0) != null && anVar.h == null && (((q9Var2 = this.W) == null || (((org.telegram.ui.Cells.q1) q9Var2).getMessageObject() != null && ((org.telegram.ui.Cells.q1) this.W).getMessageObject().D != 23 && !((org.telegram.ui.Cells.q1) this.W).getMessageObject().U4() && !((org.telegram.ui.Cells.q1) this.W).getMessageObject().A3() && ((((org.telegram.ui.Cells.q1) this.W).getMessageObject().w2 == null || org.telegram.messenger.ov.c(((org.telegram.ui.Cells.q1) this.W).getMessageObject())) && !this.w0.q9.q0))) && !this.w0.getMessagesController().s7.B(this.w0.j6) && !org.telegram.messenger.t10.A(this.w0.j6) && (!z9 || (chat = this.w0.e) == null || org.telegram.messenger.t3.B(chat)))) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.v9
    public final int o() {
        an anVar = this.w0;
        if (anVar == null) {
            return 0;
        }
        return anVar.Ua;
    }

    @Override // org.telegram.ui.Cells.v9
    public final int p() {
        an anVar = this.w0;
        if (anVar == null) {
            return 0;
        }
        return (int) anVar.L9;
    }

    @Override // org.telegram.ui.Cells.v9
    public final org.telegram.ui.ActionBar.f6 q() {
        an anVar = this.w0;
        if (anVar != null) {
            return anVar.xa;
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.v9
    public final int t(int i7) {
        return org.telegram.ui.ActionBar.k6.w0(i7, this.w0.xa);
    }
}
