package com.google.firebase.sessions;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
final class SessionFirelogPublisherImpl$getFirebaseInstallationId$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SessionFirelogPublisherImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SessionFirelogPublisherImpl$getFirebaseInstallationId$1(SessionFirelogPublisherImpl sessionFirelogPublisherImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = sessionFirelogPublisherImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object firebaseInstallationId;
        this.result = obj;
        this.label |= TLObject.FLAG_31;
        firebaseInstallationId = this.this$0.getFirebaseInstallationId(this);
        return firebaseInstallationId;
    }
}
