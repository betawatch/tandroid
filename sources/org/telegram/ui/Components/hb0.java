package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class hb0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public final /* synthetic */ Object d;

    public hb0(org.telegram.ui.jx jxVar, int i7, int i10) {
        this.d = jxVar;
        this.b = i7;
        this.c = i10;
    }

    public void a() {
        this.c = 0;
        this.b = 0;
        ib0 ib0Var = (ib0) this.d;
        ib0Var.removeCallbacks(this);
        if (ib0Var.p0) {
            ib0Var.p0 = false;
            ib0Var.invalidate(0, ib0Var.o0, ib0Var.getRight(), ib0Var.getBottom());
        }
        ib0Var.q0 = false;
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean, byte] */
    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.an anVar;
        switch (this.a) {
            case 0:
                ib0 ib0Var = (ib0) this.d;
                int i7 = this.c;
                if (i7 == 1) {
                    int i10 = this.b;
                    if (i10 == 1) {
                        ib0Var.p0 = true;
                        ib0Var.invalidate(0, ib0Var.o0, ib0Var.getRight(), ib0Var.getBottom());
                        break;
                    } else if (i10 == 2) {
                        ib0Var.q0 = true;
                        ib0Var.invalidate(0, 0, ib0Var.getRight(), ib0Var.n0);
                        break;
                    }
                } else if (i7 == 2) {
                    int i11 = this.b;
                    if (i11 == 1) {
                        if (!ib0Var.p0) {
                            ib0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        ib0Var.p0 = (byte) (!ib0Var.p0 ? 1 : 0);
                        ib0Var.invalidate(0, ib0Var.o0, ib0Var.getRight(), ib0Var.getBottom());
                        break;
                    } else if (i11 == 2) {
                        if (!ib0Var.q0) {
                            ib0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        ib0Var.q0 = (byte) (!ib0Var.q0 ? 1 : 0);
                        ib0Var.invalidate(0, 0, ib0Var.getRight(), ib0Var.n0);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.jx jxVar = (org.telegram.ui.jx) this.d;
                int i12 = this.b;
                int i13 = this.c;
                uj0 uj0Var = jxVar.I;
                if (jxVar.n) {
                    int i14 = 0;
                    while (true) {
                        if (i14 < uj0Var.getChildCount()) {
                            View childAt = uj0Var.getChildAt(i14);
                            if (childAt instanceof org.telegram.ui.Cells.q1) {
                                q1Var = (org.telegram.ui.Cells.q1) childAt;
                                String V1 = q1Var.getMessageObject().V1();
                                if (V1 == null) {
                                    V1 = q1Var.getMessageObject().k.message;
                                }
                                if (q1Var.getPhotoImage().L() && V1 != null && q1Var.getMessageObject().e1() == i12) {
                                }
                            }
                            i14++;
                        } else {
                            q1Var = null;
                        }
                    }
                    if (q1Var != null && (anVar = jxVar.a) != null) {
                        anVar.qb(q1Var);
                        String V12 = q1Var.getMessageObject().V1();
                        if (!org.telegram.messenger.k6.a(V12) && !"🍑".equals(V12) && !"⚰".equals(V12) && !q1Var.getMessageObject().W3() && !q1Var.getMessageObject().F2()) {
                            try {
                                q1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        jxVar.n(q1Var, i13, false, true);
                        break;
                    }
                }
                break;
        }
    }

    public hb0(ib0 ib0Var) {
        this.d = ib0Var;
    }
}
