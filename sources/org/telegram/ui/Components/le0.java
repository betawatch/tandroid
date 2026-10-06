package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class le0 {
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
            ie0 ie0Var = new ie0();
            ie0Var.a = new ArrayList();
            ie0Var.b = f7 * this.f;
            String[] split = str.split(" ");
            int i10 = 0;
            while (i10 < split.length) {
                char charAt = split[i10].charAt(0);
                if (charAt == 'C') {
                    he0 he0Var = new he0();
                    he0Var.c = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    he0Var.d = (Float.parseFloat(split[i10 + 2]) + f10) * f12;
                    he0Var.e = (Float.parseFloat(split[i10 + 3]) + f11) * f12;
                    he0Var.f = (Float.parseFloat(split[i10 + 4]) + f10) * f12;
                    he0Var.a = (Float.parseFloat(split[i10 + 5]) + f11) * f12;
                    i10 += 6;
                    he0Var.b = (Float.parseFloat(split[i10]) + f10) * f12;
                    ie0Var.a.add(he0Var);
                } else if (charAt == 'L') {
                    je0 je0Var = new je0();
                    je0Var.a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    i10 += 2;
                    je0Var.b = (Float.parseFloat(split[i10]) + f10) * f12;
                    ie0Var.a.add(je0Var);
                } else if (charAt == 'M') {
                    ke0 ke0Var = new ke0();
                    ke0Var.a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    i10 += 2;
                    ke0Var.b = (Float.parseFloat(split[i10]) + f10) * f12;
                    ie0Var.a.add(ke0Var);
                }
                i10++;
            }
            this.g.add(ie0Var);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final void b(Canvas canvas, Paint paint, float f7) {
        ie0 ie0Var;
        ie0 ie0Var2;
        float f10;
        ArrayList arrayList = this.g;
        Path path = this.a;
        if (this.b != f7) {
            this.b = f7;
            int size = arrayList.size();
            ie0 ie0Var3 = null;
            ie0 ie0Var4 = null;
            for (int i10 = 0; i10 < size; i10++) {
                ie0 ie0Var5 = (ie0) arrayList.get(i10);
                if ((ie0Var4 == null || ie0Var4.b < ie0Var5.b) && ie0Var5.b <= f7) {
                    ie0Var4 = ie0Var5;
                }
                if ((ie0Var3 == null || ie0Var3.b > ie0Var5.b) && ie0Var5.b >= f7) {
                    ie0Var3 = ie0Var5;
                }
            }
            if (ie0Var3 == ie0Var4) {
                ie0Var4 = null;
            }
            if (ie0Var4 == null || ie0Var3 != null) {
                ie0Var = ie0Var3;
                ie0Var2 = ie0Var4;
            } else {
                ie0Var = ie0Var4;
                ie0Var2 = null;
            }
            if (ie0Var == null) {
                return;
            }
            ArrayList arrayList2 = ie0Var.a;
            if (ie0Var2 != null && ie0Var2.a.size() != arrayList2.size()) {
                return;
            }
            path.reset();
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                Object obj = ie0Var2 != null ? ie0Var2.a.get(i11) : null;
                Object obj2 = arrayList2.get(i11);
                if (obj != null && obj.getClass() != obj2.getClass()) {
                    return;
                }
                if (ie0Var2 != null) {
                    float f11 = ie0Var2.b;
                    f10 = (f7 - f11) / (ie0Var.b - f11);
                } else {
                    f10 = 1.0f;
                }
                if (obj2 instanceof ke0) {
                    ke0 ke0Var = (ke0) obj2;
                    ke0 ke0Var2 = (ke0) obj;
                    if (ke0Var2 != null) {
                        float f12 = ke0Var2.a;
                        float dpf2 = AndroidUtilities.dpf2(((ke0Var.a - f12) * f10) + f12);
                        float f13 = ke0Var2.b;
                        path.moveTo(dpf2, AndroidUtilities.dpf2(((ke0Var.b - f13) * f10) + f13));
                    } else {
                        path.moveTo(AndroidUtilities.dpf2(ke0Var.a), AndroidUtilities.dpf2(ke0Var.b));
                    }
                } else if (obj2 instanceof je0) {
                    je0 je0Var = (je0) obj2;
                    je0 je0Var2 = (je0) obj;
                    if (je0Var2 != null) {
                        float f14 = je0Var2.a;
                        float dpf22 = AndroidUtilities.dpf2(((je0Var.a - f14) * f10) + f14);
                        float f15 = je0Var2.b;
                        path.lineTo(dpf22, AndroidUtilities.dpf2(((je0Var.b - f15) * f10) + f15));
                    } else {
                        path.lineTo(AndroidUtilities.dpf2(je0Var.a), AndroidUtilities.dpf2(je0Var.b));
                    }
                } else if (obj2 instanceof he0) {
                    he0 he0Var = (he0) obj2;
                    he0 he0Var2 = (he0) obj;
                    if (he0Var2 != null) {
                        float f16 = he0Var2.c;
                        float dpf23 = AndroidUtilities.dpf2(((he0Var.c - f16) * f10) + f16);
                        float f17 = he0Var2.d;
                        float dpf24 = AndroidUtilities.dpf2(((he0Var.d - f17) * f10) + f17);
                        float f18 = he0Var2.e;
                        float dpf25 = AndroidUtilities.dpf2(((he0Var.e - f18) * f10) + f18);
                        float f19 = he0Var2.f;
                        float dpf26 = AndroidUtilities.dpf2(((he0Var.f - f19) * f10) + f19);
                        float f20 = he0Var2.a;
                        float dpf27 = AndroidUtilities.dpf2(((he0Var.a - f20) * f10) + f20);
                        float f21 = he0Var2.b;
                        path.cubicTo(dpf23, dpf24, dpf25, dpf26, dpf27, AndroidUtilities.dpf2(((he0Var.b - f21) * f10) + f21));
                    } else {
                        path.cubicTo(AndroidUtilities.dpf2(he0Var.c), AndroidUtilities.dpf2(he0Var.d), AndroidUtilities.dpf2(he0Var.e), AndroidUtilities.dpf2(he0Var.f), AndroidUtilities.dpf2(he0Var.a), AndroidUtilities.dpf2(he0Var.b));
                    }
                }
            }
            path.close();
        }
        canvas.drawPath(path, paint);
    }
}
