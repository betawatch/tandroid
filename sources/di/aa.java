package di;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.yj0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class aa extends z9 {
    public final e9 a;
    public final TL_stories.TL_mediaAreaSuggestedReaction b;
    public final bh.n0 c;
    public final /* synthetic */ da d;

    public aa(da daVar, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction) {
        this.d = daVar;
        e9 e9Var = new e9(null);
        this.a = e9Var;
        bh.n0 n0Var = new bh.n0(null);
        this.c = n0Var;
        this.b = tL_mediaAreaSuggestedReaction;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            e9Var.b(true, false);
        }
        if (tL_mediaAreaSuggestedReaction.dark) {
            e9Var.a();
        }
        n0Var.i = true;
        n0Var.e(bh.x0.d(tL_mediaAreaSuggestedReaction.reaction));
    }

    @Override // di.z9
    public final void a(Canvas canvas, float f7) {
        bh.n0 n0Var = this.c;
        org.telegram.ui.Components.t5 t5Var = n0Var.b;
        ImageReceiver imageReceiver = t5Var != null ? t5Var.k : n0Var.a;
        if (imageReceiver != null && imageReceiver.hasImageSet() && imageReceiver.hasImageLoaded()) {
            yj0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation == null || !lottieAnimation.y()) {
                da daVar = this.d;
                double d = daVar.b;
                double d10 = daVar.d;
                TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = this.b;
                TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaSuggestedReaction.coordinates;
                float f10 = (float) (((mediaAreaCoordinates.x * d10) / 100.0d) + d);
                double d11 = daVar.c;
                double d12 = daVar.e;
                float f11 = (float) (((mediaAreaCoordinates.y * d12) / 100.0d) + d11);
                float f12 = ((float) ((d10 * mediaAreaCoordinates.w) / 100.0d)) / 2.0f;
                float f13 = ((float) ((d12 * mediaAreaCoordinates.h) / 100.0d)) / 2.0f;
                e9 e9Var = this.a;
                e9Var.setBounds((int) (f10 - f12), (int) (f11 - f13), (int) (f12 + f10), (int) (f13 + f11));
                e9Var.e = (int) (255.0f * f7);
                canvas.save();
                double d13 = tL_mediaAreaSuggestedReaction.coordinates.rotation;
                if (d13 != 0.0d) {
                    canvas.rotate((float) d13, f10, f11);
                }
                Rect rect = AndroidUtilities.rectTmp2;
                float height = (e9Var.getBounds().height() * 0.61f) / 2.0f;
                rect.set((int) (e9Var.getBounds().centerX() - height), (int) (e9Var.getBounds().centerY() - height), (int) (e9Var.getBounds().centerX() + height), (int) (e9Var.getBounds().centerY() + height));
                e9Var.c(1.0f);
                e9Var.draw(canvas);
                n0Var.c(rect);
                n0Var.h = f7;
                n0Var.d(e9Var.a == 1 ? -1 : -16777216);
                n0Var.a(canvas);
                canvas.restore();
            }
        }
    }

    @Override // di.z9
    public final void b(boolean z10) {
        this.c.b(z10);
    }

    @Override // di.z9
    public final void c(View view) {
        bh.n0 n0Var = this.c;
        if (n0Var.f == view) {
            return;
        }
        if (!n0Var.g) {
            n0Var.f = view;
            return;
        }
        n0Var.b(false);
        n0Var.f = view;
        n0Var.b(true);
    }
}
