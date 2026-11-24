// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class h81 extends ka {
    public final byte d;
    public final ArrayList e = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    public h81(int i) {
        this.d = i;
    }

    public abstract void F();

    @Override // y59
    public final int b() {
        return this.e.size();
    }

    @Override // y59
    public final int d(int i) {
        return ((p81) this.e.get(i)).a;
    }
}
