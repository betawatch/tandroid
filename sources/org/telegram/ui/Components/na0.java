package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class na0 extends org.telegram.ui.au0 {
    public final /* synthetic */ ra0 a;

    public na0(ra0 ra0Var) {
        this.a = ra0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066 A[LOOP:0: B:6:0x001e->B:13:0x0066, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d A[SYNTHETIC] */
    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        ImageReceiver imageReceiver;
        if (i10 >= 0) {
            ra0 ra0Var = this.a;
            if (i10 < ra0Var.M.size()) {
                int childCount = ra0Var.getListView().getChildCount();
                Object obj = ra0Var.M.get(i10);
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = ra0Var.getListView().getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.e2) {
                        org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) childAt;
                        if (e2Var.getResult() == obj) {
                            imageReceiver = e2Var.getPhotoImage();
                            if (imageReceiver == null) {
                                int[] iArr = new int[2];
                                childAt.getLocationInWindow(iArr);
                                org.telegram.ui.lu0 lu0Var = new org.telegram.ui.lu0();
                                lu0Var.b = iArr[0];
                                lu0Var.c = iArr[1];
                                lu0Var.d = ra0Var.getListView();
                                lu0Var.a = imageReceiver;
                                lu0Var.e = imageReceiver.getBitmapSafe();
                                lu0Var.h = imageReceiver.getRoundRadius(true);
                                return lu0Var;
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

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        if (i10 >= 0) {
            ra0 ra0Var = this.a;
            if (i10 >= ra0Var.M.size()) {
                return;
            }
            ra0Var.x.l((TLRPC.BotInlineResult) ra0Var.M.get(i10), z4, i11);
        }
    }
}
