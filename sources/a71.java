// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class a71 extends ka {
    public final byte d;
    public final ArrayList e = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    public a71(int i) {
        this.d = i;
    }

    public abstract void F();

    @Override // w39
    public final int b() {
        return this.e.size();
    }

    @Override // w39
    public final int d(int i) {
        return ((h71) this.e.get(i)).a;
    }
}
