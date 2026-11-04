package kg;

import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.ui.Components.ey;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class a1 {
    public final int a;
    public final long b;
    public final long c;
    public boolean e;
    public final /* synthetic */ int g;
    public final /* synthetic */ cs h;
    public boolean d = false;
    public long f = -1;

    public a1(cs csVar, int i3, long j10, long j11, int i10) {
        this.g = i10;
        this.h = csVar;
        this.a = i3;
        this.b = j10;
        this.c = j11;
    }

    public final void a() {
        boolean N;
        switch (this.g) {
            case 0:
                N = ((e1) this.h).N();
                break;
            default:
                ey eyVar = (ey) this.h;
                if (eyVar.u1 == null || eyVar.getVisibility() != 0 || !eyVar.L0) {
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
            hp.s1(this.a).C4(2, 0, this.b, this.c, null);
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
                hp.s1(this.a).C4(10, 0, this.b, this.c, null);
            }
        }
    }
}
