// default package

import android.graphics.RectF;
import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class fsb {
    public int a;
    public boolean b;
    public isb c;
    public String d;
    public long e;
    public long f;
    public float g;
    public float h;
    public float i;
    public final RectF j = new RectF();
    public final mm k;
    public final /* synthetic */ ksb l;

    public fsb(ksb ksbVar) {
        this.l = ksbVar;
        this.k = new mm(360L, ksbVar, k43.h);
    }

    public final void a(boolean z) {
        ksb ksbVar = this.l;
        if (ksbVar.getMeasuredWidth() > 0) {
            isb isbVar = this.c;
            if (isbVar != null) {
                if (!z) {
                    return;
                }
                isbVar.a();
                this.c = null;
            }
            Long l = null;
            boolean z2 = this.b;
            String str = this.d;
            int i = ksbVar.w1;
            int i2 = ksbVar.z1;
            int i3 = (i - i2) - i2;
            int L = hl.L(38.0f);
            long j = this.e;
            if (j > 2) {
                l = Long.valueOf(j);
            }
            this.c = new isb(ksbVar, z2, str, i3, L, l, ksbVar.getMaxScrollDuration(), ksbVar.a1, ksbVar.b1, new s8b(this, (byte) 25));
        }
    }

    public final void b() {
        ksb ksbVar = this.l;
        ArrayList arrayList = ksbVar.r;
        int i = this.a;
        if (i < 0 || i >= arrayList.size()) {
            return;
        }
        dsb dsbVar = (dsb) arrayList.get(this.a);
        if (ksbVar.getMeasuredWidth() <= 0 || dsbVar != null) {
            return;
        }
        arrayList.set(this.a, new dsb(ksbVar, this.d, (ksbVar.getMeasuredWidth() - ksbVar.getPaddingLeft()) - ksbVar.getPaddingRight()));
    }
}
