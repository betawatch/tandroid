package ai;

import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public abstract class fb {
    public static void a(TL_stories.StoryItem storyItem, NativeByteBuffer nativeByteBuffer) {
        if (nativeByteBuffer == null) {
            return;
        }
        int readInt32 = nativeByteBuffer.readInt32(true);
        if (readInt32 != 1) {
            throw new RuntimeException(hg.c.h(readInt32, "(story) can't read params version = "));
        }
        new eb(storyItem).readParams(nativeByteBuffer, true);
    }

    public static NativeByteBuffer b(TL_stories.StoryItem storyItem) {
        if (storyItem.detectedLng == null && storyItem.translatedLng == null && !storyItem.translated && storyItem.translatedText == null) {
            return null;
        }
        eb ebVar = new eb(storyItem);
        try {
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(ebVar.getObjectSize());
            ebVar.serializeToStream(nativeByteBuffer);
            return nativeByteBuffer;
        } catch (Exception e7) {
            e7.printStackTrace();
            return null;
        }
    }
}
