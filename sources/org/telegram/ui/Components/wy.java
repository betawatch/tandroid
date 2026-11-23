package org.telegram.ui.Components;

import android.util.SparseIntArray;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public class wy extends v4.t {
    public final boolean Q;
    public final SparseIntArray R;
    public final SparseIntArray S;
    public int T;
    public int U;
    public int V;
    public int W;

    public wy(int i7, boolean z10) {
        super(i7);
        this.R = new SparseIntArray();
        this.S = new SparseIntArray();
        this.Q = z10;
    }

    public static yt0 C1(yt0 yt0Var) {
        if (yt0Var == null) {
            return null;
        }
        if (yt0Var.a == 0.0f) {
            yt0Var.a = 100.0f;
        }
        if (yt0Var.b == 0.0f) {
            yt0Var.b = 100.0f;
        }
        float f10 = yt0Var.a;
        float f11 = yt0Var.b;
        float f12 = f10 / f11;
        if (f12 <= 4.0f && f12 >= 0.2f) {
            return yt0Var;
        }
        float max = Math.max(f10, f11);
        yt0Var.a = max;
        yt0Var.b = max;
        return yt0Var;
    }

    public final void B1() {
        int i7;
        int min;
        boolean z10;
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
        boolean z11 = false;
        this.V = 0;
        this.U = 0;
        int A = A();
        this.T = A;
        if (A == 0) {
            return;
        }
        int L = org.telegram.messenger.g0.L(100.0f);
        int i11 = this.J;
        boolean z12 = this.Q;
        int i12 = A + (z12 ? 1 : 0);
        int i13 = 0;
        int i14 = 0;
        int i15 = i11;
        while (i13 < i12) {
            yt0 C1 = i13 < A ? C1(D1(i13)) : null;
            if (C1 == null) {
                z10 = i14 != 0 ? true : z11;
                i7 = L;
                min = i11;
            } else {
                i7 = L;
                min = Math.min(i11, (int) Math.floor((((C1.a / C1.b) * L) / f11) * i11));
                boolean z13 = i15 < min || (min > 33 && i15 < min + (-15));
                if (C1.c) {
                    sparseIntArray.put(i13, i15);
                    this.V++;
                    f10 = f11;
                    i15 = i11;
                    i14 = 0;
                    i13++;
                    L = i7;
                    f11 = f10;
                    z11 = false;
                } else {
                    z10 = z13;
                }
            }
            if (z10) {
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
            if (i13 == A - 1 && !z12) {
                sparseIntArray2.put(i13, this.V);
            }
            i14++;
            i15 -= min;
            sparseIntArray.put(i13, min);
            i13++;
            L = i7;
            f11 = f10;
            z11 = false;
        }
        this.V++;
    }

    public yt0 D1(int i7) {
        return new yt0(100.0f, 100.0f);
    }

    public final boolean E1(int i7) {
        B1();
        return this.S.get(i7, ConnectionsManager.DEFAULT_DATACENTER_ID) != Integer.MAX_VALUE;
    }

    @Override // v4.t, v4.p0
    public final int I(v4.x0 x0Var, v4.c1 c1Var) {
        return c1Var.b();
    }

    @Override // v4.t, v4.p0
    public final int u(v4.x0 x0Var, v4.c1 c1Var) {
        return 1;
    }

    @Override // v4.t, v4.c0, v4.p0
    public boolean y0() {
        return false;
    }
}
