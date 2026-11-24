// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
