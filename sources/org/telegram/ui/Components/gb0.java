package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class gb0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public final /* synthetic */ Object d;

    public gb0(org.telegram.ui.ix ixVar, int i7, int i10) {
        this.d = ixVar;
        this.b = i7;
        this.c = i10;
    }

    public void a() {
        this.c = 0;
        this.b = 0;
        hb0 hb0Var = (hb0) this.d;
        hb0Var.removeCallbacks(this);
        if (hb0Var.o0) {
            hb0Var.o0 = false;
            hb0Var.invalidate(0, hb0Var.n0, hb0Var.getRight(), hb0Var.getBottom());
        }
        hb0Var.p0 = false;
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean, byte] */
    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.an anVar;
        switch (this.a) {
            case 0:
                hb0 hb0Var = (hb0) this.d;
                int i7 = this.c;
                if (i7 == 1) {
                    int i10 = this.b;
                    if (i10 == 1) {
                        hb0Var.o0 = true;
                        hb0Var.invalidate(0, hb0Var.n0, hb0Var.getRight(), hb0Var.getBottom());
                        break;
                    } else if (i10 == 2) {
                        hb0Var.p0 = true;
                        hb0Var.invalidate(0, 0, hb0Var.getRight(), hb0Var.m0);
                        break;
                    }
                } else if (i7 == 2) {
                    int i11 = this.b;
                    if (i11 == 1) {
                        if (!hb0Var.o0) {
                            hb0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        hb0Var.o0 = (byte) (!hb0Var.o0 ? 1 : 0);
                        hb0Var.invalidate(0, hb0Var.n0, hb0Var.getRight(), hb0Var.getBottom());
                        break;
                    } else if (i11 == 2) {
                        if (!hb0Var.p0) {
                            hb0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        hb0Var.p0 = (byte) (!hb0Var.p0 ? 1 : 0);
                        hb0Var.invalidate(0, 0, hb0Var.getRight(), hb0Var.m0);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.ix ixVar = (org.telegram.ui.ix) this.d;
                int i12 = this.b;
                int i13 = this.c;
                pj0 pj0Var = ixVar.H;
                if (ixVar.n) {
                    int i14 = 0;
                    while (true) {
                        if (i14 < pj0Var.getChildCount()) {
                            View childAt = pj0Var.getChildAt(i14);
                            if (childAt instanceof org.telegram.ui.Cells.q1) {
                                q1Var = (org.telegram.ui.Cells.q1) childAt;
                                String W1 = q1Var.getMessageObject().W1();
                                if (W1 == null) {
                                    W1 = q1Var.getMessageObject().k.message;
                                }
                                if (q1Var.getPhotoImage().L() && W1 != null && q1Var.getMessageObject().f1() == i12) {
                                }
                            }
                            i14++;
                        } else {
                            q1Var = null;
                        }
                    }
                    if (q1Var != null && (anVar = ixVar.a) != null) {
                        anVar.mb(q1Var);
                        String W12 = q1Var.getMessageObject().W1();
                        if (!org.telegram.messenger.j6.a(W12) && !"🍑".equals(W12) && !"⚰".equals(W12) && !q1Var.getMessageObject().X3() && !q1Var.getMessageObject().G2()) {
                            try {
                                q1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        ixVar.n(q1Var, i13, false, true);
                        break;
                    }
                }
                break;
        }
    }

    public gb0(hb0 hb0Var) {
        this.d = hb0Var;
    }
}
