// default package

import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
