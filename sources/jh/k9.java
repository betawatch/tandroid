package jh;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.oi0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class k9 extends j9 {
    public final o8 a;
    public final TL_stories.TL_mediaAreaSuggestedReaction b;
    public final ig.h0 c;
    public final /* synthetic */ n9 d;

    public k9(n9 n9Var, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction) {
        this.d = n9Var;
        o8 o8Var = new o8(null);
        this.a = o8Var;
        ig.h0 h0Var = new ig.h0(null);
        this.c = h0Var;
        this.b = tL_mediaAreaSuggestedReaction;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            o8Var.b(true, false);
        }
        if (tL_mediaAreaSuggestedReaction.dark) {
            o8Var.a();
        }
        h0Var.i = true;
        h0Var.e(ig.q0.d(tL_mediaAreaSuggestedReaction.reaction));
    }

    @Override // jh.j9
    public final void a(Canvas canvas, float f10) {
        ig.h0 h0Var = this.c;
        org.telegram.ui.Components.k5 k5Var = h0Var.b;
        ImageReceiver imageReceiver = k5Var != null ? k5Var.k : h0Var.a;
        if (imageReceiver != null && imageReceiver.hasImageSet() && imageReceiver.hasImageLoaded()) {
            oi0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation == null || !lottieAnimation.w()) {
                n9 n9Var = this.d;
                double d = n9Var.b;
                double d10 = n9Var.d;
                TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = this.b;
                TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaSuggestedReaction.coordinates;
                float f11 = (float) (((mediaAreaCoordinates.x * d10) / 100.0d) + d);
                double d11 = n9Var.c;
                double d12 = n9Var.e;
                float f12 = (float) (((mediaAreaCoordinates.y * d12) / 100.0d) + d11);
                float f13 = ((float) ((d10 * mediaAreaCoordinates.w) / 100.0d)) / 2.0f;
                float f14 = ((float) ((d12 * mediaAreaCoordinates.h) / 100.0d)) / 2.0f;
                o8 o8Var = this.a;
                o8Var.setBounds((int) (f11 - f13), (int) (f12 - f14), (int) (f13 + f11), (int) (f14 + f12));
                o8Var.e = (int) (255.0f * f10);
                canvas.save();
                double d13 = tL_mediaAreaSuggestedReaction.coordinates.rotation;
                if (d13 != 0.0d) {
                    canvas.rotate((float) d13, f11, f12);
                }
                Rect rect = AndroidUtilities.rectTmp2;
                float height = (o8Var.getBounds().height() * 0.61f) / 2.0f;
                rect.set((int) (o8Var.getBounds().centerX() - height), (int) (o8Var.getBounds().centerY() - height), (int) (o8Var.getBounds().centerX() + height), (int) (o8Var.getBounds().centerY() + height));
                o8Var.c(1.0f);
                o8Var.draw(canvas);
                h0Var.c(rect);
                h0Var.h = f10;
                h0Var.d(o8Var.a == 1 ? -1 : -16777216);
                h0Var.a(canvas);
                canvas.restore();
            }
        }
    }

    @Override // jh.j9
    public final void b(boolean z10) {
        this.c.b(z10);
    }

    @Override // jh.j9
    public final void c(View view) {
        ig.h0 h0Var = this.c;
        if (h0Var.f == view) {
            return;
        }
        if (!h0Var.g) {
            h0Var.f = view;
            return;
        }
        h0Var.b(false);
        h0Var.f = view;
        h0Var.b(true);
    }
}
