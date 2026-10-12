package bi;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.yj0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class ub extends tb {
    public final ya a;
    public final TL_stories.TL_mediaAreaSuggestedReaction b;
    public final ah.y0 c;
    public final /* synthetic */ xb d;

    public ub(xb xbVar, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction) {
        this.d = xbVar;
        ya yaVar = new ya(null);
        this.a = yaVar;
        ah.y0 y0Var = new ah.y0(null);
        this.c = y0Var;
        this.b = tL_mediaAreaSuggestedReaction;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            yaVar.b(true, false);
        }
        if (tL_mediaAreaSuggestedReaction.dark) {
            yaVar.a();
        }
        y0Var.i = true;
        y0Var.e(ah.i1.d(tL_mediaAreaSuggestedReaction.reaction));
    }

    @Override // bi.tb
    public final void a(Canvas canvas, float f7) {
        ah.y0 y0Var = this.c;
        org.telegram.ui.Components.s5 s5Var = y0Var.b;
        ImageReceiver imageReceiver = s5Var != null ? s5Var.k : y0Var.a;
        if (imageReceiver != null && imageReceiver.hasImageSet() && imageReceiver.hasImageLoaded()) {
            yj0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation == null || !lottieAnimation.y()) {
                xb xbVar = this.d;
                double d = xbVar.b;
                double d10 = xbVar.d;
                TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = this.b;
                TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaSuggestedReaction.coordinates;
                float f10 = (float) (((mediaAreaCoordinates.x * d10) / 100.0d) + d);
                double d11 = xbVar.c;
                double d12 = xbVar.e;
                float f11 = (float) (((mediaAreaCoordinates.y * d12) / 100.0d) + d11);
                float f12 = ((float) ((d10 * mediaAreaCoordinates.w) / 100.0d)) / 2.0f;
                float f13 = ((float) ((d12 * mediaAreaCoordinates.h) / 100.0d)) / 2.0f;
                ya yaVar = this.a;
                yaVar.setBounds((int) (f10 - f12), (int) (f11 - f13), (int) (f12 + f10), (int) (f13 + f11));
                yaVar.e = (int) (255.0f * f7);
                canvas.save();
                double d13 = tL_mediaAreaSuggestedReaction.coordinates.rotation;
                if (d13 != 0.0d) {
                    canvas.rotate((float) d13, f10, f11);
                }
                Rect rect = AndroidUtilities.rectTmp2;
                float height = (yaVar.getBounds().height() * 0.61f) / 2.0f;
                rect.set((int) (yaVar.getBounds().centerX() - height), (int) (yaVar.getBounds().centerY() - height), (int) (yaVar.getBounds().centerX() + height), (int) (yaVar.getBounds().centerY() + height));
                yaVar.c(1.0f);
                yaVar.draw(canvas);
                y0Var.c(rect);
                y0Var.h = f7;
                y0Var.d(yaVar.a == 1 ? -1 : -16777216);
                y0Var.a(canvas);
                canvas.restore();
            }
        }
    }

    @Override // bi.tb
    public final void b(boolean z10) {
        this.c.b(z10);
    }

    @Override // bi.tb
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
