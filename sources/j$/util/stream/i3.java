package j$.util.stream;

import j$.util.Spliterator;
import java.util.Deque;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public abstract class i3 extends k3 implements j$.util.d1 {
    @Override // j$.util.d1
    public final void forEachRemaining(Object obj) {
        if (this.a == null) {
            return;
        }
        if (this.d != null) {
            while (tryAdvance(obj)) {
            }
            return;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            ((j$.util.d1) spliterator).forEachRemaining(obj);
            return;
        }
        Deque b = b();
        while (true) {
            g2 g2Var = (g2) k3.a(b);
            if (g2Var == null) {
                this.a = null;
                return;
            }
            g2Var.d(obj);
        }
    }

    @Override // j$.util.d1
    public final boolean tryAdvance(Object obj) {
        g2 g2Var;
        if (!c()) {
            return false;
        }
        boolean tryAdvance = ((j$.util.d1) this.d).tryAdvance(obj);
        if (!tryAdvance) {
            if (this.c == null && (g2Var = (g2) k3.a(this.e)) != null) {
                j$.util.d1 spliterator = g2Var.spliterator();
                this.d = spliterator;
                return spliterator.tryAdvance(obj);
            }
            this.a = null;
        }
        return tryAdvance;
    }

    public final /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public final /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public final /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public final /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public final /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    public final /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }
}
