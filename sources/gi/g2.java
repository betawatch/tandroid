package gi;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import ci.fc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Timer;
import org.telegram.messenger.li;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g2 extends e2 {
    public dh.e0 i;
    public dh.e0 j;
    public int k;
    public final org.telegram.ui.Components.u5 l;
    public Timer m;
    public final ei.v8 n;
    public final ArrayList o;
    public final /* synthetic */ fc p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(fc fcVar) {
        super(fcVar);
        this.p = fcVar;
        this.i = new dh.e0(fcVar);
        this.j = new dh.e0(fcVar);
        this.l = new org.telegram.ui.Components.u5(fcVar);
        this.n = new ei.v8(fcVar);
        this.o = new ArrayList();
        this.a = 3;
        this.b = org.telegram.messenger.g0.L(44.0f);
        this.c = org.telegram.messenger.g0.L(36.0f);
        i2 i2Var = (i2) fcVar.h;
        int i3 = i2.z1;
        ArrayList arrayList = li.b0(i2Var.a).h;
        for (int i10 = 0; i10 < Math.min(arrayList.size(), 8); i10++) {
            this.o.add(dh.n0.c((TLRPC.TL_availableReaction) arrayList.get(i10)));
        }
        Collections.sort(this.o, new a3.u(18));
        if (!this.o.isEmpty()) {
            this.i.e((dh.n0) this.o.get(this.k));
        }
        this.l.e(true, 1.0f);
    }

    @Override // gi.e2
    public final void a(Canvas canvas, float f10, float f11) {
        float L = f11 - org.telegram.messenger.g0.L(4.0f);
        float f12 = (int) f10;
        float f13 = (int) L;
        float f14 = this.b;
        float f15 = (int) (f10 + f14);
        float f16 = (int) (L + f14);
        RectF rectF = this.f;
        rectF.set(f12, f13, f15, f16);
        float a10 = this.g.a(0.05f);
        canvas.save();
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        int i3 = (int) rectF.left;
        int i10 = (int) rectF.top;
        int i11 = (int) rectF.right;
        int i12 = (int) rectF.bottom;
        ei.v8 v8Var = this.n;
        v8Var.setBounds(i3, i10, i11, i12);
        v8Var.draw(canvas);
        float L2 = org.telegram.messenger.g0.L(30.0f);
        Rect rect = org.telegram.messenger.g0.Q;
        float f17 = L2 / 2.0f;
        rect.set((int) (rectF.centerX() - f17), (int) (rectF.centerY() - f17), (int) (rectF.centerX() + f17), (int) (rectF.centerY() + f17));
        float e10 = this.l.e(false, 1.0f);
        this.j.c(rect);
        this.i.c(rect);
        if (e10 == 1.0f) {
            this.i.a(canvas);
        } else {
            canvas.save();
            float f18 = 1.0f - e10;
            canvas.scale(f18, f18, rectF.centerX(), rectF.top);
            dh.e0 e0Var = this.j;
            e0Var.h = f18;
            e0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(e10, e10, rectF.centerX(), rectF.bottom);
            dh.e0 e0Var2 = this.i;
            e0Var2.h = e10;
            e0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // gi.e2
    public final void b(boolean z10) {
        this.i.b(z10);
        this.j.b(z10);
        Timer timer = this.m;
        if (timer != null) {
            timer.cancel();
            this.m = null;
        }
        if (z10) {
            Timer timer2 = new Timer();
            this.m = timer2;
            timer2.schedule(new g6.q(this, 1), 2000L, 2000L);
        }
    }
}
