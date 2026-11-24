// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class j9f {
    public Object a;
    public jgf b;
    public gif c;
    public boolean d;

    public final void a(Object obj) {
        this.d = true;
        jgf jgfVar = this.b;
        if (jgfVar != null) {
            vef vefVar = jgfVar.b;
            vefVar.getClass();
            if (obj == null) {
                obj = a7f.h;
            }
            if (a7f.f.d(vefVar, null, obj)) {
                a7f.d(vefVar);
                this.a = null;
                this.b = null;
                this.c = null;
            }
        }
    }

    public final void finalize() {
        gif gifVar;
        jgf jgfVar = this.b;
        if (jgfVar != null) {
            vef vefVar = jgfVar.b;
            if (!vefVar.isDone()) {
                if (a7f.f.d(vefVar, null, new c8e(new i2("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.a)), (byte) 4)))) {
                    a7f.d(vefVar);
                }
            }
        }
        if (this.d || (gifVar = this.c) == null) {
            return;
        }
        gifVar.i(null);
    }
}
