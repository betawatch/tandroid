package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class bi extends zt0 {
    public final /* synthetic */ qn a;

    public bi(qn qnVar) {
        this.a = qnVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0076 A[LOOP:0: B:10:0x002a->B:17:0x0076, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b A[SYNTHETIC] */
    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        xj xjVar;
        ImageReceiver imageReceiver;
        if (i10 >= 0) {
            qn qnVar = this.a;
            if (i10 < qnVar.Ia.size() && (xjVar = qnVar.I1) != null && xjVar.getListView() != null) {
                int childCount = qnVar.I1.getListView().getChildCount();
                Object obj = qnVar.Ia.get(i10);
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = qnVar.I1.getListView().getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.f2) {
                        org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) childAt;
                        if (f2Var.getResult() == obj) {
                            imageReceiver = f2Var.getPhotoImage();
                            if (imageReceiver == null) {
                                int[] iArr = new int[2];
                                childAt.getLocationInWindow(iArr);
                                ju0 ju0Var = new ju0();
                                ju0Var.b = iArr[0];
                                ju0Var.c = iArr[1];
                                ju0Var.d = qnVar.I1.getListView();
                                ju0Var.a = imageReceiver;
                                ju0Var.e = imageReceiver.getBitmapSafe();
                                ju0Var.h = imageReceiver.getRoundRadius(true);
                                return ju0Var;
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

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            qn qnVar = this.a;
            if (i10 >= qnVar.Ia.size()) {
                return;
            }
            qnVar.gb((TLRPC.BotInlineResult) qnVar.Ia.get(i10), z10, i11, 0L);
        }
    }
}
