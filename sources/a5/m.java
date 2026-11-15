package a5;

import c8.j0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public abstract class m extends l {
    public i0.e[] a;
    public String b;
    public int c;

    public m() {
        this.a = null;
        this.c = 0;
    }

    public i0.e[] getPathData() {
        return this.a;
    }

    public String getPathName() {
        return this.b;
    }

    public void setPathData(i0.e[] eVarArr) {
        if (!j0.a(this.a, eVarArr)) {
            this.a = j0.e(eVarArr);
            return;
        }
        i0.e[] eVarArr2 = this.a;
        for (int i7 = 0; i7 < eVarArr.length; i7++) {
            eVarArr2[i7].a = eVarArr[i7].a;
            int i10 = 0;
            while (true) {
                float[] fArr = eVarArr[i7].b;
                if (i10 < fArr.length) {
                    eVarArr2[i7].b[i10] = fArr[i10];
                    i10++;
                }
            }
        }
    }

    public m(m mVar) {
        this.a = null;
        this.c = 0;
        this.b = mVar.b;
        this.a = j0.e(mVar.a);
    }
}
