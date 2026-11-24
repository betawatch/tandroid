// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class hw7 implements fw2 {
    public final /* synthetic */ wm1 a;

    public hw7(wm1 wm1Var) {
        this.a = wm1Var;
    }

    @Override // fw2
    public final sw2 getContext() {
        return z14.a;
    }

    @Override // fw2
    public final void resumeWith(Object obj) {
        boolean z = obj instanceof sa9;
        wm1 wm1Var = this.a;
        if (z) {
            wm1Var.a(null, ((sa9) obj).a);
        } else {
            wm1Var.a(obj, null);
        }
    }
}
