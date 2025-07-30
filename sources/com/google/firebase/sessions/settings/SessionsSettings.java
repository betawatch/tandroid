package com.google.firebase.sessions.settings;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseKt;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.ApplicationInfo;
import com.google.firebase.sessions.SessionDataStoreConfigs;
import com.google.firebase.sessions.SessionEvents;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.telegram.tgnet.TLObject;

/* loaded from: classes3.dex */
public final class SessionsSettings {
    public static final Companion Companion = new Companion(null);
    private static final ReadOnlyProperty dataStore$delegate = PreferenceDataStoreDelegateKt.preferencesDataStore$default(SessionDataStoreConfigs.INSTANCE.getSETTINGS_CONFIG_NAME(), null, null, null, 14, null);
    private final SettingsProvider localOverrideSettings;
    private final SettingsProvider remoteSettings;

    public static final class Companion {
        static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property2(new PropertyReference2Impl(Companion.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DataStore getDataStore(Context context) {
            return (DataStore) SessionsSettings.dataStore$delegate.getValue(context, $$delegatedProperties[0]);
        }

        public final SessionsSettings getInstance() {
            Object obj = FirebaseKt.getApp(Firebase.INSTANCE).get(SessionsSettings.class);
            Intrinsics.checkNotNullExpressionValue(obj, "Firebase.app[SessionsSettings::class.java]");
            return (SessionsSettings) obj;
        }
    }

    private SessionsSettings(Context context, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, FirebaseInstallationsApi firebaseInstallationsApi, ApplicationInfo applicationInfo) {
        this(new LocalOverrideSettings(context), new RemoteSettings(coroutineContext2, firebaseInstallationsApi, applicationInfo, new RemoteSettingsFetcher(applicationInfo, coroutineContext, null, 4, null), Companion.getDataStore(context)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SessionsSettings(FirebaseApp firebaseApp, CoroutineContext blockingDispatcher, CoroutineContext backgroundDispatcher, FirebaseInstallationsApi firebaseInstallationsApi) {
        this(r2, blockingDispatcher, backgroundDispatcher, firebaseInstallationsApi, SessionEvents.INSTANCE.getApplicationInfo(firebaseApp));
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        Intrinsics.checkNotNullParameter(blockingDispatcher, "blockingDispatcher");
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(firebaseInstallationsApi, "firebaseInstallationsApi");
        Context applicationContext = firebaseApp.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "firebaseApp.applicationContext");
    }

    public SessionsSettings(SettingsProvider localOverrideSettings, SettingsProvider remoteSettings) {
        Intrinsics.checkNotNullParameter(localOverrideSettings, "localOverrideSettings");
        Intrinsics.checkNotNullParameter(remoteSettings, "remoteSettings");
        this.localOverrideSettings = localOverrideSettings;
        this.remoteSettings = remoteSettings;
    }

    private final boolean isValidSamplingRate(double d) {
        return 0.0d <= d && d <= 1.0d;
    }

    private final boolean isValidSessionRestartTimeout-LRDsOJo(long j) {
        return Duration.isPositive-impl(j) && Duration.isFinite-impl(j);
    }

    public final double getSamplingRate() {
        Double samplingRate = this.localOverrideSettings.getSamplingRate();
        if (samplingRate != null) {
            double doubleValue = samplingRate.doubleValue();
            if (isValidSamplingRate(doubleValue)) {
                return doubleValue;
            }
        }
        Double samplingRate2 = this.remoteSettings.getSamplingRate();
        if (samplingRate2 == null) {
            return 1.0d;
        }
        double doubleValue2 = samplingRate2.doubleValue();
        if (isValidSamplingRate(doubleValue2)) {
            return doubleValue2;
        }
        return 1.0d;
    }

    public final long getSessionRestartTimeout-UwyO8pc() {
        Duration duration = this.localOverrideSettings.getSessionRestartTimeout-FghU774();
        if (duration != null) {
            long j = duration.unbox-impl();
            if (isValidSessionRestartTimeout-LRDsOJo(j)) {
                return j;
            }
        }
        Duration duration2 = this.remoteSettings.getSessionRestartTimeout-FghU774();
        if (duration2 != null) {
            long j2 = duration2.unbox-impl();
            if (isValidSessionRestartTimeout-LRDsOJo(j2)) {
                return j2;
            }
        }
        Duration.Companion companion = Duration.Companion;
        return DurationKt.toDuration(30, DurationUnit.MINUTES);
    }

    public final boolean getSessionsEnabled() {
        Boolean sessionEnabled = this.localOverrideSettings.getSessionEnabled();
        if (sessionEnabled != null) {
            return sessionEnabled.booleanValue();
        }
        Boolean sessionEnabled2 = this.remoteSettings.getSessionEnabled();
        if (sessionEnabled2 != null) {
            return sessionEnabled2.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateSettings(Continuation continuation) {
        SessionsSettings$updateSettings$1 sessionsSettings$updateSettings$1;
        Object coroutine_suspended;
        int i;
        SessionsSettings sessionsSettings;
        SettingsProvider settingsProvider;
        if (continuation instanceof SessionsSettings$updateSettings$1) {
            sessionsSettings$updateSettings$1 = (SessionsSettings$updateSettings$1) continuation;
            int i2 = sessionsSettings$updateSettings$1.label;
            if ((i2 & TLObject.FLAG_31) != 0) {
                sessionsSettings$updateSettings$1.label = i2 - TLObject.FLAG_31;
                Object obj = sessionsSettings$updateSettings$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sessionsSettings$updateSettings$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    SettingsProvider settingsProvider2 = this.localOverrideSettings;
                    sessionsSettings$updateSettings$1.L$0 = this;
                    sessionsSettings$updateSettings$1.label = 1;
                    if (settingsProvider2.updateSettings(sessionsSettings$updateSettings$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    sessionsSettings = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    sessionsSettings = (SessionsSettings) sessionsSettings$updateSettings$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                settingsProvider = sessionsSettings.remoteSettings;
                sessionsSettings$updateSettings$1.L$0 = null;
                sessionsSettings$updateSettings$1.label = 2;
                if (settingsProvider.updateSettings(sessionsSettings$updateSettings$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        sessionsSettings$updateSettings$1 = new SessionsSettings$updateSettings$1(this, continuation);
        Object obj2 = sessionsSettings$updateSettings$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sessionsSettings$updateSettings$1.label;
        if (i != 0) {
        }
        settingsProvider = sessionsSettings.remoteSettings;
        sessionsSettings$updateSettings$1.L$0 = null;
        sessionsSettings$updateSettings$1.label = 2;
        if (settingsProvider.updateSettings(sessionsSettings$updateSettings$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }
}
