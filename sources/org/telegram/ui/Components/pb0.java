package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class pb0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public final /* synthetic */ Object d;

    public pb0(org.telegram.ui.mx mxVar, int i7, int i10) {
        this.d = mxVar;
        this.b = i7;
        this.c = i10;
    }

    public void a() {
        this.c = 0;
        this.b = 0;
        qb0 qb0Var = (qb0) this.d;
        qb0Var.removeCallbacks(this);
        if (qb0Var.p0) {
            qb0Var.p0 = false;
            qb0Var.invalidate(0, qb0Var.o0, qb0Var.getRight(), qb0Var.getBottom());
        }
        qb0Var.q0 = false;
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean, byte] */
    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Cells.r1 r1Var;
        org.telegram.ui.bn bnVar;
        switch (this.a) {
            case 0:
                qb0 qb0Var = (qb0) this.d;
                int i7 = this.c;
                if (i7 == 1) {
                    int i10 = this.b;
                    if (i10 == 1) {
                        qb0Var.p0 = true;
                        qb0Var.invalidate(0, qb0Var.o0, qb0Var.getRight(), qb0Var.getBottom());
                        break;
                    } else if (i10 == 2) {
                        qb0Var.q0 = true;
                        qb0Var.invalidate(0, 0, qb0Var.getRight(), qb0Var.n0);
                        break;
                    }
                } else if (i7 == 2) {
                    int i11 = this.b;
                    if (i11 == 1) {
                        if (!qb0Var.p0) {
                            qb0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        qb0Var.p0 = (byte) (!qb0Var.p0 ? 1 : 0);
                        qb0Var.invalidate(0, qb0Var.o0, qb0Var.getRight(), qb0Var.getBottom());
                        break;
                    } else if (i11 == 2) {
                        if (!qb0Var.q0) {
                            qb0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        qb0Var.q0 = (byte) (!qb0Var.q0 ? 1 : 0);
                        qb0Var.invalidate(0, 0, qb0Var.getRight(), qb0Var.n0);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.mx mxVar = (org.telegram.ui.mx) this.d;
                int i12 = this.b;
                int i13 = this.c;
                ek0 ek0Var = mxVar.I;
                if (mxVar.n) {
                    int i14 = 0;
                    while (true) {
                        if (i14 < ek0Var.getChildCount()) {
                            View childAt = ek0Var.getChildAt(i14);
                            if (childAt instanceof org.telegram.ui.Cells.r1) {
                                r1Var = (org.telegram.ui.Cells.r1) childAt;
                                String V1 = r1Var.getMessageObject().V1();
                                if (V1 == null) {
                                    V1 = r1Var.getMessageObject().k.message;
                                }
                                if (r1Var.getPhotoImage().M() && V1 != null && r1Var.getMessageObject().e1() == i12) {
                                }
                            }
                            i14++;
                        } else {
                            r1Var = null;
                        }
                    }
                    if (r1Var != null && (bnVar = mxVar.a) != null) {
                        bnVar.qb(r1Var);
                        String V12 = r1Var.getMessageObject().V1();
                        if (!org.telegram.messenger.k6.a(V12) && !"🍑".equals(V12) && !"⚰".equals(V12) && !r1Var.getMessageObject().W3() && !r1Var.getMessageObject().F2()) {
                            try {
                                r1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        mxVar.n(r1Var, i13, false, true);
                        break;
                    }
                }
                break;
        }
    }

    public pb0(qb0 qb0Var) {
        this.d = qb0Var;
    }
}
