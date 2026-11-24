// default package

import android.graphics.RectF;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class gqb {
    public int a;
    public boolean b;
    public jqb c;
    public String d;
    public long e;
    public long f;
    public float g;
    public float h;
    public float i;
    public final RectF j = new RectF();
    public final ln k;
    public final /* synthetic */ lqb l;

    public gqb(lqb lqbVar) {
        this.l = lqbVar;
        this.k = new ln(360L, lqbVar, d53.h);
    }

    public final void a(boolean z) {
        lqb lqbVar = this.l;
        if (lqbVar.getMeasuredWidth() > 0) {
            jqb jqbVar = this.c;
            if (jqbVar != null) {
                if (!z) {
                    return;
                }
                jqbVar.a();
                this.c = null;
            }
            Long l = null;
            boolean z2 = this.b;
            String str = this.d;
            int i = lqbVar.w1;
            int i2 = lqbVar.z1;
            int i3 = (i - i2) - i2;
            int L = gm.L(38.0f);
            long j = this.e;
            if (j > 2) {
                l = Long.valueOf(j);
            }
            this.c = new jqb(lqbVar, z2, str, i3, L, l, lqbVar.getMaxScrollDuration(), lqbVar.a1, lqbVar.b1, new zcb(this, (byte) 16));
        }
    }

    public final void b() {
        lqb lqbVar = this.l;
        ArrayList arrayList = lqbVar.r;
        int i = this.a;
        if (i < 0 || i >= arrayList.size()) {
            return;
        }
        eqb eqbVar = (eqb) arrayList.get(this.a);
        if (lqbVar.getMeasuredWidth() <= 0 || eqbVar != null) {
            return;
        }
        arrayList.set(this.a, new eqb(lqbVar, this.d, (lqbVar.getMeasuredWidth() - lqbVar.getPaddingLeft()) - lqbVar.getPaddingRight()));
    }
}
