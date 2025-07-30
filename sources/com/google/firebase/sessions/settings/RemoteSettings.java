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
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
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

/* loaded from: classes3.dex */
public final class RemoteSettings implements SettingsProvider {
    private static final Companion Companion = new Companion(null);
    private final ApplicationInfo appInfo;
    private final CoroutineContext backgroundDispatcher;
    private final CrashlyticsSettingsFetcher configsFetcher;
    private final Mutex fetchInProgress;
    private final FirebaseInstallationsApi firebaseInstallationsApi;
    private final SettingsCache settingsCache;

    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

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

    private final String removeForwardSlashesIn(String str) {
        return new Regex("/").replace(str, "");
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public Double getSamplingRate() {
        return this.settingsCache.sessionSamplingRate();
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

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(4:(2:3|(7:5|6|7|(1:(1:(1:(8:12|13|14|15|16|17|18|19)(2:29|30))(4:31|32|33|(3:35|36|37)(2:38|(1:40)(5:41|16|17|18|19))))(1:45))(2:55|(2:61|(1:63)(1:64))(2:59|60))|46|47|(3:49|50|51)(4:52|(1:54)|33|(0)(0))))|46|47|(0)(0))|67|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0055, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0056, code lost:
    
        r2 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ba A[Catch: all -> 0x0055, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0055, blocks: (B:32:0x0051, B:35:0x00ba, B:49:0x0093), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5 A[Catch: all -> 0x015b, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x015b, blocks: (B:33:0x00b6, B:38:0x00c5, B:47:0x008b, B:52:0x009e), top: B:46:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0093 A[Catch: all -> 0x0055, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0055, blocks: (B:32:0x0051, B:35:0x00ba, B:49:0x0093), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009e A[Catch: all -> 0x015b, TRY_ENTER, TryCatch #2 {all -> 0x015b, blocks: (B:33:0x00b6, B:38:0x00c5, B:47:0x008b, B:52:0x009e), top: B:46:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Type inference failed for: r8v0, types: [int] */
    @Override // com.google.firebase.sessions.settings.SettingsProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateSettings(Continuation continuation) {
        RemoteSettings$updateSettings$1 remoteSettings$updateSettings$1;
        Object coroutine_suspended;
        ?? r8;
        Mutex mutex;
        Object obj;
        Mutex mutex2;
        RemoteSettings remoteSettings;
        String str;
        Map mapOf;
        Object obj2;
        try {
            if (continuation instanceof RemoteSettings$updateSettings$1) {
                remoteSettings$updateSettings$1 = (RemoteSettings$updateSettings$1) continuation;
                int i = remoteSettings$updateSettings$1.label;
                if ((i & TLObject.FLAG_31) != 0) {
                    remoteSettings$updateSettings$1.label = i - TLObject.FLAG_31;
                    Object obj3 = remoteSettings$updateSettings$1.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r8 = remoteSettings$updateSettings$1.label;
                    if (r8 != 0) {
                        ResultKt.throwOnFailure(obj3);
                        if (!this.fetchInProgress.isLocked() && !this.settingsCache.hasCacheExpired$com_google_firebase_firebase_sessions()) {
                            return Unit.INSTANCE;
                        }
                        Mutex mutex3 = this.fetchInProgress;
                        remoteSettings$updateSettings$1.L$0 = this;
                        remoteSettings$updateSettings$1.L$1 = mutex3;
                        remoteSettings$updateSettings$1.label = 1;
                        if (mutex3.lock(null, remoteSettings$updateSettings$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex2 = mutex3;
                        remoteSettings = this;
                    } else {
                        if (r8 != 1) {
                            if (r8 != 2) {
                                if (r8 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                mutex = (Mutex) remoteSettings$updateSettings$1.L$0;
                                try {
                                    ResultKt.throwOnFailure(obj3);
                                    obj2 = null;
                                    try {
                                        Unit unit = Unit.INSTANCE;
                                        mutex.unlock(obj2);
                                        return Unit.INSTANCE;
                                    } catch (Throwable th) {
                                        th = th;
                                        obj = null;
                                        mutex.unlock(obj);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    obj = null;
                                    mutex.unlock(obj);
                                    throw th;
                                }
                            }
                            mutex2 = (Mutex) remoteSettings$updateSettings$1.L$1;
                            remoteSettings = (RemoteSettings) remoteSettings$updateSettings$1.L$0;
                            ResultKt.throwOnFailure(obj3);
                            str = (String) obj3;
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
                            mapOf = MapsKt__MapsKt.mapOf(pair, pair2, pair3, TuplesKt.to("X-Crashlytics-OS-Display-Version", remoteSettings.removeForwardSlashesIn(RELEASE)), TuplesKt.to("X-Crashlytics-API-Client-Version", remoteSettings.appInfo.getSessionSdkVersion()));
                            Log.d("SessionConfigFetcher", "Fetching settings from server.");
                            CrashlyticsSettingsFetcher crashlyticsSettingsFetcher = remoteSettings.configsFetcher;
                            obj2 = null;
                            RemoteSettings$updateSettings$2$1 remoteSettings$updateSettings$2$1 = new RemoteSettings$updateSettings$2$1(remoteSettings, null);
                            RemoteSettings$updateSettings$2$2 remoteSettings$updateSettings$2$2 = new RemoteSettings$updateSettings$2$2(null);
                            remoteSettings$updateSettings$1.L$0 = mutex2;
                            remoteSettings$updateSettings$1.L$1 = null;
                            remoteSettings$updateSettings$1.label = 3;
                            if (crashlyticsSettingsFetcher.doConfigFetch(mapOf, remoteSettings$updateSettings$2$1, remoteSettings$updateSettings$2$2, remoteSettings$updateSettings$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            mutex = mutex2;
                            Unit unit3 = Unit.INSTANCE;
                            mutex.unlock(obj2);
                            return Unit.INSTANCE;
                        }
                        mutex2 = (Mutex) remoteSettings$updateSettings$1.L$1;
                        remoteSettings = (RemoteSettings) remoteSettings$updateSettings$1.L$0;
                        ResultKt.throwOnFailure(obj3);
                    }
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
                    obj3 = TasksKt.await(id, remoteSettings$updateSettings$1);
                    if (obj3 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str = (String) obj3;
                    if (str != null) {
                    }
                }
            }
            if (remoteSettings.settingsCache.hasCacheExpired$com_google_firebase_firebase_sessions()) {
            }
        } catch (Throwable th3) {
            th = th3;
            mutex = mutex2;
            obj = null;
            mutex.unlock(obj);
            throw th;
        }
        remoteSettings$updateSettings$1 = new RemoteSettings$updateSettings$1(this, continuation);
        Object obj32 = remoteSettings$updateSettings$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r8 = remoteSettings$updateSettings$1.label;
        if (r8 != 0) {
        }
    }
}
