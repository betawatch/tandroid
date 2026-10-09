package org.telegram.tgnet;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public class TLClassStore {
    static TLClassStore store;
    private final SparseArray<TLObjectFactory> classStore;

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                        return new TLRPC.TL_message_secret();
                    case 2:
                        return new TLRPC.TL_message_secret_layer72();
                    case 3:
                        return new TLRPC.TL_message_secret_old();
                    case 4:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 5:
                        return new TLRPC.TL_null();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService();
                    case 7:
                        return new TLRPC.TL_decryptedMessage();
                    case 8:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 9:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 10:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    default:
                        return new TLRPC.TL_decryptedMessage_layer8();
                }
            }
        });
        final int i11 = 6;
        sparseArray.put(TLRPC.TL_decryptedMessageService.constructor, new TLObjectFactory() { // from class: org.telegram.tgnet.m
            @Override // org.telegram.tgnet.TLClassStore.TLObjectFactory
            public final TLObject create() {
                switch (i11) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_message_secret();
                    case 2:
                        return new TLRPC.TL_message_secret_layer72();
                    case 3:
                        return new TLRPC.TL_message_secret_old();
                    case 4:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 5:
                        return new TLRPC.TL_null();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService();
                    case 7:
                        return new TLRPC.TL_decryptedMessage();
                    case 8:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 9:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 10:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    default:
                        return new TLRPC.TL_decryptedMessage_layer8();
                }
            }
        });
        final int i12 = 7;
        sparseArray.put(TLRPC.TL_decryptedMessage.constructor, new TLObjectFactory() { // from class: org.telegram.tgnet.m
            @Override // org.telegram.tgnet.TLClassStore.TLObjectFactory
            public final TLObject create() {
                switch (i12) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_message_secret();
                    case 2:
                        return new TLRPC.TL_message_secret_layer72();
                    case 3:
                        return new TLRPC.TL_message_secret_old();
                    case 4:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 5:
                        return new TLRPC.TL_null();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService();
                    case 7:
                        return new TLRPC.TL_decryptedMessage();
                    case 8:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 9:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 10:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    default:
                        return new TLRPC.TL_decryptedMessage_layer8();
                }
            }
        });
        final int i13 = 8;
        sparseArray.put(TLRPC.TL_decryptedMessageLayer.constructor, new TLObjectFactory() { // from class: org.telegram.tgnet.m
            @Override // org.telegram.tgnet.TLClassStore.TLObjectFactory
            public final TLObject create() {
                switch (i13) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_message_secret();
                    case 2:
                        return new TLRPC.TL_message_secret_layer72();
                    case 3:
                        return new TLRPC.TL_message_secret_old();
                    case 4:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 5:
                        return new TLRPC.TL_null();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService();
                    case 7:
                        return new TLRPC.TL_decryptedMessage();
                    case 8:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 9:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 10:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    default:
                        return new TLRPC.TL_decryptedMessage_layer8();
                }
            }
        });
        final int i14 = 7;
        sparseArray.put(TLRPC.TL_decryptedMessage_layer17.constructor, new TLObjectFactory() { // from class: org.telegram.tgnet.m
            @Override // org.telegram.tgnet.TLClassStore.TLObjectFactory
            public final TLObject create() {
                switch (i14) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_message_secret();
                    case 2:
                        return new TLRPC.TL_message_secret_layer72();
                    case 3:
                        return new TLRPC.TL_message_secret_old();
                    case 4:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 5:
                        return new TLRPC.TL_null();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService();
                    case 7:
                        return new TLRPC.TL_decryptedMessage();
                    case 8:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 9:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 10:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    default:
                        return new TLRPC.TL_decryptedMessage_layer8();
                }
            }
        });
        final int i15 = 9;
        sparseArray.put(TLRPC.TL_decryptedMessage_layer45.constructor, new TLObjectFactory() { // from class: org.telegram.tgnet.m
            @Override // org.telegram.tgnet.TLClassStore.TLObjectFactory
            public final TLObject create() {
                switch (i15) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_message_secret();
                    case 2:
                        return new TLRPC.TL_message_secret_layer72();
                    case 3:
                        return new TLRPC.TL_message_secret_old();
                    case 4:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 5:
                        return new TLRPC.TL_null();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService();
                    case 7:
                        return new TLRPC.TL_decryptedMessage();
                    case 8:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 9:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 10:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    default:
                        return new TLRPC.TL_decryptedMessage_layer8();
                }
            }
        });
        final int i16 = 10;
        sparseArray.put(TLRPC.TL_decryptedMessageService_layer8.constructor, new TLObjectFactory() { // from class: org.telegram.tgnet.m
            @Override // org.telegram.tgnet.TLClassStore.TLObjectFactory
            public final TLObject create() {
                switch (i16) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_message_secret();
                    case 2:
                        return new TLRPC.TL_message_secret_layer72();
                    case 3:
                        return new TLRPC.TL_message_secret_old();
                    case 4:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 5:
                        return new TLRPC.TL_null();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService();
                    case 7:
                        return new TLRPC.TL_decryptedMessage();
                    case 8:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 9:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 10:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    default:
                        return new TLRPC.TL_decryptedMessage_layer8();
                }
            }
        });
        final int i17 = 11;
        sparseArray.put(TLRPC.TL_decryptedMessage_layer8.constructor, new TLObjectFactory() { // from class: org.telegram.tgnet.m
            @Override // org.telegram.tgnet.TLClassStore.TLObjectFactory
            public final TLObject create() {
                switch (i17) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_message_secret();
                    case 2:
                        return new TLRPC.TL_message_secret_layer72();
                    case 3:
                        return new TLRPC.TL_message_secret_old();
                    case 4:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 5:
                        return new TLRPC.TL_null();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService();
                    case 7:
                        return new TLRPC.TL_decryptedMessage();
                    case 8:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 9:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 10:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    default:
                        return new TLRPC.TL_decryptedMessage_layer8();
                }
            }
        });
        final int i18 = 1;
        sparseArray.put(TLRPC.TL_message_secret.constructor, new TLObjectFactory() { // from class: org.telegram.tgnet.m
            @Override // org.telegram.tgnet.TLClassStore.TLObjectFactory
            public final TLObject create() {
                switch (i18) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_message_secret();
                    case 2:
                        return new TLRPC.TL_message_secret_layer72();
                    case 3:
                        return new TLRPC.TL_message_secret_old();
                    case 4:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 5:
                        return new TLRPC.TL_null();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService();
                    case 7:
                        return new TLRPC.TL_decryptedMessage();
                    case 8:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 9:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 10:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    default:
                        return new TLRPC.TL_decryptedMessage_layer8();
                }
            }
        });
        final int i19 = 2;
        sparseArray.put(TLRPC.TL_message_secret_layer72.constructor, new TLObjectFactory() { // from class: org.telegram.tgnet.m
            @Override // org.telegram.tgnet.TLClassStore.TLObjectFactory
            public final TLObject create() {
                switch (i19) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_message_secret();
                    case 2:
                        return new TLRPC.TL_message_secret_layer72();
                    case 3:
                        return new TLRPC.TL_message_secret_old();
                    case 4:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 5:
                        return new TLRPC.TL_null();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService();
                    case 7:
                        return new TLRPC.TL_decryptedMessage();
                    case 8:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 9:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 10:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    default:
                        return new TLRPC.TL_decryptedMessage_layer8();
                }
            }
        });
        final int i20 = 3;
        sparseArray.put(TLRPC.TL_message_secret_old.constructor, new TLObjectFactory() { // from class: org.telegram.tgnet.m
            @Override // org.telegram.tgnet.TLClassStore.TLObjectFactory
            public final TLObject create() {
                switch (i20) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_message_secret();
                    case 2:
                        return new TLRPC.TL_message_secret_layer72();
                    case 3:
                        return new TLRPC.TL_message_secret_old();
                    case 4:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 5:
                        return new TLRPC.TL_null();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService();
                    case 7:
                        return new TLRPC.TL_decryptedMessage();
                    case 8:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 9:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 10:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    default:
                        return new TLRPC.TL_decryptedMessage_layer8();
                }
            }
        });
        final int i21 = 4;
        sparseArray.put(TLRPC.TL_messageEncryptedAction.constructor, new TLObjectFactory() { // from class: org.telegram.tgnet.m
            @Override // org.telegram.tgnet.TLClassStore.TLObjectFactory
            public final TLObject create() {
                switch (i21) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_message_secret();
                    case 2:
                        return new TLRPC.TL_message_secret_layer72();
                    case 3:
                        return new TLRPC.TL_message_secret_old();
                    case 4:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 5:
                        return new TLRPC.TL_null();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService();
                    case 7:
                        return new TLRPC.TL_decryptedMessage();
                    case 8:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 9:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 10:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    default:
                        return new TLRPC.TL_decryptedMessage_layer8();
                }
            }
        });
        final int i22 = 5;
        sparseArray.put(TLRPC.TL_null.constructor, new TLObjectFactory() { // from class: org.telegram.tgnet.m
            @Override // org.telegram.tgnet.TLClassStore.TLObjectFactory
            public final TLObject create() {
                switch (i22) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_message_secret();
                    case 2:
                        return new TLRPC.TL_message_secret_layer72();
                    case 3:
                        return new TLRPC.TL_message_secret_old();
                    case 4:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 5:
                        return new TLRPC.TL_null();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService();
                    case 7:
                        return new TLRPC.TL_decryptedMessage();
                    case 8:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 9:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 10:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    default:
                        return new TLRPC.TL_decryptedMessage_layer8();
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
