package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class te0 {
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
            qe0 qe0Var = new qe0();
            qe0Var.a = new ArrayList();
            qe0Var.b = f7 * this.f;
            String[] split = str.split(" ");
            int i10 = 0;
            while (i10 < split.length) {
                char charAt = split[i10].charAt(0);
                if (charAt == 'C') {
                    pe0 pe0Var = new pe0();
                    pe0Var.c = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    pe0Var.d = (Float.parseFloat(split[i10 + 2]) + f10) * f12;
                    pe0Var.e = (Float.parseFloat(split[i10 + 3]) + f11) * f12;
                    pe0Var.f = (Float.parseFloat(split[i10 + 4]) + f10) * f12;
                    pe0Var.a = (Float.parseFloat(split[i10 + 5]) + f11) * f12;
                    i10 += 6;
                    pe0Var.b = (Float.parseFloat(split[i10]) + f10) * f12;
                    qe0Var.a.add(pe0Var);
                } else if (charAt == 'L') {
                    re0 re0Var = new re0();
                    re0Var.a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    i10 += 2;
                    re0Var.b = (Float.parseFloat(split[i10]) + f10) * f12;
                    qe0Var.a.add(re0Var);
                } else if (charAt == 'M') {
                    se0 se0Var = new se0();
                    se0Var.a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    i10 += 2;
                    se0Var.b = (Float.parseFloat(split[i10]) + f10) * f12;
                    qe0Var.a.add(se0Var);
                }
                i10++;
            }
            this.g.add(qe0Var);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void b(Canvas canvas, Paint paint, float f7) {
        qe0 qe0Var;
        qe0 qe0Var2;
        float f10;
        ArrayList arrayList = this.g;
        Path path = this.a;
        if (this.b != f7) {
            this.b = f7;
            int size = arrayList.size();
            qe0 qe0Var3 = null;
            qe0 qe0Var4 = null;
            for (int i10 = 0; i10 < size; i10++) {
                qe0 qe0Var5 = (qe0) arrayList.get(i10);
                if ((qe0Var4 == null || qe0Var4.b < qe0Var5.b) && qe0Var5.b <= f7) {
                    qe0Var4 = qe0Var5;
                }
                if ((qe0Var3 == null || qe0Var3.b > qe0Var5.b) && qe0Var5.b >= f7) {
                    qe0Var3 = qe0Var5;
                }
            }
            if (qe0Var3 == qe0Var4) {
                qe0Var4 = null;
            }
            if (qe0Var4 == null || qe0Var3 != null) {
                qe0Var = qe0Var3;
                qe0Var2 = qe0Var4;
            } else {
                qe0Var = qe0Var4;
                qe0Var2 = null;
            }
            if (qe0Var == null) {
                return;
            }
            ArrayList arrayList2 = qe0Var.a;
            if (qe0Var2 != null && qe0Var2.a.size() != arrayList2.size()) {
                return;
            }
            path.reset();
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                Object obj = qe0Var2 != null ? qe0Var2.a.get(i11) : null;
                Object obj2 = arrayList2.get(i11);
                if (obj != null && obj.getClass() != obj2.getClass()) {
                    return;
                }
                if (qe0Var2 != null) {
                    float f11 = qe0Var2.b;
                    f10 = (f7 - f11) / (qe0Var.b - f11);
                } else {
                    f10 = 1.0f;
                }
                if (obj2 instanceof se0) {
                    se0 se0Var = (se0) obj2;
                    se0 se0Var2 = (se0) obj;
                    if (se0Var2 != null) {
                        float f12 = se0Var2.a;
                        float dpf2 = AndroidUtilities.dpf2(((se0Var.a - f12) * f10) + f12);
                        float f13 = se0Var2.b;
                        path.moveTo(dpf2, AndroidUtilities.dpf2(((se0Var.b - f13) * f10) + f13));
                    } else {
                        path.moveTo(AndroidUtilities.dpf2(se0Var.a), AndroidUtilities.dpf2(se0Var.b));
                    }
                } else if (obj2 instanceof re0) {
                    re0 re0Var = (re0) obj2;
                    re0 re0Var2 = (re0) obj;
                    if (re0Var2 != null) {
                        float f14 = re0Var2.a;
                        float dpf22 = AndroidUtilities.dpf2(((re0Var.a - f14) * f10) + f14);
                        float f15 = re0Var2.b;
                        path.lineTo(dpf22, AndroidUtilities.dpf2(((re0Var.b - f15) * f10) + f15));
                    } else {
                        path.lineTo(AndroidUtilities.dpf2(re0Var.a), AndroidUtilities.dpf2(re0Var.b));
                    }
                } else if (obj2 instanceof pe0) {
                    pe0 pe0Var = (pe0) obj2;
                    pe0 pe0Var2 = (pe0) obj;
                    if (pe0Var2 != null) {
                        float f16 = pe0Var2.c;
                        float dpf23 = AndroidUtilities.dpf2(((pe0Var.c - f16) * f10) + f16);
                        float f17 = pe0Var2.d;
                        float dpf24 = AndroidUtilities.dpf2(((pe0Var.d - f17) * f10) + f17);
                        float f18 = pe0Var2.e;
                        float dpf25 = AndroidUtilities.dpf2(((pe0Var.e - f18) * f10) + f18);
                        float f19 = pe0Var2.f;
                        float dpf26 = AndroidUtilities.dpf2(((pe0Var.f - f19) * f10) + f19);
                        float f20 = pe0Var2.a;
                        float dpf27 = AndroidUtilities.dpf2(((pe0Var.a - f20) * f10) + f20);
                        float f21 = pe0Var2.b;
                        path.cubicTo(dpf23, dpf24, dpf25, dpf26, dpf27, AndroidUtilities.dpf2(((pe0Var.b - f21) * f10) + f21));
                    } else {
                        path.cubicTo(AndroidUtilities.dpf2(pe0Var.c), AndroidUtilities.dpf2(pe0Var.d), AndroidUtilities.dpf2(pe0Var.e), AndroidUtilities.dpf2(pe0Var.f), AndroidUtilities.dpf2(pe0Var.a), AndroidUtilities.dpf2(pe0Var.b));
                    }
                }
            }
            path.close();
        }
        canvas.drawPath(path, paint);
    }
}
