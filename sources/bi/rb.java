package bi;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.xi0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class rb extends qb {
    public final va a;
    public final TL_stories.TL_mediaAreaSuggestedReaction b;
    public final ah.z0 c;
    public final /* synthetic */ ub d;

    public rb(ub ubVar, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction) {
        this.d = ubVar;
        va vaVar = new va(null);
        this.a = vaVar;
        ah.z0 z0Var = new ah.z0(null);
        this.c = z0Var;
        this.b = tL_mediaAreaSuggestedReaction;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            vaVar.b(true, false);
        }
        if (tL_mediaAreaSuggestedReaction.dark) {
            vaVar.a();
        }
        z0Var.i = true;
        z0Var.e(ah.j1.d(tL_mediaAreaSuggestedReaction.reaction));
    }

    @Override // bi.qb
    public final void a(Canvas canvas, float f7) {
        ah.z0 z0Var = this.c;
        org.telegram.ui.Components.q5 q5Var = z0Var.b;
        ImageReceiver imageReceiver = q5Var != null ? q5Var.k : z0Var.a;
        if (imageReceiver != null && imageReceiver.hasImageSet() && imageReceiver.hasImageLoaded()) {
            xi0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation == null || !lottieAnimation.w()) {
                ub ubVar = this.d;
                double d = ubVar.b;
                double d10 = ubVar.d;
                TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = this.b;
                TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaSuggestedReaction.coordinates;
                float f10 = (float) (((mediaAreaCoordinates.x * d10) / 100.0d) + d);
                double d11 = ubVar.c;
                double d12 = ubVar.e;
                float f11 = (float) (((mediaAreaCoordinates.y * d12) / 100.0d) + d11);
                float f12 = ((float) ((d10 * mediaAreaCoordinates.w) / 100.0d)) / 2.0f;
                float f13 = ((float) ((d12 * mediaAreaCoordinates.h) / 100.0d)) / 2.0f;
                va vaVar = this.a;
                vaVar.setBounds((int) (f10 - f12), (int) (f11 - f13), (int) (f12 + f10), (int) (f13 + f11));
                vaVar.e = (int) (255.0f * f7);
                canvas.save();
                double d13 = tL_mediaAreaSuggestedReaction.coordinates.rotation;
                if (d13 != 0.0d) {
                    canvas.rotate((float) d13, f10, f11);
                }
                Rect rect = AndroidUtilities.rectTmp2;
                float height = (vaVar.getBounds().height() * 0.61f) / 2.0f;
                rect.set((int) (vaVar.getBounds().centerX() - height), (int) (vaVar.getBounds().centerY() - height), (int) (vaVar.getBounds().centerX() + height), (int) (vaVar.getBounds().centerY() + height));
                vaVar.c(1.0f);
                vaVar.draw(canvas);
                z0Var.c(rect);
                z0Var.h = f7;
                z0Var.d(vaVar.a == 1 ? -1 : -16777216);
                z0Var.a(canvas);
                canvas.restore();
            }
        }
    }

    @Override // bi.qb
    public final void b(boolean z10) {
        this.c.b(z10);
    }

    @Override // bi.qb
    public final void c(View view) {
        ah.z0 z0Var = this.c;
        if (z0Var.f == view) {
            return;
        }
        if (!z0Var.g) {
            z0Var.f = view;
            return;
        }
        z0Var.b(false);
        z0Var.f = view;
        z0Var.b(true);
    }
}
