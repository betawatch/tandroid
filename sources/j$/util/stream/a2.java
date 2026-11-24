package j$.util.stream;

import java.util.function.DoubleConsumer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a2 implements DoubleConsumer {
    public final /* synthetic */ byte a;

    public /* synthetic */ a2(byte b) {
        this.a = b;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        byte b = this.a;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (this.a) {
        }
        return j$.time.a.b(this, doubleConsumer);
    }

    private final void accept$j$$util$stream$Node$OfDouble$0(double d) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfDouble$0(double d) {
    }
}
