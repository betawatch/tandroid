package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class mw {
    public final int a;
    public final long b;
    public final long c;
    public boolean e;
    public final /* synthetic */ int g;
    public final /* synthetic */ org.telegram.messenger.us h;
    public boolean d = false;
    public long f = -1;

    public mw(org.telegram.messenger.us usVar, int i10, long j10, long j11, int i11) {
        this.g = i11;
        this.h = usVar;
        this.a = i10;
        this.b = j10;
        this.c = j11;
    }

    public final void a() {
        boolean z10;
        switch (this.g) {
            case 0:
                vy vyVar = (vy) this.h;
                if (vyVar.t1 == null || vyVar.getVisibility() != 0 || !vyVar.K0) {
                    z10 = false;
                    break;
                } else {
                    z10 = true;
                    break;
                }
            default:
                z10 = ((zf.x0) this.h).N();
                break;
        }
        this.d = z10;
        if (z10) {
            return;
        }
        if (this.e) {
            org.telegram.messenger.vp.r1(this.a).z4(2, 0, this.b, this.c, null);
        }
        this.f = -1L;
    }

    public final void b() {
        if (this.d) {
            if (this.f == -1) {
                this.f = System.currentTimeMillis();
            } else if (System.currentTimeMillis() - this.f > 2000) {
                this.e = true;
                this.f = System.currentTimeMillis();
                org.telegram.messenger.vp.r1(this.a).z4(10, 0, this.b, this.c, null);
            }
        }
    }
}
