package bi;

import org.telegram.ui.Components.ly0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class l7 {
    public final float a;
    public final ly0 b;
    public final ly0 c;

    public l7(float f10, String str, CharSequence charSequence) {
        this.b = new ly0(str, 12.0f, null);
        this.c = new ly0(charSequence, 12.0f, org.telegram.messenger.g0.o());
        this.a = (a() / 2.0f) + f10;
    }

    public final float a() {
        return Math.max(this.b.i(), this.c.i());
    }
}
