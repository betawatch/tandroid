package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class he0 {
    public Path a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public ArrayList g;

    public final void a(String str, float f7) {
        float f10 = this.e;
        float f11 = this.d;
        float f12 = this.c;
        try {
            ee0 ee0Var = new ee0();
            ee0Var.a = new ArrayList();
            ee0Var.b = f7 * this.f;
            String[] split = str.split(" ");
            int i10 = 0;
            while (i10 < split.length) {
                char charAt = split[i10].charAt(0);
                if (charAt == 'C') {
                    de0 de0Var = new de0();
                    de0Var.c = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    de0Var.d = (Float.parseFloat(split[i10 + 2]) + f10) * f12;
                    de0Var.e = (Float.parseFloat(split[i10 + 3]) + f11) * f12;
                    de0Var.f = (Float.parseFloat(split[i10 + 4]) + f10) * f12;
                    de0Var.a = (Float.parseFloat(split[i10 + 5]) + f11) * f12;
                    i10 += 6;
                    de0Var.b = (Float.parseFloat(split[i10]) + f10) * f12;
                    ee0Var.a.add(de0Var);
                } else if (charAt == 'L') {
                    fe0 fe0Var = new fe0();
                    fe0Var.a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    i10 += 2;
                    fe0Var.b = (Float.parseFloat(split[i10]) + f10) * f12;
                    ee0Var.a.add(fe0Var);
                } else if (charAt == 'M') {
                    ge0 ge0Var = new ge0();
                    ge0Var.a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    i10 += 2;
                    ge0Var.b = (Float.parseFloat(split[i10]) + f10) * f12;
                    ee0Var.a.add(ge0Var);
                }
                i10++;
            }
            this.g.add(ee0Var);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void b(Canvas canvas, Paint paint, float f7) {
        ee0 ee0Var;
        ee0 ee0Var2;
        float f10;
        ArrayList arrayList = this.g;
        Path path = this.a;
        if (this.b != f7) {
            this.b = f7;
            int size = arrayList.size();
            ee0 ee0Var3 = null;
            ee0 ee0Var4 = null;
            for (int i10 = 0; i10 < size; i10++) {
                ee0 ee0Var5 = (ee0) arrayList.get(i10);
                if ((ee0Var4 == null || ee0Var4.b < ee0Var5.b) && ee0Var5.b <= f7) {
                    ee0Var4 = ee0Var5;
                }
                if ((ee0Var3 == null || ee0Var3.b > ee0Var5.b) && ee0Var5.b >= f7) {
                    ee0Var3 = ee0Var5;
                }
            }
            if (ee0Var3 == ee0Var4) {
                ee0Var4 = null;
            }
            if (ee0Var4 == null || ee0Var3 != null) {
                ee0Var = ee0Var3;
                ee0Var2 = ee0Var4;
            } else {
                ee0Var = ee0Var4;
                ee0Var2 = null;
            }
            if (ee0Var == null) {
                return;
            }
            ArrayList arrayList2 = ee0Var.a;
            if (ee0Var2 != null && ee0Var2.a.size() != arrayList2.size()) {
                return;
            }
            path.reset();
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                Object obj = ee0Var2 != null ? ee0Var2.a.get(i11) : null;
                Object obj2 = arrayList2.get(i11);
                if (obj != null && obj.getClass() != obj2.getClass()) {
                    return;
                }
                if (ee0Var2 != null) {
                    float f11 = ee0Var2.b;
                    f10 = (f7 - f11) / (ee0Var.b - f11);
                } else {
                    f10 = 1.0f;
                }
                if (obj2 instanceof ge0) {
                    ge0 ge0Var = (ge0) obj2;
                    ge0 ge0Var2 = (ge0) obj;
                    if (ge0Var2 != null) {
                        float f12 = ge0Var2.a;
                        float dpf2 = AndroidUtilities.dpf2(((ge0Var.a - f12) * f10) + f12);
                        float f13 = ge0Var2.b;
                        path.moveTo(dpf2, AndroidUtilities.dpf2(((ge0Var.b - f13) * f10) + f13));
                    } else {
                        path.moveTo(AndroidUtilities.dpf2(ge0Var.a), AndroidUtilities.dpf2(ge0Var.b));
                    }
                } else if (obj2 instanceof fe0) {
                    fe0 fe0Var = (fe0) obj2;
                    fe0 fe0Var2 = (fe0) obj;
                    if (fe0Var2 != null) {
                        float f14 = fe0Var2.a;
                        float dpf22 = AndroidUtilities.dpf2(((fe0Var.a - f14) * f10) + f14);
                        float f15 = fe0Var2.b;
                        path.lineTo(dpf22, AndroidUtilities.dpf2(((fe0Var.b - f15) * f10) + f15));
                    } else {
                        path.lineTo(AndroidUtilities.dpf2(fe0Var.a), AndroidUtilities.dpf2(fe0Var.b));
                    }
                } else if (obj2 instanceof de0) {
                    de0 de0Var = (de0) obj2;
                    de0 de0Var2 = (de0) obj;
                    if (de0Var2 != null) {
                        float f16 = de0Var2.c;
                        float dpf23 = AndroidUtilities.dpf2(((de0Var.c - f16) * f10) + f16);
                        float f17 = de0Var2.d;
                        float dpf24 = AndroidUtilities.dpf2(((de0Var.d - f17) * f10) + f17);
                        float f18 = de0Var2.e;
                        float dpf25 = AndroidUtilities.dpf2(((de0Var.e - f18) * f10) + f18);
                        float f19 = de0Var2.f;
                        float dpf26 = AndroidUtilities.dpf2(((de0Var.f - f19) * f10) + f19);
                        float f20 = de0Var2.a;
                        float dpf27 = AndroidUtilities.dpf2(((de0Var.a - f20) * f10) + f20);
                        float f21 = de0Var2.b;
                        path.cubicTo(dpf23, dpf24, dpf25, dpf26, dpf27, AndroidUtilities.dpf2(((de0Var.b - f21) * f10) + f21));
                    } else {
                        path.cubicTo(AndroidUtilities.dpf2(de0Var.c), AndroidUtilities.dpf2(de0Var.d), AndroidUtilities.dpf2(de0Var.e), AndroidUtilities.dpf2(de0Var.f), AndroidUtilities.dpf2(de0Var.a), AndroidUtilities.dpf2(de0Var.b));
                    }
                }
            }
            path.close();
        }
        canvas.drawPath(path, paint);
    }
}
