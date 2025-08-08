package com.google.firebase.crashlytics.internal.metadata;

import com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer$$ExternalSyntheticBackportWithForwarding1;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.CrashlyticsBackgroundWorker;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class UserMetadata {
    private final CrashlyticsBackgroundWorker backgroundWorker;
    private final MetaDataStore metaDataStore;
    private String sessionIdentifier;
    private final SerializeableKeysMap customKeys = new SerializeableKeysMap(false);
    private final SerializeableKeysMap internalKeys = new SerializeableKeysMap(true);
    private final RolloutAssignmentList rolloutsState = new RolloutAssignmentList(128);
    private final AtomicMarkableReference userId = new AtomicMarkableReference(null, false);

    public static String readUserId(String str, FileStore fileStore) {
        return new MetaDataStore(fileStore).readUserId(str);
    }

    public static UserMetadata loadFromExistingSession(String str, FileStore fileStore, CrashlyticsBackgroundWorker crashlyticsBackgroundWorker) {
        MetaDataStore metaDataStore = new MetaDataStore(fileStore);
        UserMetadata userMetadata = new UserMetadata(str, fileStore, crashlyticsBackgroundWorker);
        ((KeysMap) userMetadata.customKeys.map.getReference()).setKeys(metaDataStore.readKeyData(str, false));
        ((KeysMap) userMetadata.internalKeys.map.getReference()).setKeys(metaDataStore.readKeyData(str, true));
        userMetadata.userId.set(metaDataStore.readUserId(str), false);
        userMetadata.rolloutsState.updateRolloutAssignmentList(metaDataStore.readRolloutsState(str));
        return userMetadata;
    }

    public UserMetadata(String str, FileStore fileStore, CrashlyticsBackgroundWorker crashlyticsBackgroundWorker) {
        this.sessionIdentifier = str;
        this.metaDataStore = new MetaDataStore(fileStore);
        this.backgroundWorker = crashlyticsBackgroundWorker;
    }

    public void setNewSession(String str) {
        synchronized (this.sessionIdentifier) {
            try {
                this.sessionIdentifier = str;
                Map keys = this.customKeys.getKeys();
                List rolloutAssignmentList = this.rolloutsState.getRolloutAssignmentList();
                if (getUserId() != null) {
                    this.metaDataStore.writeUserData(str, getUserId());
                }
                if (!keys.isEmpty()) {
                    this.metaDataStore.writeKeyData(str, keys);
                }
                if (!rolloutAssignmentList.isEmpty()) {
                    this.metaDataStore.writeRolloutState(str, rolloutAssignmentList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String getUserId() {
        return (String) this.userId.getReference();
    }

    public void setUserId(String str) {
        String sanitizeString = KeysMap.sanitizeString(str, 1024);
        synchronized (this.userId) {
            try {
                if (CommonUtils.nullSafeEquals(sanitizeString, (String) this.userId.getReference())) {
                    return;
                }
                this.userId.set(sanitizeString, true);
                this.backgroundWorker.submit(new Callable() { // from class: com.google.firebase.crashlytics.internal.metadata.UserMetadata$$ExternalSyntheticLambda0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Object lambda$setUserId$0;
                        lambda$setUserId$0 = UserMetadata.this.lambda$setUserId$0();
                        return lambda$setUserId$0;
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$setUserId$0() {
        serializeUserDataIfNeeded();
        return null;
    }

    public Map getCustomKeys() {
        return this.customKeys.getKeys();
    }

    public boolean setCustomKey(String str, String str2) {
        return this.customKeys.setKey(str, str2);
    }

    public Map getInternalKeys() {
        return this.internalKeys.getKeys();
    }

    public boolean setInternalKey(String str, String str2) {
        return this.internalKeys.setKey(str, str2);
    }

    public List getRolloutsState() {
        return this.rolloutsState.getReportRolloutsState();
    }

    public boolean updateRolloutsState(List list) {
        synchronized (this.rolloutsState) {
            try {
                if (!this.rolloutsState.updateRolloutAssignmentList(list)) {
                    return false;
                }
                final List rolloutAssignmentList = this.rolloutsState.getRolloutAssignmentList();
                this.backgroundWorker.submit(new Callable() { // from class: com.google.firebase.crashlytics.internal.metadata.UserMetadata$$ExternalSyntheticLambda1
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Object lambda$updateRolloutsState$1;
                        lambda$updateRolloutsState$1 = UserMetadata.this.lambda$updateRolloutsState$1(rolloutAssignmentList);
                        return lambda$updateRolloutsState$1;
                    }
                });
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$updateRolloutsState$1(List list) {
        this.metaDataStore.writeRolloutState(this.sessionIdentifier, list);
        return null;
    }

    private void serializeUserDataIfNeeded() {
        boolean z;
        String str;
        synchronized (this.userId) {
            try {
                z = false;
                if (this.userId.isMarked()) {
                    str = getUserId();
                    this.userId.set(str, false);
                    z = true;
                } else {
                    str = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            this.metaDataStore.writeUserData(this.sessionIdentifier, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class SerializeableKeysMap {
        private final boolean isInternal;
        final AtomicMarkableReference map;
        private final AtomicReference queuedSerializer = new AtomicReference(null);

        public SerializeableKeysMap(boolean z) {
            this.isInternal = z;
            this.map = new AtomicMarkableReference(new KeysMap(64, z ? 8192 : 1024), false);
        }

        public Map getKeys() {
            return ((KeysMap) this.map.getReference()).getKeys();
        }

        public boolean setKey(String str, String str2) {
            synchronized (this) {
                try {
                    if (!((KeysMap) this.map.getReference()).setKey(str, str2)) {
                        return false;
                    }
                    AtomicMarkableReference atomicMarkableReference = this.map;
                    atomicMarkableReference.set((KeysMap) atomicMarkableReference.getReference(), true);
                    scheduleSerializationTaskIfNeeded();
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private void scheduleSerializationTaskIfNeeded() {
            Callable callable = new Callable() { // from class: com.google.firebase.crashlytics.internal.metadata.UserMetadata$SerializeableKeysMap$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Void lambda$scheduleSerializationTaskIfNeeded$0;
                    lambda$scheduleSerializationTaskIfNeeded$0 = UserMetadata.SerializeableKeysMap.this.lambda$scheduleSerializationTaskIfNeeded$0();
                    return lambda$scheduleSerializationTaskIfNeeded$0;
                }
            };
            if (AsynchronousMediaCodecBufferEnqueuer$$ExternalSyntheticBackportWithForwarding1.m(this.queuedSerializer, null, callable)) {
                UserMetadata.this.backgroundWorker.submit(callable);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Void lambda$scheduleSerializationTaskIfNeeded$0() {
            this.queuedSerializer.set(null);
            serializeIfMarked();
            return null;
        }

        private void serializeIfMarked() {
            Map map;
            synchronized (this) {
                try {
                    if (this.map.isMarked()) {
                        map = ((KeysMap) this.map.getReference()).getKeys();
                        AtomicMarkableReference atomicMarkableReference = this.map;
                        atomicMarkableReference.set((KeysMap) atomicMarkableReference.getReference(), false);
                    } else {
                        map = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (map != null) {
                UserMetadata.this.metaDataStore.writeKeyData(UserMetadata.this.sessionIdentifier, map, this.isInternal);
            }
        }
    }
}
