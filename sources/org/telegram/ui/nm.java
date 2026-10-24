package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class nm extends cu0 {
    public final ArrayList a;
    public final int[] b = new int[2];
    public final /* synthetic */ sn c;

    public nm(sn snVar, ArrayList arrayList) {
        this.c = snVar;
        this.a = arrayList;
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final mu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.t1 t1Var;
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
                        mu0 mu0Var = new mu0();
                        mu0Var.b = iArr[0];
                        mu0Var.c = iArr[1];
                        mu0Var.d = snVar.x0;
                        mu0Var.a = imageReceiver;
                        mu0Var.e = imageReceiver.getBitmapSafe();
                        mu0Var.h = imageReceiver.getRoundRadius(true);
                        mu0Var.j = (int) ((snVar.E9 - snVar.G9) - AndroidUtilities.dp(4.0f));
                        mu0Var.i = (int) (snVar.b9(org.telegram.ui.Components.s31.c) + snVar.v.d() + AndroidUtilities.dp(9.0f) + snVar.Na + snVar.Gc);
                        return mu0Var;
                    }
                }
            }
        }
        return null;
    }
}
