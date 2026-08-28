package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class lm extends rt0 {
    public final ArrayList a;
    public final int[] b = new int[2];
    public final /* synthetic */ qn c;

    public lm(qn qnVar, ArrayList arrayList) {
        this.c = qnVar;
        this.a = arrayList;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final bu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i9, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject2;
        RichMessageLayout richMessageLayout;
        qn qnVar = this.c;
        if (qnVar.t0 != null && i9 >= 0) {
            ArrayList arrayList = this.a;
            if (i9 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i9);
                int childCount = qnVar.t0.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = qnVar.t0.getChildAt(i10);
                    boolean z12 = childAt instanceof org.telegram.ui.Cells.t1;
                    int[] iArr = this.b;
                    if (!z12 || (messageObject2 = (t1Var = (org.telegram.ui.Cells.t1) childAt).getMessageObject()) == null || (richMessageLayout = messageObject2.richLayout) == null) {
                        imageReceiver = null;
                    } else {
                        int[] iArr2 = new int[2];
                        imageReceiver = richMessageLayout.findMediaImageReceiver(pageBlock, iArr2);
                        if (imageReceiver != null) {
                            childAt.getLocationInWindow(iArr);
                            iArr[0] = t1Var.getTextX() + iArr2[0] + iArr[0];
                            iArr[1] = t1Var.getTextY() + iArr2[1] + iArr[1];
                        }
                    }
                    if (imageReceiver != null) {
                        bu0 bu0Var = new bu0();
                        bu0Var.b = iArr[0];
                        bu0Var.c = iArr[1];
                        bu0Var.d = qnVar.t0;
                        bu0Var.a = imageReceiver;
                        bu0Var.e = imageReceiver.getBitmapSafe();
                        bu0Var.h = imageReceiver.getRoundRadius(true);
                        bu0Var.j = (int) ((qnVar.o9 - qnVar.q9) - AndroidUtilities.dp(4.0f));
                        bu0Var.i = (int) (qnVar.W8(org.telegram.ui.Components.w11.c) + qnVar.v.c() + AndroidUtilities.dp(9.0f) + qnVar.wa + qnVar.oc);
                        return bu0Var;
                    }
                }
            }
        }
        return null;
    }
}
