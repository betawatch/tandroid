// default package

import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
