// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class o45 extends yo {
    public final /* synthetic */ h75 c;

    public o45(h75 h75Var) {
        this.c = h75Var;
    }

    @Override // yo
    public final int i(int i) {
        int size = this.c.g4.e.size();
        if (size <= 1 || size == 2) {
            return 6;
        }
        return (size != 3 || i == 0 || i == 1) ? 3 : 6;
    }
}
