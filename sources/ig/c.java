package ig;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.pa;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
        int i10 = 0;
        while (true) {
            dVar = this.l;
            if (i10 >= 20) {
                break;
            }
            float b11 = b();
            float c11 = c();
            float f11 = 2.14748365E9f;
            for (int i11 = 0; i11 < dVar.c.size(); i11++) {
                float f12 = ((c) dVar.c.get(i11)).c - b11;
                float f13 = ((c) dVar.c.get(i11)).d - c11;
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
            i10++;
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
        this.b = s3.c.c(pa.f(Utilities.fastRandom, 100), 100.0f, dVar.b.height() * 0.1f, dVar.b.height() * 0.45f);
        if (dVar.f) {
            float c12 = s3.c.c(pa.f(Utilities.fastRandom, 100), 100.0f, dVar.b.width() * 0.1f, dVar.b.width() * 0.05f);
            this.f = c12;
            this.g = (((pa.f(Utilities.fastRandom, 100) / 100.0f) * 1.5f) + 1.5f) * c12;
            this.d = s3.c.c(pa.f(Utilities.fastRandom, 100), 100.0f, dVar.b.height() * 0.1f, this.f / 2.0f);
            this.e = dVar.b.height() + this.f;
            this.i = Math.abs(Utilities.fastRandom.nextInt() % 600) + MediaDataController.MAX_STYLE_RUNS_COUNT;
        } else {
            float c13 = s3.c.c(pa.f(Utilities.fastRandom, 100), 100.0f, dVar.b.width() * 0.1f, dVar.b.width() * 0.05f);
            this.f = c13;
            this.g = (((pa.f(Utilities.fastRandom, 100) / 100.0f) * 0.5f) + 1.5f) * c13;
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
            return (pa.f(Utilities.fastRandom, 100) / 100.0f) * r0.b.width();
        }
        return s3.c.c(pa.f(Utilities.fastRandom, 100), 100.0f, r0.b.width() * 1.5f, r0.b.width() * (-0.25f));
    }

    public final float c() {
        return (pa.f(Utilities.fastRandom, 100) / 100.0f) * this.l.b.height() * 0.5f;
    }
}
