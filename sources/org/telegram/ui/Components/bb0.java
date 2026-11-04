package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class bb0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public final /* synthetic */ Object d;

    public bb0(org.telegram.ui.fx fxVar, int i3, int i10) {
        this.d = fxVar;
        this.b = i3;
        this.c = i10;
    }

    public void a() {
        this.c = 0;
        this.b = 0;
        cb0 cb0Var = (cb0) this.d;
        cb0Var.removeCallbacks(this);
        if (cb0Var.p0) {
            cb0Var.p0 = false;
            cb0Var.invalidate(0, cb0Var.o0, cb0Var.getRight(), cb0Var.getBottom());
        }
        cb0Var.q0 = false;
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean, byte] */
    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.wm wmVar;
        switch (this.a) {
            case 0:
                cb0 cb0Var = (cb0) this.d;
                int i3 = this.c;
                if (i3 == 1) {
                    int i10 = this.b;
                    if (i10 == 1) {
                        cb0Var.p0 = true;
                        cb0Var.invalidate(0, cb0Var.o0, cb0Var.getRight(), cb0Var.getBottom());
                        break;
                    } else if (i10 == 2) {
                        cb0Var.q0 = true;
                        cb0Var.invalidate(0, 0, cb0Var.getRight(), cb0Var.n0);
                        break;
                    }
                } else if (i3 == 2) {
                    int i11 = this.b;
                    if (i11 == 1) {
                        if (!cb0Var.p0) {
                            cb0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        cb0Var.p0 = (byte) (!cb0Var.p0 ? 1 : 0);
                        cb0Var.invalidate(0, cb0Var.o0, cb0Var.getRight(), cb0Var.getBottom());
                        break;
                    } else if (i11 == 2) {
                        if (!cb0Var.q0) {
                            cb0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        cb0Var.q0 = (byte) (!cb0Var.q0 ? 1 : 0);
                        cb0Var.invalidate(0, 0, cb0Var.getRight(), cb0Var.n0);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.fx fxVar = (org.telegram.ui.fx) this.d;
                int i12 = this.b;
                int i13 = this.c;
                tj0 tj0Var = fxVar.I;
                if (fxVar.n) {
                    int i14 = 0;
                    while (true) {
                        if (i14 < tj0Var.getChildCount()) {
                            View childAt = tj0Var.getChildAt(i14);
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
                    if (q1Var != null && (wmVar = fxVar.a) != null) {
                        wmVar.mb(q1Var);
                        String W12 = q1Var.getMessageObject().W1();
                        if (!org.telegram.messenger.j6.a(W12) && !"🍑".equals(W12) && !"⚰".equals(W12) && !q1Var.getMessageObject().X3() && !q1Var.getMessageObject().G2()) {
                            try {
                                q1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        fxVar.n(q1Var, i13, false, true);
                        break;
                    }
                }
                break;
        }
    }

    public bb0(cb0 cb0Var) {
        this.d = cb0Var;
    }
}
