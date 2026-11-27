// default package

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class a62 {
    public long i;
    public w52 k;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public pkb u;
    public long v;
    public final t37 x;
    public final c34 y;
    public final /* synthetic */ b62 z;
    public float a = 0.0f;
    public int b = 0;
    public long c = 0;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f = 0.0f;
    public float g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final k43 j = k43.j;
    public final int l = hl.L(4.0f);
    public final int m = hl.L(2.0f) / 2;
    public final RectF t = new RectF();
    public final Paint w = new Paint(1);

    public a62(b62 b62Var) {
        this.z = b62Var;
        vnb vnbVar = b62Var.Q.n;
        Drawable drawable = vnbVar != null ? vnbVar.getDrawable("drawableMsgOutMedia") : null;
        this.x = (t37) (drawable == null ? aob.P0("drawableMsgOutMedia") : drawable);
        this.y = new c34();
    }

    public final float a() {
        Point point = hl.q;
        return this.z.Q.getPreviewScale() * hl.R1(this.g, this.e, this.j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - this.c) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }

    public final void b(w52 w52Var, boolean z) {
        ArrayList arrayList;
        this.k = w52Var;
        if (w52Var == null) {
            return;
        }
        HashMap hashMap = (HashMap) w52Var.g;
        w52Var.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.c;
        long j2 = 200;
        if (j < 200) {
            float f = j / 200.0f;
            this.g = hl.R1(this.g, this.e, f);
            this.f = hl.R1(this.f, this.d, f);
        } else {
            this.g = this.e;
            this.f = this.d;
        }
        this.d = w52Var.b / 1000.0f;
        this.e = w52Var.a;
        this.c = z ? elapsedRealtime : 0L;
        this.i = 0L;
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        int size = arrayList2.size();
        int i = 0;
        while (true) {
            z52 z52Var = null;
            arrayList = this.h;
            if (i >= size) {
                break;
            }
            no6 no6Var = (no6) arrayList2.get(i);
            j47 j47Var = (j47) hashMap.get(no6Var);
            long j3 = j2;
            int i2 = i;
            this.i = Math.max(this.i, no6Var.N);
            int size2 = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size2) {
                    break;
                }
                z52 z52Var2 = (z52) arrayList.get(i3);
                if (z52Var2.b == no6Var) {
                    z52Var = z52Var2;
                    break;
                }
                i3++;
            }
            if (z52Var == null) {
                z52 z52Var3 = new z52(this);
                z52Var3.f(no6Var);
                z52Var3.d(w52Var, j47Var, z);
                arrayList.add(z52Var3);
            } else {
                z52Var.d(w52Var, j47Var, z);
            }
            i = i2 + 1;
            j2 = j3;
        }
        long j4 = j2;
        int size3 = arrayList.size();
        int i4 = 0;
        while (i4 < size3) {
            z52 z52Var4 = (z52) arrayList.get(i4);
            if (!hashMap.containsKey(z52Var4.b)) {
                if (z52Var4.k > 0.0f || z52Var4.h + j4 > elapsedRealtime) {
                    z52Var4.d(null, null, z);
                } else {
                    mpa mpaVar = z52Var4.s;
                    if (mpaVar != null) {
                        mpaVar.b(z52Var4.O.z);
                        z52Var4.s = null;
                    }
                    arrayList.remove(i4);
                    i4--;
                    size3--;
                }
            }
            i4++;
        }
        this.z.invalidate();
    }
}
