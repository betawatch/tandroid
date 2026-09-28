package bi;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes4.dex */
public final class s extends MessageObject {
    @Override // org.telegram.messenger.MessageObject
    public final float getProgress() {
        return this.uploadingStory.h;
    }
}
