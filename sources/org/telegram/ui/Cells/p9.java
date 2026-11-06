package org.telegram.ui.Cells;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class p9 extends Path {
    public static ArrayList d;
    public float a;
    public ArrayList b;
    public int c;

    @Override // android.graphics.Path
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        ArrayList arrayList = d;
        RectF rectF = (arrayList == null || arrayList.size() <= 0) ? new RectF() : (RectF) d.remove(0);
        rectF.set(f10, f11, f12, f13);
        this.b.add(rectF);
        this.c++;
        super.addRect(f10, f11, f12, f13, direction);
        if (f13 > this.a) {
            this.a = f13;
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
