package di;

import org.telegram.ui.Components.xy0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class g6 {
    public final float a;
    public final xy0 b;
    public final xy0 c;

    public g6(float f10, String str, CharSequence charSequence) {
        this.b = new xy0(str, 12.0f, null);
        this.c = new xy0(charSequence, 12.0f, org.telegram.messenger.g0.o());
        this.a = (a() / 2.0f) + f10;
    }

    public final float a() {
        return Math.max(this.b.i(), this.c.i());
    }
}
