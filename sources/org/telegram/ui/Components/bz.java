package org.telegram.ui.Components;

import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class bz extends f2.x {
    public final boolean Q;
    public final SparseIntArray R;
    public final SparseIntArray S;
    public int T;
    public int U;
    public int V;
    public int W;

    public bz(int i10, boolean z10) {
        super(i10);
        this.R = new SparseIntArray();
        this.S = new SparseIntArray();
        this.Q = z10;
    }

    public static tu0 C1(tu0 tu0Var) {
        if (tu0Var == null) {
            return null;
        }
        if (tu0Var.a == 0.0f) {
            tu0Var.a = 100.0f;
        }
        if (tu0Var.b == 0.0f) {
            tu0Var.b = 100.0f;
        }
        float f10 = tu0Var.a;
        float f11 = tu0Var.b;
        float f12 = f10 / f11;
        if (f12 <= 4.0f && f12 >= 0.2f) {
            return tu0Var;
        }
        float max = Math.max(f10, f11);
        tu0Var.a = max;
        tu0Var.b = max;
        return tu0Var;
    }

    public final void B1() {
        int i10;
        int min;
        boolean z10;
        float f10;
        SparseIntArray sparseIntArray = this.R;
        if (sparseIntArray.size() == A() && this.W == this.m && this.T == this.J) {
            return;
        }
        int i11 = this.m;
        this.W = i11;
        float f11 = i11;
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
        int i12 = this.J;
        boolean z11 = this.Q;
        int i13 = A + (z11 ? 1 : 0);
        int i14 = i12;
        int i15 = 0;
        int i16 = 0;
        while (i15 < i13) {
            tu0 C1 = i15 < A ? C1(D1(i15)) : null;
            if (C1 == null) {
                z10 = i16 != 0;
                i10 = dp;
                min = i12;
            } else {
                i10 = dp;
                min = Math.min(i12, (int) Math.floor((((C1.a / C1.b) * dp) / f11) * i12));
                boolean z12 = i14 < min || (min > 33 && i14 < min + (-15));
                if (C1.c) {
                    sparseIntArray.put(i15, i14);
                    this.V++;
                    f10 = f11;
                    i14 = i12;
                    i16 = 0;
                    i15++;
                    dp = i10;
                    f11 = f10;
                } else {
                    z10 = z12;
                }
            }
            if (z10) {
                if (i14 == 0 || i16 == 0) {
                    f10 = f11;
                } else {
                    int i17 = i14 / i16;
                    int i18 = i15 - i16;
                    f10 = f11;
                    int i19 = i18;
                    while (true) {
                        int i20 = i18 + i16;
                        if (i19 >= i20) {
                            break;
                        }
                        if (i19 == i20 - 1) {
                            sparseIntArray.put(i19, sparseIntArray.get(i19) + i14);
                        } else {
                            sparseIntArray.put(i19, sparseIntArray.get(i19) + i17);
                        }
                        i14 -= i17;
                        i19++;
                    }
                    sparseIntArray2.put(i15 - 1, this.V);
                }
                if (i15 == A) {
                    break;
                }
                this.V++;
                i14 = i12;
                i16 = 0;
            } else {
                f10 = f11;
                if (i14 < min) {
                    min = i14;
                }
            }
            if (this.V == 0) {
                this.U = Math.max(this.U, i15);
            }
            if (i15 == A - 1 && !z11) {
                sparseIntArray2.put(i15, this.V);
            }
            i16++;
            i14 -= min;
            sparseIntArray.put(i15, min);
            i15++;
            dp = i10;
            f11 = f10;
        }
        this.V++;
    }

    public tu0 D1(int i10) {
        return new tu0(100.0f, 100.0f);
    }

    public final boolean E1(int i10) {
        B1();
        return this.S.get(i10, ConnectionsManager.DEFAULT_DATACENTER_ID) != Integer.MAX_VALUE;
    }

    @Override // f2.x, f2.x0
    public final int I(f2.e1 e1Var, f2.l1 l1Var) {
        return l1Var.b();
    }

    @Override // f2.x, f2.x0
    public final int u(f2.e1 e1Var, f2.l1 l1Var) {
        return 1;
    }

    @Override // f2.x, f2.k0, f2.x0
    public boolean y0() {
        return false;
    }
}
