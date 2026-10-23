package di;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class p extends MessageObject {
    @Override // org.telegram.messenger.MessageObject
    public final float getProgress() {
        return this.uploadingStory.h;
    }
}
