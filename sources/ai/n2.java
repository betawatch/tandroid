package ai;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class n2 extends TLRPC.TL_messageMediaStory {
    @Override // org.telegram.tgnet.TLRPC.TL_messageMediaStory, org.telegram.tgnet.TLObject
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.user_id = inputSerializedData.readInt64(z10);
        this.id = inputSerializedData.readInt32(z10);
        this.storyItem = TL_stories.StoryItem.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        this.via_mention = inputSerializedData.readBool(z10);
        this.peer = MessagesController.getInstance(UserConfig.selectedAccount).getPeer(this.user_id);
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
