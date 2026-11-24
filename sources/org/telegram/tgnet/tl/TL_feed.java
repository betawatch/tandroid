package org.telegram.tgnet.tl;

import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class TL_feed {

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static abstract class FeedItem extends TLObject {
        public static FeedItem TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (FeedItem) TLObject.TLdeserialize(FeedItem.class, i != 1697598577 ? i != 1810307195 ? i != 2121511845 ? null : new TL_feedItemMessage() : new TL_feedItemInterestCategories() : new TL_feedItemMessageGroup(), inputSerializedData, i, z);
        }
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static abstract class FeedMessages extends TLObject {
        public static FeedMessages TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (FeedMessages) TLObject.TLdeserialize(FeedMessages.class, i != -619039485 ? i != -587770695 ? null : new TL_feedMessages() : new TL_feedMessagesNotModified(), inputSerializedData, i, z);
        }
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static class FeedPosition extends TLObject {
        public static final int constructor = 1348066419;
        public int date;
        public int id;
        public TLRPC.Peer peer;

        public static FeedPosition TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (FeedPosition) TLObject.TLdeserialize(FeedPosition.class, i != 1348066419 ? null : new FeedPosition(), inputSerializedData, i, z);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.date = inputSerializedData.readInt32(z);
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.id = inputSerializedData.readInt32(z);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt32(this.date);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.id);
        }
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static class ForYouFeed extends TLObject {
        public static final int constructor = -1096716611;
        public int flags;
        public long recommendation_id;
        public ArrayList<FeedItem> items = new ArrayList<>();
        public ArrayList<TLRPC.Chat> chats = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static ForYouFeed TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (ForYouFeed) TLObject.TLdeserialize(ForYouFeed.class, i != -1096716611 ? null : new ForYouFeed(), inputSerializedData, i, z);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.items = Vector.deserialize(inputSerializedData, new rfb((byte) 22), z);
            this.chats = Vector.deserialize(inputSerializedData, new c1b((byte) 18), z);
            this.users = Vector.deserialize(inputSerializedData, new c1b((byte) 12), z);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.recommendation_id = inputSerializedData.readInt64(z);
            }
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt32(this.flags);
            Vector.serialize(outputSerializedData, this.items);
            Vector.serialize(outputSerializedData, this.chats);
            Vector.serialize(outputSerializedData, this.users);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt64(this.recommendation_id);
            }
        }
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static abstract class InterestCategories extends TLObject {
        public static InterestCategories TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (InterestCategories) TLObject.TLdeserialize(InterestCategories.class, i != -323604576 ? i != 2043617685 ? null : new TL_interestCategoriesNotModified() : new TL_interestCategories(), inputSerializedData, i, z);
        }
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static class InterestCategory extends TLObject {
        public static final int constructor = 1816553187;
        public String emoji;
        public long emoji_document_id;
        public int flags;
        public int id;
        public String title;

        public static InterestCategory TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (InterestCategory) TLObject.TLdeserialize(InterestCategory.class, i != 1816553187 ? null : new InterestCategory(), inputSerializedData, i, z);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.id = inputSerializedData.readInt32(z);
            this.title = inputSerializedData.readString(z);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.emoji = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.emoji_document_id = inputSerializedData.readInt64(z);
            }
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            int flag = TLObject.setFlag(this.flags, 1, this.emoji != null);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.emoji_document_id != 0);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
            outputSerializedData.writeInt32(this.id);
            outputSerializedData.writeString(this.title);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.emoji);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeInt64(this.emoji_document_id);
            }
        }
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static class TL_feedItemInterestCategories extends FeedItem {
        public static final int constructor = 1810307195;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
        }
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static class TL_feedItemMessage extends FeedItem {
        public static final int constructor = 2121511845;
        public TLRPC.Message message;

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.message = TLRPC.Message.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.message.serializeToStream(outputSerializedData);
        }
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static class TL_feedItemMessageGroup extends FeedItem {
        public static final int constructor = 1697598577;
        public ArrayList<TLRPC.Message> messages = new ArrayList<>();

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.messages = Vector.deserialize(inputSerializedData, new ofb((byte) 8), z);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            Vector.serialize(outputSerializedData, this.messages);
        }
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static class TL_feedMessages extends FeedMessages {
        public static final int constructor = -587770695;
        public int flags;
        public FeedPosition max_position;
        public FeedPosition min_position;
        public FeedPosition read_max_position;
        public ArrayList<TLRPC.Message> messages = new ArrayList<>();
        public ArrayList<TLRPC.Chat> chats = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            if (TLObject.hasFlag(readInt32, 1)) {
                this.max_position = FeedPosition.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.min_position = FeedPosition.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.read_max_position = FeedPosition.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.messages = Vector.deserialize(inputSerializedData, new ofb((byte) 8), z);
            this.chats = Vector.deserialize(inputSerializedData, new c1b((byte) 18), z);
            this.users = Vector.deserialize(inputSerializedData, new c1b((byte) 12), z);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            int flag = TLObject.setFlag(this.flags, 1, this.max_position != null);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.min_position != null);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 4, this.read_max_position != null);
            this.flags = flag3;
            outputSerializedData.writeInt32(flag3);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.max_position.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.min_position.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.read_max_position.serializeToStream(outputSerializedData);
            }
            Vector.serialize(outputSerializedData, this.messages);
            Vector.serialize(outputSerializedData, this.chats);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static class TL_feedMessagesNotModified extends FeedMessages {
        public static final int constructor = -619039485;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
        }
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static class TL_interestCategories extends InterestCategories {
        public static final int constructor = -323604576;
        public ArrayList<InterestCategory> categories = new ArrayList<>();
        public ArrayList<Integer> selected = new ArrayList<>();

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.categories = Vector.deserialize(inputSerializedData, new rfb((byte) 23), z);
            this.selected = Vector.deserializeInt(inputSerializedData, z);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            Vector.serialize(outputSerializedData, this.categories);
            Vector.serializeInt(outputSerializedData, this.selected);
        }
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static class TL_interestCategoriesNotModified extends InterestCategories {
        public static final int constructor = 2043617685;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
        }
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static class TL_feed_dislikePost extends TLMethod<TLRPC.Bool> {
        public static final int constructor = 1299191644;
        public int msg_id;
        public TLRPC.InputPeer peer;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.msg_id);
        }

        @Override // org.telegram.tgnet.TLMethod
        public TLRPC.Bool deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static class TL_feed_getFeed extends TLMethod<FeedMessages> {
        public static final int constructor = 2121717715;
        public int add_offset;
        public int filter_id;
        public int flags;
        public long hash;
        public int limit;
        public FeedPosition max_position;
        public FeedPosition min_position;
        public FeedPosition offset_position;
        public boolean offset_to_max_read;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            int flag = TLObject.setFlag(this.flags, 8, this.offset_to_max_read);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 1, this.offset_position != null);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 2, this.max_position != null);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 4, this.min_position != null);
            this.flags = flag4;
            outputSerializedData.writeInt32(flag4);
            outputSerializedData.writeInt32(this.filter_id);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.offset_position.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeInt32(this.add_offset);
            outputSerializedData.writeInt32(this.limit);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.max_position.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.min_position.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeInt64(this.hash);
        }

        @Override // org.telegram.tgnet.TLMethod
        public FeedMessages deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return FeedMessages.TLdeserialize(inputSerializedData, i, z);
        }
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static class TL_feed_getForYou extends TLMethod<ForYouFeed> {
        public static final int constructor = 867755499;
        public int limit;
        public String query;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            int flag = TLObject.setFlag(0, 1, this.query != null);
            outputSerializedData.writeInt32(flag);
            if (TLObject.hasFlag(flag, 1)) {
                outputSerializedData.writeString(this.query);
            }
            outputSerializedData.writeInt32(this.limit);
        }

        @Override // org.telegram.tgnet.TLMethod
        public ForYouFeed deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return ForYouFeed.TLdeserialize(inputSerializedData, i, z);
        }
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static class TL_feed_getInterestCategories extends TLMethod<InterestCategories> {
        public static final int constructor = -1166402118;
        public long hash;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt64(this.hash);
        }

        @Override // org.telegram.tgnet.TLMethod
        public InterestCategories deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return InterestCategories.TLdeserialize(inputSerializedData, i, z);
        }
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static class TL_feed_likePost extends TLMethod<TLRPC.Bool> {
        public static final int constructor = 457925246;
        public int msg_id;
        public TLRPC.InputPeer peer;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.msg_id);
        }

        @Override // org.telegram.tgnet.TLMethod
        public TLRPC.Bool deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static class TL_feed_readFeed extends TLMethod<TLRPC.Updates> {
        public static final int constructor = -1271479809;
        public int filter_id;
        public FeedPosition max_position;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt32(this.filter_id);
            this.max_position.serializeToStream(outputSerializedData);
        }

        @Override // org.telegram.tgnet.TLMethod
        public TLRPC.Updates deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i, z);
        }
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static class TL_feed_setInterestCategories extends TLMethod<TLRPC.Bool> {
        public static final int constructor = -1624680228;
        public ArrayList<Integer> category_ids = new ArrayList<>();

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            Vector.serializeInt(outputSerializedData, this.category_ids);
        }

        @Override // org.telegram.tgnet.TLMethod
        public TLRPC.Bool deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }
    }
}
