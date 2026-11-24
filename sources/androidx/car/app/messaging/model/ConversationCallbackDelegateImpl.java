package androidx.car.app.messaging.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.messaging.model.ConversationCallbackDelegateImpl;
import androidx.car.app.messaging.model.IConversationCallback;
import androidx.car.app.utils.e;
import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
class ConversationCallbackDelegateImpl implements sx2 {
    private final IConversationCallback mConversationCallbackBinder;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    static class ConversationCallbackStub extends IConversationCallback.Stub {
        private final rx2 mConversationCallback;

        public ConversationCallbackStub(rx2 rx2Var) {
            this.mConversationCallback = rx2Var;
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
            e.c(iOnDoneCallback, "onMarkAsRead", new s89() { // from class: androidx.car.app.messaging.model.b
                @Override // s89
                public final Object a() {
                    Object lambda$onMarkAsRead$0;
                    lambda$onMarkAsRead$0 = ConversationCallbackDelegateImpl.ConversationCallbackStub.this.lambda$onMarkAsRead$0();
                    return lambda$onMarkAsRead$0;
                }
            });
        }

        @Override // androidx.car.app.messaging.model.IConversationCallback
        public void onTextReply(IOnDoneCallback iOnDoneCallback, final String str) {
            e.c(iOnDoneCallback, "onReply", new s89() { // from class: androidx.car.app.messaging.model.a
                @Override // s89
                public final Object a() {
                    Object lambda$onTextReply$1;
                    lambda$onTextReply$1 = ConversationCallbackDelegateImpl.ConversationCallbackStub.this.lambda$onTextReply$1(str);
                    return lambda$onTextReply$1;
                }
            });
        }
    }

    public ConversationCallbackDelegateImpl(rx2 rx2Var) {
        this.mConversationCallbackBinder = new ConversationCallbackStub(rx2Var);
    }

    public void sendMarkAsRead(fr7 fr7Var) {
        try {
            IConversationCallback iConversationCallback = this.mConversationCallbackBinder;
            Objects.requireNonNull(iConversationCallback);
            iConversationCallback.onMarkAsRead(e.a());
        } catch (RemoteException e) {
            rjb.m(e);
        }
    }

    public void sendTextReply(String str, fr7 fr7Var) {
        try {
            IConversationCallback iConversationCallback = this.mConversationCallbackBinder;
            Objects.requireNonNull(iConversationCallback);
            iConversationCallback.onTextReply(e.a(), str);
        } catch (RemoteException e) {
            rjb.m(e);
        }
    }

    private ConversationCallbackDelegateImpl() {
        this.mConversationCallbackBinder = null;
    }
}
