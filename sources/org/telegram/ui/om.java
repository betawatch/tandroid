package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class om extends bu0 {
    public final ArrayList a;
    public final int[] b = new int[2];
    public final /* synthetic */ sn c;

    public om(sn snVar, ArrayList arrayList) {
        this.c = snVar;
        this.a = arrayList;
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject2;
        RichMessageLayout richMessageLayout;
        sn snVar = this.c;
        if (snVar.x0 != null && i10 >= 0) {
            ArrayList arrayList = this.a;
            if (i10 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
                int childCount = snVar.x0.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = snVar.x0.getChildAt(i11);
                    boolean z12 = childAt instanceof org.telegram.ui.Cells.u1;
                    int[] iArr = this.b;
                    if (!z12 || (messageObject2 = (u1Var = (org.telegram.ui.Cells.u1) childAt).getMessageObject()) == null || (richMessageLayout = messageObject2.richLayout) == null) {
                        imageReceiver = null;
                    } else {
                        int[] iArr2 = new int[2];
                        imageReceiver = richMessageLayout.findMediaImageReceiver(pageBlock, iArr2);
                        if (imageReceiver != null) {
                            childAt.getLocationInWindow(iArr);
                            iArr[0] = u1Var.getTextX() + iArr2[0] + iArr[0];
                            iArr[1] = u1Var.getTextY() + iArr2[1] + iArr[1];
                        }
                    }
                    if (imageReceiver != null) {
                        lu0 lu0Var = new lu0();
                        lu0Var.b = iArr[0];
                        lu0Var.c = iArr[1];
                        lu0Var.d = snVar.x0;
                        lu0Var.a = imageReceiver;
                        lu0Var.e = imageReceiver.getBitmapSafe();
                        lu0Var.h = imageReceiver.getRoundRadius(true);
                        lu0Var.j = (int) ((snVar.s9 - snVar.u9) - AndroidUtilities.dp(4.0f));
                        lu0Var.i = (int) (snVar.b9(org.telegram.ui.Components.l31.c) + snVar.v.d() + AndroidUtilities.dp(9.0f) + snVar.Ba + snVar.sc);
                        return lu0Var;
                    }
                }
            }
        }
        return null;
    }
}
