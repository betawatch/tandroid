package ai;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ck0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class mc extends lc {
    public final pb a;
    public final TL_stories.TL_mediaAreaSuggestedReaction b;
    public final zg.e0 c;
    public final /* synthetic */ pc d;

    public mc(pc pcVar, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction) {
        this.d = pcVar;
        pb pbVar = new pb(null);
        this.a = pbVar;
        zg.e0 e0Var = new zg.e0(null);
        this.c = e0Var;
        this.b = tL_mediaAreaSuggestedReaction;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            pbVar.b(true, false);
        }
        if (tL_mediaAreaSuggestedReaction.dark) {
            pbVar.a();
        }
        e0Var.i = true;
        e0Var.e(zg.n0.d(tL_mediaAreaSuggestedReaction.reaction));
    }

    @Override // ai.lc
    public final void a(Canvas canvas, float f7) {
        zg.e0 e0Var = this.c;
        org.telegram.ui.Components.s5 s5Var = e0Var.b;
        ImageReceiver imageReceiver = s5Var != null ? s5Var.k : e0Var.a;
        if (imageReceiver != null && imageReceiver.hasImageSet() && imageReceiver.hasImageLoaded()) {
            ck0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation == null || !lottieAnimation.y()) {
                pc pcVar = this.d;
                double d = pcVar.b;
                double d10 = pcVar.d;
                TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = this.b;
                TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaSuggestedReaction.coordinates;
                float f10 = (float) (((mediaAreaCoordinates.x * d10) / 100.0d) + d);
                double d11 = pcVar.c;
                double d12 = pcVar.e;
                float f11 = (float) (((mediaAreaCoordinates.y * d12) / 100.0d) + d11);
                float f12 = ((float) ((d10 * mediaAreaCoordinates.w) / 100.0d)) / 2.0f;
                float f13 = ((float) ((d12 * mediaAreaCoordinates.h) / 100.0d)) / 2.0f;
                pb pbVar = this.a;
                pbVar.setBounds((int) (f10 - f12), (int) (f11 - f13), (int) (f12 + f10), (int) (f13 + f11));
                pbVar.e = (int) (255.0f * f7);
                canvas.save();
                double d13 = tL_mediaAreaSuggestedReaction.coordinates.rotation;
                if (d13 != 0.0d) {
                    canvas.rotate((float) d13, f10, f11);
                }
                Rect rect = AndroidUtilities.rectTmp2;
                float height = (pbVar.getBounds().height() * 0.61f) / 2.0f;
                rect.set((int) (pbVar.getBounds().centerX() - height), (int) (pbVar.getBounds().centerY() - height), (int) (pbVar.getBounds().centerX() + height), (int) (pbVar.getBounds().centerY() + height));
                pbVar.c(1.0f);
                pbVar.draw(canvas);
                e0Var.c(rect);
                e0Var.h = f7;
                e0Var.d(pbVar.a == 1 ? -1 : -16777216);
                e0Var.a(canvas);
                canvas.restore();
            }
        }
    }

    @Override // ai.lc
    public final void b(boolean z10) {
        this.c.b(z10);
    }

    @Override // ai.lc
    public final void c(View view) {
        zg.e0 e0Var = this.c;
        if (e0Var.f == view) {
            return;
        }
        if (!e0Var.g) {
            e0Var.f = view;
            return;
        }
        e0Var.b(false);
        e0Var.f = view;
        e0Var.b(true);
    }
}
