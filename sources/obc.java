// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class obc extends nbc {
    public m08[] a;
    public String b;
    public int c;

    public obc(obc obcVar) {
        this.a = null;
        this.c = 0;
        this.b = obcVar.b;
        this.a = pse.e(obcVar.a);
    }

    public m08[] getPathData() {
        return this.a;
    }

    public String getPathName() {
        return this.b;
    }

    public void setPathData(m08[] m08VarArr) {
        if (!pse.a(this.a, m08VarArr)) {
            this.a = pse.e(m08VarArr);
            return;
        }
        m08[] m08VarArr2 = this.a;
        for (int i = 0; i < m08VarArr.length; i++) {
            m08VarArr2[i].a = m08VarArr[i].a;
            int i2 = 0;
            while (true) {
                float[] fArr = m08VarArr[i].b;
                if (i2 < fArr.length) {
                    m08VarArr2[i].b[i2] = fArr[i2];
                    i2++;
                }
            }
        }
    }

    public obc() {
        this.a = null;
        this.c = 0;
    }
}
