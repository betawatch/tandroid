package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class se0 {
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
            pe0 pe0Var = new pe0();
            pe0Var.a = new ArrayList();
            pe0Var.b = f7 * this.f;
            String[] split = str.split(" ");
            int i10 = 0;
            while (i10 < split.length) {
                char charAt = split[i10].charAt(0);
                if (charAt == 'C') {
                    oe0 oe0Var = new oe0();
                    oe0Var.c = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    oe0Var.d = (Float.parseFloat(split[i10 + 2]) + f10) * f12;
                    oe0Var.e = (Float.parseFloat(split[i10 + 3]) + f11) * f12;
                    oe0Var.f = (Float.parseFloat(split[i10 + 4]) + f10) * f12;
                    oe0Var.a = (Float.parseFloat(split[i10 + 5]) + f11) * f12;
                    i10 += 6;
                    oe0Var.b = (Float.parseFloat(split[i10]) + f10) * f12;
                    pe0Var.a.add(oe0Var);
                } else if (charAt == 'L') {
                    qe0 qe0Var = new qe0();
                    qe0Var.a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    i10 += 2;
                    qe0Var.b = (Float.parseFloat(split[i10]) + f10) * f12;
                    pe0Var.a.add(qe0Var);
                } else if (charAt == 'M') {
                    re0 re0Var = new re0();
                    re0Var.a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    i10 += 2;
                    re0Var.b = (Float.parseFloat(split[i10]) + f10) * f12;
                    pe0Var.a.add(re0Var);
                }
                i10++;
            }
            this.g.add(pe0Var);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void b(Canvas canvas, Paint paint, float f7) {
        pe0 pe0Var;
        pe0 pe0Var2;
        float f10;
        ArrayList arrayList = this.g;
        Path path = this.a;
        if (this.b != f7) {
            this.b = f7;
            int size = arrayList.size();
            pe0 pe0Var3 = null;
            pe0 pe0Var4 = null;
            for (int i10 = 0; i10 < size; i10++) {
                pe0 pe0Var5 = (pe0) arrayList.get(i10);
                if ((pe0Var4 == null || pe0Var4.b < pe0Var5.b) && pe0Var5.b <= f7) {
                    pe0Var4 = pe0Var5;
                }
                if ((pe0Var3 == null || pe0Var3.b > pe0Var5.b) && pe0Var5.b >= f7) {
                    pe0Var3 = pe0Var5;
                }
            }
            if (pe0Var3 == pe0Var4) {
                pe0Var4 = null;
            }
            if (pe0Var4 == null || pe0Var3 != null) {
                pe0Var = pe0Var3;
                pe0Var2 = pe0Var4;
            } else {
                pe0Var = pe0Var4;
                pe0Var2 = null;
            }
            if (pe0Var == null) {
                return;
            }
            ArrayList arrayList2 = pe0Var.a;
            if (pe0Var2 != null && pe0Var2.a.size() != arrayList2.size()) {
                return;
            }
            path.reset();
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                Object obj = pe0Var2 != null ? pe0Var2.a.get(i11) : null;
                Object obj2 = arrayList2.get(i11);
                if (obj != null && obj.getClass() != obj2.getClass()) {
                    return;
                }
                if (pe0Var2 != null) {
                    float f11 = pe0Var2.b;
                    f10 = (f7 - f11) / (pe0Var.b - f11);
                } else {
                    f10 = 1.0f;
                }
                if (obj2 instanceof re0) {
                    re0 re0Var = (re0) obj2;
                    re0 re0Var2 = (re0) obj;
                    if (re0Var2 != null) {
                        float f12 = re0Var2.a;
                        float dpf2 = AndroidUtilities.dpf2(((re0Var.a - f12) * f10) + f12);
                        float f13 = re0Var2.b;
                        path.moveTo(dpf2, AndroidUtilities.dpf2(((re0Var.b - f13) * f10) + f13));
                    } else {
                        path.moveTo(AndroidUtilities.dpf2(re0Var.a), AndroidUtilities.dpf2(re0Var.b));
                    }
                } else if (obj2 instanceof qe0) {
                    qe0 qe0Var = (qe0) obj2;
                    qe0 qe0Var2 = (qe0) obj;
                    if (qe0Var2 != null) {
                        float f14 = qe0Var2.a;
                        float dpf22 = AndroidUtilities.dpf2(((qe0Var.a - f14) * f10) + f14);
                        float f15 = qe0Var2.b;
                        path.lineTo(dpf22, AndroidUtilities.dpf2(((qe0Var.b - f15) * f10) + f15));
                    } else {
                        path.lineTo(AndroidUtilities.dpf2(qe0Var.a), AndroidUtilities.dpf2(qe0Var.b));
                    }
                } else if (obj2 instanceof oe0) {
                    oe0 oe0Var = (oe0) obj2;
                    oe0 oe0Var2 = (oe0) obj;
                    if (oe0Var2 != null) {
                        float f16 = oe0Var2.c;
                        float dpf23 = AndroidUtilities.dpf2(((oe0Var.c - f16) * f10) + f16);
                        float f17 = oe0Var2.d;
                        float dpf24 = AndroidUtilities.dpf2(((oe0Var.d - f17) * f10) + f17);
                        float f18 = oe0Var2.e;
                        float dpf25 = AndroidUtilities.dpf2(((oe0Var.e - f18) * f10) + f18);
                        float f19 = oe0Var2.f;
                        float dpf26 = AndroidUtilities.dpf2(((oe0Var.f - f19) * f10) + f19);
                        float f20 = oe0Var2.a;
                        float dpf27 = AndroidUtilities.dpf2(((oe0Var.a - f20) * f10) + f20);
                        float f21 = oe0Var2.b;
                        path.cubicTo(dpf23, dpf24, dpf25, dpf26, dpf27, AndroidUtilities.dpf2(((oe0Var.b - f21) * f10) + f21));
                    } else {
                        path.cubicTo(AndroidUtilities.dpf2(oe0Var.c), AndroidUtilities.dpf2(oe0Var.d), AndroidUtilities.dpf2(oe0Var.e), AndroidUtilities.dpf2(oe0Var.f), AndroidUtilities.dpf2(oe0Var.a), AndroidUtilities.dpf2(oe0Var.b));
                    }
                }
            }
            path.close();
        }
        canvas.drawPath(path, paint);
    }
}
