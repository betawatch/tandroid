package di;

import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class j1 extends TLRPC.TL_messageMediaStory {
    @Override // org.telegram.tgnet.TLRPC.TL_messageMediaStory, org.telegram.tgnet.TLObject
    public final void readParams(InputSerializedData inputSerializedData, boolean z9) {
        this.user_id = inputSerializedData.readInt64(z9);
        this.id = inputSerializedData.readInt32(z9);
        this.storyItem = TL_stories.StoryItem.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z9), z9);
        this.via_mention = inputSerializedData.readBool(z9);
        this.peer = qp.s1(p10.s0).z1(this.user_id);
    }

    @Override // org.telegram.tgnet.TLRPC.TL_messageMediaStory, org.telegram.tgnet.TLObject
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(-946147811);
        outputSerializedData.writeInt64(this.user_id);
        outputSerializedData.writeInt32(this.id);
        this.storyItem.serializeToStream(outputSerializedData);
        outputSerializedData.writeBool(this.via_mention);
    }
}
