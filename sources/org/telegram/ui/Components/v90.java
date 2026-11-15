package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class v90 extends v4.t {
    public final /* synthetic */ int S;
    public final /* synthetic */ KeyEvent.Callback T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v90(KeyEvent.Callback callback, int i7) {
        super(true);
        this.S = i7;
        this.T = callback;
    }

    @Override // v4.t
    public final boolean B1(int i7) {
        byte b10;
        byte b11;
        org.telegram.messenger.yi d;
        byte b12;
        switch (this.S) {
            case 0:
                da0 da0Var = (da0) this.T;
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) da0Var.r.f.get(i7);
                org.telegram.messenger.bj a10 = da0.a(da0Var, gjVar);
                if (a10 != null) {
                    ArrayList arrayList = a10.e;
                    org.telegram.messenger.yi d2 = a10.d(gjVar);
                    if (d2.a != d2.b && (b10 = d2.c) == d2.d && b10 != 0) {
                        int size = arrayList.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            org.telegram.messenger.yi yiVar = (org.telegram.messenger.yi) arrayList.get(i10);
                            if (yiVar != d2) {
                                byte b13 = yiVar.c;
                                byte b14 = d2.c;
                                if (b13 <= b14 && yiVar.d >= b14) {
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
                org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) bg0Var.N.get((B() - 1) - i7);
                org.telegram.messenger.bj l10 = bg0Var.l(gjVar2);
                if (l10 != null) {
                    ArrayList arrayList2 = l10.e;
                    org.telegram.messenger.yi d10 = l10.d(gjVar2);
                    if (d10.a != d10.b && (b11 = d10.c) == d10.d && b11 != 0) {
                        int size2 = arrayList2.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            org.telegram.messenger.yi yiVar2 = (org.telegram.messenger.yi) arrayList2.get(i11);
                            if (yiVar2 != d10) {
                                byte b15 = yiVar2.c;
                                byte b16 = d10.c;
                                if (b15 <= b16 && yiVar2.d >= b16) {
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                hi.c5 c5Var = (hi.c5) this.T;
                ArrayList arrayList3 = c5Var.t0;
                int size3 = (arrayList3.size() - 1) - i7;
                org.telegram.messenger.bj bjVar = c5Var.u0;
                if (bjVar != null && size3 >= 0 && size3 < arrayList3.size() && (d = bjVar.d((org.telegram.messenger.gj) arrayList3.get(size3))) != null && d.a != d.b && (b12 = d.c) == d.d && b12 != 0) {
                    int size4 = bjVar.e.size();
                    for (int i12 = 0; i12 < size4; i12++) {
                        org.telegram.messenger.yi yiVar3 = (org.telegram.messenger.yi) bjVar.e.get(i12);
                        if (yiVar3 != d) {
                            byte b17 = yiVar3.c;
                            byte b18 = d.c;
                            if (b17 <= b18 && yiVar3.d >= b18) {
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
                    return !((org.telegram.ui.Cells.q1) view).getMessageObject().P3();
                }
                return false;
            default:
                if (view instanceof org.telegram.ui.Cells.q1) {
                    return !((org.telegram.ui.Cells.q1) view).getMessageObject().P3();
                }
                return false;
        }
    }

    @Override // v4.s, v4.b0, v4.o0
    public void b0(v4.w0 w0Var, v4.b1 b1Var) {
        switch (this.S) {
            case 0:
                boolean z10 = org.telegram.messenger.r2.a;
                try {
                    super.b0(w0Var, b1Var);
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    org.telegram.messenger.g0.h3(new fo(this, 28));
                    return;
                }
            default:
                super.b0(w0Var, b1Var);
                break;
        }
    }

    @Override // v4.b0, v4.o0
    public int j(v4.b1 b1Var) {
        switch (this.S) {
            case 1:
                return B0(b1Var);
            default:
                return super.j(b1Var);
        }
    }

    @Override // v4.s, v4.b0, v4.o0
    public int k(v4.b1 b1Var) {
        switch (this.S) {
            case 1:
                return C0(b1Var);
            default:
                return super.k(b1Var);
        }
    }

    @Override // v4.s, v4.b0, v4.o0
    public int l(v4.b1 b1Var) {
        switch (this.S) {
            case 1:
                return D0(b1Var);
            default:
                return super.l(b1Var);
        }
    }

    @Override // v4.s, v4.b0, v4.o0
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
