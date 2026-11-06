package org.telegram.ui.Components;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.os.Build;
import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class if0 {
    public static final float[] m = new ColorMatrix().getArray();
    public static final float[] n;
    public static final nb.a o;
    public final oi.d a;
    public final oi.c b;
    public final dh.c c;
    public final dh.c d;
    public final dh.c e;
    public final ri.d f;
    public final xe.b g;
    public final xe.b h;
    public int i;
    public boolean j;
    public float k;
    public float l;

    static {
        ColorMatrix colorMatrix = new ColorMatrix();
        org.telegram.messenger.g0.i(colorMatrix, 0.65f);
        org.telegram.messenger.g0.n2(colorMatrix, 0.5f);
        n = colorMatrix.getArray();
        o = new nb.a(18);
    }

    public if0(oi.q qVar, oi.a aVar) {
        xe.b bVar = new xe.b();
        this.g = bVar;
        xe.b bVar2 = new xe.b();
        this.h = bVar2;
        if (Build.VERSION.SDK_INT >= 31) {
            aVar.l = true;
            oi.d dVar = aVar.g;
            this.a = dVar;
            this.b = dVar != null ? dVar.d(4) : null;
        } else {
            this.a = null;
            this.b = null;
        }
        hf0 hf0Var = new hf0(this, null);
        hf0 hf0Var2 = new hf0(this, new gf0(aVar.c));
        dh.c cVar = new dh.c(hf0Var, hf0Var, hf0Var);
        cVar.j = qVar;
        cVar.g = bVar;
        cVar.f = bVar2;
        this.c = cVar;
        dh.c cVar2 = new dh.c(hf0Var2, hf0Var2, hf0Var2);
        cVar2.j = qVar;
        cVar2.g = bVar;
        cVar2.f = bVar2;
        this.d = cVar2;
        cVar2.k = true;
        ri.d dVar2 = new ri.d(hf0Var2, new gf0(aVar.f));
        this.f = dVar2;
        dh.c cVar3 = new dh.c(dVar2, dVar2, dVar2);
        cVar3.j = qVar;
        cVar3.g = bVar;
        cVar3.f = bVar2;
        this.e = cVar3;
        cVar3.k = true;
    }

    public final void a() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((fh.g) it.next()).updateColors();
        }
        Iterator it2 = this.g.iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).invalidate();
        }
    }

    public final void b(float f10) {
        oi.d dVar;
        ColorMatrixColorFilter colorMatrixColorFilter;
        if (this.k != f10) {
            this.k = f10;
            if (Build.VERSION.SDK_INT >= 31 && (dVar = this.a) != null) {
                if (f10 > 0.0f) {
                    float[] fArr = m;
                    int length = fArr.length;
                    float[] fArr2 = new float[length];
                    for (int i7 = 0; i7 < length; i7++) {
                        fArr2[i7] = org.telegram.messenger.g0.T1(fArr[i7], n[i7], f10);
                    }
                    colorMatrixColorFilter = new ColorMatrixColorFilter(fArr2);
                } else {
                    colorMatrixColorFilter = null;
                }
                if (dVar.k != colorMatrixColorFilter) {
                    dVar.k = colorMatrixColorFilter;
                    for (int i10 = 0; i10 < dVar.b; i10++) {
                        ((oi.b) dVar.a.get(i10)).c(colorMatrixColorFilter);
                    }
                }
            }
            a();
        }
    }
}
