package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class nm extends pt0 {
    public final ArrayList a;
    public final int[] b = new int[2];
    public final /* synthetic */ tn c;

    public nm(tn tnVar, ArrayList arrayList) {
        this.c = tnVar;
        this.a = arrayList;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final zt0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject2;
        RichMessageLayout richMessageLayout;
        tn tnVar = this.c;
        if (tnVar.t0 != null && i10 >= 0) {
            ArrayList arrayList = this.a;
            if (i10 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
                int childCount = tnVar.t0.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = tnVar.t0.getChildAt(i11);
                    boolean z12 = childAt instanceof org.telegram.ui.Cells.s1;
                    int[] iArr = this.b;
                    if (!z12 || (messageObject2 = (s1Var = (org.telegram.ui.Cells.s1) childAt).getMessageObject()) == null || (richMessageLayout = messageObject2.richLayout) == null) {
                        imageReceiver = null;
                    } else {
                        int[] iArr2 = new int[2];
                        imageReceiver = richMessageLayout.findMediaImageReceiver(pageBlock, iArr2);
                        if (imageReceiver != null) {
                            childAt.getLocationInWindow(iArr);
                            iArr[0] = s1Var.getTextX() + iArr2[0] + iArr[0];
                            iArr[1] = s1Var.getTextY() + iArr2[1] + iArr[1];
                        }
                    }
                    if (imageReceiver != null) {
                        zt0 zt0Var = new zt0();
                        zt0Var.b = iArr[0];
                        zt0Var.c = iArr[1];
                        zt0Var.d = tnVar.t0;
                        zt0Var.a = imageReceiver;
                        zt0Var.e = imageReceiver.getBitmapSafe();
                        zt0Var.h = imageReceiver.getRoundRadius(true);
                        zt0Var.j = (int) ((tnVar.o9 - tnVar.q9) - AndroidUtilities.dp(4.0f));
                        zt0Var.i = (int) (tnVar.W8(org.telegram.ui.Components.i21.c) + tnVar.v.c() + AndroidUtilities.dp(9.0f) + tnVar.wa + tnVar.oc);
                        return zt0Var;
                    }
                }
            }
        }
        return null;
    }
}
