package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class dm extends tu0 {
    public final /* synthetic */ eo a;

    public dm(eo eoVar) {
        this.a = eoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0076 A[LOOP:0: B:10:0x002a->B:17:0x0076, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b A[SYNTHETIC] */
    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        hk hkVar;
        ImageReceiver imageReceiver;
        if (i10 >= 0) {
            eo eoVar = this.a;
            if (i10 < eoVar.Ha.size() && (hkVar = eoVar.I1) != null && hkVar.getListView() != null) {
                int childCount = eoVar.I1.getListView().getChildCount();
                Object obj = eoVar.Ha.get(i10);
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = eoVar.I1.getListView().getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.e2) {
                        org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) childAt;
                        if (e2Var.getResult() == obj) {
                            imageReceiver = e2Var.getPhotoImage();
                            if (imageReceiver == null) {
                                int[] iArr = new int[2];
                                childAt.getLocationInWindow(iArr);
                                ev0 ev0Var = new ev0();
                                ev0Var.b = iArr[0];
                                ev0Var.c = iArr[1];
                                ev0Var.d = eoVar.I1.getListView();
                                ev0Var.a = imageReceiver;
                                ev0Var.e = imageReceiver.getBitmapSafe();
                                ev0Var.h = imageReceiver.getRoundRadius(true);
                                return ev0Var;
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

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            eo eoVar = this.a;
            if (i10 >= eoVar.Ha.size()) {
                return;
            }
            eoVar.cb((TLRPC.BotInlineResult) eoVar.Ha.get(i10), z10, i11, 0L);
        }
    }
}
