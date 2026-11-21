package ai;

import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class g {
    public final String a;
    public final long b;
    public final TL_aicompose.AiComposeTone c;
    public final boolean d;

    public g(String str, long j3, TL_aicompose.AiComposeTone aiComposeTone, boolean z10) {
        this.a = str;
        this.b = j3;
        this.c = aiComposeTone;
        this.d = z10;
    }

    public final String a() {
        return this.d ? gd.N0(2131745060, null) : this.a;
    }
}
