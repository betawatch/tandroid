package ch;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.View;
import di.z2;
import j$.util.Objects;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hc;
import org.telegram.messenger.p10;
import org.telegram.messenger.t5;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.i5;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class f0 {
    public final ImageReceiver a;
    public i5 b;
    public o0 e;
    public View f;
    public boolean g;
    public boolean i;
    public int j;
    public PorterDuffColorFilter k;
    public final Rect c = new Rect();
    public final int d = p10.s0;
    public float h = 1.0f;

    public f0(View view) {
        this.f = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.a = imageReceiver;
        imageReceiver.z1 = true;
    }

    public final void a(Canvas canvas) {
        i5 i5Var = this.b;
        Rect rect = this.c;
        if (i5Var != null) {
            z2 z2Var = i5Var.k;
            if (z2Var != null) {
                z2Var.J0((int) (rect.width() * 0.1f));
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

    public final void b(boolean z9) {
        this.g = z9;
        ImageReceiver imageReceiver = this.a;
        if (z9) {
            imageReceiver.P();
            i5 i5Var = this.b;
            if (i5Var != null) {
                i5Var.a(this.f);
                return;
            }
            return;
        }
        imageReceiver.R();
        i5 i5Var2 = this.b;
        if (i5Var2 != null) {
            i5Var2.n(this.f);
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

    public final void e(o0 o0Var) {
        if (Objects.equals(this.e, o0Var)) {
            return;
        }
        ImageReceiver imageReceiver = this.a;
        imageReceiver.f();
        i5 i5Var = this.b;
        if (i5Var != null) {
            i5Var.n(this.f);
            this.b = null;
        }
        this.e = o0Var;
        boolean z9 = this.i;
        String str = z9 ? "60_60_firstframe" : "60_60";
        if (o0Var.f != null) {
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ui.b0(this.d).r.get(o0Var.f);
            if (tL_availableReaction != null) {
                imageReceiver.r0(hc.b(tL_availableReaction.select_animation), str, null, null, t5.f(tL_availableReaction.select_animation, k6.m6, 0.2f, null), 0L, "tgs", o0Var, 0);
                return;
            }
            return;
        }
        i5 i5Var2 = new i5(z9 ? 13 : 1, p10.s0, o0Var.g);
        this.b = i5Var2;
        if (this.g) {
            i5Var2.a(this.f);
        }
        i5 i5Var3 = this.b;
        this.j = -16777216;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
        this.k = porterDuffColorFilter;
        i5Var3.setColorFilter(porterDuffColorFilter);
    }
}
