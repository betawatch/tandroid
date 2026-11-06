package fi;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import bi.nd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Timer;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class i2 extends f2 {
    public ch.f0 i;
    public ch.f0 j;
    public int k;
    public final org.telegram.ui.Components.w5 l;
    public Timer m;
    public final di.v8 n;
    public final ArrayList o;
    public final /* synthetic */ nd p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(nd ndVar) {
        super(ndVar);
        this.p = ndVar;
        this.i = new ch.f0(ndVar);
        this.j = new ch.f0(ndVar);
        this.l = new org.telegram.ui.Components.w5(ndVar);
        this.n = new di.v8(ndVar);
        this.o = new ArrayList();
        this.a = 3;
        this.b = org.telegram.messenger.g0.L(44.0f);
        this.c = org.telegram.messenger.g0.L(36.0f);
        k2 k2Var = (k2) ndVar.h;
        int i7 = k2.y1;
        ArrayList arrayList = ui.b0(k2Var.a).h;
        for (int i10 = 0; i10 < Math.min(arrayList.size(), 8); i10++) {
            this.o.add(ch.o0.c((TLRPC.TL_availableReaction) arrayList.get(i10)));
        }
        Collections.sort(this.o, new a3.c(26));
        if (!this.o.isEmpty()) {
            this.i.e((ch.o0) this.o.get(this.k));
        }
        this.l.e(true, 1.0f);
    }

    @Override // fi.f2
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
        di.v8 v8Var = this.n;
        v8Var.setBounds(i7, i10, i11, i12);
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
            ch.f0 f0Var = this.j;
            f0Var.h = f18;
            f0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(e10, e10, rectF.centerX(), rectF.bottom);
            ch.f0 f0Var2 = this.i;
            f0Var2.h = e10;
            f0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // fi.f2
    public final void b(boolean z9) {
        this.i.b(z9);
        this.j.b(z9);
        Timer timer = this.m;
        if (timer != null) {
            timer.cancel();
            this.m = null;
        }
        if (z9) {
            Timer timer2 = new Timer();
            this.m = timer2;
            timer2.schedule(new h2(this, 0), 2000L, 2000L);
        }
    }
}
