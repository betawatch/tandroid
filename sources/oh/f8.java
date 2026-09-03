package oh;

import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public abstract class f8 {
    public static void a(TL_stories.StoryItem storyItem, NativeByteBuffer nativeByteBuffer) {
        if (nativeByteBuffer == null) {
            return;
        }
        int readInt32 = nativeByteBuffer.readInt32(true);
        if (readInt32 != 1) {
            throw new RuntimeException(l.d.j(readInt32, "(story) can't read params version = "));
        }
        new e8(storyItem).readParams(nativeByteBuffer, true);
    }

    public static NativeByteBuffer b(TL_stories.StoryItem storyItem) {
        if (storyItem.detectedLng == null && storyItem.translatedLng == null && !storyItem.translated && storyItem.translatedText == null) {
            return null;
        }
        e8 e8Var = new e8(storyItem);
        try {
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(e8Var.getObjectSize());
            e8Var.serializeToStream(nativeByteBuffer);
            return nativeByteBuffer;
        } catch (Exception e6) {
            e6.printStackTrace();
            return null;
        }
    }
}
