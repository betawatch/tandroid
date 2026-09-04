package org.telegram.ui.Cells;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class x9 extends Path {
    public static ArrayList d;
    public float a;
    public ArrayList b;
    public int c;

    @Override // android.graphics.Path
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        ArrayList arrayList = d;
        RectF rectF = (arrayList == null || arrayList.size() <= 0) ? new RectF() : (RectF) d.remove(0);
        rectF.set(f7, f10, f11, f12);
        this.b.add(rectF);
        this.c++;
        super.addRect(f7, f10, f11, f12, direction);
        if (f12 > this.a) {
            this.a = f12;
        }
    }

    @Override // android.graphics.Path
    public final void reset() {
        ArrayList arrayList = this.b;
        super.reset();
        if (d == null) {
            d = new ArrayList(arrayList.size());
        }
        d.addAll(arrayList);
        arrayList.clear();
        this.c = 0;
        this.a = 0.0f;
    }
}
