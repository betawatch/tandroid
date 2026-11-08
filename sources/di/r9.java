package di;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.zg0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class r9 extends q9 {
    public final v8 a;
    public final TL_stories.TL_mediaAreaSuggestedReaction b;
    public final ch.f0 c;
    public final /* synthetic */ u9 d;

    public r9(u9 u9Var, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction) {
        this.d = u9Var;
        v8 v8Var = new v8(null);
        this.a = v8Var;
        ch.f0 f0Var = new ch.f0(null);
        this.c = f0Var;
        this.b = tL_mediaAreaSuggestedReaction;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            v8Var.b(true, false);
        }
        if (tL_mediaAreaSuggestedReaction.dark) {
            v8Var.a();
        }
        f0Var.i = true;
        f0Var.e(ch.o0.d(tL_mediaAreaSuggestedReaction.reaction));
    }

    @Override // di.q9
    public final void a(Canvas canvas, float f10) {
        ch.f0 f0Var = this.c;
        org.telegram.ui.Components.i5 i5Var = f0Var.b;
        ImageReceiver imageReceiver = i5Var != null ? i5Var.k : f0Var.a;
        if (imageReceiver != null && imageReceiver.K() && imageReceiver.J()) {
            zg0 B = imageReceiver.B();
            if (B == null || !B.y()) {
                u9 u9Var = this.d;
                double d = u9Var.b;
                double d2 = u9Var.d;
                TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = this.b;
                TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaSuggestedReaction.coordinates;
                float f11 = (float) (((mediaAreaCoordinates.x * d2) / 100.0d) + d);
                double d10 = u9Var.c;
                double d11 = u9Var.e;
                float f12 = (float) (((mediaAreaCoordinates.y * d11) / 100.0d) + d10);
                float f13 = ((float) ((d2 * mediaAreaCoordinates.w) / 100.0d)) / 2.0f;
                float f14 = ((float) ((d11 * mediaAreaCoordinates.h) / 100.0d)) / 2.0f;
                v8 v8Var = this.a;
                v8Var.setBounds((int) (f11 - f13), (int) (f12 - f14), (int) (f13 + f11), (int) (f14 + f12));
                v8Var.e = (int) (255.0f * f10);
                canvas.save();
                double d12 = tL_mediaAreaSuggestedReaction.coordinates.rotation;
                if (d12 != 0.0d) {
                    canvas.rotate((float) d12, f11, f12);
                }
                Rect rect = org.telegram.messenger.g0.Q;
                float height = (v8Var.getBounds().height() * 0.61f) / 2.0f;
                rect.set((int) (v8Var.getBounds().centerX() - height), (int) (v8Var.getBounds().centerY() - height), (int) (v8Var.getBounds().centerX() + height), (int) (v8Var.getBounds().centerY() + height));
                v8Var.c(1.0f);
                v8Var.draw(canvas);
                f0Var.c(rect);
                f0Var.h = f10;
                f0Var.d(v8Var.a == 1 ? -1 : -16777216);
                f0Var.a(canvas);
                canvas.restore();
            }
        }
    }

    @Override // di.q9
    public final void b(boolean z9) {
        this.c.b(z9);
    }

    @Override // di.q9
    public final void c(View view) {
        ch.f0 f0Var = this.c;
        if (f0Var.f == view) {
            return;
        }
        if (!f0Var.g) {
            f0Var.f = view;
            return;
        }
        f0Var.b(false);
        f0Var.f = view;
        f0Var.b(true);
    }
}
