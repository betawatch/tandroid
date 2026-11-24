// default package

import android.content.Context;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class b83 extends r51 {
    public final /* synthetic */ c83 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b83(c83 c83Var, Context context, int i, int[] iArr, int[] iArr2) {
        super(context, i, iArr, 1, iArr2);
        this.f0 = c83Var;
    }

    @Override // r51
    public final int b() {
        return kk7.s3;
    }

    @Override // r51
    public final void c(int i, boolean z) {
        int i2;
        e83 e83Var = (e83) this.f0.e;
        if (!z) {
            e83Var.m1();
            return;
        }
        if (i < 0 || i >= e83Var.o3.length) {
            return;
        }
        int i3 = 0;
        while (true) {
            d83[] d83VarArr = e83Var.o3;
            i2 = -1;
            if (i3 >= d83VarArr.length) {
                i3 = -1;
                break;
            } else if (d83VarArr[i3].d == i) {
                break;
            } else {
                i3++;
            }
        }
        int i4 = 0;
        while (true) {
            if (i4 < e83Var.k3.size()) {
                z73 z73Var = (z73) e83Var.k3.get(i4);
                if (z73Var != null && z73Var.a == 2 && z73Var.h == i3) {
                    i2 = i4;
                    break;
                }
                i4++;
            } else {
                break;
            }
        }
        if (i2 >= 0) {
            e83Var.f1(new qf(i2, (byte) 2), 0, true);
        } else {
            e83Var.m1();
        }
    }

    @Override // r51
    public final int d() {
        return 10;
    }
}
