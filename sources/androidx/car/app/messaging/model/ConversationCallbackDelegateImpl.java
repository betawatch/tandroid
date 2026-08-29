package androidx.car.app.messaging.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.messaging.model.ConversationCallbackDelegateImpl;
import androidx.car.app.messaging.model.IConversationCallback;
import androidx.car.app.utils.j;
import j$.util.Objects;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
class ConversationCallbackDelegateImpl implements c {
    private final IConversationCallback mConversationCallbackBinder;

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
            j.b(iOnDoneCallback, "onMarkAsRead", new androidx.car.app.utils.d() { // from class: androidx.car.app.messaging.model.e
                @Override // androidx.car.app.utils.d
                public final Object a() {
                    Object lambda$onMarkAsRead$0;
                    lambda$onMarkAsRead$0 = ConversationCallbackDelegateImpl.ConversationCallbackStub.this.lambda$onMarkAsRead$0();
                    return lambda$onMarkAsRead$0;
                }
            });
        }

        @Override // androidx.car.app.messaging.model.IConversationCallback
        public void onTextReply(IOnDoneCallback iOnDoneCallback, final String str) {
            j.b(iOnDoneCallback, "onReply", new androidx.car.app.utils.d() { // from class: androidx.car.app.messaging.model.d
                @Override // androidx.car.app.utils.d
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

    public void sendMarkAsRead(androidx.car.app.j jVar) {
        try {
            IConversationCallback iConversationCallback = this.mConversationCallbackBinder;
            Objects.requireNonNull(iConversationCallback);
            iConversationCallback.onMarkAsRead(j.a());
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void sendTextReply(String str, androidx.car.app.j jVar) {
        try {
            IConversationCallback iConversationCallback = this.mConversationCallbackBinder;
            Objects.requireNonNull(iConversationCallback);
            iConversationCallback.onTextReply(j.a(), str);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    private ConversationCallbackDelegateImpl() {
        this.mConversationCallbackBinder = null;
    }
}
