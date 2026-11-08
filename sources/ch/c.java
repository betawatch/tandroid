package ch;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
        boolean z9 = dVar.f;
        ArrayList arrayList = dVar.c;
        Rect rect = dVar.b;
        float f10 = 0.0f;
        this.h = 0.0f;
        float b10 = b();
        float c10 = c();
        for (int i7 = 0; i7 < 20; i7++) {
            float b11 = b();
            float c11 = c();
            float f11 = 2.14748365E9f;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                float f12 = ((c) arrayList.get(i10)).c - b11;
                float f13 = ((c) arrayList.get(i10)).d - c11;
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
        }
        float f15 = z9 ? 0.8f : 0.5f;
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
        g5.a aVar = Utilities.c;
        this.b = com.google.android.recaptcha.internal.a.c(Math.abs(((int) aVar.nextLong()) % 100), 100.0f, height, rect.height() * 0.45f);
        if (z9) {
            float c12 = com.google.android.recaptcha.internal.a.c(Math.abs(((int) aVar.nextLong()) % 100), 100.0f, rect.width() * 0.1f, rect.width() * 0.05f);
            this.f = c12;
            this.g = (((Math.abs(((int) aVar.nextLong()) % 100) / 100.0f) * 1.5f) + 1.5f) * c12;
            this.d = com.google.android.recaptcha.internal.a.c(Math.abs(((int) aVar.nextLong()) % 100), 100.0f, rect.height() * 0.1f, this.f / 2.0f);
            this.e = rect.height() + this.f;
            this.i = Math.abs(((int) aVar.nextLong()) % 600) + 1000;
        } else {
            float c13 = com.google.android.recaptcha.internal.a.c(Math.abs(((int) aVar.nextLong()) % 100), 100.0f, rect.width() * 0.1f, rect.width() * 0.05f);
            this.f = c13;
            this.g = (((Math.abs(((int) aVar.nextLong()) % 100) / 100.0f) * 0.5f) + 1.5f) * c13;
            this.d = c10;
            this.e = c10 + rect.height();
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
        return com.google.android.recaptcha.internal.a.c(Math.abs(((int) Utilities.c.nextLong()) % 100), 100.0f, rect.width() * 1.5f, rect.width() * (-0.25f));
    }

    public final float c() {
        return (Math.abs(((int) Utilities.c.nextLong()) % 100) / 100.0f) * this.l.b.height() * 0.5f;
    }
}
