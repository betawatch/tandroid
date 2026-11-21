package org.telegram.messenger;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class ti extends TLObject {
    public final TLRPC.Message a;
    public int b;

    public ti(TLRPC.Message message) {
        this.b = 0;
        this.a = message;
        int i7 = message.voiceTranscription != null ? 1 : 0;
        this.b = i7;
        int i10 = i7 | (message.voiceTranscriptionForce ? 2 : 0);
        this.b = i10;
        int i11 = i10 | (message.originalLanguage != null ? 4 : 0);
        this.b = i11;
        int i12 = i11 | (message.translatedToLanguage != null ? 8 : 0);
        this.b = i12;
        int i13 = i12 | (message.translatedText != null ? 16 : 0);
        this.b = i13;
        int i14 = i13 | (message.translatedPoll != null ? 32 : 0);
        this.b = i14;
        int i15 = i14 | (message.errorAllowedPriceStars != 0 ? 64 : 0);
        this.b = i15;
        int i16 = i15 | (message.errorNewPriceStars != 0 ? 128 : 0);
        this.b = i16;
        int i17 = i16 | (message.translatedVoiceTranscription != null ? 256 : 0);
        this.b = i17;
        int flag = TLObject.setFlag(i17, 1024, message.summaryText != null);
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
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        int readInt32 = inputSerializedData.readInt32(true);
        this.b = readInt32;
        TLRPC.Message message = this.a;
        TLRPC.MessageAction messageAction = message.action;
        if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
            TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) messageAction;
            tL_messageActionGramTransfer.comment_encrypted_preparing = !tL_messageActionGramTransfer.comment_encrypted && TLObject.hasFlag(readInt32, TLObject.FLAG_14);
        }
        if ((this.b & 1) != 0) {
            message.voiceTranscription = inputSerializedData.readString(z10);
        }
        int i7 = this.b;
        message.voiceTranscriptionForce = (i7 & 2) != 0;
        message.summarizedOpen = (i7 & 512) != 0;
        message.voiceTranscriptionOpen = inputSerializedData.readBool(z10);
        message.voiceTranscriptionFinal = inputSerializedData.readBool(z10);
        message.voiceTranscriptionRated = inputSerializedData.readBool(z10);
        message.voiceTranscriptionId = inputSerializedData.readInt64(z10);
        message.premiumEffectWasPlayed = inputSerializedData.readBool(z10);
        if ((this.b & 4) != 0) {
            message.originalLanguage = inputSerializedData.readString(z10);
        }
        if ((this.b & 8) != 0) {
            message.translatedToLanguage = inputSerializedData.readString(z10);
        }
        if ((this.b & 16) != 0) {
            message.translatedText = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
        if ((this.b & 32) != 0) {
            int readInt322 = inputSerializedData.readInt32(z10);
            message.translatedPoll = (w00) TLObject.TLdeserialize(w00.class, 613759672 != readInt322 ? null : new w00(), inputSerializedData, readInt322, z10);
        }
        if ((this.b & 64) != 0) {
            message.errorAllowedPriceStars = inputSerializedData.readInt64(z10);
        }
        if ((this.b & 128) != 0) {
            message.errorNewPriceStars = inputSerializedData.readInt64(z10);
        }
        if ((this.b & 256) != 0) {
            message.translatedVoiceTranscription = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
        if (TLObject.hasFlag(this.b, 1024)) {
            message.summaryText = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
        if (TLObject.hasFlag(this.b, 2048)) {
            message.translatedSummaryText = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
        if (TLObject.hasFlag(this.b, TLObject.FLAG_12)) {
            message.translatedSummaryLanguage = inputSerializedData.readString(z10);
        }
        if (TLObject.hasFlag(this.b, TLObject.FLAG_13)) {
            message.translatedRichMessage = TL_iv.RichMessage.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
        message.voiceTranscriptionLocal = TLObject.hasFlag(this.b, 32768);
        if (!TLObject.hasFlag(this.b, 65536)) {
            message.voiceTranscriptionWords = null;
            return;
        }
        int readInt323 = inputSerializedData.readInt32(z10);
        message.voiceTranscriptionWords = new int[readInt323];
        for (int i10 = 0; i10 < readInt323; i10++) {
            message.voiceTranscriptionWords[i10] = inputSerializedData.readInt32(z10);
        }
    }

    @Override // org.telegram.tgnet.TLObject
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(1);
        TLRPC.Message message = this.a;
        int i7 = message.voiceTranscriptionForce ? this.b | 2 : this.b & (-3);
        this.b = i7;
        int i10 = message.summarizedOpen ? i7 | 512 : i7 & (-513);
        this.b = i10;
        outputSerializedData.writeInt32(i10);
        if ((1 & this.b) != 0) {
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
            for (int i11 : message.voiceTranscriptionWords) {
                outputSerializedData.writeInt32(i11);
            }
        }
    }
}
