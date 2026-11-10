package di;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class k1 extends TLRPC.TL_messageMediaStory {
    @Override // org.telegram.tgnet.TLRPC.TL_messageMediaStory, org.telegram.tgnet.TLObject
    public final void readParams(InputSerializedData inputSerializedData, boolean z9) {
        this.user_id = inputSerializedData.readInt64(z9);
        this.id = inputSerializedData.readInt32(z9);
        this.storyItem = TL_stories.StoryItem.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z9), z9);
    }

    @Override // org.telegram.tgnet.TLRPC.TL_messageMediaStory, org.telegram.tgnet.TLObject
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(-946147809);
        outputSerializedData.writeInt64(this.user_id);
        outputSerializedData.writeInt32(this.id);
        this.storyItem.serializeToStream(outputSerializedData);
    }
}
