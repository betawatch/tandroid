package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class bi extends cu0 {
    public final /* synthetic */ sn a;

    public bi(sn snVar) {
        this.a = snVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0076 A[LOOP:0: B:10:0x002a->B:17:0x0076, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b A[SYNTHETIC] */
    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final mu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        yj yjVar;
        ImageReceiver imageReceiver;
        if (i10 >= 0) {
            sn snVar = this.a;
            if (i10 < snVar.Ua.size() && (yjVar = snVar.U1) != null && yjVar.getListView() != null) {
                int childCount = snVar.U1.getListView().getChildCount();
                Object obj = snVar.Ua.get(i10);
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = snVar.U1.getListView().getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.e2) {
                        org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) childAt;
                        if (e2Var.getResult() == obj) {
                            imageReceiver = e2Var.getPhotoImage();
                            if (imageReceiver == null) {
                                int[] iArr = new int[2];
                                childAt.getLocationInWindow(iArr);
                                mu0 mu0Var = new mu0();
                                mu0Var.b = iArr[0];
                                mu0Var.c = iArr[1];
                                mu0Var.d = snVar.U1.getListView();
                                mu0Var.a = imageReceiver;
                                mu0Var.e = imageReceiver.getBitmapSafe();
                                mu0Var.h = imageReceiver.getRoundRadius(true);
                                return mu0Var;
                            }
                        }
                    }
                    imageReceiver = null;
                    if (imageReceiver == null) {
                    }
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            sn snVar = this.a;
            if (i10 >= snVar.Ua.size()) {
                return;
            }
            snVar.hb((TLRPC.BotInlineResult) snVar.Ua.get(i10), z10, i11, 0L);
        }
    }
}
