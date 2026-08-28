package hg;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.j2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
        float f10 = 0.0f;
        this.h = 0.0f;
        float b10 = b();
        float c10 = c();
        int i9 = 0;
        while (true) {
            dVar = this.l;
            if (i9 >= 20) {
                break;
            }
            float b11 = b();
            float c11 = c();
            float f11 = 2.14748365E9f;
            for (int i10 = 0; i10 < dVar.c.size(); i10++) {
                float f12 = ((c) dVar.c.get(i10)).c - b11;
                float f13 = ((c) dVar.c.get(i10)).d - c11;
                float f14 = (f13 * f13) + (f12 * f12);
                if (f14 < f11) {
                    f11 = f14;
                }
            }
            if (f11 > f10) {
                b10 = b11;
                c10 = c11;
                f10 = f11;
            }
            i9++;
        }
        float f15 = dVar.f ? 0.8f : 0.5f;
        this.c = b10;
        if (b10 > dVar.b.width() * f15) {
            this.a = dVar.b.width() * f15;
        } else {
            float width = dVar.b.width() * f15;
            this.a = width;
            if (this.c > width) {
                this.c = width - 0.1f;
            }
        }
        this.b = j2.b(j2.e(Utilities.fastRandom, 100), 100.0f, dVar.b.height() * 0.1f, dVar.b.height() * 0.45f);
        if (dVar.f) {
            float b12 = j2.b(j2.e(Utilities.fastRandom, 100), 100.0f, dVar.b.width() * 0.1f, dVar.b.width() * 0.05f);
            this.f = b12;
            this.g = (((j2.e(Utilities.fastRandom, 100) / 100.0f) * 1.5f) + 1.5f) * b12;
            this.d = j2.b(j2.e(Utilities.fastRandom, 100), 100.0f, dVar.b.height() * 0.1f, this.f / 2.0f);
            this.e = dVar.b.height() + this.f;
            this.i = Math.abs(Utilities.fastRandom.nextInt() % 600) + MediaDataController.MAX_STYLE_RUNS_COUNT;
        } else {
            float b13 = j2.b(j2.e(Utilities.fastRandom, 100), 100.0f, dVar.b.width() * 0.1f, dVar.b.width() * 0.05f);
            this.f = b13;
            this.g = (((j2.e(Utilities.fastRandom, 100) / 100.0f) * 0.5f) + 1.5f) * b13;
            this.d = c10;
            this.e = c10 + dVar.b.height();
            this.i = 1800L;
        }
        this.i = (long) (this.i / 1.75f);
        this.j = Utilities.fastRandom.nextBoolean();
        this.k = ((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 20.0f;
    }

    public final float b() {
        if (!this.l.f) {
            return (j2.e(Utilities.fastRandom, 100) / 100.0f) * r0.b.width();
        }
        return j2.b(j2.e(Utilities.fastRandom, 100), 100.0f, r0.b.width() * 1.5f, r0.b.width() * (-0.25f));
    }

    public final float c() {
        return (j2.e(Utilities.fastRandom, 100) / 100.0f) * this.l.b.height() * 0.5f;
    }
}
