package ih;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.mi0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class o9 extends n9 {
    public final s8 a;
    public final TL_stories.TL_mediaAreaSuggestedReaction b;
    public final hg.i0 c;
    public final /* synthetic */ r9 d;

    public o9(r9 r9Var, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction) {
        this.d = r9Var;
        s8 s8Var = new s8(null);
        this.a = s8Var;
        hg.i0 i0Var = new hg.i0(null);
        this.c = i0Var;
        this.b = tL_mediaAreaSuggestedReaction;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            s8Var.b(true, false);
        }
        if (tL_mediaAreaSuggestedReaction.dark) {
            s8Var.a();
        }
        i0Var.i = true;
        i0Var.e(hg.r0.d(tL_mediaAreaSuggestedReaction.reaction));
    }

    @Override // ih.n9
    public final void a(Canvas canvas, float f10) {
        hg.i0 i0Var = this.c;
        org.telegram.ui.Components.k5 k5Var = i0Var.b;
        ImageReceiver imageReceiver = k5Var != null ? k5Var.k : i0Var.a;
        if (imageReceiver != null && imageReceiver.hasImageSet() && imageReceiver.hasImageLoaded()) {
            mi0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation == null || !lottieAnimation.w()) {
                r9 r9Var = this.d;
                double d = r9Var.b;
                double d9 = r9Var.d;
                TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = this.b;
                TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaSuggestedReaction.coordinates;
                float f11 = (float) (((mediaAreaCoordinates.x * d9) / 100.0d) + d);
                double d10 = r9Var.c;
                double d11 = r9Var.e;
                float f12 = (float) (((mediaAreaCoordinates.y * d11) / 100.0d) + d10);
                float f13 = ((float) ((d9 * mediaAreaCoordinates.w) / 100.0d)) / 2.0f;
                float f14 = ((float) ((d11 * mediaAreaCoordinates.h) / 100.0d)) / 2.0f;
                s8 s8Var = this.a;
                s8Var.setBounds((int) (f11 - f13), (int) (f12 - f14), (int) (f13 + f11), (int) (f14 + f12));
                s8Var.e = (int) (255.0f * f10);
                canvas.save();
                double d12 = tL_mediaAreaSuggestedReaction.coordinates.rotation;
                if (d12 != 0.0d) {
                    canvas.rotate((float) d12, f11, f12);
                }
                Rect rect = AndroidUtilities.rectTmp2;
                float height = (s8Var.getBounds().height() * 0.61f) / 2.0f;
                rect.set((int) (s8Var.getBounds().centerX() - height), (int) (s8Var.getBounds().centerY() - height), (int) (s8Var.getBounds().centerX() + height), (int) (s8Var.getBounds().centerY() + height));
                s8Var.c(1.0f);
                s8Var.draw(canvas);
                i0Var.c(rect);
                i0Var.h = f10;
                i0Var.d(s8Var.a == 1 ? -1 : -16777216);
                i0Var.a(canvas);
                canvas.restore();
            }
        }
    }

    @Override // ih.n9
    public final void b(boolean z10) {
        this.c.b(z10);
    }

    @Override // ih.n9
    public final void c(View view) {
        hg.i0 i0Var = this.c;
        if (i0Var.f == view) {
            return;
        }
        if (!i0Var.g) {
            i0Var.f = view;
            return;
        }
        i0Var.b(false);
        i0Var.f = view;
        i0Var.b(true);
    }
}
