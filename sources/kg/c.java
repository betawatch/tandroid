package kg;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class c {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public long i;
    public boolean j;
    public float k;
    public final /* synthetic */ d l;

    public c(d dVar) {
        this.l = dVar;
    }

    public final void a() {
        d dVar;
        float f9 = 0.0f;
        this.h = 0.0f;
        float b10 = b();
        float c3 = c();
        int i10 = 0;
        while (true) {
            dVar = this.l;
            if (i10 >= 20) {
                break;
            }
            float b11 = b();
            float c6 = c();
            float f10 = 2.14748365E9f;
            for (int i11 = 0; i11 < dVar.c.size(); i11++) {
                float f11 = ((c) dVar.c.get(i11)).c - b11;
                float f12 = ((c) dVar.c.get(i11)).d - c6;
                float f13 = (f12 * f12) + (f11 * f11);
                if (f13 < f10) {
                    f10 = f13;
                }
            }
            if (f10 > f9) {
                b10 = b11;
                c3 = c6;
                f9 = f10;
            }
            i10++;
        }
        float f14 = dVar.f ? 0.8f : 0.5f;
        this.c = b10;
        if (b10 > dVar.b.width() * f14) {
            this.a = dVar.b.width() * f14;
        } else {
            float width = dVar.b.width() * f14;
            this.a = width;
            if (this.c > width) {
                this.c = width - 0.1f;
            }
        }
        this.b = u3.c.c(th.f(Utilities.fastRandom, 100), 100.0f, dVar.b.height() * 0.1f, dVar.b.height() * 0.45f);
        if (dVar.f) {
            float c10 = u3.c.c(th.f(Utilities.fastRandom, 100), 100.0f, dVar.b.width() * 0.1f, dVar.b.width() * 0.05f);
            this.f = c10;
            this.g = (((th.f(Utilities.fastRandom, 100) / 100.0f) * 1.5f) + 1.5f) * c10;
            this.d = u3.c.c(th.f(Utilities.fastRandom, 100), 100.0f, dVar.b.height() * 0.1f, this.f / 2.0f);
            this.e = dVar.b.height() + this.f;
            this.i = Math.abs(Utilities.fastRandom.nextInt() % 600) + MediaDataController.MAX_STYLE_RUNS_COUNT;
        } else {
            float c11 = u3.c.c(th.f(Utilities.fastRandom, 100), 100.0f, dVar.b.width() * 0.1f, dVar.b.width() * 0.05f);
            this.f = c11;
            this.g = (((th.f(Utilities.fastRandom, 100) / 100.0f) * 0.5f) + 1.5f) * c11;
            this.d = c3;
            this.e = c3 + dVar.b.height();
            this.i = 1800L;
        }
        this.i = (long) (this.i / 1.75f);
        this.j = Utilities.fastRandom.nextBoolean();
        this.k = ((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 20.0f;
    }

    public final float b() {
        if (!this.l.f) {
            return (th.f(Utilities.fastRandom, 100) / 100.0f) * r0.b.width();
        }
        return u3.c.c(th.f(Utilities.fastRandom, 100), 100.0f, r0.b.width() * 1.5f, r0.b.width() * (-0.25f));
    }

    public final float c() {
        return (th.f(Utilities.fastRandom, 100) / 100.0f) * this.l.b.height() * 0.5f;
    }
}
