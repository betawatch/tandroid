// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
