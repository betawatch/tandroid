package k2;

import f7.i8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class l extends k {
    public i0.d[] a;
    public String b;
    public int c;

    public l() {
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
        if (!i8.a(this.a, dVarArr)) {
            this.a = i8.e(dVarArr);
            return;
        }
        i0.d[] dVarArr2 = this.a;
        for (int i9 = 0; i9 < dVarArr.length; i9++) {
            dVarArr2[i9].a = dVarArr[i9].a;
            int i10 = 0;
            while (true) {
                float[] fArr = dVarArr[i9].b;
                if (i10 < fArr.length) {
                    dVarArr2[i9].b[i10] = fArr[i10];
                    i10++;
                }
            }
        }
    }

    public l(l lVar) {
        this.a = null;
        this.c = 0;
        this.b = lVar.b;
        this.a = i8.e(lVar.a);
    }
}
