// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class hx3 extends u0b {
    public final /* synthetic */ boolean H3;
    public final /* synthetic */ ix3 I3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx3(ix3 ix3Var, Context context, int i, ylb ylbVar, boolean z) {
        super(i, ylbVar, context);
        this.I3 = ix3Var;
        this.H3 = z;
    }

    @Override // u0b
    public final r0b[] E1(r0b[] r0bVarArr) {
        if (r0bVarArr != null && this.H3) {
            int i = 0;
            while (true) {
                if (i >= r0bVarArr.length) {
                    i = -1;
                    break;
                }
                r0b r0bVar = r0bVarArr[i];
                if (r0bVar != null && r0bVar.b) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                int length = r0bVarArr.length;
                r0b[] r0bVarArr2 = new r0b[length];
                r0bVarArr2[0] = r0bVarArr[i];
                int i2 = 1;
                while (i2 < length) {
                    r0bVarArr2[i2] = r0bVarArr[i2 <= i ? i2 - 1 : i2];
                    i2++;
                }
                return r0bVarArr2;
            }
        }
        return r0bVarArr;
    }

    @Override // u0b
    public final void H1(int i) {
        super.H1(i);
        this.I3.d(false);
    }
}
