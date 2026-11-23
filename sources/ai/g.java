package ai;

import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
        return this.d ? hd.N0(2131745060, null) : this.a;
    }
}
