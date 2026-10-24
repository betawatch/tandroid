package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class we0 {
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
            te0 te0Var = new te0();
            te0Var.a = new ArrayList();
            te0Var.b = f7 * this.f;
            String[] split = str.split(" ");
            int i10 = 0;
            while (i10 < split.length) {
                char charAt = split[i10].charAt(0);
                if (charAt == 'C') {
                    se0 se0Var = new se0();
                    se0Var.c = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    se0Var.d = (Float.parseFloat(split[i10 + 2]) + f10) * f12;
                    se0Var.e = (Float.parseFloat(split[i10 + 3]) + f11) * f12;
                    se0Var.f = (Float.parseFloat(split[i10 + 4]) + f10) * f12;
                    se0Var.a = (Float.parseFloat(split[i10 + 5]) + f11) * f12;
                    i10 += 6;
                    se0Var.b = (Float.parseFloat(split[i10]) + f10) * f12;
                    te0Var.a.add(se0Var);
                } else if (charAt == 'L') {
                    ue0 ue0Var = new ue0();
                    ue0Var.a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    i10 += 2;
                    ue0Var.b = (Float.parseFloat(split[i10]) + f10) * f12;
                    te0Var.a.add(ue0Var);
                } else if (charAt == 'M') {
                    ve0 ve0Var = new ve0();
                    ve0Var.a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    i10 += 2;
                    ve0Var.b = (Float.parseFloat(split[i10]) + f10) * f12;
                    te0Var.a.add(ve0Var);
                }
                i10++;
            }
            this.g.add(te0Var);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void b(Canvas canvas, Paint paint, float f7) {
        te0 te0Var;
        te0 te0Var2;
        float f10;
        ArrayList arrayList = this.g;
        Path path = this.a;
        if (this.b != f7) {
            this.b = f7;
            int size = arrayList.size();
            te0 te0Var3 = null;
            te0 te0Var4 = null;
            for (int i10 = 0; i10 < size; i10++) {
                te0 te0Var5 = (te0) arrayList.get(i10);
                if ((te0Var4 == null || te0Var4.b < te0Var5.b) && te0Var5.b <= f7) {
                    te0Var4 = te0Var5;
                }
                if ((te0Var3 == null || te0Var3.b > te0Var5.b) && te0Var5.b >= f7) {
                    te0Var3 = te0Var5;
                }
            }
            if (te0Var3 == te0Var4) {
                te0Var4 = null;
            }
            if (te0Var4 == null || te0Var3 != null) {
                te0Var = te0Var3;
                te0Var2 = te0Var4;
            } else {
                te0Var = te0Var4;
                te0Var2 = null;
            }
            if (te0Var == null) {
                return;
            }
            ArrayList arrayList2 = te0Var.a;
            if (te0Var2 != null && te0Var2.a.size() != arrayList2.size()) {
                return;
            }
            path.reset();
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                Object obj = te0Var2 != null ? te0Var2.a.get(i11) : null;
                Object obj2 = arrayList2.get(i11);
                if (obj != null && obj.getClass() != obj2.getClass()) {
                    return;
                }
                if (te0Var2 != null) {
                    float f11 = te0Var2.b;
                    f10 = (f7 - f11) / (te0Var.b - f11);
                } else {
                    f10 = 1.0f;
                }
                if (obj2 instanceof ve0) {
                    ve0 ve0Var = (ve0) obj2;
                    ve0 ve0Var2 = (ve0) obj;
                    if (ve0Var2 != null) {
                        float f12 = ve0Var2.a;
                        float dpf2 = AndroidUtilities.dpf2(((ve0Var.a - f12) * f10) + f12);
                        float f13 = ve0Var2.b;
                        path.moveTo(dpf2, AndroidUtilities.dpf2(((ve0Var.b - f13) * f10) + f13));
                    } else {
                        path.moveTo(AndroidUtilities.dpf2(ve0Var.a), AndroidUtilities.dpf2(ve0Var.b));
                    }
                } else if (obj2 instanceof ue0) {
                    ue0 ue0Var = (ue0) obj2;
                    ue0 ue0Var2 = (ue0) obj;
                    if (ue0Var2 != null) {
                        float f14 = ue0Var2.a;
                        float dpf22 = AndroidUtilities.dpf2(((ue0Var.a - f14) * f10) + f14);
                        float f15 = ue0Var2.b;
                        path.lineTo(dpf22, AndroidUtilities.dpf2(((ue0Var.b - f15) * f10) + f15));
                    } else {
                        path.lineTo(AndroidUtilities.dpf2(ue0Var.a), AndroidUtilities.dpf2(ue0Var.b));
                    }
                } else if (obj2 instanceof se0) {
                    se0 se0Var = (se0) obj2;
                    se0 se0Var2 = (se0) obj;
                    if (se0Var2 != null) {
                        float f16 = se0Var2.c;
                        float dpf23 = AndroidUtilities.dpf2(((se0Var.c - f16) * f10) + f16);
                        float f17 = se0Var2.d;
                        float dpf24 = AndroidUtilities.dpf2(((se0Var.d - f17) * f10) + f17);
                        float f18 = se0Var2.e;
                        float dpf25 = AndroidUtilities.dpf2(((se0Var.e - f18) * f10) + f18);
                        float f19 = se0Var2.f;
                        float dpf26 = AndroidUtilities.dpf2(((se0Var.f - f19) * f10) + f19);
                        float f20 = se0Var2.a;
                        float dpf27 = AndroidUtilities.dpf2(((se0Var.a - f20) * f10) + f20);
                        float f21 = se0Var2.b;
                        path.cubicTo(dpf23, dpf24, dpf25, dpf26, dpf27, AndroidUtilities.dpf2(((se0Var.b - f21) * f10) + f21));
                    } else {
                        path.cubicTo(AndroidUtilities.dpf2(se0Var.c), AndroidUtilities.dpf2(se0Var.d), AndroidUtilities.dpf2(se0Var.e), AndroidUtilities.dpf2(se0Var.f), AndroidUtilities.dpf2(se0Var.a), AndroidUtilities.dpf2(se0Var.b));
                    }
                }
            }
            path.close();
        }
        canvas.drawPath(path, paint);
    }
}
