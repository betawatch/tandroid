package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class fa0 extends v4.u {
    public final /* synthetic */ int S;
    public final /* synthetic */ KeyEvent.Callback T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fa0(KeyEvent.Callback callback, int i7) {
        super(true);
        this.S = i7;
        this.T = callback;
    }

    @Override // v4.u
    public final boolean B1(int i7) {
        byte b10;
        byte b11;
        org.telegram.messenger.xi d;
        byte b12;
        switch (this.S) {
            case 0:
                na0 na0Var = (na0) this.T;
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) na0Var.r.f.get(i7);
                org.telegram.messenger.aj a10 = na0.a(na0Var, fjVar);
                if (a10 != null) {
                    ArrayList arrayList = a10.e;
                    org.telegram.messenger.xi d2 = a10.d(fjVar);
                    if (d2.a != d2.b && (b10 = d2.c) == d2.d && b10 != 0) {
                        int size = arrayList.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            org.telegram.messenger.xi xiVar = (org.telegram.messenger.xi) arrayList.get(i10);
                            if (xiVar != d2) {
                                byte b13 = xiVar.c;
                                byte b14 = d2.c;
                                if (b13 <= b14 && xiVar.d >= b14) {
                                    break;
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.dg0 dg0Var = (org.telegram.ui.dg0) this.T;
                org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) dg0Var.N.get((B() - 1) - i7);
                org.telegram.messenger.aj l10 = dg0Var.l(fjVar2);
                if (l10 != null) {
                    ArrayList arrayList2 = l10.e;
                    org.telegram.messenger.xi d10 = l10.d(fjVar2);
                    if (d10.a != d10.b && (b11 = d10.c) == d10.d && b11 != 0) {
                        int size2 = arrayList2.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            org.telegram.messenger.xi xiVar2 = (org.telegram.messenger.xi) arrayList2.get(i11);
                            if (xiVar2 != d10) {
                                byte b15 = xiVar2.c;
                                byte b16 = d10.c;
                                if (b15 <= b16 && xiVar2.d >= b16) {
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                hi.l5 l5Var = (hi.l5) this.T;
                ArrayList arrayList3 = l5Var.u0;
                int size3 = (arrayList3.size() - 1) - i7;
                org.telegram.messenger.aj ajVar = l5Var.v0;
                if (ajVar != null && size3 >= 0 && size3 < arrayList3.size() && (d = ajVar.d((org.telegram.messenger.fj) arrayList3.get(size3))) != null && d.a != d.b && (b12 = d.c) == d.d && b12 != 0) {
                    int size4 = ajVar.e.size();
                    for (int i12 = 0; i12 < size4; i12++) {
                        org.telegram.messenger.xi xiVar3 = (org.telegram.messenger.xi) ajVar.e.get(i12);
                        if (xiVar3 != d) {
                            byte b17 = xiVar3.c;
                            byte b18 = d.c;
                            if (b17 <= b18 && xiVar3.d >= b18) {
                                break;
                            }
                        }
                    }
                }
                break;
        }
        return false;
    }

    @Override // v4.u
    public final boolean C1(View view) {
        switch (this.S) {
            case 0:
                return false;
            case 1:
                if (view instanceof org.telegram.ui.Cells.r1) {
                    return !((org.telegram.ui.Cells.r1) view).getMessageObject().P3();
                }
                return false;
            default:
                if (view instanceof org.telegram.ui.Cells.r1) {
                    return !((org.telegram.ui.Cells.r1) view).getMessageObject().P3();
                }
                return false;
        }
    }

    @Override // v4.t, v4.c0, v4.p0
    public void b0(v4.x0 x0Var, v4.c1 c1Var) {
        switch (this.S) {
            case 0:
                boolean z10 = org.telegram.messenger.s2.a;
                try {
                    super.b0(x0Var, c1Var);
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    org.telegram.messenger.g0.g3(new lo(this, 28));
                    return;
                }
            default:
                super.b0(x0Var, c1Var);
                break;
        }
    }

    @Override // v4.c0, v4.p0
    public int j(v4.c1 c1Var) {
        switch (this.S) {
            case 1:
                return B0(c1Var);
            default:
                return super.j(c1Var);
        }
    }

    @Override // v4.t, v4.c0, v4.p0
    public int k(v4.c1 c1Var) {
        switch (this.S) {
            case 1:
                return C0(c1Var);
            default:
                return super.k(c1Var);
        }
    }

    @Override // v4.t, v4.c0, v4.p0
    public int l(v4.c1 c1Var) {
        switch (this.S) {
            case 1:
                return D0(c1Var);
            default:
                return super.l(c1Var);
        }
    }

    @Override // v4.t, v4.c0, v4.p0
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
