package com.google.firebase.sessions.settings;

import android.os.Build;
import android.util.Log;
import androidx.datastore.core.DataStore;
import com.google.android.gms.tasks.Task;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.ApplicationInfo;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import kotlinx.coroutines.tasks.TasksKt;
import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
public final class RemoteSettings implements SettingsProvider {
    private static final Companion Companion = new Companion(null);
    private final ApplicationInfo appInfo;
    private final CoroutineContext backgroundDispatcher;
    private final CrashlyticsSettingsFetcher configsFetcher;
    private final Mutex fetchInProgress;
    private final FirebaseInstallationsApi firebaseInstallationsApi;
    private final SettingsCache settingsCache;

    public RemoteSettings(CoroutineContext backgroundDispatcher, FirebaseInstallationsApi firebaseInstallationsApi, ApplicationInfo appInfo, CrashlyticsSettingsFetcher configsFetcher, DataStore dataStore) {
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(firebaseInstallationsApi, "firebaseInstallationsApi");
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        Intrinsics.checkNotNullParameter(configsFetcher, "configsFetcher");
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        this.backgroundDispatcher = backgroundDispatcher;
        this.firebaseInstallationsApi = firebaseInstallationsApi;
        this.appInfo = appInfo;
        this.configsFetcher = configsFetcher;
        this.settingsCache = new SettingsCache(dataStore);
        this.fetchInProgress = MutexKt.Mutex$default(false, 1, null);
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public Boolean getSessionEnabled() {
        return this.settingsCache.sessionsEnabled();
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public Duration getSessionRestartTimeout-FghU774() {
        Integer sessionRestartTimeout = this.settingsCache.sessionRestartTimeout();
        if (sessionRestartTimeout == null) {
            return null;
        }
        Duration.Companion companion = Duration.Companion;
        return Duration.box-impl(DurationKt.toDuration(sessionRestartTimeout.intValue(), DurationUnit.SECONDS));
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public Double getSamplingRate() {
        return this.settingsCache.sessionSamplingRate();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00bb A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #0 {all -> 0x0053, blocks: (B:26:0x004f, B:27:0x00b7, B:29:0x00bb, B:32:0x00c6, B:37:0x008b, B:39:0x0093, B:42:0x009e), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c6 A[Catch: all -> 0x0053, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0053, blocks: (B:26:0x004f, B:27:0x00b7, B:29:0x00bb, B:32:0x00c6, B:37:0x008b, B:39:0x0093, B:42:0x009e), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0093 A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #0 {all -> 0x0053, blocks: (B:26:0x004f, B:27:0x00b7, B:29:0x00bb, B:32:0x00c6, B:37:0x008b, B:39:0x0093, B:42:0x009e), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009e A[Catch: all -> 0x0053, TRY_ENTER, TryCatch #0 {all -> 0x0053, blocks: (B:26:0x004f, B:27:0x00b7, B:29:0x00bb, B:32:0x00c6, B:37:0x008b, B:39:0x0093, B:42:0x009e), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Type inference failed for: r8v0, types: [int] */
    @Override // com.google.firebase.sessions.settings.SettingsProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateSettings(Continuation continuation) {
        RemoteSettings$updateSettings$1 remoteSettings$updateSettings$1;
        ?? r8;
        Mutex mutex;
        Mutex mutex2;
        RemoteSettings remoteSettings;
        String str;
        try {
            if (continuation instanceof RemoteSettings$updateSettings$1) {
                remoteSettings$updateSettings$1 = (RemoteSettings$updateSettings$1) continuation;
                int i = remoteSettings$updateSettings$1.label;
                if ((i & TLObject.FLAG_31) != 0) {
                    remoteSettings$updateSettings$1.label = i - TLObject.FLAG_31;
                    Object obj = remoteSettings$updateSettings$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r8 = remoteSettings$updateSettings$1.label;
                    if (r8 != 0) {
                        ResultKt.throwOnFailure(obj);
                        if (!this.fetchInProgress.isLocked() && !this.settingsCache.hasCacheExpired$com_google_firebase_firebase_sessions()) {
                            return Unit.INSTANCE;
                        }
                        Mutex mutex3 = this.fetchInProgress;
                        remoteSettings$updateSettings$1.L$0 = this;
                        remoteSettings$updateSettings$1.L$1 = mutex3;
                        remoteSettings$updateSettings$1.label = 1;
                        if (mutex3.lock(null, remoteSettings$updateSettings$1) != coroutine_suspended) {
                            mutex2 = mutex3;
                            remoteSettings = this;
                        }
                        return coroutine_suspended;
                    }
                    if (r8 != 1) {
                        if (r8 != 2) {
                            if (r8 == 3) {
                                mutex = (Mutex) remoteSettings$updateSettings$1.L$0;
                                try {
                                    ResultKt.throwOnFailure(obj);
                                    Unit unit = Unit.INSTANCE;
                                    mutex.unlock(null);
                                    return Unit.INSTANCE;
                                } catch (Throwable th) {
                                    th = th;
                                    mutex.unlock(null);
                                    throw th;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex2 = (Mutex) remoteSettings$updateSettings$1.L$1;
                        remoteSettings = (RemoteSettings) remoteSettings$updateSettings$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        str = (String) obj;
                        if (str != null) {
                            Log.w("SessionConfigFetcher", "Error getting Firebase Installation ID. Skipping this Session Event.");
                            Unit unit2 = Unit.INSTANCE;
                            mutex2.unlock(null);
                            return unit2;
                        }
                        Pair pair = TuplesKt.to("X-Crashlytics-Installation-ID", str);
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String format = String.format("%s/%s", Arrays.copyOf(new Object[]{Build.MANUFACTURER, Build.MODEL}, 2));
                        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
                        Pair pair2 = TuplesKt.to("X-Crashlytics-Device-Model", remoteSettings.removeForwardSlashesIn(format));
                        String INCREMENTAL = Build.VERSION.INCREMENTAL;
                        Intrinsics.checkNotNullExpressionValue(INCREMENTAL, "INCREMENTAL");
                        Pair pair3 = TuplesKt.to("X-Crashlytics-OS-Build-Version", remoteSettings.removeForwardSlashesIn(INCREMENTAL));
                        String RELEASE = Build.VERSION.RELEASE;
                        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
                        Map mapOf = MapsKt.mapOf(pair, pair2, pair3, TuplesKt.to("X-Crashlytics-OS-Display-Version", remoteSettings.removeForwardSlashesIn(RELEASE)), TuplesKt.to("X-Crashlytics-API-Client-Version", remoteSettings.appInfo.getSessionSdkVersion()));
                        Log.d("SessionConfigFetcher", "Fetching settings from server.");
                        CrashlyticsSettingsFetcher crashlyticsSettingsFetcher = remoteSettings.configsFetcher;
                        RemoteSettings$updateSettings$2$1 remoteSettings$updateSettings$2$1 = new RemoteSettings$updateSettings$2$1(remoteSettings, null);
                        RemoteSettings$updateSettings$2$2 remoteSettings$updateSettings$2$2 = new RemoteSettings$updateSettings$2$2(null);
                        remoteSettings$updateSettings$1.L$0 = mutex2;
                        remoteSettings$updateSettings$1.L$1 = null;
                        remoteSettings$updateSettings$1.label = 3;
                        if (crashlyticsSettingsFetcher.doConfigFetch(mapOf, remoteSettings$updateSettings$2$1, remoteSettings$updateSettings$2$2, remoteSettings$updateSettings$1) != coroutine_suspended) {
                            mutex = mutex2;
                            Unit unit3 = Unit.INSTANCE;
                            mutex.unlock(null);
                            return Unit.INSTANCE;
                        }
                        return coroutine_suspended;
                    }
                    mutex2 = (Mutex) remoteSettings$updateSettings$1.L$1;
                    remoteSettings = (RemoteSettings) remoteSettings$updateSettings$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    if (remoteSettings.settingsCache.hasCacheExpired$com_google_firebase_firebase_sessions()) {
                        Log.d("SessionConfigFetcher", "Remote settings cache not expired. Using cached values.");
                        Unit unit4 = Unit.INSTANCE;
                        mutex2.unlock(null);
                        return unit4;
                    }
                    Task id = remoteSettings.firebaseInstallationsApi.getId();
                    Intrinsics.checkNotNullExpressionValue(id, "firebaseInstallationsApi.id");
                    remoteSettings$updateSettings$1.L$0 = remoteSettings;
                    remoteSettings$updateSettings$1.L$1 = mutex2;
                    remoteSettings$updateSettings$1.label = 2;
                    obj = TasksKt.await(id, remoteSettings$updateSettings$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str = (String) obj;
                    if (str != null) {
                    }
                }
            }
            if (r8 != 0) {
            }
            if (remoteSettings.settingsCache.hasCacheExpired$com_google_firebase_firebase_sessions()) {
            }
        } catch (Throwable th2) {
            th = th2;
            mutex = r8;
        }
        remoteSettings$updateSettings$1 = new RemoteSettings$updateSettings$1(this, continuation);
        Object obj2 = remoteSettings$updateSettings$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r8 = remoteSettings$updateSettings$1.label;
    }

    private final String removeForwardSlashesIn(String str) {
        return new Regex("/").replace(str, "");
    }

    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
