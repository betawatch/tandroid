package com.google.firebase.sessions.settings;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLObject;

/* loaded from: classes3.dex */
public final class SettingsCache {
    private final DataStore dataStore;
    private SessionConfigs sessionConfigs;
    private static final Companion Companion = new Companion(null);
    private static final Preferences.Key SESSIONS_ENABLED = PreferencesKeys.booleanKey("firebase_sessions_enabled");
    private static final Preferences.Key SAMPLING_RATE = PreferencesKeys.doubleKey("firebase_sessions_sampling_rate");
    private static final Preferences.Key RESTART_TIMEOUT_SECONDS = PreferencesKeys.intKey("firebase_sessions_restart_timeout");
    private static final Preferences.Key CACHE_DURATION_SECONDS = PreferencesKeys.intKey("firebase_sessions_cache_duration");
    private static final Preferences.Key CACHE_UPDATED_TIME = PreferencesKeys.longKey("firebase_sessions_cache_updated_time");

    static final class 1 extends SuspendLambda implements Function2 {
        Object L$0;
        int label;

        1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return SettingsCache.this.new 1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            SettingsCache settingsCache;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SettingsCache settingsCache2 = SettingsCache.this;
                Flow data = settingsCache2.dataStore.getData();
                this.L$0 = settingsCache2;
                this.label = 1;
                Object first = FlowKt.first(data, this);
                if (first == coroutine_suspended) {
                    return coroutine_suspended;
                }
                settingsCache = settingsCache2;
                obj = first;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                settingsCache = (SettingsCache) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            settingsCache.updateSessionConfigs(((Preferences) obj).toPreferences());
            return Unit.INSTANCE;
        }
    }

    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SettingsCache(DataStore dataStore) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        this.dataStore = dataStore;
        BuildersKt__BuildersKt.runBlocking$default(null, new 1(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0029, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        android.util.Log.w("SettingsCache", "Failed to update cache config value: " + r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateConfigValue(Preferences.Key key, Object obj, Continuation continuation) {
        SettingsCache$updateConfigValue$1 settingsCache$updateConfigValue$1;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof SettingsCache$updateConfigValue$1) {
            settingsCache$updateConfigValue$1 = (SettingsCache$updateConfigValue$1) continuation;
            int i2 = settingsCache$updateConfigValue$1.label;
            if ((i2 & TLObject.FLAG_31) != 0) {
                settingsCache$updateConfigValue$1.label = i2 - TLObject.FLAG_31;
                Object obj2 = settingsCache$updateConfigValue$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = settingsCache$updateConfigValue$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    DataStore dataStore = this.dataStore;
                    SettingsCache$updateConfigValue$2 settingsCache$updateConfigValue$2 = new SettingsCache$updateConfigValue$2(obj, key, this, null);
                    settingsCache$updateConfigValue$1.label = 1;
                    if (PreferencesKt.edit(dataStore, settingsCache$updateConfigValue$2, settingsCache$updateConfigValue$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj2);
                }
                return Unit.INSTANCE;
            }
        }
        settingsCache$updateConfigValue$1 = new SettingsCache$updateConfigValue$1(this, continuation);
        Object obj22 = settingsCache$updateConfigValue$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = settingsCache$updateConfigValue$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSessionConfigs(Preferences preferences) {
        this.sessionConfigs = new SessionConfigs((Boolean) preferences.get(SESSIONS_ENABLED), (Double) preferences.get(SAMPLING_RATE), (Integer) preferences.get(RESTART_TIMEOUT_SECONDS), (Integer) preferences.get(CACHE_DURATION_SECONDS), (Long) preferences.get(CACHE_UPDATED_TIME));
    }

    public final boolean hasCacheExpired$com_google_firebase_firebase_sessions() {
        SessionConfigs sessionConfigs = this.sessionConfigs;
        SessionConfigs sessionConfigs2 = null;
        if (sessionConfigs == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionConfigs");
            sessionConfigs = null;
        }
        Long cacheUpdatedTime = sessionConfigs.getCacheUpdatedTime();
        SessionConfigs sessionConfigs3 = this.sessionConfigs;
        if (sessionConfigs3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionConfigs");
        } else {
            sessionConfigs2 = sessionConfigs3;
        }
        Integer cacheDuration = sessionConfigs2.getCacheDuration();
        return cacheUpdatedTime == null || cacheDuration == null || (System.currentTimeMillis() - cacheUpdatedTime.longValue()) / ((long) MediaDataController.MAX_STYLE_RUNS_COUNT) >= ((long) cacheDuration.intValue());
    }

    public final Integer sessionRestartTimeout() {
        SessionConfigs sessionConfigs = this.sessionConfigs;
        if (sessionConfigs == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionConfigs");
            sessionConfigs = null;
        }
        return sessionConfigs.getSessionRestartTimeout();
    }

    public final Double sessionSamplingRate() {
        SessionConfigs sessionConfigs = this.sessionConfigs;
        if (sessionConfigs == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionConfigs");
            sessionConfigs = null;
        }
        return sessionConfigs.getSessionSamplingRate();
    }

    public final Boolean sessionsEnabled() {
        SessionConfigs sessionConfigs = this.sessionConfigs;
        if (sessionConfigs == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionConfigs");
            sessionConfigs = null;
        }
        return sessionConfigs.getSessionEnabled();
    }

    public final Object updateSamplingRate(Double d, Continuation continuation) {
        Object coroutine_suspended;
        Object updateConfigValue = updateConfigValue(SAMPLING_RATE, d, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return updateConfigValue == coroutine_suspended ? updateConfigValue : Unit.INSTANCE;
    }

    public final Object updateSessionCacheDuration(Integer num, Continuation continuation) {
        Object coroutine_suspended;
        Object updateConfigValue = updateConfigValue(CACHE_DURATION_SECONDS, num, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return updateConfigValue == coroutine_suspended ? updateConfigValue : Unit.INSTANCE;
    }

    public final Object updateSessionCacheUpdatedTime(Long l, Continuation continuation) {
        Object coroutine_suspended;
        Object updateConfigValue = updateConfigValue(CACHE_UPDATED_TIME, l, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return updateConfigValue == coroutine_suspended ? updateConfigValue : Unit.INSTANCE;
    }

    public final Object updateSessionRestartTimeout(Integer num, Continuation continuation) {
        Object coroutine_suspended;
        Object updateConfigValue = updateConfigValue(RESTART_TIMEOUT_SECONDS, num, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return updateConfigValue == coroutine_suspended ? updateConfigValue : Unit.INSTANCE;
    }

    public final Object updateSettingsEnabled(Boolean bool, Continuation continuation) {
        Object coroutine_suspended;
        Object updateConfigValue = updateConfigValue(SESSIONS_ENABLED, bool, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return updateConfigValue == coroutine_suspended ? updateConfigValue : Unit.INSTANCE;
    }
}
