package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class nh extends eq0 {
    public final /* synthetic */ wm a;

    public nh(wm wmVar) {
        this.a = wmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0076 A[LOOP:0: B:10:0x002a->B:17:0x0076, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b A[SYNTHETIC] */
    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final mq0 E(org.telegram.messenger.zi ziVar, TLRPC.FileLocation fileLocation, int i3, boolean z10, boolean z11) {
        fj fjVar;
        ImageReceiver imageReceiver;
        if (i3 >= 0) {
            wm wmVar = this.a;
            if (i3 < wmVar.cb.size() && (fjVar = wmVar.X1) != null && fjVar.getListView() != null) {
                int childCount = wmVar.X1.getListView().getChildCount();
                Object obj = wmVar.cb.get(i3);
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = wmVar.X1.getListView().getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.h2) {
                        org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) childAt;
                        if (h2Var.getResult() == obj) {
                            imageReceiver = h2Var.getPhotoImage();
                            if (imageReceiver == null) {
                                int[] iArr = new int[2];
                                childAt.getLocationInWindow(iArr);
                                mq0 mq0Var = new mq0();
                                mq0Var.b = iArr[0];
                                mq0Var.c = iArr[1];
                                mq0Var.d = wmVar.X1.getListView();
                                mq0Var.a = imageReceiver;
                                mq0Var.e = imageReceiver.p();
                                mq0Var.h = imageReceiver.E();
                                return mq0Var;
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

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void o(int i3, org.telegram.messenger.b20 b20Var, boolean z10, int i10, int i11, boolean z11) {
        if (i3 >= 0) {
            wm wmVar = this.a;
            if (i3 >= wmVar.cb.size()) {
                return;
            }
            wmVar.Db((TLRPC.BotInlineResult) wmVar.cb.get(i3), z10, i10, 0L);
        }
    }
}
