package ai;

import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
        return this.d ? gd.M0(2131745066, null) : this.a;
    }
}
