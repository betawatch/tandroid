// default package

import android.graphics.RectF;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class fob {
    public int a;
    public boolean b;
    public iob c;
    public String d;
    public long e;
    public long f;
    public float g;
    public float h;
    public float i;
    public final RectF j = new RectF();
    public final lm k;
    public final /* synthetic */ kob l;

    public fob(kob kobVar) {
        this.l = kobVar;
        this.k = new lm(360L, kobVar, s33.h);
    }

    public final void a(boolean z) {
        kob kobVar = this.l;
        if (kobVar.getMeasuredWidth() > 0) {
            iob iobVar = this.c;
            if (iobVar != null) {
                if (!z) {
                    return;
                }
                iobVar.a();
                this.c = null;
            }
            Long l = null;
            boolean z2 = this.b;
            String str = this.d;
            int i = kobVar.w1;
            int i2 = kobVar.z1;
            int i3 = (i - i2) - i2;
            int L = gl.L(38.0f);
            long j = this.e;
            if (j > 2) {
                l = Long.valueOf(j);
            }
            this.c = new iob(kobVar, z2, str, i3, L, l, kobVar.getMaxScrollDuration(), kobVar.a1, kobVar.b1, new cib(this, (byte) 8));
        }
    }

    public final void b() {
        kob kobVar = this.l;
        ArrayList arrayList = kobVar.r;
        int i = this.a;
        if (i < 0 || i >= arrayList.size()) {
            return;
        }
        dob dobVar = (dob) arrayList.get(this.a);
        if (kobVar.getMeasuredWidth() <= 0 || dobVar != null) {
            return;
        }
        arrayList.set(this.a, new dob(kobVar, this.d, (kobVar.getMeasuredWidth() - kobVar.getPaddingLeft()) - kobVar.getPaddingRight()));
    }
}
