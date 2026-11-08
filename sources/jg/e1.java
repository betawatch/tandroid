package jg;

import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.ui.Components.hy;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class e1 {
    public final int a;
    public final long b;
    public final long c;
    public boolean e;
    public final /* synthetic */ int g;
    public final /* synthetic */ ls h;
    public boolean d = false;
    public long f = -1;

    public e1(ls lsVar, int i7, long j3, long j10, int i10) {
        this.g = i10;
        this.h = lsVar;
        this.a = i7;
        this.b = j3;
        this.c = j10;
    }

    public final void a() {
        boolean N;
        switch (this.g) {
            case 0:
                N = ((i1) this.h).N();
                break;
            default:
                hy hyVar = (hy) this.h;
                if (hyVar.t1 == null || hyVar.getVisibility() != 0 || !hyVar.K0) {
                    N = false;
                    break;
                } else {
                    N = true;
                    break;
                }
        }
        this.d = N;
        if (N) {
            return;
        }
        if (this.e) {
            qp.s1(this.a).C4(2, 0, this.b, this.c, null);
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
                qp.s1(this.a).C4(10, 0, this.b, this.c, null);
            }
        }
    }
}
