package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class bm extends su0 {
    public final /* synthetic */ co a;

    public bm(co coVar) {
        this.a = coVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0076 A[LOOP:0: B:10:0x002a->B:17:0x0076, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b A[SYNTHETIC] */
    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final cv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        fk fkVar;
        ImageReceiver imageReceiver;
        if (i10 >= 0) {
            co coVar = this.a;
            if (i10 < coVar.Ha.size() && (fkVar = coVar.I1) != null && fkVar.getListView() != null) {
                int childCount = coVar.I1.getListView().getChildCount();
                Object obj = coVar.Ha.get(i10);
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = coVar.I1.getListView().getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.e2) {
                        org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) childAt;
                        if (e2Var.getResult() == obj) {
                            imageReceiver = e2Var.getPhotoImage();
                            if (imageReceiver == null) {
                                int[] iArr = new int[2];
                                childAt.getLocationInWindow(iArr);
                                cv0 cv0Var = new cv0();
                                cv0Var.b = iArr[0];
                                cv0Var.c = iArr[1];
                                cv0Var.d = coVar.I1.getListView();
                                cv0Var.a = imageReceiver;
                                cv0Var.e = imageReceiver.getBitmapSafe();
                                cv0Var.h = imageReceiver.getRoundRadius(true);
                                return cv0Var;
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

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            co coVar = this.a;
            if (i10 >= coVar.Ha.size()) {
                return;
            }
            coVar.cb((TLRPC.BotInlineResult) coVar.Ha.get(i10), z10, i11, 0L);
        }
    }
}
