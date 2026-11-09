package di;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ah0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class s9 extends r9 {
    public final w8 a;
    public final TL_stories.TL_mediaAreaSuggestedReaction b;
    public final ch.f0 c;
    public final /* synthetic */ v9 d;

    public s9(v9 v9Var, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction) {
        this.d = v9Var;
        w8 w8Var = new w8(null);
        this.a = w8Var;
        ch.f0 f0Var = new ch.f0(null);
        this.c = f0Var;
        this.b = tL_mediaAreaSuggestedReaction;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            w8Var.b(true, false);
        }
        if (tL_mediaAreaSuggestedReaction.dark) {
            w8Var.a();
        }
        f0Var.i = true;
        f0Var.e(ch.o0.d(tL_mediaAreaSuggestedReaction.reaction));
    }

    @Override // di.r9
    public final void a(Canvas canvas, float f10) {
        ch.f0 f0Var = this.c;
        org.telegram.ui.Components.i5 i5Var = f0Var.b;
        ImageReceiver imageReceiver = i5Var != null ? i5Var.k : f0Var.a;
        if (imageReceiver != null && imageReceiver.K() && imageReceiver.J()) {
            ah0 B = imageReceiver.B();
            if (B == null || !B.y()) {
                v9 v9Var = this.d;
                double d = v9Var.b;
                double d2 = v9Var.d;
                TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = this.b;
                TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaSuggestedReaction.coordinates;
                float f11 = (float) (((mediaAreaCoordinates.x * d2) / 100.0d) + d);
                double d10 = v9Var.c;
                double d11 = v9Var.e;
                float f12 = (float) (((mediaAreaCoordinates.y * d11) / 100.0d) + d10);
                float f13 = ((float) ((d2 * mediaAreaCoordinates.w) / 100.0d)) / 2.0f;
                float f14 = ((float) ((d11 * mediaAreaCoordinates.h) / 100.0d)) / 2.0f;
                w8 w8Var = this.a;
                w8Var.setBounds((int) (f11 - f13), (int) (f12 - f14), (int) (f13 + f11), (int) (f14 + f12));
                w8Var.e = (int) (255.0f * f10);
                canvas.save();
                double d12 = tL_mediaAreaSuggestedReaction.coordinates.rotation;
                if (d12 != 0.0d) {
                    canvas.rotate((float) d12, f11, f12);
                }
                Rect rect = org.telegram.messenger.g0.Q;
                float height = (w8Var.getBounds().height() * 0.61f) / 2.0f;
                rect.set((int) (w8Var.getBounds().centerX() - height), (int) (w8Var.getBounds().centerY() - height), (int) (w8Var.getBounds().centerX() + height), (int) (w8Var.getBounds().centerY() + height));
                w8Var.c(1.0f);
                w8Var.draw(canvas);
                f0Var.c(rect);
                f0Var.h = f10;
                f0Var.d(w8Var.a == 1 ? -1 : -16777216);
                f0Var.a(canvas);
                canvas.restore();
            }
        }
    }

    @Override // di.r9
    public final void b(boolean z9) {
        this.c.b(z9);
    }

    @Override // di.r9
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
