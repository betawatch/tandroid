package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.ChatMessageCell;

/* loaded from: classes5.dex */
public final class SlotsDrawable extends RLottieDiceDrawable {
    private Bitmap backgroundBitmapTmp;
    private ReelValue center;
    private final int[] frameCounts;
    private final int[] frameNums;
    private ReelValue left;
    private final RLottieNative[] lottieNatives;
    private boolean playWinAnimation;
    private ReelValue right;
    private final int[] secondFrameCounts;
    private final int[] secondFrameNums;
    private final RLottieNative[] secondLottieNatives;

    private enum ReelValue {
        bar,
        berries,
        lemon,
        seven,
        sevenWin
    }

    public SlotsDrawable(String str, int i, int i2) {
        super(str, i, i2);
        this.lottieNatives = new RLottieNative[5];
        this.frameCounts = new int[5];
        this.frameNums = new int[5];
        this.secondLottieNatives = new RLottieNative[3];
        this.secondFrameCounts = new int[3];
        this.secondFrameNums = new int[3];
    }

    @Override // org.telegram.ui.Components.RLottieDiceDrawable, org.telegram.ui.Components.RLottieDrawable
    protected int loadFrameRunnableImpl() {
        if (this.isRecycled) {
            return 3;
        }
        if (this.nativePtr == null || (this.isDice == 2 && this.secondNativePtr == null)) {
            return 2;
        }
        if (this.backgroundBitmapTmp == null) {
            try {
                this.backgroundBitmapTmp = Bitmap.createBitmap(this.width, this.height, Bitmap.Config.ARGB_8888);
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
        if (this.backgroundBitmap == null) {
            try {
                this.backgroundBitmap = Bitmap.createBitmap(this.width, this.height, Bitmap.Config.ARGB_8888);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        if (this.backgroundBitmap != null && this.backgroundBitmapTmp != null) {
            try {
                int i = -1;
                if (this.isDice == 1) {
                    int i2 = 0;
                    while (true) {
                        RLottieNative[] rLottieNativeArr = this.lottieNatives;
                        if (i2 >= rLottieNativeArr.length) {
                            break;
                        }
                        i = rLottieNativeArr[i2].getFrame(this.frameNums[i2], this.backgroundBitmapTmp, i2 == 0);
                        if (i2 != 0) {
                            int[] iArr = this.frameNums;
                            int i3 = iArr[i2] + 1;
                            if (i3 < this.frameCounts[i2]) {
                                iArr[i2] = i3;
                            } else if (i2 != 4) {
                                iArr[i2] = 0;
                                this.nextFrameIsLast = false;
                                if (this.secondNativePtr != null) {
                                    this.isDice = 2;
                                }
                            }
                        }
                        i2++;
                    }
                } else {
                    if (this.setLastFrame) {
                        int i4 = 0;
                        while (true) {
                            int[] iArr2 = this.secondFrameNums;
                            if (i4 >= iArr2.length) {
                                break;
                            }
                            iArr2[i4] = this.secondFrameCounts[i4] - 1;
                            i4++;
                        }
                    }
                    if (this.playWinAnimation) {
                        int[] iArr3 = this.frameNums;
                        int i5 = iArr3[0] + 1;
                        if (i5 < this.frameCounts[0]) {
                            iArr3[0] = i5;
                        } else {
                            iArr3[0] = -1;
                        }
                    }
                    this.lottieNatives[0].getFrame(Math.max(this.frameNums[0], 0), this.backgroundBitmapTmp, true);
                    int i6 = 0;
                    while (true) {
                        RLottieNative[] rLottieNativeArr2 = this.secondLottieNatives;
                        if (i6 >= rLottieNativeArr2.length) {
                            break;
                        }
                        RLottieNative rLottieNative = rLottieNativeArr2[i6];
                        int i7 = this.secondFrameNums[i6];
                        if (i7 < 0) {
                            i7 = this.secondFrameCounts[i6] - 1;
                        }
                        rLottieNative.getFrame(i7, this.backgroundBitmapTmp, false);
                        if (!this.nextFrameIsLast) {
                            int[] iArr4 = this.secondFrameNums;
                            int i8 = iArr4[i6] + 1;
                            if (i8 < this.secondFrameCounts[i6]) {
                                iArr4[i6] = i8;
                            } else {
                                iArr4[i6] = -1;
                            }
                        }
                        i6++;
                    }
                    int frame = this.lottieNatives[4].getFrame(this.frameNums[4], this.backgroundBitmapTmp, false);
                    int[] iArr5 = this.frameNums;
                    int i9 = iArr5[4] + 1;
                    if (i9 < this.frameCounts[4]) {
                        iArr5[4] = i9;
                    }
                    int[] iArr6 = this.secondFrameNums;
                    if (iArr6[0] == -1 && iArr6[1] == -1 && iArr6[2] == -1) {
                        this.nextFrameIsLast = true;
                        this.autoRepeatPlayCount++;
                    }
                    ReelValue reelValue = this.left;
                    ReelValue reelValue2 = this.right;
                    if (reelValue == reelValue2 && reelValue2 == this.center) {
                        if (this.secondFrameNums[0] == this.secondFrameCounts[0] - 100) {
                            this.playWinAnimation = true;
                            if (reelValue == ReelValue.sevenWin) {
                                WeakReference weakReference = this.onFinishCallback;
                                Runnable runnable = weakReference == null ? null : (Runnable) weakReference.get();
                                if (runnable != null) {
                                    AndroidUtilities.runOnUIThread(runnable);
                                }
                            }
                        }
                    } else {
                        this.frameNums[0] = -1;
                    }
                    i = frame;
                }
                if (i < 0) {
                    return 2;
                }
                Utilities.copyBitmaps(this.backgroundBitmapTmp, this.backgroundBitmap);
                this.nextRenderingBitmap = this.backgroundBitmap;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return 1;
    }

    private ReelValue reelValue(int i) {
        if (i == 0) {
            return ReelValue.bar;
        }
        if (i == 1) {
            return ReelValue.berries;
        }
        if (i == 2) {
            return ReelValue.lemon;
        }
        return ReelValue.seven;
    }

    private void init(int i) {
        int i2 = i - 1;
        ReelValue reelValue = reelValue(i2 & 3);
        ReelValue reelValue2 = reelValue((i2 >> 2) & 3);
        ReelValue reelValue3 = reelValue(i2 >> 4);
        ReelValue reelValue4 = ReelValue.seven;
        if (reelValue == reelValue4 && reelValue2 == reelValue4 && reelValue3 == reelValue4) {
            reelValue = ReelValue.sevenWin;
            reelValue3 = reelValue;
            reelValue2 = reelValue3;
        }
        this.left = reelValue;
        this.center = reelValue2;
        this.right = reelValue3;
    }

    public boolean setBaseDice(final ChatMessageCell chatMessageCell, final TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        if (this.nativePtr == null && !this.loadingInBackground) {
            this.loadingInBackground = true;
            final MessageObject messageObject = chatMessageCell.getMessageObject();
            final int i = chatMessageCell.getMessageObject().currentAccount;
            Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.Components.SlotsDrawable$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    SlotsDrawable.this.lambda$setBaseDice$4(tL_messages_stickerSet, i, messageObject, chatMessageCell);
                }
            });
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setBaseDice$4(final TLRPC.TL_messages_stickerSet tL_messages_stickerSet, final int i, final MessageObject messageObject, final ChatMessageCell chatMessageCell) {
        int i2;
        if (this.destroyAfterLoading) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.SlotsDrawable$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    SlotsDrawable.this.lambda$setBaseDice$0();
                }
            });
            return;
        }
        int i3 = 0;
        boolean z = false;
        while (true) {
            RLottieNative[] rLottieNativeArr = this.lottieNatives;
            if (i3 >= rLottieNativeArr.length) {
                break;
            }
            if (rLottieNativeArr[i3] == null) {
                if (i3 == 0) {
                    i2 = 1;
                } else if (i3 == 1) {
                    i2 = 8;
                } else {
                    i2 = 2;
                    if (i3 == 2) {
                        i2 = 14;
                    } else if (i3 == 3) {
                        i2 = 20;
                    }
                }
                if (i2 < tL_messages_stickerSet.documents.size()) {
                    final TLRPC.Document document = tL_messages_stickerSet.documents.get(i2);
                    String readRes = AndroidUtilities.readRes(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true), 0);
                    if (TextUtils.isEmpty(readRes)) {
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.SlotsDrawable$$ExternalSyntheticLambda7
                            @Override // java.lang.Runnable
                            public final void run() {
                                SlotsDrawable.lambda$setBaseDice$1(TLRPC.Document.this, i, messageObject, chatMessageCell, tL_messages_stickerSet);
                            }
                        });
                        z = true;
                    } else {
                        this.lottieNatives[i3] = RLottieNative.createFromRawJson(readRes, "dice", this.metaData, null);
                        this.frameCounts[i3] = this.metaData[0];
                    }
                }
            }
            i3++;
        }
        if (z) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.SlotsDrawable$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    SlotsDrawable.this.lambda$setBaseDice$2();
                }
            });
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.SlotsDrawable$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    SlotsDrawable.this.lambda$setBaseDice$3(i, chatMessageCell);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setBaseDice$0() {
        this.loadingInBackground = false;
        if (this.secondLoadingInBackground || !this.destroyAfterLoading) {
            return;
        }
        recycle(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setBaseDice$1(TLRPC.Document document, int i, MessageObject messageObject, ChatMessageCell chatMessageCell, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        DownloadController.getInstance(i).addLoadingFileObserver(FileLoader.getAttachFileName(document), messageObject, chatMessageCell);
        FileLoader.getInstance(i).loadFile(document, tL_messages_stickerSet, 1, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setBaseDice$2() {
        this.loadingInBackground = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setBaseDice$3(int i, ChatMessageCell chatMessageCell) {
        this.loadingInBackground = false;
        if (!this.secondLoadingInBackground && this.destroyAfterLoading) {
            recycle(true);
            return;
        }
        this.nativePtr = this.lottieNatives[0];
        checkChoreographer();
        DownloadController.getInstance(i).removeLoadingFileObserver(chatMessageCell);
        scheduleNextGetFrame();
        invalidateInternal();
    }

    public boolean setDiceNumber(final ChatMessageCell chatMessageCell, int i, final TLRPC.TL_messages_stickerSet tL_messages_stickerSet, final boolean z) {
        if (this.secondNativePtr == null && !this.secondLoadingInBackground) {
            init(i);
            final MessageObject messageObject = chatMessageCell.getMessageObject();
            final int i2 = chatMessageCell.getMessageObject().currentAccount;
            this.secondLoadingInBackground = true;
            Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.Components.SlotsDrawable$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    SlotsDrawable.this.lambda$setDiceNumber$9(tL_messages_stickerSet, i2, messageObject, chatMessageCell, z);
                }
            });
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$setDiceNumber$9(final TLRPC.TL_messages_stickerSet tL_messages_stickerSet, final int i, final MessageObject messageObject, final ChatMessageCell chatMessageCell, final boolean z) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
        int i2;
        String readRes;
        if (this.destroyAfterLoading) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.SlotsDrawable$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    SlotsDrawable.this.lambda$setDiceNumber$5();
                }
            });
            return;
        }
        int i3 = 0;
        boolean z2 = false;
        while (true) {
            RLottieNative[] rLottieNativeArr = this.secondLottieNatives;
            if (i3 >= rLottieNativeArr.length + 2) {
                break;
            }
            if (i3 <= 2) {
                if (rLottieNativeArr[i3] == null) {
                    if (i3 == 0) {
                        ReelValue reelValue = this.left;
                        if (reelValue == ReelValue.bar) {
                            i2 = 5;
                        } else if (reelValue == ReelValue.berries) {
                            i2 = 6;
                        } else if (reelValue == ReelValue.lemon) {
                            i2 = 7;
                        } else {
                            tL_messages_stickerSet2 = tL_messages_stickerSet;
                            i2 = reelValue == ReelValue.seven ? 4 : 3;
                            final TLRPC.Document document = tL_messages_stickerSet2.documents.get(i2);
                            readRes = AndroidUtilities.readRes(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true), 0);
                            if (TextUtils.isEmpty(readRes)) {
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.SlotsDrawable$$ExternalSyntheticLambda3
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        SlotsDrawable.lambda$setDiceNumber$6(TLRPC.Document.this, i, messageObject, chatMessageCell, tL_messages_stickerSet);
                                    }
                                });
                                z2 = true;
                            } else {
                                RLottieNative createFromRawJson = RLottieNative.createFromRawJson(readRes, "dice", this.metaData, null);
                                if (i3 <= 2) {
                                    this.secondLottieNatives[i3] = createFromRawJson;
                                    this.secondFrameCounts[i3] = this.metaData[0];
                                } else {
                                    this.lottieNatives[i3 == 3 ? (char) 0 : (char) 4] = createFromRawJson;
                                    this.frameCounts[i3 == 3 ? (char) 0 : (char) 4] = this.metaData[0];
                                }
                            }
                        }
                    } else if (i3 == 1) {
                        ReelValue reelValue2 = this.center;
                        if (reelValue2 == ReelValue.bar) {
                            i2 = 11;
                        } else if (reelValue2 == ReelValue.berries) {
                            i2 = 12;
                        } else if (reelValue2 == ReelValue.lemon) {
                            i2 = 13;
                        } else {
                            i2 = reelValue2 == ReelValue.seven ? 10 : 9;
                        }
                    } else {
                        ReelValue reelValue3 = this.right;
                        if (reelValue3 == ReelValue.bar) {
                            i2 = 17;
                        } else if (reelValue3 == ReelValue.berries) {
                            i2 = 18;
                        } else if (reelValue3 == ReelValue.lemon) {
                            i2 = 19;
                        } else {
                            i2 = reelValue3 == ReelValue.seven ? 16 : 15;
                        }
                    }
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                    final TLRPC.Document document2 = tL_messages_stickerSet2.documents.get(i2);
                    readRes = AndroidUtilities.readRes(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document2, true), 0);
                    if (TextUtils.isEmpty(readRes)) {
                    }
                }
            } else if (this.lottieNatives[i3] == null) {
                tL_messages_stickerSet2 = tL_messages_stickerSet;
                i2 = i3 == 3 ? 1 : 2;
                final TLRPC.Document document22 = tL_messages_stickerSet2.documents.get(i2);
                readRes = AndroidUtilities.readRes(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document22, true), 0);
                if (TextUtils.isEmpty(readRes)) {
                }
            }
            i3++;
        }
        if (z2) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.SlotsDrawable$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    SlotsDrawable.this.lambda$setDiceNumber$7();
                }
            });
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.SlotsDrawable$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    SlotsDrawable.this.lambda$setDiceNumber$8(z, i, chatMessageCell);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setDiceNumber$5() {
        this.secondLoadingInBackground = false;
        if (this.loadingInBackground || !this.destroyAfterLoading) {
            return;
        }
        recycle(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setDiceNumber$6(TLRPC.Document document, int i, MessageObject messageObject, ChatMessageCell chatMessageCell, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        DownloadController.getInstance(i).addLoadingFileObserver(FileLoader.getAttachFileName(document), messageObject, chatMessageCell);
        FileLoader.getInstance(i).loadFile(document, tL_messages_stickerSet, 1, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setDiceNumber$7() {
        this.secondLoadingInBackground = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setDiceNumber$8(boolean z, int i, ChatMessageCell chatMessageCell) {
        if (z && this.nextRenderingBitmap == null && this.renderingBitmap == null && this.loadFrameTask == null) {
            this.isDice = 2;
            this.setLastFrame = true;
        }
        this.secondLoadingInBackground = false;
        if (!this.loadingInBackground && this.destroyAfterLoading) {
            recycle(true);
            return;
        }
        this.secondNativePtr = this.secondLottieNatives[0];
        DownloadController.getInstance(i).removeLoadingFileObserver(chatMessageCell);
        scheduleNextGetFrame();
        invalidateInternal();
    }

    @Override // org.telegram.ui.Components.RLottieDiceDrawable, org.telegram.ui.Components.RLottieDrawable
    public void recycle(boolean z) {
        this.isRunning = false;
        this.isRecycled = true;
        checkRunningTasks();
        checkChoreographer();
        if (this.loadingInBackground || this.secondLoadingInBackground) {
            this.destroyAfterLoading = true;
        } else if (this.loadFrameTask == null) {
            recycleInternal(true);
            recycleResources();
        } else {
            this.destroyWhenDone = true;
        }
    }

    @Override // org.telegram.ui.Components.RLottieDiceDrawable, org.telegram.ui.Components.RLottieDrawable
    protected void decodeFrameFinishedInternal() {
        if (this.destroyWhenDone) {
            checkRunningTasks();
            if (this.loadFrameTask == null) {
                recycleInternal(false);
            }
        }
        if (this.nativePtr == null && this.secondNativePtr == null) {
            recycleResources();
            return;
        }
        this.waitingForNextTask = true;
        if (!hasParentView()) {
            stop();
        }
        scheduleNextGetFrame();
    }

    private void recycleInternal(boolean z) {
        int i = 0;
        int i2 = 0;
        while (true) {
            RLottieNative[] rLottieNativeArr = this.lottieNatives;
            if (i2 >= rLottieNativeArr.length) {
                break;
            }
            RLottieNative rLottieNative = rLottieNativeArr[i2];
            if (rLottieNative != null) {
                if (z && rLottieNative == this.nativePtr) {
                    this.nativePtr = null;
                }
                this.lottieNatives[i2].recycle();
                this.lottieNatives[i2] = null;
            }
            i2++;
        }
        while (true) {
            RLottieNative[] rLottieNativeArr2 = this.secondLottieNatives;
            if (i >= rLottieNativeArr2.length) {
                return;
            }
            RLottieNative rLottieNative2 = rLottieNativeArr2[i];
            if (rLottieNative2 != null) {
                if (z && rLottieNative2 == this.secondNativePtr) {
                    this.secondNativePtr = null;
                }
                this.secondLottieNatives[i].recycle();
                this.secondLottieNatives[i] = null;
            }
            i++;
        }
    }
}
