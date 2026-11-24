// default package

import android.animation.Animator;
import android.os.Bundle;
import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class bt1 extends gib {
    public mu1 w0;

    @Override // rib
    public final void H(int i, int i2, k27 k27Var) {
        a aVar;
        a aVar2;
        f27 M6;
        mu1 mu1Var = this.w0;
        if (mu1Var != null) {
            int min = Math.min(i2, mu1Var.getMessagesController().k4.N1.f() + i);
            if (k27Var.c1() != 0 && (M6 = this.w0.M6(k27Var.c1())) != null && !M6.i) {
                k27Var = M6.h;
            }
            if (k27Var != null) {
                bu1 b = bu1.b(i, min, k27Var);
                if (b.i != null) {
                    ar1 ar1Var = this.w0.a0;
                    if (ar1Var != null && ar1Var.getVisibility() == 0) {
                        aVar = ((d) this.w0).actionBar;
                        if (aVar != null) {
                            aVar2 = ((d) this.w0).actionBar;
                            if (aVar2.y()) {
                                this.w0.F5(false);
                            }
                        }
                        this.w0.Sb(k27Var, b);
                        ar1 ar1Var2 = this.w0.a0;
                        if (ar1Var2 != null) {
                            ar1Var2.h1();
                            return;
                        }
                        return;
                    }
                    mu1 mu1Var2 = this.w0;
                    mu1Var2.D5 = b;
                    mu1Var2.F5 = k27Var;
                    mu1Var2.x5 = new o27(mu1Var2.h != null, mu1Var2.R7(), hc2.p0(this.w0.e));
                    mu1 mu1Var3 = this.w0;
                    mu1Var3.x5.f(mu1Var3.F5, mu1Var3.M6(k27Var.c1()), this.w0.a(), this.w0.D5);
                    Bundle j = tb4.j(3, "onlySelect", "dialogsType", true);
                    j.putBoolean("quote", true);
                    j.putInt("messagesCount", 1);
                    j.putBoolean("canSelectTopics", true);
                    cj3 cj3Var = new cj3(j);
                    mu1 mu1Var4 = this.w0;
                    cj3Var.E2 = mu1Var4;
                    mu1Var4.presentFragment(cj3Var);
                }
            }
        }
    }

    @Override // rib
    public final boolean a() {
        mu1 mu1Var;
        mu1 mu1Var2 = this.w0;
        if ((mu1Var2 != null && mu1Var2.a() == 489000) || (mu1Var = this.w0) == null) {
            return true;
        }
        if (!cf3.B(mu1Var.a()) && this.w0.R7()) {
            return false;
        }
        mib mibVar = this.W;
        return mibVar == null || ((gb2) mibVar).getMessageObject() == null || ((gb2) this.W).getMessageObject().k == null || !((gb2) this.W).getMessageObject().k.noforwards;
    }

    public final void c0(mu1 mu1Var) {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.p0;
            if (i >= sparseArray.size()) {
                sparseArray.clear();
                e(false);
                this.C = null;
                this.w0 = mu1Var;
                return;
            }
            ((Animator) sparseArray.get(sparseArray.keyAt(i))).cancel();
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a6, code lost:
    
        if (r3.u9.q0 == false) goto L42;
     */
    @Override // rib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d() {
        mib mibVar;
        mu1 mu1Var;
        TLRPC.Chat chat;
        mu1 mu1Var2 = this.w0;
        if (mu1Var2 == null || mu1Var2.a() != 489000) {
            mu1 mu1Var3 = this.w0;
            boolean z = (mu1Var3 != null && mu1Var3.R7()) || !((mibVar = this.W) == null || ((gb2) mibVar).getMessageObject() == null || ((gb2) this.W).getMessageObject().k == null || !((gb2) this.W).getMessageObject().k.noforwards);
            if (!this.s0 && (mu1Var = this.w0) != null && mu1Var.h == null) {
                mib mibVar2 = this.W;
                if (mibVar2 != null) {
                    if (((gb2) mibVar2).getMessageObject() != null && ((gb2) this.W).getMessageObject().D != 23 && !((gb2) this.W).getMessageObject().S4() && !((gb2) this.W).getMessageObject().z3() && (((gb2) this.W).getMessageObject().y2 == null || vh9.c(((gb2) this.W).getMessageObject()))) {
                        mu1Var = this.w0;
                    }
                }
                if (!mu1Var.getMessagesController().i4.A(this.w0.l6) && !l7c.C(this.w0.l6) && (!z || (chat = this.w0.e) == null || hc2.B(chat))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // rib
    public final int n() {
        mu1 mu1Var = this.w0;
        if (mu1Var == null) {
            return 0;
        }
        return mu1Var.Ya;
    }

    @Override // rib
    public final int o() {
        mu1 mu1Var = this.w0;
        if (mu1Var == null) {
            return 0;
        }
        return (int) mu1Var.P9;
    }

    @Override // rib
    public final wjb p() {
        mu1 mu1Var = this.w0;
        if (mu1Var != null) {
            return mu1Var.Ba;
        }
        return null;
    }

    @Override // rib
    public final int s(int i) {
        return bkb.v0(i, this.w0.Ba);
    }
}
