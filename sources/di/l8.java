package di;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class l8 extends TLObject {
    public final TL_stories.StoryItem a;
    public int b;

    public l8(TL_stories.StoryItem storyItem) {
        this.b = 0;
        this.a = storyItem;
        boolean z9 = storyItem.translated;
        this.b = z9 ? 1 : 0;
        int i7 = (z9 ? 1 : 0) + (storyItem.detectedLng != null ? 2 : 0);
        this.b = i7;
        int i10 = i7 + (storyItem.translatedText != null ? 4 : 0);
        this.b = i10;
        this.b = i10 + (storyItem.translatedLng != null ? 8 : 0);
    }

    @Override // org.telegram.tgnet.TLObject
    public final void readParams(InputSerializedData inputSerializedData, boolean z9) {
        int readInt32 = inputSerializedData.readInt32(true);
        this.b = readInt32;
        boolean z10 = (readInt32 & 1) != 0;
        TL_stories.StoryItem storyItem = this.a;
        storyItem.translated = z10;
        if ((readInt32 & 2) != 0) {
            storyItem.detectedLng = inputSerializedData.readString(z9);
        }
        if ((this.b & 4) != 0) {
            storyItem.translatedText = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z9), z9);
        }
        if ((this.b & 8) != 0) {
            storyItem.translatedLng = inputSerializedData.readString(z9);
        }
    }

    @Override // org.telegram.tgnet.TLObject
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(1);
        outputSerializedData.writeInt32(this.b);
        int i7 = this.b & 2;
        TL_stories.StoryItem storyItem = this.a;
        if (i7 != 0) {
            outputSerializedData.writeString(storyItem.detectedLng);
        }
        if ((this.b & 4) != 0) {
            storyItem.translatedText.serializeToStream(outputSerializedData);
        }
        if ((this.b & 8) != 0) {
            outputSerializedData.writeString(storyItem.translatedLng);
        }
    }
}
