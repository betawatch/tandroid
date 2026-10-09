package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class af0 {
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
            xe0 xe0Var = new xe0();
            xe0Var.a = new ArrayList();
            xe0Var.b = f7 * this.f;
            String[] split = str.split(" ");
            int i10 = 0;
            while (i10 < split.length) {
                char charAt = split[i10].charAt(0);
                if (charAt == 'C') {
                    we0 we0Var = new we0();
                    we0Var.c = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    we0Var.d = (Float.parseFloat(split[i10 + 2]) + f10) * f12;
                    we0Var.e = (Float.parseFloat(split[i10 + 3]) + f11) * f12;
                    we0Var.f = (Float.parseFloat(split[i10 + 4]) + f10) * f12;
                    we0Var.a = (Float.parseFloat(split[i10 + 5]) + f11) * f12;
                    i10 += 6;
                    we0Var.b = (Float.parseFloat(split[i10]) + f10) * f12;
                    xe0Var.a.add(we0Var);
                } else if (charAt == 'L') {
                    ye0 ye0Var = new ye0();
                    ye0Var.a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    i10 += 2;
                    ye0Var.b = (Float.parseFloat(split[i10]) + f10) * f12;
                    xe0Var.a.add(ye0Var);
                } else if (charAt == 'M') {
                    ze0 ze0Var = new ze0();
                    ze0Var.a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    i10 += 2;
                    ze0Var.b = (Float.parseFloat(split[i10]) + f10) * f12;
                    xe0Var.a.add(ze0Var);
                }
                i10++;
            }
            this.g.add(xe0Var);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final void b(Canvas canvas, Paint paint, float f7) {
        xe0 xe0Var;
        xe0 xe0Var2;
        float f10;
        ArrayList arrayList = this.g;
        Path path = this.a;
        if (this.b != f7) {
            this.b = f7;
            int size = arrayList.size();
            xe0 xe0Var3 = null;
            xe0 xe0Var4 = null;
            for (int i10 = 0; i10 < size; i10++) {
                xe0 xe0Var5 = (xe0) arrayList.get(i10);
                if ((xe0Var4 == null || xe0Var4.b < xe0Var5.b) && xe0Var5.b <= f7) {
                    xe0Var4 = xe0Var5;
                }
                if ((xe0Var3 == null || xe0Var3.b > xe0Var5.b) && xe0Var5.b >= f7) {
                    xe0Var3 = xe0Var5;
                }
            }
            if (xe0Var3 == xe0Var4) {
                xe0Var4 = null;
            }
            if (xe0Var4 == null || xe0Var3 != null) {
                xe0Var = xe0Var3;
                xe0Var2 = xe0Var4;
            } else {
                xe0Var = xe0Var4;
                xe0Var2 = null;
            }
            if (xe0Var == null) {
                return;
            }
            ArrayList arrayList2 = xe0Var.a;
            if (xe0Var2 != null && xe0Var2.a.size() != arrayList2.size()) {
                return;
            }
            path.reset();
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                Object obj = xe0Var2 != null ? xe0Var2.a.get(i11) : null;
                Object obj2 = arrayList2.get(i11);
                if (obj != null && obj.getClass() != obj2.getClass()) {
                    return;
                }
                if (xe0Var2 != null) {
                    float f11 = xe0Var2.b;
                    f10 = (f7 - f11) / (xe0Var.b - f11);
                } else {
                    f10 = 1.0f;
                }
                if (obj2 instanceof ze0) {
                    ze0 ze0Var = (ze0) obj2;
                    ze0 ze0Var2 = (ze0) obj;
                    if (ze0Var2 != null) {
                        float f12 = ze0Var2.a;
                        float dpf2 = AndroidUtilities.dpf2(((ze0Var.a - f12) * f10) + f12);
                        float f13 = ze0Var2.b;
                        path.moveTo(dpf2, AndroidUtilities.dpf2(((ze0Var.b - f13) * f10) + f13));
                    } else {
                        path.moveTo(AndroidUtilities.dpf2(ze0Var.a), AndroidUtilities.dpf2(ze0Var.b));
                    }
                } else if (obj2 instanceof ye0) {
                    ye0 ye0Var = (ye0) obj2;
                    ye0 ye0Var2 = (ye0) obj;
                    if (ye0Var2 != null) {
                        float f14 = ye0Var2.a;
                        float dpf22 = AndroidUtilities.dpf2(((ye0Var.a - f14) * f10) + f14);
                        float f15 = ye0Var2.b;
                        path.lineTo(dpf22, AndroidUtilities.dpf2(((ye0Var.b - f15) * f10) + f15));
                    } else {
                        path.lineTo(AndroidUtilities.dpf2(ye0Var.a), AndroidUtilities.dpf2(ye0Var.b));
                    }
                } else if (obj2 instanceof we0) {
                    we0 we0Var = (we0) obj2;
                    we0 we0Var2 = (we0) obj;
                    if (we0Var2 != null) {
                        float f16 = we0Var2.c;
                        float dpf23 = AndroidUtilities.dpf2(((we0Var.c - f16) * f10) + f16);
                        float f17 = we0Var2.d;
                        float dpf24 = AndroidUtilities.dpf2(((we0Var.d - f17) * f10) + f17);
                        float f18 = we0Var2.e;
                        float dpf25 = AndroidUtilities.dpf2(((we0Var.e - f18) * f10) + f18);
                        float f19 = we0Var2.f;
                        float dpf26 = AndroidUtilities.dpf2(((we0Var.f - f19) * f10) + f19);
                        float f20 = we0Var2.a;
                        float dpf27 = AndroidUtilities.dpf2(((we0Var.a - f20) * f10) + f20);
                        float f21 = we0Var2.b;
                        path.cubicTo(dpf23, dpf24, dpf25, dpf26, dpf27, AndroidUtilities.dpf2(((we0Var.b - f21) * f10) + f21));
                    } else {
                        path.cubicTo(AndroidUtilities.dpf2(we0Var.c), AndroidUtilities.dpf2(we0Var.d), AndroidUtilities.dpf2(we0Var.e), AndroidUtilities.dpf2(we0Var.f), AndroidUtilities.dpf2(we0Var.a), AndroidUtilities.dpf2(we0Var.b));
                    }
                }
            }
            path.close();
        }
        canvas.drawPath(path, paint);
    }
}
