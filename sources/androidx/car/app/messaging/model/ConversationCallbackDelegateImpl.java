package androidx.car.app.messaging.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.j;
import androidx.car.app.messaging.model.ConversationCallbackDelegateImpl;
import androidx.car.app.messaging.model.IConversationCallback;
import androidx.car.app.utils.i;
import j$.util.Objects;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
class ConversationCallbackDelegateImpl implements c {
    private final IConversationCallback mConversationCallbackBinder;

    /* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
            i.b(iOnDoneCallback, "onMarkAsRead", new androidx.car.app.utils.c() { // from class: androidx.car.app.messaging.model.e
                @Override // androidx.car.app.utils.c
                public final Object b() {
                    Object lambda$onMarkAsRead$0;
                    lambda$onMarkAsRead$0 = ConversationCallbackDelegateImpl.ConversationCallbackStub.this.lambda$onMarkAsRead$0();
                    return lambda$onMarkAsRead$0;
                }
            });
        }

        @Override // androidx.car.app.messaging.model.IConversationCallback
        public void onTextReply(IOnDoneCallback iOnDoneCallback, final String str) {
            i.b(iOnDoneCallback, "onReply", new androidx.car.app.utils.c() { // from class: androidx.car.app.messaging.model.d
                @Override // androidx.car.app.utils.c
                public final Object b() {
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

    public void sendMarkAsRead(j jVar) {
        try {
            IConversationCallback iConversationCallback = this.mConversationCallbackBinder;
            Objects.requireNonNull(iConversationCallback);
            iConversationCallback.onMarkAsRead(i.a());
        } catch (RemoteException e9) {
            throw new RuntimeException(e9);
        }
    }

    public void sendTextReply(String str, j jVar) {
        try {
            IConversationCallback iConversationCallback = this.mConversationCallbackBinder;
            Objects.requireNonNull(iConversationCallback);
            iConversationCallback.onTextReply(i.a(), str);
        } catch (RemoteException e9) {
            throw new RuntimeException(e9);
        }
    }

    private ConversationCallbackDelegateImpl() {
        this.mConversationCallbackBinder = null;
    }
}
