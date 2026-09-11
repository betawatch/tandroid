package ah;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.p6;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class d {
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
    public final /* synthetic */ e l;

    public d(e eVar) {
        this.l = eVar;
    }

    public final void a() {
        e eVar;
        float f7 = 0.0f;
        this.h = 0.0f;
        float b10 = b();
        float c10 = c();
        int i10 = 0;
        while (true) {
            eVar = this.l;
            if (i10 >= 20) {
                break;
            }
            float b11 = b();
            float c11 = c();
            float f10 = 2.14748365E9f;
            for (int i11 = 0; i11 < eVar.c.size(); i11++) {
                float f11 = ((d) eVar.c.get(i11)).c - b11;
                float f12 = ((d) eVar.c.get(i11)).d - c11;
                float f13 = (f12 * f12) + (f11 * f11);
                if (f13 < f10) {
                    f10 = f13;
                }
            }
            if (f10 > f7) {
                b10 = b11;
                c10 = c11;
                f7 = f10;
            }
            i10++;
        }
        float f14 = eVar.f ? 0.8f : 0.5f;
        this.c = b10;
        if (b10 > eVar.b.width() * f14) {
            this.a = eVar.b.width() * f14;
        } else {
            float width = eVar.b.width() * f14;
            this.a = width;
            if (this.c > width) {
                this.c = width - 0.1f;
            }
        }
        this.b = a4.a.e(p6.c(Utilities.fastRandom, 100), 100.0f, eVar.b.height() * 0.1f, eVar.b.height() * 0.45f);
        if (eVar.f) {
            float e7 = a4.a.e(p6.c(Utilities.fastRandom, 100), 100.0f, eVar.b.width() * 0.1f, eVar.b.width() * 0.05f);
            this.f = e7;
            this.g = (((p6.c(Utilities.fastRandom, 100) / 100.0f) * 1.5f) + 1.5f) * e7;
            this.d = a4.a.e(p6.c(Utilities.fastRandom, 100), 100.0f, eVar.b.height() * 0.1f, this.f / 2.0f);
            this.e = eVar.b.height() + this.f;
            this.i = Math.abs(Utilities.fastRandom.nextInt() % 600) + MediaDataController.MAX_STYLE_RUNS_COUNT;
        } else {
            float e10 = a4.a.e(p6.c(Utilities.fastRandom, 100), 100.0f, eVar.b.width() * 0.1f, eVar.b.width() * 0.05f);
            this.f = e10;
            this.g = (((p6.c(Utilities.fastRandom, 100) / 100.0f) * 0.5f) + 1.5f) * e10;
            this.d = c10;
            this.e = c10 + eVar.b.height();
            this.i = 1800L;
        }
        this.i = (long) (this.i / 1.75f);
        this.j = Utilities.fastRandom.nextBoolean();
        this.k = ((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 20.0f;
    }

    public final float b() {
        if (!this.l.f) {
            return (p6.c(Utilities.fastRandom, 100) / 100.0f) * r0.b.width();
        }
        return a4.a.e(p6.c(Utilities.fastRandom, 100), 100.0f, r0.b.width() * 1.5f, r0.b.width() * (-0.25f));
    }

    public final float c() {
        return (p6.c(Utilities.fastRandom, 100) / 100.0f) * this.l.b.height() * 0.5f;
    }
}
