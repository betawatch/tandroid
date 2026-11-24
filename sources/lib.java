// default package

import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class lib extends Path {
    public static ArrayList d;
    public float a;
    public ArrayList b;
    public int c;

    @Override // android.graphics.Path
    public final void addRect(float f, float f2, float f3, float f4, Path.Direction direction) {
        ArrayList arrayList = d;
        RectF rectF = (arrayList == null || arrayList.size() <= 0) ? new RectF() : (RectF) d.remove(0);
        rectF.set(f, f2, f3, f4);
        this.b.add(rectF);
        this.c++;
        super.addRect(f, f2, f3, f4, direction);
        if (f4 > this.a) {
            this.a = f4;
        }
    }

    @Override // android.graphics.Path
    public final void reset() {
        ArrayList arrayList = this.b;
        super.reset();
        ArrayList arrayList2 = d;
        if (arrayList2 == null) {
            arrayList2 = new ArrayList(arrayList.size());
            d = arrayList2;
        }
        arrayList2.addAll(arrayList);
        arrayList.clear();
        this.c = 0;
        this.a = 0.0f;
    }
}
