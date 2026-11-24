// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
