package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class fd0 {
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
            cd0 cd0Var = new cd0();
            cd0Var.a = new ArrayList();
            cd0Var.b = f10 * this.f;
            String[] split = str.split(" ");
            int i9 = 0;
            while (i9 < split.length) {
                char charAt = split[i9].charAt(0);
                if (charAt == 'C') {
                    bd0 bd0Var = new bd0();
                    bd0Var.c = (Float.parseFloat(split[i9 + 1]) + f12) * f13;
                    bd0Var.d = (Float.parseFloat(split[i9 + 2]) + f11) * f13;
                    bd0Var.e = (Float.parseFloat(split[i9 + 3]) + f12) * f13;
                    bd0Var.f = (Float.parseFloat(split[i9 + 4]) + f11) * f13;
                    bd0Var.a = (Float.parseFloat(split[i9 + 5]) + f12) * f13;
                    i9 += 6;
                    bd0Var.b = (Float.parseFloat(split[i9]) + f11) * f13;
                    cd0Var.a.add(bd0Var);
                } else if (charAt == 'L') {
                    dd0 dd0Var = new dd0();
                    dd0Var.a = (Float.parseFloat(split[i9 + 1]) + f12) * f13;
                    i9 += 2;
                    dd0Var.b = (Float.parseFloat(split[i9]) + f11) * f13;
                    cd0Var.a.add(dd0Var);
                } else if (charAt == 'M') {
                    ed0 ed0Var = new ed0();
                    ed0Var.a = (Float.parseFloat(split[i9 + 1]) + f12) * f13;
                    i9 += 2;
                    ed0Var.b = (Float.parseFloat(split[i9]) + f11) * f13;
                    cd0Var.a.add(ed0Var);
                }
                i9++;
            }
            this.g.add(cd0Var);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void b(Canvas canvas, Paint paint, float f10) {
        cd0 cd0Var;
        cd0 cd0Var2;
        float f11;
        ArrayList arrayList = this.g;
        Path path = this.a;
        if (this.b != f10) {
            this.b = f10;
            int size = arrayList.size();
            cd0 cd0Var3 = null;
            cd0 cd0Var4 = null;
            for (int i9 = 0; i9 < size; i9++) {
                cd0 cd0Var5 = (cd0) arrayList.get(i9);
                if ((cd0Var4 == null || cd0Var4.b < cd0Var5.b) && cd0Var5.b <= f10) {
                    cd0Var4 = cd0Var5;
                }
                if ((cd0Var3 == null || cd0Var3.b > cd0Var5.b) && cd0Var5.b >= f10) {
                    cd0Var3 = cd0Var5;
                }
            }
            if (cd0Var3 == cd0Var4) {
                cd0Var4 = null;
            }
            if (cd0Var4 == null || cd0Var3 != null) {
                cd0Var = cd0Var3;
                cd0Var2 = cd0Var4;
            } else {
                cd0Var = cd0Var4;
                cd0Var2 = null;
            }
            if (cd0Var == null) {
                return;
            }
            ArrayList arrayList2 = cd0Var.a;
            if (cd0Var2 != null && cd0Var2.a.size() != arrayList2.size()) {
                return;
            }
            path.reset();
            int size2 = arrayList2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                Object obj = cd0Var2 != null ? cd0Var2.a.get(i10) : null;
                Object obj2 = arrayList2.get(i10);
                if (obj != null && obj.getClass() != obj2.getClass()) {
                    return;
                }
                if (cd0Var2 != null) {
                    float f12 = cd0Var2.b;
                    f11 = (f10 - f12) / (cd0Var.b - f12);
                } else {
                    f11 = 1.0f;
                }
                if (obj2 instanceof ed0) {
                    ed0 ed0Var = (ed0) obj2;
                    ed0 ed0Var2 = (ed0) obj;
                    if (ed0Var2 != null) {
                        float f13 = ed0Var2.a;
                        float dpf2 = AndroidUtilities.dpf2(((ed0Var.a - f13) * f11) + f13);
                        float f14 = ed0Var2.b;
                        path.moveTo(dpf2, AndroidUtilities.dpf2(((ed0Var.b - f14) * f11) + f14));
                    } else {
                        path.moveTo(AndroidUtilities.dpf2(ed0Var.a), AndroidUtilities.dpf2(ed0Var.b));
                    }
                } else if (obj2 instanceof dd0) {
                    dd0 dd0Var = (dd0) obj2;
                    dd0 dd0Var2 = (dd0) obj;
                    if (dd0Var2 != null) {
                        float f15 = dd0Var2.a;
                        float dpf22 = AndroidUtilities.dpf2(((dd0Var.a - f15) * f11) + f15);
                        float f16 = dd0Var2.b;
                        path.lineTo(dpf22, AndroidUtilities.dpf2(((dd0Var.b - f16) * f11) + f16));
                    } else {
                        path.lineTo(AndroidUtilities.dpf2(dd0Var.a), AndroidUtilities.dpf2(dd0Var.b));
                    }
                } else if (obj2 instanceof bd0) {
                    bd0 bd0Var = (bd0) obj2;
                    bd0 bd0Var2 = (bd0) obj;
                    if (bd0Var2 != null) {
                        float f17 = bd0Var2.c;
                        float dpf23 = AndroidUtilities.dpf2(((bd0Var.c - f17) * f11) + f17);
                        float f18 = bd0Var2.d;
                        float dpf24 = AndroidUtilities.dpf2(((bd0Var.d - f18) * f11) + f18);
                        float f19 = bd0Var2.e;
                        float dpf25 = AndroidUtilities.dpf2(((bd0Var.e - f19) * f11) + f19);
                        float f20 = bd0Var2.f;
                        float dpf26 = AndroidUtilities.dpf2(((bd0Var.f - f20) * f11) + f20);
                        float f21 = bd0Var2.a;
                        float dpf27 = AndroidUtilities.dpf2(((bd0Var.a - f21) * f11) + f21);
                        float f22 = bd0Var2.b;
                        path.cubicTo(dpf23, dpf24, dpf25, dpf26, dpf27, AndroidUtilities.dpf2(((bd0Var.b - f22) * f11) + f22));
                    } else {
                        path.cubicTo(AndroidUtilities.dpf2(bd0Var.c), AndroidUtilities.dpf2(bd0Var.d), AndroidUtilities.dpf2(bd0Var.e), AndroidUtilities.dpf2(bd0Var.f), AndroidUtilities.dpf2(bd0Var.a), AndroidUtilities.dpf2(bd0Var.b));
                    }
                }
            }
            path.close();
        }
        canvas.drawPath(path, paint);
    }
}
