package com.google.firebase.sessions.settings;

import android.util.Log;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class RemoteSettings$updateSettings$2$1 extends SuspendLambda implements Function2 {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ RemoteSettings this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemoteSettings$updateSettings$2$1(RemoteSettings remoteSettings, Continuation continuation) {
        super(2, continuation);
        this.this$0 = remoteSettings;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RemoteSettings$updateSettings$2$1 remoteSettings$updateSettings$2$1 = new RemoteSettings$updateSettings$2$1(this.this$0, continuation);
        remoteSettings$updateSettings$2$1.L$0 = obj;
        return remoteSettings$updateSettings$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(JSONObject jSONObject, Continuation continuation) {
        return ((RemoteSettings$updateSettings$2$1) create(jSONObject, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0195, code lost:
    
        if (r13.updateSessionCacheUpdatedTime(r0, r12) == r4) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0177, code lost:
    
        if (r13.updateSessionCacheDuration(r0, r12) == r4) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0154, code lost:
    
        if (r13.updateSessionCacheDuration(r0, r12) == r4) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0134, code lost:
    
        if (r13.updateSamplingRate(r1, r12) == r4) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0113, code lost:
    
        if (r13.updateSessionRestartTimeout(r2, r12) == r4) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f4  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref$ObjectRef ref$ObjectRef;
        Boolean bool;
        Ref$ObjectRef ref$ObjectRef2;
        Ref$ObjectRef ref$ObjectRef3;
        SettingsCache settingsCache;
        Ref$ObjectRef ref$ObjectRef4;
        Ref$ObjectRef ref$ObjectRef5;
        SettingsCache settingsCache2;
        SettingsCache settingsCache3;
        Unit unit;
        SettingsCache settingsCache4;
        SettingsCache settingsCache5;
        SettingsCache settingsCache6;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                JSONObject jSONObject = (JSONObject) this.L$0;
                Log.d("SessionConfigFetcher", "Fetched settings: " + jSONObject);
                Ref$ObjectRef ref$ObjectRef6 = new Ref$ObjectRef();
                ref$ObjectRef = new Ref$ObjectRef();
                Ref$ObjectRef ref$ObjectRef7 = new Ref$ObjectRef();
                if (jSONObject.has("app_quality")) {
                    Object obj2 = jSONObject.get("app_quality");
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                    JSONObject jSONObject2 = (JSONObject) obj2;
                    try {
                        bool = jSONObject2.has("sessions_enabled") ? (Boolean) jSONObject2.get("sessions_enabled") : null;
                    } catch (JSONException e) {
                        e = e;
                        bool = null;
                    }
                    try {
                        if (jSONObject2.has("sampling_rate")) {
                            ref$ObjectRef6.element = (Double) jSONObject2.get("sampling_rate");
                        }
                        if (jSONObject2.has("session_timeout_seconds")) {
                            ref$ObjectRef.element = (Integer) jSONObject2.get("session_timeout_seconds");
                        }
                        if (jSONObject2.has("cache_duration")) {
                            ref$ObjectRef7.element = (Integer) jSONObject2.get("cache_duration");
                        }
                    } catch (JSONException e2) {
                        e = e2;
                        Log.e("SessionConfigFetcher", "Error parsing the configs remotely fetched: ", e);
                        if (bool == null) {
                        }
                    }
                } else {
                    bool = null;
                }
                if (bool == null) {
                    settingsCache = this.this$0.settingsCache;
                    this.L$0 = ref$ObjectRef6;
                    this.L$1 = ref$ObjectRef;
                    this.L$2 = ref$ObjectRef7;
                    this.label = 1;
                    if (settingsCache.updateSettingsEnabled(bool, this) != coroutine_suspended) {
                        ref$ObjectRef4 = ref$ObjectRef6;
                        ref$ObjectRef5 = ref$ObjectRef;
                        ref$ObjectRef3 = ref$ObjectRef7;
                        ref$ObjectRef = ref$ObjectRef5;
                        ref$ObjectRef2 = ref$ObjectRef4;
                        if (((Integer) ref$ObjectRef.element) != null) {
                            settingsCache2 = this.this$0.settingsCache;
                            Integer num = (Integer) ref$ObjectRef.element;
                            this.L$0 = ref$ObjectRef2;
                            this.L$1 = ref$ObjectRef3;
                            this.L$2 = null;
                            this.label = 2;
                            break;
                        }
                        if (((Double) ref$ObjectRef2.element) != null) {
                            settingsCache3 = this.this$0.settingsCache;
                            Double d = (Double) ref$ObjectRef2.element;
                            this.L$0 = ref$ObjectRef3;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 3;
                            break;
                        }
                        if (((Integer) ref$ObjectRef3.element) != null) {
                            settingsCache4 = this.this$0.settingsCache;
                            Integer num2 = (Integer) ref$ObjectRef3.element;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 4;
                            break;
                        } else {
                            unit = null;
                            if (unit == null) {
                                settingsCache5 = this.this$0.settingsCache;
                                Integer boxInt = Boxing.boxInt(86400);
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.label = 5;
                                break;
                            }
                            settingsCache6 = this.this$0.settingsCache;
                            Long boxLong = Boxing.boxLong(System.currentTimeMillis());
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 6;
                            break;
                        }
                    }
                    return coroutine_suspended;
                }
                ref$ObjectRef2 = ref$ObjectRef6;
                ref$ObjectRef3 = ref$ObjectRef7;
                if (((Integer) ref$ObjectRef.element) != null) {
                }
                if (((Double) ref$ObjectRef2.element) != null) {
                }
                if (((Integer) ref$ObjectRef3.element) != null) {
                }
            case 1:
                ref$ObjectRef3 = (Ref$ObjectRef) this.L$2;
                ref$ObjectRef5 = (Ref$ObjectRef) this.L$1;
                ref$ObjectRef4 = (Ref$ObjectRef) this.L$0;
                ResultKt.throwOnFailure(obj);
                ref$ObjectRef = ref$ObjectRef5;
                ref$ObjectRef2 = ref$ObjectRef4;
                if (((Integer) ref$ObjectRef.element) != null) {
                }
                if (((Double) ref$ObjectRef2.element) != null) {
                }
                if (((Integer) ref$ObjectRef3.element) != null) {
                }
                break;
            case 2:
                ref$ObjectRef3 = (Ref$ObjectRef) this.L$1;
                ref$ObjectRef2 = (Ref$ObjectRef) this.L$0;
                ResultKt.throwOnFailure(obj);
                if (((Double) ref$ObjectRef2.element) != null) {
                }
                if (((Integer) ref$ObjectRef3.element) != null) {
                }
                break;
            case 3:
                ref$ObjectRef3 = (Ref$ObjectRef) this.L$0;
                ResultKt.throwOnFailure(obj);
                if (((Integer) ref$ObjectRef3.element) != null) {
                }
                break;
            case 4:
                ResultKt.throwOnFailure(obj);
                unit = Unit.INSTANCE;
                if (unit == null) {
                }
                settingsCache6 = this.this$0.settingsCache;
                Long boxLong2 = Boxing.boxLong(System.currentTimeMillis());
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 6;
                break;
            case 5:
                ResultKt.throwOnFailure(obj);
                settingsCache6 = this.this$0.settingsCache;
                Long boxLong22 = Boxing.boxLong(System.currentTimeMillis());
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 6;
                break;
            case 6:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
