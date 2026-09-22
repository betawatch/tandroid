package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class bm extends tu0 {
    public final /* synthetic */ bo a;

    public bm(bo boVar) {
        this.a = boVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0076 A[LOOP:0: B:10:0x002a->B:17:0x0076, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b A[SYNTHETIC] */
    @Override // org.telegram.ui.tu0, org.telegram.ui.bv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        fk fkVar;
        ImageReceiver imageReceiver;
        if (i10 >= 0) {
            bo boVar = this.a;
            if (i10 < boVar.Ha.size() && (fkVar = boVar.I1) != null && fkVar.getListView() != null) {
                int childCount = boVar.I1.getListView().getChildCount();
                Object obj = boVar.Ha.get(i10);
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = boVar.I1.getListView().getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.e2) {
                        org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) childAt;
                        if (e2Var.getResult() == obj) {
                            imageReceiver = e2Var.getPhotoImage();
                            if (imageReceiver == null) {
                                int[] iArr = new int[2];
                                childAt.getLocationInWindow(iArr);
                                dv0 dv0Var = new dv0();
                                dv0Var.b = iArr[0];
                                dv0Var.c = iArr[1];
                                dv0Var.d = boVar.I1.getListView();
                                dv0Var.a = imageReceiver;
                                dv0Var.e = imageReceiver.getBitmapSafe();
                                dv0Var.h = imageReceiver.getRoundRadius(true);
                                return dv0Var;
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

    @Override // org.telegram.ui.tu0, org.telegram.ui.bv0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            bo boVar = this.a;
            if (i10 >= boVar.Ha.size()) {
                return;
            }
            boVar.cb((TLRPC.BotInlineResult) boVar.Ha.get(i10), z10, i11, 0L);
        }
    }
}
