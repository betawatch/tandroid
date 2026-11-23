package ai;

import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
