package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class u90 extends v4.t {
    public final /* synthetic */ int S;
    public final /* synthetic */ KeyEvent.Callback T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u90(KeyEvent.Callback callback, int i7) {
        super(true);
        this.S = i7;
        this.T = callback;
    }

    @Override // v4.t
    public final boolean B1(int i7) {
        byte b10;
        byte b11;
        org.telegram.messenger.aj d;
        byte b12;
        switch (this.S) {
            case 0:
                ca0 ca0Var = (ca0) this.T;
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) ca0Var.r.f.get(i7);
                org.telegram.messenger.dj a10 = ca0.a(ca0Var, ijVar);
                if (a10 != null) {
                    ArrayList arrayList = a10.e;
                    org.telegram.messenger.aj d2 = a10.d(ijVar);
                    if (d2.a != d2.b && (b10 = d2.c) == d2.d && b10 != 0) {
                        int size = arrayList.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            org.telegram.messenger.aj ajVar = (org.telegram.messenger.aj) arrayList.get(i10);
                            if (ajVar != d2) {
                                byte b13 = ajVar.c;
                                byte b14 = d2.c;
                                if (b13 <= b14 && ajVar.d >= b14) {
                                    break;
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.bg0 bg0Var = (org.telegram.ui.bg0) this.T;
                org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) bg0Var.M.get((B() - 1) - i7);
                org.telegram.messenger.dj k10 = bg0Var.k(ijVar2);
                if (k10 != null) {
                    ArrayList arrayList2 = k10.e;
                    org.telegram.messenger.aj d10 = k10.d(ijVar2);
                    if (d10.a != d10.b && (b11 = d10.c) == d10.d && b11 != 0) {
                        int size2 = arrayList2.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            org.telegram.messenger.aj ajVar2 = (org.telegram.messenger.aj) arrayList2.get(i11);
                            if (ajVar2 != d10) {
                                byte b15 = ajVar2.c;
                                byte b16 = d10.c;
                                if (b15 <= b16 && ajVar2.d >= b16) {
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                fi.e5 e5Var = (fi.e5) this.T;
                ArrayList arrayList3 = e5Var.s0;
                int size3 = (arrayList3.size() - 1) - i7;
                org.telegram.messenger.dj djVar = e5Var.t0;
                if (djVar != null && size3 >= 0 && size3 < arrayList3.size() && (d = djVar.d((org.telegram.messenger.ij) arrayList3.get(size3))) != null && d.a != d.b && (b12 = d.c) == d.d && b12 != 0) {
                    int size4 = djVar.e.size();
                    for (int i12 = 0; i12 < size4; i12++) {
                        org.telegram.messenger.aj ajVar3 = (org.telegram.messenger.aj) djVar.e.get(i12);
                        if (ajVar3 != d) {
                            byte b17 = ajVar3.c;
                            byte b18 = d.c;
                            if (b17 <= b18 && ajVar3.d >= b18) {
                                break;
                            }
                        }
                    }
                }
                break;
        }
        return false;
    }

    @Override // v4.t
    public final boolean C1(View view) {
        switch (this.S) {
            case 0:
                return false;
            case 1:
                if (view instanceof org.telegram.ui.Cells.q1) {
                    return !((org.telegram.ui.Cells.q1) view).getMessageObject().Q3();
                }
                return false;
            default:
                if (view instanceof org.telegram.ui.Cells.q1) {
                    return !((org.telegram.ui.Cells.q1) view).getMessageObject().Q3();
                }
                return false;
        }
    }

    @Override // v4.s, v4.b0, v4.n0
    public void b0(v4.v0 v0Var, v4.a1 a1Var) {
        switch (this.S) {
            case 0:
                boolean z9 = org.telegram.messenger.r2.a;
                try {
                    super.b0(v0Var, a1Var);
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    org.telegram.messenger.g0.h3(new gp(this, 26));
                    return;
                }
            default:
                super.b0(v0Var, a1Var);
                break;
        }
    }

    @Override // v4.b0, v4.n0
    public int j(v4.a1 a1Var) {
        switch (this.S) {
            case 1:
                return B0(a1Var);
            default:
                return super.j(a1Var);
        }
    }

    @Override // v4.s, v4.b0, v4.n0
    public int k(v4.a1 a1Var) {
        switch (this.S) {
            case 1:
                return C0(a1Var);
            default:
                return super.k(a1Var);
        }
    }

    @Override // v4.s, v4.b0, v4.n0
    public int l(v4.a1 a1Var) {
        switch (this.S) {
            case 1:
                return D0(a1Var);
            default:
                return super.l(a1Var);
        }
    }

    @Override // v4.s, v4.b0, v4.n0
    public boolean y0() {
        switch (this.S) {
            case 1:
                return true;
            case 2:
                return false;
            default:
                return super.y0();
        }
    }
}
