package fi;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.oh0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class h9 extends g9 {
    public final l8 a;
    public final TL_stories.TL_mediaAreaSuggestedReaction b;
    public final ch.g0 c;
    public final /* synthetic */ k9 d;

    public h9(k9 k9Var, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction) {
        this.d = k9Var;
        l8 l8Var = new l8(null);
        this.a = l8Var;
        ch.g0 g0Var = new ch.g0(null);
        this.c = g0Var;
        this.b = tL_mediaAreaSuggestedReaction;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            l8Var.b(true, false);
        }
        if (tL_mediaAreaSuggestedReaction.dark) {
            l8Var.a();
        }
        g0Var.i = true;
        g0Var.e(ch.p0.d(tL_mediaAreaSuggestedReaction.reaction));
    }

    @Override // fi.g9
    public final void a(Canvas canvas, float f10) {
        ch.g0 g0Var = this.c;
        org.telegram.ui.Components.p5 p5Var = g0Var.b;
        ImageReceiver imageReceiver = p5Var != null ? p5Var.k : g0Var.a;
        if (imageReceiver != null && imageReceiver.K() && imageReceiver.J()) {
            oh0 B = imageReceiver.B();
            if (B == null || !B.y()) {
                k9 k9Var = this.d;
                double d = k9Var.b;
                double d2 = k9Var.d;
                TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = this.b;
                TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaSuggestedReaction.coordinates;
                float f11 = (float) (((mediaAreaCoordinates.x * d2) / 100.0d) + d);
                double d10 = k9Var.c;
                double d11 = k9Var.e;
                float f12 = (float) (((mediaAreaCoordinates.y * d11) / 100.0d) + d10);
                float f13 = ((float) ((d2 * mediaAreaCoordinates.w) / 100.0d)) / 2.0f;
                float f14 = ((float) ((d11 * mediaAreaCoordinates.h) / 100.0d)) / 2.0f;
                l8 l8Var = this.a;
                l8Var.setBounds((int) (f11 - f13), (int) (f12 - f14), (int) (f13 + f11), (int) (f14 + f12));
                l8Var.e = (int) (255.0f * f10);
                canvas.save();
                double d12 = tL_mediaAreaSuggestedReaction.coordinates.rotation;
                if (d12 != 0.0d) {
                    canvas.rotate((float) d12, f11, f12);
                }
                Rect rect = org.telegram.messenger.g0.Q;
                float height = (l8Var.getBounds().height() * 0.61f) / 2.0f;
                rect.set((int) (l8Var.getBounds().centerX() - height), (int) (l8Var.getBounds().centerY() - height), (int) (l8Var.getBounds().centerX() + height), (int) (l8Var.getBounds().centerY() + height));
                l8Var.c(1.0f);
                l8Var.draw(canvas);
                g0Var.c(rect);
                g0Var.h = f10;
                g0Var.d(l8Var.a == 1 ? -1 : -16777216);
                g0Var.a(canvas);
                canvas.restore();
            }
        }
    }

    @Override // fi.g9
    public final void b(boolean z10) {
        this.c.b(z10);
    }

    @Override // fi.g9
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
