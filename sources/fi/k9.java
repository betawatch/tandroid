package fi;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ch0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class k9 extends j9 {
    public final o8 a;
    public final TL_stories.TL_mediaAreaSuggestedReaction b;
    public final ch.g0 c;
    public final /* synthetic */ n9 d;

    public k9(n9 n9Var, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction) {
        this.d = n9Var;
        o8 o8Var = new o8(null);
        this.a = o8Var;
        ch.g0 g0Var = new ch.g0(null);
        this.c = g0Var;
        this.b = tL_mediaAreaSuggestedReaction;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            o8Var.b(true, false);
        }
        if (tL_mediaAreaSuggestedReaction.dark) {
            o8Var.a();
        }
        g0Var.i = true;
        g0Var.e(ch.p0.d(tL_mediaAreaSuggestedReaction.reaction));
    }

    @Override // fi.j9
    public final void a(Canvas canvas, float f10) {
        ch.g0 g0Var = this.c;
        org.telegram.ui.Components.g5 g5Var = g0Var.b;
        ImageReceiver imageReceiver = g5Var != null ? g5Var.k : g0Var.a;
        if (imageReceiver != null && imageReceiver.K() && imageReceiver.J()) {
            ch0 B = imageReceiver.B();
            if (B == null || !B.y()) {
                n9 n9Var = this.d;
                double d = n9Var.b;
                double d2 = n9Var.d;
                TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = this.b;
                TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaSuggestedReaction.coordinates;
                float f11 = (float) (((mediaAreaCoordinates.x * d2) / 100.0d) + d);
                double d10 = n9Var.c;
                double d11 = n9Var.e;
                float f12 = (float) (((mediaAreaCoordinates.y * d11) / 100.0d) + d10);
                float f13 = ((float) ((d2 * mediaAreaCoordinates.w) / 100.0d)) / 2.0f;
                float f14 = ((float) ((d11 * mediaAreaCoordinates.h) / 100.0d)) / 2.0f;
                o8 o8Var = this.a;
                o8Var.setBounds((int) (f11 - f13), (int) (f12 - f14), (int) (f13 + f11), (int) (f14 + f12));
                o8Var.e = (int) (255.0f * f10);
                canvas.save();
                double d12 = tL_mediaAreaSuggestedReaction.coordinates.rotation;
                if (d12 != 0.0d) {
                    canvas.rotate((float) d12, f11, f12);
                }
                Rect rect = org.telegram.messenger.g0.Q;
                float height = (o8Var.getBounds().height() * 0.61f) / 2.0f;
                rect.set((int) (o8Var.getBounds().centerX() - height), (int) (o8Var.getBounds().centerY() - height), (int) (o8Var.getBounds().centerX() + height), (int) (o8Var.getBounds().centerY() + height));
                o8Var.c(1.0f);
                o8Var.draw(canvas);
                g0Var.c(rect);
                g0Var.h = f10;
                g0Var.d(o8Var.a == 1 ? -1 : -16777216);
                g0Var.a(canvas);
                canvas.restore();
            }
        }
    }

    @Override // fi.j9
    public final void b(boolean z10) {
        this.c.b(z10);
    }

    @Override // fi.j9
    public final void c(View view) {
        ch.g0 g0Var = this.c;
        if (g0Var.f == view) {
            return;
        }
        if (!g0Var.g) {
            g0Var.f = view;
            return;
        }
        g0Var.b(false);
        g0Var.f = view;
        g0Var.b(true);
    }
}
