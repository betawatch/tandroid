package org.telegram.tgnet;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class TLClassStore {
    static TLClassStore store;
    private final SparseArray<TLObjectFactory> classStore;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
    interface TLObjectFactory {
        TLObject create();
    }

    public TLClassStore() {
        SparseArray<TLObjectFactory> sparseArray = new SparseArray<>();
        this.classStore = sparseArray;
        final byte b = 0;
        sparseArray.put(TLRPC.TL_error.constructor, new TLObjectFactory() { // from class: org.telegram.tgnet.c
            @Override // org.telegram.tgnet.TLClassStore.TLObjectFactory
            public final TLObject create() {
                switch (b) {
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
        final byte b2 = 6;
        sparseArray.put(TLRPC.TL_decryptedMessageService.constructor, new TLObjectFactory() { // from class: org.telegram.tgnet.c
            @Override // org.telegram.tgnet.TLClassStore.TLObjectFactory
            public final TLObject create() {
                switch (b2) {
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
        final byte b3 = 7;
        sparseArray.put(TLRPC.TL_decryptedMessage.constructor, new TLObjectFactory() { // from class: org.telegram.tgnet.c
            @Override // org.telegram.tgnet.TLClassStore.TLObjectFactory
            public final TLObject create() {
                switch (b3) {
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
        final byte b4 = 8;
        sparseArray.put(TLRPC.TL_decryptedMessageLayer.constructor, new TLObjectFactory() { // from class: org.telegram.tgnet.c
            @Override // org.telegram.tgnet.TLClassStore.TLObjectFactory
            public final TLObject create() {
                switch (b4) {
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
        final byte b5 = 7;
        sparseArray.put(TLRPC.TL_decryptedMessage_layer17.constructor, new TLObjectFactory() { // from class: org.telegram.tgnet.c
            @Override // org.telegram.tgnet.TLClassStore.TLObjectFactory
            public final TLObject create() {
                switch (b5) {
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
        final byte b6 = 9;
        sparseArray.put(TLRPC.TL_decryptedMessage_layer45.constructor, new TLObjectFactory() { // from class: org.telegram.tgnet.c
            @Override // org.telegram.tgnet.TLClassStore.TLObjectFactory
            public final TLObject create() {
                switch (b6) {
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
        final byte b7 = 10;
        sparseArray.put(TLRPC.TL_decryptedMessageService_layer8.constructor, new TLObjectFactory() { // from class: org.telegram.tgnet.c
            @Override // org.telegram.tgnet.TLClassStore.TLObjectFactory
            public final TLObject create() {
                switch (b7) {
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
        final byte b8 = 11;
        sparseArray.put(TLRPC.TL_decryptedMessage_layer8.constructor, new TLObjectFactory() { // from class: org.telegram.tgnet.c
            @Override // org.telegram.tgnet.TLClassStore.TLObjectFactory
            public final TLObject create() {
                switch (b8) {
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
        final byte b9 = 1;
        sparseArray.put(TLRPC.TL_message_secret.constructor, new TLObjectFactory() { // from class: org.telegram.tgnet.c
            @Override // org.telegram.tgnet.TLClassStore.TLObjectFactory
            public final TLObject create() {
                switch (b9) {
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
        final byte b10 = 2;
        sparseArray.put(TLRPC.TL_message_secret_layer72.constructor, new TLObjectFactory() { // from class: org.telegram.tgnet.c
            @Override // org.telegram.tgnet.TLClassStore.TLObjectFactory
            public final TLObject create() {
                switch (b10) {
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
        final byte b11 = 3;
        sparseArray.put(TLRPC.TL_message_secret_old.constructor, new TLObjectFactory() { // from class: org.telegram.tgnet.c
            @Override // org.telegram.tgnet.TLClassStore.TLObjectFactory
            public final TLObject create() {
                switch (b11) {
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
        final byte b12 = 4;
        sparseArray.put(TLRPC.TL_messageEncryptedAction.constructor, new TLObjectFactory() { // from class: org.telegram.tgnet.c
            @Override // org.telegram.tgnet.TLClassStore.TLObjectFactory
            public final TLObject create() {
                switch (b12) {
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
        final byte b13 = 5;
        sparseArray.put(TLRPC.TL_null.constructor, new TLObjectFactory() { // from class: org.telegram.tgnet.c
            @Override // org.telegram.tgnet.TLClassStore.TLObjectFactory
            public final TLObject create() {
                switch (b13) {
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
        TLClassStore tLClassStore = store;
        if (tLClassStore != null) {
            return tLClassStore;
        }
        TLClassStore tLClassStore2 = new TLClassStore();
        store = tLClassStore2;
        return tLClassStore2;
    }

    public TLObject TLdeserialize(NativeByteBuffer nativeByteBuffer, int i, boolean z) {
        TLObjectFactory tLObjectFactory = this.classStore.get(i);
        if (tLObjectFactory == null) {
            return null;
        }
        TLObject create = tLObjectFactory.create();
        create.readParams(nativeByteBuffer, z);
        return create;
    }
}
