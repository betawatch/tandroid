package hi;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import di.yb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Timer;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class h2 extends f2 {
    public ch.g0 i;
    public ch.g0 j;
    public int k;
    public final org.telegram.ui.Components.c6 l;
    public Timer m;
    public final fi.l8 n;
    public final ArrayList o;
    public final /* synthetic */ yb p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(yb ybVar) {
        super(ybVar);
        this.p = ybVar;
        this.i = new ch.g0(ybVar);
        this.j = new ch.g0(ybVar);
        this.l = new org.telegram.ui.Components.c6(ybVar);
        this.n = new fi.l8(ybVar);
        this.o = new ArrayList();
        this.a = 3;
        this.b = org.telegram.messenger.g0.L(44.0f);
        this.c = org.telegram.messenger.g0.L(36.0f);
        j2 j2Var = (j2) ybVar.h;
        int i7 = j2.C1;
        ArrayList arrayList = ri.d0(j2Var.a).h;
        for (int i10 = 0; i10 < Math.min(arrayList.size(), 8); i10++) {
            this.o.add(ch.p0.c((TLRPC.TL_availableReaction) arrayList.get(i10)));
        }
        Collections.sort(this.o, new a3.c(28));
        if (!this.o.isEmpty()) {
            this.i.e((ch.p0) this.o.get(this.k));
        }
        this.l.e(true, 1.0f);
    }

    @Override // hi.f2
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
        int i7 = (int) rectF.left;
        int i10 = (int) rectF.top;
        int i11 = (int) rectF.right;
        int i12 = (int) rectF.bottom;
        fi.l8 l8Var = this.n;
        l8Var.setBounds(i7, i10, i11, i12);
        l8Var.draw(canvas);
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
            ch.g0 g0Var = this.j;
            g0Var.h = f18;
            g0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(e10, e10, rectF.centerX(), rectF.bottom);
            ch.g0 g0Var2 = this.i;
            g0Var2.h = e10;
            g0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // hi.f2
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
            timer2.schedule(new h6.r(this, 1), 2000L, 2000L);
        }
    }
}
