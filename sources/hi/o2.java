package hi;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Timer;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class o2 extends m2 {
    public ch.g0 i;
    public ch.g0 j;
    public int k;
    public final org.telegram.ui.Components.c6 l;
    public Timer m;
    public final fi.l8 n;
    public final ArrayList o;
    public final /* synthetic */ p2 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(p2 p2Var) {
        super(p2Var);
        this.p = p2Var;
        this.i = new ch.g0(p2Var);
        this.j = new ch.g0(p2Var);
        this.l = new org.telegram.ui.Components.c6(p2Var);
        this.n = new fi.l8(p2Var);
        this.o = new ArrayList();
        this.a = 3;
        this.b = org.telegram.messenger.g0.L(44.0f);
        this.c = org.telegram.messenger.g0.L(36.0f);
        r2 r2Var = p2Var.f;
        int i7 = r2.D1;
        ArrayList arrayList = ri.d0(r2Var.a).h;
        for (int i10 = 0; i10 < Math.min(arrayList.size(), 8); i10++) {
            this.o.add(ch.p0.c((TLRPC.TL_availableReaction) arrayList.get(i10)));
        }
        Collections.sort(this.o, new a3.c(28));
        if (!this.o.isEmpty()) {
            this.i.e((ch.p0) this.o.get(this.k));
        }
        this.l.e(true, 1.0f);
    }

    @Override // hi.m2
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

    @Override // hi.m2
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
            timer2.schedule(new h6.s(this, 1), 2000L, 2000L);
        }
    }
}
