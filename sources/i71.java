// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
