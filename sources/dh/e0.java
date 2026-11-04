package dh;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.View;
import ei.c3;
import j$.util.Objects;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ac;
import org.telegram.messenger.h10;
import org.telegram.messenger.li;
import org.telegram.messenger.t5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.g5;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e0 {
    public final ImageReceiver a;
    public g5 b;
    public n0 e;
    public View f;
    public boolean g;
    public boolean i;
    public int j;
    public PorterDuffColorFilter k;
    public final Rect c = new Rect();
    public final int d = h10.t0;
    public float h = 1.0f;

    public e0(View view) {
        this.f = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.a = imageReceiver;
        imageReceiver.A1 = true;
    }

    public final void a(Canvas canvas) {
        g5 g5Var = this.b;
        Rect rect = this.c;
        if (g5Var != null) {
            c3 c3Var = g5Var.k;
            if (c3Var != null) {
                c3Var.J0((int) (rect.width() * 0.1f));
            }
            this.b.setColorFilter(this.k);
            this.b.setBounds(rect);
            this.b.setAlpha((int) (this.h * 255.0f));
            this.b.draw(canvas);
            return;
        }
        float f10 = rect.left;
        float f11 = rect.top;
        float width = rect.width();
        float height = rect.height();
        ImageReceiver imageReceiver = this.a;
        imageReceiver.y0(f10, f11, width, height);
        imageReceiver.setAlpha(this.h);
        imageReceiver.h(canvas, null);
    }

    public final void b(boolean z10) {
        this.g = z10;
        ImageReceiver imageReceiver = this.a;
        if (z10) {
            imageReceiver.P();
            g5 g5Var = this.b;
            if (g5Var != null) {
                g5Var.a(this.f);
                return;
            }
            return;
        }
        imageReceiver.R();
        g5 g5Var2 = this.b;
        if (g5Var2 != null) {
            g5Var2.n(this.f);
        }
    }

    public final void c(Rect rect) {
        this.c.set(rect);
    }

    public final void d(int i3) {
        if (this.j != i3) {
            this.j = i3;
            this.k = new PorterDuffColorFilter(this.j, PorterDuff.Mode.SRC_ATOP);
            View view = this.f;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final void e(n0 n0Var) {
        if (Objects.equals(this.e, n0Var)) {
            return;
        }
        ImageReceiver imageReceiver = this.a;
        imageReceiver.f();
        g5 g5Var = this.b;
        if (g5Var != null) {
            g5Var.n(this.f);
            this.b = null;
        }
        this.e = n0Var;
        boolean z10 = this.i;
        String str = z10 ? "60_60_firstframe" : "60_60";
        if (n0Var.f != null) {
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) li.b0(this.d).r.get(n0Var.f);
            if (tL_availableReaction != null) {
                imageReceiver.r0(ac.b(tL_availableReaction.select_animation), str, null, null, t5.f(tL_availableReaction.select_animation, k6.m6, 0.2f, null), 0L, "tgs", n0Var, 0);
                return;
            }
            return;
        }
        g5 g5Var2 = new g5(z10 ? 13 : 1, h10.t0, n0Var.g);
        this.b = g5Var2;
        if (this.g) {
            g5Var2.a(this.f);
        }
        g5 g5Var3 = this.b;
        this.j = -16777216;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
        this.k = porterDuffColorFilter;
        g5Var3.setColorFilter(porterDuffColorFilter);
    }
}
