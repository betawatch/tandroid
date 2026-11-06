package di;

import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public abstract class m8 {
    public static void a(TL_stories.StoryItem storyItem, NativeByteBuffer nativeByteBuffer) {
        if (nativeByteBuffer == null) {
            return;
        }
        int readInt32 = nativeByteBuffer.readInt32(true);
        if (readInt32 != 1) {
            throw new RuntimeException(jg.g.j(readInt32, "(story) can't read params version = "));
        }
        new l8(storyItem).readParams(nativeByteBuffer, true);
    }

    public static NativeByteBuffer b(TL_stories.StoryItem storyItem) {
        if (storyItem.detectedLng == null && storyItem.translatedLng == null && !storyItem.translated && storyItem.translatedText == null) {
            return null;
        }
        l8 l8Var = new l8(storyItem);
        try {
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(l8Var.getObjectSize());
            l8Var.serializeToStream(nativeByteBuffer);
            return nativeByteBuffer;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
