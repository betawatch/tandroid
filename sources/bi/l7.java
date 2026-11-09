package bi;

import org.telegram.ui.Components.ny0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class l7 {
    public final float a;
    public final ny0 b;
    public final ny0 c;

    public l7(float f10, String str, CharSequence charSequence) {
        this.b = new ny0(str, 12.0f, null);
        this.c = new ny0(charSequence, 12.0f, org.telegram.messenger.g0.o());
        this.a = (a() / 2.0f) + f10;
    }

    public final float a() {
        return Math.max(this.b.i(), this.c.i());
    }
}
