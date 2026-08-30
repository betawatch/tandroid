package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ce0 {
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
            zd0 zd0Var = new zd0();
            zd0Var.a = new ArrayList();
            zd0Var.b = f10 * this.f;
            String[] split = str.split(" ");
            int i10 = 0;
            while (i10 < split.length) {
                char charAt = split[i10].charAt(0);
                if (charAt == 'C') {
                    yd0 yd0Var = new yd0();
                    yd0Var.c = (Float.parseFloat(split[i10 + 1]) + f12) * f13;
                    yd0Var.d = (Float.parseFloat(split[i10 + 2]) + f11) * f13;
                    yd0Var.e = (Float.parseFloat(split[i10 + 3]) + f12) * f13;
                    yd0Var.f = (Float.parseFloat(split[i10 + 4]) + f11) * f13;
                    yd0Var.a = (Float.parseFloat(split[i10 + 5]) + f12) * f13;
                    i10 += 6;
                    yd0Var.b = (Float.parseFloat(split[i10]) + f11) * f13;
                    zd0Var.a.add(yd0Var);
                } else if (charAt == 'L') {
                    ae0 ae0Var = new ae0();
                    ae0Var.a = (Float.parseFloat(split[i10 + 1]) + f12) * f13;
                    i10 += 2;
                    ae0Var.b = (Float.parseFloat(split[i10]) + f11) * f13;
                    zd0Var.a.add(ae0Var);
                } else if (charAt == 'M') {
                    be0 be0Var = new be0();
                    be0Var.a = (Float.parseFloat(split[i10 + 1]) + f12) * f13;
                    i10 += 2;
                    be0Var.b = (Float.parseFloat(split[i10]) + f11) * f13;
                    zd0Var.a.add(be0Var);
                }
                i10++;
            }
            this.g.add(zd0Var);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void b(Canvas canvas, Paint paint, float f10) {
        zd0 zd0Var;
        zd0 zd0Var2;
        float f11;
        ArrayList arrayList = this.g;
        Path path = this.a;
        if (this.b != f10) {
            this.b = f10;
            int size = arrayList.size();
            zd0 zd0Var3 = null;
            zd0 zd0Var4 = null;
            for (int i10 = 0; i10 < size; i10++) {
                zd0 zd0Var5 = (zd0) arrayList.get(i10);
                if ((zd0Var4 == null || zd0Var4.b < zd0Var5.b) && zd0Var5.b <= f10) {
                    zd0Var4 = zd0Var5;
                }
                if ((zd0Var3 == null || zd0Var3.b > zd0Var5.b) && zd0Var5.b >= f10) {
                    zd0Var3 = zd0Var5;
                }
            }
            if (zd0Var3 == zd0Var4) {
                zd0Var4 = null;
            }
            if (zd0Var4 == null || zd0Var3 != null) {
                zd0Var = zd0Var3;
                zd0Var2 = zd0Var4;
            } else {
                zd0Var = zd0Var4;
                zd0Var2 = null;
            }
            if (zd0Var == null) {
                return;
            }
            ArrayList arrayList2 = zd0Var.a;
            if (zd0Var2 != null && zd0Var2.a.size() != arrayList2.size()) {
                return;
            }
            path.reset();
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                Object obj = zd0Var2 != null ? zd0Var2.a.get(i11) : null;
                Object obj2 = arrayList2.get(i11);
                if (obj != null && obj.getClass() != obj2.getClass()) {
                    return;
                }
                if (zd0Var2 != null) {
                    float f12 = zd0Var2.b;
                    f11 = (f10 - f12) / (zd0Var.b - f12);
                } else {
                    f11 = 1.0f;
                }
                if (obj2 instanceof be0) {
                    be0 be0Var = (be0) obj2;
                    be0 be0Var2 = (be0) obj;
                    if (be0Var2 != null) {
                        float f13 = be0Var2.a;
                        float dpf2 = AndroidUtilities.dpf2(((be0Var.a - f13) * f11) + f13);
                        float f14 = be0Var2.b;
                        path.moveTo(dpf2, AndroidUtilities.dpf2(((be0Var.b - f14) * f11) + f14));
                    } else {
                        path.moveTo(AndroidUtilities.dpf2(be0Var.a), AndroidUtilities.dpf2(be0Var.b));
                    }
                } else if (obj2 instanceof ae0) {
                    ae0 ae0Var = (ae0) obj2;
                    ae0 ae0Var2 = (ae0) obj;
                    if (ae0Var2 != null) {
                        float f15 = ae0Var2.a;
                        float dpf22 = AndroidUtilities.dpf2(((ae0Var.a - f15) * f11) + f15);
                        float f16 = ae0Var2.b;
                        path.lineTo(dpf22, AndroidUtilities.dpf2(((ae0Var.b - f16) * f11) + f16));
                    } else {
                        path.lineTo(AndroidUtilities.dpf2(ae0Var.a), AndroidUtilities.dpf2(ae0Var.b));
                    }
                } else if (obj2 instanceof yd0) {
                    yd0 yd0Var = (yd0) obj2;
                    yd0 yd0Var2 = (yd0) obj;
                    if (yd0Var2 != null) {
                        float f17 = yd0Var2.c;
                        float dpf23 = AndroidUtilities.dpf2(((yd0Var.c - f17) * f11) + f17);
                        float f18 = yd0Var2.d;
                        float dpf24 = AndroidUtilities.dpf2(((yd0Var.d - f18) * f11) + f18);
                        float f19 = yd0Var2.e;
                        float dpf25 = AndroidUtilities.dpf2(((yd0Var.e - f19) * f11) + f19);
                        float f20 = yd0Var2.f;
                        float dpf26 = AndroidUtilities.dpf2(((yd0Var.f - f20) * f11) + f20);
                        float f21 = yd0Var2.a;
                        float dpf27 = AndroidUtilities.dpf2(((yd0Var.a - f21) * f11) + f21);
                        float f22 = yd0Var2.b;
                        path.cubicTo(dpf23, dpf24, dpf25, dpf26, dpf27, AndroidUtilities.dpf2(((yd0Var.b - f22) * f11) + f22));
                    } else {
                        path.cubicTo(AndroidUtilities.dpf2(yd0Var.c), AndroidUtilities.dpf2(yd0Var.d), AndroidUtilities.dpf2(yd0Var.e), AndroidUtilities.dpf2(yd0Var.f), AndroidUtilities.dpf2(yd0Var.a), AndroidUtilities.dpf2(yd0Var.b));
                    }
                }
            }
            path.close();
        }
        canvas.drawPath(path, paint);
    }
}
