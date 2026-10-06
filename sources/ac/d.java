package ac;

import k2.f;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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

    public f a() {
        if (this.a || !(this.b || this.c)) {
            return new f(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }

    public /* synthetic */ d(boolean z10, boolean z11, boolean z12) {
        this.a = z10;
        this.b = z11;
        this.c = z12;
    }
}
