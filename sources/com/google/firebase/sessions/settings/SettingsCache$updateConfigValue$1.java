package com.google.firebase.sessions.settings;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.telegram.tgnet.TLObject;

/* loaded from: classes3.dex */
final class SettingsCache$updateConfigValue$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SettingsCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SettingsCache$updateConfigValue$1(SettingsCache settingsCache, Continuation continuation) {
        super(continuation);
        this.this$0 = settingsCache;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object updateConfigValue;
        this.result = obj;
        this.label |= TLObject.FLAG_31;
        updateConfigValue = this.this$0.updateConfigValue(null, null, this);
        return updateConfigValue;
    }
}
