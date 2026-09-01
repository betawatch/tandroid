package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ee0 {
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
            be0 be0Var = new be0();
            be0Var.a = new ArrayList();
            be0Var.b = f10 * this.f;
            String[] split = str.split(" ");
            int i10 = 0;
            while (i10 < split.length) {
                char charAt = split[i10].charAt(0);
                if (charAt == 'C') {
                    ae0 ae0Var = new ae0();
                    ae0Var.c = (Float.parseFloat(split[i10 + 1]) + f12) * f13;
                    ae0Var.d = (Float.parseFloat(split[i10 + 2]) + f11) * f13;
                    ae0Var.e = (Float.parseFloat(split[i10 + 3]) + f12) * f13;
                    ae0Var.f = (Float.parseFloat(split[i10 + 4]) + f11) * f13;
                    ae0Var.a = (Float.parseFloat(split[i10 + 5]) + f12) * f13;
                    i10 += 6;
                    ae0Var.b = (Float.parseFloat(split[i10]) + f11) * f13;
                    be0Var.a.add(ae0Var);
                } else if (charAt == 'L') {
                    ce0 ce0Var = new ce0();
                    ce0Var.a = (Float.parseFloat(split[i10 + 1]) + f12) * f13;
                    i10 += 2;
                    ce0Var.b = (Float.parseFloat(split[i10]) + f11) * f13;
                    be0Var.a.add(ce0Var);
                } else if (charAt == 'M') {
                    de0 de0Var = new de0();
                    de0Var.a = (Float.parseFloat(split[i10 + 1]) + f12) * f13;
                    i10 += 2;
                    de0Var.b = (Float.parseFloat(split[i10]) + f11) * f13;
                    be0Var.a.add(de0Var);
                }
                i10++;
            }
            this.g.add(be0Var);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    public final void b(Canvas canvas, Paint paint, float f10) {
        be0 be0Var;
        be0 be0Var2;
        float f11;
        ArrayList arrayList = this.g;
        Path path = this.a;
        if (this.b != f10) {
            this.b = f10;
            int size = arrayList.size();
            be0 be0Var3 = null;
            be0 be0Var4 = null;
            for (int i10 = 0; i10 < size; i10++) {
                be0 be0Var5 = (be0) arrayList.get(i10);
                if ((be0Var4 == null || be0Var4.b < be0Var5.b) && be0Var5.b <= f10) {
                    be0Var4 = be0Var5;
                }
                if ((be0Var3 == null || be0Var3.b > be0Var5.b) && be0Var5.b >= f10) {
                    be0Var3 = be0Var5;
                }
            }
            if (be0Var3 == be0Var4) {
                be0Var4 = null;
            }
            if (be0Var4 == null || be0Var3 != null) {
                be0Var = be0Var3;
                be0Var2 = be0Var4;
            } else {
                be0Var = be0Var4;
                be0Var2 = null;
            }
            if (be0Var == null) {
                return;
            }
            ArrayList arrayList2 = be0Var.a;
            if (be0Var2 != null && be0Var2.a.size() != arrayList2.size()) {
                return;
            }
            path.reset();
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                Object obj = be0Var2 != null ? be0Var2.a.get(i11) : null;
                Object obj2 = arrayList2.get(i11);
                if (obj != null && obj.getClass() != obj2.getClass()) {
                    return;
                }
                if (be0Var2 != null) {
                    float f12 = be0Var2.b;
                    f11 = (f10 - f12) / (be0Var.b - f12);
                } else {
                    f11 = 1.0f;
                }
                if (obj2 instanceof de0) {
                    de0 de0Var = (de0) obj2;
                    de0 de0Var2 = (de0) obj;
                    if (de0Var2 != null) {
                        float f13 = de0Var2.a;
                        float dpf2 = AndroidUtilities.dpf2(((de0Var.a - f13) * f11) + f13);
                        float f14 = de0Var2.b;
                        path.moveTo(dpf2, AndroidUtilities.dpf2(((de0Var.b - f14) * f11) + f14));
                    } else {
                        path.moveTo(AndroidUtilities.dpf2(de0Var.a), AndroidUtilities.dpf2(de0Var.b));
                    }
                } else if (obj2 instanceof ce0) {
                    ce0 ce0Var = (ce0) obj2;
                    ce0 ce0Var2 = (ce0) obj;
                    if (ce0Var2 != null) {
                        float f15 = ce0Var2.a;
                        float dpf22 = AndroidUtilities.dpf2(((ce0Var.a - f15) * f11) + f15);
                        float f16 = ce0Var2.b;
                        path.lineTo(dpf22, AndroidUtilities.dpf2(((ce0Var.b - f16) * f11) + f16));
                    } else {
                        path.lineTo(AndroidUtilities.dpf2(ce0Var.a), AndroidUtilities.dpf2(ce0Var.b));
                    }
                } else if (obj2 instanceof ae0) {
                    ae0 ae0Var = (ae0) obj2;
                    ae0 ae0Var2 = (ae0) obj;
                    if (ae0Var2 != null) {
                        float f17 = ae0Var2.c;
                        float dpf23 = AndroidUtilities.dpf2(((ae0Var.c - f17) * f11) + f17);
                        float f18 = ae0Var2.d;
                        float dpf24 = AndroidUtilities.dpf2(((ae0Var.d - f18) * f11) + f18);
                        float f19 = ae0Var2.e;
                        float dpf25 = AndroidUtilities.dpf2(((ae0Var.e - f19) * f11) + f19);
                        float f20 = ae0Var2.f;
                        float dpf26 = AndroidUtilities.dpf2(((ae0Var.f - f20) * f11) + f20);
                        float f21 = ae0Var2.a;
                        float dpf27 = AndroidUtilities.dpf2(((ae0Var.a - f21) * f11) + f21);
                        float f22 = ae0Var2.b;
                        path.cubicTo(dpf23, dpf24, dpf25, dpf26, dpf27, AndroidUtilities.dpf2(((ae0Var.b - f22) * f11) + f22));
                    } else {
                        path.cubicTo(AndroidUtilities.dpf2(ae0Var.c), AndroidUtilities.dpf2(ae0Var.d), AndroidUtilities.dpf2(ae0Var.e), AndroidUtilities.dpf2(ae0Var.f), AndroidUtilities.dpf2(ae0Var.a), AndroidUtilities.dpf2(ae0Var.b));
                    }
                }
            }
            path.close();
        }
        canvas.drawPath(path, paint);
    }
}
