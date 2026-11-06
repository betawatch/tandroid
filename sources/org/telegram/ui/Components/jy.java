package org.telegram.ui.Components;

import android.util.SparseIntArray;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public class jy extends v4.s {
    public final boolean Q;
    public final SparseIntArray R;
    public final SparseIntArray S;
    public int T;
    public int U;
    public int V;
    public int W;

    public jy(int i7, boolean z9) {
        super(i7);
        this.R = new SparseIntArray();
        this.S = new SparseIntArray();
        this.Q = z9;
    }

    public static mt0 C1(mt0 mt0Var) {
        if (mt0Var == null) {
            return null;
        }
        if (mt0Var.a == 0.0f) {
            mt0Var.a = 100.0f;
        }
        if (mt0Var.b == 0.0f) {
            mt0Var.b = 100.0f;
        }
        float f10 = mt0Var.a;
        float f11 = mt0Var.b;
        float f12 = f10 / f11;
        if (f12 <= 4.0f && f12 >= 0.2f) {
            return mt0Var;
        }
        float max = Math.max(f10, f11);
        mt0Var.a = max;
        mt0Var.b = max;
        return mt0Var;
    }

    public final void B1() {
        int i7;
        int min;
        boolean z9;
        float f10;
        SparseIntArray sparseIntArray = this.R;
        if (sparseIntArray.size() == A() && this.W == this.m && this.T == this.J) {
            return;
        }
        int i10 = this.m;
        this.W = i10;
        float f11 = i10;
        if (f11 == 0.0f) {
            f11 = 100.0f;
        }
        sparseIntArray.clear();
        SparseIntArray sparseIntArray2 = this.S;
        sparseIntArray2.clear();
        boolean z10 = false;
        this.V = 0;
        this.U = 0;
        int A = A();
        this.T = A;
        if (A == 0) {
            return;
        }
        int L = org.telegram.messenger.g0.L(100.0f);
        int i11 = this.J;
        boolean z11 = this.Q;
        int i12 = A + (z11 ? 1 : 0);
        int i13 = 0;
        int i14 = 0;
        int i15 = i11;
        while (i13 < i12) {
            mt0 C1 = i13 < A ? C1(D1(i13)) : null;
            if (C1 == null) {
                z9 = i14 != 0 ? true : z10;
                i7 = L;
                min = i11;
            } else {
                i7 = L;
                min = Math.min(i11, (int) Math.floor((((C1.a / C1.b) * L) / f11) * i11));
                boolean z12 = i15 < min || (min > 33 && i15 < min + (-15));
                if (C1.c) {
                    sparseIntArray.put(i13, i15);
                    this.V++;
                    f10 = f11;
                    i15 = i11;
                    i14 = 0;
                    i13++;
                    L = i7;
                    f11 = f10;
                    z10 = false;
                } else {
                    z9 = z12;
                }
            }
            if (z9) {
                if (i15 == 0 || i14 == 0) {
                    f10 = f11;
                } else {
                    int i16 = i15 / i14;
                    int i17 = i13 - i14;
                    f10 = f11;
                    int i18 = i17;
                    while (true) {
                        int i19 = i17 + i14;
                        if (i18 >= i19) {
                            break;
                        }
                        if (i18 == i19 - 1) {
                            sparseIntArray.put(i18, sparseIntArray.get(i18) + i15);
                        } else {
                            sparseIntArray.put(i18, sparseIntArray.get(i18) + i16);
                        }
                        i15 -= i16;
                        i18++;
                    }
                    sparseIntArray2.put(i13 - 1, this.V);
                }
                if (i13 == A) {
                    break;
                }
                this.V++;
                i15 = i11;
                i14 = 0;
            } else {
                f10 = f11;
                if (i15 < min) {
                    min = i15;
                }
            }
            if (this.V == 0) {
                this.U = Math.max(this.U, i13);
            }
            if (i13 == A - 1 && !z11) {
                sparseIntArray2.put(i13, this.V);
            }
            i14++;
            i15 -= min;
            sparseIntArray.put(i13, min);
            i13++;
            L = i7;
            f11 = f10;
            z10 = false;
        }
        this.V++;
    }

    public mt0 D1(int i7) {
        return new mt0(100.0f, 100.0f);
    }

    public final boolean E1(int i7) {
        B1();
        return this.S.get(i7, ConnectionsManager.DEFAULT_DATACENTER_ID) != Integer.MAX_VALUE;
    }

    @Override // v4.s, v4.n0
    public final int I(v4.v0 v0Var, v4.a1 a1Var) {
        return a1Var.b();
    }

    @Override // v4.s, v4.n0
    public final int u(v4.v0 v0Var, v4.a1 a1Var) {
        return 1;
    }

    @Override // v4.s, v4.b0, v4.n0
    public boolean y0() {
        return false;
    }
}
