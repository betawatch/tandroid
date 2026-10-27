package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class FileLoaderPriorityQueue {
    public static final int PRIORITY_VALUE_LOW = 0;
    public static final int PRIORITY_VALUE_MAX = 1048576;
    public static final int PRIORITY_VALUE_NORMAL = 65536;
    public static final int TYPE_LARGE = 1;
    public static final int TYPE_SMALL = 0;
    Runnable checkOperationsRunnable;
    private final Runnable checkVisibleStoryRunnable;
    int currentAccount;
    String name;
    int type;
    final DispatchQueue2 workerQueue;
    public ArrayList<FileLoadOperation> allOperations = new ArrayList<>();
    public ArrayList<FileLoadOperation> tmpListOperations = new ArrayList<>();
    boolean checkOperationsScheduled = false;

    public FileLoaderPriorityQueue(int i10, String str, int i11, DispatchQueue2 dispatchQueue2) {
        final int i12 = 0;
        this.checkVisibleStoryRunnable = new Runnable(this) { // from class: org.telegram.messenger.k3
            public final /* synthetic */ FileLoaderPriorityQueue b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.b.lambda$new$0();
                        break;
                    default:
                        this.b.lambda$new$1();
                        break;
                }
            }
        };
        final int i13 = 1;
        this.checkOperationsRunnable = new Runnable(this) { // from class: org.telegram.messenger.k3
            public final /* synthetic */ FileLoaderPriorityQueue b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        this.b.lambda$new$0();
                        break;
                    default:
                        this.b.lambda$new$1();
                        break;
                }
            }
        };
        this.currentAccount = i10;
        this.name = str;
        this.type = i11;
        this.workerQueue = dispatchQueue2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e1 A[LOOP:1: B:65:0x00d9->B:67:0x00e1, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void checkLoadingOperationInternal() {
        FileLoadOperation fileLoadOperation;
        int i10;
        int i11 = this.type == 1 ? MessagesController.getInstance(this.currentAccount).largeQueueMaxActiveOperations : MessagesController.getInstance(this.currentAccount).smallQueueMaxActiveOperations;
        this.tmpListOperations.clear();
        if (this.type == 1 && !this.allOperations.isEmpty()) {
            fileLoadOperation = this.allOperations.get(0);
            if (fileLoadOperation.isStory && fileLoadOperation.getPriority() >= 1048576 && !fileLoadOperation.preFinished && !fileLoadOperation.hasStoryStartData()) {
                this.workerQueue.cancelRunnable(this.checkVisibleStoryRunnable);
                this.workerQueue.postRunnable(this.checkVisibleStoryRunnable, 250L);
                i10 = 0;
                boolean z10 = false;
                int i12 = 0;
                while (i10 < this.allOperations.size()) {
                    FileLoadOperation fileLoadOperation2 = i10 > 0 ? this.allOperations.get(i10 - 1) : null;
                    FileLoadOperation fileLoadOperation3 = this.allOperations.get(i10);
                    if (fileLoadOperation == null || fileLoadOperation3 == fileLoadOperation || (fileLoadOperation3.parentObject == fileLoadOperation.parentObject && DownloadSpeedEstimator.isFast())) {
                        if (i10 > 0 && !z10) {
                            if (this.type == 1 && fileLoadOperation2 != null && fileLoadOperation2.isStory && fileLoadOperation2.getPriority() >= 1048576 && fileLoadOperation3.getPriority() <= 0) {
                                z10 = true;
                            }
                            if (i12 > 0 && fileLoadOperation3.getPriority() == 0) {
                                z10 = true;
                            }
                        }
                        if (fileLoadOperation3.preFinished) {
                            i11++;
                        } else {
                            if (!z10 && i10 < i11) {
                                this.tmpListOperations.add(fileLoadOperation3);
                            } else if (fileLoadOperation3.wasStarted()) {
                                fileLoadOperation3.pause();
                            }
                            i12 = fileLoadOperation3.getPriority();
                        }
                    } else if (fileLoadOperation3.wasStarted()) {
                        fileLoadOperation3.pause();
                    }
                    i10++;
                }
                for (int i13 = 0; i13 < this.tmpListOperations.size(); i13++) {
                    this.tmpListOperations.get(i13).start();
                }
            }
        }
        fileLoadOperation = null;
        i10 = 0;
        boolean z102 = false;
        int i122 = 0;
        while (i10 < this.allOperations.size()) {
        }
        while (i13 < this.tmpListOperations.size()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1() {
        checkLoadingOperationInternal();
        this.checkOperationsScheduled = false;
    }

    public void add(FileLoadOperation fileLoadOperation) {
        if (fileLoadOperation == null) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (i11 < this.allOperations.size()) {
            if (this.allOperations.get(i11) == fileLoadOperation) {
                this.allOperations.remove(i11);
                i11--;
            }
            i11++;
        }
        while (true) {
            if (i10 >= this.allOperations.size()) {
                i10 = -1;
                break;
            } else if (fileLoadOperation.getPriority() > this.allOperations.get(i10).getPriority()) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 >= 0) {
            this.allOperations.add(i10, fileLoadOperation);
        } else {
            this.allOperations.add(fileLoadOperation);
        }
    }

    public void cancel(FileLoadOperation fileLoadOperation) {
        if (fileLoadOperation != null && this.allOperations.remove(fileLoadOperation)) {
            fileLoadOperation.cancel();
        }
    }

    /* renamed from: checkLoadingOperations, reason: merged with bridge method [inline-methods] */
    public void lambda$new$0() {
        checkLoadingOperations(false);
    }

    public int getCount() {
        return this.allOperations.size();
    }

    public int getPosition(FileLoadOperation fileLoadOperation) {
        return this.allOperations.indexOf(fileLoadOperation);
    }

    public boolean remove(FileLoadOperation fileLoadOperation) {
        if (fileLoadOperation == null) {
            return false;
        }
        return this.allOperations.remove(fileLoadOperation);
    }

    public void checkLoadingOperations(boolean z10) {
        if (z10) {
            this.workerQueue.cancelRunnable(this.checkOperationsRunnable);
            this.checkOperationsRunnable.run();
        } else {
            if (this.checkOperationsScheduled) {
                return;
            }
            this.checkOperationsScheduled = true;
            this.workerQueue.cancelRunnable(this.checkOperationsRunnable);
            this.workerQueue.postRunnable(this.checkOperationsRunnable, 20L);
        }
    }
}
