package oh;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class e8 extends TLObject {
    public final TL_stories.StoryItem a;
    public int b;

    public e8(TL_stories.StoryItem storyItem) {
        this.b = 0;
        this.a = storyItem;
        boolean z4 = storyItem.translated;
        this.b = z4 ? 1 : 0;
        int i10 = (z4 ? 1 : 0) + (storyItem.detectedLng != null ? 2 : 0);
        this.b = i10;
        int i11 = i10 + (storyItem.translatedText != null ? 4 : 0);
        this.b = i11;
        this.b = i11 + (storyItem.translatedLng != null ? 8 : 0);
    }

    @Override // org.telegram.tgnet.TLObject
    public final void readParams(InputSerializedData inputSerializedData, boolean z4) {
        int readInt32 = inputSerializedData.readInt32(true);
        this.b = readInt32;
        boolean z10 = (readInt32 & 1) != 0;
        TL_stories.StoryItem storyItem = this.a;
        storyItem.translated = z10;
        if ((readInt32 & 2) != 0) {
            storyItem.detectedLng = inputSerializedData.readString(z4);
        }
        if ((this.b & 4) != 0) {
            storyItem.translatedText = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }
        if ((this.b & 8) != 0) {
            storyItem.translatedLng = inputSerializedData.readString(z4);
        }
    }

    @Override // org.telegram.tgnet.TLObject
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(1);
        outputSerializedData.writeInt32(this.b);
        int i10 = this.b & 2;
        TL_stories.StoryItem storyItem = this.a;
        if (i10 != 0) {
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
