package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ g(ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.lambda$recycleBitmaps$0(this.b);
                break;
            case 1:
                AndroidUtilities.lambda$recycleBitmaps$1(this.b);
                break;
            case 2:
                DispatchQueuePoolBackground.lambda$finishCollectUpdateRunnables$3(this.b);
                break;
            case 3:
                DispatchQueuePoolBackground.lambda$finishCollectUpdateRunnables$2(this.b);
                break;
            case 4:
                MessagesStorage.lambda$getWallpapers$80(this.b);
                break;
            default:
                MessagesStorage.lambda$updateWidgets$165(this.b);
                break;
        }
    }
}
