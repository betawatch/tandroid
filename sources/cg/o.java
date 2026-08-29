package cg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class o {
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
    public final /* synthetic */ p m;

    public o(p pVar) {
        this.m = pVar;
    }

    public final void a(int i10, boolean z10) {
        ArrayList arrayList;
        p pVar = this.m;
        ArrayList arrayList2 = pVar.e;
        HashMap hashMap = (HashMap) pVar.f;
        RectF rectF = (RectF) pVar.g;
        this.j = Math.abs(Utilities.fastRandom.nextLong() % 2250) + 2250;
        this.k = (Math.abs(Utilities.fastRandom.nextFloat()) * 0.45f) + 0.6f;
        String str = q.a[th.f(Utilities.fastRandom, 49)];
        if (str.length() > 7) {
            this.k *= 0.6f;
        } else if (str.length() > 5) {
            this.k *= 0.75f;
        }
        StaticLayout staticLayout = new StaticLayout(str, pVar.d, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.e = staticLayout;
        int i11 = 0;
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
        float f9 = this.h / 4.0f;
        float f10 = rectF.left + f9;
        float f11 = rectF.right - f9;
        if (i10 % 2 == 0) {
            f11 = rectF.centerX() - (this.h / 2.0f);
        } else {
            f10 = rectF.centerX() + (this.h / 2.0f);
        }
        float f12 = f11 - f10;
        float abs = Math.abs(Utilities.fastRandom.nextInt() % f12) + f10;
        float abs2 = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
        int i12 = 0;
        float f13 = 0.0f;
        while (i12 < 10) {
            float abs3 = Math.abs(Utilities.fastRandom.nextInt() % f12) + f10;
            float abs4 = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
            float f14 = 2.14748365E9f;
            while (i11 < arrayList2.size()) {
                o oVar = (o) arrayList2.get(i11);
                if (oVar.a) {
                    arrayList = arrayList2;
                    float min = Math.min(Math.abs(((((this.k / pVar.a) * oVar.h) * 1.1f) + oVar.b) - abs3), Math.abs(oVar.b - abs3));
                    float f15 = oVar.c - abs4;
                    float f16 = (f15 * f15) + (min * min);
                    if (f16 < f14) {
                        f14 = f16;
                    }
                } else {
                    arrayList = arrayList2;
                }
                i11++;
                arrayList2 = arrayList;
            }
            ArrayList arrayList3 = arrayList2;
            if (f14 > f13) {
                abs = abs3;
                f13 = f14;
                abs2 = abs4;
            }
            i12++;
            arrayList2 = arrayList3;
            i11 = 0;
        }
        this.b = abs;
        this.c = abs2;
        double atan2 = Math.atan2(abs - rectF.centerX(), this.c - rectF.centerY());
        Math.sin(atan2);
        Math.cos(atan2);
        this.d = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 255.0f);
        this.l = z10 ? Math.abs((Utilities.fastRandom.nextFloat() % 1.0f) * 0.9f) : 0.0f;
        this.a = true;
    }
}
