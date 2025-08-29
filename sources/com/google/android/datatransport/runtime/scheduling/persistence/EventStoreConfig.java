package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.scheduling.persistence.AutoValue_EventStoreConfig;
import org.telegram.messenger.NotificationCenter;

/* loaded from: classes.dex */
abstract class EventStoreConfig {
    static final EventStoreConfig DEFAULT = builder().setMaxStorageSizeInBytes(10485760).setLoadBatchSize(NotificationCenter.userIsPremiumBlockedUpadted).setCriticalSectionEnterTimeoutMs(10000).setEventCleanUpAge(604800000).setMaxBlobByteSizePerRow(81920).build();

    abstract int getCriticalSectionEnterTimeoutMs();

    abstract long getEventCleanUpAge();

    abstract int getLoadBatchSize();

    abstract int getMaxBlobByteSizePerRow();

    abstract long getMaxStorageSizeInBytes();

    EventStoreConfig() {
    }

    static Builder builder() {
        return new AutoValue_EventStoreConfig.Builder();
    }

    static abstract class Builder {
        abstract EventStoreConfig build();

        abstract Builder setCriticalSectionEnterTimeoutMs(int i);

        abstract Builder setEventCleanUpAge(long j);

        abstract Builder setLoadBatchSize(int i);

        abstract Builder setMaxBlobByteSizePerRow(int i);

        abstract Builder setMaxStorageSizeInBytes(long j);

        Builder() {
        }
    }
}
