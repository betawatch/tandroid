package ih;

import android.graphics.Canvas;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class r9 extends ImageReceiver.Decorator {
    public final ArrayList a;
    public float b;
    public float c;
    public float d;
    public float e;

    public r9(TL_stories.StoryItem storyItem) {
        for (int i9 = 0; i9 < storyItem.media_areas.size(); i9++) {
            if (storyItem.media_areas.get(i9) instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                if (this.a == null) {
                    this.a = new ArrayList();
                }
                this.a.add(new o9(this, (TL_stories.TL_mediaAreaSuggestedReaction) storyItem.media_areas.get(i9)));
            } else if (storyItem.media_areas.get(i9) instanceof TL_stories.TL_mediaAreaWeather) {
                if (this.a == null) {
                    this.a = new ArrayList();
                }
                this.a.add(new q9(this, (TL_stories.TL_mediaAreaWeather) storyItem.media_areas.get(i9)));
            }
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.Decorator
    public final void onAttachedToWindow(ImageReceiver imageReceiver) {
        ArrayList arrayList = this.a;
        if (arrayList == null) {
            return;
        }
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            ((n9) arrayList.get(i9)).c(imageReceiver.getParentView());
            ((n9) arrayList.get(i9)).b(true);
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.Decorator
    public final void onDetachedFromWidnow() {
        ArrayList arrayList = this.a;
        if (arrayList == null) {
            return;
        }
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            ((n9) arrayList.get(i9)).b(false);
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.Decorator
    public final void onDraw(Canvas canvas, ImageReceiver imageReceiver) {
        ArrayList arrayList = this.a;
        if (arrayList == null) {
            return;
        }
        float alpha = imageReceiver.getAlpha();
        float centerX = imageReceiver.getCenterX();
        float centerY = imageReceiver.getCenterY();
        float imageWidth = imageReceiver.getImageWidth();
        this.d = imageWidth;
        float f10 = (16.0f * imageWidth) / 9.0f;
        this.e = f10;
        this.b = centerX - (imageWidth / 2.0f);
        this.c = centerY - (f10 / 2.0f);
        canvas.save();
        canvas.clipRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            ((n9) arrayList.get(i9)).a(canvas, alpha);
        }
        canvas.restore();
    }
}
