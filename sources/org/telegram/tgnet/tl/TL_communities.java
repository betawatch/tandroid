package org.telegram.tgnet.tl;

import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.l;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public class TL_communities {

    /* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
    public static class CommunityPeer extends TLObject {
        public static final int constructor = 1981030077;
        public boolean can_view_history;
        public int flags;
        public TLRPC.Peer peer;
        public boolean visible;

        public static CommunityPeer TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return (CommunityPeer) TLObject.TLdeserialize(CommunityPeer.class, i10 != 1981030077 ? null : new CommunityPeer(), inputSerializedData, i10, z4);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.flags = readInt32;
            this.can_view_history = TLObject.hasFlag(readInt32, 4);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.visible = inputSerializedData.readBool(z4);
            }
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            int flag = TLObject.setFlag(this.flags, 4, this.can_view_history);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeBool(this.visible);
            }
            this.peer.serializeToStream(outputSerializedData);
        }
    }

    /* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
    public static class CommunityPeerRequest extends TLObject {
        public static final int constructor = 2078997125;
        public int date;
        public int flags;
        public TLRPC.Peer peer;
        public long requested_by;
        public boolean visible;

        public static CommunityPeerRequest TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return (CommunityPeerRequest) TLObject.TLdeserialize(CommunityPeerRequest.class, i10 != 2078997125 ? null : new CommunityPeerRequest(), inputSerializedData, i10, z4);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.flags = readInt32;
            this.visible = TLObject.hasFlag(readInt32, 1);
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.requested_by = inputSerializedData.readInt64(z4);
            this.date = inputSerializedData.readInt32(z4);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            int flag = TLObject.setFlag(this.flags, 1, this.visible);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt64(this.requested_by);
            outputSerializedData.writeInt32(this.date);
        }
    }

    /* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
    public static class ParticipantJoinedChats extends TLObject {
        public static final int constructor = -1921494742;
        public ArrayList<Long> creator_chat_ids = new ArrayList<>();
        public ArrayList<Long> joined_chat_ids = new ArrayList<>();
        public ArrayList<TLRPC.Chat> chats = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static ParticipantJoinedChats TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return (ParticipantJoinedChats) TLObject.TLdeserialize(ParticipantJoinedChats.class, i10 != -1921494742 ? null : new ParticipantJoinedChats(), inputSerializedData, i10, z4);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.creator_chat_ids = Vector.deserializeLong(inputSerializedData, z4);
            this.joined_chat_ids = Vector.deserializeLong(inputSerializedData, z4);
            this.chats = Vector.deserialize(inputSerializedData, new l(10), z4);
            this.users = Vector.deserialize(inputSerializedData, new l(4), z4);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            Vector.serializeLong(outputSerializedData, this.creator_chat_ids);
            Vector.serializeLong(outputSerializedData, this.joined_chat_ids);
            Vector.serialize(outputSerializedData, this.chats);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    /* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
    public static class PeerLinkRequests extends TLObject {
        public static final int constructor = 574926765;
        public int flags;
        public String next_offset;
        public int total_count;
        public ArrayList<CommunityPeerRequest> requests = new ArrayList<>();
        public ArrayList<TLRPC.Chat> chats = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static PeerLinkRequests TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return (PeerLinkRequests) TLObject.TLdeserialize(PeerLinkRequests.class, i10 != 574926765 ? null : new PeerLinkRequests(), inputSerializedData, i10, z4);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.flags = inputSerializedData.readInt32(z4);
            this.total_count = inputSerializedData.readInt32(z4);
            this.requests = Vector.deserialize(inputSerializedData, new c(21), z4);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.next_offset = inputSerializedData.readString(z4);
            }
            this.chats = Vector.deserialize(inputSerializedData, new l(10), z4);
            this.users = Vector.deserialize(inputSerializedData, new l(4), z4);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            int flag = TLObject.setFlag(this.flags, 1, this.next_offset != null);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeInt32(this.total_count);
            Vector.serialize(outputSerializedData, this.requests);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.next_offset);
            }
            Vector.serialize(outputSerializedData, this.chats);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    /* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
    public static class TL_communities_create extends TLMethod<TLRPC.Updates> {
        public static final int constructor = -1506256404;
        public String about;
        public int flags;
        public boolean hidden;
        public TLRPC.InputPeer peer;
        public String title;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            int flag = TLObject.setFlag(this.flags, 2, this.hidden);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 1, this.about != null);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
            outputSerializedData.writeString(this.title);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.about);
            }
            this.peer.serializeToStream(outputSerializedData);
        }

        @Override // org.telegram.tgnet.TLMethod
        public TLRPC.Updates deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z4);
        }
    }

    /* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
    public static class TL_communities_getJoinedCommunities extends TLMethod<TLRPC.messages_Chats> {
        public static final int constructor = -1503401936;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
        }

        @Override // org.telegram.tgnet.TLMethod
        public TLRPC.messages_Chats deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return TLRPC.messages_Chats.TLdeserialize(inputSerializedData, i10, z4);
        }
    }

    /* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
    public static class TL_communities_getParticipantJoinedChats extends TLMethod<ParticipantJoinedChats> {
        public static final int constructor = -125916245;
        public TLRPC.InputChannel community;
        public TLRPC.InputPeer participant;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.community.serializeToStream(outputSerializedData);
            this.participant.serializeToStream(outputSerializedData);
        }

        @Override // org.telegram.tgnet.TLMethod
        public ParticipantJoinedChats deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return ParticipantJoinedChats.TLdeserialize(inputSerializedData, i10, z4);
        }
    }

    /* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
    public static class TL_communities_getPeerLinkRequests extends TLMethod<PeerLinkRequests> {
        public static final int constructor = -1820904636;
        public TLRPC.InputChannel community;
        public int limit;
        public String offset;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.community.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.offset);
            outputSerializedData.writeInt32(this.limit);
        }

        @Override // org.telegram.tgnet.TLMethod
        public PeerLinkRequests deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return PeerLinkRequests.TLdeserialize(inputSerializedData, i10, z4);
        }
    }

    /* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
    public static class TL_communities_toggleAllPeerLinkRequestApproval extends TLMethod<TLRPC.Bool> {
        public static final int constructor = -1075585731;
        public TLRPC.InputChannel community;
        public int flags;
        public boolean reject;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            int flag = TLObject.setFlag(this.flags, 1, this.reject);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            this.community.serializeToStream(outputSerializedData);
        }

        @Override // org.telegram.tgnet.TLMethod
        public TLRPC.Bool deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z4);
        }
    }

    /* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
    public static class TL_communities_toggleCommunityCollapsedInDialogs extends TLMethod<TLRPC.Updates> {
        public static final int constructor = -681122838;
        public boolean collapsed;
        public TLRPC.InputChannel community;
        public int flags;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            int flag = TLObject.setFlag(this.flags, 1, this.collapsed);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            this.community.serializeToStream(outputSerializedData);
        }

        @Override // org.telegram.tgnet.TLMethod
        public TLRPC.Updates deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z4);
        }
    }

    /* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
    public static class TL_communities_toggleParticipantBanned extends TLMethod<TLRPC.Bool> {
        public static final int constructor = -1721258737;
        public TLRPC.InputChannel community;
        public int flags;
        public TLRPC.InputPeer participant;
        public boolean unban;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            int flag = TLObject.setFlag(this.flags, 1, this.unban);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            this.community.serializeToStream(outputSerializedData);
            this.participant.serializeToStream(outputSerializedData);
        }

        @Override // org.telegram.tgnet.TLMethod
        public TLRPC.Bool deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z4);
        }
    }

    /* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
    public static class TL_communities_togglePeerLink extends TLMethod<TLRPC.Bool> {
        public static final int constructor = 1936576490;
        public TLRPC.InputChannel community;
        public boolean deleted;
        public int flags;
        public boolean hidden;
        public TLRPC.InputPeer peer;
        public boolean visible;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            int flag = TLObject.setFlag(this.flags, 1, this.visible);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.hidden);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 4, this.deleted);
            this.flags = flag3;
            outputSerializedData.writeInt32(flag3);
            this.community.serializeToStream(outputSerializedData);
            this.peer.serializeToStream(outputSerializedData);
        }

        @Override // org.telegram.tgnet.TLMethod
        public TLRPC.Bool deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z4);
        }
    }

    /* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
    public static class TL_communities_togglePeerLinkRequestApproval extends TLMethod<TLRPC.Bool> {
        public static final int constructor = -1937630808;
        public TLRPC.InputChannel community;
        public int flags;
        public TLRPC.InputPeer peer;
        public boolean reject;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            int flag = TLObject.setFlag(this.flags, 1, this.reject);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            this.community.serializeToStream(outputSerializedData);
            this.peer.serializeToStream(outputSerializedData);
        }

        @Override // org.telegram.tgnet.TLMethod
        public TLRPC.Bool deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z4);
        }
    }

    private TL_communities() {
    }
}
