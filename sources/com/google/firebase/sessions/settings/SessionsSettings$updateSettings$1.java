package com.google.firebase.sessions.settings;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
final class SessionsSettings$updateSettings$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SessionsSettings this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SessionsSettings$updateSettings$1(SessionsSettings sessionsSettings, Continuation continuation) {
        super(continuation);
        this.this$0 = sessionsSettings;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= TLObject.FLAG_31;
        return this.this$0.updateSettings(this);
    }
}
