package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ke0 {
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
            he0 he0Var = new he0();
            he0Var.a = new ArrayList();
            he0Var.b = f7 * this.f;
            String[] split = str.split(" ");
            int i10 = 0;
            while (i10 < split.length) {
                char charAt = split[i10].charAt(0);
                if (charAt == 'C') {
                    ge0 ge0Var = new ge0();
                    ge0Var.c = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    ge0Var.d = (Float.parseFloat(split[i10 + 2]) + f10) * f12;
                    ge0Var.e = (Float.parseFloat(split[i10 + 3]) + f11) * f12;
                    ge0Var.f = (Float.parseFloat(split[i10 + 4]) + f10) * f12;
                    ge0Var.a = (Float.parseFloat(split[i10 + 5]) + f11) * f12;
                    i10 += 6;
                    ge0Var.b = (Float.parseFloat(split[i10]) + f10) * f12;
                    he0Var.a.add(ge0Var);
                } else if (charAt == 'L') {
                    ie0 ie0Var = new ie0();
                    ie0Var.a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    i10 += 2;
                    ie0Var.b = (Float.parseFloat(split[i10]) + f10) * f12;
                    he0Var.a.add(ie0Var);
                } else if (charAt == 'M') {
                    je0 je0Var = new je0();
                    je0Var.a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    i10 += 2;
                    je0Var.b = (Float.parseFloat(split[i10]) + f10) * f12;
                    he0Var.a.add(je0Var);
                }
                i10++;
            }
            this.g.add(he0Var);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void b(Canvas canvas, Paint paint, float f7) {
        he0 he0Var;
        he0 he0Var2;
        float f10;
        ArrayList arrayList = this.g;
        Path path = this.a;
        if (this.b != f7) {
            this.b = f7;
            int size = arrayList.size();
            he0 he0Var3 = null;
            he0 he0Var4 = null;
            for (int i10 = 0; i10 < size; i10++) {
                he0 he0Var5 = (he0) arrayList.get(i10);
                if ((he0Var4 == null || he0Var4.b < he0Var5.b) && he0Var5.b <= f7) {
                    he0Var4 = he0Var5;
                }
                if ((he0Var3 == null || he0Var3.b > he0Var5.b) && he0Var5.b >= f7) {
                    he0Var3 = he0Var5;
                }
            }
            if (he0Var3 == he0Var4) {
                he0Var4 = null;
            }
            if (he0Var4 == null || he0Var3 != null) {
                he0Var = he0Var3;
                he0Var2 = he0Var4;
            } else {
                he0Var = he0Var4;
                he0Var2 = null;
            }
            if (he0Var == null) {
                return;
            }
            ArrayList arrayList2 = he0Var.a;
            if (he0Var2 != null && he0Var2.a.size() != arrayList2.size()) {
                return;
            }
            path.reset();
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                Object obj = he0Var2 != null ? he0Var2.a.get(i11) : null;
                Object obj2 = arrayList2.get(i11);
                if (obj != null && obj.getClass() != obj2.getClass()) {
                    return;
                }
                if (he0Var2 != null) {
                    float f11 = he0Var2.b;
                    f10 = (f7 - f11) / (he0Var.b - f11);
                } else {
                    f10 = 1.0f;
                }
                if (obj2 instanceof je0) {
                    je0 je0Var = (je0) obj2;
                    je0 je0Var2 = (je0) obj;
                    if (je0Var2 != null) {
                        float f12 = je0Var2.a;
                        float dpf2 = AndroidUtilities.dpf2(((je0Var.a - f12) * f10) + f12);
                        float f13 = je0Var2.b;
                        path.moveTo(dpf2, AndroidUtilities.dpf2(((je0Var.b - f13) * f10) + f13));
                    } else {
                        path.moveTo(AndroidUtilities.dpf2(je0Var.a), AndroidUtilities.dpf2(je0Var.b));
                    }
                } else if (obj2 instanceof ie0) {
                    ie0 ie0Var = (ie0) obj2;
                    ie0 ie0Var2 = (ie0) obj;
                    if (ie0Var2 != null) {
                        float f14 = ie0Var2.a;
                        float dpf22 = AndroidUtilities.dpf2(((ie0Var.a - f14) * f10) + f14);
                        float f15 = ie0Var2.b;
                        path.lineTo(dpf22, AndroidUtilities.dpf2(((ie0Var.b - f15) * f10) + f15));
                    } else {
                        path.lineTo(AndroidUtilities.dpf2(ie0Var.a), AndroidUtilities.dpf2(ie0Var.b));
                    }
                } else if (obj2 instanceof ge0) {
                    ge0 ge0Var = (ge0) obj2;
                    ge0 ge0Var2 = (ge0) obj;
                    if (ge0Var2 != null) {
                        float f16 = ge0Var2.c;
                        float dpf23 = AndroidUtilities.dpf2(((ge0Var.c - f16) * f10) + f16);
                        float f17 = ge0Var2.d;
                        float dpf24 = AndroidUtilities.dpf2(((ge0Var.d - f17) * f10) + f17);
                        float f18 = ge0Var2.e;
                        float dpf25 = AndroidUtilities.dpf2(((ge0Var.e - f18) * f10) + f18);
                        float f19 = ge0Var2.f;
                        float dpf26 = AndroidUtilities.dpf2(((ge0Var.f - f19) * f10) + f19);
                        float f20 = ge0Var2.a;
                        float dpf27 = AndroidUtilities.dpf2(((ge0Var.a - f20) * f10) + f20);
                        float f21 = ge0Var2.b;
                        path.cubicTo(dpf23, dpf24, dpf25, dpf26, dpf27, AndroidUtilities.dpf2(((ge0Var.b - f21) * f10) + f21));
                    } else {
                        path.cubicTo(AndroidUtilities.dpf2(ge0Var.c), AndroidUtilities.dpf2(ge0Var.d), AndroidUtilities.dpf2(ge0Var.e), AndroidUtilities.dpf2(ge0Var.f), AndroidUtilities.dpf2(ge0Var.a), AndroidUtilities.dpf2(ge0Var.b));
                    }
                }
            }
            path.close();
        }
        canvas.drawPath(path, paint);
    }
}
