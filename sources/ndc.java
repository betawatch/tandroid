// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class ndc extends mdc {
    public q18[] a;
    public String b;
    public int c;

    public ndc(ndc ndcVar) {
        this.a = null;
        this.c = 0;
        this.b = ndcVar.b;
        this.a = hve.e(ndcVar.a);
    }

    public q18[] getPathData() {
        return this.a;
    }

    public String getPathName() {
        return this.b;
    }

    public void setPathData(q18[] q18VarArr) {
        if (!hve.a(this.a, q18VarArr)) {
            this.a = hve.e(q18VarArr);
            return;
        }
        q18[] q18VarArr2 = this.a;
        for (int i = 0; i < q18VarArr.length; i++) {
            q18VarArr2[i].a = q18VarArr[i].a;
            int i2 = 0;
            while (true) {
                float[] fArr = q18VarArr[i].b;
                if (i2 < fArr.length) {
                    q18VarArr2[i].b[i2] = fArr[i2];
                    i2++;
                }
            }
        }
    }

    public ndc() {
        this.a = null;
        this.c = 0;
    }
}
