package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class kd0 {
    public Path a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public ArrayList g;

    public final void a(String str, float f10) {
        float f11 = this.e;
        float f12 = this.d;
        float f13 = this.c;
        try {
            hd0 hd0Var = new hd0();
            hd0Var.a = new ArrayList();
            hd0Var.b = f10 * this.f;
            String[] split = str.split(" ");
            int i10 = 0;
            while (i10 < split.length) {
                char charAt = split[i10].charAt(0);
                if (charAt == 'C') {
                    gd0 gd0Var = new gd0();
                    gd0Var.c = (Float.parseFloat(split[i10 + 1]) + f12) * f13;
                    gd0Var.d = (Float.parseFloat(split[i10 + 2]) + f11) * f13;
                    gd0Var.e = (Float.parseFloat(split[i10 + 3]) + f12) * f13;
                    gd0Var.f = (Float.parseFloat(split[i10 + 4]) + f11) * f13;
                    gd0Var.a = (Float.parseFloat(split[i10 + 5]) + f12) * f13;
                    i10 += 6;
                    gd0Var.b = (Float.parseFloat(split[i10]) + f11) * f13;
                    hd0Var.a.add(gd0Var);
                } else if (charAt == 'L') {
                    id0 id0Var = new id0();
                    id0Var.a = (Float.parseFloat(split[i10 + 1]) + f12) * f13;
                    i10 += 2;
                    id0Var.b = (Float.parseFloat(split[i10]) + f11) * f13;
                    hd0Var.a.add(id0Var);
                } else if (charAt == 'M') {
                    jd0 jd0Var = new jd0();
                    jd0Var.a = (Float.parseFloat(split[i10 + 1]) + f12) * f13;
                    i10 += 2;
                    jd0Var.b = (Float.parseFloat(split[i10]) + f11) * f13;
                    hd0Var.a.add(jd0Var);
                }
                i10++;
            }
            this.g.add(hd0Var);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public final void b(Canvas canvas, Paint paint, float f10) {
        hd0 hd0Var;
        hd0 hd0Var2;
        float f11;
        ArrayList arrayList = this.g;
        Path path = this.a;
        if (this.b != f10) {
            this.b = f10;
            int size = arrayList.size();
            hd0 hd0Var3 = null;
            hd0 hd0Var4 = null;
            for (int i10 = 0; i10 < size; i10++) {
                hd0 hd0Var5 = (hd0) arrayList.get(i10);
                if ((hd0Var4 == null || hd0Var4.b < hd0Var5.b) && hd0Var5.b <= f10) {
                    hd0Var4 = hd0Var5;
                }
                if ((hd0Var3 == null || hd0Var3.b > hd0Var5.b) && hd0Var5.b >= f10) {
                    hd0Var3 = hd0Var5;
                }
            }
            if (hd0Var3 == hd0Var4) {
                hd0Var4 = null;
            }
            if (hd0Var4 == null || hd0Var3 != null) {
                hd0Var = hd0Var3;
                hd0Var2 = hd0Var4;
            } else {
                hd0Var = hd0Var4;
                hd0Var2 = null;
            }
            if (hd0Var == null) {
                return;
            }
            ArrayList arrayList2 = hd0Var.a;
            if (hd0Var2 != null && hd0Var2.a.size() != arrayList2.size()) {
                return;
            }
            path.reset();
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                Object obj = hd0Var2 != null ? hd0Var2.a.get(i11) : null;
                Object obj2 = arrayList2.get(i11);
                if (obj != null && obj.getClass() != obj2.getClass()) {
                    return;
                }
                if (hd0Var2 != null) {
                    float f12 = hd0Var2.b;
                    f11 = (f10 - f12) / (hd0Var.b - f12);
                } else {
                    f11 = 1.0f;
                }
                if (obj2 instanceof jd0) {
                    jd0 jd0Var = (jd0) obj2;
                    jd0 jd0Var2 = (jd0) obj;
                    if (jd0Var2 != null) {
                        float f13 = jd0Var2.a;
                        float dpf2 = AndroidUtilities.dpf2(((jd0Var.a - f13) * f11) + f13);
                        float f14 = jd0Var2.b;
                        path.moveTo(dpf2, AndroidUtilities.dpf2(((jd0Var.b - f14) * f11) + f14));
                    } else {
                        path.moveTo(AndroidUtilities.dpf2(jd0Var.a), AndroidUtilities.dpf2(jd0Var.b));
                    }
                } else if (obj2 instanceof id0) {
                    id0 id0Var = (id0) obj2;
                    id0 id0Var2 = (id0) obj;
                    if (id0Var2 != null) {
                        float f15 = id0Var2.a;
                        float dpf22 = AndroidUtilities.dpf2(((id0Var.a - f15) * f11) + f15);
                        float f16 = id0Var2.b;
                        path.lineTo(dpf22, AndroidUtilities.dpf2(((id0Var.b - f16) * f11) + f16));
                    } else {
                        path.lineTo(AndroidUtilities.dpf2(id0Var.a), AndroidUtilities.dpf2(id0Var.b));
                    }
                } else if (obj2 instanceof gd0) {
                    gd0 gd0Var = (gd0) obj2;
                    gd0 gd0Var2 = (gd0) obj;
                    if (gd0Var2 != null) {
                        float f17 = gd0Var2.c;
                        float dpf23 = AndroidUtilities.dpf2(((gd0Var.c - f17) * f11) + f17);
                        float f18 = gd0Var2.d;
                        float dpf24 = AndroidUtilities.dpf2(((gd0Var.d - f18) * f11) + f18);
                        float f19 = gd0Var2.e;
                        float dpf25 = AndroidUtilities.dpf2(((gd0Var.e - f19) * f11) + f19);
                        float f20 = gd0Var2.f;
                        float dpf26 = AndroidUtilities.dpf2(((gd0Var.f - f20) * f11) + f20);
                        float f21 = gd0Var2.a;
                        float dpf27 = AndroidUtilities.dpf2(((gd0Var.a - f21) * f11) + f21);
                        float f22 = gd0Var2.b;
                        path.cubicTo(dpf23, dpf24, dpf25, dpf26, dpf27, AndroidUtilities.dpf2(((gd0Var.b - f22) * f11) + f22));
                    } else {
                        path.cubicTo(AndroidUtilities.dpf2(gd0Var.c), AndroidUtilities.dpf2(gd0Var.d), AndroidUtilities.dpf2(gd0Var.e), AndroidUtilities.dpf2(gd0Var.f), AndroidUtilities.dpf2(gd0Var.a), AndroidUtilities.dpf2(gd0Var.b));
                    }
                }
            }
            path.close();
        }
        canvas.drawPath(path, paint);
    }
}
