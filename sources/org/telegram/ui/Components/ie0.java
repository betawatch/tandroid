package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ie0 {
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
            fe0 fe0Var = new fe0();
            fe0Var.a = new ArrayList();
            fe0Var.b = f7 * this.f;
            String[] split = str.split(" ");
            int i10 = 0;
            while (i10 < split.length) {
                char charAt = split[i10].charAt(0);
                if (charAt == 'C') {
                    ee0 ee0Var = new ee0();
                    ee0Var.c = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    ee0Var.d = (Float.parseFloat(split[i10 + 2]) + f10) * f12;
                    ee0Var.e = (Float.parseFloat(split[i10 + 3]) + f11) * f12;
                    ee0Var.f = (Float.parseFloat(split[i10 + 4]) + f10) * f12;
                    ee0Var.a = (Float.parseFloat(split[i10 + 5]) + f11) * f12;
                    i10 += 6;
                    ee0Var.b = (Float.parseFloat(split[i10]) + f10) * f12;
                    fe0Var.a.add(ee0Var);
                } else if (charAt == 'L') {
                    ge0 ge0Var = new ge0();
                    ge0Var.a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    i10 += 2;
                    ge0Var.b = (Float.parseFloat(split[i10]) + f10) * f12;
                    fe0Var.a.add(ge0Var);
                } else if (charAt == 'M') {
                    he0 he0Var = new he0();
                    he0Var.a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    i10 += 2;
                    he0Var.b = (Float.parseFloat(split[i10]) + f10) * f12;
                    fe0Var.a.add(he0Var);
                }
                i10++;
            }
            this.g.add(fe0Var);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void b(Canvas canvas, Paint paint, float f7) {
        fe0 fe0Var;
        fe0 fe0Var2;
        float f10;
        ArrayList arrayList = this.g;
        Path path = this.a;
        if (this.b != f7) {
            this.b = f7;
            int size = arrayList.size();
            fe0 fe0Var3 = null;
            fe0 fe0Var4 = null;
            for (int i10 = 0; i10 < size; i10++) {
                fe0 fe0Var5 = (fe0) arrayList.get(i10);
                if ((fe0Var4 == null || fe0Var4.b < fe0Var5.b) && fe0Var5.b <= f7) {
                    fe0Var4 = fe0Var5;
                }
                if ((fe0Var3 == null || fe0Var3.b > fe0Var5.b) && fe0Var5.b >= f7) {
                    fe0Var3 = fe0Var5;
                }
            }
            if (fe0Var3 == fe0Var4) {
                fe0Var4 = null;
            }
            if (fe0Var4 == null || fe0Var3 != null) {
                fe0Var = fe0Var3;
                fe0Var2 = fe0Var4;
            } else {
                fe0Var = fe0Var4;
                fe0Var2 = null;
            }
            if (fe0Var == null) {
                return;
            }
            ArrayList arrayList2 = fe0Var.a;
            if (fe0Var2 != null && fe0Var2.a.size() != arrayList2.size()) {
                return;
            }
            path.reset();
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                Object obj = fe0Var2 != null ? fe0Var2.a.get(i11) : null;
                Object obj2 = arrayList2.get(i11);
                if (obj != null && obj.getClass() != obj2.getClass()) {
                    return;
                }
                if (fe0Var2 != null) {
                    float f11 = fe0Var2.b;
                    f10 = (f7 - f11) / (fe0Var.b - f11);
                } else {
                    f10 = 1.0f;
                }
                if (obj2 instanceof he0) {
                    he0 he0Var = (he0) obj2;
                    he0 he0Var2 = (he0) obj;
                    if (he0Var2 != null) {
                        float f12 = he0Var2.a;
                        float dpf2 = AndroidUtilities.dpf2(((he0Var.a - f12) * f10) + f12);
                        float f13 = he0Var2.b;
                        path.moveTo(dpf2, AndroidUtilities.dpf2(((he0Var.b - f13) * f10) + f13));
                    } else {
                        path.moveTo(AndroidUtilities.dpf2(he0Var.a), AndroidUtilities.dpf2(he0Var.b));
                    }
                } else if (obj2 instanceof ge0) {
                    ge0 ge0Var = (ge0) obj2;
                    ge0 ge0Var2 = (ge0) obj;
                    if (ge0Var2 != null) {
                        float f14 = ge0Var2.a;
                        float dpf22 = AndroidUtilities.dpf2(((ge0Var.a - f14) * f10) + f14);
                        float f15 = ge0Var2.b;
                        path.lineTo(dpf22, AndroidUtilities.dpf2(((ge0Var.b - f15) * f10) + f15));
                    } else {
                        path.lineTo(AndroidUtilities.dpf2(ge0Var.a), AndroidUtilities.dpf2(ge0Var.b));
                    }
                } else if (obj2 instanceof ee0) {
                    ee0 ee0Var = (ee0) obj2;
                    ee0 ee0Var2 = (ee0) obj;
                    if (ee0Var2 != null) {
                        float f16 = ee0Var2.c;
                        float dpf23 = AndroidUtilities.dpf2(((ee0Var.c - f16) * f10) + f16);
                        float f17 = ee0Var2.d;
                        float dpf24 = AndroidUtilities.dpf2(((ee0Var.d - f17) * f10) + f17);
                        float f18 = ee0Var2.e;
                        float dpf25 = AndroidUtilities.dpf2(((ee0Var.e - f18) * f10) + f18);
                        float f19 = ee0Var2.f;
                        float dpf26 = AndroidUtilities.dpf2(((ee0Var.f - f19) * f10) + f19);
                        float f20 = ee0Var2.a;
                        float dpf27 = AndroidUtilities.dpf2(((ee0Var.a - f20) * f10) + f20);
                        float f21 = ee0Var2.b;
                        path.cubicTo(dpf23, dpf24, dpf25, dpf26, dpf27, AndroidUtilities.dpf2(((ee0Var.b - f21) * f10) + f21));
                    } else {
                        path.cubicTo(AndroidUtilities.dpf2(ee0Var.c), AndroidUtilities.dpf2(ee0Var.d), AndroidUtilities.dpf2(ee0Var.e), AndroidUtilities.dpf2(ee0Var.f), AndroidUtilities.dpf2(ee0Var.a), AndroidUtilities.dpf2(ee0Var.b));
                    }
                }
            }
            path.close();
        }
        canvas.drawPath(path, paint);
    }
}
