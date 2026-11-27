// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract class i71 extends la {
    public final byte d;
    public final ArrayList e = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    public i71(int i) {
        this.d = i;
    }

    public abstract void F();

    @Override // j79
    public final int b() {
        return this.e.size();
    }

    @Override // j79
    public final int d(int i) {
        return ((p71) this.e.get(i)).a;
    }
}
