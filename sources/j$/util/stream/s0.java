package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public abstract class s0 implements h8, i8 {
    public final boolean a;

    public s0(boolean z) {
        this.a = z;
    }

    public /* synthetic */ void accept(double d) {
        w3.d();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.h8
    public final int c() {
        if (this.a) {
            return 0;
        }
        return b7.r;
    }

    public final void d(a aVar, Spliterator spliterator) {
        if (this.a) {
            new t0(aVar, spliterator, this).invoke();
        } else {
            new u0(aVar, spliterator, aVar.R(this)).invoke();
        }
    }

    @Override // j$.util.stream.n5
    public final boolean q() {
        return false;
    }

    public /* synthetic */ void accept(int i) {
        w3.k();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        w3.l();
        throw null;
    }

    @Override // j$.util.stream.n5
    public final void n(long j) {
    }

    @Override // j$.util.stream.n5
    public final void end() {
    }
}
