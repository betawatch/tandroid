package org.telegram.messenger;

import android.os.SystemClock;
import android.util.SparseIntArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class DispatchQueuePoolBackground {
    public static final String THREAD_PREFIX = "DispatchQueuePoolThreadSafety_";
    private static DispatchQueuePoolBackground backgroundQueue;
    static ArrayList<Runnable> updateTaskCollection;
    private boolean cleanupScheduled;
    private int createdCount;
    private int maxCount;
    private int totalTasksCount;
    private static final ArrayList<ArrayList<Runnable>> freeCollections = new ArrayList<>();
    private static final Runnable finishCollectUpdateRunnable = new Runnable() { // from class: org.telegram.messenger.DispatchQueuePoolBackground.2
        @Override // java.lang.Runnable
        public void run() {
            DispatchQueuePoolBackground.finishCollectUpdateRunnables();
        }
    };
    private ArrayList<DispatchQueue> queues = new ArrayList<>(10);
    private SparseIntArray busyQueuesMap = new SparseIntArray();
    private ArrayList<DispatchQueue> busyQueues = new ArrayList<>(10);
    private Runnable cleanupRunnable = new Runnable() { // from class: org.telegram.messenger.DispatchQueuePoolBackground.1
        @Override // java.lang.Runnable
        public void run() {
            if (!DispatchQueuePoolBackground.this.queues.isEmpty()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                int i10 = 0;
                while (i10 < DispatchQueuePoolBackground.this.queues.size()) {
                    DispatchQueue dispatchQueue = (DispatchQueue) DispatchQueuePoolBackground.this.queues.get(i10);
                    if (dispatchQueue.getLastTaskTime() < elapsedRealtime - 30000) {
                        dispatchQueue.recycle();
                        DispatchQueuePoolBackground.this.queues.remove(i10);
                        DispatchQueuePoolBackground.access$110(DispatchQueuePoolBackground.this);
                        i10--;
                    }
                    i10++;
                }
            }
            if (DispatchQueuePoolBackground.this.queues.isEmpty() && DispatchQueuePoolBackground.this.busyQueues.isEmpty()) {
                DispatchQueuePoolBackground.this.cleanupScheduled = false;
            } else {
                Utilities.globalQueue.postRunnable(this, 30000L);
                DispatchQueuePoolBackground.this.cleanupScheduled = true;
            }
        }
    };
    private int guid = Utilities.random.nextInt();

    private DispatchQueuePoolBackground(int i10) {
        this.maxCount = i10;
    }

    public static /* synthetic */ int access$110(DispatchQueuePoolBackground dispatchQueuePoolBackground) {
        int i10 = dispatchQueuePoolBackground.createdCount;
        dispatchQueuePoolBackground.createdCount = i10 - 1;
        return i10;
    }

    private void execute(ArrayList<Runnable> arrayList) {
        DispatchQueue remove;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Runnable runnable = arrayList.get(i10);
            if (runnable != null) {
                if (!this.busyQueues.isEmpty() && (this.totalTasksCount / 2 <= this.busyQueues.size() || (this.queues.isEmpty() && this.createdCount >= this.maxCount))) {
                    remove = this.busyQueues.remove(0);
                } else if (this.queues.isEmpty()) {
                    remove = new DispatchQueue(THREAD_PREFIX + this.guid + "_" + Utilities.random.nextInt());
                    remove.setPriority(10);
                    this.createdCount = this.createdCount + 1;
                } else {
                    remove = this.queues.remove(0);
                }
                if (!this.cleanupScheduled) {
                    Utilities.globalQueue.postRunnable(this.cleanupRunnable, 30000L);
                    this.cleanupScheduled = true;
                }
                this.totalTasksCount++;
                this.busyQueues.add(remove);
                this.busyQueuesMap.put(remove.index, this.busyQueuesMap.get(remove.index, 0) + 1);
                if (mg.g0.b) {
                    remove.setPriority(1);
                } else if (remove.getPriority() != 10) {
                    remove.setPriority(10);
                }
                remove.postRunnable(new g0(this, runnable, remove, 17));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void finishCollectUpdateRunnables() {
        ArrayList<Runnable> arrayList = updateTaskCollection;
        if (arrayList == null || arrayList.isEmpty()) {
            updateTaskCollection = null;
            return;
        }
        ArrayList<Runnable> arrayList2 = updateTaskCollection;
        updateTaskCollection = null;
        if (backgroundQueue == null) {
            backgroundQueue = new DispatchQueuePoolBackground(Math.max(1, Runtime.getRuntime().availableProcessors()));
        }
        Utilities.globalQueue.postRunnable(new e(arrayList2, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$execute$0(DispatchQueue dispatchQueue) {
        this.totalTasksCount--;
        int i10 = this.busyQueuesMap.get(dispatchQueue.index) - 1;
        if (i10 != 0) {
            this.busyQueuesMap.put(dispatchQueue.index, i10);
            return;
        }
        this.busyQueuesMap.delete(dispatchQueue.index);
        this.busyQueues.remove(dispatchQueue);
        this.queues.add(dispatchQueue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$execute$1(Runnable runnable, DispatchQueue dispatchQueue) {
        runnable.run();
        Utilities.globalQueue.postRunnable(new e3(28, this, dispatchQueue));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$finishCollectUpdateRunnables$2(ArrayList arrayList) {
        freeCollections.add(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$finishCollectUpdateRunnables$3(ArrayList arrayList) {
        backgroundQueue.execute((ArrayList<Runnable>) arrayList);
        arrayList.clear();
        AndroidUtilities.runOnUIThread(new e(arrayList, 3));
    }

    public static void execute(Runnable runnable) {
        execute(runnable, false);
    }

    public static void execute(Runnable runnable, boolean z4) {
        if (Thread.currentThread() != ApplicationLoader.applicationHandler.getLooper().getThread()) {
            if (BuildVars.DEBUG_VERSION) {
                FileLog.e(new RuntimeException("wrong thread"));
                return;
            }
            return;
        }
        if (updateTaskCollection == null) {
            ArrayList<ArrayList<Runnable>> arrayList = freeCollections;
            if (!arrayList.isEmpty()) {
                updateTaskCollection = (ArrayList) e2.c.g(1, arrayList);
            } else {
                updateTaskCollection = new ArrayList<>(100);
            }
            if (!z4) {
                AndroidUtilities.runOnUIThread(finishCollectUpdateRunnable);
            }
        }
        updateTaskCollection.add(runnable);
        if (z4) {
            Runnable runnable2 = finishCollectUpdateRunnable;
            AndroidUtilities.cancelRunOnUIThread(runnable2);
            runnable2.run();
        }
    }
}
