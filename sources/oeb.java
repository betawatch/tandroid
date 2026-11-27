// default package

import java.util.List;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class oeb extends u93 implements heb {
    public heb a;
    public long b;

    @Override // heb
    public final int b(long j) {
        heb hebVar = this.a;
        hebVar.getClass();
        return hebVar.b(j - this.b);
    }

    @Override // u93, w01
    public final void clear() {
        super.clear();
        this.a = null;
    }

    @Override // heb
    public final long i(int i) {
        heb hebVar = this.a;
        hebVar.getClass();
        return hebVar.i(i) + this.b;
    }

    @Override // heb
    public final List l(long j) {
        heb hebVar = this.a;
        hebVar.getClass();
        return hebVar.l(j - this.b);
    }

    @Override // heb
    public final int q() {
        heb hebVar = this.a;
        hebVar.getClass();
        return hebVar.q();
    }
}
