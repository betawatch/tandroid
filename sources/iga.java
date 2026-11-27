// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class iga extends zo {
    public final /* synthetic */ gga c;
    public final /* synthetic */ eja d;

    public iga(eja ejaVar, gga ggaVar) {
        this.d = ejaVar;
        this.c = ggaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r4.getAdapter().d(r9) != 2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0020, code lost:
    
        if (r4.d(r9) == 2) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003c, code lost:
    
        r1 = 1;
     */
    @Override // zo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(int i) {
        eja ejaVar = this.d;
        int[] iArr = ejaVar.p1;
        uha uhaVar = ejaVar.R;
        gga ggaVar = this.c;
        int i2 = iArr[eja.j0(ggaVar.F) ? 1 : 0];
        j79 adapter = ggaVar.h.getAdapter();
        lha lhaVar = ejaVar.K;
        if (adapter != lhaVar) {
            int x1 = ejaVar.x1(ggaVar.h.getAdapter());
            jga jgaVar = ggaVar.h;
            if (x1 == -1) {
                if (jgaVar.getAdapter() != uhaVar) {
                    i2 = ggaVar.x.J;
                } else if (ggaVar.h.getAdapter() == uhaVar && ejaVar.w1[5].a.isEmpty()) {
                    i2 = ggaVar.x.J;
                } else {
                    hga hgaVar = ggaVar.x;
                    hgaVar.z1();
                    i2 = hgaVar.R.get(i);
                }
            }
        }
        return Math.min(i2, ggaVar.x.J);
    }
}
