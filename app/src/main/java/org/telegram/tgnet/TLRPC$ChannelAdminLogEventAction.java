package org.telegram.tgnet;
/* loaded from: classes.dex */
public abstract class TLRPC$ChannelAdminLogEventAction extends TLObject {
    public static TLRPC$ChannelAdminLogEventAction TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$ChannelAdminLogEventAction tLRPC$ChannelAdminLogEventAction;
        switch (i) {
            case -1895328189:
                tLRPC$ChannelAdminLogEventAction = new TLRPC$TL_channelAdminLogEventActionStopPoll();
                break;
            case -1661470870:
                tLRPC$ChannelAdminLogEventAction = new TLRPC$TL_channelAdminLogEventActionChangeAvailableReactions();
                break;
            case -1347021750:
                tLRPC$ChannelAdminLogEventAction = new TLRPC$TL_channelAdminLogEventActionParticipantJoinByRequest();
                break;
            case -1312568665:
                tLRPC$ChannelAdminLogEventAction = new TLRPC$TL_channelAdminLogEventActionChangeStickerSet();
                break;
            case -886388890:
                tLRPC$ChannelAdminLogEventAction = new TLRPC$TL_channelAdminLogEventActionToggleNoForwards();
                break;
            case -714643696:
                tLRPC$ChannelAdminLogEventAction = new TLRPC$TL_channelAdminLogEventActionParticipantToggleAdmin();
                break;
            case -610299584:
                tLRPC$ChannelAdminLogEventAction = new TLRPC$ChannelAdminLogEventAction() { // from class: org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionDiscardGroupCall
                    public static int constructor = -610299584;
                    public TLRPC$TL_inputGroupCall call;

                    @Override // org.telegram.tgnet.TLObject
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.call = TLRPC$TL_inputGroupCall.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }

                    @Override // org.telegram.tgnet.TLObject
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        this.call.serializeToStream(abstractSerializedData2);
                    }
                };
                break;
            case -484690728:
                tLRPC$ChannelAdminLogEventAction = new TLRPC$TL_channelAdminLogEventActionParticipantInvite();
                break;
            case -431740480:
                tLRPC$ChannelAdminLogEventAction = new TLRPC$TL_channelAdminLogEventActionParticipantUnmute();
                break;
            case -422036098:
                tLRPC$ChannelAdminLogEventAction = new TLRPC$TL_channelAdminLogEventActionParticipantToggleBan();
                break;
            case -421545947:
                tLRPC$ChannelAdminLogEventAction = new TLRPC$TL_channelAdminLogEventActionChangeTitle();
                break;
            case -384910503:
                tLRPC$ChannelAdminLogEventAction = new TLRPC$TL_channelAdminLogEventActionExportedInviteEdit();
                break;
            case -370660328:
                tLRPC$ChannelAdminLogEventAction = new TLRPC$TL_channelAdminLogEventActionUpdatePinned();
                break;
            case -124291086:
                tLRPC$ChannelAdminLogEventAction = new TLRPC$ChannelAdminLogEventAction() { // from class: org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionParticipantLeave
                    public static int constructor = -124291086;

                    @Override // org.telegram.tgnet.TLObject
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case -115071790:
                tLRPC$ChannelAdminLogEventAction = new TLRPC$TL_channelAdminLogEventActionParticipantMute();
                break;
            case -26672755:
                tLRPC$ChannelAdminLogEventAction = new TLRPC$TL_channelAdminLogEventActionChangeTheme();
                break;
            case 84703944:
                tLRPC$ChannelAdminLogEventAction = new TLRPC$TL_channelAdminLogEventActionChangeLinkedChat();
                break;
            case 241923758:
                tLRPC$ChannelAdminLogEventAction = new TLRPC$TL_channelAdminLogEventActionChangeLocation();
                break;
            case 405815507:
                tLRPC$ChannelAdminLogEventAction = new TLRPC$ChannelAdminLogEventAction() { // from class: org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionParticipantJoin
                    public static int constructor = 405815507;

                    @Override // org.telegram.tgnet.TLObject
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case 460916654:
                tLRPC$ChannelAdminLogEventAction = new TLRPC$TL_channelAdminLogEventActionToggleInvites();
                break;
            case 589338437:
                tLRPC$ChannelAdminLogEventAction = new TLRPC$ChannelAdminLogEventAction() { // from class: org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionStartGroupCall
                    public static int constructor = 589338437;
                    public TLRPC$TL_inputGroupCall call;

                    @Override // org.telegram.tgnet.TLObject
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.call = TLRPC$TL_inputGroupCall.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }

                    @Override // org.telegram.tgnet.TLObject
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        this.call.serializeToStream(abstractSerializedData2);
                    }
                };
                break;
            case 648939889:
                tLRPC$ChannelAdminLogEventAction = new TLRPC$TL_channelAdminLogEventActionToggleSignatures();
                break;
            case 771095562:
                tLRPC$ChannelAdminLogEventAction = new TLRPC$TL_channelAdminLogEventActionDefaultBannedRights();
                break;
            case 1048537159:
                tLRPC$ChannelAdminLogEventAction = new TLRPC$TL_channelAdminLogEventActionParticipantVolume();
                break;
            case 1091179342:
                tLRPC$ChannelAdminLogEventAction = new TLRPC$TL_channelAdminLogEventActionExportedInviteRevoke();
                break;
            case 1121994683:
                tLRPC$ChannelAdminLogEventAction = new TLRPC$TL_channelAdminLogEventActionDeleteMessage();
                break;
            case 1129042607:
                tLRPC$ChannelAdminLogEventAction = new TLRPC$TL_channelAdminLogEventActionChangePhoto();
                break;
            case 1401984889:
                tLRPC$ChannelAdminLogEventAction = new TLRPC$TL_channelAdminLogEventActionToggleSlowMode();
                break;
            case 1427671598:
                tLRPC$ChannelAdminLogEventAction = new TLRPC$TL_channelAdminLogEventActionChangeAbout();
                break;
            case 1456906823:
                tLRPC$ChannelAdminLogEventAction = new TLRPC$TL_channelAdminLogEventActionToggleGroupCallSetting();
                break;
            case 1515256996:
                tLRPC$ChannelAdminLogEventAction = new TLRPC$TL_channelAdminLogEventActionExportedInviteDelete();
                break;
            case 1557846647:
                tLRPC$ChannelAdminLogEventAction = new TLRPC$ChannelAdminLogEventAction() { // from class: org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionParticipantJoinByInvite
                    public static int constructor = 1557846647;
                    public TLRPC$TL_chatInviteExported invite;

                    @Override // org.telegram.tgnet.TLObject
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.invite = TLRPC$ExportedChatInvite.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }

                    @Override // org.telegram.tgnet.TLObject
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        this.invite.serializeToStream(abstractSerializedData2);
                    }
                };
                break;
            case 1599903217:
                tLRPC$ChannelAdminLogEventAction = new TLRPC$TL_channelAdminLogEventActionTogglePreHistoryHidden();
                break;
            case 1783299128:
                tLRPC$ChannelAdminLogEventAction = new TLRPC$TL_channelAdminLogEventActionChangeUsername();
                break;
            case 1855199800:
                tLRPC$ChannelAdminLogEventAction = new TLRPC$TL_channelAdminLogEventActionChangeHistoryTTL();
                break;
            case 1889215493:
                tLRPC$ChannelAdminLogEventAction = new TLRPC$TL_channelAdminLogEventActionEditMessage();
                break;
            default:
                tLRPC$ChannelAdminLogEventAction = null;
                break;
        }
        if (tLRPC$ChannelAdminLogEventAction != null || !z) {
            if (tLRPC$ChannelAdminLogEventAction != null) {
                tLRPC$ChannelAdminLogEventAction.readParams(abstractSerializedData, z);
            }
            return tLRPC$ChannelAdminLogEventAction;
        }
        throw new RuntimeException(String.format("can't parse magic %x in ChannelAdminLogEventAction", Integer.valueOf(i)));
    }
}
