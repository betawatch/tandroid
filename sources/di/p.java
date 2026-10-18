package di;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class p extends MessageObject {
    @Override // org.telegram.messenger.MessageObject
    public final float getProgress() {
        return this.uploadingStory.h;
    }
}
