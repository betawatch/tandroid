package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class zb0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public final /* synthetic */ Object d;

    public zb0(org.telegram.ui.ly lyVar, int i10, int i11) {
        this.d = lyVar;
        this.b = i10;
        this.c = i11;
    }

    public void a() {
        this.c = 0;
        this.b = 0;
        ac0 ac0Var = (ac0) this.d;
        ac0Var.removeCallbacks(this);
        if (ac0Var.o0) {
            ac0Var.o0 = false;
            ac0Var.invalidate(0, ac0Var.n0, ac0Var.getRight(), ac0Var.getBottom());
        }
        ac0Var.p0 = false;
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean, byte] */
    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.un unVar;
        switch (this.a) {
            case 0:
                ac0 ac0Var = (ac0) this.d;
                int i10 = this.c;
                if (i10 == 1) {
                    int i11 = this.b;
                    if (i11 == 1) {
                        ac0Var.o0 = true;
                        ac0Var.invalidate(0, ac0Var.n0, ac0Var.getRight(), ac0Var.getBottom());
                        break;
                    } else if (i11 == 2) {
                        ac0Var.p0 = true;
                        ac0Var.invalidate(0, 0, ac0Var.getRight(), ac0Var.m0);
                        break;
                    }
                } else if (i10 == 2) {
                    int i12 = this.b;
                    if (i12 == 1) {
                        if (!ac0Var.o0) {
                            ac0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        ac0Var.o0 = (byte) (!ac0Var.o0 ? 1 : 0);
                        ac0Var.invalidate(0, ac0Var.n0, ac0Var.getRight(), ac0Var.getBottom());
                        break;
                    } else if (i12 == 2) {
                        if (!ac0Var.p0) {
                            ac0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        ac0Var.p0 = (byte) (!ac0Var.p0 ? 1 : 0);
                        ac0Var.invalidate(0, 0, ac0Var.getRight(), ac0Var.m0);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.ly lyVar = (org.telegram.ui.ly) this.d;
                int i13 = this.b;
                int i14 = this.c;
                tk0 tk0Var = lyVar.H;
                if (lyVar.n) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < tk0Var.getChildCount()) {
                            View childAt = tk0Var.getChildAt(i15);
                            if (childAt instanceof org.telegram.ui.Cells.q1) {
                                q1Var = (org.telegram.ui.Cells.q1) childAt;
                                String W1 = q1Var.getMessageObject().W1();
                                if (W1 == null) {
                                    W1 = q1Var.getMessageObject().k.message;
                                }
                                if (q1Var.getPhotoImage().L() && W1 != null && q1Var.getMessageObject().f1() == i13) {
                                }
                            }
                            i15++;
                        } else {
                            q1Var = null;
                        }
                    }
                    if (q1Var != null && (unVar = lyVar.a) != null) {
                        unVar.cb(q1Var);
                        String W12 = q1Var.getMessageObject().W1();
                        if (!org.telegram.messenger.l6.a(W12) && !"🍑".equals(W12) && !"⚰".equals(W12) && !q1Var.getMessageObject().W3() && !q1Var.getMessageObject().F2()) {
                            try {
                                q1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        lyVar.n(q1Var, i14, false, true);
                        break;
                    }
                }
                break;
        }
    }

    public zb0(ac0 ac0Var) {
        this.d = ac0Var;
    }
}
