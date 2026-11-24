// default package

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Timer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class mx3 extends jx3 {
    public d29 i;
    public d29 j;
    public int k;
    public final ln l;
    public Timer m;
    public final d8b n;
    public final ArrayList o;
    public final /* synthetic */ nx3 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx3(nx3 nx3Var) {
        super(nx3Var);
        ArrayList arrayList;
        this.p = nx3Var;
        this.i = new d29(nx3Var);
        this.j = new d29(nx3Var);
        this.l = new ln(nx3Var);
        this.n = new d8b(nx3Var);
        this.o = new ArrayList();
        this.a = (byte) 3;
        this.b = gm.L(44.0f);
        this.c = gm.L(36.0f);
        px3 px3Var = nx3Var.f;
        int i = px3.C1;
        ArrayList arrayList2 = hs6.d0(px3Var.a).h;
        int i2 = 0;
        while (true) {
            int min = Math.min(arrayList2.size(), 8);
            arrayList = this.o;
            if (i2 >= min) {
                break;
            }
            arrayList.add(k39.c((TLRPC.TL_availableReaction) arrayList2.get(i2)));
            i2++;
        }
        Collections.sort(arrayList, new x03((byte) 15));
        if (!this.o.isEmpty()) {
            this.i.e((k39) this.o.get(this.k));
        }
        this.l.e(true, 1.0f);
    }

    @Override // jx3
    public final void a(Canvas canvas, float f, float f2) {
        float L = f2 - gm.L(4.0f);
        float f3 = (int) f;
        float f4 = (int) L;
        float f5 = this.b;
        float f6 = (int) (f + f5);
        float f7 = (int) (L + f5);
        RectF rectF = this.f;
        rectF.set(f3, f4, f6, f7);
        float a = this.g.a(0.05f);
        canvas.save();
        canvas.scale(a, a, rectF.centerX(), rectF.centerY());
        int i = (int) rectF.left;
        int i2 = (int) rectF.top;
        int i3 = (int) rectF.right;
        int i4 = (int) rectF.bottom;
        d8b d8bVar = this.n;
        d8bVar.setBounds(i, i2, i3, i4);
        d8bVar.draw(canvas);
        float L2 = gm.L(30.0f);
        Rect rect = gm.Q;
        float f8 = L2 / 2.0f;
        rect.set((int) (rectF.centerX() - f8), (int) (rectF.centerY() - f8), (int) (rectF.centerX() + f8), (int) (rectF.centerY() + f8));
        float e = this.l.e(false, 1.0f);
        this.j.c(rect);
        this.i.c(rect);
        if (e == 1.0f) {
            this.i.a(canvas);
        } else {
            canvas.save();
            float f9 = 1.0f - e;
            canvas.scale(f9, f9, rectF.centerX(), rectF.top);
            d29 d29Var = this.j;
            d29Var.h = f9;
            d29Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(e, e, rectF.centerX(), rectF.bottom);
            d29 d29Var2 = this.i;
            d29Var2.h = e;
            d29Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // jx3
    public final void b(boolean z) {
        this.i.b(z);
        this.j.b(z);
        Timer timer = this.m;
        if (timer != null) {
            timer.cancel();
            this.m = null;
        }
        if (z) {
            Timer timer2 = new Timer();
            this.m = timer2;
            timer2.schedule(new lx3(this, (byte) 0), 2000L, 2000L);
        }
    }
}
