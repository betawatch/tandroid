package oh;

import android.graphics.Canvas;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class n9 extends ImageReceiver.Decorator {
    public final ArrayList a;
    public float b;
    public float c;
    public float d;
    public float e;

    public n9(TL_stories.StoryItem storyItem) {
        for (int i10 = 0; i10 < storyItem.media_areas.size(); i10++) {
            if (storyItem.media_areas.get(i10) instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                if (this.a == null) {
                    this.a = new ArrayList();
                }
                this.a.add(new k9(this, (TL_stories.TL_mediaAreaSuggestedReaction) storyItem.media_areas.get(i10)));
            } else if (storyItem.media_areas.get(i10) instanceof TL_stories.TL_mediaAreaWeather) {
                if (this.a == null) {
                    this.a = new ArrayList();
                }
                this.a.add(new m9(this, (TL_stories.TL_mediaAreaWeather) storyItem.media_areas.get(i10)));
            }
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.Decorator
    public final void onAttachedToWindow(ImageReceiver imageReceiver) {
        ArrayList arrayList = this.a;
        if (arrayList == null) {
            return;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((j9) arrayList.get(i10)).c(imageReceiver.getParentView());
            ((j9) arrayList.get(i10)).b(true);
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.Decorator
    public final void onDetachedFromWidnow() {
        ArrayList arrayList = this.a;
        if (arrayList == null) {
            return;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((j9) arrayList.get(i10)).b(false);
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
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((j9) arrayList.get(i10)).a(canvas, alpha);
        }
        canvas.restore();
    }
}
