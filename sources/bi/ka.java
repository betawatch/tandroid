package bi;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class ka extends TLObject {
    public final TL_stories.StoryItem a;
    public int b;

    public ka(TL_stories.StoryItem storyItem) {
        this.b = 0;
        this.a = storyItem;
        boolean z10 = storyItem.translated;
        this.b = z10 ? 1 : 0;
        int i10 = (z10 ? 1 : 0) + (storyItem.detectedLng != null ? 2 : 0);
        this.b = i10;
        int i11 = i10 + (storyItem.translatedText != null ? 4 : 0);
        this.b = i11;
        this.b = i11 + (storyItem.translatedLng != null ? 8 : 0);
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
