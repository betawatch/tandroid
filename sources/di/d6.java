package di;

import org.telegram.ui.Components.oy0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class d6 {
    public final float a;
    public final oy0 b;
    public final oy0 c;

    public d6(float f10, String str, CharSequence charSequence) {
        this.b = new oy0(str, 12.0f, null);
        this.c = new oy0(charSequence, 12.0f, org.telegram.messenger.g0.o());
        this.a = (a() / 2.0f) + f10;
    }

    public final float a() {
        return Math.max(this.b.i(), this.c.i());
    }
}
