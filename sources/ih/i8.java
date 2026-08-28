package ih;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class i8 extends TLObject {
    public final TL_stories.StoryItem a;
    public int b;

    public i8(TL_stories.StoryItem storyItem) {
        this.b = 0;
        this.a = storyItem;
        boolean z10 = storyItem.translated;
        this.b = z10 ? 1 : 0;
        int i9 = (z10 ? 1 : 0) + (storyItem.detectedLng != null ? 2 : 0);
        this.b = i9;
        int i10 = i9 + (storyItem.translatedText != null ? 4 : 0);
        this.b = i10;
        this.b = i10 + (storyItem.translatedLng != null ? 8 : 0);
    }

    @Override // org.telegram.tgnet.TLObject
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        int readInt32 = inputSerializedData.readInt32(true);
        this.b = readInt32;
        boolean z11 = (readInt32 & 1) != 0;
        TL_stories.StoryItem storyItem = this.a;
        storyItem.translated = z11;
        if ((readInt32 & 2) != 0) {
            storyItem.detectedLng = inputSerializedData.readString(z10);
        }
        if ((this.b & 4) != 0) {
            storyItem.translatedText = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
        if ((this.b & 8) != 0) {
            storyItem.translatedLng = inputSerializedData.readString(z10);
        }
    }

    @Override // org.telegram.tgnet.TLObject
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(1);
        outputSerializedData.writeInt32(this.b);
        int i9 = this.b & 2;
        TL_stories.StoryItem storyItem = this.a;
        if (i9 != 0) {
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
