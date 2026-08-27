package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class mm extends st0 {
    public final ArrayList a;
    public final int[] b = new int[2];
    public final /* synthetic */ rn c;

    public mm(rn rnVar, ArrayList arrayList) {
        this.c = rnVar;
        this.a = arrayList;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final cu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject2;
        RichMessageLayout richMessageLayout;
        rn rnVar = this.c;
        if (rnVar.t0 != null && i10 >= 0) {
            ArrayList arrayList = this.a;
            if (i10 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
                int childCount = rnVar.t0.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = rnVar.t0.getChildAt(i11);
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
                        cu0 cu0Var = new cu0();
                        cu0Var.b = iArr[0];
                        cu0Var.c = iArr[1];
                        cu0Var.d = rnVar.t0;
                        cu0Var.a = imageReceiver;
                        cu0Var.e = imageReceiver.getBitmapSafe();
                        cu0Var.h = imageReceiver.getRoundRadius(true);
                        cu0Var.j = (int) ((rnVar.o9 - rnVar.q9) - AndroidUtilities.dp(4.0f));
                        cu0Var.i = (int) (rnVar.W8(org.telegram.ui.Components.z11.c) + rnVar.v.c() + AndroidUtilities.dp(9.0f) + rnVar.wa + rnVar.oc);
                        return cu0Var;
                    }
                }
            }
        }
        return null;
    }
}
