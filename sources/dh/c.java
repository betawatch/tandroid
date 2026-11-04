package dh;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
        d dVar = this.l;
        boolean z10 = dVar.f;
        ArrayList arrayList = dVar.c;
        Rect rect = dVar.b;
        float f10 = 0.0f;
        this.h = 0.0f;
        float b10 = b();
        float c2 = c();
        for (int i3 = 0; i3 < 20; i3++) {
            float b11 = b();
            float c10 = c();
            float f11 = 2.14748365E9f;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                float f12 = ((c) arrayList.get(i10)).c - b11;
                float f13 = ((c) arrayList.get(i10)).d - c10;
                float f14 = (f13 * f13) + (f12 * f12);
                if (f14 < f11) {
                    f11 = f14;
                }
            }
            if (f11 > f10) {
                b10 = b11;
                c2 = c10;
                f10 = f11;
            }
        }
        float f15 = z10 ? 0.8f : 0.5f;
        this.c = b10;
        if (b10 > rect.width() * f15) {
            this.a = rect.width() * f15;
        } else {
            float width = rect.width() * f15;
            this.a = width;
            if (this.c > width) {
                this.c = width - 0.1f;
            }
        }
        float height = rect.height() * 0.1f;
        f5.a aVar = Utilities.c;
        this.b = a1.g.A(Math.abs(((int) aVar.nextLong()) % 100), 100.0f, height, rect.height() * 0.45f);
        if (z10) {
            float A = a1.g.A(Math.abs(((int) aVar.nextLong()) % 100), 100.0f, rect.width() * 0.1f, rect.width() * 0.05f);
            this.f = A;
            this.g = (((Math.abs(((int) aVar.nextLong()) % 100) / 100.0f) * 1.5f) + 1.5f) * A;
            this.d = a1.g.A(Math.abs(((int) aVar.nextLong()) % 100), 100.0f, rect.height() * 0.1f, this.f / 2.0f);
            this.e = rect.height() + this.f;
            this.i = Math.abs(((int) aVar.nextLong()) % 600) + 1000;
        } else {
            float A2 = a1.g.A(Math.abs(((int) aVar.nextLong()) % 100), 100.0f, rect.width() * 0.1f, rect.width() * 0.05f);
            this.f = A2;
            this.g = (((Math.abs(((int) aVar.nextLong()) % 100) / 100.0f) * 0.5f) + 1.5f) * A2;
            this.d = c2;
            this.e = c2 + rect.height();
            this.i = 1800L;
        }
        this.i = (long) (this.i / 1.75f);
        this.j = aVar.nextBoolean();
        this.k = ((((int) aVar.nextLong()) % 100) / 100.0f) * 20.0f;
    }

    public final float b() {
        d dVar = this.l;
        Rect rect = dVar.b;
        if (!dVar.f) {
            return (Math.abs(((int) Utilities.c.nextLong()) % 100) / 100.0f) * rect.width();
        }
        return a1.g.A(Math.abs(((int) Utilities.c.nextLong()) % 100), 100.0f, rect.width() * 1.5f, rect.width() * (-0.25f));
    }

    public final float c() {
        return (Math.abs(((int) Utilities.c.nextLong()) % 100) / 100.0f) * this.l.b.height() * 0.5f;
    }
}
