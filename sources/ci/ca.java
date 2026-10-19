package ci;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class ca extends ba {
    public final g9 a;
    public final TL_stories.TL_mediaAreaSuggestedReaction b;
    public final ah.y0 c;
    public final /* synthetic */ fa d;

    public ca(fa faVar, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction) {
        this.d = faVar;
        g9 g9Var = new g9(null);
        this.a = g9Var;
        ah.y0 y0Var = new ah.y0(null);
        this.c = y0Var;
        this.b = tL_mediaAreaSuggestedReaction;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            g9Var.b(true, false);
        }
        if (tL_mediaAreaSuggestedReaction.dark) {
            g9Var.a();
        }
        y0Var.i = true;
        y0Var.e(ah.i1.d(tL_mediaAreaSuggestedReaction.reaction));
    }

    @Override // ci.ba
    public final void a(Canvas canvas, float f7) {
        ah.y0 y0Var = this.c;
        org.telegram.ui.Components.r5 r5Var = y0Var.b;
        ImageReceiver imageReceiver = r5Var != null ? r5Var.k : y0Var.a;
        if (imageReceiver != null && imageReceiver.hasImageSet() && imageReceiver.hasImageLoaded()) {
            uj0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation == null || !lottieAnimation.y()) {
                fa faVar = this.d;
                double d = faVar.b;
                double d10 = faVar.d;
                TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = this.b;
                TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaSuggestedReaction.coordinates;
                float f10 = (float) (((mediaAreaCoordinates.x * d10) / 100.0d) + d);
                double d11 = faVar.c;
                double d12 = faVar.e;
                float f11 = (float) (((mediaAreaCoordinates.y * d12) / 100.0d) + d11);
                float f12 = ((float) ((d10 * mediaAreaCoordinates.w) / 100.0d)) / 2.0f;
                float f13 = ((float) ((d12 * mediaAreaCoordinates.h) / 100.0d)) / 2.0f;
                g9 g9Var = this.a;
                g9Var.setBounds((int) (f10 - f12), (int) (f11 - f13), (int) (f12 + f10), (int) (f13 + f11));
                g9Var.e = (int) (255.0f * f7);
                canvas.save();
                double d13 = tL_mediaAreaSuggestedReaction.coordinates.rotation;
                if (d13 != 0.0d) {
                    canvas.rotate((float) d13, f10, f11);
                }
                Rect rect = AndroidUtilities.rectTmp2;
                float height = (g9Var.getBounds().height() * 0.61f) / 2.0f;
                rect.set((int) (g9Var.getBounds().centerX() - height), (int) (g9Var.getBounds().centerY() - height), (int) (g9Var.getBounds().centerX() + height), (int) (g9Var.getBounds().centerY() + height));
                g9Var.c(1.0f);
                g9Var.draw(canvas);
                y0Var.c(rect);
                y0Var.h = f7;
                y0Var.d(g9Var.a == 1 ? -1 : -16777216);
                y0Var.a(canvas);
                canvas.restore();
            }
        }
    }

    @Override // ci.ba
    public final void b(boolean z10) {
        this.c.b(z10);
    }

    @Override // ci.ba
    public final void c(View view) {
        ah.y0 y0Var = this.c;
        if (y0Var.f == view) {
            return;
        }
        if (!y0Var.g) {
            y0Var.f = view;
            return;
        }
        y0Var.b(false);
        y0Var.f = view;
        y0Var.b(true);
    }
}
