package jg;

import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.ui.Components.ly;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class d1 {
    public final int a;
    public final long b;
    public final long c;
    public boolean e;
    public final /* synthetic */ int g;
    public final /* synthetic */ is h;
    public boolean d = false;
    public long f = -1;

    public d1(is isVar, int i7, long j3, long j10, int i10) {
        this.g = i10;
        this.h = isVar;
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
                ly lyVar = (ly) this.h;
                if (lyVar.u1 == null || lyVar.getVisibility() != 0 || !lyVar.L0) {
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
            np.s1(this.a).D4(2, 0, this.b, this.c, null);
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
                np.s1(this.a).D4(10, 0, this.b, this.c, null);
            }
        }
    }
}
