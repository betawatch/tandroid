package kg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n {
    public boolean a;
    public float b;
    public float c;
    public int d;
    public StaticLayout e;
    public Bitmap f;
    public int g;
    public int h;
    public int i;
    public long j;
    public float k;
    public float l;
    public final /* synthetic */ o m;

    public n(o oVar) {
        this.m = oVar;
    }

    public final void a(int i10, boolean z10) {
        ArrayList arrayList;
        o oVar = this.m;
        ArrayList arrayList2 = oVar.e;
        HashMap hashMap = (HashMap) oVar.f;
        RectF rectF = (RectF) oVar.g;
        d5.a aVar = Utilities.c;
        this.j = Math.abs(aVar.nextLong() % 2250) + 2250;
        this.k = (Math.abs(aVar.nextFloat()) * 0.45f) + 0.6f;
        String str = p.a[Math.abs(((int) aVar.nextLong()) % 49)];
        if (str.length() > 7) {
            this.k *= 0.6f;
        } else if (str.length() > 5) {
            this.k *= 0.75f;
        }
        StaticLayout staticLayout = new StaticLayout(str, oVar.d, org.telegram.messenger.i0.q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.e = staticLayout;
        if (staticLayout.getLineCount() <= 0) {
            this.i = 0;
            this.h = 0;
            this.g = 0;
        } else {
            this.g = (int) this.e.getLineLeft(0);
            this.h = (int) this.e.getLineWidth(0);
            this.i = this.e.getHeight();
        }
        Bitmap bitmap = (Bitmap) hashMap.get(str);
        this.f = bitmap;
        if (bitmap == null) {
            this.f = Bitmap.createBitmap(Math.max(1, this.h - Math.max(0, this.g)), Math.max(1, this.i), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.f);
            canvas.translate(-this.g, 0.0f);
            this.e.draw(canvas);
            hashMap.put(str, this.f);
        }
        float f7 = this.h / 4.0f;
        float f10 = rectF.left + f7;
        float f11 = rectF.right - f7;
        if (i10 % 2 == 0) {
            f11 = rectF.centerX() - (this.h / 2.0f);
        } else {
            f10 = rectF.centerX() + (this.h / 2.0f);
        }
        float f12 = f11 - f10;
        float abs = Math.abs(((int) aVar.nextLong()) % f12) + f10;
        float abs2 = Math.abs(((int) aVar.nextLong()) % rectF.height()) + rectF.top;
        int i11 = 0;
        float f13 = 0.0f;
        while (i11 < 10) {
            d5.a aVar2 = Utilities.c;
            float abs3 = Math.abs(((int) aVar2.nextLong()) % f12) + f10;
            float abs4 = Math.abs(((int) aVar2.nextLong()) % rectF.height()) + rectF.top;
            float f14 = 2.14748365E9f;
            int i12 = 0;
            while (i12 < arrayList2.size()) {
                n nVar = (n) arrayList2.get(i12);
                if (nVar.a) {
                    arrayList = arrayList2;
                    float min = Math.min(Math.abs(((((this.k / oVar.a) * nVar.h) * 1.1f) + nVar.b) - abs3), Math.abs(nVar.b - abs3));
                    float f15 = nVar.c - abs4;
                    float f16 = (f15 * f15) + (min * min);
                    if (f16 < f14) {
                        f14 = f16;
                    }
                } else {
                    arrayList = arrayList2;
                }
                i12++;
                arrayList2 = arrayList;
            }
            ArrayList arrayList3 = arrayList2;
            if (f14 > f13) {
                abs2 = abs4;
                f13 = f14;
                abs = abs3;
            }
            i11++;
            arrayList2 = arrayList3;
        }
        this.b = abs;
        this.c = abs2;
        double atan2 = Math.atan2(abs - rectF.centerX(), this.c - rectF.centerY());
        Math.sin(atan2);
        Math.cos(atan2);
        d5.a aVar3 = Utilities.c;
        this.d = (int) (((aVar3.nextInt(50) + 50) / 100.0f) * 255.0f);
        this.l = z10 ? Math.abs((aVar3.nextFloat() % 1.0f) * 0.9f) : 0.0f;
        this.a = true;
    }
}
