package ei;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ch0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class t9 extends s9 {
    public final v8 a;
    public final TL_stories.TL_mediaAreaSuggestedReaction b;
    public final dh.e0 c;
    public final /* synthetic */ w9 d;

    public t9(w9 w9Var, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction) {
        this.d = w9Var;
        v8 v8Var = new v8(null);
        this.a = v8Var;
        dh.e0 e0Var = new dh.e0(null);
        this.c = e0Var;
        this.b = tL_mediaAreaSuggestedReaction;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            v8Var.b(true, false);
        }
        if (tL_mediaAreaSuggestedReaction.dark) {
            v8Var.a();
        }
        e0Var.i = true;
        e0Var.e(dh.n0.d(tL_mediaAreaSuggestedReaction.reaction));
    }

    @Override // ei.s9
    public final void a(Canvas canvas, float f10) {
        dh.e0 e0Var = this.c;
        org.telegram.ui.Components.g5 g5Var = e0Var.b;
        ImageReceiver imageReceiver = g5Var != null ? g5Var.k : e0Var.a;
        if (imageReceiver != null && imageReceiver.K() && imageReceiver.J()) {
            ch0 B = imageReceiver.B();
            if (B == null || !B.y()) {
                w9 w9Var = this.d;
                double d = w9Var.b;
                double d10 = w9Var.d;
                TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = this.b;
                TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaSuggestedReaction.coordinates;
                float f11 = (float) (((mediaAreaCoordinates.x * d10) / 100.0d) + d);
                double d11 = w9Var.c;
                double d12 = w9Var.e;
                float f12 = (float) (((mediaAreaCoordinates.y * d12) / 100.0d) + d11);
                float f13 = ((float) ((d10 * mediaAreaCoordinates.w) / 100.0d)) / 2.0f;
                float f14 = ((float) ((d12 * mediaAreaCoordinates.h) / 100.0d)) / 2.0f;
                v8 v8Var = this.a;
                v8Var.setBounds((int) (f11 - f13), (int) (f12 - f14), (int) (f13 + f11), (int) (f14 + f12));
                v8Var.e = (int) (255.0f * f10);
                canvas.save();
                double d13 = tL_mediaAreaSuggestedReaction.coordinates.rotation;
                if (d13 != 0.0d) {
                    canvas.rotate((float) d13, f11, f12);
                }
                Rect rect = org.telegram.messenger.g0.Q;
                float height = (v8Var.getBounds().height() * 0.61f) / 2.0f;
                rect.set((int) (v8Var.getBounds().centerX() - height), (int) (v8Var.getBounds().centerY() - height), (int) (v8Var.getBounds().centerX() + height), (int) (v8Var.getBounds().centerY() + height));
                v8Var.c(1.0f);
                v8Var.draw(canvas);
                e0Var.c(rect);
                e0Var.h = f10;
                e0Var.d(v8Var.a == 1 ? -1 : -16777216);
                e0Var.a(canvas);
                canvas.restore();
            }
        }
    }

    @Override // ei.s9
    public final void b(boolean z10) {
        this.c.b(z10);
    }

    @Override // ei.s9
    public final void c(View view) {
        dh.e0 e0Var = this.c;
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
