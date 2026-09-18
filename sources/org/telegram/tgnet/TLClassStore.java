package org.telegram.tgnet;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public class TLClassStore {
    static TLClassStore store;
    private SparseArray<TLObjectFactory> classStore;

    /* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
    public interface TLObjectFactory {
        TLObject create();
    }

    public TLClassStore() {
        SparseArray<TLObjectFactory> sparseArray = new SparseArray<>();
        this.classStore = sparseArray;
        final int i10 = 0;
        sparseArray.put(TLRPC.TL_error.constructor, new TLObjectFactory() { // from class: org.telegram.tgnet.m
            @Override // org.telegram.tgnet.TLClassStore.TLObjectFactory
            public final TLObject create() {
                switch (i10) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_updatesTooLong();
                    case 2:
                        return new TLRPC.TL_decryptedMessageService();
                    case 3:
                        return new TLRPC.TL_decryptedMessage();
                    case 4:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 5:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    case 7:
                        return new TLRPC.TL_decryptedMessage_layer8();
                    case 8:
                        return new TLRPC.TL_message_secret();
                    case 9:
                        return new TLRPC.TL_message_secret_layer72();
                    case 10:
                        return new TLRPC.TL_message_secret_old();
                    case 11:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 12:
                        return new TLRPC.TL_null();
                    case 13:
                        return new TLRPC.TL_updateShortChatMessage();
                    case 14:
                        return new TLRPC.TL_updates();
                    case 15:
                        return new TLRPC.TL_updateShortMessage();
                    case 16:
                        return new TLRPC.TL_updateShort();
                    case 17:
                        return new TLRPC.TL_updatesCombined();
                    default:
                        return new TLRPC.TL_updateShortSentMessage();
                }
            }
        });
        final int i11 = 2;
        this.classStore.put(TLRPC.TL_decryptedMessageService.constructor, new TLObjectFactory() { // from class: org.telegram.tgnet.m
            @Override // org.telegram.tgnet.TLClassStore.TLObjectFactory
            public final TLObject create() {
                switch (i11) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_updatesTooLong();
                    case 2:
                        return new TLRPC.TL_decryptedMessageService();
                    case 3:
                        return new TLRPC.TL_decryptedMessage();
                    case 4:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 5:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    case 7:
                        return new TLRPC.TL_decryptedMessage_layer8();
                    case 8:
                        return new TLRPC.TL_message_secret();
                    case 9:
                        return new TLRPC.TL_message_secret_layer72();
                    case 10:
                        return new TLRPC.TL_message_secret_old();
                    case 11:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 12:
                        return new TLRPC.TL_null();
                    case 13:
                        return new TLRPC.TL_updateShortChatMessage();
                    case 14:
                        return new TLRPC.TL_updates();
                    case 15:
                        return new TLRPC.TL_updateShortMessage();
                    case 16:
                        return new TLRPC.TL_updateShort();
                    case 17:
                        return new TLRPC.TL_updatesCombined();
                    default:
                        return new TLRPC.TL_updateShortSentMessage();
                }
            }
        });
        final int i12 = 3;
        this.classStore.put(TLRPC.TL_decryptedMessage.constructor, new TLObjectFactory() { // from class: org.telegram.tgnet.m
            @Override // org.telegram.tgnet.TLClassStore.TLObjectFactory
            public final TLObject create() {
                switch (i12) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_updatesTooLong();
                    case 2:
                        return new TLRPC.TL_decryptedMessageService();
                    case 3:
                        return new TLRPC.TL_decryptedMessage();
                    case 4:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 5:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    case 7:
                        return new TLRPC.TL_decryptedMessage_layer8();
                    case 8:
                        return new TLRPC.TL_message_secret();
                    case 9:
                        return new TLRPC.TL_message_secret_layer72();
                    case 10:
                        return new TLRPC.TL_message_secret_old();
                    case 11:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 12:
                        return new TLRPC.TL_null();
                    case 13:
                        return new TLRPC.TL_updateShortChatMessage();
                    case 14:
                        return new TLRPC.TL_updates();
                    case 15:
                        return new TLRPC.TL_updateShortMessage();
                    case 16:
                        return new TLRPC.TL_updateShort();
                    case 17:
                        return new TLRPC.TL_updatesCombined();
                    default:
                        return new TLRPC.TL_updateShortSentMessage();
                }
            }
        });
        final int i13 = 4;
        this.classStore.put(TLRPC.TL_decryptedMessageLayer.constructor, new TLObjectFactory() { // from class: org.telegram.tgnet.m
            @Override // org.telegram.tgnet.TLClassStore.TLObjectFactory
            public final TLObject create() {
                switch (i13) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_updatesTooLong();
                    case 2:
                        return new TLRPC.TL_decryptedMessageService();
                    case 3:
                        return new TLRPC.TL_decryptedMessage();
                    case 4:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 5:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    case 7:
                        return new TLRPC.TL_decryptedMessage_layer8();
                    case 8:
                        return new TLRPC.TL_message_secret();
                    case 9:
                        return new TLRPC.TL_message_secret_layer72();
                    case 10:
                        return new TLRPC.TL_message_secret_old();
                    case 11:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 12:
                        return new TLRPC.TL_null();
                    case 13:
                        return new TLRPC.TL_updateShortChatMessage();
                    case 14:
                        return new TLRPC.TL_updates();
                    case 15:
                        return new TLRPC.TL_updateShortMessage();
                    case 16:
                        return new TLRPC.TL_updateShort();
                    case 17:
                        return new TLRPC.TL_updatesCombined();
                    default:
                        return new TLRPC.TL_updateShortSentMessage();
                }
            }
        });
        final int i14 = 3;
        this.classStore.put(TLRPC.TL_decryptedMessage_layer17.constructor, new TLObjectFactory() { // from class: org.telegram.tgnet.m
            @Override // org.telegram.tgnet.TLClassStore.TLObjectFactory
            public final TLObject create() {
                switch (i14) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_updatesTooLong();
                    case 2:
                        return new TLRPC.TL_decryptedMessageService();
                    case 3:
                        return new TLRPC.TL_decryptedMessage();
                    case 4:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 5:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    case 7:
                        return new TLRPC.TL_decryptedMessage_layer8();
                    case 8:
                        return new TLRPC.TL_message_secret();
                    case 9:
                        return new TLRPC.TL_message_secret_layer72();
                    case 10:
                        return new TLRPC.TL_message_secret_old();
                    case 11:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 12:
                        return new TLRPC.TL_null();
                    case 13:
                        return new TLRPC.TL_updateShortChatMessage();
                    case 14:
                        return new TLRPC.TL_updates();
                    case 15:
                        return new TLRPC.TL_updateShortMessage();
                    case 16:
                        return new TLRPC.TL_updateShort();
                    case 17:
                        return new TLRPC.TL_updatesCombined();
                    default:
                        return new TLRPC.TL_updateShortSentMessage();
                }
            }
        });
        final int i15 = 5;
        this.classStore.put(TLRPC.TL_decryptedMessage_layer45.constructor, new TLObjectFactory() { // from class: org.telegram.tgnet.m
            @Override // org.telegram.tgnet.TLClassStore.TLObjectFactory
            public final TLObject create() {
                switch (i15) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_updatesTooLong();
                    case 2:
                        return new TLRPC.TL_decryptedMessageService();
                    case 3:
                        return new TLRPC.TL_decryptedMessage();
                    case 4:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 5:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    case 7:
                        return new TLRPC.TL_decryptedMessage_layer8();
                    case 8:
                        return new TLRPC.TL_message_secret();
                    case 9:
                        return new TLRPC.TL_message_secret_layer72();
                    case 10:
                        return new TLRPC.TL_message_secret_old();
                    case 11:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 12:
                        return new TLRPC.TL_null();
                    case 13:
                        return new TLRPC.TL_updateShortChatMessage();
                    case 14:
                        return new TLRPC.TL_updates();
                    case 15:
                        return new TLRPC.TL_updateShortMessage();
                    case 16:
                        return new TLRPC.TL_updateShort();
                    case 17:
                        return new TLRPC.TL_updatesCombined();
                    default:
                        return new TLRPC.TL_updateShortSentMessage();
                }
            }
        });
        final int i16 = 6;
        this.classStore.put(TLRPC.TL_decryptedMessageService_layer8.constructor, new TLObjectFactory() { // from class: org.telegram.tgnet.m
            @Override // org.telegram.tgnet.TLClassStore.TLObjectFactory
            public final TLObject create() {
                switch (i16) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_updatesTooLong();
                    case 2:
                        return new TLRPC.TL_decryptedMessageService();
                    case 3:
                        return new TLRPC.TL_decryptedMessage();
                    case 4:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 5:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    case 7:
                        return new TLRPC.TL_decryptedMessage_layer8();
                    case 8:
                        return new TLRPC.TL_message_secret();
                    case 9:
                        return new TLRPC.TL_message_secret_layer72();
                    case 10:
                        return new TLRPC.TL_message_secret_old();
                    case 11:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 12:
                        return new TLRPC.TL_null();
                    case 13:
                        return new TLRPC.TL_updateShortChatMessage();
                    case 14:
                        return new TLRPC.TL_updates();
                    case 15:
                        return new TLRPC.TL_updateShortMessage();
                    case 16:
                        return new TLRPC.TL_updateShort();
                    case 17:
                        return new TLRPC.TL_updatesCombined();
                    default:
                        return new TLRPC.TL_updateShortSentMessage();
                }
            }
        });
        final int i17 = 7;
        this.classStore.put(TLRPC.TL_decryptedMessage_layer8.constructor, new TLObjectFactory() { // from class: org.telegram.tgnet.m
            @Override // org.telegram.tgnet.TLClassStore.TLObjectFactory
            public final TLObject create() {
                switch (i17) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_updatesTooLong();
                    case 2:
                        return new TLRPC.TL_decryptedMessageService();
                    case 3:
                        return new TLRPC.TL_decryptedMessage();
                    case 4:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 5:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    case 7:
                        return new TLRPC.TL_decryptedMessage_layer8();
                    case 8:
                        return new TLRPC.TL_message_secret();
                    case 9:
                        return new TLRPC.TL_message_secret_layer72();
                    case 10:
                        return new TLRPC.TL_message_secret_old();
                    case 11:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 12:
                        return new TLRPC.TL_null();
                    case 13:
                        return new TLRPC.TL_updateShortChatMessage();
                    case 14:
                        return new TLRPC.TL_updates();
                    case 15:
                        return new TLRPC.TL_updateShortMessage();
                    case 16:
                        return new TLRPC.TL_updateShort();
                    case 17:
                        return new TLRPC.TL_updatesCombined();
                    default:
                        return new TLRPC.TL_updateShortSentMessage();
                }
            }
        });
        final int i18 = 8;
        this.classStore.put(TLRPC.TL_message_secret.constructor, new TLObjectFactory() { // from class: org.telegram.tgnet.m
            @Override // org.telegram.tgnet.TLClassStore.TLObjectFactory
            public final TLObject create() {
                switch (i18) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_updatesTooLong();
                    case 2:
                        return new TLRPC.TL_decryptedMessageService();
                    case 3:
                        return new TLRPC.TL_decryptedMessage();
                    case 4:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 5:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    case 7:
                        return new TLRPC.TL_decryptedMessage_layer8();
                    case 8:
                        return new TLRPC.TL_message_secret();
                    case 9:
                        return new TLRPC.TL_message_secret_layer72();
                    case 10:
                        return new TLRPC.TL_message_secret_old();
                    case 11:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 12:
                        return new TLRPC.TL_null();
                    case 13:
                        return new TLRPC.TL_updateShortChatMessage();
                    case 14:
                        return new TLRPC.TL_updates();
                    case 15:
                        return new TLRPC.TL_updateShortMessage();
                    case 16:
                        return new TLRPC.TL_updateShort();
                    case 17:
                        return new TLRPC.TL_updatesCombined();
                    default:
                        return new TLRPC.TL_updateShortSentMessage();
                }
            }
        });
        final int i19 = 9;
        this.classStore.put(TLRPC.TL_message_secret_layer72.constructor, new TLObjectFactory() { // from class: org.telegram.tgnet.m
            @Override // org.telegram.tgnet.TLClassStore.TLObjectFactory
            public final TLObject create() {
                switch (i19) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_updatesTooLong();
                    case 2:
                        return new TLRPC.TL_decryptedMessageService();
                    case 3:
                        return new TLRPC.TL_decryptedMessage();
                    case 4:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 5:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    case 7:
                        return new TLRPC.TL_decryptedMessage_layer8();
                    case 8:
                        return new TLRPC.TL_message_secret();
                    case 9:
                        return new TLRPC.TL_message_secret_layer72();
                    case 10:
                        return new TLRPC.TL_message_secret_old();
                    case 11:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 12:
                        return new TLRPC.TL_null();
                    case 13:
                        return new TLRPC.TL_updateShortChatMessage();
                    case 14:
                        return new TLRPC.TL_updates();
                    case 15:
                        return new TLRPC.TL_updateShortMessage();
                    case 16:
                        return new TLRPC.TL_updateShort();
                    case 17:
                        return new TLRPC.TL_updatesCombined();
                    default:
                        return new TLRPC.TL_updateShortSentMessage();
                }
            }
        });
        final int i20 = 10;
        this.classStore.put(TLRPC.TL_message_secret_old.constructor, new TLObjectFactory() { // from class: org.telegram.tgnet.m
            @Override // org.telegram.tgnet.TLClassStore.TLObjectFactory
            public final TLObject create() {
                switch (i20) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_updatesTooLong();
                    case 2:
                        return new TLRPC.TL_decryptedMessageService();
                    case 3:
                        return new TLRPC.TL_decryptedMessage();
                    case 4:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 5:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    case 7:
                        return new TLRPC.TL_decryptedMessage_layer8();
                    case 8:
                        return new TLRPC.TL_message_secret();
                    case 9:
                        return new TLRPC.TL_message_secret_layer72();
                    case 10:
                        return new TLRPC.TL_message_secret_old();
                    case 11:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 12:
                        return new TLRPC.TL_null();
                    case 13:
                        return new TLRPC.TL_updateShortChatMessage();
                    case 14:
                        return new TLRPC.TL_updates();
                    case 15:
                        return new TLRPC.TL_updateShortMessage();
                    case 16:
                        return new TLRPC.TL_updateShort();
                    case 17:
                        return new TLRPC.TL_updatesCombined();
                    default:
                        return new TLRPC.TL_updateShortSentMessage();
                }
            }
        });
        final int i21 = 11;
        this.classStore.put(TLRPC.TL_messageEncryptedAction.constructor, new TLObjectFactory() { // from class: org.telegram.tgnet.m
            @Override // org.telegram.tgnet.TLClassStore.TLObjectFactory
            public final TLObject create() {
                switch (i21) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_updatesTooLong();
                    case 2:
                        return new TLRPC.TL_decryptedMessageService();
                    case 3:
                        return new TLRPC.TL_decryptedMessage();
                    case 4:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 5:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    case 7:
                        return new TLRPC.TL_decryptedMessage_layer8();
                    case 8:
                        return new TLRPC.TL_message_secret();
                    case 9:
                        return new TLRPC.TL_message_secret_layer72();
                    case 10:
                        return new TLRPC.TL_message_secret_old();
                    case 11:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 12:
                        return new TLRPC.TL_null();
                    case 13:
                        return new TLRPC.TL_updateShortChatMessage();
                    case 14:
                        return new TLRPC.TL_updates();
                    case 15:
                        return new TLRPC.TL_updateShortMessage();
                    case 16:
                        return new TLRPC.TL_updateShort();
                    case 17:
                        return new TLRPC.TL_updatesCombined();
                    default:
                        return new TLRPC.TL_updateShortSentMessage();
                }
            }
        });
        final int i22 = 12;
        this.classStore.put(TLRPC.TL_null.constructor, new TLObjectFactory() { // from class: org.telegram.tgnet.m
            @Override // org.telegram.tgnet.TLClassStore.TLObjectFactory
            public final TLObject create() {
                switch (i22) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_updatesTooLong();
                    case 2:
                        return new TLRPC.TL_decryptedMessageService();
                    case 3:
                        return new TLRPC.TL_decryptedMessage();
                    case 4:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 5:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    case 7:
                        return new TLRPC.TL_decryptedMessage_layer8();
                    case 8:
                        return new TLRPC.TL_message_secret();
                    case 9:
                        return new TLRPC.TL_message_secret_layer72();
                    case 10:
                        return new TLRPC.TL_message_secret_old();
                    case 11:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 12:
                        return new TLRPC.TL_null();
                    case 13:
                        return new TLRPC.TL_updateShortChatMessage();
                    case 14:
                        return new TLRPC.TL_updates();
                    case 15:
                        return new TLRPC.TL_updateShortMessage();
                    case 16:
                        return new TLRPC.TL_updateShort();
                    case 17:
                        return new TLRPC.TL_updatesCombined();
                    default:
                        return new TLRPC.TL_updateShortSentMessage();
                }
            }
        });
        final int i23 = 13;
        this.classStore.put(TLRPC.TL_updateShortChatMessage.constructor, new TLObjectFactory() { // from class: org.telegram.tgnet.m
            @Override // org.telegram.tgnet.TLClassStore.TLObjectFactory
            public final TLObject create() {
                switch (i23) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_updatesTooLong();
                    case 2:
                        return new TLRPC.TL_decryptedMessageService();
                    case 3:
                        return new TLRPC.TL_decryptedMessage();
                    case 4:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 5:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    case 7:
                        return new TLRPC.TL_decryptedMessage_layer8();
                    case 8:
                        return new TLRPC.TL_message_secret();
                    case 9:
                        return new TLRPC.TL_message_secret_layer72();
                    case 10:
                        return new TLRPC.TL_message_secret_old();
                    case 11:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 12:
                        return new TLRPC.TL_null();
                    case 13:
                        return new TLRPC.TL_updateShortChatMessage();
                    case 14:
                        return new TLRPC.TL_updates();
                    case 15:
                        return new TLRPC.TL_updateShortMessage();
                    case 16:
                        return new TLRPC.TL_updateShort();
                    case 17:
                        return new TLRPC.TL_updatesCombined();
                    default:
                        return new TLRPC.TL_updateShortSentMessage();
                }
            }
        });
        final int i24 = 14;
        this.classStore.put(TLRPC.TL_updates.constructor, new TLObjectFactory() { // from class: org.telegram.tgnet.m
            @Override // org.telegram.tgnet.TLClassStore.TLObjectFactory
            public final TLObject create() {
                switch (i24) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_updatesTooLong();
                    case 2:
                        return new TLRPC.TL_decryptedMessageService();
                    case 3:
                        return new TLRPC.TL_decryptedMessage();
                    case 4:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 5:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    case 7:
                        return new TLRPC.TL_decryptedMessage_layer8();
                    case 8:
                        return new TLRPC.TL_message_secret();
                    case 9:
                        return new TLRPC.TL_message_secret_layer72();
                    case 10:
                        return new TLRPC.TL_message_secret_old();
                    case 11:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 12:
                        return new TLRPC.TL_null();
                    case 13:
                        return new TLRPC.TL_updateShortChatMessage();
                    case 14:
                        return new TLRPC.TL_updates();
                    case 15:
                        return new TLRPC.TL_updateShortMessage();
                    case 16:
                        return new TLRPC.TL_updateShort();
                    case 17:
                        return new TLRPC.TL_updatesCombined();
                    default:
                        return new TLRPC.TL_updateShortSentMessage();
                }
            }
        });
        final int i25 = 15;
        this.classStore.put(TLRPC.TL_updateShortMessage.constructor, new TLObjectFactory() { // from class: org.telegram.tgnet.m
            @Override // org.telegram.tgnet.TLClassStore.TLObjectFactory
            public final TLObject create() {
                switch (i25) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_updatesTooLong();
                    case 2:
                        return new TLRPC.TL_decryptedMessageService();
                    case 3:
                        return new TLRPC.TL_decryptedMessage();
                    case 4:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 5:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    case 7:
                        return new TLRPC.TL_decryptedMessage_layer8();
                    case 8:
                        return new TLRPC.TL_message_secret();
                    case 9:
                        return new TLRPC.TL_message_secret_layer72();
                    case 10:
                        return new TLRPC.TL_message_secret_old();
                    case 11:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 12:
                        return new TLRPC.TL_null();
                    case 13:
                        return new TLRPC.TL_updateShortChatMessage();
                    case 14:
                        return new TLRPC.TL_updates();
                    case 15:
                        return new TLRPC.TL_updateShortMessage();
                    case 16:
                        return new TLRPC.TL_updateShort();
                    case 17:
                        return new TLRPC.TL_updatesCombined();
                    default:
                        return new TLRPC.TL_updateShortSentMessage();
                }
            }
        });
        final int i26 = 16;
        this.classStore.put(TLRPC.TL_updateShort.constructor, new TLObjectFactory() { // from class: org.telegram.tgnet.m
            @Override // org.telegram.tgnet.TLClassStore.TLObjectFactory
            public final TLObject create() {
                switch (i26) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_updatesTooLong();
                    case 2:
                        return new TLRPC.TL_decryptedMessageService();
                    case 3:
                        return new TLRPC.TL_decryptedMessage();
                    case 4:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 5:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    case 7:
                        return new TLRPC.TL_decryptedMessage_layer8();
                    case 8:
                        return new TLRPC.TL_message_secret();
                    case 9:
                        return new TLRPC.TL_message_secret_layer72();
                    case 10:
                        return new TLRPC.TL_message_secret_old();
                    case 11:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 12:
                        return new TLRPC.TL_null();
                    case 13:
                        return new TLRPC.TL_updateShortChatMessage();
                    case 14:
                        return new TLRPC.TL_updates();
                    case 15:
                        return new TLRPC.TL_updateShortMessage();
                    case 16:
                        return new TLRPC.TL_updateShort();
                    case 17:
                        return new TLRPC.TL_updatesCombined();
                    default:
                        return new TLRPC.TL_updateShortSentMessage();
                }
            }
        });
        final int i27 = 17;
        this.classStore.put(TLRPC.TL_updatesCombined.constructor, new TLObjectFactory() { // from class: org.telegram.tgnet.m
            @Override // org.telegram.tgnet.TLClassStore.TLObjectFactory
            public final TLObject create() {
                switch (i27) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_updatesTooLong();
                    case 2:
                        return new TLRPC.TL_decryptedMessageService();
                    case 3:
                        return new TLRPC.TL_decryptedMessage();
                    case 4:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 5:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    case 7:
                        return new TLRPC.TL_decryptedMessage_layer8();
                    case 8:
                        return new TLRPC.TL_message_secret();
                    case 9:
                        return new TLRPC.TL_message_secret_layer72();
                    case 10:
                        return new TLRPC.TL_message_secret_old();
                    case 11:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 12:
                        return new TLRPC.TL_null();
                    case 13:
                        return new TLRPC.TL_updateShortChatMessage();
                    case 14:
                        return new TLRPC.TL_updates();
                    case 15:
                        return new TLRPC.TL_updateShortMessage();
                    case 16:
                        return new TLRPC.TL_updateShort();
                    case 17:
                        return new TLRPC.TL_updatesCombined();
                    default:
                        return new TLRPC.TL_updateShortSentMessage();
                }
            }
        });
        final int i28 = 18;
        this.classStore.put(TLRPC.TL_updateShortSentMessage.constructor, new TLObjectFactory() { // from class: org.telegram.tgnet.m
            @Override // org.telegram.tgnet.TLClassStore.TLObjectFactory
            public final TLObject create() {
                switch (i28) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_updatesTooLong();
                    case 2:
                        return new TLRPC.TL_decryptedMessageService();
                    case 3:
                        return new TLRPC.TL_decryptedMessage();
                    case 4:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 5:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    case 7:
                        return new TLRPC.TL_decryptedMessage_layer8();
                    case 8:
                        return new TLRPC.TL_message_secret();
                    case 9:
                        return new TLRPC.TL_message_secret_layer72();
                    case 10:
                        return new TLRPC.TL_message_secret_old();
                    case 11:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 12:
                        return new TLRPC.TL_null();
                    case 13:
                        return new TLRPC.TL_updateShortChatMessage();
                    case 14:
                        return new TLRPC.TL_updates();
                    case 15:
                        return new TLRPC.TL_updateShortMessage();
                    case 16:
                        return new TLRPC.TL_updateShort();
                    case 17:
                        return new TLRPC.TL_updatesCombined();
                    default:
                        return new TLRPC.TL_updateShortSentMessage();
                }
            }
        });
        final int i29 = 1;
        this.classStore.put(TLRPC.TL_updatesTooLong.constructor, new TLObjectFactory() { // from class: org.telegram.tgnet.m
            @Override // org.telegram.tgnet.TLClassStore.TLObjectFactory
            public final TLObject create() {
                switch (i29) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_updatesTooLong();
                    case 2:
                        return new TLRPC.TL_decryptedMessageService();
                    case 3:
                        return new TLRPC.TL_decryptedMessage();
                    case 4:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 5:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    case 7:
                        return new TLRPC.TL_decryptedMessage_layer8();
                    case 8:
                        return new TLRPC.TL_message_secret();
                    case 9:
                        return new TLRPC.TL_message_secret_layer72();
                    case 10:
                        return new TLRPC.TL_message_secret_old();
                    case 11:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 12:
                        return new TLRPC.TL_null();
                    case 13:
                        return new TLRPC.TL_updateShortChatMessage();
                    case 14:
                        return new TLRPC.TL_updates();
                    case 15:
                        return new TLRPC.TL_updateShortMessage();
                    case 16:
                        return new TLRPC.TL_updateShort();
                    case 17:
                        return new TLRPC.TL_updatesCombined();
                    default:
                        return new TLRPC.TL_updateShortSentMessage();
                }
            }
        });
    }

    public static TLClassStore Instance() {
        if (store == null) {
            store = new TLClassStore();
        }
        return store;
    }

    public TLObject TLdeserialize(NativeByteBuffer nativeByteBuffer, int i10, boolean z10) {
        TLObjectFactory tLObjectFactory = this.classStore.get(i10);
        if (tLObjectFactory == null) {
            return null;
        }
        TLObject create = tLObjectFactory.create();
        create.readParams(nativeByteBuffer, z10);
        return create;
    }
}
