package ai;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.yi0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class lc extends kc {
    public final ob a;
    public final TL_stories.TL_mediaAreaSuggestedReaction b;
    public final zg.g0 c;
    public final /* synthetic */ oc d;

    public lc(oc ocVar, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction) {
        this.d = ocVar;
        ob obVar = new ob(null);
        this.a = obVar;
        zg.g0 g0Var = new zg.g0(null);
        this.c = g0Var;
        this.b = tL_mediaAreaSuggestedReaction;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            obVar.b(true, false);
        }
        if (tL_mediaAreaSuggestedReaction.dark) {
            obVar.a();
        }
        g0Var.i = true;
        g0Var.e(zg.p0.d(tL_mediaAreaSuggestedReaction.reaction));
    }

    @Override // ai.kc
    public final void a(Canvas canvas, float f7) {
        zg.g0 g0Var = this.c;
        org.telegram.ui.Components.q5 q5Var = g0Var.b;
        ImageReceiver imageReceiver = q5Var != null ? q5Var.k : g0Var.a;
        if (imageReceiver != null && imageReceiver.hasImageSet() && imageReceiver.hasImageLoaded()) {
            yi0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation == null || !lottieAnimation.y()) {
                oc ocVar = this.d;
                double d = ocVar.b;
                double d10 = ocVar.d;
                TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = this.b;
                TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaSuggestedReaction.coordinates;
                float f10 = (float) (((mediaAreaCoordinates.x * d10) / 100.0d) + d);
                double d11 = ocVar.c;
                double d12 = ocVar.e;
                float f11 = (float) (((mediaAreaCoordinates.y * d12) / 100.0d) + d11);
                float f12 = ((float) ((d10 * mediaAreaCoordinates.w) / 100.0d)) / 2.0f;
                float f13 = ((float) ((d12 * mediaAreaCoordinates.h) / 100.0d)) / 2.0f;
                ob obVar = this.a;
                obVar.setBounds((int) (f10 - f12), (int) (f11 - f13), (int) (f12 + f10), (int) (f13 + f11));
                obVar.e = (int) (255.0f * f7);
                canvas.save();
                double d13 = tL_mediaAreaSuggestedReaction.coordinates.rotation;
                if (d13 != 0.0d) {
                    canvas.rotate((float) d13, f10, f11);
                }
                Rect rect = AndroidUtilities.rectTmp2;
                float height = (obVar.getBounds().height() * 0.61f) / 2.0f;
                rect.set((int) (obVar.getBounds().centerX() - height), (int) (obVar.getBounds().centerY() - height), (int) (obVar.getBounds().centerX() + height), (int) (obVar.getBounds().centerY() + height));
                obVar.c(1.0f);
                obVar.draw(canvas);
                g0Var.c(rect);
                g0Var.h = f7;
                g0Var.d(obVar.a == 1 ? -1 : -16777216);
                g0Var.a(canvas);
                canvas.restore();
            }
        }
    }

    @Override // ai.kc
    public final void b(boolean z10) {
        this.c.b(z10);
    }

    @Override // ai.kc
    public final void c(View view) {
        zg.g0 g0Var = this.c;
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
