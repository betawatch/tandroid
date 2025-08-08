package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import androidx.appcompat.app.WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigMetadataClient;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class ConfigFetchHandler {
    private final Provider analyticsConnector;
    private final Clock clock;
    private final Map customHttpHeaders;
    private final Executor executor;
    private final ConfigCacheClient fetchedConfigsCache;
    private final FirebaseInstallationsApi firebaseInstallations;
    private final ConfigFetchHttpClient frcBackendApiClient;
    private final ConfigMetadataClient frcMetadata;
    private final Random randomGenerator;
    public static final long DEFAULT_MINIMUM_FETCH_INTERVAL_IN_SECONDS = TimeUnit.HOURS.toSeconds(12);
    static final int[] BACKOFF_TIME_DURATIONS_IN_MINUTES = {2, 4, 8, 16, 32, 64, 128, 256};

    private boolean isThrottleableServerError(int i) {
        return i == 429 || i == 502 || i == 503 || i == 504;
    }

    public ConfigFetchHandler(FirebaseInstallationsApi firebaseInstallationsApi, Provider provider, Executor executor, Clock clock, Random random, ConfigCacheClient configCacheClient, ConfigFetchHttpClient configFetchHttpClient, ConfigMetadataClient configMetadataClient, Map map) {
        this.firebaseInstallations = firebaseInstallationsApi;
        this.analyticsConnector = provider;
        this.executor = executor;
        this.clock = clock;
        this.randomGenerator = random;
        this.fetchedConfigsCache = configCacheClient;
        this.frcBackendApiClient = configFetchHttpClient;
        this.frcMetadata = configMetadataClient;
        this.customHttpHeaders = map;
    }

    public Task fetch(final long j) {
        final HashMap hashMap = new HashMap(this.customHttpHeaders);
        hashMap.put("X-Firebase-RC-Fetch-Type", FetchType.BASE.getValue() + "/1");
        return this.fetchedConfigsCache.get().continueWithTask(this.executor, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.ConfigFetchHandler$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task lambda$fetch$0;
                lambda$fetch$0 = ConfigFetchHandler.this.lambda$fetch$0(j, hashMap, task);
                return lambda$fetch$0;
            }
        });
    }

    public Task fetchNowWithTypeAndAttemptNumber(FetchType fetchType, int i) {
        final HashMap hashMap = new HashMap(this.customHttpHeaders);
        hashMap.put("X-Firebase-RC-Fetch-Type", fetchType.getValue() + "/" + i);
        return this.fetchedConfigsCache.get().continueWithTask(this.executor, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.ConfigFetchHandler$$ExternalSyntheticLambda3
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task lambda$fetchNowWithTypeAndAttemptNumber$1;
                lambda$fetchNowWithTypeAndAttemptNumber$1 = ConfigFetchHandler.this.lambda$fetchNowWithTypeAndAttemptNumber$1(hashMap, task);
                return lambda$fetchNowWithTypeAndAttemptNumber$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$fetchNowWithTypeAndAttemptNumber$1(Map map, Task task) {
        return lambda$fetch$0(task, 0L, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fetchIfCacheExpiredAndNotThrottled, reason: merged with bridge method [inline-methods] */
    public Task lambda$fetch$0(Task task, long j, final Map map) {
        Task continueWithTask;
        final Date date = new Date(this.clock.currentTimeMillis());
        if (task.isSuccessful() && areCachedFetchConfigsValid(j, date)) {
            return Tasks.forResult(FetchResponse.forLocalStorageUsed(date));
        }
        Date backoffEndTimeInMillis = getBackoffEndTimeInMillis(date);
        if (backoffEndTimeInMillis != null) {
            continueWithTask = Tasks.forException(new FirebaseRemoteConfigFetchThrottledException(createThrottledMessage(backoffEndTimeInMillis.getTime() - date.getTime()), backoffEndTimeInMillis.getTime()));
        } else {
            final Task id = this.firebaseInstallations.getId();
            final Task token = this.firebaseInstallations.getToken(false);
            continueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{id, token}).continueWithTask(this.executor, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.ConfigFetchHandler$$ExternalSyntheticLambda1
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task2) {
                    Task lambda$fetchIfCacheExpiredAndNotThrottled$2;
                    lambda$fetchIfCacheExpiredAndNotThrottled$2 = ConfigFetchHandler.this.lambda$fetchIfCacheExpiredAndNotThrottled$2(id, token, date, map, task2);
                    return lambda$fetchIfCacheExpiredAndNotThrottled$2;
                }
            });
        }
        return continueWithTask.continueWithTask(this.executor, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.ConfigFetchHandler$$ExternalSyntheticLambda2
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                Task lambda$fetchIfCacheExpiredAndNotThrottled$3;
                lambda$fetchIfCacheExpiredAndNotThrottled$3 = ConfigFetchHandler.this.lambda$fetchIfCacheExpiredAndNotThrottled$3(date, task2);
                return lambda$fetchIfCacheExpiredAndNotThrottled$3;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$fetchIfCacheExpiredAndNotThrottled$2(Task task, Task task2, Date date, Map map, Task task3) {
        if (!task.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", task.getException()));
        }
        if (!task2.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", task2.getException()));
        }
        return fetchFromBackendAndCacheResponse((String) task.getResult(), ((InstallationTokenResult) task2.getResult()).getToken(), date, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$fetchIfCacheExpiredAndNotThrottled$3(Date date, Task task) {
        updateLastFetchStatusAndTime(task, date);
        return task;
    }

    private boolean areCachedFetchConfigsValid(long j, Date date) {
        Date lastSuccessfulFetchTime = this.frcMetadata.getLastSuccessfulFetchTime();
        if (lastSuccessfulFetchTime.equals(ConfigMetadataClient.LAST_FETCH_TIME_NO_FETCH_YET)) {
            return false;
        }
        return date.before(new Date(lastSuccessfulFetchTime.getTime() + TimeUnit.SECONDS.toMillis(j)));
    }

    private Date getBackoffEndTimeInMillis(Date date) {
        Date backoffEndTime = this.frcMetadata.getBackoffMetadata().getBackoffEndTime();
        if (date.before(backoffEndTime)) {
            return backoffEndTime;
        }
        return null;
    }

    private String createThrottledMessage(long j) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j)));
    }

    private Task fetchFromBackendAndCacheResponse(String str, String str2, Date date, Map map) {
        try {
            final FetchResponse fetchFromBackend = fetchFromBackend(str, str2, date, map);
            if (fetchFromBackend.getStatus() != 0) {
                return Tasks.forResult(fetchFromBackend);
            }
            return this.fetchedConfigsCache.put(fetchFromBackend.getFetchedConfigs()).onSuccessTask(this.executor, new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.internal.ConfigFetchHandler$$ExternalSyntheticLambda4
                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final Task then(Object obj) {
                    Task lambda$fetchFromBackendAndCacheResponse$4;
                    lambda$fetchFromBackendAndCacheResponse$4 = ConfigFetchHandler.lambda$fetchFromBackendAndCacheResponse$4(ConfigFetchHandler.FetchResponse.this, (ConfigContainer) obj);
                    return lambda$fetchFromBackendAndCacheResponse$4;
                }
            });
        } catch (FirebaseRemoteConfigException e) {
            return Tasks.forException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$fetchFromBackendAndCacheResponse$4(FetchResponse fetchResponse, ConfigContainer configContainer) {
        return Tasks.forResult(fetchResponse);
    }

    private FetchResponse fetchFromBackend(String str, String str2, Date date, Map map) {
        try {
            FetchResponse fetch = this.frcBackendApiClient.fetch(this.frcBackendApiClient.createHttpURLConnection(), str, str2, getUserProperties(), this.frcMetadata.getLastFetchETag(), map, getFirstOpenTime(), date);
            if (fetch.getFetchedConfigs() != null) {
                this.frcMetadata.setLastTemplateVersion(fetch.getFetchedConfigs().getTemplateVersionNumber());
            }
            if (fetch.getLastFetchETag() != null) {
                this.frcMetadata.setLastFetchETag(fetch.getLastFetchETag());
            }
            this.frcMetadata.resetBackoff();
            return fetch;
        } catch (FirebaseRemoteConfigServerException e) {
            ConfigMetadataClient.BackoffMetadata updateAndReturnBackoffMetadata = updateAndReturnBackoffMetadata(e.getHttpStatusCode(), date);
            if (shouldThrottle(updateAndReturnBackoffMetadata, e.getHttpStatusCode())) {
                throw new FirebaseRemoteConfigFetchThrottledException(updateAndReturnBackoffMetadata.getBackoffEndTime().getTime());
            }
            throw createExceptionWithGenericMessage(e);
        }
    }

    private FirebaseRemoteConfigServerException createExceptionWithGenericMessage(FirebaseRemoteConfigServerException firebaseRemoteConfigServerException) {
        String str;
        int httpStatusCode = firebaseRemoteConfigServerException.getHttpStatusCode();
        if (httpStatusCode == 401) {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        } else if (httpStatusCode == 403) {
            str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
        } else {
            if (httpStatusCode == 429) {
                throw new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
            }
            if (httpStatusCode == 500) {
                str = "There was an internal server error.";
            } else {
                switch (httpStatusCode) {
                    case 502:
                    case 503:
                    case 504:
                        str = "The server is unavailable. Please try again later.";
                        break;
                    default:
                        str = "The server returned an unexpected error.";
                        break;
                }
            }
        }
        return new FirebaseRemoteConfigServerException(firebaseRemoteConfigServerException.getHttpStatusCode(), "Fetch failed: " + str, firebaseRemoteConfigServerException);
    }

    private ConfigMetadataClient.BackoffMetadata updateAndReturnBackoffMetadata(int i, Date date) {
        if (isThrottleableServerError(i)) {
            updateBackoffMetadataWithLastFailedFetchTime(date);
        }
        return this.frcMetadata.getBackoffMetadata();
    }

    private void updateBackoffMetadataWithLastFailedFetchTime(Date date) {
        int numFailedFetches = this.frcMetadata.getBackoffMetadata().getNumFailedFetches() + 1;
        this.frcMetadata.setBackoffMetadata(numFailedFetches, new Date(date.getTime() + getRandomizedBackoffDurationInMillis(numFailedFetches)));
    }

    private long getRandomizedBackoffDurationInMillis(int i) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = BACKOFF_TIME_DURATIONS_IN_MINUTES;
        return (timeUnit.toMillis(iArr[Math.min(i, iArr.length) - 1]) / 2) + this.randomGenerator.nextInt((int) r0);
    }

    private boolean shouldThrottle(ConfigMetadataClient.BackoffMetadata backoffMetadata, int i) {
        return backoffMetadata.getNumFailedFetches() > 1 || i == 429;
    }

    private void updateLastFetchStatusAndTime(Task task, Date date) {
        if (task.isSuccessful()) {
            this.frcMetadata.updateLastFetchAsSuccessfulAt(date);
            return;
        }
        Exception exception = task.getException();
        if (exception == null) {
            return;
        }
        if (exception instanceof FirebaseRemoteConfigFetchThrottledException) {
            this.frcMetadata.updateLastFetchAsThrottled();
        } else {
            this.frcMetadata.updateLastFetchAsFailed();
        }
    }

    private Map getUserProperties() {
        HashMap hashMap = new HashMap();
        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(this.analyticsConnector.get());
        return hashMap;
    }

    private Long getFirstOpenTime() {
        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(this.analyticsConnector.get());
        return null;
    }

    public long getTemplateVersionNumber() {
        return this.frcMetadata.getLastTemplateVersion();
    }

    public static class FetchResponse {
        private final Date fetchTime;
        private final ConfigContainer fetchedConfigs;
        private final String lastFetchETag;
        private final int status;

        private FetchResponse(Date date, int i, ConfigContainer configContainer, String str) {
            this.fetchTime = date;
            this.status = i;
            this.fetchedConfigs = configContainer;
            this.lastFetchETag = str;
        }

        public static FetchResponse forBackendUpdatesFetched(ConfigContainer configContainer, String str) {
            return new FetchResponse(configContainer.getFetchTime(), 0, configContainer, str);
        }

        public static FetchResponse forBackendHasNoUpdates(Date date, ConfigContainer configContainer) {
            return new FetchResponse(date, 1, configContainer, null);
        }

        public static FetchResponse forLocalStorageUsed(Date date) {
            return new FetchResponse(date, 2, null, null);
        }

        String getLastFetchETag() {
            return this.lastFetchETag;
        }

        int getStatus() {
            return this.status;
        }

        public ConfigContainer getFetchedConfigs() {
            return this.fetchedConfigs;
        }
    }

    public enum FetchType {
        BASE("BASE"),
        REALTIME("REALTIME");

        private final String value;

        FetchType(String str) {
            this.value = str;
        }

        String getValue() {
            return this.value;
        }
    }
}
