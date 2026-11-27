// default package

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class ncb extends mcb {
    public final z9b a;
    public final TL_stories.TL_mediaAreaSuggestedReaction b;
    public final p39 c;
    public final /* synthetic */ qcb d;

    public ncb(qcb qcbVar, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction) {
        this.d = qcbVar;
        z9b z9bVar = new z9b(null);
        this.a = z9bVar;
        p39 p39Var = new p39(null);
        this.c = p39Var;
        this.b = tL_mediaAreaSuggestedReaction;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            z9bVar.b(true, false);
        }
        if (tL_mediaAreaSuggestedReaction.dark) {
            z9bVar.a();
        }
        p39Var.i = true;
        p39Var.e(w49.d(tL_mediaAreaSuggestedReaction.reaction));
    }

    @Override // mcb
    public final void a(Canvas canvas, float f) {
        p39 p39Var = this.c;
        wl wlVar = p39Var.b;
        ImageReceiver imageReceiver = wlVar != null ? wlVar.k : p39Var.a;
        if (imageReceiver != null && imageReceiver.D() && imageReceiver.C()) {
            b29 y = imageReceiver.y();
            if (y == null || !y.t()) {
                qcb qcbVar = this.d;
                double d = qcbVar.b;
                double d2 = qcbVar.d;
                TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = this.b;
                TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaSuggestedReaction.coordinates;
                float f2 = (float) (((mediaAreaCoordinates.x * d2) / 100.0d) + d);
                double d3 = qcbVar.c;
                double d4 = qcbVar.e;
                float f3 = (float) (((mediaAreaCoordinates.y * d4) / 100.0d) + d3);
                float f4 = ((float) ((d2 * mediaAreaCoordinates.w) / 100.0d)) / 2.0f;
                float f5 = ((float) ((d4 * mediaAreaCoordinates.h) / 100.0d)) / 2.0f;
                z9b z9bVar = this.a;
                z9bVar.setBounds((int) (f2 - f4), (int) (f3 - f5), (int) (f4 + f2), (int) (f5 + f3));
                z9bVar.e = (int) (255.0f * f);
                canvas.save();
                double d5 = tL_mediaAreaSuggestedReaction.coordinates.rotation;
                if (d5 != 0.0d) {
                    canvas.rotate((float) d5, f2, f3);
                }
                Rect rect = hl.Q;
                float height = (z9bVar.getBounds().height() * 0.61f) / 2.0f;
                rect.set((int) (z9bVar.getBounds().centerX() - height), (int) (z9bVar.getBounds().centerY() - height), (int) (z9bVar.getBounds().centerX() + height), (int) (z9bVar.getBounds().centerY() + height));
                z9bVar.c(1.0f);
                z9bVar.draw(canvas);
                p39Var.c(rect);
                p39Var.h = f;
                p39Var.d(z9bVar.a == 1 ? -1 : -16777216);
                p39Var.a(canvas);
                canvas.restore();
            }
        }
    }

    @Override // mcb
    public final void b(boolean z) {
        this.c.b(z);
    }

    @Override // mcb
    public final void c(View view) {
        p39 p39Var = this.c;
        if (p39Var.f == view) {
            return;
        }
        if (!p39Var.g) {
            p39Var.f = view;
            return;
        }
        p39Var.b(false);
        p39Var.f = view;
        p39Var.b(true);
    }
}
