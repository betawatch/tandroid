package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class pl extends rt0 {
    public final /* synthetic */ qn a;

    public pl(qn qnVar) {
        this.a = qnVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0076 A[LOOP:0: B:10:0x002a->B:17:0x0076, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b A[SYNTHETIC] */
    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final bu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i9, boolean z10, boolean z11) {
        tj tjVar;
        ImageReceiver imageReceiver;
        if (i9 >= 0) {
            qn qnVar = this.a;
            if (i9 < qnVar.Da.size() && (tjVar = qnVar.E1) != null && tjVar.getListView() != null) {
                int childCount = qnVar.E1.getListView().getChildCount();
                Object obj = qnVar.Da.get(i9);
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = qnVar.E1.getListView().getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.e2) {
                        org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) childAt;
                        if (e2Var.getResult() == obj) {
                            imageReceiver = e2Var.getPhotoImage();
                            if (imageReceiver == null) {
                                int[] iArr = new int[2];
                                childAt.getLocationInWindow(iArr);
                                bu0 bu0Var = new bu0();
                                bu0Var.b = iArr[0];
                                bu0Var.c = iArr[1];
                                bu0Var.d = qnVar.E1.getListView();
                                bu0Var.a = imageReceiver;
                                bu0Var.e = imageReceiver.getBitmapSafe();
                                bu0Var.h = imageReceiver.getRoundRadius(true);
                                return bu0Var;
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

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final void o(int i9, VideoEditedInfo videoEditedInfo, boolean z10, int i10, int i11, boolean z11) {
        if (i9 >= 0) {
            qn qnVar = this.a;
            if (i9 >= qnVar.Da.size()) {
                return;
            }
            qnVar.cb((TLRPC.BotInlineResult) qnVar.Da.get(i9), z10, i10, 0L);
        }
    }
}
