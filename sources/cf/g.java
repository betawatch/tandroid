package cf;

import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.RenderNode;
import android.os.Build;
import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class g {
    public final Picture a;
    public final RenderNode b;

    public g(int i10, int i11, Utilities.Callback callback) {
        Picture picture = new Picture();
        this.a = picture;
        callback.run(picture.beginRecording(i10, i11));
        picture.endRecording();
        if (Build.VERSION.SDK_INT < 29) {
            this.b = null;
            return;
        }
        RenderNode renderNode = new RenderNode("pip-node-" + View.generateViewId());
        this.b = renderNode;
        renderNode.setPosition(0, 0, i10, i11);
        renderNode.beginRecording().drawPicture(picture);
        renderNode.endRecording();
    }

    public final void a(Canvas canvas, float f9) {
        Canvas canvas2;
        if (Build.VERSION.SDK_INT >= 29) {
            RenderNode renderNode = this.b;
            if (renderNode != null) {
                renderNode.setAlpha(f9);
                canvas.drawRenderNode(this.b);
                return;
            }
            return;
        }
        Picture picture = this.a;
        if (picture == null || f9 <= 0.001f) {
            return;
        }
        boolean z10 = f9 < 0.999f;
        if (z10) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, picture.getWidth(), picture.getHeight(), (int) (f9 * 255.0f), 31);
        } else {
            canvas2 = canvas;
        }
        canvas2.drawPicture(picture);
        if (z10) {
            canvas2.restore();
        }
    }

    public final void b() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.b.discardDisplayList();
        }
    }
}
