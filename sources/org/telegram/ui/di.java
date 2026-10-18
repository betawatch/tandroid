package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class di extends bu0 {
    public final /* synthetic */ sn a;

    public di(sn snVar) {
        this.a = snVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0076 A[LOOP:0: B:10:0x002a->B:17:0x0076, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b A[SYNTHETIC] */
    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        zj zjVar;
        ImageReceiver imageReceiver;
        if (i10 >= 0) {
            sn snVar = this.a;
            if (i10 < snVar.Ia.size() && (zjVar = snVar.I1) != null && zjVar.getListView() != null) {
                int childCount = snVar.I1.getListView().getChildCount();
                Object obj = snVar.Ia.get(i10);
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = snVar.I1.getListView().getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.f2) {
                        org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) childAt;
                        if (f2Var.getResult() == obj) {
                            imageReceiver = f2Var.getPhotoImage();
                            if (imageReceiver == null) {
                                int[] iArr = new int[2];
                                childAt.getLocationInWindow(iArr);
                                lu0 lu0Var = new lu0();
                                lu0Var.b = iArr[0];
                                lu0Var.c = iArr[1];
                                lu0Var.d = snVar.I1.getListView();
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

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            sn snVar = this.a;
            if (i10 >= snVar.Ia.size()) {
                return;
            }
            snVar.gb((TLRPC.BotInlineResult) snVar.Ia.get(i10), z10, i11, 0L);
        }
    }
}
