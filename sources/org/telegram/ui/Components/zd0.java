package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class zd0 {
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
            wd0 wd0Var = new wd0();
            wd0Var.a = new ArrayList();
            wd0Var.b = f7 * this.f;
            String[] split = str.split(" ");
            int i10 = 0;
            while (i10 < split.length) {
                char charAt = split[i10].charAt(0);
                if (charAt == 'C') {
                    vd0 vd0Var = new vd0();
                    vd0Var.c = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    vd0Var.d = (Float.parseFloat(split[i10 + 2]) + f10) * f12;
                    vd0Var.e = (Float.parseFloat(split[i10 + 3]) + f11) * f12;
                    vd0Var.f = (Float.parseFloat(split[i10 + 4]) + f10) * f12;
                    vd0Var.a = (Float.parseFloat(split[i10 + 5]) + f11) * f12;
                    i10 += 6;
                    vd0Var.b = (Float.parseFloat(split[i10]) + f10) * f12;
                    wd0Var.a.add(vd0Var);
                } else if (charAt == 'L') {
                    xd0 xd0Var = new xd0();
                    xd0Var.a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    i10 += 2;
                    xd0Var.b = (Float.parseFloat(split[i10]) + f10) * f12;
                    wd0Var.a.add(xd0Var);
                } else if (charAt == 'M') {
                    yd0 yd0Var = new yd0();
                    yd0Var.a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    i10 += 2;
                    yd0Var.b = (Float.parseFloat(split[i10]) + f10) * f12;
                    wd0Var.a.add(yd0Var);
                }
                i10++;
            }
            this.g.add(wd0Var);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final void b(Canvas canvas, Paint paint, float f7) {
        wd0 wd0Var;
        wd0 wd0Var2;
        float f10;
        ArrayList arrayList = this.g;
        Path path = this.a;
        if (this.b != f7) {
            this.b = f7;
            int size = arrayList.size();
            wd0 wd0Var3 = null;
            wd0 wd0Var4 = null;
            for (int i10 = 0; i10 < size; i10++) {
                wd0 wd0Var5 = (wd0) arrayList.get(i10);
                if ((wd0Var4 == null || wd0Var4.b < wd0Var5.b) && wd0Var5.b <= f7) {
                    wd0Var4 = wd0Var5;
                }
                if ((wd0Var3 == null || wd0Var3.b > wd0Var5.b) && wd0Var5.b >= f7) {
                    wd0Var3 = wd0Var5;
                }
            }
            if (wd0Var3 == wd0Var4) {
                wd0Var4 = null;
            }
            if (wd0Var4 == null || wd0Var3 != null) {
                wd0Var = wd0Var3;
                wd0Var2 = wd0Var4;
            } else {
                wd0Var = wd0Var4;
                wd0Var2 = null;
            }
            if (wd0Var == null) {
                return;
            }
            ArrayList arrayList2 = wd0Var.a;
            if (wd0Var2 != null && wd0Var2.a.size() != arrayList2.size()) {
                return;
            }
            path.reset();
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                Object obj = wd0Var2 != null ? wd0Var2.a.get(i11) : null;
                Object obj2 = arrayList2.get(i11);
                if (obj != null && obj.getClass() != obj2.getClass()) {
                    return;
                }
                if (wd0Var2 != null) {
                    float f11 = wd0Var2.b;
                    f10 = (f7 - f11) / (wd0Var.b - f11);
                } else {
                    f10 = 1.0f;
                }
                if (obj2 instanceof yd0) {
                    yd0 yd0Var = (yd0) obj2;
                    yd0 yd0Var2 = (yd0) obj;
                    if (yd0Var2 != null) {
                        float f12 = yd0Var2.a;
                        float dpf2 = AndroidUtilities.dpf2(((yd0Var.a - f12) * f10) + f12);
                        float f13 = yd0Var2.b;
                        path.moveTo(dpf2, AndroidUtilities.dpf2(((yd0Var.b - f13) * f10) + f13));
                    } else {
                        path.moveTo(AndroidUtilities.dpf2(yd0Var.a), AndroidUtilities.dpf2(yd0Var.b));
                    }
                } else if (obj2 instanceof xd0) {
                    xd0 xd0Var = (xd0) obj2;
                    xd0 xd0Var2 = (xd0) obj;
                    if (xd0Var2 != null) {
                        float f14 = xd0Var2.a;
                        float dpf22 = AndroidUtilities.dpf2(((xd0Var.a - f14) * f10) + f14);
                        float f15 = xd0Var2.b;
                        path.lineTo(dpf22, AndroidUtilities.dpf2(((xd0Var.b - f15) * f10) + f15));
                    } else {
                        path.lineTo(AndroidUtilities.dpf2(xd0Var.a), AndroidUtilities.dpf2(xd0Var.b));
                    }
                } else if (obj2 instanceof vd0) {
                    vd0 vd0Var = (vd0) obj2;
                    vd0 vd0Var2 = (vd0) obj;
                    if (vd0Var2 != null) {
                        float f16 = vd0Var2.c;
                        float dpf23 = AndroidUtilities.dpf2(((vd0Var.c - f16) * f10) + f16);
                        float f17 = vd0Var2.d;
                        float dpf24 = AndroidUtilities.dpf2(((vd0Var.d - f17) * f10) + f17);
                        float f18 = vd0Var2.e;
                        float dpf25 = AndroidUtilities.dpf2(((vd0Var.e - f18) * f10) + f18);
                        float f19 = vd0Var2.f;
                        float dpf26 = AndroidUtilities.dpf2(((vd0Var.f - f19) * f10) + f19);
                        float f20 = vd0Var2.a;
                        float dpf27 = AndroidUtilities.dpf2(((vd0Var.a - f20) * f10) + f20);
                        float f21 = vd0Var2.b;
                        path.cubicTo(dpf23, dpf24, dpf25, dpf26, dpf27, AndroidUtilities.dpf2(((vd0Var.b - f21) * f10) + f21));
                    } else {
                        path.cubicTo(AndroidUtilities.dpf2(vd0Var.c), AndroidUtilities.dpf2(vd0Var.d), AndroidUtilities.dpf2(vd0Var.e), AndroidUtilities.dpf2(vd0Var.f), AndroidUtilities.dpf2(vd0Var.a), AndroidUtilities.dpf2(vd0Var.b));
                    }
                }
            }
            path.close();
        }
        canvas.drawPath(path, paint);
    }
}
