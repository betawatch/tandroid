package org.telegram.ui.Components;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.os.Build;
import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class kg0 {
    public static final float[] m = new ColorMatrix().getArray();
    public static final float[] n;
    public static final t7.u o;
    public final ei.e a;
    public final ei.d b;
    public final tg.b c;
    public final tg.b d;
    public final tg.b e;
    public final hi.d f;
    public final je.b g;
    public final je.b h;
    public int i;
    public boolean j;
    public float k;
    public float l;

    static {
        ColorMatrix colorMatrix = new ColorMatrix();
        org.telegram.messenger.i0.i(colorMatrix, 0.65f);
        org.telegram.messenger.i0.n2(colorMatrix, 0.5f);
        n = colorMatrix.getArray();
        o = new t7.u(14);
    }

    public kg0(ei.r rVar, ei.b bVar) {
        je.b bVar2 = new je.b();
        this.g = bVar2;
        je.b bVar3 = new je.b();
        this.h = bVar3;
        if (Build.VERSION.SDK_INT >= 31) {
            ei.e eVar = bVar.g;
            this.a = eVar;
            this.b = eVar != null ? eVar.d(4) : null;
        } else {
            this.a = null;
            this.b = null;
        }
        jg0 jg0Var = new jg0(this, null);
        jg0 jg0Var2 = new jg0(this, bVar.c.a);
        tg.b bVar4 = new tg.b(jg0Var);
        bVar4.h = rVar;
        bVar4.e = bVar2;
        bVar4.d = bVar3;
        this.c = bVar4;
        tg.b bVar5 = new tg.b(jg0Var2);
        bVar5.h = rVar;
        bVar5.e = bVar2;
        bVar5.d = bVar3;
        this.d = bVar5;
        bVar5.i = true;
        hi.d dVar = new hi.d(jg0Var2, bVar.f.a);
        this.f = dVar;
        tg.b bVar6 = new tg.b(dVar);
        bVar6.h = rVar;
        bVar6.e = bVar2;
        bVar6.d = bVar3;
        this.e = bVar6;
        bVar6.i = true;
    }

    public final void a() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((vg.f) it.next()).updateColors();
        }
        Iterator it2 = this.g.iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).invalidate();
        }
    }

    public final void b(float f7) {
        ei.e eVar;
        ColorMatrixColorFilter colorMatrixColorFilter;
        if (this.k != f7) {
            this.k = f7;
            if (Build.VERSION.SDK_INT >= 31 && (eVar = this.a) != null) {
                if (f7 > 0.0f) {
                    float[] fArr = m;
                    int length = fArr.length;
                    float[] fArr2 = new float[length];
                    for (int i10 = 0; i10 < length; i10++) {
                        fArr2[i10] = org.telegram.messenger.i0.T1(fArr[i10], n[i10], f7);
                    }
                    colorMatrixColorFilter = new ColorMatrixColorFilter(fArr2);
                } else {
                    colorMatrixColorFilter = null;
                }
                if (eVar.k != colorMatrixColorFilter) {
                    eVar.k = colorMatrixColorFilter;
                    for (int i11 = 0; i11 < eVar.b; i11++) {
                        ((ei.c) eVar.a.get(i11)).c(colorMatrixColorFilter);
                    }
                }
            }
            a();
        }
    }
}
