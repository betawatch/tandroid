package ch;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.View;
import fi.s2;
import j$.util.Objects;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fc;
import org.telegram.messenger.j10;
import org.telegram.messenger.ri;
import org.telegram.messenger.u5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.o5;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class g0 {
    public final ImageReceiver a;
    public o5 b;
    public p0 e;
    public View f;
    public boolean g;
    public boolean i;
    public int j;
    public PorterDuffColorFilter k;
    public final Rect c = new Rect();
    public final int d = j10.t0;
    public float h = 1.0f;

    public g0(View view) {
        this.f = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.a = imageReceiver;
        imageReceiver.A1 = true;
    }

    public final void a(Canvas canvas) {
        o5 o5Var = this.b;
        Rect rect = this.c;
        if (o5Var != null) {
            s2 s2Var = o5Var.k;
            if (s2Var != null) {
                s2Var.J0((int) (rect.width() * 0.1f));
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
            o5 o5Var = this.b;
            if (o5Var != null) {
                o5Var.a(this.f);
                return;
            }
            return;
        }
        imageReceiver.R();
        o5 o5Var2 = this.b;
        if (o5Var2 != null) {
            o5Var2.n(this.f);
        }
    }

    public final void c(Rect rect) {
        this.c.set(rect);
    }

    public final void d(int i7) {
        if (this.j != i7) {
            this.j = i7;
            this.k = new PorterDuffColorFilter(this.j, PorterDuff.Mode.SRC_ATOP);
            View view = this.f;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final void e(p0 p0Var) {
        if (Objects.equals(this.e, p0Var)) {
            return;
        }
        ImageReceiver imageReceiver = this.a;
        imageReceiver.f();
        o5 o5Var = this.b;
        if (o5Var != null) {
            o5Var.n(this.f);
            this.b = null;
        }
        this.e = p0Var;
        boolean z10 = this.i;
        String str = z10 ? "60_60_firstframe" : "60_60";
        if (p0Var.f != null) {
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ri.d0(this.d).r.get(p0Var.f);
            if (tL_availableReaction != null) {
                imageReceiver.r0(fc.b(tL_availableReaction.select_animation), str, null, null, u5.f(tL_availableReaction.select_animation, n6.m6, 0.2f, null), 0L, "tgs", p0Var, 0);
                return;
            }
            return;
        }
        o5 o5Var2 = new o5(z10 ? 13 : 1, j10.t0, p0Var.g);
        this.b = o5Var2;
        if (this.g) {
            o5Var2.a(this.f);
        }
        o5 o5Var3 = this.b;
        this.j = -16777216;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
        this.k = porterDuffColorFilter;
        o5Var3.setColorFilter(porterDuffColorFilter);
    }
}
