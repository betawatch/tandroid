package org.telegram.ui.Components;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.os.Build;
import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class kf0 {
    public static final float[] m = new ColorMatrix().getArray();
    public static final float[] n;
    public static final mb.b o;
    public final pi.d a;
    public final pi.c b;
    public final eh.c c;
    public final eh.c d;
    public final eh.c e;
    public final si.d f;
    public final ue.b g;
    public final ue.b h;
    public int i;
    public boolean j;
    public float k;
    public float l;

    static {
        ColorMatrix colorMatrix = new ColorMatrix();
        org.telegram.messenger.g0.i(colorMatrix, 0.65f);
        org.telegram.messenger.g0.n2(colorMatrix, 0.5f);
        n = colorMatrix.getArray();
        o = new mb.b(18);
    }

    public kf0(pi.q qVar, pi.a aVar) {
        ue.b bVar = new ue.b();
        this.g = bVar;
        ue.b bVar2 = new ue.b();
        this.h = bVar2;
        if (Build.VERSION.SDK_INT >= 31) {
            pi.d dVar = aVar.g;
            this.a = dVar;
            this.b = dVar != null ? dVar.d(4) : null;
        } else {
            this.a = null;
            this.b = null;
        }
        jf0 jf0Var = new jf0(this, null);
        jf0 jf0Var2 = new jf0(this, new if0(aVar.c));
        eh.c cVar = new eh.c(jf0Var, jf0Var, jf0Var);
        cVar.j = qVar;
        cVar.g = bVar;
        cVar.f = bVar2;
        this.c = cVar;
        eh.c cVar2 = new eh.c(jf0Var2, jf0Var2, jf0Var2);
        cVar2.j = qVar;
        cVar2.g = bVar;
        cVar2.f = bVar2;
        this.d = cVar2;
        cVar2.k = true;
        si.d dVar2 = new si.d(jf0Var2, new if0(aVar.f));
        this.f = dVar2;
        eh.c cVar3 = new eh.c(dVar2, dVar2, dVar2);
        cVar3.j = qVar;
        cVar3.g = bVar;
        cVar3.f = bVar2;
        this.e = cVar3;
        cVar3.k = true;
    }

    public final void a() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((gh.g) it.next()).updateColors();
        }
        Iterator it2 = this.g.iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).invalidate();
        }
    }

    public final void b(float f10) {
        pi.d dVar;
        ColorMatrixColorFilter colorMatrixColorFilter;
        if (this.k != f10) {
            this.k = f10;
            if (Build.VERSION.SDK_INT >= 31 && (dVar = this.a) != null) {
                if (f10 > 0.0f) {
                    float[] fArr = m;
                    int length = fArr.length;
                    float[] fArr2 = new float[length];
                    for (int i3 = 0; i3 < length; i3++) {
                        fArr2[i3] = org.telegram.messenger.g0.T1(fArr[i3], n[i3], f10);
                    }
                    colorMatrixColorFilter = new ColorMatrixColorFilter(fArr2);
                } else {
                    colorMatrixColorFilter = null;
                }
                if (dVar.k != colorMatrixColorFilter) {
                    dVar.k = colorMatrixColorFilter;
                    for (int i10 = 0; i10 < dVar.b; i10++) {
                        ((pi.b) dVar.a.get(i10)).c(colorMatrixColorFilter);
                    }
                }
            }
            a();
        }
    }
}
