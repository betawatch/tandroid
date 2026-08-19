package j$.util.stream;

import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public abstract class G implements z3 {
    public boolean a;
    public Object b;

    @Override // j$.util.stream.f2
    public /* synthetic */ void accept(double d) {
        q1.a();
        throw null;
    }

    @Override // j$.util.stream.f2
    public /* synthetic */ void accept(int i) {
        q1.k();
        throw null;
    }

    @Override // j$.util.stream.f2
    public /* synthetic */ void accept(long j) {
        q1.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ void x() {
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ void y(long j) {
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void s(Object obj) {
        if (this.a) {
            return;
        }
        this.a = true;
        this.b = obj;
    }

    @Override // j$.util.stream.f2
    public final boolean C() {
        return this.a;
    }
}
