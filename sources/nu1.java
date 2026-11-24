// default package

import android.animation.Animator;
import android.os.Bundle;
import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class nu1 extends hkb {
    public yv1 w0;

    @Override // skb
    public final void H(int i, int i2, k47 k47Var) {
        a aVar;
        a aVar2;
        f47 T6;
        yv1 yv1Var = this.w0;
        if (yv1Var != null) {
            int min = Math.min(i2, yv1Var.getMessagesController().l4.N1.f() + i);
            if (k47Var.c1() != 0 && (T6 = this.w0.T6(k47Var.c1())) != null && !T6.i) {
                k47Var = T6.h;
            }
            if (k47Var != null) {
                nv1 b = nv1.b(i, min, k47Var);
                if (b.i != null) {
                    ms1 ms1Var = this.w0.a0;
                    if (ms1Var != null && ms1Var.getVisibility() == 0) {
                        aVar = ((d) this.w0).actionBar;
                        if (aVar != null) {
                            aVar2 = ((d) this.w0).actionBar;
                            if (aVar2.y()) {
                                this.w0.M5(false);
                            }
                        }
                        this.w0.ec(k47Var, b);
                        ms1 ms1Var2 = this.w0.a0;
                        if (ms1Var2 != null) {
                            ms1Var2.j1();
                            return;
                        }
                        return;
                    }
                    yv1 yv1Var2 = this.w0;
                    yv1Var2.D5 = b;
                    yv1Var2.F5 = k47Var;
                    yv1Var2.x5 = new o47(yv1Var2.h != null, yv1Var2.a8(), sd2.p0(this.w0.e));
                    yv1 yv1Var3 = this.w0;
                    yv1Var3.x5.f(yv1Var3.F5, yv1Var3.T6(k47Var.c1()), this.w0.a(), this.w0.D5);
                    Bundle j = td4.j(3, "onlySelect", "dialogsType", true);
                    j.putBoolean("quote", true);
                    j.putInt("messagesCount", 1);
                    j.putBoolean("canSelectTopics", true);
                    nk3 nk3Var = new nk3(j);
                    yv1 yv1Var4 = this.w0;
                    nk3Var.E2 = yv1Var4;
                    yv1Var4.presentFragment(nk3Var);
                }
            }
        }
    }

    @Override // skb
    public final boolean a() {
        yv1 yv1Var;
        yv1 yv1Var2 = this.w0;
        if ((yv1Var2 != null && yv1Var2.a() == 489000) || (yv1Var = this.w0) == null) {
            return true;
        }
        if (!pg3.B(yv1Var.a()) && this.w0.a8()) {
            return false;
        }
        nkb nkbVar = this.W;
        return nkbVar == null || ((rc2) nkbVar).getMessageObject() == null || ((rc2) this.W).getMessageObject().k == null || !((rc2) this.W).getMessageObject().k.noforwards;
    }

    public final void c0(yv1 yv1Var) {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.p0;
            if (i >= sparseArray.size()) {
                sparseArray.clear();
                e(false);
                this.C = null;
                this.w0 = yv1Var;
                return;
            }
            ((Animator) sparseArray.get(sparseArray.keyAt(i))).cancel();
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a6, code lost:
    
        if (r3.u9.q0 == false) goto L42;
     */
    @Override // skb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d() {
        nkb nkbVar;
        yv1 yv1Var;
        TLRPC.Chat chat;
        yv1 yv1Var2 = this.w0;
        if (yv1Var2 == null || yv1Var2.a() != 489000) {
            yv1 yv1Var3 = this.w0;
            boolean z = (yv1Var3 != null && yv1Var3.a8()) || !((nkbVar = this.W) == null || ((rc2) nkbVar).getMessageObject() == null || ((rc2) this.W).getMessageObject().k == null || !((rc2) this.W).getMessageObject().k.noforwards);
            if (!this.s0 && (yv1Var = this.w0) != null && yv1Var.h == null) {
                nkb nkbVar2 = this.W;
                if (nkbVar2 != null) {
                    if (((rc2) nkbVar2).getMessageObject() != null && ((rc2) this.W).getMessageObject().D != 23 && !((rc2) this.W).getMessageObject().S4() && !((rc2) this.W).getMessageObject().z3() && (((rc2) this.W).getMessageObject().y2 == null || yj9.c(((rc2) this.W).getMessageObject()))) {
                        yv1Var = this.w0;
                    }
                }
                if (!yv1Var.getMessagesController().i4.A(this.w0.l6) && !m9c.C(this.w0.l6) && (!z || (chat = this.w0.e) == null || sd2.B(chat))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // skb
    public final int n() {
        yv1 yv1Var = this.w0;
        if (yv1Var == null) {
            return 0;
        }
        return yv1Var.Ya;
    }

    @Override // skb
    public final int o() {
        yv1 yv1Var = this.w0;
        if (yv1Var == null) {
            return 0;
        }
        return (int) yv1Var.P9;
    }

    @Override // skb
    public final ylb p() {
        yv1 yv1Var = this.w0;
        if (yv1Var != null) {
            return yv1Var.Ba;
        }
        return null;
    }

    @Override // skb
    public final int s(int i) {
        return cmb.v0(i, this.w0.Ba);
    }
}
