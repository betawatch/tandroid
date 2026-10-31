package org.telegram.ui.Components;

import android.util.SparseIntArray;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class yy extends s4.r {
    public final boolean Q;
    public final SparseIntArray R;
    public final SparseIntArray S;
    public int T;
    public int U;
    public int V;
    public int W;

    public yy(int i10, boolean z10) {
        super(i10);
        this.R = new SparseIntArray();
        this.S = new SparseIntArray();
        this.Q = z10;
    }

    public static pu0 C1(pu0 pu0Var) {
        if (pu0Var == null) {
            return null;
        }
        if (pu0Var.a == 0.0f) {
            pu0Var.a = 100.0f;
        }
        if (pu0Var.b == 0.0f) {
            pu0Var.b = 100.0f;
        }
        float f7 = pu0Var.a;
        float f10 = pu0Var.b;
        float f11 = f7 / f10;
        if (f11 <= 4.0f && f11 >= 0.2f) {
            return pu0Var;
        }
        float max = Math.max(f7, f10);
        pu0Var.a = max;
        pu0Var.b = max;
        return pu0Var;
    }

    public final void B1() {
        int i10;
        int min;
        boolean z10;
        float f7;
        SparseIntArray sparseIntArray = this.R;
        if (sparseIntArray.size() == A() && this.W == this.m && this.T == this.J) {
            return;
        }
        int i11 = this.m;
        this.W = i11;
        float f10 = i11;
        if (f10 == 0.0f) {
            f10 = 100.0f;
        }
        sparseIntArray.clear();
        SparseIntArray sparseIntArray2 = this.S;
        sparseIntArray2.clear();
        boolean z11 = false;
        this.V = 0;
        this.U = 0;
        int A = A();
        this.T = A;
        if (A == 0) {
            return;
        }
        int L = org.telegram.messenger.i0.L(100.0f);
        int i12 = this.J;
        boolean z12 = this.Q;
        int i13 = A + (z12 ? 1 : 0);
        int i14 = 0;
        int i15 = 0;
        int i16 = i12;
        while (i14 < i13) {
            pu0 C1 = i14 < A ? C1(D1(i14)) : null;
            if (C1 == null) {
                z10 = i15 != 0 ? true : z11;
                i10 = L;
                min = i12;
            } else {
                i10 = L;
                min = Math.min(i12, (int) Math.floor((((C1.a / C1.b) * L) / f10) * i12));
                boolean z13 = i16 < min || (min > 33 && i16 < min + (-15));
                if (C1.c) {
                    sparseIntArray.put(i14, i16);
                    this.V++;
                    f7 = f10;
                    i16 = i12;
                    i15 = 0;
                    i14++;
                    L = i10;
                    f10 = f7;
                    z11 = false;
                } else {
                    z10 = z13;
                }
            }
            if (z10) {
                if (i16 == 0 || i15 == 0) {
                    f7 = f10;
                } else {
                    int i17 = i16 / i15;
                    int i18 = i14 - i15;
                    f7 = f10;
                    int i19 = i18;
                    while (true) {
                        int i20 = i18 + i15;
                        if (i19 >= i20) {
                            break;
                        }
                        if (i19 == i20 - 1) {
                            sparseIntArray.put(i19, sparseIntArray.get(i19) + i16);
                        } else {
                            sparseIntArray.put(i19, sparseIntArray.get(i19) + i17);
                        }
                        i16 -= i17;
                        i19++;
                    }
                    sparseIntArray2.put(i14 - 1, this.V);
                }
                if (i14 == A) {
                    break;
                }
                this.V++;
                i16 = i12;
                i15 = 0;
            } else {
                f7 = f10;
                if (i16 < min) {
                    min = i16;
                }
            }
            if (this.V == 0) {
                this.U = Math.max(this.U, i14);
            }
            if (i14 == A - 1 && !z12) {
                sparseIntArray2.put(i14, this.V);
            }
            i15++;
            i16 -= min;
            sparseIntArray.put(i14, min);
            i14++;
            L = i10;
            f10 = f7;
            z11 = false;
        }
        this.V++;
    }

    public pu0 D1(int i10) {
        return new pu0(100.0f, 100.0f);
    }

    public final boolean E1(int i10) {
        B1();
        return this.S.get(i10, ConnectionsManager.DEFAULT_DATACENTER_ID) != Integer.MAX_VALUE;
    }

    @Override // s4.r, s4.n0
    public final int I(hf.e eVar, s4.z0 z0Var) {
        return z0Var.b();
    }

    @Override // s4.r, s4.n0
    public final int u(hf.e eVar, s4.z0 z0Var) {
        return 1;
    }

    @Override // s4.r, s4.a0, s4.n0
    public boolean y0() {
        return false;
    }
}
