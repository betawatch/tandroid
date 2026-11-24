// default package

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.View;
import j$.util.Objects;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class b09 {
    public final ImageReceiver a;
    public vl b;
    public h19 e;
    public View f;
    public boolean g;
    public boolean i;
    public int j;
    public PorterDuffColorFilter k;
    public final Rect c = new Rect();
    public final int d = y6c.t0;
    public float h = 1.0f;

    public b09(View view) {
        this.f = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.a = imageReceiver;
        imageReceiver.A1 = true;
    }

    public final void a(Canvas canvas) {
        vl vlVar = this.b;
        Rect rect = this.c;
        if (vlVar != null) {
            ml mlVar = vlVar.k;
            if (mlVar != null) {
                mlVar.q0((int) (rect.width() * 0.1f));
            }
            this.b.setColorFilter(this.k);
            this.b.setBounds(rect);
            this.b.setAlpha((int) (this.h * 255.0f));
            this.b.draw(canvas);
            return;
        }
        float f = rect.left;
        float f2 = rect.top;
        float width = rect.width();
        float height = rect.height();
        ImageReceiver imageReceiver = this.a;
        imageReceiver.i0(f, f2, width, height);
        imageReceiver.setAlpha(this.h);
        imageReceiver.h(canvas, null);
    }

    public final void b(boolean z) {
        this.g = z;
        ImageReceiver imageReceiver = this.a;
        if (z) {
            imageReceiver.I();
            vl vlVar = this.b;
            if (vlVar != null) {
                vlVar.b(this.f);
                return;
            }
            return;
        }
        imageReceiver.K();
        vl vlVar2 = this.b;
        if (vlVar2 != null) {
            vlVar2.o(this.f);
        }
    }

    public final void c(Rect rect) {
        this.c.set(rect);
    }

    public final void d(int i) {
        if (this.j != i) {
            this.j = i;
            this.k = new PorterDuffColorFilter(this.j, PorterDuff.Mode.SRC_ATOP);
            View view = this.f;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final void e(h19 h19Var) {
        if (Objects.equals(this.e, h19Var)) {
            return;
        }
        ImageReceiver imageReceiver = this.a;
        imageReceiver.f();
        vl vlVar = this.b;
        if (vlVar != null) {
            vlVar.o(this.f);
            this.b = null;
        }
        this.e = h19Var;
        boolean z = this.i;
        String str = z ? "60_60_firstframe" : "60_60";
        if (h19Var.f != null) {
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hq6.d0(this.d).r.get(h19Var.f);
            if (tL_availableReaction != null) {
                imageReceiver.Z(gl5.b(tL_availableReaction.select_animation), str, null, null, uo3.f(tL_availableReaction.select_animation, bkb.l6, 0.2f, null), 0L, "tgs", h19Var, 0);
                return;
            }
            return;
        }
        vl vlVar2 = new vl(z ? 13 : 1, y6c.t0, h19Var.g);
        this.b = vlVar2;
        if (this.g) {
            vlVar2.b(this.f);
        }
        vl vlVar3 = this.b;
        this.j = -16777216;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
        this.k = porterDuffColorFilter;
        vlVar3.setColorFilter(porterDuffColorFilter);
    }
}
