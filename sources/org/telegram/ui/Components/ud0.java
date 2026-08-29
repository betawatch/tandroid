package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ud0 {
    public Path a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public ArrayList g;

    public final void a(String str, float f9) {
        float f10 = this.e;
        float f11 = this.d;
        float f12 = this.c;
        try {
            rd0 rd0Var = new rd0();
            rd0Var.a = new ArrayList();
            rd0Var.b = f9 * this.f;
            String[] split = str.split(" ");
            int i10 = 0;
            while (i10 < split.length) {
                char charAt = split[i10].charAt(0);
                if (charAt == 'C') {
                    qd0 qd0Var = new qd0();
                    qd0Var.c = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    qd0Var.d = (Float.parseFloat(split[i10 + 2]) + f10) * f12;
                    qd0Var.e = (Float.parseFloat(split[i10 + 3]) + f11) * f12;
                    qd0Var.f = (Float.parseFloat(split[i10 + 4]) + f10) * f12;
                    qd0Var.a = (Float.parseFloat(split[i10 + 5]) + f11) * f12;
                    i10 += 6;
                    qd0Var.b = (Float.parseFloat(split[i10]) + f10) * f12;
                    rd0Var.a.add(qd0Var);
                } else if (charAt == 'L') {
                    sd0 sd0Var = new sd0();
                    sd0Var.a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    i10 += 2;
                    sd0Var.b = (Float.parseFloat(split[i10]) + f10) * f12;
                    rd0Var.a.add(sd0Var);
                } else if (charAt == 'M') {
                    td0 td0Var = new td0();
                    td0Var.a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    i10 += 2;
                    td0Var.b = (Float.parseFloat(split[i10]) + f10) * f12;
                    rd0Var.a.add(td0Var);
                }
                i10++;
            }
            this.g.add(rd0Var);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void b(Canvas canvas, Paint paint, float f9) {
        rd0 rd0Var;
        rd0 rd0Var2;
        float f10;
        ArrayList arrayList = this.g;
        Path path = this.a;
        if (this.b != f9) {
            this.b = f9;
            int size = arrayList.size();
            rd0 rd0Var3 = null;
            rd0 rd0Var4 = null;
            for (int i10 = 0; i10 < size; i10++) {
                rd0 rd0Var5 = (rd0) arrayList.get(i10);
                if ((rd0Var4 == null || rd0Var4.b < rd0Var5.b) && rd0Var5.b <= f9) {
                    rd0Var4 = rd0Var5;
                }
                if ((rd0Var3 == null || rd0Var3.b > rd0Var5.b) && rd0Var5.b >= f9) {
                    rd0Var3 = rd0Var5;
                }
            }
            if (rd0Var3 == rd0Var4) {
                rd0Var4 = null;
            }
            if (rd0Var4 == null || rd0Var3 != null) {
                rd0Var = rd0Var3;
                rd0Var2 = rd0Var4;
            } else {
                rd0Var = rd0Var4;
                rd0Var2 = null;
            }
            if (rd0Var == null) {
                return;
            }
            ArrayList arrayList2 = rd0Var.a;
            if (rd0Var2 != null && rd0Var2.a.size() != arrayList2.size()) {
                return;
            }
            path.reset();
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                Object obj = rd0Var2 != null ? rd0Var2.a.get(i11) : null;
                Object obj2 = arrayList2.get(i11);
                if (obj != null && obj.getClass() != obj2.getClass()) {
                    return;
                }
                if (rd0Var2 != null) {
                    float f11 = rd0Var2.b;
                    f10 = (f9 - f11) / (rd0Var.b - f11);
                } else {
                    f10 = 1.0f;
                }
                if (obj2 instanceof td0) {
                    td0 td0Var = (td0) obj2;
                    td0 td0Var2 = (td0) obj;
                    if (td0Var2 != null) {
                        float f12 = td0Var2.a;
                        float dpf2 = AndroidUtilities.dpf2(((td0Var.a - f12) * f10) + f12);
                        float f13 = td0Var2.b;
                        path.moveTo(dpf2, AndroidUtilities.dpf2(((td0Var.b - f13) * f10) + f13));
                    } else {
                        path.moveTo(AndroidUtilities.dpf2(td0Var.a), AndroidUtilities.dpf2(td0Var.b));
                    }
                } else if (obj2 instanceof sd0) {
                    sd0 sd0Var = (sd0) obj2;
                    sd0 sd0Var2 = (sd0) obj;
                    if (sd0Var2 != null) {
                        float f14 = sd0Var2.a;
                        float dpf22 = AndroidUtilities.dpf2(((sd0Var.a - f14) * f10) + f14);
                        float f15 = sd0Var2.b;
                        path.lineTo(dpf22, AndroidUtilities.dpf2(((sd0Var.b - f15) * f10) + f15));
                    } else {
                        path.lineTo(AndroidUtilities.dpf2(sd0Var.a), AndroidUtilities.dpf2(sd0Var.b));
                    }
                } else if (obj2 instanceof qd0) {
                    qd0 qd0Var = (qd0) obj2;
                    qd0 qd0Var2 = (qd0) obj;
                    if (qd0Var2 != null) {
                        float f16 = qd0Var2.c;
                        float dpf23 = AndroidUtilities.dpf2(((qd0Var.c - f16) * f10) + f16);
                        float f17 = qd0Var2.d;
                        float dpf24 = AndroidUtilities.dpf2(((qd0Var.d - f17) * f10) + f17);
                        float f18 = qd0Var2.e;
                        float dpf25 = AndroidUtilities.dpf2(((qd0Var.e - f18) * f10) + f18);
                        float f19 = qd0Var2.f;
                        float dpf26 = AndroidUtilities.dpf2(((qd0Var.f - f19) * f10) + f19);
                        float f20 = qd0Var2.a;
                        float dpf27 = AndroidUtilities.dpf2(((qd0Var.a - f20) * f10) + f20);
                        float f21 = qd0Var2.b;
                        path.cubicTo(dpf23, dpf24, dpf25, dpf26, dpf27, AndroidUtilities.dpf2(((qd0Var.b - f21) * f10) + f21));
                    } else {
                        path.cubicTo(AndroidUtilities.dpf2(qd0Var.c), AndroidUtilities.dpf2(qd0Var.d), AndroidUtilities.dpf2(qd0Var.e), AndroidUtilities.dpf2(qd0Var.f), AndroidUtilities.dpf2(qd0Var.a), AndroidUtilities.dpf2(qd0Var.b));
                    }
                }
            }
            path.close();
        }
        canvas.drawPath(path, paint);
    }
}
