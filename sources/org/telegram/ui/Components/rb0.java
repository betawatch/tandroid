package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class rb0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public final /* synthetic */ Object d;

    public rb0(org.telegram.ui.nx nxVar, int i7, int i10) {
        this.d = nxVar;
        this.b = i7;
        this.c = i10;
    }

    public void a() {
        this.c = 0;
        this.b = 0;
        sb0 sb0Var = (sb0) this.d;
        sb0Var.removeCallbacks(this);
        if (sb0Var.p0) {
            sb0Var.p0 = false;
            sb0Var.invalidate(0, sb0Var.o0, sb0Var.getRight(), sb0Var.getBottom());
        }
        sb0Var.q0 = false;
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean, byte] */
    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Cells.r1 r1Var;
        org.telegram.ui.bn bnVar;
        switch (this.a) {
            case 0:
                sb0 sb0Var = (sb0) this.d;
                int i7 = this.c;
                if (i7 == 1) {
                    int i10 = this.b;
                    if (i10 == 1) {
                        sb0Var.p0 = true;
                        sb0Var.invalidate(0, sb0Var.o0, sb0Var.getRight(), sb0Var.getBottom());
                        break;
                    } else if (i10 == 2) {
                        sb0Var.q0 = true;
                        sb0Var.invalidate(0, 0, sb0Var.getRight(), sb0Var.n0);
                        break;
                    }
                } else if (i7 == 2) {
                    int i11 = this.b;
                    if (i11 == 1) {
                        if (!sb0Var.p0) {
                            sb0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        sb0Var.p0 = (byte) (!sb0Var.p0 ? 1 : 0);
                        sb0Var.invalidate(0, sb0Var.o0, sb0Var.getRight(), sb0Var.getBottom());
                        break;
                    } else if (i11 == 2) {
                        if (!sb0Var.q0) {
                            sb0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        sb0Var.q0 = (byte) (!sb0Var.q0 ? 1 : 0);
                        sb0Var.invalidate(0, 0, sb0Var.getRight(), sb0Var.n0);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.nx nxVar = (org.telegram.ui.nx) this.d;
                int i12 = this.b;
                int i13 = this.c;
                ck0 ck0Var = nxVar.I;
                if (nxVar.n) {
                    int i14 = 0;
                    while (true) {
                        if (i14 < ck0Var.getChildCount()) {
                            View childAt = ck0Var.getChildAt(i14);
                            if (childAt instanceof org.telegram.ui.Cells.r1) {
                                r1Var = (org.telegram.ui.Cells.r1) childAt;
                                String V1 = r1Var.getMessageObject().V1();
                                if (V1 == null) {
                                    V1 = r1Var.getMessageObject().k.message;
                                }
                                if (r1Var.getPhotoImage().L() && V1 != null && r1Var.getMessageObject().e1() == i12) {
                                }
                            }
                            i14++;
                        } else {
                            r1Var = null;
                        }
                    }
                    if (r1Var != null && (bnVar = nxVar.a) != null) {
                        bnVar.qb(r1Var);
                        String V12 = r1Var.getMessageObject().V1();
                        if (!org.telegram.messenger.k6.a(V12) && !"🍑".equals(V12) && !"⚰".equals(V12) && !r1Var.getMessageObject().W3() && !r1Var.getMessageObject().F2()) {
                            try {
                                r1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        nxVar.n(r1Var, i13, false, true);
                        break;
                    }
                }
                break;
        }
    }

    public rb0(sb0 sb0Var) {
        this.d = sb0Var;
    }
}
