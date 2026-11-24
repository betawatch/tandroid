// default package

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class k17 extends TLObject {
    public final TLRPC.Message a;
    public int b;

    public k17(TLRPC.Message message) {
        this.b = 0;
        this.a = message;
        int i = message.voiceTranscription != null ? 1 : 0;
        this.b = i;
        int i2 = i | (message.voiceTranscriptionForce ? 2 : 0);
        this.b = i2;
        int i3 = i2 | (message.originalLanguage != null ? 4 : 0);
        this.b = i3;
        int i4 = i3 | (message.translatedToLanguage != null ? 8 : 0);
        this.b = i4;
        int i5 = i4 | (message.translatedText != null ? 16 : 0);
        this.b = i5;
        int i6 = i5 | (message.translatedPoll != null ? 32 : 0);
        this.b = i6;
        int i7 = i6 | (message.errorAllowedPriceStars != 0 ? 64 : 0);
        this.b = i7;
        int i8 = i7 | (message.errorNewPriceStars != 0 ? 128 : 0);
        this.b = i8;
        int i9 = i8 | (message.translatedVoiceTranscription != null ? 256 : 0);
        this.b = i9;
        int flag = TLObject.setFlag(i9, 1024, message.summaryText != null);
        this.b = flag;
        int flag2 = TLObject.setFlag(flag, 2048, message.translatedSummaryText != null);
        this.b = flag2;
        int flag3 = TLObject.setFlag(flag2, TLObject.FLAG_12, message.translatedSummaryLanguage != null);
        this.b = flag3;
        int flag4 = TLObject.setFlag(flag3, TLObject.FLAG_13, message.translatedRichMessage != null);
        this.b = flag4;
        TLRPC.MessageAction messageAction = message.action;
        int flag5 = TLObject.setFlag(flag4, TLObject.FLAG_14, (messageAction instanceof TLRPC.TL_messageActionGramTransfer) && ((TLRPC.TL_messageActionGramTransfer) messageAction).comment_encrypted_preparing);
        this.b = flag5;
        int flag6 = TLObject.setFlag(flag5, 32768, message.voiceTranscriptionLocal);
        this.b = flag6;
        this.b = TLObject.setFlag(flag6, 65536, message.voiceTranscriptionWords != null);
    }

    @Override // org.telegram.tgnet.TLObject
    public final void readParams(InputSerializedData inputSerializedData, boolean z) {
        int readInt32 = inputSerializedData.readInt32(true);
        this.b = readInt32;
        TLRPC.Message message = this.a;
        TLRPC.MessageAction messageAction = message.action;
        if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
            TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) messageAction;
            tL_messageActionGramTransfer.comment_encrypted_preparing = !tL_messageActionGramTransfer.comment_encrypted && TLObject.hasFlag(readInt32, TLObject.FLAG_14);
        }
        if ((this.b & 1) != 0) {
            message.voiceTranscription = inputSerializedData.readString(z);
        }
        int i = this.b;
        message.voiceTranscriptionForce = (i & 2) != 0;
        message.summarizedOpen = (i & 512) != 0;
        message.voiceTranscriptionOpen = inputSerializedData.readBool(z);
        message.voiceTranscriptionFinal = inputSerializedData.readBool(z);
        message.voiceTranscriptionRated = inputSerializedData.readBool(z);
        message.voiceTranscriptionId = inputSerializedData.readInt64(z);
        message.premiumEffectWasPlayed = inputSerializedData.readBool(z);
        if ((this.b & 4) != 0) {
            message.originalLanguage = inputSerializedData.readString(z);
        }
        if ((this.b & 8) != 0) {
            message.translatedToLanguage = inputSerializedData.readString(z);
        }
        if ((this.b & 16) != 0) {
            message.translatedText = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }
        if ((this.b & 32) != 0) {
            int readInt322 = inputSerializedData.readInt32(z);
            message.translatedPoll = (y0c) TLObject.TLdeserialize(y0c.class, 613759672 != readInt322 ? null : new y0c(), inputSerializedData, readInt322, z);
        }
        if ((this.b & 64) != 0) {
            message.errorAllowedPriceStars = inputSerializedData.readInt64(z);
        }
        if ((this.b & 128) != 0) {
            message.errorNewPriceStars = inputSerializedData.readInt64(z);
        }
        if ((this.b & 256) != 0) {
            message.translatedVoiceTranscription = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }
        if (TLObject.hasFlag(this.b, 1024)) {
            message.summaryText = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }
        if (TLObject.hasFlag(this.b, 2048)) {
            message.translatedSummaryText = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }
        if (TLObject.hasFlag(this.b, TLObject.FLAG_12)) {
            message.translatedSummaryLanguage = inputSerializedData.readString(z);
        }
        if (TLObject.hasFlag(this.b, TLObject.FLAG_13)) {
            message.translatedRichMessage = TL_iv.RichMessage.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }
        message.voiceTranscriptionLocal = TLObject.hasFlag(this.b, 32768);
        if (!TLObject.hasFlag(this.b, 65536)) {
            message.voiceTranscriptionWords = null;
            return;
        }
        int readInt323 = inputSerializedData.readInt32(z);
        message.voiceTranscriptionWords = new int[readInt323];
        for (int i2 = 0; i2 < readInt323; i2++) {
            message.voiceTranscriptionWords[i2] = inputSerializedData.readInt32(z);
        }
    }

    @Override // org.telegram.tgnet.TLObject
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(1);
        TLRPC.Message message = this.a;
        boolean z = message.voiceTranscriptionForce;
        int i = this.b;
        int i2 = z ? i | 2 : i & (-3);
        this.b = i2;
        int i3 = message.summarizedOpen ? i2 | 512 : i2 & (-513);
        this.b = i3;
        outputSerializedData.writeInt32(i3);
        if ((this.b & 1) != 0) {
            outputSerializedData.writeString(message.voiceTranscription);
        }
        outputSerializedData.writeBool(message.voiceTranscriptionOpen);
        outputSerializedData.writeBool(message.voiceTranscriptionFinal);
        outputSerializedData.writeBool(message.voiceTranscriptionRated);
        outputSerializedData.writeInt64(message.voiceTranscriptionId);
        outputSerializedData.writeBool(message.premiumEffectWasPlayed);
        if ((this.b & 4) != 0) {
            outputSerializedData.writeString(message.originalLanguage);
        }
        if ((this.b & 8) != 0) {
            outputSerializedData.writeString(message.translatedToLanguage);
        }
        if ((this.b & 16) != 0) {
            message.translatedText.serializeToStream(outputSerializedData);
        }
        if ((this.b & 32) != 0) {
            message.translatedPoll.serializeToStream(outputSerializedData);
        }
        if ((this.b & 64) != 0) {
            outputSerializedData.writeInt64(message.errorAllowedPriceStars);
        }
        if ((this.b & 128) != 0) {
            outputSerializedData.writeInt64(message.errorNewPriceStars);
        }
        if ((this.b & 256) != 0) {
            message.translatedVoiceTranscription.serializeToStream(outputSerializedData);
        }
        if (TLObject.hasFlag(this.b, 1024)) {
            message.summaryText.serializeToStream(outputSerializedData);
        }
        if (TLObject.hasFlag(this.b, 2048)) {
            message.translatedSummaryText.serializeToStream(outputSerializedData);
        }
        if (TLObject.hasFlag(this.b, TLObject.FLAG_12)) {
            outputSerializedData.writeString(message.translatedSummaryLanguage);
        }
        if (TLObject.hasFlag(this.b, TLObject.FLAG_13)) {
            message.translatedRichMessage.serializeToStream(outputSerializedData);
        }
        if (TLObject.hasFlag(this.b, 65536)) {
            outputSerializedData.writeInt32(message.voiceTranscriptionWords.length);
            int[] iArr = message.voiceTranscriptionWords;
            for (int i4 : iArr) {
                outputSerializedData.writeInt32(i4);
            }
        }
    }
}
