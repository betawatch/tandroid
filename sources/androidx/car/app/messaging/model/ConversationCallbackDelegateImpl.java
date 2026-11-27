package androidx.car.app.messaging.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.messaging.model.ConversationCallbackDelegateImpl;
import androidx.car.app.messaging.model.IConversationCallback;
import androidx.car.app.utils.e;
import j$.util.Objects;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
class ConversationCallbackDelegateImpl implements cx2 {
    private final IConversationCallback mConversationCallbackBinder;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
    static class ConversationCallbackStub extends IConversationCallback.Stub {
        private final bx2 mConversationCallback;

        public ConversationCallbackStub(bx2 bx2Var) {
            this.mConversationCallback = bx2Var;
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
            e.c(iOnDoneCallback, "onMarkAsRead", new da9() { // from class: androidx.car.app.messaging.model.b
                @Override // da9
                public final Object a() {
                    Object lambda$onMarkAsRead$0;
                    lambda$onMarkAsRead$0 = ConversationCallbackDelegateImpl.ConversationCallbackStub.this.lambda$onMarkAsRead$0();
                    return lambda$onMarkAsRead$0;
                }
            });
        }

        @Override // androidx.car.app.messaging.model.IConversationCallback
        public void onTextReply(IOnDoneCallback iOnDoneCallback, final String str) {
            e.c(iOnDoneCallback, "onReply", new da9() { // from class: androidx.car.app.messaging.model.a
                @Override // da9
                public final Object a() {
                    Object lambda$onTextReply$1;
                    lambda$onTextReply$1 = ConversationCallbackDelegateImpl.ConversationCallbackStub.this.lambda$onTextReply$1(str);
                    return lambda$onTextReply$1;
                }
            });
        }
    }

    public ConversationCallbackDelegateImpl(bx2 bx2Var) {
        this.mConversationCallbackBinder = new ConversationCallbackStub(bx2Var);
    }

    public void sendMarkAsRead(cs7 cs7Var) {
        try {
            IConversationCallback iConversationCallback = this.mConversationCallbackBinder;
            Objects.requireNonNull(iConversationCallback);
            iConversationCallback.onMarkAsRead(e.a());
        } catch (RemoteException e) {
            grb.m(e);
        }
    }

    public void sendTextReply(String str, cs7 cs7Var) {
        try {
            IConversationCallback iConversationCallback = this.mConversationCallbackBinder;
            Objects.requireNonNull(iConversationCallback);
            iConversationCallback.onTextReply(e.a(), str);
        } catch (RemoteException e) {
            grb.m(e);
        }
    }

    private ConversationCallbackDelegateImpl() {
        this.mConversationCallbackBinder = null;
    }
}
