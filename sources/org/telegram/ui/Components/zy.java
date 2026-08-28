package org.telegram.ui.Components;

import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class zy extends f2.y {
    public final boolean Q;
    public final SparseIntArray R;
    public final SparseIntArray S;
    public int T;
    public int U;
    public int V;
    public int W;

    public zy(int i9, boolean z10) {
        super(i9);
        this.R = new SparseIntArray();
        this.S = new SparseIntArray();
        this.Q = z10;
    }

    public static qu0 C1(qu0 qu0Var) {
        if (qu0Var == null) {
            return null;
        }
        if (qu0Var.a == 0.0f) {
            qu0Var.a = 100.0f;
        }
        if (qu0Var.b == 0.0f) {
            qu0Var.b = 100.0f;
        }
        float f10 = qu0Var.a;
        float f11 = qu0Var.b;
        float f12 = f10 / f11;
        if (f12 <= 4.0f && f12 >= 0.2f) {
            return qu0Var;
        }
        float max = Math.max(f10, f11);
        qu0Var.a = max;
        qu0Var.b = max;
        return qu0Var;
    }

    public final void B1() {
        int i9;
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
        this.V = 0;
        this.U = 0;
        int A = A();
        this.T = A;
        if (A == 0) {
            return;
        }
        int dp = AndroidUtilities.dp(100.0f);
        int i11 = this.J;
        boolean z11 = this.Q;
        int i12 = A + (z11 ? 1 : 0);
        int i13 = i11;
        int i14 = 0;
        int i15 = 0;
        while (i14 < i12) {
            qu0 C1 = i14 < A ? C1(D1(i14)) : null;
            if (C1 == null) {
                z10 = i15 != 0;
                i9 = dp;
                min = i11;
            } else {
                i9 = dp;
                min = Math.min(i11, (int) Math.floor((((C1.a / C1.b) * dp) / f11) * i11));
                boolean z12 = i13 < min || (min > 33 && i13 < min + (-15));
                if (C1.c) {
                    sparseIntArray.put(i14, i13);
                    this.V++;
                    f10 = f11;
                    i13 = i11;
                    i15 = 0;
                    i14++;
                    dp = i9;
                    f11 = f10;
                } else {
                    z10 = z12;
                }
            }
            if (z10) {
                if (i13 == 0 || i15 == 0) {
                    f10 = f11;
                } else {
                    int i16 = i13 / i15;
                    int i17 = i14 - i15;
                    f10 = f11;
                    int i18 = i17;
                    while (true) {
                        int i19 = i17 + i15;
                        if (i18 >= i19) {
                            break;
                        }
                        if (i18 == i19 - 1) {
                            sparseIntArray.put(i18, sparseIntArray.get(i18) + i13);
                        } else {
                            sparseIntArray.put(i18, sparseIntArray.get(i18) + i16);
                        }
                        i13 -= i16;
                        i18++;
                    }
                    sparseIntArray2.put(i14 - 1, this.V);
                }
                if (i14 == A) {
                    break;
                }
                this.V++;
                i13 = i11;
                i15 = 0;
            } else {
                f10 = f11;
                if (i13 < min) {
                    min = i13;
                }
            }
            if (this.V == 0) {
                this.U = Math.max(this.U, i14);
            }
            if (i14 == A - 1 && !z11) {
                sparseIntArray2.put(i14, this.V);
            }
            i15++;
            i13 -= min;
            sparseIntArray.put(i14, min);
            i14++;
            dp = i9;
            f11 = f10;
        }
        this.V++;
    }

    public qu0 D1(int i9) {
        return new qu0(100.0f, 100.0f);
    }

    public final boolean E1(int i9) {
        B1();
        return this.S.get(i9, ConnectionsManager.DEFAULT_DATACENTER_ID) != Integer.MAX_VALUE;
    }

    @Override // f2.y, f2.z0
    public final int I(f2.g1 g1Var, f2.n1 n1Var) {
        return n1Var.b();
    }

    @Override // f2.y, f2.z0
    public final int u(f2.g1 g1Var, f2.n1 n1Var) {
        return 1;
    }

    @Override // f2.y, f2.m0, f2.z0
    public boolean y0() {
        return false;
    }
}
