package bc;

import k2.g;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class d {
    public boolean a;
    public boolean b;
    public boolean c;

    public d() {
        this.a = false;
        this.b = false;
        this.c = false;
    }

    public g a() {
        if (this.a || !(this.b || this.c)) {
            return new g(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }

    public /* synthetic */ d(boolean z10, boolean z11, boolean z12) {
        this.a = z10;
        this.b = z11;
        this.c = z12;
    }
}
