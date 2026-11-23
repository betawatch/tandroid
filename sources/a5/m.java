package a5;

import c8.m0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public abstract class m extends l {
    public i0.d[] a;
    public String b;
    public int c;

    public m() {
        this.a = null;
        this.c = 0;
    }

    public i0.d[] getPathData() {
        return this.a;
    }

    public String getPathName() {
        return this.b;
    }

    public void setPathData(i0.d[] dVarArr) {
        if (!m0.a(this.a, dVarArr)) {
            this.a = m0.e(dVarArr);
            return;
        }
        i0.d[] dVarArr2 = this.a;
        for (int i7 = 0; i7 < dVarArr.length; i7++) {
            dVarArr2[i7].a = dVarArr[i7].a;
            int i10 = 0;
            while (true) {
                float[] fArr = dVarArr[i7].b;
                if (i10 < fArr.length) {
                    dVarArr2[i7].b[i10] = fArr[i10];
                    i10++;
                }
            }
        }
    }

    public m(m mVar) {
        this.a = null;
        this.c = 0;
        this.b = mVar.b;
        this.a = m0.e(mVar.a);
    }
}
