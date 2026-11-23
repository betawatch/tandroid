package jg;

import org.telegram.messenger.gs;
import org.telegram.messenger.np;
import org.telegram.ui.Components.ty;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class d1 {
    public final int a;
    public final long b;
    public final long c;
    public boolean e;
    public final /* synthetic */ int g;
    public final /* synthetic */ gs h;
    public boolean d = false;
    public long f = -1;

    public d1(gs gsVar, int i7, long j3, long j10, int i10) {
        this.g = i10;
        this.h = gsVar;
        this.a = i7;
        this.b = j3;
        this.c = j10;
    }

    public final void a() {
        boolean N;
        switch (this.g) {
            case 0:
                N = ((h1) this.h).N();
                break;
            default:
                ty tyVar = (ty) this.h;
                if (tyVar.u1 == null || tyVar.getVisibility() != 0 || !tyVar.L0) {
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
            np.u1(this.a).N4(2, 0, this.b, this.c, null);
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
                np.u1(this.a).N4(10, 0, this.b, this.c, null);
            }
        }
    }
}
