package androidx.car.app.messaging.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.k;
import androidx.car.app.messaging.model.ConversationCallbackDelegateImpl;
import androidx.car.app.messaging.model.IConversationCallback;
import androidx.car.app.utils.g;
import j$.util.Objects;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
class ConversationCallbackDelegateImpl implements c {
    private final IConversationCallback mConversationCallbackBinder;

    /* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
    public static class ConversationCallbackStub extends IConversationCallback.Stub {
        private final b mConversationCallback;

        public ConversationCallbackStub(b bVar) {
            this.mConversationCallback = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onMarkAsRead$0() {
            this.mConversationCallback.getClass();
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onTextReply$1(String str) {
            this.mConversationCallback.getClass();
            return null;
        }

        @Override // androidx.car.app.messaging.model.IConversationCallback
        public void onMarkAsRead(IOnDoneCallback iOnDoneCallback) {
            g.b(iOnDoneCallback, "onMarkAsRead", new androidx.car.app.utils.a() { // from class: androidx.car.app.messaging.model.e
                @Override // androidx.car.app.utils.a
                public final Object a() {
                    Object lambda$onMarkAsRead$0;
                    lambda$onMarkAsRead$0 = ConversationCallbackDelegateImpl.ConversationCallbackStub.this.lambda$onMarkAsRead$0();
                    return lambda$onMarkAsRead$0;
                }
            });
        }

        @Override // androidx.car.app.messaging.model.IConversationCallback
        public void onTextReply(IOnDoneCallback iOnDoneCallback, final String str) {
            g.b(iOnDoneCallback, "onReply", new androidx.car.app.utils.a() { // from class: androidx.car.app.messaging.model.d
                @Override // androidx.car.app.utils.a
                public final Object a() {
                    Object lambda$onTextReply$1;
                    lambda$onTextReply$1 = ConversationCallbackDelegateImpl.ConversationCallbackStub.this.lambda$onTextReply$1(str);
                    return lambda$onTextReply$1;
                }
            });
        }
    }

    public ConversationCallbackDelegateImpl(b bVar) {
        this.mConversationCallbackBinder = new ConversationCallbackStub(bVar);
    }

    public void sendMarkAsRead(k kVar) {
        try {
            IConversationCallback iConversationCallback = this.mConversationCallbackBinder;
            Objects.requireNonNull(iConversationCallback);
            iConversationCallback.onMarkAsRead(g.a());
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendTextReply(String str, k kVar) {
        try {
            IConversationCallback iConversationCallback = this.mConversationCallbackBinder;
            Objects.requireNonNull(iConversationCallback);
            iConversationCallback.onTextReply(g.a(), str);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private ConversationCallbackDelegateImpl() {
        this.mConversationCallbackBinder = null;
    }
}
